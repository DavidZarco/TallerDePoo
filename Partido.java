
import java.util.List;
import java.util.Objects;

public class Partido extends GrupoPolitico{
    private String sigla;
    private List<Candidato> candidatosPart;

    public Partido(List<Candidato> candidatosPart) {
        this.candidatosPart = candidatosPart;
    }

    public Partido(List<Candidato> candidatosPart, String nombre) {
        super(nombre);
        this.candidatosPart = candidatosPart;
    }

    public List<Candidato> getCandidatosPart() {
        return candidatosPart;
    }

    public void setCandidatosPart(List<Candidato> candidatosPart) {
        this.candidatosPart = candidatosPart;
    }
    

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Partido{" + "sigla=" + sigla + ", candidatosPart=" + candidatosPart + '}';
    }

   

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Partido other = (Partido) obj;
        if (!Objects.equals(this.sigla, other.sigla)) {
            return false;
        }
        return true;
    }
    
    
    
    

    
}

