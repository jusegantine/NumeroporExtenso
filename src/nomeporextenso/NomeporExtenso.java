package nomeporextenso;
import javax.swing.JOptionPane;

public class NomeporExtenso{

    public static void main(String[] args) {

        String n1="";

        n1 = JOptionPane.showInputDialog("Digite o número");

        
        if(n1.equals("1")){
            JOptionPane.showMessageDialog(null, "Um: "+n1);

        }else if (n1.equals("2")){
            JOptionPane.showMessageDialog(null, "Dois: "+n1);

        } else if (n1.equals("3")) {
                JOptionPane.showMessageDialog(null, "Três: "+n1);

        } else if (n1.equals("4")){
            JOptionPane.showMessageDialog(null, "Quantro: "+n1);

        } else if (n1.equals("5")){
            JOptionPane.showMessageDialog(null, "Cinco: "+n1);

        } else if (n1.equals("6")){
            JOptionPane.showMessageDialog(null, "Seis: "+n1);

        } else if (n1.equals("7")){
            JOptionPane.showMessageDialog(null, "Sete: "+n1);

        } else if (n1.equals("8")){
            JOptionPane.showMessageDialog(null, "Oito: "+n1);

        } else if (n1.equals("9")){
            JOptionPane.showMessageDialog(null, "Nove: "+n1);

        } else if (n1.equals("10")){
            JOptionPane.showMessageDialog(null, "Dez: "+n1);

        } else JOptionPane.showMessageDialog(null, "Número inválido" +n1);



            }


        }

