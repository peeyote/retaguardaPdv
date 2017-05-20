package retaguarda.Cadastro;

import java.awt.EventQueue;
import java.beans.PropertyVetoException;
import java.text.DecimalFormat;
import java.text.ParseException;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;

public class cadastroProduto extends JInternalFrame implements ActionListener {
	private JButton btnNovoProd;
	private JTextField txtCodigoProduto;
	private JTextField txtNomeProduto;
	private JTextField txtQntEstoque;
	private JTextField txtGrupoProd;
	private JTextField txtDepProd;
	private JTextField txtSecaoProd;
	JTabbedPane tabbedPane;
	JPanel panelGeral;
	JComboBox cmbAliq;
	JButton btnGravarProd;
	private JTextField textField;

	public cadastroProduto() throws ParseException {
		iniciarComp();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNovoProd) {
			txtCodigoProduto.setEnabled(true);
			txtCodigoProduto.setEnabled(true);
			txtNomeProduto.setEnabled(true);
			txtQntEstoque.setEnabled(true);
			txtGrupoProd.setEnabled(true);
			txtDepProd.setEnabled(true);
			txtSecaoProd.setEnabled(true);
			btnGravarProd.setEnabled(true);
			btnNovoProd.setEnabled(false);
		} else if (e.getSource() == btnGravarProd) {
			txtCodigoProduto.setEnabled(false);
			txtCodigoProduto.setEnabled(false);
			txtNomeProduto.setEnabled(false);
			txtQntEstoque.setEnabled(false);
			txtGrupoProd.setEnabled(false);
			txtDepProd.setEnabled(false);
			txtSecaoProd.setEnabled(false);
			btnGravarProd.setEnabled(false);
			btnNovoProd.setEnabled(true);

		}

	}

	public void iniciarComp() throws ParseException {
		// Paramentros da Janela
		setMaximizable(true);
		setBounds(0, 0, 1024, 768);
		this.setTitle("Cadastro de produto");
		this.setClosable(true);
		getContentPane().setLayout(null);
		// Instanciando itens da tela
		JLabel lblCdigo = new JLabel("C\u00F3digo");
		JLabel lblNomeProduto = new JLabel("Nome produto");
		JLabel lblCusto = new JLabel("Estoque");
		JLabel lblGrupo = new JLabel("Grupo");
		JLabel lblDepartamento = new JLabel("Departamento");
		JLabel lblSeo = new JLabel("Se\u00E7\u00E3o");
		JLabel lblCusto_1 = new JLabel("Custo");
		JLabel lblLucro = new JLabel("Lucro");
		JPanel panelPreco = new JPanel();
		JLabel lblAliquota = new JLabel("Al\u00EDquota");
		JLabel lblPreo = new JLabel("Pre\u00E7o");
		JPanel panelImpostos = new JPanel();
		cmbAliq = new JComboBox();
		// Defindo tamanho e posição
		lblPreo.setBounds(277, 95, 46, 27);
		lblAliquota.setBounds(10, 26, 82, 27);
		lblGrupo.setBounds(10, 141, 82, 27);
		lblCusto.setBounds(10, 101, 82, 27);
		lblCdigo.setBounds(10, 14, 46, 14);
		lblNomeProduto.setBounds(10, 60, 82, 27);
		lblDepartamento.setBounds(10, 182, 82, 27);
		lblSeo.setBounds(10, 222, 82, 27);
		lblCusto_1.setBounds(10, 95, 33, 27);
		lblLucro.setBounds(174, 95, 33, 27);

		panelGeral = new JPanel();
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		txtCodigoProduto = new JTextField();
		txtNomeProduto = new JTextField();
		btnNovoProd = new JButton("Novo produto");
		txtQntEstoque = new JTextField();
		txtGrupoProd = new JTextField();
		txtSecaoProd = new JTextField();
		txtDepProd = new JTextField();
		btnGravarProd = new JButton("Gravar");

		btnNovoProd.setBounds(10, 11, 159, 38);
		tabbedPane.setBounds(10, 102, 864, 455);
		txtCodigoProduto.setBounds(52, 11, 196, 20);
		txtNomeProduto.setBounds(102, 57, 225, 30);
		txtQntEstoque.setBounds(102, 99, 64, 30);
		txtGrupoProd.setBounds(102, 139, 86, 30);
		txtDepProd.setBounds(102, 180, 86, 30);
		txtSecaoProd.setBounds(102, 220, 86, 20);
		cmbAliq.setBounds(10, 52, 76, 20);
		btnGravarProd.setBounds(196, 11, 159, 38);

		btnNovoProd.addActionListener(this);
		btnGravarProd.addActionListener(this);

		getContentPane().add(btnNovoProd);
		getContentPane().add(tabbedPane);
		getContentPane().add(btnGravarProd);

		tabbedPane.addTab("Geral", null, panelGeral, null);

		panelGeral.setLayout(null);
		panelGeral.add(txtCodigoProduto);
		panelGeral.add(lblCdigo);
		panelGeral.add(lblNomeProduto);
		panelGeral.add(txtNomeProduto);
		panelGeral.add(lblCusto);
		panelPreco.add(lblCusto_1);
		panelPreco.add(lblLucro);
		panelPreco.setLayout(null);
		panelPreco.add(lblAliquota);
		panelPreco.add(cmbAliq);
		panelPreco.add(lblPreo);

		txtCodigoProduto.setColumns(10);
		txtNomeProduto.setColumns(10);
		txtQntEstoque.setColumns(10);
		txtGrupoProd.setColumns(10);
		txtDepProd.setColumns(10);
		txtSecaoProd.setColumns(10);

		panelGeral.add(txtQntEstoque);
		panelGeral.add(txtGrupoProd);
		panelGeral.add(lblGrupo);
		panelGeral.add(lblDepartamento);
		panelGeral.add(txtDepProd);
		panelGeral.add(txtSecaoProd);
		panelGeral.add(lblSeo);

		tabbedPane.addTab("Custos", null, panelPreco, null);

		tabbedPane.addTab("Impostos", null, panelImpostos, null);

		// Desabilitado por padrão
		btnGravarProd.setEnabled(false);
		txtCodigoProduto.setEnabled(false);
		txtNomeProduto.setEnabled(false);
		txtQntEstoque.setEnabled(false);
		txtGrupoProd.setEnabled(false);
		txtSecaoProd.setEnabled(false);
		txtDepProd.setEnabled(false);

		MaskFormatter mascaraCampo = null;

		mascaraCampo = new MaskFormatter(new DecimalFormat("0.00").format(3));

		JFormattedTextField formattedTextField = new JFormattedTextField(mascaraCampo);
		formattedTextField.setBounds(53, 98, 99, 20);
		formattedTextField.setVisible(true);
		panelPreco.add(formattedTextField);

	}
}
