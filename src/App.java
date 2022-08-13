import Vista.Interface;
import Vista.Ventana;
import Modelo.VO;
import Controlador.DriverApp;
public class App {
    public static void main(String[] args) throws Exception {
        
        Interface view = new Ventana();

        var model = new VO();
        var controller = new DriverApp(view, model);

        controller.Iniciar();
    }
}
