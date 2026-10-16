public class dowhile {

    public static void main(String[] args) {

        System.out.println("----------------------");
        System.out.println("Mostrará las edades del 15 al 19.");
        System.out.println("----------------------");

        int edad = 15;

        do {
            System.out.println("Edad: " + edad);
            edad++;
        } while (edad <= 19);

        System.out.println("Proceso terminado.");
        System.out.println("----------------------");
    }
}