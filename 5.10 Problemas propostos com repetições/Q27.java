package q27;

import javax.swing.JOptionPane;

public class Q27 {
    
    public static void main(String[] args){
        
        double cont, n = 0, fah = 0, kel = 0;
        String mostrar="";

        for (cont=0;cont<101;cont++){

            n = cont;
            fah = (n*1.8)+32;
            kel = n+273.15;

            mostrar = mostrar + n
                    
                    + " | " + fah + " | " + kel + "\n";
            
            JOptionPane.showMessageDialog(null, "Celsius  |  Fahrenheit  |  Kelvin " + " \n\n " + mostrar);
        }


    }
}
