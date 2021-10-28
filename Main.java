import java.util.*;
import java.util.regex.Pattern;
import java.nio.charset.StandardCharsets;
import java.io.*;
import java.util.regex.Matcher;

public class Main{
    
    public static void main(String args[]) throws Exception  {

        BufferedReader br = new BufferedReader(new FileReader("C:\\votos.txt", StandardCharsets.UTF_8));
        MesaElectoral mesaElectoral = new MesaElectoral();
        List<Elector> listaElector = new ArrayList<>();
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
                    // System.out.println(matcher.group(1));
                    // System.out.println(matcher.group(2));
                    // System.out.println(matcher.group(3));
                    // System.out.println(matcher.group(4));
                    // System.out.println(matcher.group(5));
                    // System.out.println(matcher.group(6));
                    // System.out.println(matcher.group(7));
                    // System.out.println(matcher.group(8));
                    // System.out.println(matcher.group(9));
                    // System.out.println(matcher.group(10));

                }        
            }
            mesaElectoral.setPadronElectoral(listaElector);
            System.out.println("Lista de pruebas:");
            System.out.println("DNI:36216417 NTramite:40909192757681");
            System.out.println("DNI:93592717 NTramite:63076627254486");
            System.out.println("DNI:54877765 NTramite:677980723686662");
            System.out.println("DNI:27665660 NTramite:423426296749582");
            System.out.println("DNI:20831151 NTramite:991539327457172");
            Scanner sc = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Ingrese su DNI");
            int DNI = sc.nextInt();
            System.out.println("Ingrese el numero de tramite de su DNI");
            String nTramite = sc2.next();  
           
            // String nTramite = "53926872601732" ; //53926872601732
            // System.out.println(numes datosn               
            // datos pruebas Nombre:Juan Apellido:Perez Domicilio:Buenos Aires 1382 Localidad/Departamento:Concordia Provincia:Entre Rios DNI:61724563 FNacimiento:23/01/1955 LugarVotacion:Escuela N°1 Candidato:SI NTramite:53926872601732
            //int DNI = 13592717;
            //String nTramite = "63076627254486";
            System.out.println("El numero de tramite ingresado es: "+nTramite);
            // for (int index = 0; index < listaElector.size(); index++) {
            //                  System.out.println("");
            //                  System.out.println(listaElector.get(index));
                        
            //             } 
            //26214998
            //DNI:41354997 
            //17910033
            //PROBLEMAS 15873618
            //
            //
            if (mesaElectoral.verificarDni(DNI,nTramite)) {
                       //aca va el resto del programa
                    System.out.println("Acceso concedido");
                        // for (int index = 0; index < listaElector.size(); index++) {
                        //      System.out.println("");
                        //      System.out.println(listaElector.get(index));
                        
                        // }
                }else{
                    System.out.println("Acceso denegado");
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
                    // Prueba para generar las listas locales.
                    Elector juanPerez = new Elector("Juan","Perez",61724563,"23/01/1955","Escuela N°1",new Domicilio("Buenos Aires 1382","Concordia","Chubut ","Chubut "),"53926872601732");
                    System.out.println("Datos de juan perez: "+juanPerez.toString());
                     mesaElectoral.generarListasLocales(juanPerez,3);
                }       // ACA TERMINA EL VOID MAIN
                     



              
                // List<Elector> posiblesCandidatos = new ArrayList<Elector>();
                // Elector electorPrueba1 = new Elector();
                // int dniPrueba = 61724563 ;      // Ya esta metido en el programa

                // for(Elector elector : listaElector){
                // if(elector.getDomicilio().getProvincia().equals(electorPrueba1.getDomicilio().getProvincia())){        // Si comparten la misma provincia
                //     posiblesCandidatos
                // }

            
           
            
            
            
                                          
    }//fin de la clase
