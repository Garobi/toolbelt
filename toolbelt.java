import java.awt.TextField;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class toolbelt extends JFrame{

    public toolbelt() {
        setSize(1920, 1080);
        setTitle("Tela de Cadastro");
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        cmpPctDesc cmpPctDesc = new cmpPctDesc();
        getContentPane().add(cmpPctDesc.iniciaComponent());
        cmpPctInc cmpPctInc = new cmpPctInc();
        getContentPane().add(cmpPctInc.iniciaComponent());
        cmpRepPct cmpRepPct = new cmpRepPct();
        getContentPane().add(cmpRepPct.iniciaComponent());
        // cmpRepPart();
        // cmpDescVar();
        // cmpVarDelta();
        // cmpValOrig();
        // cmpRegraDeTres();
        // cmpPasswordGenerator();
        setVisible(true);
    }

    
    public static void main(String[] args) {
        new toolbelt();
    }
    
}