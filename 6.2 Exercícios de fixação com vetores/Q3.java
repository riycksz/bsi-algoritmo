package q3;

import javax.swing.JOptionPane;

public class Q3 {
    
    public static void main(String[] args){

        int n[] = new int [20];
        String mostrar="", mostrar2 ="", mostrar3 ="";

        for ( int i=0; i<20; i++){

            n[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "º número."));

            mostrar += n[i] + " ";
            
        }

        for (int j=19; j>=0; j--){

            mostrar2 += n[j] + " ";

        } 

        for(int k = 0; k < 20; k++){

            mostrar3 =" Ordem de entrada = " + mostrar2 + "\nOrdem contrária = " + mostrar;

        }

        JOptionPane.showMessageDialog(null, mostrar3);
    }
}
