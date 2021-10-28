
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class MesaElectoral {
    private static int numeroMesa = 0; // Es estatico, el numero depende de la cantidad de objetos tipo mesaElectoral
    private Elector presidente;
    private Elector suplente;
    private int recuentoVotos;
    private List<Elector> padronElectoral; // txt 

    public MesaElectoral() {
    }

    // publlector pres+dente, Elector suplente, int recuentoVotos, List<Elector> padronElectoral) {
    //     this.numeroMesa = numeroMesa+1;
    //     this.presidente = presidente;
    //     this.suplente = suplente;
    //     this.recuentoVotos = 0;
    //     this.padronElectoral = padronElectoral;
    // }

    public List<Elector> getPadronElectoral() {
        return padronElectoral;
    }

    public void setPadronElectoral(List<Elector> padronElectoral) {
        this.padronElectoral = padronElectoral;
    }
    
    // Se guarda el dni
    
    public boolean verificarDni(int dni){ 
        boolean verificador = false;
        try {
            for (int index = 0; index < this.padronElectoral.size(); index++) {
                if (dni == this.padronElectoral.get(index).getDni()) {
                    // System.out.println("PEPE VERIFICADO");
                    verificador = true;
                }
            }
            
            
            return verificador;
            

            // for (int index = 0; index < this.padronElectoral.size(); index++) {
            //     if (elector.getDni() == (this.padronElectoral.get(index).getDni())) {
            //         if(elector.equals(this.padronElectoral.get(index))){
            //             System.out.println("Esta habilitado para votar");
            //         }
            //     }
            // }
            // System.out.println("Datos erroneos");
            
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    
    // public void verificarElector(Elector elector){
        
    //     for (int index = 0; index < this.padronElectoral.size(); index++) {
    //             if(elector.equals(this.padronElectoral.get(index))){
    //                 System.out.println("Esta habilitado para votar");
    //             }
                
    //         }
    //         System.out.println("Datos erroneos");
    // }




    public List<List<Candidato>> generarListasLocales(Elector elector){
        // Estas listas deben estar creadas en la interfaz
        // List<Candidato> partido1Candidatos = new ArrayList<Candidato>();
        // List<Candidato> partido2Candidatos = new ArrayList<Candidato>();
        // List<Candidato> partido3Candidatos = new ArrayList<Candidato>();
        // List<Candidato> partido4Candidatos = new ArrayList<Candidato>();
        List<Candidato> partido1Diputados = new ArrayList<Candidato>();     // 3 DIPUTADOS
        List<Candidato> partido2Diputados = new ArrayList<Candidato>();
        List<Candidato> partido3Diputados = new ArrayList<Candidato>();
        List<Candidato> partido4Diputados = new ArrayList<Candidato>();

        List<Candidato> partido1Senadores = new ArrayList<Candidato>();     // 2 SENADORES
        List<Candidato> partido2Senadores = new ArrayList<Candidato>();
        List<Candidato> partido3Senadores = new ArrayList<Candidato>();
        List<Candidato> partido4Senadores = new ArrayList<Candidato>();

        

        // Esta lista es propia del metodo
        List<Candidato> posiblesCandidatos = new ArrayList<Candidato>();
        

        for(persona : padronElectoral){
            if(persona.getDomicilio().getProvincia()==elector.getDomicilio().getProvincia()){
                posiblesCandidatos.add(new Candidato(persona.getNombre(),persona.getApellido(),persona.getDni(),persona.getFecNac(),persona.getLugVotacion(),persona.getDomicilio(),
                null, null)); // A la listaElec y al partido los dejo en null  
            }
        }
        Collections.shuffle(posiblesCandidatos);
        System.out.println("LA LISTA DE POSIBLES CANDIDATOS HA SIDO CREADA.");
        int i = 0;
        while(partido1Diputados.size()<3){
            partido1Diputados.add(posiblesCandidatos.get(i));
            i++;
        }
        resultado.add(partido1Diputados);
        while(partido2Diputados.size()<3){
            partido2Diputados.add(posiblesCandidatos.get(i));
            i++;
        }
        resultado.add(partido2Diputados);
        while(partido3Diputados.size()<3){
            partido3Diputados.add(posiblesCandidatos.get(i));
            i++;
        }
        resultado.add(partido3Diputados);
        while(partido4Diputados.size()<3){
            partido4Diputados.add(posiblesCandidatos.get(i));
            i++;
        }
        resultado.add(partido4Diputados);
        


        while(partido1Senadores.size()<3){
            partido1Senadores.add(posiblesCandidatos.get(i));
            i++;
        }
        resultado.add(partido1Senadores);
        while(partido2Senadores.size()<3){
            partido2Senadores.add(posiblesCandidatos.get(i));
            i++;
        }
        resultado.add(partido2Senadores);
        while(partido3Senadores.size()<3){
            partido3Senadores.add(posiblesCandidatos.get(i));
            i++;
        }
        resultado.add(partido3Senadores);
        while(partido4Senadores.size()<3){
            partido4Senadores.add(posiblesCandidatos.get(i));
            i++;
        }
        resultado.add(partido4Senadores);

    }

        // this.recuentoVotos++    public void recibirVoto(Voto voto){
        //public void recibirVoto(Voto voto){
        // int votosBlanco = 0;

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
    }
    
    public void cerrarMesa(){
        //si pasa la hora maxima o dia. no se podrá votar tendriamos que trabajar con localDateTime.
    }

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

   
    public int getRecuentoVotos() {
        return recuentoVotos;
    }

    public void setRecuentoVotos(int recuentoVotos) {
        this.recuentoVotos = recuentoVotos;
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
    
        
    
}