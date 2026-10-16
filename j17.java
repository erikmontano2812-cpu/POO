public class j17 {
    public static void main(String[] args) {

        // Inicialización directa con valores
        double[] temperaturas = {22.5, 24.0, 21.8, 23.4};
        double total = 0;

        /*
         * Cómo recorrer un arreglo inicializado directamente para
         * calcular un total y un promedio
         */

        System.out.println("--- Registro de temperaturas ---");

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Día " + i + ": " + temperaturas[i] + "°C");
            total += temperaturas[i];
        }

        double promedio = total / temperaturas.length;
        System.out.println("Suma de temperaturas: " + total);
        System.out.println("Promedio de temperatura: " + promedio);



        double[] horasEstudio = {2.5, 3.0, 1.5, 4.0, 2.0, 3.5, 2.8};
        double totalHoras = 0;

        System.out.println("--- Horas de estudio ---");

        for (int i = 0; i < horasEstudio.length; i++) {
            System.out.println("Día " + i + ": " + horasEstudio[i] + " horas");
            totalHoras += horasEstudio[i];
        }

        double promedioHoras = totalHoras / horasEstudio.length;

        System.out.println("Total de horas: " + totalHoras);
        System.out.println("Promedio diario: " + promedioHoras);

    }
}