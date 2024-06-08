public class Exercicio4 {
    public int metodo(int[] array) {
        int x = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[i] > array[x]) {
                x = i;
            }
        }
        return x;
    }
}
