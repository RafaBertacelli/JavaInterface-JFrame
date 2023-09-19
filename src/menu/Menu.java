package menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JFrame {

		public Menu() {

			this.setSize(512,200);
			this.setLocationRelativeTo(null);
			this.setTitle("Menu");
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setResizable(true);
			this.setLayout(null);
			
			JMenu form = new JMenu("Kitty's Agency");
			JMenu calc = new JMenu("Calculadora");
			JMenu jogo = new JMenu("Jogos");
			JMenu arq = new JMenu("Arquivo");
			
			
			JMenuItem sair = new JMenuItem("Sair");
			JMenuItem calcu = new JMenuItem("Calcular");
			JMenuItem jogodaveia = new JMenuItem("Jogo da Véia");
			JMenuItem forms = new JMenuItem("Formulário");
			
			
			form.add(forms);
			calc.add(calcu);
			arq.add(sair);
			jogo.add(jogodaveia);
			
			
			JMenuBar bar = new JMenuBar();
			setJMenuBar(bar);
			bar.add(form);			
			bar.add(calc);
			bar.add(arq);
			bar.add(jogo);

			
			sair.addActionListener(
					new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent event) {
							System.exit(0);
						}
					}
				);
			
			forms.addActionListener(
					new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent event) {
							Formulario forms = new Formulario();
							forms.setVisible(true);
							
						}}
					);
			
			calcu.addActionListener(
					new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent event) {
							CalculadoraLt calculadora = new CalculadoraLt();
							calculadora.setVisible(true);
							
						}}
					);
			
			
//			jogodaveia.addActionListener(
//					new ActionListener() {
//
//						@Override
//						public void actionPerformed(ActionEvent event) {
//							JogoDaVeia jogodaveia = new JogoDaVeia();
//							jogodaveia.setVisible(true);
//							
//						}}
//					);
//			
			this.setVisible(true); 
		}
}

