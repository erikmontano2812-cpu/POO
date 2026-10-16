public class Ciclofor2 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                System.out.println("Se encontró el asiento 5.");
                System.out.println("Se omitirá este asiento con continue.");
                continue;
            }

            System.out.println("Asiento: " + i);
        }

        System.out.println("Fin del programa.");
        System.out.println("----------------------");

        for (int j = 1; j <= 12; j++) {

            if (j == 7) {
                System.out.println("Se encontró el mes 7.");
                System.out.println("Se omitirá este mes con continue.");
                continue;
            }

            System.out.println("Mes: " + j);
        }
    }
}