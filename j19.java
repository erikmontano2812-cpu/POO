import java.util.ArrayList;

public class j19 {
    public static void main(String[] args) {
        // Usamos la clase wrapper Integer en lugar de int
        ArrayList<Integer> calificaciones = new ArrayList<>();

        calificaciones.add(95);
        calificaciones.add(68);
        calificaciones.add(80);
        calificaciones.add(55);

        System.out.println("--- Registro de calificaciones ---");
        // Recorrido sencillo usando for-each
        for (Integer calificacion : calificaciones) {
            if (calificacion >= 70) {
                System.out.println("Calificación " + calificacion + ": Aprobado");
            } else {
                System.out.println("Calificación " + calificacion + ": Reprobado");
            }
        }
    }
}