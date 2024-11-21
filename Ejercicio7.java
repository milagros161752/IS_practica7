package unavarra.is.practica7.pistas;

public final class Ejercicio7 {

    private Ejercicio7() {
        // Constructor privado para evitar instancias
    }

    static class Paciente {
        private final String name;       // Campo declarado final
        private final int birthYear;     // Campo declarado final
        private final double weight;     // Campo declarado final
        private final double height;     // Campo declarado final

        public Paciente(String name, int birthYear, double weight, double height) {
            this.name = name;
            this.birthYear = birthYear;
            this.weight = weight;
            this.height = height;
        }

        private int calculateAge() {
            return 2024 - birthYear;
        }

        private double calculateBMI() {
            return weight / (height * height);
        }

        public boolean hasCardiovascularRisk() {
            return calculateBMI() > 30 || calculateAge() > 50;
        }
    }

    public static void printCardiovascularRisk(Paciente[] patients) {
        for (Paciente patient : patients) {
            System.out.println(patient.name + ": " + (patient.hasCardiovascularRisk() ? "At risk" : "No risk"));
        }
    }

    public static void main(String[] args) {
        Paciente[] patients = {
            new Paciente("John", 1970, 80, 1.75),
            new Paciente("Jane", 1985, 60, 1.65)
        };
        printCardiovascularRisk(patients);
    }
}
