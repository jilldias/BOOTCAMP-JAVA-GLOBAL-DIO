import java.util.Scanner;

public class TesteScanner {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("N1:");
        int n1 = scanner.nextInt();//Toma o próximo inteiro da entrada do usuário.
        System.out.println("N2:");
        int n2 = scanner.nextInt();
        int soma = n1 + n2;
        System.out.printf("Soma: %d\n", soma);
    }
}