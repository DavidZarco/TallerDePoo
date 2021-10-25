public class Candidato extends Elector{
    
    private ListaElectoral listaElectoral;  

    public Candidato() {
    }

    public Candidato(String nombre, String apellido, int dni, String fecNac, String lugVotacion, int contadorElectores, Domicilio domicilio, ListaElectoral listaElectoral) {
        super(nombre, apellido, dni, fecNac, lugVotacion, domicilio);
        this.listaElectoral = listaElectoral;
    }

      

    @Override
    public String toString() {
        return "Candidato{" + "listaElectoral=" + listaElectoral + super.toString() + '}';
    }

    
    
    
    
    
}