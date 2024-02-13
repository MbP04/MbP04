import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<persona> listaPersonas = new ArrayList<>();

        direccion direccion1 = new direccion("Calle 1", "Ciudad 1", "12345", "Pais 1");
        estudiante estudiante1 = new estudiante("Estudiante1", "Apellido1", "12345678A", 1);
        //estudiante1.setdireccion(direccion1);

        profesor profesor1 = new profesor("Profesor1", "Apellido2", "87654321B", "Despacho123");

        listaPersonas.add(estudiante1);
        listaPersonas.add(profesor1);

        // Realizar operaciones con la lista de personas, por ejemplo, imprimir información
        for (persona persona : listaPersonas) {
            System.out.println(persona.toString());
        }
    }
}