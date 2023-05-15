import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class cmpRepPart {
  private JLabel lblNome;
  private JTextField txfPrim, txfSec, txfFinal;
  private JButton btnCalcularButton;
  private JPanel pnlMod;

  public JPanel iniciaComponent(){
      pnlMod = new JPanel();
      pnlMod.setLayout(null);
      pnlMod.setBounds(1060, 10, 340, 150);
      pnlMod.setBorder(BorderFactory.createTitledBorder("Amostragem 2 - Quanto X representa de Y"));

      lblNome = new JLabel("Total");
      lblNome.setBounds(10, 25, 110, 25);
      lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
      pnlMod.add(lblNome);

      lblNome = new JLabel("Parte");
      lblNome.setBounds(10, 55, 110, 25);
      lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
      pnlMod.add(lblNome);

      lblNome = new JLabel("Corresponde a %");
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
                  String resposta = String.valueOf((num2*100)/num1);
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

