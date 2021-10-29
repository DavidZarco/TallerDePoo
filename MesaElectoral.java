
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class MesaElectoral {

    private static int numeroMesa = 0; // Es estatico, el numero depende de la cantidad de objetos tipo mesaElectoral
    private Elector presidente;
    private Elector suplente;
    private int recuentoVotos;
    private List<Elector> padronElectoral; // txt 
    
    public MesaElectoral() {

    }
    
    public MesaElectoral(Elector presidente, Elector suplente, List<Elector> padronElectoal){
        this.presidente = presidente;
        this.suplente = suplente;
    }
        
        public List<Elector> getPadronElectoral() {
            return padronElectoral;
        }
        
        public void setPadronElectoral(List<Elector> padronElectoral) {
            this.padronElectoral = padronElectoral;
        }
        
        // Se guarda el dni
        
        public boolean verificarDni(int dni, String nTram){ 
            boolean verificador = false;
            
                System.out.println("El dni ingresado: "+dni);
                
                for (int index = 0; index < padronElectoral.size(); index++) {
                    int dniAprobar = this.padronElectoral.get(index).getDni();
                    if(dni == dniAprobar){
                        if ((padronElectoral.get(index).getNumTramite()).equals(nTram)) {
                        System.out.println(padronElectoral.get(index).getNombre()+this.padronElectoral.get(index).getApellido());
                        verificador = true;
                        System.out.println("ENTROOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
                        }
                    }   
                }
        return verificador;
    }
    
    
    // public void verificarElector(Elector elector){
        
        //     for (int index = 0; index < this.padronElectoral.size(); index++) {
            //             if(elector.equals(this.padronElectoral.get(index))){
                //                 System.out.println("Esta habilitado para votar");
                //             }
                
                //         }
                //         System.out.println("Datos erroneos");
                // }
                
                
                
                
                public List<ListaElectoral> generarListasLocales(Elector elector,int cantPartidos){
                    // Estas listas deben estar creadas en la interfaz
                    // List<Candidato> partido1Candidatos = new ArrayList<Candidato>();
                    // List<Candidato> partido2Candidatos = new ArrayList<Candidato>();
                    // List<Candidato> partido3Candidatos = new ArrayList<Candidato>();
                    // List<Candidato> partido4Candidatos = new ArrayList<Candidato>();
                    ListaElectoral partido1Diputados = new ListaElectoral();     // 1 DIPUTADOS PARA PROBAR
                    ListaElectoral partido2Diputados = new ListaElectoral();
                    ListaElectoral partido3Diputados = new ListaElectoral();
                    ListaElectoral partido4Diputados = new ListaElectoral();
                    
                    ListaElectoral partido1Senadores = new ListaElectoral();     // 1 SENADORES PARA PROBAR
                    ListaElectoral partido2Senadores = new ListaElectoral();
                    ListaElectoral partido3Senadores = new ListaElectoral();
                    ListaElectoral partido4Senadores = new ListaElectoral();
                    
                    
                    
                    // Esta lista es propia del metodo
                    List<ListaElectoral> resultado = new ArrayList<ListaElectoral>(); // Lista de listas de candidatos
                    
                    List<Candidato> posiblesCandidatos = new ArrayList<Candidato>();
                    
                    String provincia =elector.getDomicilio().getProvincia();

                    for(Elector persona : padronElectoral){
                        if(provincia==elector.getDomicilio().getProvincia()){
                            Candidato candidato = new Candidato(persona.getNombre(),persona.getApellido(),persona.getDni(),persona.getFecNac(),persona.getLugVotacion(),persona.getDomicilio(),
                            persona.getNumTramite(),new ListaElectoral(persona.getDomicilio().getProvincia(), "", 1, null , new GrupoPolitico("")), new Partido());
                            
                            posiblesCandidatos.add(candidato); 
                           
                            //String nombre, String apellido, int dni, String fecNac, String lugVotacion, Domicilio domicilio, String numTramite,
                                //ListaElectoral listaElectoral, Partido partidoPolitico
                            
                        } // A la listaElec y al partido los dejo en null  
                        
                    }   // Fin del foreac
                
                
                

                return resultado;
                
                }               
                //public void recibirVoto(Voto voto){
                    
                    // this.recuentoVotos ++;
                    // if (voto == null) {
                        //     votosBlanco;
                        // }else{
                            //     if (voto.getVotoDiputados().equals(voto.getVotoSenadores())) {
                                //         int votoPrueba ++;
                                //     }else{
                                    //         int votoPrueba++
                                    //         int votoPrueba2++;
                                    //     }
                                    // }
                                    //}
                                    
                    // public void cerrarMesa(){
                    //     //si pasa la hora maxima o dia. no se podrá votar
                    // }
                    
                    public int getNumeroMesa() {
                        return numeroMesa;
                    }   
                    
                    public Elector getPresidente() {
                        return presidente;
                    }
                    
                    public void setPresidente(Elector presidente) {
                        this.presidente = presidente;
                    }
                    
                    public Elector getSuplente() {
                        return suplente;
                    }
                    
                    public void setSuplente(Elector suplente) {
                        this.suplente = suplente;
                    }
                    
                    public int getRecuentoVotos() throws IOException {         // Con el fin de que esté actualizado, se hace la asignación de nuevo cada vez que se ejecuta el metodo
                        BufferedReader br = new BufferedReader(new FileReader("S:\\ficheroVotos.txt"));
                        String linea;
                        int i = 0;
                        while((linea = br.readLine())!=null){
                            i++;
                        }
                        this.recuentoVotos = i;
                        return recuentoVotos;
                    }
                    
                    public void setRecuentoVotos(int recuentoVotos) {
                        this.recuentoVotos = recuentoVotos;
                    }
                    
                    public void recibirVoto(String voto){
                        try(
                            BufferedReader br = new BufferedReader(new FileReader("S:\\ficheroVotos.txt"));
                            BufferedWriter bw = new BufferedWriter(new FileWriter("S:\\ficheroVotos.txt",true));
                            ){
                                
                                // Para escribir en el fichero
                                bw.newLine();       // Nueva linea
                                bw.write(voto); // SE INGRESA EL VOTO EN UN RENGLON NUEVO
                                bw.newLine();
                                // bw.write("Renglon 2");
                                // Guardamos los cambios del fichero
                                bw.flush();
                                
                                
                                
                            }catch(IOException e){
                                System.out.println("Error al ingresar el voto: "+ e);
                            }
                            
                            
                        }
                        
                        
                        @Override
                        public String toString() {
                            return "MesaElectoral{" + "numeroMesa=" + numeroMesa + ", presidente=" + presidente + ", suplente=" + suplente + ", recuentoVotos=" + recuentoVotos + ", padronElectoral=" + padronElectoral + '}';
                        }
                        
                        
                        @Override
                        public int hashCode() {
                            int hash = 3;
                            hash = 61 * hash + this.numeroMesa;
                            return hash;
                        }
                        
                        @Override
                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj == null) {
                                return false;
                            }
                            if (getClass() != obj.getClass()) {
                                return false;
                            }
                            final MesaElectoral other = (MesaElectoral) obj;
                            if (this.numeroMesa != other.numeroMesa) {
                                return false;
                            }
                            return true;
                        }
                        
                        
                        
                    
                
            

                              
        }//fin de la clase MesaElectoral
                