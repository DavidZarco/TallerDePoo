import java.util.List;
import java.util.Objects;

public class Distrito { //tendria que implentar la interfaz "Estadistica"
    private String nombre;
    private int cantidadDiputados;
    private int cantidadSenadores;
    private List<Seccion> listaSeccion;

    public Distrito() {
    }

    public Distrito(String nombre, int cantidadDiputados, int cantidadSenadores, List<Seccion> listaSeccion) {
        this.nombre = nombre;
        this.cantidadDiputados = cantidadDiputados;
        this.cantidadSenadores = cantidadSenadores;
        this.listaSeccion = listaSeccion;
    }

    
    
    private void numerarCircuito(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDiputados() {
        return cantidadDiputados;
    }

    public void setCantidadDiputados(int cantidadDiputados) {
        this.cantidadDiputados = cantidadDiputados;
    }

    public int getCantidadSenadores() {
        return cantidadSenadores;
    }

    public void setCantidadSenadores(int cantidadSenadores) {
        this.cantidadSenadores = cantidadSenadores;
    }

    @Override
    public String toString() {
        return "Distrito{" + "nombre=" + nombre + ", cantidadDiputados=" + cantidadDiputados + ", cantidadSenadores=" + cantidadSenadores + ", listaSeccion=" + listaSeccion + '}';
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.nombre);
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
        final Distrito other = (Distrito) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    
    
    
    
}
