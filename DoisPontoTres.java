import java.util.Scanner;

class DoisPontoTres {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

         System.out.println("\nInforme o primeiro número: ");
         System.out.println("\nInforme o segundo número: ");

         int num1 = ler.nextInt();
         int num2 = ler.nextInt();

        double modulo = num1 / num2;
        double resto = num1 % num2;


        System.out.println(num1 + "/" + num2 + " = " + modulo + "\nO resto é: " + resto);

    }
    
}