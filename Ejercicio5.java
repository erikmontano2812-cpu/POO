import java.util.Scanner; // para leer datos del usuario

public class Ejercicio5 { // clase principal
    public static void main(String[] args) { // inicio del programa
        Scanner s = new Scanner(System.in); // crea el scanner

        int claveSecreta = 7; // numero correcto
        int intento; // guarda lo que escribe el usuario

        System.out.println("bienvenido al sistema de verificacion!"); // mensaje de bienvenida

        // se repite hasta que adivine la clave
        do {
            System.out.print("introduce el codigo numerico de acceso (del 1 al 10): "); // pide el codigo
            intento = s.nextInt(); // guarda el numero

            if (intento != claveSecreta) { // si esta mal
                System.out.println("acceso denegado. intenta de nuevo."); // avisa que se equivoco
            }
        } while (intento != claveSecreta); // sigue mientras no acierte

        System.out.println("acceso concedido! codigo correcto."); // mensaje de exito
        s.close(); // cierra el scanner
    }
}

/*
Este programa funciona como una clave de acceso.

El usuario tiene que escribir un numero.

Si el numero no es 7, el programa vuelve
a pedirlo.

Cuando escribe 7, muestra un mensaje de
acceso concedido.
*/