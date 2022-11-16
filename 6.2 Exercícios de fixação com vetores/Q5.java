package q5;

import javax.swing.JOptionPane;

public class Q5 {
    
    public static void main(String[] args){
        
        double n[] = new double [50];
        String mostrar="";

        for ( int i = 0; i<50; i++){

            n[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "º número."));

            if(n[i]%2 != 0){

                n[i] = n[i] * 1.05;

                mostrar += n[i] + " ";

            }

                else{

                    n[i] = n[i] * 1.02;

                    mostrar += n[i] + " ";

                }


        }

        JOptionPane.showMessageDialog(null, mostrar);

    }

}
