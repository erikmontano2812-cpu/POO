import java.util.Scanner; // para leer lo que escribe el usuario

public class Ejercicio6 { // clase principal
    public static void main(String[] args) { // aqui empieza el programa
        Scanner sc = new Scanner(System.in); // crea el scanner

        System.out.println("escribe una frase o un enunciado completo:"); // pide una frase
        String entrada = sc.nextLine().trim(); // guarda lo que escribio

        if (entrada.isEmpty()) { // revisa si no escribio nada
            System.out.println("resultado numerico: 0"); // muestra 0
        } else {
            String[] bloques = entrada.split("\\s+"); // separa las palabras
            System.out.println("resultado numerico: " + bloques.length); // muestra cuantas palabras hay
        }

        sc.close(); // cierra el scanner
    }
}

/*
Este programa cuenta cuantas palabras tiene
una frase.

Si el usuario no escribe nada,
el resultado sera 0.

Por ejemplo:

hola mundo java

Tiene 3 palabras, por lo que muestra 3.
*/
