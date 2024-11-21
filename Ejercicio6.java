package unavarra.is.practica7.pistas;

public final class Ejercicio6 {

    private Ejercicio6 () {
        // Constructor privado para evitar instancias
    }

    final static class Dni {
        private static final String LETTERS = "TRWAGMYFPDXBNJZSQVHLCKE";

        private Dni() {
            // Constructor privado para evitar instancias
        }

        public static boolean validateControlLetter(String dni) {
            int number = Integer.parseInt(dni.substring(0, dni.length() - 1));
            char expectedLetter = LETTERS.charAt(number % 23);
            return dni.charAt(dni.length() - 1) == expectedLetter;
        }
    }

    public static void main(String[] args) {
        System.out.println(Dni.validateControlLetter("12345678Z"));
        System.out.println(Dni.validateControlLetter("87654321T"));
    }
}
