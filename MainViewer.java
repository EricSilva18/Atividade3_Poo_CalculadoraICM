package com.calculadora_imc.view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import com.calculadora_imc.control.ImcController;
import javax.swing.JTextPane;

public class MainViewer {

	private JFrame AppImcFrame;
	private JTextField PesoTextField;
	private JTextField AlturatField;
	private JTextPane resultPane;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainViewer window = new MainViewer();
					window.AppImcFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainViewer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		AppImcFrame = new JFrame();
		AppImcFrame.setAlwaysOnTop(true);
		AppImcFrame.setTitle("IMC ");
		AppImcFrame.setBounds(100, 100, 300, 400);
		AppImcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AppImcFrame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora IMC");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel.setBounds(37, 0, 209, 47);
		AppImcFrame.getContentPane().add(lblNewLabel);
		
		JLabel PesoLabel = new JLabel("Peso ");
		PesoLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		PesoLabel.setBounds(24, 95, 62, 25);
		AppImcFrame.getContentPane().add(PesoLabel);
		
		PesoTextField = new JTextField();
		PesoTextField.setText("0.0");
		PesoTextField.setToolTipText("");
		PesoTextField.setHorizontalAlignment(SwingConstants.CENTER);
		PesoTextField.setBounds(125, 86, 121, 50);
		AppImcFrame.getContentPane().add(PesoTextField);
		PesoTextField.setColumns(10);
		
		JLabel AlturaLabel = new JLabel("Altura");
		AlturaLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		AlturaLabel.setBounds(24, 156, 62, 25);
		AppImcFrame.getContentPane().add(AlturaLabel);
		
		AlturatField = new JTextField();
		AlturatField.setHorizontalAlignment(SwingConstants.CENTER);
		AlturatField.setText("0.0");
		AlturatField.setColumns(10);
		AlturatField.setBounds(125, 147, 121, 50);
		AppImcFrame.getContentPane().add(AlturatField);
		
		JButton CalcularButton = new JButton("Calcular");
		CalcularButton.setBounds(24, 208, 236, 50);
	    CalcularButton.addActionListener(new ImcController(this));
		AppImcFrame.getContentPane().add(CalcularButton);
		
		resultPane = new JTextPane();
		resultPane.setText("Result");
		resultPane.setBounds(10, 269, 264, 81);
		AppImcFrame.getContentPane().add(resultPane);
	}

	public JFrame getAppImcFrame() {
		return AppImcFrame;
	}

	public void setAppImcFrame(JFrame appImcFrame) {
		AppImcFrame = appImcFrame;
	}

	public JTextField getPesoTextField() {
		return PesoTextField;
	}

	public void setPesoTextField(JTextField pesoTextField) {
		PesoTextField = pesoTextField;
	}

	public JTextField getAlturatField() {
		return AlturatField;
	}

	public void setAlturatField(JTextField alturatField) {
		AlturatField = alturatField;
	}

	public JTextPane getResultPane() {
		return resultPane;
	}

	public void setResultPane(JTextPane resultPane) {
		this.resultPane = resultPane;
	}


}
