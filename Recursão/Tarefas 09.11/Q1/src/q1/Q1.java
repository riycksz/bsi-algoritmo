package q1;

import javax.swing.JOptionPane;

public class Q1 {


    public static int potencia(int x, int n) {
        if (n == 0) 
            return 1;
        else
        return x * potencia(x, n-1);
        
    }
    
    public static void main(String[] args){
    
    int x1, n1;
    
        x1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor."));
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a potência."));
    
        JOptionPane.showMessageDialog(null,"Resultado: " + Q1.potencia(x1,n1));
    
    
    }
    
}
