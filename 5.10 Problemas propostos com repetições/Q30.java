package q30;

import javax.swing.JOptionPane;

public class Q30{
    
    public static void main(String[] args) {

        String mostrar="";

        for(int i=2; i<=1000; i++) {
            
            if(primo(i))

                mostrar = mostrar + i + " é primo." + " ";

        }

            JOptionPane.showMessageDialog(null, mostrar);

    }

    private static boolean primo(int numero){
        
        for (int j = 2; j < numero; j++){
            
            if (numero % j == 0)
                return false;
        }
        return true;
        
    }
}
