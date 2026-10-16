public class arrays {

    public static void main(String[] args) {

        int[] numeros = new int[6];

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        numeros[5] = 60;

        numeros[0] = 15;

        System.out.println("Tamaño del arreglo: " + numeros.length);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número en la posición " + i + ": " + numeros[i]);
        }
    }
}
