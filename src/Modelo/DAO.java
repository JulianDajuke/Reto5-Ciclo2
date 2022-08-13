package Modelo;
import java.sql.*;
import Utilidades.Utilities;

public class DAO {

    public static ResultSet searchDataLider(){

        ResultSet rset=null;
    
        try {
            var link = Utilities.getConnection();
            Statement state=null;
            String csql = "SELECT ID_Lider , Nombre , Primer_Apellido, Ciudad_Residencia  FROM Lider ORDER BY Ciudad_Residencia"; 
            state =  link.createStatement();
            rset = state.executeQuery(csql);         
        } 
        catch (Exception e) {
            //TODO: handle exception
        }   
        return rset;   
    }

    public static ResultSet searchDataProyectosCC(){

        ResultSet rset=null;
        try {
            var link = Utilities.getConnection();
            Statement state=null;
            String csql = "SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad  From Proyecto p WHERE Clasificacion = 'Casa Campestre' AND Ciudad IN ('Santa Marta', 'Cartagena')"; 
            state =  link.createStatement();
            rset = state.executeQuery(csql);  
        } 
        catch (Exception e) {
            //TODO: handle exception
        }   
        return rset;
    }

    public static ResultSet searchDatosCompras(){

        ResultSet rset=null;
        try {
            var link = Utilities.getConnection();
            Statement state=null;
            String csql = "SELECT ID_Compra, Constructora, Banco_Vinculado  FROM Proyecto JOIN Compra USING(ID_Proyecto) WHERE Proveedor = 'Homecenter' AND Ciudad = 'Salento'"; 
            state =  link.createStatement();
            rset = state.executeQuery(csql);   
        } 
        catch (Exception e) {
            //TODO: handle exception
        }   
        return rset;
    }
}