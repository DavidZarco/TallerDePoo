public class Elector {
    private String nombre;
    private String apellido;
    private int dni;
    private String fecNac;
    private String lugVotacion;
    private static int contadorElectores = 0;
    private Domicilio domicilio;
    private MesaElectoral mesaVotacion;
    private String numTramite;

        
    public Elector(String nombre, String apellido, int dni, String fecNac, String lugVotacion, Domicilio domicilio, String numTramite) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecNac = fecNac;
        this.lugVotacion = lugVotacion;
        this.domicilio = domicilio;
        contadorElectores++;
        this.numTramite = numTramite;

    }

    public String getNumTramite() {
        return numTramite;
    }

    public void setNumTramite(String numTramite) {
        this.numTramite = numTramite;
    }


    public boolean habilitadoParaVotar(){
        boolean habVoto = false;
        // final int ANIO_ACTUAL = 2021;
        // if (ANIO_ACTUAL - Integer.parseInt(this.fecNac) >= 16) {
        //     habVoto = true;   
        // }
        return habVoto;
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

    
    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Elector:" + "Nombre:" + nombre + ", Apellido:" + apellido + ", Dni:" + dni + ", Fecha de Nacimiento:" + fecNac + ", lugar de Votacion:" + lugVotacion + ", Domicilio ," + domicilio + ", Mesa de Votacion:" + mesaVotacion + ", Numero de tramite: " + numTramite;
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
