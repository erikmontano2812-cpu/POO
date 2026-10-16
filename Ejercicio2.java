import java.util.Scanner; // para leer lo que escribe el usuario

public class Ejercicio2 { // clase principal
    public static void main(String[] args) { // aqui empieza el programa
        Scanner scanner = new Scanner(System.in); // crea el scanner

        System.out.print("Introduce un numero entero positivo: "); // pide un numero
        int x = scanner.nextInt(); // guarda el numero

        int y = 0; // aqui se va a guardar la suma

        // mientras x sea mayor que 0
        while (x > 0) {
            y += x; // suma x a y
            x--;    // resta 1 a x
        }

        System.out.println("El valor final calculado es: " + y); // muestra el resultado
        scanner.close(); // cierra el scanner
    }
}

/*
Este programa pide un numero entero positivo.

Despues suma todos los numeros desde ese numero hasta 1.

Por ejemplo:
Si escribes 5, hace la suma:
5 + 4 + 3 + 2 + 1

Y al final muestra el resultado.
*/