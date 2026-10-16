import java.util.Scanner; // para leer lo que escribe el usuario

public class Ejercicio7 { // clase principal
    public static void main(String[] args) { // aqui empieza el programa
        Scanner scanner = new Scanner(System.in); // crea el scanner

        System.out.print("introduce un anio cualquiera (ej. 2024): "); // pide un año
        int n = scanner.nextInt(); // guarda el año en n

        boolean bandera = false; // variable para guardar el resultado

        // revisa si el año es bisiesto
        if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
            bandera = true; // cambia el valor a verdadero
        }

        // muestra el resultado
        if (bandera) {
            System.out.println("el anio " + n + " tiene la propiedad: tipo_a");
        } else {
            System.out.println("el anio " + n + " tiene la propiedad: tipo_b");
        }

        scanner.close(); // cierra el scanner
    }
}

/*
Este programa pide un año.

Despues revisa si es bisiesto o no.

Si cumple la condicion muestra tipo_a.
Si no la cumple muestra tipo_b.

Por ejemplo, 2024 es tipo_a.
*/