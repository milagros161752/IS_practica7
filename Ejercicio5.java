package unavarra.is.practica7.pistas;

public final class Ejercicio5 {

    private Ejercicio5() {
        // Constructor privado para evitar instancias
    }

    public static boolean isEligibleForDiscount(int age, boolean isMember) {
        return age < 18 || age > 65 || isMember;
    }

    public static void main(String[] args) {
        System.out.println(isEligibleForDiscount(70, false));
        System.out.println(isEligibleForDiscount(30, true));
    }
}
