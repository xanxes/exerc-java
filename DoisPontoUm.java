import java.util.Scanner;

class DoisPontoUm {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

         System.out.println("\nInforme o primeiro número: ");
         System.out.println("\nInforme o segundo número: ");

         int num1 = ler.nextInt();
         int num2 = ler.nextInt();

         double pot1 = Math.pow(num1, 5);
         double pot2 = Math.pow(num2, 5);
        
        System.out.println(" Potencia 1 " + pot1 + " \nPotencia 2 " + pot2);

    }
    
}