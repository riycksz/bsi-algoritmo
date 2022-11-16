package q6; 

import javax.swing.JOptionPane;

public class Q6 {
    
    public static void main(String[] args){

        double n[] = new double[20];
        String mostrar="", mostrar2="";

        for(int i=0; i<10; i++){

            n[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "º número."));
        
        }    

        for(int k=0; k<10; k++){

            mostrar += n[k] + " | ";

        }
        for(int j = 9; j>=0; j--){

            mostrar2 += n[j] + " | ";

        }
        

        JOptionPane.showMessageDialog(null, mostrar + mostrar2);
        
    }
}