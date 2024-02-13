public class persona{
    String nombre;
    String apellidos;
    String direccion;
    int nif;
    
    public persona (String nombre, String apellidos, int nif, String direccion){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
    }

    public persona(String nombre, String apellidos, String nif, String direccion) {
        this(nombre, apellidos, nif, direccion);
        this.direccion = direccion;
    }
}
