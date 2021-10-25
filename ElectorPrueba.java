public class ElectorPrueba {
    private String nombre;
    private String apellido;
    private int dni;
    private String fecNac;
    private String lugVotacion;
    private static int contadorElectores = 0;
    private Domicilio domicilio;
    private MesaElectoral mesaVotacion;

    public ElectorPrueba() {
        this.contadorElectores = contadorElectores+1;
    }
    

    public ElectorPrueba(String nombre, String apellido, int dni, String fecNac, String lugVotacion, Domicilio domicilio) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecNac = fecNac;
        this.lugVotacion = lugVotacion;
        this.domicilio = domicilio;

    }

}
