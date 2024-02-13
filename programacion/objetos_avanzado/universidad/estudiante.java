public class estudiante extends persona{
    int iDestudiante;
    public estudiante(){
        super("", "","");
    }

    public estudiante(String nombre, String apellidos, String nif, int iDestudiante){
        super(nombre, apellidos, nif);
        this.iDestudiante = iDestudiante;
    }

    public estudiante(String nombre, direccion direccion, String apellidos, String nif,int iDestudiante){
        super(nombre, apellidos, nif, direccion);
        this.iDestudiante = iDestudiante;
    }


    @Override
    public String toString() {
        return "estudiante [iDestudiante=" + iDestudiante + "]";
    }
}
