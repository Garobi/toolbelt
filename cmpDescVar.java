import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cmpDescVar extends JFrame{
  private JLabel lblNome;
  private JTextField txfPrim, txfSec, txfFinal;
  private JButton btnCalcularButton;
  private JPanel pnlMod;

  public JPanel iniciaComponent(){
      pnlMod = new JPanel();
      pnlMod.setLayout(null);
      pnlMod.setBounds(10, 170, 340, 150);
      pnlMod.setBorder(BorderFactory.createTitledBorder("Aplicar desconto % num valor"));

      lblNome = new JLabel("Valor original (a)");
      lblNome.setBounds(10, 25, 110, 25);
      lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
      pnlMod.add(lblNome);

      lblNome = new JLabel("Valor com desconto (b)");
      lblNome.setBounds(10, 55, 110, 25);
      lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
      pnlMod.add(lblNome);

      lblNome = new JLabel("% desconto");
      lblNome.setBounds(10, 85, 110, 25);
      lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
      pnlMod.add(lblNome);

      txfPrim = new JTextField();
      txfPrim.setBounds(130, 25, 200, 25);
      pnlMod.add(txfPrim);

      txfSec = new JTextField();
      txfSec.setBounds(130, 55, 200, 25);
      pnlMod.add(txfSec);

      txfFinal = new JTextField();
      txfFinal.setBounds(130, 85, 200, 25);
      txfFinal.setEditable(false);
      pnlMod.add(txfFinal);

      btnCalcularButton = new JButton("Calcular");
      btnCalcularButton.setBounds(10, 115, 320, 25);
      btnCalcularButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              try {
                  float num1 = Float.parseFloat(txfPrim.getText());
                  float num2 = Float.parseFloat(txfSec.getText());
                  String resposta = String.valueOf(((num1-num2)/num1)*100);
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
