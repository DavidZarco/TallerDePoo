import java.util.List;
import java.util.Objects;

public class Circuito {
    
    private List<MesaElectoral> mesasElectorales;

    public Circuito(List<MesaElectoral> mesasElectorales) {
        this.mesasElectorales = mesasElectorales;
    }

    public List<MesaElectoral> getMesasElectorales() {
        return mesasElectorales;
    }

    public void setMesasElectorales(List<MesaElectoral> mesasElectorales) {
        this.mesasElectorales = mesasElectorales;
    }

    @Override
    public String toString() {
        return "Circuito{" + "mesasElectorales=" + mesasElectorales + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.mesasElectorales);
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
        final Circuito other = (Circuito) obj;
        if (!Objects.equals(this.mesasElectorales, other.mesasElectorales)) {
            return false;
        }
        return true;
    }
    
    
    
}

