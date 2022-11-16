package q8;

import javax.swing.JOptionPane;

public class Q8 {
    
    public static void main(String[] args){
        
        double n[] = new double [30];
        double n2[] = new double [30];
        double igualdade[] = new double [30];
        
        String mostrar="";

        for ( int i=0; i<30; i++){

            n[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "º número para o vetor 1."));
            n2[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "º número para o vetor 2."));

            if(n[i] == n2[i]){

                igualdade[i] = 1;

                mostrar += igualdade[i] + " | ";

            }

                else{

                    igualdade[i] = 0;

                    mostrar += igualdade[i] + " | ";

                }


        }

        JOptionPane.showMessageDialog(null, mostrar);

    }
}
