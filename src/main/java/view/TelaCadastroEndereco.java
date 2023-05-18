package view;

import java.awt.EventQueue;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Color;
import java.awt.Component;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroEndereco extends JFrame {

	private JPanel contentPane;
	private MaskFormatter mascaraCep;
	private JLabel lblCep;
	private JLabel lblRua;
	private Component lblNumero;
	private JLabel lblBairro;
	private JLabel lblCidade;
	private JLabel lblEstado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroEndereco frame = new TelaCadastroEndereco();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCadastroEndereco() {
		setResizable(false);
		setTitle("Cadastro de Endereço");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 502, 265);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		

		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(215dlu;default):grow"),},
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
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		lblCep = new JLabel("CEP: ");
		contentPane.add(lblCep, "2, 2");
		
		try {
			mascaraCep = new MaskFormatter("#####-###");
			mascaraCep.setValueContainsLiteralCharacters(false);
		} catch (ParseException e) {
JOptionPane.showMessageDialog(null,  "Erro ao criar a máscara de CEP");
			
			e.printStackTrace();
		}
		
		
		JFormattedTextField txtCep = new JFormattedTextField(mascaraCep);
		txtCep.setText("     -   ");
		contentPane.add(txtCep, "4, 2, fill, default");
		
		 lblRua = new JLabel("Rua: ");
		contentPane.add(lblRua, "2, 4");
		
		JFormattedTextField txtRua = new JFormattedTextField();
		contentPane.add(txtRua, "4, 4, fill, default");
		
		 lblNumero = new JLabel("Número: ");
		contentPane.add(lblNumero, "2, 6");
		
		JFormattedTextField txtNumero = new JFormattedTextField();
		contentPane.add(txtNumero, "4, 6, fill, default");
		
		 lblBairro = new JLabel("Bairro:");
		contentPane.add(lblBairro, "2, 8");
		
		JFormattedTextField txtBairro = new JFormattedTextField();
		contentPane.add(txtBairro, "4, 8, fill, default");
		
		 lblCidade = new JLabel("Cidade:");
		contentPane.add(lblCidade, "2, 10");
		
		JFormattedTextField txtCidade = new JFormattedTextField();
		contentPane.add(txtCidade, "4, 10, fill, default");
		
		lblEstado = new JLabel("Estado:");
		contentPane.add(lblEstado, "2, 12");
		
		JFormattedTextField txtEstado = new JFormattedTextField();
		contentPane.add(txtEstado, "4, 12, fill, default");
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Preencher um novo endereço com o que foi informado na tela
				
				//Instanciar um objeto de EnderecoController
				
				//Chamar o controller.salvar(novoEndereco)
			}
		});
		contentPane.add(btnNewButton, "4, 14");
	}

}
