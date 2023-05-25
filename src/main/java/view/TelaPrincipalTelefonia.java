package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipalTelefonia extends JFrame {

	private JPanel contentPane;
	private JMenu Cliente;
	private JMenuItem CadastroCliente;
	private JMenuItem ListagemCliente;
	private JMenu Endereco;
	private JMenuItem CadastroEndereco;
	private JMenuItem ListagemEndereco;
	private JMenu Telefone;
	private JMenuItem CadastroTelefone;
	private JMenuItem ListagemTelefone;
	private PainelCadastroCliente painelCadastroCliente;
	private PainelListagemCliente painelListagemCliente;
	public JFrame TelaPrincipalTelefonia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipalTelefonia frame = new TelaPrincipalTelefonia();
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
	public TelaPrincipalTelefonia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setAlignmentX(Component.LEFT_ALIGNMENT);
		setJMenuBar(menuBar);
		
		Cliente = new JMenu("Cliente");
		menuBar.add(Cliente);
		
		CadastroCliente = new JMenuItem("Cadastro");
		CadastroCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane = new PainelCadastroCliente();
				setContentPane(contentPane);
				revalidate();
				
			}
		});
		Cliente.add(CadastroCliente);
		
		ListagemCliente = new JMenuItem("Listagem");
		ListagemCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		Cliente.add(ListagemCliente);
		
		Endereco = new JMenu("Endereço");
		menuBar.add(Endereco);
		
		CadastroEndereco = new JMenuItem("Cadastro");
		Endereco.add(CadastroEndereco);
		
		ListagemEndereco = new JMenuItem("Listagem");
		Endereco.add(ListagemEndereco);
		
		Telefone = new JMenu("Telefone");
		menuBar.add(Telefone);
		
		CadastroTelefone = new JMenuItem("Cadastro");
		Telefone.add(CadastroTelefone);
		
		ListagemTelefone = new JMenuItem("Telefone");
		Telefone.add(ListagemTelefone);
		contentPane = new JPanel();
		Telefone.add(contentPane);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		getContentPane().setLayout(null);
	}

}
