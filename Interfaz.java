import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.nio.charset.StandardCharsets;
import java.io.*;
import java.util.regex.Matcher;

public class Interfaz extends JFrame {
    private static JButton boton = new JButton ("Aceptar");
    private static JLabel directionsLabel = new JLabel("Ingrese su DNI");
    private static JLabel outputLabel = new JLabel();
    private static JLabel outputLabel2 = new JLabel();

    private static JTextField text = new JTextField(25);
    private static JButton boton2 = new JButton ("Aceptar");
    private static JButton boton3 = new JButton ("Aceptar");
    private static JButton boton4 = new JButton ("Aceptar");
    private static JButton boton5 = new JButton ("Aceptar");
    private static JButton boton6 = new JButton ("Aceptar");


    public static void main(String[] args) throws Exception {
        Interfaz voto = new Interfaz ();
        voto.setSize(600,600);
        voto.setVisible(true);
        voto.setTitle("PASO");

        //voto.setLayout(new FlowLayout());
        voto.setLayout(new GridLayout(2,2)); // filas, columnas
        voto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        voto.getContentPane().add(outputLabel);
        voto.getContentPane().add(directionsLabel);
        voto.getContentPane().add(outputLabel2);

       


        //voto.getContentPane().add(new JLabel());

        voto.getContentPane().add(text);
        voto.getContentPane().add(boton);
       
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
            Boolean pepe = true;
        }else{
            String outputMessage = "DNI incorrecto";
            outputLabel.setText(outputMessage);

        }
        

    }
    
    public static void obtenerElectores() throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("C:\\votos.txt",StandardCharsets.UTF_8));
                // MesaElectoral prueba1 = new MesaElectoral();
                Elector elector1 = new Elector();
                List<Elector> listaElector = new ArrayList<>();
                

                File archivo = null;
                FileReader fr = null;

             
               try {
                    archivo = new File ("C:\\votos.txt");
                    
                    String regex = "Nombre:(\\w*\\s?\\w*?).*Apellido:(\\w*).*Domicilio:(.*).*DNI:(\\d*).*cimiento:(\\d*/\\d*/\\d*).*Votacion:(.*)";
                     
                    Pattern pattern = Pattern.compile(regex);
                    String linea;
                    int con=0;
                    while((linea=br.readLine())!=null){
                        Matcher matcher = pattern.matcher(linea);
                        if(matcher.matches()){
                            System.out.println("NOMBRES :" + matcher.group(1));
                            elector1.setNombre(matcher.group(1));
                            System.out.println("APELLIDOS :" + matcher.group(2));
                            elector1.setApellido(matcher.group(2));
                            System.out.println("DOMICICLIO:" + matcher.group(3));
                            elector1.setDomicilio(new Domicilio(matcher.group(3), null, null, null));
                            System.out.println("DNI:" + matcher.group(4));
                            elector1.setDni(Integer.parseInt(matcher.group(4)));
                            System.out.println("FECHA NACIMIENTO:" + matcher.group(5));
                            elector1.setFecNac(matcher.group(5));
                            System.out.println("Lugar de Votacion:" + matcher.group(6));
                            elector1.setLugVotacion(matcher.group(6));
                        }
                        // creo que en vez de hacer elector1.setnombre es hacer nombre=matcher.group1 y cuando termina el if(matcher) guardar array.nombre(i)=nombre
                            listaElector.add(elector1);
                    }

                    for (int index = 0; index < listaElector.size(); index++) {
                        System.out.println("");
                        System.out.println(listaElector.get(index));
                        
                    }       
                } catch (Exception e) {
                    e.printStackTrace();
                }finally{
                    // En el finally cerramos el fichero, para asegurarnos
                    // que se cierra tanto si todo va bien como si salta 
                    // una excepcion.
                    try{                    
                        if( null != fr ){   
                            fr.close();     
                        }                  
                    }catch (Exception e2){ 
                        e2.printStackTrace();
                    }
                }
        
    }
    
}
