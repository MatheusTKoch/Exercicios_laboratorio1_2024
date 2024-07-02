public class Teste {
    public class Animal {
        public String emitirSom() {
            return "Teste animal";
        }
    }
    public class Gato extends Animal {
        public String emitirSom() {
            return "teste gato";
        }

        public String arranhar() {
            return "arranha";
        }
    }

    public class Cachorro extends Animal {
        public String emitirSom() {
            return "Au";
        }
    }

    public static void main(String[] args) {
        double a = 19/2;
        int c = 7;
        int b = (int) (c + a * 2);
        b++;
        System.out.println(a);
        System.out.println(b);
        System.out.println((double) c/2);
    }
}
