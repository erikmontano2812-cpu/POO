public class arraydouble {

    public static void main(String[] args) {

        double[] temperaturas = new double[6];

        temperaturas[0] = 22;
        temperaturas[1] = 25;
        temperaturas[2] = 19;
        temperaturas[3] = 28;
        temperaturas[4] = 24;
        temperaturas[5] = 21;

        temperaturas[0] = 23;

        System.out.println("Tamaño del arreglo: " + temperaturas.length);
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Temperatura en la posición " + i + ": " + temperaturas[i]);
        }
    }
}