package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calculadora extends JFrame{
	JTextField resultado;
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, point,soma,sub, div, mult, igual;
	public Calculadora(){

		super ("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		resultado = new JTextField();
	b0 = new JButton("0");
	b1 = new JButton("1");
	b2 = new JButton("2");
	b3 = new JButton("3");
	b4 = new JButton("4");
	b5 = new JButton("5");
	b6 = new JButton("6");
	b7 = new JButton("7");
	b8 = new JButton("8");
	b9 = new JButton("9");
	point = new JButton(".");
	soma = new JButton("+");
	sub = new JButton("-");
	div = new JButton("/");
	mult = new JButton("*");
	igual = new JButton("=");
	resultado.setFont(new Font("Serif", Font.PLAIN, 26));
	Container c = getContentPane();
	c.setLayout(new  BorderLayout());
	Container d = new JPanel();
	d.setLayout(new  GridLayout(4, 4, 5, 5));
	c.add(BorderLayout.NORTH, resultado);
	c.add(d);
	d.add(b7);d.add(b8);d.add(b9);d.add(div);
	d.add(b4);d.add(b5);d.add(b6);d.add(mult);
	d.add(b1);d.add(b2);d.add(b3);d.add(sub);
	d.add(b0);d.add(point); d.add(igual);d.add(soma);
	
	
	
	
	
	}
	public static void main(String[] args) {
		new Calculadora();

	}
	class BotaoNumericolistener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent n) {
			if (n.getSource() == b0) resultado.setText("0");
			
		}
		
		
	}

}
