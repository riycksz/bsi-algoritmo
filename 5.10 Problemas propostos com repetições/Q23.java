package q23;

import javax.swing.JOptionPane;

public class Q23 {
    
    public static void main(String[] args){
        
        int cand[] = new int[30];
        int cont=0,cont1=0,cont2=0,cont3=0,cont4=0;
        
        String loop ="", numero ="";
        
        do{
            cont++;
            cand[cont] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nota do "+cont+"º candidato (de 0 a 100)"));
            
            if((cand[cont]>0)&&(cand[cont]<=25))
            {cont1++;}
            
            else if ((cand[cont]>=26)&&(cand[cont]<=50))
            {cont2++;}
            
            else if ((cand[cont]>=51)&&(cand[cont]<=75))
            {cont3++;}
            
            else if ((cand[cont]>=76)&&(cand[cont]<=100))
            {cont4++;}
            
            else {
                numero += cand[cont]+ " ";
            }

            loop = JOptionPane.showInputDialog(null, "Continuar? (s/n)");
            
        }while(loop.equals("s")||loop.equals("sim"));

        JOptionPane.showMessageDialog(null, "Candidatos que acertaram de 0 a 25 questões: "+cont1+
                                            "\n Candidatos que acertaram de 26 a 50 questões: "+cont2+
                                            "\n Candidatos que acertaram de 51 a 75 questões: "+cont3+
                                            "\n Candidatos que acertaram de 76 a 100 questões: "+cont4+
                                            "\n Valores nulos: "+numero);
        
    }
}
