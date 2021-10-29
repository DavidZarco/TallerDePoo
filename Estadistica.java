public class Estadistica {

    public Estadistica(){   // Constructor vacío

    }
    //Luego pasa a la interfaz grafica de estadisticas, que solo se accede con una cuenta con permisos de admin.
    public void porcentajePadron(Elector elector){
            return elector.getContadorElectores()/100;
    }
    
    public void porcentajeGeneral(){

    }

    public void habilitadoEleccionesGenerales(){
        
    }

    public int cantidadVotantes(Elector elector){ // Ingresar un elector aleatorio para leer la variable del contador
        return elector.getContadorElectores();
    }
    public void cantidadVotosBlanco(){
        
    }

    public int cantidadVotoPartido(String nombrePartido){      // HAY QUE ARMAR UN REGEX QUE LEA SI SE ENCUENTRA EL NOMBRE DEL PARTIDO EN UN RENGLON, SE SUMA i
        //TODO: hay que armar un regex aca
        i++;
        return i;
    }


}
