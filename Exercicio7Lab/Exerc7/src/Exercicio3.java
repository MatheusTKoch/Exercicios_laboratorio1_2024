public class Exercicio3 {
    public static void main(String[] args) {
        int[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int i=0; i<valores.length; i++) {
            if(i % 2 == 0) {
                System.out.print(valores[i++]+" ");
            } else {
                System.out.print(valores[i--]+" ");
            }
        }
    }
}
