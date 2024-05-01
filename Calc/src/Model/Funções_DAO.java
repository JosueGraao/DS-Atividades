
package Model;

import javax.swing.JOptionPane;


public class Funções_DAO {
    
    public static void sair(){
        String x = JOptionPane.showInputDialog(null, "Deseja sair?\n1-Sim\n2-Não");
            int op = Integer.parseInt(x);
            if(op == 1){
                System.exit(0);
            }
    }
    
}
