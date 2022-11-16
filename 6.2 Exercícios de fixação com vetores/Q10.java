package q10;

import javax.swing.JOptionPane;

public class Q10 {
    
    public static void main(String[] args){

        String n[] = new String [100];
        String mostrar="";


            for(int i=0; i<100; i+=2){

                n[i] = "P";

                mostrar += n[i] + " ";

                for(int j=1; j<2; j+=2){

                    n[j] = "I";

                    mostrar += n[j] + " ";

                }

            }

            JOptionPane.showMessageDialog(null, mostrar);

    }
}
