package conexion.bd;

public class ManipulandoDatos {
	ConexionBD conexion = new ConexionBD();
	String consulta =null;
	String nombreTabla= "persona";
	public String insertarBD(int id, String nombre, String telefono) {
             consulta = "INSERT INTO " + nombreTabla
                    + "(id_persona, nombre, tel) "
                    + "VALUES ("
                    +  id +","
                    + "\'" +nombre + "\', "
                    + "\'" + telefono + "\' "
                    + ");";
            return consulta;				
      
    }
    
    public String actualizarBD(int id,String nombre, String telefono) {
            consulta = "UPDATE " + nombreTabla + " SET "
                    + "nombre = \'" + nombre + "\', "
                    + "tel = \'" + telefono + "\' "
                    + "WHERE id_persona = " + id + ";";
            return consulta;
            
    }
    
    
    public String obtenerRegistros() {
        
            consulta = "SELECT * FROM " + nombreTabla + ";";
            return consulta;
    }
    
    public String borrarRegistro(int id) {  
            consulta = "DELETE FROM " + nombreTabla + " WHERE id_persona = " + id + ";";
            return consulta;
    }
    
       /* public ResultSet obtenerRegistroID(int id) {
       
            consulta = "SELECT * FROM " + nombreTabla +  " WHERE ID = " + id +";";
            return consulta;
        
        }*/
    

}
