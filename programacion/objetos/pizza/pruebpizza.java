import lib.pizza;
public class pruebpizza {
    public static void main(String[] args) {
        pizza p1 = new pizza("margarita", "mediana");
        pizza p2 = new pizza("funghi", "familiar");
        p2.sirve();
        pizza p3 = new pizza("cuatro quesos", "mediana");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p2.sirve();

        System.out.println("pedidas: " + pizza.getTotalPedidas());
        System.out.println("servidas: " + pizza.getTotalServidas());
    }
}
