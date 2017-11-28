package guia;

/**
 *
 * @author AcmeVision
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.sql.*;


public class ConexionBD {

    Connection conexion = null;
    String password = "postgresql";
    String login = "postgres";
    String bd = "PalomaMensajera";
    boolean estado = false;
    int puerto = 5432;
    int cantidadDatos =0;

    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }
     public String getBd() {
        return bd;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public void conectar() {
        try {
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:" + puerto 
                    + "/" + bd, login, password);
            estado=true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "");
            estado=false;
        }

    }
    public void ingresar (String script){
    	PreparedStatement p =null;
    	conectar();
    	try {
			p=conexion.prepareStatement(script);
			p.executeUpdate();
			JOptionPane.showMessageDialog(null, "Proceso Exitoso");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,e);
		}
    }
    public void consultar(JTable tabla, String Script){
        Statement codigo = null;
        ResultSet resultados = null;
        try{
            DefaultTableModel t = new DefaultTableModel();
            tabla.setModel(t);
            conectar();
            //Creea estado para traer datos
            codigo = conexion.createStatement();
            //Accede a los datos
            resultados = codigo.executeQuery(Script);
            //Guarda el modelo de la tabla que se tiene en la base de datos
            ResultSetMetaData datos = resultados.getMetaData();
            
            //Cuenta las columnas 
            int columnas = datos.getColumnCount();
            //crea columnas
            for (int i = 1; i<= columnas;i++){
                t.addColumn(datos.getColumnLabel(i));
            }
            
            //-Agrega datos
            while(resultados.next()){
                Object[] lecturaDatos = new Object[columnas];
                for(int i = 0 ; i< columnas;i++){
                    lecturaDatos[i]= resultados.getObject(i+1);
                }
                t.addRow(lecturaDatos);
                cantidadDatos++;
            }
            codigo.close();
            resultados.close();
            conexion.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        
    }
    
    public void Modificar(String Script){
        //Sirve para pasar comandos en SQL
        PreparedStatement p = null;
        try{
            p = conexion.prepareStatement(Script);
            p.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registro realizado con exito."); 
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex); 
        }
    }
     public void ConsultarLista(JComboBox lista,String nombreTabla){
        Statement codigo = null;
        ResultSet resultados = null;
        try{
            DefaultComboBoxModel t = new DefaultComboBoxModel();
            lista.setModel(t);
            conectar();
            //Creea estado para traer datos
            codigo = conexion.createStatement();
            //Accede a los datos
            resultados = codigo.executeQuery("SELECT * FROM " + nombreTabla + ";");
            //Guarda el modelo de la lista que se tiene en la base de datos
            ResultSetMetaData datos = resultados.getMetaData();
            t.addElement(" ");
            while(resultados.next()){         
               t.addElement(resultados.getObject("id"));
            }
            codigo.close();
            resultados.close();
            conexion.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        
    }
     
     public GuiaModelo ConsultarCampo(String script,GuiaModelo guia){
        Statement codigo = null;
        ResultSet resultados = null;
        try{
            //Creea estado para traer datos
            codigo = conexion.createStatement();
            //Accede a los datos
            resultados = codigo.executeQuery(script);
            //Guarda el modelo de la lista que se tiene en la base de datos
            ResultSetMetaData datos = resultados.getMetaData();
            
            while(resultados.next()){    
               guia.setId((int) resultados.getObject("id"));
               guia.setId_aseguradora((int) resultados.getObject("id_aseguradora"));
               guia.setId_cliente((int) resultados.getObject("id_cliente"));
               guia.setId_empleado((int) resultados.getObject("id_empleado"));
               guia.setId_ordenServicio((int) resultados.getObject("id_ordenServicio"));
               guia.setId_embalaje((int) resultados.getObject("id_embalaje"));
               guia.setId_estadoDelicado((int) resultados.getObject("id_estadoDelicado"));
            }
            codigo.close();
            resultados.close();
            conexion.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        return guia;
    }
}


