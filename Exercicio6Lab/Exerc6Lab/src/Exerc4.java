public class Exerc4 {
    public static boolean procuraNome(String[] array, String nome) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(nome)) {
                System.out.println("Nome localizado na posição " + i);
                return true; 
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] nomes = {"Ana", "Pedro", "Maria", "João", "Carlos"};
        String nomeProcurado = "Maria";

        boolean encontrado = procuraNome(nomes, nomeProcurado);
        if (!encontrado) {
            System.out.println("Nome não encontrado no array.");
        }
    }
}
