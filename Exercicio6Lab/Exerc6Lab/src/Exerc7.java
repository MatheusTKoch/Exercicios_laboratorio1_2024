import java.util.Arrays;

public class Exerc7 {
    public static String geraArrayAleatoria() {
        int[] array = new int[(int)((Math.random()*100) + 1)];
        String[] arrString = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            int num = (int) ((Math.random() * 1000) + 1);
            array[i] = num;
            arrString[i] = Integer.toString(array[i]) + " - ";
        }
        return "Componentes gerados: " + Arrays.toString(arrString);
    }

    public static void main(String[] args) {
        String resultado = geraArrayAleatoria();
        System.out.println(resultado);
    }
}
