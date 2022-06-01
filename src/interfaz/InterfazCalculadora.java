package interfaz;

import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import mundo.Calculadora;

public class InterfazCalculadora extends JFrame implements ActionListener {
		
	//creando formulario
	JPanel base = (JPanel) this.getContentPane();
	
	//creando la pantalla
	
	TextField pantalla = new TextField();
	
	//Botones
	
	JButton butOne = new JButton("1");
	JButton butTwo = new JButton("2");
	JButton butThree = new JButton("3");
	JButton butFour = new JButton("4");
	JButton butFive = new JButton("5");
	JButton butSix = new JButton("6");
	JButton butSeven = new JButton("7");
	JButton butEight = new JButton("8");
	JButton butNine = new JButton("9");
	JButton butCero = new JButton("0");
	JButton butBorrar = new JButton("Borrar");
	JButton butMultiplicar = new JButton("*");
	JButton butSumar = new JButton("+");
	JButton butDividir = new JButton("/");
	JButton butRestar = new JButton("-");
	JButton butPunto = new JButton(".");
	JButton butIgual = new JButton("=");
	
	public InterfazCalculadora() {
		base.setLayout(null);
		setSize(350, 480);
		setTitle("Calculadora en Java"); //titulo
		setVisible(true); //que sea visible
		setResizable( false );
		setLocationRelativeTo( null );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		
		//Propiedades de pantalla
		
		pantalla.setBounds(22, 8, 288, 70);
		pantalla.setFont(new Font("arial", Font.BOLD, 30));
		add(pantalla);
		
		
		//Propiedades de botones
		
		butOne.setBounds(22, 83, 60, 60);
		butOne.setFont(new Font("arial", Font.BOLD, 20));
		add(butOne);
		butOne.addActionListener(this);
		
		butTwo.setBounds(87, 83, 60, 60);
		butTwo.setFont(new Font("arial", Font.BOLD, 20));
		add(butTwo);
		butTwo.addActionListener(this);
		
		butThree.setBounds(152, 83, 60, 60);
		butThree.setFont(new Font("arial", Font.BOLD, 20));
		add(butThree);
		butThree.addActionListener(this);
		
		butBorrar.setBounds(217, 83, 92, 60);
		butBorrar.setFont(new Font("arial", Font.BOLD, 13));
		add(butBorrar);
		butBorrar.addActionListener(this);
		
		
		
		butFour.setBounds(22, 150, 60, 60);
		butFour.setFont(new Font("arial", Font.BOLD, 20));
		add(butFour);
		butFour.addActionListener(this);
		
		butFive.setBounds(87, 150, 60, 60);
		butFive.setFont(new Font("arial", Font.BOLD, 20));
		add(butFive);
		butFive.addActionListener(this);
		
		butSix.setBounds(152, 150, 60, 60);
		butSix.setFont(new Font("arial", Font.BOLD, 20));
		add(butSix);
		butSix.addActionListener(this);
		
		butSumar.setBounds(217, 150, 92, 60);
		butSumar.setFont(new Font("arial", Font.BOLD, 13));
		add(butSumar);
		butSumar.addActionListener(this);
		
		
		
		
		butSeven.setBounds(22, 215, 60, 60);
		butSeven.setFont(new Font("arial", Font.BOLD, 20));
		add(butSeven);
		butSeven.addActionListener(this);
		
		butEight.setBounds(87, 215, 60, 60);
		butEight.setFont(new Font("arial", Font.BOLD, 20));
		add(butEight);
		butEight.addActionListener(this);
		
		butNine.setBounds(152, 215, 60, 60);
		butNine.setFont(new Font("arial", Font.BOLD, 20));
		add(butNine);
		butNine.addActionListener(this);
		
		butRestar.setBounds(217, 215, 92, 60);
		butRestar.setFont(new Font("arial", Font.BOLD, 13));
		add(butRestar);
		butRestar.addActionListener(this);
		
		
		
		
		butMultiplicar.setBounds(22, 280, 60, 60);
		butMultiplicar.setFont(new Font("arial", Font.BOLD, 20));
		add(butMultiplicar);
		butMultiplicar.addActionListener(this);
		
		butCero.setBounds(87, 280, 60, 60);
		butCero.setFont(new Font("arial", Font.BOLD, 20));
		add(butCero);
		butCero.addActionListener(this);
		
		butDividir.setBounds(152, 280, 60, 60);
		butDividir.setFont(new Font("arial", Font.BOLD, 20));
		add(butDividir);
		butDividir.addActionListener(this);
		
		butPunto.setBounds(217, 280, 92, 60);
		butPunto.setFont(new Font("arial", Font.BOLD, 20));
		add(butPunto);
		butPunto.addActionListener(this);
		
		
		butIgual.setBounds(22, 343, 288, 60);
		butIgual.setFont(new Font("arial", Font.BOLD, 20));
		add(butIgual);
		butIgual.addActionListener(this);
		
	}
	
	public static void main(String[] args) throws Exception {
		new InterfazCalculadora();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == butOne) {
			if(pantalla.getText() == "") {
				pantalla.setText("1");
			}
			else {
				pantalla.setText(pantalla.getText() + "1");
			}
		}
		
