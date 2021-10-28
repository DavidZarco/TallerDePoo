
import java.util.List;

public class MesaElectoral {
    private static int numeroMesa = 0; // Es estatico, el numero depende de la cantidad de objetos tipo mesaElectoral
    private Elector presidente;
    private Elector suplente;
    private int recuentoVotos;
    private List<Elector> padronElectoral; // txt 

    public MesaElectoral() {
    }

    public MesaElectoral(Elector presidente, Elector suplente, int recuentoVotos, List<Elector> padronElectoral) {
        this.numeroMesa = numeroMesa+1;
        this.presidente = presidente;
        this.suplente = suplente;
        this.recuentoVotos = 0;
        this.padronElectoral = padronElectoral;
    }

    public List<Elector> getPadronElectoral() {
        return padronElectoral;
    }

    public void setPadronElectoral(List<Elector> padronElectoral) {
        this.padronElectoral = padronElectoral;
    }

    
    
    public void verificarDni(Elector elector){ 
        try {
            for (int index = 0; index < this.padronElectoral.size(); index++) {
                if (elector.getDni() == (this.padronElectoral.get(index).getDni())) {
                    if(elector.equals(this.padronElectoral.get(index))){
                        System.out.println("Esta habilitado para votar");
                    }
                }
            }
            System.out.println("Datos erroneos");
            break;
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    
    public void recibirVoto(Voto voto){
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