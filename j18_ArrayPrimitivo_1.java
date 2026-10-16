public class j18_ArrayPrimitivo_1 {
    public static void main(String[] args) {
        // Crear un arreglo de materias
        String[] materias = {"Matemáticas", "Física", "Programación"};

        System.out.println("Lista inicial:");
        for (String materia : materias) {
            System.out.println(materia);
        }

        System.out.println("Total de materias: " + materias.length);

        // Reemplazar una materia
        materias[1] = "Química";

        System.out.println("\nLista después del cambio:");
        for (String materia : materias) {
            System.out.println(materia);
        }

        // Buscar una materia
        boolean existe = false;
        for (String materia : materias) {
            if (materia.equals("Programación")) {
                existe = true;
                break;
            }
        }

        System.out.println("¿Existe Programación?: " + existe);
        System.out.println("Elemento en posición 0: " + materias[0]);
    }
}
