package unavarra.is.practica7.pistas;

public final class Ejercicio3 {

    private Ejercicio3() {
        // Constructor privado para evitar instancias
    }

    public static String getMessageForScore(int score) {
        if (score < 50) {
            return Message.FAILURE.toString();
        }
        if (score < 75) {
            return Message.PASS.toString();
        }
        if (score < 90) {
            return Message.MERIT.toString();
        }
        return Message.DISTINCTION.toString();
    }

    enum Message {
        FAILURE, PASS, MERIT, DISTINCTION
    }

    public static void main(String[] args) {
        System.out.println(getMessageForScore(45));
        System.out.println(getMessageForScore(80));
    }
}
