import java.util.*;
import java.util.regex.Pattern;
import java.nio.charset.StandardCharsets;
import java.io.*;
import java.util.regex.Matcher;

public class Pruebas{
    public static void main(String [] Args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("C:\\votos.txt", StandardCharsets.UTF_8));

        String regex = "Nombre:(\\w*\\s?\\w*?).*Apellido:(\\w*).*Domicilio:(.*).*lidad/Departamento:(.*).*Provincia:(.*).*DNI:(\\d*).*cimiento:(\\d*/\\d*/\\d*).*Votacion:(.*)";
        
        Pattern pattern = Pattern.compile(regex);
        String linea;
        List<Elector> listaElector = new ArrayList<>();
        MesaElectoral prueba1 = new MesaElectoral();
        FileReader fr = null;
        File archivo = null;
        try{
            archivo = new File("C:\\votos.txt");
 
                
                while((linea = br.readLine())!=null){
                        Matcher matcher = pattern.matcher(linea);
                        if(matcher.matches()){    
                            System.out.println("");
                            String nombre = matcher.group(1);                            
                            String apellido = matcher.group(2);                            
                            int dni = Integer.parseInt(matcher.group(6));                           
                            String fecNac = matcher.group(7);                            
                            String lugVot = (matcher.group(8));
                            // listaElector.add(new Elector(nombre, apellido,dni,fecNac,lugVot, new Domicilio(matcher.group(3), matcher.group(4),matcher.group(5) , matcher.group(4))));
                        }
                        
                    }
            }catch (Exception e) {
                e.printStackTrace();
            } finally {
                // En el finally cerramos el fichero, para asegurarnos
                // que se cierra tanto si todo va bien como si salta
                // una excepcion.
                try {
                    if (null != fr) {
                        fr.close();
                        br.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }        
                    prueba1.setPadronElectoral(listaElector);
                    for (int index = 0; index < listaElector.size(); index++) {
                        System.out.println("");
                        System.out.println(listaElector.get(index));
                        
                    }
                    
            }
                

}