		if(e.getSource() == butTwo) {
			if(pantalla.getText() == "") {
				pantalla.setText("2");
			}
			else {
				pantalla.setText(pantalla.getText() + "2");
			}
		}
		
		if(e.getSource() == butThree) {
			if(pantalla.getText() == "") {
				pantalla.setText("3");
			}
			else {
				pantalla.setText(pantalla.getText() + "3");
			}
		}
		
		if(e.getSource() == butFour) {
			if(pantalla.getText() == "") {
				pantalla.setText("4");
			}
			else {
				pantalla.setText(pantalla.getText() + "4");
			}
		}
		
		if(e.getSource() == butFive) {
			if(pantalla.getText() == "") {
				pantalla.setText("5");
			}
			else {
				pantalla.setText(pantalla.getText() + "5");
			}
		}
		
		if(e.getSource() == butSix) {
			if(pantalla.getText() == "") {
				pantalla.setText("6");
			}
			else {
				pantalla.setText(pantalla.getText() + "6");
			}
		}
		
		if(e.getSource() == butSeven) {
			if(pantalla.getText() == "") {
				pantalla.setText("7");
			}
			else {
				pantalla.setText(pantalla.getText() + "7");
			}
		}
		
		if(e.getSource() == butEight) {
			if(pantalla.getText() == "") {
				pantalla.setText("8");
			}
			else {
				pantalla.setText(pantalla.getText() + "8");
			}
		}
		
		if(e.getSource() == butNine) {
			if(pantalla.getText() == "") {
				pantalla.setText("9");
			}
			else {
				pantalla.setText(pantalla.getText() + "9");
			}
		}
		
		if(e.getSource() == butCero) {
			if(pantalla.getText() == "") {
				pantalla.setText("0");
			}
			else {
				pantalla.setText(pantalla.getText() + "0");
			}
		}
		
		if(e.getSource() == butSumar) {
			if(pantalla.getText() == "") {
				pantalla.setText("+");
			}
			else {
				pantalla.setText(pantalla.getText() + "+");
			}
		}
		
		if(e.getSource() == butRestar) {
			if(pantalla.getText() == "") {
				pantalla.setText("-");
			}
			else {
				pantalla.setText(pantalla.getText() + "-");
			}
		}
		
		if(e.getSource() == butMultiplicar) {
			if(pantalla.getText() == "") {
				pantalla.setText("*");
			}
			else {
				pantalla.setText(pantalla.getText() + "*");
			}
		}
		
		if(e.getSource() == butDividir) {
			if(pantalla.getText() == "") {
				pantalla.setText("/");
			}
			else {
				pantalla.setText(pantalla.getText() + "/");
			}
		}
			
		if(e.getSource() == butPunto) {
			if(pantalla.getText() == "") {
				pantalla.setText(".");
			}
			else {
				pantalla.setText(pantalla.getText() + ".");
			}
		}
		
		if(e.getSource() == butBorrar) {
			pantalla.setText("");

		}
		
		if(e.getSource() == butIgual) {
			
			String cadena = pantalla.getText();
			
			for(int i = 0; i < cadena.length(); i++) {
				char caracter = cadena.charAt(i);
				
				if(caracter == '+') {
					String primeraParte = cadena.substring(0, i);
					String segundaParte = cadena.substring(i + 1, cadena.length());
					
					double one = Double.parseDouble(primeraParte); 
					double two = Double.parseDouble(segundaParte);
					
					Calculadora calculadora = new Calculadora(one, two);
					
					double resultado = calculadora.suma();
					
					pantalla.setText(Double.toString(resultado));
				}
				
				if(caracter == '-') {
					String primeraParte = cadena.substring(0, i);
					String segundaParte = cadena.substring(i + 1, cadena.length());
					
					double one = Double.parseDouble(primeraParte); 
					double two = Double.parseDouble(segundaParte);
					
					Calculadora calculadora = new Calculadora(one, two);
					
					double resultado = calculadora.resta();
					
					pantalla.setText(Double.toString(resultado));
				}
				
				if(caracter == '*') {
					String primeraParte = cadena.substring(0, i);
					String segundaParte = cadena.substring(i + 1, cadena.length());
					
					double one = Double.parseDouble(primeraParte); 
					double two = Double.parseDouble(segundaParte);
					
					Calculadora calculadora = new Calculadora(one, two);
					
					double resultado = calculadora.multiplicacion();
					
					pantalla.setText(Double.toString(resultado));
				}
				
				if(caracter == '/') {
					String primeraParte = cadena.substring(0, i);
					String segundaParte = cadena.substring(i + 1, cadena.length());
					double cero = Double.parseDouble(segundaParte);
					
					if(cero == 0) {
						pantalla.setText("No Existe Division / 0");
						JOptionPane.showMessageDialog(null, "No se puede dividir entre cero");
					}
					else {
						double resultado = Double.parseDouble(primeraParte) / Double.parseDouble(segundaParte);
						
						pantalla.setText(Double.toString(resultado));
					}
				}
			}
			
		}
	}

}
