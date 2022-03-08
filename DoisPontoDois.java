import java.util.Scanner;

class DoisPontoDois {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

         System.out.println("\nInforme o primeiro número: ");
         System.out.println("\nInforme o segundo número: ");

         int num1 = ler.nextInt();
         int num2 = ler.nextInt();

         int div = (num1/num2);

        System.out.println(" Divisão: " + div);

    }
    
}