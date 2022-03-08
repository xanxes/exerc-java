import java.util.Scanner;

class Dolar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

         System.out.println("\nInforme o valor em R$: ");
         Double dolarvalor = 5.11;

         double valor = ler.nextInt();

         double resultado1 = valor * dolarvalor;
        
        System.out.println("Com a cotação atual o valor em R$: " + resultado1);

    }
    
}