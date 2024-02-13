public class vehiculo {
    static int vehiculosCreados = 0;
    static int kilometrosTotales = 0;
    int kilometrosRecorridos;

    public vehiculo() {
        this.kilometrosRecorridos = 0;
        vehiculo.vehiculosCreados++;
    }

    public void and(int distancia) {
        this.kilometrosRecorridos += distancia;
        vehiculo.kilometrosTotales += distancia;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }
}