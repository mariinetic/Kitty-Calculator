import java.util.Scanner;

public class HelloKittyCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("🐱 Olá! Eu sou a Hello Kitty, sua assistente de cálculos. 🐱");
        System.out.println("Vamos fazer alguns cálculos fofos! 😺");

        System.out.print("Por favor, insira o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Por favor, insira o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Escolha a operação (+ para soma, - para subtração): ");
        char operation = scanner.next().charAt(0);

        double result = 0;

        if (operation == '+') {
            result = num1 + num2;
            System.out.println("🎀 O resultado da soma é: " + result + " 🎀");
        } else if (operation == '-') {
            result = num1 - num2;
            System.out.println("🎀 O resultado da subtração é: " + result + " 🎀");
        } else {
            System.out.println("❌ Operação inválida! Tente novamente. ❌");
        }
      
        System.out.println("Obrigada por usar a calculadora da Hello Kitty! 😻");
        
        scanner.close();
    }
}
