package Exemplos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class PainelCadastroTelefone extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PainelCadastroTelefone frame = new PainelCadastroTelefone();
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
	public PainelCadastroTelefone() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuRelatorios = new JMenu("Relatórios\r\n");
		menuBar.add(menuRelatorios);
		
		JMenuItem mntmRelatorioVerde = new JMenuItem("Relatorio Verde");
		menuRelatorios.add(mntmRelatorioVerde);
		
		JMenuItem mntmRelatorioAzul = new JMenuItem("Relatório Azul");
		menuRelatorios.add(mntmRelatorioAzul);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
