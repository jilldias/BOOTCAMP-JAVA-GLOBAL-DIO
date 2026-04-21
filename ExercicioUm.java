import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        try (Scanner valoresScanner = new Scanner(System.in)) {
            System.out.println("Nome:");
            String nome = valoresScanner.nextLine();

            System.out.println("Idade:");
            int idade = valoresScanner.nextInt();
            System.out.printf("Olá %s, você tem %d anos.", nome, idade);
        }
    }
}
