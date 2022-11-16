package q28;

import javax.swing.JOptionPane;

public class Q28{
    
    public static void main(String[] args){
        
        double n, i, j, fat, cons=1;

        n = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Digite um número."));

        for (i=1;i<=n;i++){

            fat = 1;

            for(j=1;j<=i-1; j++){

                fat = fat + fat*j;

            }

            cons = cons + (1/fat);

        }
        
        JOptionPane.showMessageDialog(null, "Constante matemática 'e': " + cons);

    }
}
