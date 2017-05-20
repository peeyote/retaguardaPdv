package retaguarda;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import retaguarda.Cadastro.cadastroProduto;

import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;

public class telaRetaguarda extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuItem mntmProduto;
	private JMenu mnCadastro;
	private JMenuBar menuBar;
	private JDesktopPane desktopPane;

	public telaRetaguarda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1024, 768);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnCadastro = new JMenu("Cadastro");
		menuBar.add(mnCadastro);

		mntmProduto = new JMenuItem("Produto");
		mnCadastro.add(mntmProduto);
		mntmProduto.addActionListener(this);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 1008, 709);
		contentPane.add(desktopPane);
		this.setTitle("Retaguarda");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmProduto) {
			cadastroProduto produto;
			try {
				produto = new cadastroProduto();
				desktopPane.add(produto);
				produto.setVisible(true);
			} catch (ParseException e1) {
				e1.printStackTrace();
			}
		}
	}
}
