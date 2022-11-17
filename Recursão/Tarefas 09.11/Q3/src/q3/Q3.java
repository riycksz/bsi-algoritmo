package q3;

import javax.swing.JOptionPane;

public class Q3 {

    // Base: tamanho = 0 soma = 0
    // Recursão: v[n-1] + soma do restante do array.

    public static int somarvetores(int v[], int n) {
        
        if (n==0)
            return 0;
        
        return v[n-1] + somarvetores(v,n-1);
        
    }
    
    public static void main(String[] args){
    
    int v1[],n1;
    
    v1 = new int[3];
    
    v1[0] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número."));
    v1[1] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número."));
    v1[2] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número."));
    
    
    n1= v1.length;
            
        JOptionPane.showMessageDialog(null,"Resultado: " + Q3.somarvetores(v1,n1));
    
    
    }
    
}
