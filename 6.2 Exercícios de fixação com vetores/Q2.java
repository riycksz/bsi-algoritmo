package q2;

import javax.swing.JOptionPane;

public class Q2 {
    
    public static void main(String[] args){
        
        int n[] = new int[20];
        String mostrar="";

        for(int i=0; i<20; i++){

            n[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "º número."));

        }

        for(int j=19; j>=0; j--){

            mostrar += n[j] + " ";

        }

        JOptionPane.showMessageDialog(null, mostrar);
        
    }
}
