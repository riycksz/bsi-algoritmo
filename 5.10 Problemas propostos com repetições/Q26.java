package q26;

import javax.swing.JOptionPane;

public class Q26 {
    
    public static void main(String[] args){
        
        int n;

            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número."));

            if(primo(n)){

                JOptionPane.showMessageDialog(null, n + " é primo.");

            }
            else{

                JOptionPane.showMessageDialog(null, n + " não é primo.");
            }
        }
    

        private static boolean primo(int numero) {
            
            for (int j = 2; j < numero; j++) {
                
                if (numero % j == 0)
                    return false;
            }
            return true;
        }

}
