package Vista;
import Controlador.DriverApp;

public interface Interface {

    public void setInforme1(String resultado);
    public void setInforme2(String resultado);
    public void setInforme3(String resultado);
    public void iniciar(DriverApp controller);
    public void mostrarExcepcion(Exception ex); 
}
