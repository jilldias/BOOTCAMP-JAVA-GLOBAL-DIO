import java.util.Scanner;

public class Imc {
    public static void main (String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your weight in kg: ");
            double weight = scanner.nextDouble();
            System.out.print("Enter your height in meters: ");
            double height = scanner.nextDouble();

            double imc = weight / height * height;

            if (imc <= 18.5){
                System.out.println("Underweight.");
            } else if(imc >= 18.6 && imc <= 24.9){
                System.out.println("Ideal weight.");
            } else if(imc >= 25.0 && imc <= 29.9){
                System.out.println("Overweight");
            } else if(imc > 30.0 && imc <= 34.9){
                System.out.println("Obesity");
            } else if(imc > 35.0 && imc <= 39.9){
                System.out.println("Severe obesity");
            } else {
                System.out.println("Morbid obesity");
            }
        }
    }
}
