public class Candidato extends Elector{
    
    private ListaElectoral listaElectoral;  
    private Partido partidoPolitico;



    public ListaElectoral getListaElectoral() {
        return listaElectoral;
    }

    public void setListaElectoral(ListaElectoral listaElectoral) {
        this.listaElectoral = listaElectoral;
    }

    public Partido getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(Partido partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public Candidato(String nombre, String apellido, int dni, String fecNac, String lugVotacion, Domicilio domicilio, String numTramite,
            ListaElectoral listaElectoral, Partido partidoPolitico) {
        super(nombre, apellido, dni, fecNac, lugVotacion, domicilio, numTramite);
        this.listaElectoral = listaElectoral;
        this.partidoPolitico = partidoPolitico;
    }

    @Override
    public String toString() {
        return "Candidato{" + "listaElectoral=" + listaElectoral + super.toString() + '}';
    }

}