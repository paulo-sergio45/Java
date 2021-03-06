package br.faesa.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculadoraGui implements ActionListener{

	private JFrame frmCalculadora;
	private JTextField textField;
	private JPanel panel_Excluir;
	private JButton btn_Excluir;
	private JPanel panel_Teclado;
	private JButton btn_7;
	private JButton btn_8;
	private JButton btn_9;
	private JButton btn_div;
	private JButton btn_4;
	private JButton btn5;
	private JButton btn_6;
	private JButton btn_X;
	private JButton btn_1;
	private JButton btn_2;
	private JButton btn_3;
	private JButton btn_menos;
	private JButton btn_ponto;
	private JButton btn_0;
	private JButton btn_igual;
	private JButton btn_mais;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraGui window = new CalculadoraGui();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculadoraGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setSize(new Dimension(220, 300));
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		frmCalculadora.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(0, 0, 204, 34);
		panel.add(textField);
		textField.setColumns(10);
		
		panel_Excluir = new JPanel();
		panel_Excluir.setBackground(new Color(192, 192, 192));
		panel_Excluir.setBounds(0, 35, 204, 34);
		panel.add(panel_Excluir);
		panel_Excluir.setLayout(null);
		
		btn_Excluir = new JButton("Excluir");
		btn_Excluir.setBounds(115, 0, 89, 34);
		panel_Excluir.add(btn_Excluir);
		
		panel_Teclado = new JPanel();
		panel_Teclado.setBackground(new Color(0, 128, 128));
		panel_Teclado.setBounds(0, 69, 204, 192);
		panel.add(panel_Teclado);
		panel_Teclado.setLayout(new GridLayout(4, 4, 0, 0));
		
		btn_7 = new JButton("7");
		panel_Teclado.add(btn_7);
		
		btn_8 = new JButton("8");
		panel_Teclado.add(btn_8);
		
		btn_9 = new JButton("9");
		panel_Teclado.add(btn_9);
		
		btn_div = new JButton("/");
		panel_Teclado.add(btn_div);
		
		btn_4 = new JButton("4");
		panel_Teclado.add(btn_4);
		
		btn5 = new JButton("5");
		panel_Teclado.add(btn5);
		
		btn_6 = new JButton("6");
		panel_Teclado.add(btn_6);
		
		btn_X = new JButton("X");
		panel_Teclado.add(btn_X);
		
		btn_1 = new JButton("1");
		panel_Teclado.add(btn_1);
		
		btn_2 = new JButton("2");
		panel_Teclado.add(btn_2);
		
		btn_3 = new JButton("3");
		panel_Teclado.add(btn_3);
		
		btn_menos = new JButton("-");
		panel_Teclado.add(btn_menos);
		
		btn_ponto = new JButton(".");
		panel_Teclado.add(btn_ponto);
		
		btn_0 = new JButton("0");
		panel_Teclado.add(btn_0);
		
		btn_igual = new JButton("=");
		panel_Teclado.add(btn_igual);
		
		btn_mais = new JButton("+");
		panel_Teclado.add(btn_mais);
		
		for (Component c : this.panel_Teclado.getComponents()) {
			((JButton)c).addActionListener(this);
			((JButton)c).setBackground(Color.lightGray);
			((JButton)c).setFont(new Font("Tahoma", Font.PLAIN, 24));
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String key = ((JButton)e.getSource()).getText().toString();
		switch (key) {
		case "0":
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
			System.out.println("-------------------------");
			CalculadoraOp.setDigito(key);
			CalculadoraOp.coletaOperando();
			System.out.println("Digito: "+CalculadoraOp.getDigito());
			System.out.println("Operando: "+CalculadoraOp.getOperando());
			System.out.println("Expressao: "+CalculadoraOp.getExpressao());
			System.out.println("-------------------------");
			textField.setText(CalculadoraOp.getOperando().toString());
			break;
		case "+":
		case "-":
		case "X":
		case "/":
		case ".":
			System.out.println("-------------------------");
			CalculadoraOp.setOperacao(key);
			CalculadoraOp.montaExpressao();
			System.out.println("Expressao: "+CalculadoraOp.getExpressao());
			System.out.println("-------------------------");
			textField.setText(CalculadoraOp.getExpressao().toString());
			break;
		case "=":
			System.out.println("-------------------------");
			CalculadoraOp.efetuaCalculo();
			System.out.println(CalculadoraOp.getExpressao());
			System.out.println("-------------------------");
			textField.setText(CalculadoraOp.getResultado().toString());
			break;
		default:
			break;
		}
		
	}
}
