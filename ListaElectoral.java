
import java.util.List;
import java.util.Objects;

public class ListaElectoral {
    
    private String provinciaPost;
    private String nombre;
    private int numero;
    private List<Candidato> listaCandidato;
    private GrupoPolitico grupoPolitico;

    public ListaElectoral() {
    }

    public ListaElectoral(String provinciaPost, String nombre, int numero, List<Candidato> listaCandidato, GrupoPolitico grupoPolitico) {
        this.provinciaPost = provinciaPost;
        this.nombre = nombre;
        this.numero = numero;
        this.listaCandidato = listaCandidato;
        this.grupoPolitico = grupoPolitico;
    }

    public GrupoPolitico getGrupoPolitico() {
        return grupoPolitico;
    }

    public void setGrupoPolitico(GrupoPolitico grupoPolitico) {
        this.grupoPolitico = grupoPolitico;
    }

    
    
    public List<Candidato> getListaCandidato() {
        return listaCandidato;
    }

    public void setListaCandidato(List<Candidato> listaCandidato) {
        this.listaCandidato = listaCandidato;
    }

   
    public String getProvinciaPost() {
        return provinciaPost;
    }

    public void setProvinciaPost(String provinciaPost) {
        this.provinciaPost = provinciaPost;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "ListaElectoral{" + "provinciaPost=" + provinciaPost + ", nombre=" + nombre + ", numero=" + numero + ", listaCandidato=" + listaCandidato + ", grupoPolitico=" + grupoPolitico + '}';
    }

    

    @Override
    public int hashCode() {
        int hash = 7;
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
        final ListaElectoral other = (ListaElectoral) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (!Objects.equals(this.provinciaPost, other.provinciaPost)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
