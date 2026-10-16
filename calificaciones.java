import java.util.Scanner;

public class calificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu calificación: ");
        int cal = sc.nextInt();

        if (cal >= 90) {
            System.out.println("Excelente");
        } else if (cal >= 80) {
            System.out.println("Muy bien");
        } else if (cal >= 70) {
            System.out.println("Regular");
        } else {
            System.out.println("Reprobado");
        }

        sc.close();
    }
}