import java.util.Scanner; // para leer lo que escribe el usuario

public class Ejercicio11 { // clase principal
    public static void main(String[] args) { // aqui empieza el programa
        Scanner sc = new Scanner(System.in); // crea el scanner

        System.out.print("ingresa la longitud del lado a: "); // pide el lado a
        double a = sc.nextDouble(); // guarda el valor

        System.out.print("ingresa la longitud del lado b: "); // pide el lado b
        double b = sc.nextDouble(); // guarda el valor

        System.out.print("ingresa la longitud del lado c: "); // pide el lado c
        double c = sc.nextDouble(); // guarda el valor

        // revisa si los lados forman un triangulo
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("resultado del analisis: estructura_valida"); // si es valido
        } else {
            System.out.println("resultado del analisis: estructura_invalida"); // si no es valido
        }

        sc.close(); // cierra el scanner
    }
}

/*
Este programa pide tres lados.

Despues revisa si pueden formar
un triangulo.

Si cumplen la condicion muestra
estructura_valida.

Si no la cumplen muestra
estructura_invalida.
*/
