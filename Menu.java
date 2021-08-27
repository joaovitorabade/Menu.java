import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame{
	ImageIcon img1,img2,img3,img4,img5,img6,img7;
	JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10,lb11,lb12,lb13,lb14;
	
	private Container c1;
	private JMenuBar mnBarra;
	private JMenu mnArquivo, mnEntrada,mnPP,mnSaida;
	private JMenuItem miInicio,miSair, miOvo , miSalada,miPao , miChurrasco , miSushi , miLamen , mitorta , mibolo , misorvete;
	

	public Menu() {
		inicializarComponentes();
		definirEventos();
	}

	private void inicializarComponentes() {
		setLayout(null);
		c1 = getContentPane();
		mnBarra = new JMenuBar();
		mnArquivo = new JMenu("Arquivo");
		mnArquivo.setMnemonic('A');
		mnEntrada = new JMenu("Entrada");
		mnEntrada.setMnemonic('E');
		mnPP = new JMenu("Prato Principal");
		mnPP.setMnemonic('P');
		mnSaida = new JMenu("Saida");
		mnSaida.setMnemonic('S');
		miSair = new JMenuItem("Sair");
		miSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		miInicio = new JMenuItem("Inicio");
		miInicio.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));//criação de um atalho
		miOvo = new JMenuItem("Ovo Frito");
		miSalada = new JMenuItem("Tomate");
		miPao = new JMenuItem("Pao");
		miChurrasco = new JMenuItem("Churrasco");
		miSushi = new JMenuItem("Sushi");
		miLamen = new JMenuItem("Lamen");
		mitorta = new JMenuItem("Torrta de Limão");
		mibolo = new JMenuItem("Bolo de Chocolate");
		misorvete = new JMenuItem("Sorvete de Baunilha");
		img1 = new ImageIcon("C:\\Users\\Alunos\\Desktop\\pp.jpg");
		lb1 = new JLabel(img1);
		lb1.setBounds(50, 25, 100, 100);
		add(lb1);
		lb1.setVisible(false);
		img1 = new ImageIcon( "D:\\PR\\imagem.jpg");
		lb2 = new JLabel(img1);
		lb2.setBounds(0,0,585,535);
		add(lb2);
		img2 = new ImageIcon( "D:\\PR\\imagem2.jpg");
		lb3 = new JLabel(img2);
		lb3.setBounds(250,200,100,100);
		add(lb3);
		lb4 = new JLabel("Salada de Vegetais");
		lb4.setBounds(245, 100, 200, 100);
		add(lb4);
		img3 = new ImageIcon( "D:\\PR\\imagem3.jpg");
		lb5 = new JLabel(img3);
		lb5.setBounds(230,200,100,100);
		add(lb5);
		lb6 = new JLabel("Pão");
		lb6.setBounds(267, 100, 200, 100);
		add(lb6);
		img4 = new ImageIcon( "D:\\PR\\imagem4.jpg");
		lb7 = new JLabel(img4);
		lb7.setBounds(150,200,299,169);
		add(lb7);
		lb8 = new JLabel("Ovo");
		lb8.setBounds(290, 100, 200, 100);
		add(lb8);
		img5 = new ImageIcon( "D:\\PR\\imagem5.jpg");
		lb9 = new JLabel(img5);
		lb9.setBounds(150,200,299,169);
		add(lb9);
		lb10 = new JLabel("Churrasco");
		lb10.setBounds(270, 100, 200, 100);
		add(lb10);
		img6 = new ImageIcon( "D:\\PR\\imagem6.jpg");
		lb11 = new JLabel(img6);
		lb11.setBounds(150,200,299,169);
		add(lb11);
		lb12 = new JLabel("Sushi");
		lb12.setBounds(280, 100, 200, 100);
		add(lb12);
		img7 = new ImageIcon( "D:\\PR\\imagem7.jpg");
		lb13 = new JLabel(img7);
		lb13.setBounds(150,200,501,392);
		add(lb13);
		lb14 = new JLabel("Lamen");
		lb14.setBounds(280, 100, 200, 100);
		add(lb14);
		lb6.setVisible(false);
	
		
		mnArquivo.add(miSair);
		mnArquivo.add(miInicio);
		mnEntrada.add(miOvo);
		mnEntrada.add(miSalada);
		mnEntrada.add(miPao);
		mnPP.add(miChurrasco);
		mnPP.add(miSushi);
		mnPP.add(miLamen);
		mnSaida.add(mitorta);
		mnSaida.add(mibolo);
		mnSaida.add(misorvete);
		mnBarra.add(mnArquivo);
		mnBarra.add(mnEntrada);
		mnBarra.add(mnPP);
		mnBarra.add(mnSaida);
		setJMenuBar(mnBarra);
		
	}
	private void definirEventos() {
		miSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		miSalada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb2.setVisible(false);
				lb1.setVisible(true);
				lb4.setVisible(true);
				
				
			
			}
		});
		miPao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb2.setVisible(false);
				lb1.setVisible(false);
				lb4.setVisible(false);
				lb3.setVisible(false);
				lb6.setVisible(false);
			
				
				
			
			}
		});
		miOvo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb2.setVisible(false);
				lb1.setVisible(false);
				lb4.setVisible(false);
				lb3.setVisible(false);
				lb6.setVisible(false);
				lb7.setVisible(true);
				lb8.setVisible(true);
				
				
				
			
			}
		});
		miChurrasco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb2.setVisible(false);
				lb1.setVisible(false);
				lb4.setVisible(false);
				lb3.setVisible(false);
				lb6.setVisible(false);
				lb7.setVisible(false);
				lb8.setVisible(false);
				lb9.setVisible(true);
				lb10.setVisible(true);
				
				
			
			}
		});
		miSushi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb2.setVisible(false);
				lb1.setVisible(false);
				lb4.setVisible(false);
				lb3.setVisible(false);
				lb6.setVisible(false);
				lb7.setVisible(false);
				lb8.setVisible(false);
				lb9.setVisible(false);
				lb10.setVisible(false);
				lb11.setVisible(true);
				lb12.setVisible(true);
				
				
				
			
			}
		});
		miLamen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb2.setVisible(false);
				lb1.setVisible(false);
				lb4.setVisible(false);
				lb3.setVisible(false);
				lb6.setVisible(false);
				lb7.setVisible(false);
				lb8.setVisible(false);
				lb9.setVisible(false);
				lb10.setVisible(false);
				lb11.setVisible(false);
				lb12.setVisible(false);
				lb13.setVisible(true);
				lb14.setVisible(true);
				
				
				
			
			}
		});



	}

	public static void main(String args[]) {
		 Menu frame = new Menu();
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setBounds(0,0,600,600);
		 frame.setVisible(true);

	}
}




	

