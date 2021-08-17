import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Aula09 extends JFrame{
	private JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10,lb11,lb12;
	private ImageIcon img1,img2,img3,img4,img5;
	
	
	
	public Aula09() {
		inicializarComponentes();
		definirEventos();
	}

	private void inicializarComponentes() {
		setLayout(null);
		Color azul = new Color(18, 168, 167);
		lb1 = new JLabel("CORONAVÍRUS(COVID-19)");
		lb1.setBounds(215,15,250,20);
		
		
		add(lb1);
		lb2 = new JLabel("Como devemos nos proteger?");
		lb2.setBounds(207,45,300,40);
		
		add(lb2);
		img1 = new ImageIcon( "D:\\ES\\imagem.png");
		lb3 = new JLabel(img1);
		lb3.setBounds(1,50,200,200);
		add(lb3);
		lb4 = new JLabel("- Evite lugares fechados e com aglomerações de pessoas.");
		lb4.setBounds(175,145,400,20);
		add(lb4);
		img2 = new ImageIcon( "D:\\ES\\imagem2.png");
		lb5 = new JLabel(img2);
		lb5.setBounds(1,175,200,200);
		add(lb5);
		lb6 = new JLabel("- Lave suas mãos com frequência");
		lb6.setBounds(175,260,400,20);
		add(lb6);
		img3 = new ImageIcon( "D:\\ES\\imagem3.png");
		lb7 = new JLabel(img3);
		lb7.setBounds(1,300,200,200);
		add(lb7);
		lb8 = new JLabel("- Evite tocar o rosto, boca e nariz.");
		lb8.setBounds(175,390,400,20);
		add(lb8);
		img4 = new ImageIcon( "D:\\ES\\imagem4.png");
		lb9 = new JLabel(img4);
		lb9.setBounds(0,425,200,200);
		add(lb9);
		lb10 = new JLabel("- Evite tocar o rosto, boca e nariz.");
		lb10.setBounds(175,510,400,20);
		add(lb10);
		img5 = new ImageIcon( "D:\\ES\\imagem5.png");
		lb11 = new JLabel(img5);
		lb11.setBounds(0,540,200,200);
		add(lb11);
		lb12 = new JLabel("- Cubra a boca e o nariz quando for espirrar ou tossir.");
		lb12.setBounds(175,630,400,20);
		add(lb12);
		
		
		
		
	}
	private void definirEventos() {
	
	}

	public static void main(String args[]) {
		 Aula09 frame = new Aula09();
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setBounds(400,400,600,800);
		 frame.setVisible(true);

	}

}
