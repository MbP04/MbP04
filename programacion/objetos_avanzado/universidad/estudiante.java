public class estudiante extends persona{
    int iDestudiante;
    
    public estudiante(String nombre, String apellidos, String nif,int iDestudiante){
        super(nombre, apellidos, nif, direccion);
        this.iDestudiante = iDestudiante;
    }
    public int getiDestudiante() {
        return iDestudiante;
    }
    public void setiDestudiante(int iDestudiante) {
        this.iDestudiante = iDestudiante;
    }
    @Override
    public String toString() {
        return "estudiante [iDestudiante=" + iDestudiante + "]";
    }
}
