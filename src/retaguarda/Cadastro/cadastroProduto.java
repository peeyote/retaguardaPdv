package retaguarda.Cadastro;

import java.awt.EventQueue;
import java.beans.PropertyVetoException;
import java.text.ParseException;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;

public class cadastroProduto extends JInternalFrame implements ActionListener {
	private JButton btnNovoProduto;
	private JTextField txtCodigoProduto;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JFormattedTextField frmtdtxtfldR;
	public cadastroProduto() throws ParseException {
		setMaximizable(true);
		setBounds(0, 0, 1024, 768);
		this.setTitle("Cadastro de produto");
		this.setClosable(true);
		getContentPane().setLayout(null);
		
		btnNovoProduto = new JButton("Novo produto");
		btnNovoProduto.setBounds(10, 11, 156, 54);
		btnNovoProduto.addActionListener(this);
		getContentPane().add(btnNovoProduto);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 102, 864, 455);
		getContentPane().add(tabbedPane);
		
		JPanel panelGeral = new JPanel();
		tabbedPane.addTab("Geral", null, panelGeral, null);
		panelGeral.setLayout(null);
		
		txtCodigoProduto = new JTextField();
		txtCodigoProduto.setEnabled(false);
		txtCodigoProduto.setBounds(52, 11, 196, 20);
		panelGeral.add(txtCodigoProduto);
		txtCodigoProduto.setColumns(10);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setBounds(10, 14, 46, 14);
		panelGeral.add(lblCdigo);
		
		JLabel lblNomeProduto = new JLabel("Nome produto");
		lblNomeProduto.setBounds(10, 60, 82, 27);
		panelGeral.add(lblNomeProduto);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setColumns(10);
		textField.setBounds(102, 57, 225, 30);
		panelGeral.add(textField);
		
		JLabel lblCusto = new JLabel("Estoque");
		lblCusto.setBounds(10, 101, 82, 27);
		panelGeral.add(lblCusto);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(102, 99, 86, 30);
		panelGeral.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		textField_2.setBounds(102, 139, 86, 30);
		panelGeral.add(textField_2);
		
		JLabel lblGrupo = new JLabel("Grupo");
		lblGrupo.setBounds(10, 141, 82, 27);
		panelGeral.add(lblGrupo);
		
		JLabel lblDepartamento = new JLabel("Departamento");
		lblDepartamento.setBounds(10, 182, 82, 27);
		panelGeral.add(lblDepartamento);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		textField_3.setBounds(102, 180, 86, 30);
		panelGeral.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setColumns(10);
		textField_4.setBounds(102, 220, 86, 30);
		panelGeral.add(textField_4);
		
		JLabel lblSeo = new JLabel("Se\u00E7\u00E3o");
		lblSeo.setBounds(10, 222, 82, 27);
		panelGeral.add(lblSeo);
		
		JPanel panelPreco = new JPanel();
		tabbedPane.addTab("Custos", null, panelPreco, null);
		panelPreco.setLayout(null);
		
		JLabel lblAliquota = new JLabel("Al\u00EDquota");
		lblAliquota.setBounds(10, 22, 82, 27);
		panelPreco.add(lblAliquota);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 55, 93, 20);
		panelPreco.add(comboBox);
		
		JLabel lblCusto_1 = new JLabel("Custo");
		lblCusto_1.setBounds(10, 95, 33, 27);
		panelPreco.add(lblCusto_1);
		
		JLabel lblLucro = new JLabel("Lucro");
		lblLucro.setBounds(174, 95, 82, 27);
		panelPreco.add(lblLucro);
		
		MaskFormatter dinheiro = new MaskFormatter("R$###,###,##");
		frmtdtxtfldR = new JFormattedTextField(dinheiro);
		frmtdtxtfldR.setEnabled(false);
		frmtdtxtfldR.setBounds(44, 98, 120, 24);
		panelPreco.add(frmtdtxtfldR);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setEnabled(false);
		formattedTextField_1.setBounds(207, 98, 120, 24);
		panelPreco.add(formattedTextField_1);
		
		JPanel panelImpostos = new JPanel();
		tabbedPane.addTab("Impostos", null, panelImpostos, null);
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnNovoProduto){
			txtCodigoProduto.setEnabled(true);
			frmtdtxtfldR.setEnabled(true);
		}
		
	}
}
