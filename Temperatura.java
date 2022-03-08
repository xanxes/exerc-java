import java.util.Scanner;

class Temperatura {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\nInforme a temperatura em celsius:  ");

        double celsius = ler.nextInt();

        double conversao = (9 * celsius) + 160;
		double valorfinal = conversao / 5;
        
        System.out.println("A temperatura em Fahrenheit é: " + valorfinal);

    }
    
}