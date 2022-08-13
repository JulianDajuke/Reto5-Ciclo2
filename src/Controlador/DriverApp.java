package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.VO;
import Vista.Interface;
import Vista.Ventana;

public class DriverApp implements ActionListener {

    private final Interface view;
    private final VO model;

    public DriverApp(Interface view, VO model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==Ventana.bt1){
            try { 
                model.datosLideres();
                view.setInforme1((model.getResult().toString()));   
            } 
            catch (Exception ex) {
                //TODO: handle exception
            }
        // TODO Auto-generated method stub
        }

        if (e.getSource()==Ventana.bt2){
            try { 
                model.datosProyectosCC();
                view.setInforme2((model.getResult().toString()));
            } 
            catch (Exception ex) {
             //TODO: handle exception
            }
            // TODO Auto-generated method stub
        }

        if (e.getSource()==Ventana.bt3){
            try {
                model.datosCompras();
                view.setInforme3((model.getResult().toString()));
            } 
            catch (Exception ex) {
            //TODO: handle exception
            }
            // TODO Auto-generated method stub
        }
    }  
    public void Iniciar() {
        view.iniciar(this);
    }
}
