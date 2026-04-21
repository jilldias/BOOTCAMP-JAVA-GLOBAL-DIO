import java.util.Scanner;

public class TesteScanner {
    public static void main (String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("N1:");
            int n1 = scanner.nextInt();
            System.out.println("N2:");
            int n2 = scanner.nextInt();
            int soma = n1 + n2;
            System.out.printf("Soma: %d\n", soma);
        }
    }
}