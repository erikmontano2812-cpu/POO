public class Ciclofor {

    public static void main(String[] args) {

        for (int i = 10; i <= 20; i++) {
            System.out.println("Edad: " + i);

            if (i == 17) {
                System.out.println("Se encontró la edad 17.");
                System.out.println("El ciclo se detendrá con break.");
                break;
            }
        }

        System.out.println("Fin del programa.");
        System.out.println("----------------------");

        for (int j = 1; j <= 12; j++) {
            System.out.println("Mes número: " + j);

            if (j == 4) {
                System.out.println("Se encontró el mes 4.");
                System.out.println("El ciclo se detendrá con break.");
                break;
            }
        }
    }
}