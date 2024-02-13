public class profesor extends persona{
    String ndespacho;
    public profesor(){
        super("","","");
    }

    public profesor(String nombre, String apellidos, String nif, String ndespacho) {
        super(nombre, apellidos, nif);
        this.ndespacho = ndespacho;
    }

    @Override
    public String toString() {
        return "profesor [ndespacho=" + ndespacho + "]";
    }

}
