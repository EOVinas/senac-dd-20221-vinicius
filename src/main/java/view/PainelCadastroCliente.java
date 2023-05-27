package view;

import javax.swing.JPanel;
import javax.swing.JEditorPane;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Color;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class PainelCadastroCliente extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblCadastroCliente;
	private JLabel lblNome;
	private JLabel lblCpf;
	private JLabel lblEndereco;
	private JLabel lblTelefone;

	/**
	 * Create the panel.
	 */
	public PainelCadastroCliente() {
		setBackground(new Color(240,240,240));
		setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(142dlu;default):grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		lblCadastroCliente = new JLabel("CADASTRO DE CLIENTE");
		lblCadastroCliente.setFont(new Font("Arial Black", Font.PLAIN, 15));
		add(lblCadastroCliente, "10, 4, center, default");
		
		lblNome = new JLabel("Nome");
		add(lblNome, "8, 8, right, default");
		
		textField = new JTextField();
		add(textField, "10, 8, fill, default");
		textField.setColumns(10);
		
		lblCpf = new JLabel("CPF");
		add(lblCpf, "8, 10, right, default");
		
		textField_1 = new JTextField();
		add(textField_1, "10, 10, fill, default");
		textField_1.setColumns(10);
		
		lblEndereco = new JLabel("Endereço");
		add(lblEndereco, "8, 12, right, default");
		
		textField_2 = new JTextField();
		add(textField_2, "10, 12, fill, default");
		textField_2.setColumns(10);
		
		lblTelefone = new JLabel("Telefone");
		add(lblTelefone, "8, 14, right, default");
		
		textField_3 = new JTextField();
		add(textField_3, "10, 14, fill, default");
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Voltar");
		add(btnNewButton, "8, 18");
		
		JButton btnNewButton_1 = new JButton("Salvar");
		add(btnNewButton_1, "10, 18");

	}

}
