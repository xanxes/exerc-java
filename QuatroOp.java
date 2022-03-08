import java.util.Scanner;

class QuatroOp {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

         System.out.println("\nInforme o primeiro número: ");
         System.out.println("\nInforme o segundo número: ");

         int numero1 = ler.nextInt();
         int numero2 = ler.nextInt();

        double resultado1 = numero1 * numero2;
		double resultado2 = numero1 / numero2;
		double resultado3 = numero1 + numero2;
		double resultado4 = numero1 - numero2;
        
        System.out.println(" Soma igual: " + resultado3 + " \nSubtração igual: " + resultado4 + " \nMultiplicação igual: " + resultado1 + " \nDvisão igual: " + resultado2);

    }
    
}