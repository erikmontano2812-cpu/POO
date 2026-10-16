import java.util.Scanner; // para leer datos que escribe el usuario

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // se crea el scanner

        System.out.print("ingresa un numero entero: "); // pide el primer numero
        int a = s.nextInt(); // guarda el numero en a

        System.out.print("ingresa otro numero entero: "); // pide el segundo numero
        int b = s.nextInt(); // guarda el numero en b

        // se revisa el valor de a
        if (a >= 18) {
            // si a es mayor o igual a 18
            if (b >= 80) {
                System.out.println("resultado: status_a"); // cumple las 2 condiciones
            } else {
                System.out.println("resultado: status_b"); // solo cumple la primera
            }
        } else {
            System.out.println("resultado: status_c"); // a es menor que 18
        }

        s.close(); // cierra el scanner
    }
}

/*
Este programa pide dos numeros.

Si el primero es 18 o mas:
    - Si el segundo es 80 o mas muestra status_a.
    - Si el segundo es menor que 80 muestra status_b.

Si el primero es menor que 18 muestra status_c.
*/

