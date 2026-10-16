import java.util.Scanner; // para leer lo que escribe el usuario

public class Ejercicio8 { // clase principal
    public static void main(String[] args) { // aqui empieza el programa
        Scanner input = new Scanner(System.in); // crea el scanner

        System.out.print("ingresa una cantidad grande de segundos (ej. 5000): "); // pide los segundos
        int total = input.nextInt(); // guarda el numero en total

        int r1 = total / 3600; // saca las horas
        int residuo = total % 3600; // obtiene lo que sobra
        int r2 = residuo / 60; // saca los minutos
        int r3 = residuo % 60; // saca los segundos que faltan

        System.out.println("conversion final: " + r1 + "h : " + r2 + "m : " + r3 + "s"); // muestra el resultado

        input.close(); // cierra el scanner
    }
}

/*
Este programa convierte una cantidad de segundos
a horas, minutos y segundos.

Por ejemplo, si escribes 5000,
el resultado sera:

1h : 23m : 20s
*/
