public class Exercicio1 {
    public static int metodo(int[] a, int x) {
        if(a == null) {
            return -1;
        }
        int z = 0;
        for(int i=0; i < a.length; i++) {
            if(a[i] == x) {
                z++;
            }   
        }
        return z;
    }
    public static void main(String[] args) throws Exception {
        int[] array = {4, 5, 10};
        int num = 2;
        int resultado = metodo(array, num);
        System.out.println(resultado);
    }
}
