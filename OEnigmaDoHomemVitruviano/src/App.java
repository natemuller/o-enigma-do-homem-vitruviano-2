import java.util.Scanner;

public class App {

    public static int treino1 (int n) {
        int r = 0;
        for (int i = 1; i < n; i++) {
            r += 1;
        }
            return r;
    }

    public static int treino2 (int n) {
        int r = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                r += 2;
            }
        }
        return r;
    }

    public static int treino3 (int n) {
        int cont = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d\n", i * j);
                cont++;
            }    
        }
        return cont;
    }

    public static int treino4 (int n) {
        int r = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i; j < 2 * i; j++) {
                for (int k = i; k < j; k++) {
                    r += 1;
                }
            }
        }
        return r;
    }
    public static void main(String[] args) {

        System.out.printf("De N:\n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.printf("\nTreino 1: \n%d\n", treino1(n));
        System.out.printf("\nTreino 2: \n%d\n", treino2(n));
        System.out.printf("\nTreino 3: \n%d\n", treino3(n));
        System.out.printf("\nTreino 4: \n%d\n", treino4(n));
    }
}
