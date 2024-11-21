package unavarra.is.practica7.pistas;

public final class Ejercicio4 {

    private Ejercicio4() {
        // Constructor privado para evitar instancias
    }

    public static String getDayOfWeek(int index) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return (index >= 0 && index < days.length) ? days[index] : "Invalid day";
    }

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(0));
        System.out.println(getDayOfWeek(6));
    }
}
