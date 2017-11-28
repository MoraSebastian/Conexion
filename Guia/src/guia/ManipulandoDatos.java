package guia;

import java.sql.ResultSet;

public class ManipulandoDatos {
	ConexionBD conexion = new ConexionBD();
	String consulta =null;
	String nombreTabla= "persona";
	public String insertarBD(GuiaModelo guia) {
             consulta = "INSERT INTO " + nombreTabla
                    + "(id,id_cliente,id_empleado, id_estadoDelicado,id_aseguradora, id_embalaje, id_ordenServicio) "
                    + "VALUES ("
                    +  guia.getId() +","
                    +  guia.getId_cliente() +","
                    +  guia.getId_empleado() +","
                    +  guia.getId_estadoDelicado() +"," 
                    +  guia.getId_aseguradora() +"," 
                    +  guia.getId_embalaje() +","
                    +  guia.getId_ordenServicio() +","
                    +  guia.getId()
                    + ");";
            return consulta;				
      
    }
    
    public String actualizarBD(GuiaModelo guia) {
            consulta = "UPDATE " + nombreTabla + " SET "
                    + "id_cliente = \'" + guia.getId_cliente() + ","
                    + "id_empleado = \'" + guia.getId_empleado() + ","
                    + "id_estadoDelicado = \'" + guia.getId_estadoDelicado() + ","
                    + "id_aseguradora = \'" + guia.getId_aseguradora() + ","
                    + "id_embalaje = \'" + guia.getId_embalaje() + ","
                    + "id_ordenServicio = \'" + guia.getId_ordenServicio() + ","
                    + "WHERE id= " + guia.getId() + ";";
            return consulta;
            
    }   
    public String obtenerRegistros() {
        
            consulta = "SELECT * FROM " + nombreTabla + ";";
            return consulta;
    }
    public String borrarRegistro(int id) {  
            consulta = "DELETE FROM " + nombreTabla + " WHERE id = " + id + ";";
            return consulta;
    }
     public String obtenerIds() { 
            consulta = "SELECT id_persona FROM " + nombreTabla + ";";
            return consulta;
    }
    public String obtenerRegistroID(int id) {
       
            consulta = "SELECT * FROM " + nombreTabla +  " WHERE id= " + id +";";
            return consulta;
        
      }
    

}
