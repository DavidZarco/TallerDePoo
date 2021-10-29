import java.util.*;
import java.util.regex.Pattern;
import java.nio.charset.StandardCharsets;
import java.io.*;
import java.util.regex.Matcher;
public class Main{
    
    public static void main(String args[]) throws Exception  {

        BufferedReader br = new BufferedReader(new FileReader("C:\\votos.txt", StandardCharsets.UTF_8));
        MesaElectoral mesaElectoral = new MesaElectoral();
        ArrayList<Elector> listaElector = new ArrayList<Elector>();
        File archivo = null;
        FileReader fr = null;
        //atada candidatos a diputados y senadores por distrito
        //distrito tiene su cantidad de diputados
        try {
            archivo = new File("C:\\votos.txt");
            String regex = "Nombre:(\\w*\\s?\\w*?).*Apellido:(\\w*).*Domicilio:(.*).*Localidad/Departamento:(.*).*Provincia:(.*).*DNI:(\\d*).*cimiento:(\\d*/\\d*/\\d*).*Votacion:(.*).*Candidato:(.*).*NTramite:(.*).*";
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

                }        
            }
            mesaElectoral.setPadronElectoral(listaElector);
             System.out.println("Lista de pruebas:");
             System.out.println("DNI:61724563 NTramite:53926872601732");
             System.out.println("DNI:68575857 NTramite:550875887600946");
             System.out.println("DNI:36216417 NTramite:40909192757681");
             System.out.println("DNI:60657109 NTramite:274643735461045");
             System.out.println("DNI:20831151 NTramite:991539327457172");
            Scanner sc = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            
            System.out.println("Ingrese su DNI");
            int DNI = sc.nextInt();
            System.out.println("Ingrese el numero de tramite de su DNI");
            String nTramite = sc2.next();  
           
            // String nTramite = "53926872601732" ; 
            // System.out.println(numes datosn               
            // datos pruebas Nombre:Juan Apellido:Perez Domicilio:Buenos Aires 1382 Localidad/Departamento:Concordia Provincia:Entre Rios DNI:61724563 FNacimiento:23/01/1955 LugarVotacion:Escuela N°1 Candidato:SI NTramite:53926872601732
            //int DNI = 13592717;
            //String nTramite = "63076627254486";
            //System.out.println("El numero de tramite ingresado es: "+nTramite);
            
            if (mesaElectoral.verificarDni(DNI,nTramite)) {
                       //aca va el resto del programa
                    System.out.println("Acceso concedido");
                    System.out.println("Elija su lista:");
                    System.out.println("0:Ninguna");
                    System.out.println("1:Juntos por el cambio");
                    System.out.println("");
                    System.out.println("Diego Santilli, Graciela Ocaña, Facundo Manes");
                    System.out.println("");
                    System.out.println("2:Nueva Izquierda");
                    System.out.println("");
                    System.out.println("Cristina Fernández de Kirchner,Claudia Ledesma Abdala,Martín Lousteau");
                    System.out.println("");

                    System.out.println("3:Partido del obrero");
                    System.out.println("");
                    System.out.println("Luis Petcoff Naidenoff, Humberto Schiavoni, Oscar Aníbal Castillo");
                    System.out.println("");

                    System.out.println("4:Partido Fe");
                    System.out.println("");
                    System.out.println("Juan Carlos Romero,	Carmen Lucila Crexell, María Clara Vega");
                    System.out.println("");

                    System.out.println("5:Compromiso Federal");
                    System.out.println("");
                    System.out.println("Esteban José Bullrich,Juliana Di Tullio,Gladys González");
                    System.out.println("");
                    Scanner sc3 = new Scanner(System.in);
                    int bot = sc.nextInt();
                    int votoBlanco = 0;             // 0 ES VOTO EN BLANCO
                    int votoLista1 = 0;
                    int votoLista2 = 0;
                    int votoLista3 = 0;
                    int votoLista4 = 0;
                    int votoLista5 = 0;
                    switch(bot){
                        case 0:
                        votoBlanco++;
                        break;
                        case 1:
                        ListaElectoral lista1 = new ListaElectoral();
                        votoLista1++;
                        break;
                        case 2:
                        ListaElectoral lista2 = new ListaElectoral();
                        votoLista2++;
                        break;
                        case 3:
                        ListaElectoral lista3 = new ListaElectoral();
                        votoLista3++;
                        break;
                        case 4:
                        ListaElectoral lista4 = new ListaElectoral();
                        votoLista4++;
                        break;
                        case 5:
                        ListaElectoral lista5 = new ListaElectoral();
                        votoLista5++;
                        break;
                    }
                    

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
                    //System.out.println("Datos de juan perez: "+juanPerez.toString());
                     mesaElectoral.generarListasLocales(juanPerez,3);




                     
                }       // ACA TERMINA EL VOID MAIN
                                          
    }//fin de la clase
