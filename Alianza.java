import java.util.List;
import java.util.Objects;

public class Alianza extends GrupoPolitico{
    
    private List<Partido> listaPartidosAsociados;

    public Alianza() {
    }

    public Alianza(String nombre, List<Partido> listaPartidosAsociados) {
        super(nombre);
        this.listaPartidosAsociados = listaPartidosAsociados;
    }

    public List<Partido> getListaPartidosAsociados() {
        return listaPartidosAsociados;
    }

    public void setListaPartidosAsociados(List<Partido> listaPartidosAsociados) {
        this.listaPartidosAsociados = listaPartidosAsociados;
    }

    @Override
    public String toString() {
        return "Alianza{" + "listaPartidosAsociados=" + listaPartidosAsociados + super.toString()+ '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.listaPartidosAsociados);
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
        final Alianza other = (Alianza) obj;
        if (!Objects.equals(this.listaPartidosAsociados, other.listaPartidosAsociados)) {
            return false;
        }
        return true;
    }
    
    
    
        
    
    
    
    
    
    
    
    
}
