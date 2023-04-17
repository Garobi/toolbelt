import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import lib.MeuTextField;
import lib.OperacoesMatematicas;

public class Cadastro extends JFrame {
	
	private JLabel lblNome, lblGenero;
	private MeuTextField txfNome;
	private JComboBox<String> cbbGenero;
	private JButton btnAdicionar, btnSair;
	
	private JTable tblDados;
	private JScrollPane spnDados;
	private DefaultTableModel model;		
	
	public Cadastro() {
		setSize(500, 500);
		setTitle("Tela de Cadastro");
		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		componentesCriar();
		setVisible(true);
	}
	
	private void componentesCriar() {
		lblNome = new JLabel("Nome:");
		lblNome.setBounds(20, 20, 50, 25);
		getContentPane().add(lblNome);
		
		txfNome = new MeuTextField();
		txfNome.setBounds(75, 20, 300, 25);
		getContentPane().add(txfNome);
		
		lblGenero = new JLabel("Genero:");
		lblGenero.setBounds(20, 50, 60, 25);
		getContentPane().add(lblGenero);
		
		cbbGenero = new JComboBox<String>();
		cbbGenero.addItem("- Selecione -");
		cbbGenero.addItem("Masculino");
		cbbGenero.addItem("Feminino");
		cbbGenero.setBounds(75, 50, 150, 25);
		getContentPane().add(cbbGenero);
		
		btnAdicionar = new JButton(new AbstractAction("Adicionar") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (txfNome.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Campo <NOME> obrigatório!");
					txfNome.requestFocus();
				}
				else if (cbbGenero.getSelectedIndex() == 0) {
					JOptionPane.showMessageDialog(null, "Campo <GENERO> obrigatório!");
					cbbGenero.requestFocus();
				}
				else {
					model.addRow(new String[] {txfNome.getText(), cbbGenero.getSelectedItem().toString()});
					txfNome.setText("");
					cbbGenero.setSelectedIndex(0);
					txfNome.requestFocus();
				}
				
			}
		});		
		btnAdicionar.setBounds(75, 80, 150, 25);
		getContentPane().add(btnAdicionar);
		
		model = new DefaultTableModel();
		model.addColumn("Nome");
		model.addColumn("Genero");
		
		tblDados = new JTable(model);
		spnDados = new JScrollPane(tblDados);
		spnDados.setBounds(20, 110, 440, 300);
		getContentPane().add(spnDados);
		
		btnSair = new JButton("Sair");
		btnSair.setBounds(390, 420, 70, 25);
		getContentPane().add(btnSair);
	}

	public static void main(String[] args) {
		new Cadastro();
	}

}








