package q22;

import javax.swing.JOptionPane;

public class Q22 {
    
    public static void main(String[] args){

        int salario=0,filhos=0,maiorsal=0,cont=0;
        int sal[] = new int[10];
        int fil[] = new int [10];
        
        String loop= "";
        
        loop = JOptionPane.showInputDialog(null, "Iniciar pesquisa? (s/n)");
        
        while (loop.equals("s")||loop.equals("sim")){
                 
            for(int a=0;a<1;a++){
                sal[a] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o salário."));
                salario += sal[a];
                  
                if(sal[a]>maiorsal){

                maiorsal = sal[a];

                }
                
                 fil[a] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de filhos."));
                 filhos += fil[a];
                
                }

                cont ++;
                loop = JOptionPane.showInputDialog(null, "Continuar? (s/n)");
                
                }


                JOptionPane.showMessageDialog(null, "Média salarial: R$" + (salario/cont)
                                              + "\nMédia de filhos: " + (filhos/cont)
                                              + "\nMaior salário: R$" + maiorsal);


        }

}
