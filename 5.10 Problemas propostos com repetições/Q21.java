package q21;

import javax.swing.JOptionPane;

public class Q21 {
    
    public static void main(String[] args){
        
        String letras [] = new String[100];
        
        int quantAZ=0,quantCONS=0,quantEXCLAM=0,cont=0,vogais=0;
        
        String parar ="";
        
        do{
            cont++;
            letras[cont] = JOptionPane.showInputDialog(null, "Digite uma caractere.");

            if(letras[cont].equals("a")||letras[cont].equals("z")){
                quantAZ++;

            }
            if(letras[cont].equals("!")){
                quantEXCLAM++;
            }

            if(letras[cont].equals("a")||letras[cont].equals("e")||letras[cont].equals("i")||letras[cont].equals("o")||letras[cont].equals("u")){
                vogais++;
            }

            parar = JOptionPane.showInputDialog(null, "Mais um? (s/n)");

        }while(parar.equals("s")||parar.equals("sim"));

        quantCONS = cont-vogais;

        JOptionPane.showMessageDialog(null, letras[4]);

        JOptionPane.showMessageDialog(null, "A ou Z = "+ quantAZ 
                                           +"\n Caracteres = "+ cont
                                           +"\n Consoantes = "+quantCONS
                                           +"\n Exclamações = "+quantEXCLAM);
        
    }
}
