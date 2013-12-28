package gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class ControleText extends JFrame {
	JButton ok, cancel;
	JTextField usuario;
	JPasswordField senha;
	
	public ControleText(){
		super("Textos e Senhas");
		usuario = new JTextField();
		senha = new JPasswordField();
		ok = new JButton("Ok");
		ok.addActionListener(new BotaoOkListener());
		cancel = new JButton("Cancel");
		cancel.addActionListener(new BotaoCancelListener());
		
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(3,2));
		c.add(new JLabel("Login:"));
		c.add(usuario);
		c.add(new JLabel("Senha:"));
		c.add(senha);
		c.add(ok);
		c.add(cancel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new ControleText();
		}
		class BotaoOkListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			String s = "Login: " + usuario.getText() + "\nSenha: " + new String(senha.getPassword());
			JOptionPane.showMessageDialog(null, s);
			}
		}
		
		class BotaoCancelListener implements ActionListener {
			public void actionPerformed(ActionEvent e){
			usuario.setText("");
			senha.setText("");
			}
		

		}}
