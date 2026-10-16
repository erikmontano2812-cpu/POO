import java.util.Scanner; // para leer lo que escribe el usuario
import java.util.Scanner; // para leer lo que escribe el usuario

public class Ejercicio9 { // clase principal
    public static void main(String[] args) { // aqui empieza el programa
        Scanner s = new Scanner(System.in); // crea el scanner

        System.out.print("piensa en un numero limite maximo: "); // pide el limite
        int limite = s.nextInt(); // guarda el numero ingresado

        System.out.println("generando 5 numeros especiales bajo el limite..."); // mensaje inicial
        // genera 5 numeros
        for (int i = 0; i < 5; i++) {
            int resultado = (int) (Math.random() * limite) + 1; // genera un numero aleatorio entre 1 y el limite
            System.out.println("numero [" + (i + 1) + "]: " + resultado); // muestra el numero generado
        }

        s.close(); // cierra el scanner
    }
}

/*
Este programa pide un numero limite.

Despues genera 5 numeros aleatorios
entre 1 y el limite que escribio el usuario.

Por ejemplo, si escribes 10,
los numeros generados seran entre 1 y 10.
*/