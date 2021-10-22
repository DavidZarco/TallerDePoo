import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mainn {

    public static void main(String[] args) throws Exception {
                File archivo = null;
                FileReader fr = null;
                BufferedReader br = null ;
                // var prueba1 = new MesaElectoral();
                String per = "Samara";
                String nombrevotante = "Nombre:.*";
                // prueba1.verificarDni("C:\\votos.txt");
               try {
                    archivo = new File ("C:\\votos.txt");
                    
                    fr = new FileReader (archivo);
                    br = new BufferedReader(fr);
                    String regex = nombrevotante;
                
                     
                    Pattern pattern = Pattern.compile(regex);
                    String linea;
                    int con=0; 
                    while((linea=br.readLine())!=null){
                        System.out.println(linea);
                        Matcher matcher = pattern.matcher(linea);
                        if(matcher.matches()){
                            System.out.println("EXITOOOOO");
                             con ++;
                             System.out.println(con);
                          System.out.println("Grupo PUERTO1 :      " + matcher.group(1));
                          System.out.println("Grupo PUERTO1 :      " + matcher.group(1));
                           System.out.println("Grupo PUERTO2 :      " + matcher.group(2));
                           System.out.println("Grupo PUERTO3 :      " + matcher.group(3));
                           //System.out.println("Grupo PUERTO4 :      " + matcher.group(4));
                        //   System.out.println("Grupo PUERTO5 :      " + matcher.group(5));
                        //   System.out.println("Grupo PUERTO6 :      " + matcher.group(6));
                        //   System.out.println("Grupo PUERTO7 :      " + matcher.group(7));
                        //   System.out.println("Grupo PUERTO8 :      " + matcher.group(8));
                        //   System.out.println("Grupo PUERTO9 :      " + matcher.group(9));
                          //System.out.println("Grupo PUERTO10 :      " + matcher.group(10));
                          //System.out.println("Grupo PUERTO11 :      " + matcher.group(11));
        
        
        
                         }
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
        
                // PRUEBAS MESAELECTORAL
                Elector elector = new Elector();
                MesaElectoral mesaElectoral = new MesaElectoral() {
                    
                }
        }

}
