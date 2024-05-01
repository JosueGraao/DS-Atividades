package Model;

import static View.Início_GUI.mensagem_txt;
import static View.Início_GUI.v1_txt;
import static View.Início_GUI.v2_txt;


public class Operações_DAO {
    
    public static void soma(){
        
        String v1 = View.Início_GUI.v1_txt.getText();
        double val1 = Double.parseDouble(v1);
        
        String v2 = View.Início_GUI.v2_txt.getText();
        double val2 = Double.parseDouble(v2);
        
        View.Início_GUI.mensagem_txt.setText("O resultado da soma é "+(val1+val2));
                
    }
    
    public static void sub(){
        
        String v1 = View.Início_GUI.v1_txt.getText();
        double val1 = Double.parseDouble(v1);
        
        String v2 = View.Início_GUI.v2_txt.getText();
        double val2 = Double.parseDouble(v2);
        
        View.Início_GUI.mensagem_txt.setText("O resultado da soma é "+(val1-val2));
        
    }
    
    public static void mult(){
        
        String v1 = View.Início_GUI.v1_txt.getText();
        double val1 = Double.parseDouble(v1);
        
        String v2 = View.Início_GUI.v2_txt.getText();
        double val2 = Double.parseDouble(v2);
        
        View.Início_GUI.mensagem_txt.setText("O resultado da soma é "+(val1*val2));
        
    }
    
    public static void div(){
        
        String v1 = View.Início_GUI.v1_txt.getText();
        double val1 = Double.parseDouble(v1);
        
        String v2 = View.Início_GUI.v2_txt.getText();
        double val2 = Double.parseDouble(v2);
        
        double res = val1/val2;
        
        View.Início_GUI.mensagem_txt.setText("O resultado da soma é "+(res));
        
    }
    
    public static void clr(){
        
        v1_txt.setText("");
        v2_txt.setText("");
        mensagem_txt.setText("");
        
    }
    
}
