package q4;

import javax.swing.JOptionPane;

public class Q4 {
    
    public static void main(String[] args){
        
        double n[] = new double[30];
        String mostrar="";

        for(int i=0; i<30; i++){

            n[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "º número."));

            if(n[i] % 2 != 0){

                mostrar += n[i] + " ";
            }

        }

        JOptionPane.showMessageDialog(null, mostrar);
        
    }
}
