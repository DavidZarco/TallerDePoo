import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Interfaz extends JFrame {
    private static JLabel directionsLabel = new JLabel("Ingrese su DNI");
    private static JLabel outputLabel = new JLabel();
    private static JTextField text = new JTextField(25);
    private static JButton boton = new JButton ("Aceptar");
    public static void main(String[] args) throws Exception {
        Interfaz voto = new Interfaz ();
        voto.setSize(500,500);
        voto.setVisible(true);
        voto.setTitle("PASO");

        voto.setLayout(new FlowLayout());
        voto.getContentPane().add(directionsLabel);
        voto.getContentPane().add(text);
        voto.getContentPane().add(boton);
        voto.getContentPane().add(outputLabel);
        // añadimos una accion
        boton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                buttonClick(e);
            }
        }); 

    


        //add Swing Object Here
        voto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }//fin del main
    public static void buttonClick(ActionEvent e){
        //que pasa cuando clikeas
        //JOptionPane.showMessageDialog(null, "Funciona ","Hola!" ,JOptionPane.INFORMATION_MESSAGE );

        String suDNI = text.getText();
        if(suDNI.length()<=9){
            String outputMessage = "DNI correcto"+suDNI;
            outputLabel.setText(outputMessage);

        }else{
            String outputMessage = "DNI incorrecto";
            outputLabel.setText(outputMessage);

        }


    }
    
}
