import java.util.Scanner;

class DoisPontoQuatro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

         System.out.println("\nInforme o primeiro número: ");
         System.out.println("\nInforme o segundo número: ");

         int num1 = ler.nextInt();
         int num2 = ler.nextInt();

         double raiz1 = Math.sqrt(num1);
         double raiz2 = Math.sqrt(num2);

        System.out.println("A primeira raiz é:" +raiz1 + "\nA segunda raiz é:" +raiz2);

    }
    
}