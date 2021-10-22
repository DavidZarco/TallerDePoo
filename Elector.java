public class Elector {
    private String nombre;
    private String apellido;
    private int dni;
    private String fecNac;
    private String lugVotacion;
    private int contadorElectores;
    private Domicilio domicilio;
    private MesaElectoral mesaVotacion;

    public Elector() {
    }

    public Elector(String nombre, String apellido, int dni, String fecNac, String lugVotacion, int contadorElectores, Domicilio domicilio, MesaElectoral mesaVotacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecNac = fecNac;
        this.lugVotacion = lugVotacion;
        this.contadorElectores = contadorElectores;
        this.domicilio = domicilio;
        this.mesaVotacion = mesaVotacion;
    }

    public MesaElectoral getMesaVotacion() {
        return mesaVotacion;
    }

    public void setMesaVotacion(MesaElectoral mesaVotacion) {
        this.mesaVotacion = mesaVotacion;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getFecNac() {
        return fecNac;
    }

    public void setFecNac(String fecNac) {
        this.fecNac = fecNac;
    }

    public String getLugVotacion() {
        return lugVotacion;
    }

    public void setLugVotacion(String lugVotacion) {
        this.lugVotacion = lugVotacion;
    }

    public int getContadorElectores() {
        return contadorElectores;
    }

    public void setContadorElectores(int contadorElectores) {
        this.contadorElectores = contadorElectores;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Elector{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", fecNac=" + fecNac + ", lugVotacion=" + lugVotacion + ", contadorElectores=" + contadorElectores + ", domicilio=" + domicilio + ", mesaVotacion=" + mesaVotacion + '}';
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
        final Elector other = (Elector) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }
    
    
    
    
}
