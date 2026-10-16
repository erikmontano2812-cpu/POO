import java.util.Scanner;

public class menurestaurante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== MENÚ ===");
        System.out.println("1. Hamburguesa");
        System.out.println("2. Pizza");
        System.out.println("3. Tacos");
        System.out.print("Selecciona una opción: ");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Elegiste Hamburguesa - $80");
                break;
            case 2:
                System.out.println("Elegiste Pizza - $120");
                break;
            case 3:
                System.out.println("Elegiste Tacos - $60");
                break;
            default:
                System.out.println("Opción no válida.");
        }

        sc.close();
    }
}
