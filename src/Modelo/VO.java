package Modelo;
import java.sql.*;

public class VO {

    private String result ;
    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }

    private String lineaseparador(Character caracter, Integer veces) {
        String separador = "";
        for (int i = 0; i < veces; i++) {
            separador += caracter;
        }
        return separador;
        }

    public String datosLideres() {
        result = "" ;
        try {
            ResultSet rs = DAO.searchDataLider();
            result += "\n" + lineaseparador('*', 35) + " INFORME DATOS DE LIDERES " + lineaseparador('*', 35 ) + "\n" + "\n";
            result += String.format("%10s %22s %35s %35s", "ID_LIDER", "NOMBRE", "PRIMER_APELLIDO","CIUDAD_RESIDENCIA") + "\n";
            result += lineaseparador('~', 75) + "\n";

            while(rs.next()){
                Integer idLider= rs.getInt("ID_LIDER");
                String lider= rs.getString("NOMBRE");
                String apellido = rs.getString("PRIMER_APELLIDO");
                String ciudad = rs.getString("CIUDAD_RESIDENCIA");
                result += String.format(String.format("%10s %32s %42s %50s", idLider, lider, apellido,ciudad)) + "\n";
            }
        } 
        catch (Exception e) {
            //TODO: handle exception
        }
        return result; 
    }

    public String datosProyectosCC() {
        result = "" ;
        try {
            ResultSet rs = DAO.searchDataProyectosCC();
            result += "\n" + lineaseparador('*', 4) + " PROYECTOS DE CASA CAMPESTRE EN SANTA MARTA, CARTAGENA Y BARRANQUILLA" + lineaseparador('*', 4 ) + "\n" + "\n";
            result += String.format("%10s %25s %27s %22s", "ID_PROYECTO", "CONSTRUCTORA", "NUMERO_HABITACIONES","CIUDAD") + "\n";
            result += lineaseparador('~', 75) + "\n";

            while(rs.next()){
                Integer idproy= rs.getInt("ID_PROYECTO");
                String constructora= rs.getString("CONSTRUCTORA");
                Integer habitaciones = rs.getInt("NUMERO_HABITACIONES");
                String ciudad = rs.getString("CIUDAD");
                result += String.format(String.format("%15s %40s %35s %48s", idproy, constructora, habitaciones, ciudad)) + "\n"; 
            }
        } 
        catch (Exception e) {
            //TODO: handle exception
        }
        return result;
    }

    public String datosCompras() {
        result = "" ;
        try {
            ResultSet rs = DAO.searchDatosCompras();
            result += "\n" + lineaseparador('*', 23) + " LISTADO COMPRAS A HOMECENTER PARA SALENTO " + lineaseparador('*', 23 ) + "\n" + "\n";
            result += String.format("%15s %45s %45s ", "ID_COMPRA", "CONSTRUCTORA", "BANCO_VINCULADO") + "\n";
            result += lineaseparador('~', 75) + "\n";

            while(rs.next()){
                Integer idcom= rs.getInt("ID_COMPRA");
                String constructora= rs.getString("CONSTRUCTORA");
                String banco = rs.getString("BANCO_VINCULADO");
                result += String.format(String.format("%15s %60s %60s", idcom, constructora, banco)) + "\n";   
            }
        } 
        catch (Exception e) {
            //TODO: handle exception
        }
        return result; 
    }
}
