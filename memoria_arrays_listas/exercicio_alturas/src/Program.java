import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        double somaAltura = 0.0;
        int somaMenores = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:%n", i+1);
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();

            somaAltura += alturas[i];
            if (idades[i] < 16){
                somaMenores++;
            }
        }

        System.out.printf("%nAltura média: %.2f%n", somaAltura / n);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", ((double)somaMenores / n) * 100);

        for (int i = 0; i < n; i++) {
            if(idades[i] < 16){
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
