package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleLabel extends JFrame {

	public ControleLabel(){
	super("Label");
				
		JLabel simples = new JLabel("Label Simples");
		simples.setToolTipText("Meu Tool Tip");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(simples);
		
		Font fonte = new Font("serif", Font.BOLD, 12);
		simples.setFont(fonte);
		simples.setForeground(Color.BLUE);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ControleLabel();
	}

}
