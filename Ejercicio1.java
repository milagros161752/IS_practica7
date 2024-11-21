package unavarra.is.practica7.pistas;

public final class Ejercicio1 {

    private Ejercicio1() {
        // Constructor privado para evitar instancias
    }

    public static Boolean startsWithAAndEndsWithS(String text) {
        return text.startsWith("A") && text.endsWith("S");
    }

    public static void main(String[] args) {
        System.out.println(startsWithAAndEndsWithS("HOLA"));
        System.out.println(startsWithAAndEndsWithS("ADIOS"));
    }
}
