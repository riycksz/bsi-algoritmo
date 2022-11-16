package q9;

import javax.swing.JOptionPane;

public class Q9{
    
    public static void main(String[] args){

        int n[] = new int[10];
        int i, j, k;

        for(i=0; i>9; i++){

            n[i] = 10 * i;


        }

        for(j = 0; j>9; j++){

            n[j] = n[j] + 1;

        }

        for(k=0; k>10; k++){

            JOptionPane.showMessageDialog(null, n[k]);

        }

    }
}
