public class Exerc5 {
    public static int[] somaDeArray(int[] array1, int[] array2) {
        int[] resultadoArray = new int[array1.length];
        int somaDoArray = 0;

        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                int somaNum = array1[i] + array2[2];
                resultadoArray[i] = somaNum;
                somaDoArray = somaDoArray + somaNum;
                System.out.println("Soma do Array: " + somaDoArray);
                return resultadoArray;
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 40, 20, 25};
        int[] arr2 = {24, 3, 2};

        int[] resultado = somaDeArray(arr1, arr2);
        System.out.println(resultado);
    }
}
