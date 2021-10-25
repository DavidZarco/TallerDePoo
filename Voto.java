
public class Voto {
    private ListaElectoral votoDiputados;
    private ListaElectoral votoSenadores;

    public Voto(ListaElectoral votoDiputados, ListaElectoral votoSenadores) {
        this.votoDiputados = votoDiputados;
        this.votoSenadores = votoSenadores;
    }

    public Voto() {
    }

    public ListaElectoral getVotoDiputados() {
        return votoDiputados;
    }

    public void setVotoDiputados(ListaElectoral votoDiputados) {
        this.votoDiputados = votoDiputados;
    }

    public ListaElectoral getVotoSenadores() {
        return votoSenadores;
    }

    public void setVotoSenadores(ListaElectoral votoSenadores) {
        this.votoSenadores = votoSenadores;
    }
    
    public void verificarVoto(){
        System.out.println("Está seguro de su voto?");
        //recibe respuesta, si es si finaliza si es no vuelve a la sala de votacion.
        
    }
    
}
