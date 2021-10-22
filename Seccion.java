
import java.util.List;
import java.util.Objects;

public class Seccion {
    private String nombre;
    private List<Circuito> listaCircuito;

    public Seccion() {
    }

    public Seccion(String nombre, List<Circuito> listaCircuito) {
        this.nombre = nombre;
        this.listaCircuito = listaCircuito;
    }

    public List<Circuito> getListaCircuito() {
        return listaCircuito;
    }

    public void setListaCircuito(List<Circuito> listaCircuito) {
        this.listaCircuito = listaCircuito;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Seccion{" + "nombre=" + nombre + ", listaCircuito=" + listaCircuito + '}';
    }

    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.nombre);
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
        final Seccion other = (Seccion) obj;
        return true;
    }
    
    
    
}
