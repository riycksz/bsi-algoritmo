package q29;

import javax.swing.JOptionPane;

public class Q29 {
    
    public static void main(String[] args){
        
        int cont, milho = 1;

        JOptionPane.showMessageDialog(null, "1");

        for(cont=0;cont<65;cont++){
            
            milho = milho*2;

            JOptionPane.showMessageDialog(null, milho);

        }
    }
}
