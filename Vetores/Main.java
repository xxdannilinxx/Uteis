public class Main {
    public static double medias = 0;

    public static void main(String[] args) {
        int A[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int B[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 20, 25, 30, 35 };
        int C[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 20, 25, 30, 35, 45, 55, 65, 75, 85 };

        System.out.println("\n ------------------------------------------- \n");
        System.out.println("VETOR A \n");
        Main.lerVetor(A);
        Main.mediaVetor(A);
        System.out.println("\n ------------------------------------------- \n");
        System.out.println("VETOR B \n");
        Main.lerVetor(B);
        Main.mediaVetor(B);
        System.out.println("\n ------------------------------------------- \n");
        System.out.println("VETOR C \n");
        Main.lerVetor(C);
        Main.mediaVetor(C);
        System.out.println("\n ------------------------------------------- \n");
        System.out.println("SOMA DAS MÉDIAS \n");
        System.out.println(Main.medias);
    }

    public static void lerVetor(int... vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("[" + i + "] => " + vetor[i]);
        }
    }

    public static void mediaVetor(int... vetor) {
        int total = 0;
        int vetores = 0;
        for (int i = 0; i < vetor.length; i++) {
            total += vetor[i];
            vetores++;
        }
        double media = (total / vetores);
        Main.medias += media;
        System.out.println(
                vetores + " vetores encontrados, somando ao total " + total + ". (Média dos valores: " + media + ")");
    }
}