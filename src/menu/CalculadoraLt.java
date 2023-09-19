package menu;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculadoraLt extends JFrame{
	JLabel lbNome;
	JTextField txNum2;
	JTextField txNum;
	JButton btSomar;
	JButton btSubtrair;
	JButton btMultiplicar;
	JButton btDividir;

	public CalculadoraLt() {
		this.setTitle("Cálculos");
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.WHITE);

		lbNome = new JLabel();
		lbNome.setBounds(20,20,100,25);
		lbNome.setText("Número 1:");
		add(lbNome);
		
		lbNome = new JLabel();
		lbNome.setBounds(20,40,100,25);
		lbNome.setText("Número 2:");
		add(lbNome);
		
		txNum = new JTextField();
		txNum.setBounds(80,20,100,25);
		add(txNum);
		
		txNum2 = new JTextField();
		txNum2.setBounds(80,40,100,25);
		add(txNum2);
		
		btSomar = new JButton();
		btSomar.setBounds(20,200,100,25);
		btSomar.setText("Somar");
		btSomar.setBackground(Color.BLUE);
		btSomar.setForeground(Color.WHITE);
		add(btSomar);
		
		btSomar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double numero1 = Double.parseDouble(txNum.getText());
				double numero2 = Double.parseDouble(txNum2.getText());
				
				double resultado = numero1 + numero2;
				
				JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Cálculo somar", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		
		
		btSubtrair = new JButton();
		btSubtrair.setBounds(130,200,100,25);
		btSubtrair.setText("Subtrair");
		btSubtrair.setBackground(Color.BLUE);
		btSubtrair.setForeground(Color.WHITE);
		add(btSubtrair);
		
		btSubtrair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double numero1 = Double.parseDouble(txNum.getText());
				double numero2 = Double.parseDouble(txNum2.getText());
				
				double resultado = numero1 - numero2;
				
				JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Cálculo subtrair", JOptionPane.INFORMATION_MESSAGE);	
			}
			
		});
		
		btMultiplicar = new JButton();
		btMultiplicar.setBounds(240,200,100,25);
		btMultiplicar.setText("Multiplicar");
		btMultiplicar.setBackground(Color.BLUE);
		btMultiplicar.setForeground(Color.WHITE);
		add(btMultiplicar);
		
		btMultiplicar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double numero1 = Double.parseDouble(txNum.getText());
				double numero2 = Double.parseDouble(txNum2.getText());
				
				double resultado = numero1 * numero2;
				
				JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Cálculo multiplicar", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		
		btDividir = new JButton();
		btDividir.setBounds(350,200,100,25);
		btDividir.setText("Dividir");
		btDividir.setBackground(Color.BLUE);
		btDividir.setForeground(Color.WHITE);
		add(btDividir);
		
		btDividir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double numero1 = Double.parseDouble(txNum.getText());
				double numero2 = Double.parseDouble(txNum2.getText());
				
				if(numero2 == 0) {
					JOptionPane.showMessageDialog(null, "O resultado é: " + "Não é possível dividir por 0)", "Cálculo multiplicar", JOptionPane.INFORMATION_MESSAGE);
				}
				double resultado = numero1 / numero2;
				JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Cálculo multiplicar", JOptionPane.INFORMATION_MESSAGE);	
			}
			
		});
		
		//por ultimo
		this.setLayout(null);
		this.setVisible(true);
	}
}
