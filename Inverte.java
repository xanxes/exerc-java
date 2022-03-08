import java.util.Scanner;

class Inverte {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

         System.out.println("\nInforme o primeiro número: ");
         System.out.println("\nInforme o segundo número: ");
         int z = 0;

         int variavel1 = ler.nextInt();
         int variavel2 = ler.nextInt();

         z = variavel1;
		 variavel1 = variavel2;
		 variavel2 = z;
        
        System.out.println("O valor da Variavel 1 é:" +variavel1 + "\nO valor da Variavel2 é:" +variavel2);

    }
    
}