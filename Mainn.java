import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.nio.charset.StandardCharsets;

public class Mainn {

    public static void main(String[] args) throws Exception {
                BufferedReader br=new BufferedReader(new FileReader("C:\\votos.txt",StandardCharsets.UTF_8));
                // MesaElectoral prueba1 = new MesaElectoral();
                Elector elector1 = new Elector();
                List<Elector> listaElector = new ArrayList<>();
                

                File archivo = null;
                FileReader fr = null;
                System.out.println("Ingrese su nombre:");
             
               try {
                    archivo = new File ("C:\\votos.txt");
                    
                    String regex = "Nombre:(\\w*\\s?\\w*?).*Apellido:(\\w*).*Domicilio:(.*).*DNI:(\\d*).*cimiento:(\\d*/\\d*/\\d*).*Votacion:(.*)";
                     
                    Pattern pattern = Pattern.compile(regex);
                    String linea;
                    int con=0;
                    while((linea=br.readLine())!=null){
                        Matcher matcher = pattern.matcher(linea);
                        if(matcher.matches()){
                            System.out.println("");
                            // System.out.println("NOMBRES :" + matcher.group(1));
                            elector1.setNombre(matcher.group(1));
                            // System.out.println("APELLIDOS :" + matcher.group(2));
                            elector1.setApellido(matcher.group(2));
                            // System.out.println("DOMICICLIO:" + matcher.group(3));
                            elector1.setDomicilio(new Domicilio(matcher.group(3), null, null, null));
                            // System.out.println("DNI:" + matcher.group(4));
                            elector1.setDni(Integer.parseInt(matcher.group(4)));
                            // System.out.println("FECHA NACIMIENTO:" + matcher.group(5));
                            elector1.setFecNac(matcher.group(5));
                            // System.out.println("Lugar de Votacion:" + matcher.group(6));
                            elector1.setLugVotacion(matcher.group(6));
                        }
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
        
                // PRUEBAS MESAELECTORAL 
                
  
                Elector elector = new Elector("Pedro","Garcia",4093939,"asdas","asdasd",new Domicilio("asdasd","concordia","entre rios","asdasd"));
                List<Elector> listaElectores = new ArrayList<Elector>();
                listaElectores.add(elector);
                MesaElectoral mesaElectoral = new MesaElectoral(elector, elector, 12 ,listaElectores ) ;
                // System.out.println(mesaElectoral.getPadronElectoral());
        }

}
