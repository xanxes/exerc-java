import javax.swing.JOptionPane;

class Desconto {
    public static void main(String[] args) {
        JOptionPane jp = new JOptionPane();

        int produto1 = Integer.parseInt(jp.showInputDialog(null, "Informe o valor da compra "));
        int descontar = 50;
        
        int descontinho = produto1 * descontar /100;
        int valorfinal = produto1 - descontinho;

	      
    		jp.showMessageDialog(null, "O valor com desconto é:" +valorfinal );

    }
    
}
