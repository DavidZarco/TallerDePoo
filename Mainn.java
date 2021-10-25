import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.nio.charset.StandardCharsets;

public class Mainn {

    public static void main(String[] args) throws Exception {
                BufferedReader br=new BufferedReader(new FileReader("C:\\votos.txt",StandardCharsets.UTF_8));
                MesaElectoral prueba1 = new MesaElectoral();
                List<Elector> listaElector = new ArrayList<>();
                String nombre;
                String apellido;
                int dni;
                String fecNac;
                String lugVot;
                

                File archivo = null;
                FileReader fr = null;

             
               try {
                    archivo = new File ("C:\\votos.txt");
                    
                    String regex = "Nombre:(\\w*\\s?\\w*?).*Apellido:(\\w*).*Domicilio:(.*).*lidad/Departamento:(.*).*Provincia:(.*).*DNI:(\\d*).*cimiento:(\\d*/\\d*/\\d*).*Votacion:(.*)";
                     
                    Pattern pattern = Pattern.compile(regex);
                    String linea;
                    
                    while((linea=br.readLine())!=null){
                        Matcher matcher = pattern.matcher(linea);
                        if(matcher.matches()){    
                            System.out.println("");
                            nombre = matcher.group(1);                            
                            apellido = matcher.group(2);                            
                            dni = Integer.parseInt(matcher.group(6));                           
                            fecNac = matcher.group(7);                            
                            lugVot = (matcher.group(8));
                            listaElector.add(new Elector(nombre, apellido,dni,fecNac,lugVot, new Domicilio(matcher.group(3), matcher.group(4),matcher.group(5) , matcher.group(4))));
                        }
                        
                    }
                        prueba1.setPadronElectoral(listaElector);
                        for (int index = 0; index < listaElector.size(); index++) {
                                System.out.println("");
                                 System.out.println(listaElector.get(index));
                         
                        }
                        
                    }  
                 catch (Exception e) {
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

                System.out.println("Se ejecutó el Metodo main");
        }

}
