package q25;

import javax.swing.JOptionPane;

public class Q25 {

    public static int euclides0(int p, int q) {
        
        if (q == 0) return p;
        else return euclides0(q, p % q);
    }


    public static int euclides(int p, int q) {
        
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }

    public static void main(String[] args) {
        
        int p = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número."));
        int q = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número."));
        int d  = euclides(p, q);

        JOptionPane.showMessageDialog(null, "O resultado do algoritmo de Euclides de (" + p + ", " + q + ") é: " + d);
        
    }
}
