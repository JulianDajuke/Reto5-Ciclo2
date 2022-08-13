package Vista;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import Controlador.DriverApp;

public class Ventana extends JFrame implements Interface {

    private JPanel panel;
    private JTextArea cuadroinforme;
    public static JButton bt1;
    public static JButton bt2;
    public static JButton bt3;
    
    public Ventana(){

        setTitle("Informes de Proyectos de Construccion");
        this.setSize(600, 800);
        
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color (60,60,60));

        cuadroinforme = new JTextArea();
        cuadroinforme.setEditable(false);

        JScrollPane scrollBar = new JScrollPane(cuadroinforme,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollBar.setBounds(10, 120, 560, 630);
        panel.add(scrollBar);

        JLabel titulo = new JLabel("Reportes");

        titulo.setBounds(250,0,100,35);
        titulo.setForeground(Color.white);
        titulo.setFont(new Font("Times New Roman",Font.PLAIN,22));

        JLabel subt = new JLabel("Para ver los informes cliquee el boton correspondiente");
        subt.setBounds(140,30,700,30);
        subt.setForeground(Color.white);
        subt.setFont(new Font("Times New Roman",Font.PLAIN,15));

        panel.add(titulo);
        panel.add(subt);
        this.add(panel);

        bt1 = new JButton("Primer Informe");
        bt1.setBounds(20,70,140,40);
        bt1.setBackground(new Color(174,248,176));
        bt2 = new JButton("Segundo Informe");
        bt2.setBounds(215,70,140,40);
        bt2.setBackground(new Color(174,248,176));
        bt3 = new JButton("Tercer Informe");
        bt3.setBounds(410,70,140,40);
        bt3.setBackground(new Color(174,248,176));

        panel.add(bt1);
        panel.add(bt2);
        panel.add(bt3);

        setResizable(false);
    }
    @Override
    public void setInforme1(String resultado) {
        // TODO Auto-generated method stub
        cuadroinforme.setText(resultado);
    }
    @Override
    public void setInforme2(String resultado) {
        // TODO Auto-generated method stub
        cuadroinforme.setText(resultado);
    }
    @Override
    public void setInforme3(String resultado) {
        // TODO Auto-generated method stub

        cuadroinforme.setText(resultado); 
    }
    @Override
    public void iniciar(DriverApp controller) {
        // TODO Auto-generated method stub

        bt1.addActionListener(controller);
        bt2.addActionListener(controller);
        bt3.addActionListener(controller);

        setVisible(true);     
    }
    @Override
    public void mostrarExcepcion(Exception ex) {
        // TODO Auto-generated method stub  
    }
}
