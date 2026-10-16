public class foreach {
    public static void main(String[] args) {

        String[] frutas = {"Manzana", "Pera", "Mango", "Uva", "Sandía"};

        System.out.println("Con For Each");
        System.out.println("----------------------------");

        for (String fruta : frutas) {
            System.out.println("Me gusta la " + fruta);
        }

        System.out.println("----------------------------");
        System.out.println("Con For tradicional");

        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Me gusta la " + frutas[i]);
        }

        System.out.println("----------------------------");
        System.out.println("Fin del programa.");
        System.out.println("----------------------------");

    }
}