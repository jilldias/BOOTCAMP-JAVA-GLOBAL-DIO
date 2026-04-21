import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número para ver a tabuada: ");
            int numero = scanner.nextInt(); 

            for (int i = 0; i <= 10; i++){
                int resultado = numero * i;
                System.out.printf("%d x %d = %d\n", numero, i, resultado);
            }
        }
    }
}
