import java.util.Scanner; // para leer lo que escribe el usuario

public class Ejercicio3 { // clase principal
    public static void main(String[] args) { // aqui inicia el programa
        Scanner sc = new Scanner(System.in); // crea el scanner

        System.out.print("escribe una palabra o texto corto: "); // pide un texto
        String texto = sc.nextLine(); // guarda el texto

        String resultado = ""; // aqui se guardara el texto al reves

        // recorre el texto desde el final
        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado += texto.charAt(i); // agrega cada letra al reves
        }

        System.out.println("texto transformado: " + resultado); // muestra el resultado
        sc.close(); // cierra el scanner
    }
}

/*
Este programa pide una palabra o frase corta.

Despues acomoda las letras al reves y muestra el resultado.

Ejemplo:
Si escribes "hola"
el programa muestra "aloh".
*/