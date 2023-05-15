import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cmpRegraDeTres extends JFrame {
    private JLabel lblNome;
    private JTextField txfPrim, txfSec, txfTerc , txfFinal;
    private JButton btnCalcularButton;
    private JPanel pnlMod;

    public JPanel iniciaComponent(){
        pnlMod = new JPanel();
        pnlMod.setLayout(null);
        pnlMod.setBounds(10, 330, 520, 150);
        pnlMod.setBorder(BorderFactory.createTitledBorder("Regra de três"));

        lblNome = new JLabel("a:");
        lblNome.setBounds(10, 25, 10, 25);
        lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
        pnlMod.add(lblNome);

        lblNome = new JLabel("b:");
        lblNome.setBounds(10, 55, 10, 25);
        lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
        pnlMod.add(lblNome);

        lblNome = new JLabel("= r1:");
        lblNome.setBounds(250, 25, 30, 25);
        lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
        pnlMod.add(lblNome);

        lblNome = new JLabel("= r2:");
        lblNome.setBounds(250, 55, 30, 25);
        lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
        pnlMod.add(lblNome);

        txfPrim = new JTextField();
        txfPrim.setBounds(30, 25, 200, 25);
        pnlMod.add(txfPrim);

        txfSec = new JTextField();
        txfSec.setBounds(30, 55, 200, 25);
        pnlMod.add(txfSec);

        txfTerc = new JTextField();
        txfTerc.setBounds(290, 25, 200, 25);
        pnlMod.add(txfTerc);

        txfFinal = new JTextField();
        txfFinal.setBounds(290, 55, 200, 25);
        txfFinal.setEditable(false);
        pnlMod.add(txfFinal);

        btnCalcularButton = new JButton("Calcular");
        btnCalcularButton.setBounds(10, 115, 480, 25);
        btnCalcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float num1 = Float.parseFloat(txfPrim.getText());
                    float num2 = Float.parseFloat(txfSec.getText());
                    float num3 = Float.parseFloat(txfTerc.getText());
                    String resposta = String.valueOf((num3*num2)/num1);
                    txfFinal.setText(resposta);
                } catch (NumberFormatException ex) {
                    txfFinal.setText("Erro");
                    throw new RuntimeException(ex);
                }
            }
        });
        pnlMod.add(btnCalcularButton);

        return pnlMod;
    }
}