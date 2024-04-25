
package Model;

import javax.swing.JOptionPane;


public class Funções_DAO {
    
    public static void sair(){
        String x = JOptionPane.showInputDialog(null, "Deseja realmente sair?\n1-Sair\n2-Continuar");
            int op = Integer.parseInt(x);
            if(op == 1){
                System.exit(0);
            }
    }
    
}
