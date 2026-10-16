import java.util.ArrayList;
public class j20 {
    public static void main(String[] args) {

        // 1. CREAR el ArrayList
        // Usamos Integer (Objeto) porque ArrayList solo guarda objetos.
        ArrayList<String> videojuegos = new ArrayList<>();

        System.out.println("=== 1. MÉTODO .add() ===");
        // .add(objeto) agrega el objeto al final de la lista.
        videojuegos.add("Minecraft");   // Posición 0
        videojuegos.add("Fortnite");    // Posición 1
        videojuegos.add("Rocket League");  // Posición 2

        // También puedes usar .add(índice, objeto) para INSERTAR en una posición específica:
        videojuegos.add(1, "Brawl Stars"); // Inserta en posición 1 y empuja el resto hacia abajo

        System.out.println("Lista actual: " + videojuegos);
        // Resultado: [Minecraft, Brawl Stars, Fortnite, Rocket League]


        System.out.println("\n=== 2. MÉTODO .get() ===");
        // .get(índice) OBTIENE y lee el objeto en esa posición sin modificar la lista.
        String primerVideojuego = videojuegos.get(0);
        String segundoVideojuego = videojuegos.get(1);

        System.out.println("Objeto en la posición 0: " + primerVideojuego);
        System.out.println("Objeto en la posición 1: " + segundoVideojuego);


        System.out.println("\n=== 3. MÉTODO .set() ===");
        // .set(índice, nuevoObjeto) REEMPLAZA el objeto que estaba en esa posición por uno nuevo.
        // Vamos a cambiar "Brawl Stars" (índice 1) por "Valorant":
        videojuegos.set(1, "Valorant");

        System.out.println("Lista tras modificar la posición 1: " + videojuegos);
        // Resultado: [Minecraft, Valorant, Fortnite, Rocket League]


        System.out.println("\n=== 4. MÉTODO .remove() ===");
        // Tiene dos variantes principales para ELIMINAR objetos:

        // Opción A: Eliminar por ÍNDICE (.remove(int))
        // Eliminamos "Minecraft" (posición 0). 
        // Los objetos restantes se reacomodan (se "recorren" a la izquierda).
        videojuegos.remove(0);
        System.out.println("Después de eliminar la posición 0: " + videojuegos);

        // Opción B: Eliminar por el OBJETO directamente (.remove(Object))
        // Busca el objeto exacto en la lista y lo borra.
        videojuegos.remove("Rocket League");
        System.out.println("Después de eliminar 'Rocket League': " + videojuegos);


        System.out.println("\n=== ESTADO FINAL ===");
        System.out.println("Total de objetos restantes (.size()): " + videojuegos.size());
        System.out.println("Contenido final: " + videojuegos);
    }
}