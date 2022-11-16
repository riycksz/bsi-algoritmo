package q7;

import javax.swing.JOptionPane;

public class Q7 {
    
    public static void main(String[] args){
        
        int v1[] = new int [30];
        int v2[] = new int [30];
        int soma[] = new int [30];
        String mostrar="", mostrar2 ="", mostrar3 ="";

        for ( int i=0; i<30; i++){

            v1[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "º número para o vetor 1."));

            mostrar += v1[i] + " | ";
            
        }

        for ( int j=0; j<30; j++){

            v2[j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o " + (j + 1) + "º número para o vetor 2."));

            mostrar2 += v2[j] + " | ";
            
        }

        for ( int k=0; k<30; k++){

            soma[k] = v1[k] + v2[k];

            mostrar3 += soma[k] + " | ";
            
        }

        JOptionPane.showMessageDialog(null, "Vetor 1: " + mostrar + "\nVetor 2: " + mostrar2 + "\nSoma: " + mostrar3);

    }
}
