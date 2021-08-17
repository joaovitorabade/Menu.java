import javax.swing.*;
import javax.swing.table.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Aula10 extends JPanel {
	private JPanel pnPrincipal, pnTable;
	private JButton btRemover, btAdicionar,bt1,bt2,bt3,bt4,bt5,bt6;;
	private JScrollPane scrollTable; 
	private JTable table; // declaração da tabela
	private JLabel lbNumero, lbTotal, lbProduto, lbPrecoUnitario, lbQtde;
	private JTextField tfNumero, tfTotal, tfProduto, tfPrecoUnitario, tfQtde;
	private JLabel lb1,lb2,lb3,lb4,lb5, opop;
	private ImageIcon img1,img2,img3,img4,img5;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6;
	DecimalFormat df = new DecimalFormat("#,###.00"); 
 //classe para formatar um campo da tabela;

	public Aula10() {
		inicializarComponentes();
		definirEventos();
	}

	private void inicializarComponentes() {
		setLayout(null);
		img1 = new ImageIcon("D:\\PR\\tabela\\tomate.png");
		bt1 = new JButton (img1);
		bt1.setBounds(75, 10, 150, 150);
		add(bt1);
		img2 = new ImageIcon("D:\\PR\\tabela\\carne.png");
		bt2 = new JButton(img2);
		bt2.setBounds(250, 30, 150, 150);
		add(bt2);
		img3 = new ImageIcon("D:\\PR\\tabela\\coca.png");
		bt3 = new JButton(img3);
		bt3.setBounds(400, 20, 150, 150);
		add(bt3);
		img4 = new ImageIcon("D:\\PR\\tabela\\frango.png");
		bt4 = new JButton(img4);
		bt4.setBounds(550, 20, 150, 150);
		add(bt4);
		img5= new ImageIcon("D:\\PR\\tabela\\peixe.png");
		bt5 = new JButton(img5);
		bt5.setBounds(745, 20, 150, 150);
		add(bt5);
		tf1 = new JTextField(2);
		tf1.setBounds(130, 170, 40, 30);
		add(tf1);
		tf2 = new JTextField(2);
		tf2.setBounds(320, 172, 40, 30);
		add(tf2);
		tf3 = new JTextField(2);
		tf3.setBounds(455, 172, 40, 30);
		add(tf3);
		tf4 = new JTextField(2);
		tf4.setBounds(600, 172, 40, 30);
		add(tf4);
		tf5 = new JTextField(2);
		tf5.setBounds(795, 172, 40, 30);
		add(tf5);
		bt1.setContentAreaFilled(false);
		bt1.setBorder(null);
		bt2.setContentAreaFilled(false);
		bt2.setBorder(null);
		bt3.setContentAreaFilled(false);
		bt3.setBorder(null);
		bt4.setContentAreaFilled(false);
		bt4.setBorder(null);
		bt5.setContentAreaFilled(false);
		bt5.setBorder(null);
		
		
		btAdicionar = new JButton("Adicionar");
		btAdicionar.setToolTipText("Adiciona um item ao pedido");
		btRemover = new JButton("Remover");
		btRemover.setToolTipText("Remove os itens selecionados");
		pnTable = new JPanel(new BorderLayout());
		pnTable.setBorder(new TitledBorder("Itens do Pedido"));//linhas 64 e 65 definem a borda do painel , com o nome dele (nesse caso itens do pedido)
		btAdicionar.setBounds(300, 300, 100, 22);
		btRemover.setBounds(420, 535, 100, 22);
		pnPrincipal = new JPanel(null);
		pnPrincipal.setLayout(null);
		pnPrincipal.setBounds(10, 100, 1000, 1500);
		scrollTable = new JScrollPane();
		pnPrincipal.add(btRemover);
		
		
		DefaultTableModel tableModel = new DefaultTableModel(
			new String[] {"Produto", "Qtde", "Preço Un.", "Total" },0) { //cria o layout da tabela , os itens do vetor são os nomes da coluna, o 0 indica que a tabela saíra sem nenhuma linha
			public boolean isCellEditable(int row, int col) { //método para dizer se a celula será editavel ou não
				if (col == 3  ) {
					return false;
				}
				return true;
			}
		};
		table = new JTable(tableModel);//instancia a tabela e adiciona o modelo de tabela criado anteriomente a ela
		DefaultTableCellRenderer alinhaDireita = new DefaultTableCellRenderer(); 
		alinhaDireita.setHorizontalAlignment(SwingConstants.RIGHT);//a variável alinhaDireita alinha o conteudo da tabela a direita 
		table.getColumnModel().getColumn(0).setPreferredWidth(150); //define o tamanho da coluna
		table.getColumnModel().getColumn(0).setResizable(true);//define se a coluna é editavel ou não ;
		table.getColumnModel().getColumn(1).setPreferredWidth(50);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setCellRenderer(alinhaDireita);//alinha o conteúdo da ceula a direita;
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setCellRenderer(alinhaDireita);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setCellRenderer(alinhaDireita);
		table.getTableHeader().setReorderingAllowed(false);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);// linhas 97 e 98 define que as colunas não podem ser reorganizadas com arraste e solte
		scrollTable.setViewportView(table);
		pnTable.add(scrollTable);
		pnTable.setBounds(10, 130, 900, 400);
		pnPrincipal.add(pnTable);
		add(pnPrincipal);

	}
	private void definirEventos(){
		bt1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				dtm.addRow(new Object[] {"Tomate",tf1.getText(), 20 , df.format(Integer.parseInt
						(tf1.getText()) * 20)});// linhas 114 a 116 adicionam uma linha na tabela 
 
		}
		
		});
		bt2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				dtm.addRow(new Object[] {"Carne",tf2.getText(), 40 , df.format(Integer.parseInt
						(tf1.getText()) * 40)});// linhas 114 a 116 adicionam uma linha na tabela 
 
		}
		
		});
		bt3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				dtm.addRow(new Object[] {"Coca",tf3.getText(), 10 , df.format(Integer.parseInt
						(tf1.getText()) * 10)});// linhas 114 a 116 adicionam uma linha na tabela 
 
		}
		
		});
		bt4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				dtm.addRow(new Object[] {"Frango",tf4.getText(), 30 , df.format(Integer.parseInt
						(tf1.getText()) * 30)});// linhas 114 a 116 adicionam uma linha na tabela 
 
		}
		
		});
		bt5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				dtm.addRow(new Object[] {"Peixe",tf5.getText(), 25 , df.format(Integer.parseInt
						(tf1.getText()) * 25)});// linhas 114 a 116 adicionam uma linha na tabela 
 
		}
		
		});
		btRemover.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int[] linhas = table.getSelectedRows();
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				for(int i = (linhas.length -1 ); i>=0; --i){ //esse for percorre o vetor de linhas , verifica qual  linha é selecionada e exclui
					dtm.removeRow(linhas[i]);
				}
				calcularTotal();
			}
		});
		
	}
	
	private void calcularTotal(){
		double total = 0;
		for(int linha = 0; linha<table.getRowCount(); linha++){// for para tirar os pontoos, e virguglas do numero para calcular total
			String valor = " "+table.getValueAt(linha,3);
			valor = valor.replace(".","");
			valor = valor.replace(",",".");
			total += Double.parseDouble(valor);
		}
		tfTotal.setText(""+df.format(total));
	}

	private void limparCampos(){
		tfProduto.setText("");
		tfQtde.setText("");
		tfPrecoUnitario.setText("");
		tfProduto.requestFocus();
	}

	
	

public static void main(String args[]){
	JFrame frame = new JFrame("Area de Texto");
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.getContentPane().add(new Aula10());
	 frame.setBounds(300,300,1000,800);
	 frame.setVisible(true);
 }
}

