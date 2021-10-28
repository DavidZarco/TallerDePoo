import java.util.*;
import java.util.regex.Pattern;
import java.nio.charset.StandardCharsets;
import java.io.*;
import java.util.regex.Matcher;

public class Main{
    
    
    public static void main(String args[]) throws Exception  {

        BufferedReader br = new BufferedReader(new FileReader("C:\\votos.txt", StandardCharsets.UTF_8));
        //MesaElectoral prueba1 = new MesaElectoral();
        // Elector elector1 = new Elector();
        List<Elector> listaElector = new ArrayList<>();
        // List <Candidato> listaCandidato = new ArrayList<>();
        
        File archivo = null;
        FileReader fr = null;
        //atada candidatos a diputados y senadores por distrito
        //distrito tiene su cantidad de diputados
        try {
            archivo = new File("C:\\votos.txt");
            String regex = "Nombre:(\\w*\\s?\\w*?).*Apellido:(\\w*).*Domicilio:(.*).*Localidad/Departamento:(.*).*Provincia:(.*).*DNI:(\\d*).*cimiento:(\\d*/\\d*/\\d*).*Votacion:(.*).*Candidato:(.*)\\s.*NTramite:(.*).*";
            //1 nombre 2 apellido 3 domicilio 4 localidad 5 provincia 6 dni 7 nacimiento 8 lugvotacion 9 candi 10 ntramite
            Pattern pattern = Pattern.compile(regex);
            String linea;
            int con = 0;
            // String candidato = "SI";
            while((linea=br.readLine())!=null){
                Matcher matcher = pattern.matcher(linea);
            
                if(matcher.matches()){    
                    String nombre = matcher.group(1);                            
                    String apellido = matcher.group(2);                            
                    int dni = Integer.parseInt(matcher.group(6));                           
                    String fecNac = matcher.group(7);                            
                    String lugVot = (matcher.group(8));
                    String numTramite = matcher.group(10);                                                
                    listaElector.add(new Elector(nombre, apellido,dni,fecNac,lugVot, new Domicilio(matcher.group(3), matcher.group(4),matcher.group(5) , matcher.group(4)), numTramite));
                    // String candidato = (matcher.group(9));
                    
                    // if (candidato.equals(matcher.group(9))) {
                    // listaCandidato.add(new Candidato(nombre, apellido,dni,fecNac,lugVot, new Domicilio(matcher.group(3), matcher.group(4),matcher.group(5) , matcher.group(4)), new ListaElectoral(), new Partido()));
                        
                        
                    // }
                } else{
                    // con++;
                    // System.out.println(con);
                    // System.out.println("esto es una mierda");
                }  
                }
    
                //prueba1.setPadronElectoral(listaElector);
                // Elector elector1 = new Elector("Juan", "Perez", 61744563, "23/01/1955", "Escuela N°1", new Domicilio("Buenos Aires 1382", "Concordia", "Entre Rios", "Concordia"));
                System.out.println("Ingrese su DNI");
                // Scanner sc = new Scanner(System.in);
                // int nomb = sc.nextInt();
                int dni = 61724563;
                System.out.println(dni); 
                // 61724563
                

                //prueba1.verificarDni(dni);

                //if (prueba1.verificarDni(dni)) {
                    // nombre
                    // apellido
                    // direccion
                    // localidad
                    // provincia
                    // departamento
                    // lugVotacion 
                   // prueba1.verificarElector(elector1);
                    
                //}

                
                    
                    // for (int index = 0; index < listaCandidato.size(); index++) {
                    //         System.out.println("");
                    //          System.out.println(listaCandidato.get(index));
                    
                    //  }
                    
                    
                     for (int index = 0; index < listaElector.size(); index++) {
                             System.out.println("");
                             System.out.println(listaElector.get(index));
                        
                         }

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



                



                }       // ACA TERMINA EL VOID MAIN
                     



              
                // List<Elector> posiblesCandidatos = new ArrayList<Elector>();
                // Elector electorPrueba1 = new Elector();
                // int dniPrueba = 61724563 ;      // Ya esta metido en el programa

                // for(Elector elector : listaElector){
                // if(elector.getDomicilio().getProvincia().equals(electorPrueba1.getDomicilio().getProvincia())){        // Si comparten la misma provincia
                //     posiblesCandidatos
                // }

            
           
            
            
            
                                          
    }//fin del main
