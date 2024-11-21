package unavarra.is.practica7.pistas;

public final class Ejercicio2 {

    private Ejercicio2() {
        // Constructor privado para evitar instancias
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(4));
        System.out.println(isEven(7));
    }
}
