public class Main {
    public static void main(String[] args) {
        int fibonacci[] = new int[20];

        /**
         * 20 primeiras posições da sequência de fibonacci
         */
        for (int i = 0; i < fibonacci.length; i++) {
            fibonacci[i] = (i > 1 ? (fibonacci[i - 1] + fibonacci[i - 2]) : 1);
            System.out.println("fibonacci[" + i + "] = " + fibonacci[i]);
        }
    }
}