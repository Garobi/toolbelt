import java.awt.TextField;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class toolbelt extends JFrame{

    private JLabel lblNome;
    private JTextField txfPrim, txfSec, txfFinal;
    private JButton btnCalcularButton;
    private JPanel pctDesc;

    public toolbelt() {
        setSize(1920, 1080);
        setTitle("Tela de Cadastro");
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        cmpPctDesc();
        // cmpPctInc();
        // cmpRepPct();
        // cmpRepPart();
        // cmpDescVar();
        // cmpVarDelta();
        // cmpValOrig();
        // cmpRegraDeTres();
        // cmpPasswordGenerator();
        setVisible(true);
    }


    private void cmpPctDesc(){
        
        pctDesc = new JPanel();
        pctDesc.setLayout(null);
        pctDesc.setBounds(10, 10, 400, 200);
        pctDesc.setBorder(BorderFactory.createTitledBorder("Aplicar desconto % num valor"));
        
        lblNome = new JLabel("Valor inicial R$ (a)");
		lblNome.setBounds(10, 25, 110, 25);
        lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		pctDesc.add(lblNome);

        lblNome = new JLabel("% desconto (b)");
		lblNome.setBounds(10, 55, 110, 25);
        lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		pctDesc.add(lblNome);

        lblNome = new JLabel("Resultado");
		lblNome.setBounds(10, 85, 110, 25);
        lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		pctDesc.add(lblNome);

        txfPrim = new JTextField();
        txfPrim.setBounds(130, 25, 200, 25);
        pctDesc.add(txfPrim);
        getContentPane().add(pctDesc);
        
        txfSec = new JTextField();
        txfSec.setBounds(130, 55, 200, 25);
        pctDesc.add(txfSec);
        getContentPane().add(pctDesc);

        txfFinal = new JTextField();
        txfFinal.setBounds(130, 85, 200, 25);
        pctDesc.add(txfFinal);
        getContentPane().add(pctDesc);
        
    }
    
    public static void main(String[] args) {
        new toolbelt();
    }
    
}