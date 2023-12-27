import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de linhas: ");
        int m = sc.nextInt();
        System.out.print("Número de colunas: ");
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Número selecionado: ");
        int selNum = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == selNum) {
                    System.out.print("Esquerda: ");
                    if (j - 1 >= 0) {
                        System.out.print(mat[i][j - 1] + " ");
                    } else {
                        System.out.print("N/A");
                    }
                    System.out.println();
                    System.out.print("Acima: ");
                    if (i - 1 >= 0) {
                        System.out.print(mat[i - 1][j] + " ");
                    } else {
                        System.out.print("N/A ");
                    }
                    System.out.println();
                    System.out.print("Direita: ");
                    if (j + 1 < n) {
                        System.out.print(mat[i][j + 1] + " ");
                    } else {
                        System.out.print("N/A ");
                    }
                    System.out.println();
                    System.out.print("Abaixo: ");
                    if (i + 1 < m) {
                        System.out.print(mat[i + 1][j] + " ");
                    } else {
                        System.out.print("N/A ");
                    }
                }
            }
        }


        sc.close();
    }
}
