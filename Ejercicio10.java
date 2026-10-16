import java.util.Scanner; // para leer lo que escribe el usuario

public class Ejercicio10 { // clase principal
    public static void main(String[] args) { // aqui empieza el programa
        Scanner sc = new Scanner(System.in); // crea el scanner

        System.out.print("introduce un valor numerico de temperatura: "); // pide una temperatura
        double temp = sc.nextDouble(); // guarda la temperatura

        System.out.println("selecciona una opcion (1 o 2):"); // muestra las opciones
        System.out.println("1. transformacion tipo x"); // primera opcion
        System.out.println("2. transformacion tipo y"); // segunda opcion
        int opcion = sc.nextInt(); // guarda la opcion

        double resultado = 0; // variable para el resultado

        // revisa la opcion que eligio el usuario
        switch (opcion) {
            case 1:
                resultado = (temp * 9 / 5) + 32; // realiza la conversion
                System.out.println("resultado de la transformacion: " + resultado + " unidades_f");
                break;
            case 2:
                resultado = (temp - 32) * 5 / 9; // realiza la conversion
                System.out.println("resultado de la transformacion: " + resultado + " unidades_c");
                break;
            default:
                System.out.println("error: opcion no registrada en el sistema."); // muestra un mensaje de error
        }

        sc.close(); // cierra el scanner
    }
}

/*
Este programa pide una temperatura
y despues una opcion.

Dependiendo de la opcion que se elija,
realiza una conversion.

Al final muestra el resultado obtenido.
*/
