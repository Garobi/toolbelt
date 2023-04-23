import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class cmpPasswordGenerator extends JFrame {
    private JLabel lblNome;
    private JTextField txfResp;
    private JButton btnCriarButton;
    private JPanel pnlMod;
    private JCheckBox chbUpper, chbLower, chbNum, chbSimb;
    private JSpinner spnrLenght;

    private String gerarSenha(boolean upper, boolean lower, boolean num, boolean simb, int len){

        if (!upper && !lower && !num && !simb){
            return "Escolha ao menos uma das opções";
        }
        String lowerChars = "abcdefghijklmnopqrstuvwxyz";
        String upperChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numChars = "0123456789";
        String simbChars = "!@#$%&*()_+-=[]|,./?><";;
        int position;
        boolean notFull = true;

        char password[] = new char[len];

        for (int i =0; i < len; i++){
            boolean upperBool = false, lowerBool = false, numBool = false, simbBool = false;
            while (upper && !upperBool && notFull){

                Random valRand =new Random();
                position = valRand.nextInt(len);
                if (password[position] == '\u0000'){
                    upperBool = true;
                    password[position] = upperChars.charAt(valRand.nextInt(upperChars.length()));
                } else {
                    notFull = false;
                    for (int j = 0; j < len; j++){
                        if (password[j] == '\u0000'){
                            notFull = true;
                        }
                    }
                }
            }
            while (lower && !lowerBool && notFull){
                Random valRand =new Random();
                position = valRand.nextInt(len);
                if (password[position] == '\u0000'){
                    lowerBool = true;
                    password[position] = lowerChars.charAt(valRand.nextInt(lowerChars.length()));
                } else {
                    notFull = false;
                    for (int j = 0; j < len; j++){
                        if (password[j] == '\u0000'){
                            notFull = true;
                        }
                    }
                }
            }
            while (num && !numBool && notFull){
                Random valRand =new Random();
                position = valRand.nextInt(len);
                if (password[position] == '\u0000'){
                    numBool = true;
                    password[position] = numChars.charAt(valRand.nextInt(numChars.length()));
                } else {
                    notFull = false;
                    for (int j = 0; j < len; j++){
                        if (password[j] == '\u0000'){
                            notFull = true;
                        }
                    }
                }
            }
            while (simb && !simbBool && notFull){
                Random valRand =new Random();
                position = valRand.nextInt(len);
                if (password[position] == '\u0000'){
                    simbBool = true;
                    password[position] = simbChars.charAt(valRand.nextInt(simbChars.length()));
                } else {
                    notFull = false;
                    for (int j = 0; j < len; j++){
                        if (password[j] == '\u0000'){
                            notFull = true;
                        }
                    }
                }
            }
        }

        return String.valueOf(password);


//
//
//        StringBuilder passwordBuilder = new StringBuilder();
//        Random random = new Random();
//
//        if (upper){
//            passwordBuilder.append(upperChars.charAt(random.nextInt(upperChars.length())));
//        }
//        if(lower){
//            passwordBuilder.append(lowerChars.charAt(random.nextInt(lowerChars.length())));
//        }
//        if (num){
//            passwordBuilder.append(numChars.charAt(random.nextInt(numChars.length())));
//        }
//        if (simb){
//            passwordBuilder.append(simbChars.charAt(random.nextInt(simbChars.length())));
//        }
//        // Ensure at least one character from each option
//
//        // Generate remaining characters
//        int remainingChars = len - 4;
//        for (int i = 0; i < remainingChars; i++) {
//            int option = random.nextInt(4);
//            switch (option) {
//                case 0:
//                    passwordBuilder.append(upperChars.charAt(random.nextInt(upperChars.length())));
//                    break;
//                case 1:
//                    passwordBuilder.append(lowerChars.charAt(random.nextInt(lowerChars.length())));
//                    break;
//                case 2:
//                    passwordBuilder.append(numChars.charAt(random.nextInt(numChars.length())));
//                    break;
//                case 3:
//                    passwordBuilder.append(simbChars.charAt(random.nextInt(simbChars.length())));
//                    break;
//            }
//        }
//
//        // Shuffle the password characters
//        String password = passwordBuilder.toString();
//        char[] passwordChars = password.toCharArray();
//        for (int i = passwordChars.length - 1; i > 0; i--) {
//            int j = random.nextInt(i + 1);
//            char temp = passwordChars[i];
//            passwordChars[i] = passwordChars[j];
//            passwordChars[j] = temp;
//        }
//        return new String(passwordChars);
    }

    public JPanel iniciaComponent(){
        pnlMod = new JPanel();
        pnlMod.setLayout(null);
        pnlMod.setBounds(540, 430, 520, 200);
        pnlMod.setBorder(BorderFactory.createTitledBorder("Gerador de Senhas"));

        chbUpper = new JCheckBox("Maiúsculas");
        chbUpper.setBounds(20, 25, 100, 25);
        pnlMod.add(chbUpper);

        chbLower = new JCheckBox("Minúsculas");
        chbLower.setBounds(130, 25, 100, 25);
        pnlMod.add(chbLower);

        chbNum = new JCheckBox("Números");
        chbNum.setBounds(20, 55, 100, 25);
        pnlMod.add(chbNum);

        chbSimb = new JCheckBox("Símbolos");
        chbSimb.setBounds(130, 55, 100, 25);
        pnlMod.add(chbSimb);

        lblNome = new JLabel("Tamanho");
        lblNome.setBounds(10, 100, 70, 25);
        lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
        pnlMod.add(lblNome);

        SpinnerModel model = new SpinnerNumberModel(4, 4, 255, 1);
        spnrLenght = new JSpinner(model);

        spnrLenght.setBounds(90, 100, 70, 25);
        pnlMod.add(spnrLenght);

        txfResp = new JTextField();
        txfResp.setBounds(10, 155, 250, 25);
        pnlMod.add(txfResp);

        btnCriarButton = new JButton("Gerar");
        btnCriarButton.setBounds(170, 100, 90, 25);
        btnCriarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txfResp.setText(gerarSenha(
                        chbUpper.isSelected(),
                        chbLower.isSelected(),
                        chbNum.isSelected(),
                        chbSimb.isSelected(),
                        (Integer) spnrLenght.getValue())
                );
            }
        });
        pnlMod.add(btnCriarButton);


        return pnlMod;
    }
}
