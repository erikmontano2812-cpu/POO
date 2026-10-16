import java.util.ArrayList;

public class j18 {
    public static void main(String[] args) {
        // Crear una lista dinámica de cadenas (String)
        ArrayList<String> materias = new ArrayList<>();

        /* Los elementos se añaden dinámicamente sin definir un 
        límite previo. */
        // 1. Agregar elementos (se van acumulando en orden)
        materias.add("Matemáticas");
        materias.add("Historia");
        materias.add("Programación");

        System.out.println("Lista inicial: " + materias);
        System.out.println("Total de materias (size): " + materias.size());

        // 2. Eliminar un elemento por índice o por valor
        materias.remove("Historia"); // Remueve "Historia"

        // 3. Consultar y verificar
        System.out.println("\nLista después de eliminar: " + materias);
        System.out.println("¿Hay Matemáticas?: " + materias.contains("Matemáticas"));
        System.out.println("Elemento en posición 0: " + materias.get(0));
    }
}