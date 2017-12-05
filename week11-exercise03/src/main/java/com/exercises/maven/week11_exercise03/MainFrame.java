package com.exercises.maven.week11_exercise03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class MainFrame {
	ConversorDegreesRadian conversor = new ConversorDegreesRadian();
	private JFrame frame = new JFrame();
	private JTextField textField1 = new JTextField();
	private JTextField textField2 = new JTextField();
	private JLabel lblValue1 = new JLabel("Enter the value in degrees:");
	private JLabel lblValue2 = new JLabel("Enter the value in radians:");
	private JLabel lblResult = new JLabel("Result:");
	private JButton btnToRadians = new JButton("To Radians");
	private JButton btnToDegrees = new JButton("To Degrees");
	private JTextField textField3 = new JTextField();
	private JButton btnClear = new JButton("Clear");
	private JButton btnExit = new JButton("Exit");
	

	/**
	 * Create the application.
	 */

	public MainFrame() {
		initialize();
		addComponentesToFrame();
		addActionListeners();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		//properties for frame
		frame.setTitle("Conversor");
		frame.setBounds(100, 100, 450, 343);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		//properties for labels
		lblValue1.setBounds(34, 12, 267, 15);
		lblValue2.setBounds(34, 70, 188, 15);
		lblResult.setBounds(34, 121, 117, 25);
		
		//properties for text fields
		textField1.setBounds(34, 39, 114, 19);
		textField1.setColumns(10);
		textField2.setBounds(34, 97, 114, 19);
		textField2.setColumns(10);
		textField3.setBounds(34, 143, 188, 19);
		textField3.setColumns(10);
		
		//properties for buttons
		btnToRadians.setBounds(34, 174, 117, 25);
		btnToDegrees.setBounds(212, 174, 117, 25);
		btnClear.setBounds(34, 244, 117, 25);
		btnExit.setBounds(300, 284, 117, 25);
		
	}
	public void addComponentesToFrame() {
		frame.getContentPane().add(textField1);
		frame.getContentPane().add(textField2);
		frame.getContentPane().add(lblValue1);
		frame.getContentPane().add(lblValue2);
		frame.getContentPane().add(lblResult);
		frame.getContentPane().add(btnToRadians);
		frame.getContentPane().add(btnToDegrees);
		frame.getContentPane().add(textField3);
		frame.getContentPane().add(btnClear);
		frame.getContentPane().add(btnExit);
		
	}
	public void addActionListeners() {
				
		btnToRadians.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double degrees = Double.parseDouble(textField1.getText());
				//conversor.degreesToRadians(degrees);
				textField3.setText(String.valueOf(conversor.degreesToRadians(degrees)));
			}
		});
		btnToDegrees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double radians = Double.parseDouble(textField2.getText());
				//conversor.radiansToDegrees();
				textField3.setText(String.valueOf(conversor.radiansToDegrees(radians)));
			}
		});
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField1.setText("");
				textField2.setText("");
				textField3.setText("");
			}
		});
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
