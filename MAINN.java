import java.util.*;
import java.util.regex.Pattern;
import java.nio.charset.StandardCharsets;
import java.io.*;
import java.util.regex.Matcher;

public class MAINN{
    
    
    public static void main(String args[]) throws Exception  {

        BufferedReader br = new BufferedReader(new FileReader("C:\\votos.txt", StandardCharsets.UTF_8));
        MesaElectoral prueba1 = new MesaElectoral();
        // Elector elector1 = new Elector();
        List<Elector> listaElector = new ArrayList<>();
        List <Candidato> listaCandidato = new ArrayList<>();
        
        File archivo = null;
        FileReader fr = null;
        //atada candidatos a diputados y senadores por distrito
        //distrito tiene su cantidad de diputados
        try {

            archivo = new File("C:\\votos.txt");
            
            String regex = "Nombre:(\\w*\\s?\\w*?).*Apellido:(\\w*).*Domicilio:(.*).*Localidad/Departamento:(.*).*Provincia:(.*).*DNI:(\\d*).*cimiento:(\\d*/\\d*/\\d*).*Votacion:(.*).*Candidato:(.*).*";
            
            Pattern pattern = Pattern.compile(regex);
            String linea;
            String candidato = "SI";
            while((linea=br.readLine())!=null){
                Matcher matcher = pattern.matcher(linea);
                if(matcher.matches()){    
                    System.out.println("");
                    System.out.println(matcher.group(6));
                    String nombre = matcher.group(1);                            
                    String apellido = matcher.group(2);                            
                    int dni = Integer.parseInt(matcher.group(6));                           
                    String fecNac = matcher.group(7);                            
                    String lugVot = (matcher.group(8));
                    listaElector.add(new Elector(nombre, apellido,dni,fecNac,lugVot, new Domicilio(matcher.group(3), matcher.group(4),matcher.group(5) , matcher.group(4))));
                    // String candidato = (matcher.group(9));
                    
                    if (candidato.equals(matcher.group(9))) {
                    listaCandidato.add(new Candidato(nombre, apellido,dni,fecNac,lugVot, new Domicilio(matcher.group(3), matcher.group(4),matcher.group(5) , matcher.group(4)), new ListaElectoral(), new Partido()));
                        
                        
                    }
                }   
                }
                // prueba1.setPadronElectoral(listaElector);
                    //  for (int index = 0; index < listaCandidato.size(); index++) {
                    //         System.out.println("");
                    //          System.out.println(listaCandidato.get(index));
                    
                    // }
                    
                    
                    // for (int index = 0; index < listaElector.size(); index++) {
                        //     System.out.println("");
                        //     System.out.println(listaElector.get(index));
                        
                        // }
                    } catch (Exception e) {
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
                }
                                          
    }//fin del main
