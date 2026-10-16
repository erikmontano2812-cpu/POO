import java.util.Scanner; // para leer lo que escribe el usuario

public class Ejercicio4 { // clase principal
    public static void main(String[] args) { // aqui comienza el programa
        Scanner scanner = new Scanner(System.in); // crea el scanner

        System.out.print("escribe una frase o palabra en minusculas: "); // pide una palabra o frase
        String texto = scanner.nextLine().toLowerCase(); // guarda el texto

        int contador = 0; // contador de vocales

        // recorre todo el texto
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i); // obtiene una letra

            // revisa si la letra es una vocal
            switch (letra) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contador++; // suma una vocal encontrada
                    break;
            }
        }

        System.out.println("el total de vocales encontradas es: " + contador); // muestra cuantas vocales hay
        scanner.close(); // cierra el scanner
    }
}

/*
Este programa pide una palabra o frase.

Luego revisa letra por letra para contar
cuantas vocales tiene.

Por ejemplo:
computadora

Tiene 5 vocales, por eso muestra 5.
*/