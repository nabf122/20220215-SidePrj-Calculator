package com.song;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame implements ActionListener {

	String btn[] = { 
			"%", "C", "x^2", "←",
			"7", "8", "9", "+", 
			"4", "5", "6", "-", 
			"1", "2", "3", "x", 
			"0", ".", "=", "/" };

	// 사칙연산을 가지고 있는 변수
	String op = "";
	
	// 연산 식을 보여주는 변수
	String disp = "";
	String num = "";
	
	// 실제 연산에 사용되는 변수들
	double num1 = 0, num2 = 0;
	
	
	// 최종 결과 값
	double result = 0;
	
	JLabel label, label2;
	
	public Calculator() 
	{
		super("계산기");
		
		// 결과 GUI
		label = new JLabel("0");
		label.setHorizontalAlignment(JLabel.RIGHT);
				
		// 버튼 패널
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5,4,2,2));
		
		
		// 버튼 생성
		JButton button[] = new JButton[btn.length];
		for(int i=0;i<btn.length;i++)
		{
			button[i] = new JButton(btn[i]);
			button[i].addActionListener(this);
			panel.add(button[i]);
		}
		
		add(label, BorderLayout.NORTH);
		add(panel, BorderLayout.SOUTH);
		
		setSize(250,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public double plus(double a, double b) {
		double num = 0;
		num = a + b;
		
		return num;
	}
		
	public double sub(double a, double b) {
		double num = 0;
		num = a - b;
		
		return num;
	}
	
	public double mul(double a, double b) {
		double num = 0;
		num = a * b;
		
		return num;
	}
	
	public double div(double a, double b) {
		double num = 0;
		num = a / b;
		
		return num;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String str = e.getActionCommand();
		
		if(str.equals("+")) {
			op = str;
			num1 = num2;
			disp += str;
			label.setText(disp);
			num = "";
		}
		else if(str.equals("-")) {
			op = str;
			num1 = num2;
			disp += str;
			label.setText(disp);
			num = "";
		}
		else if(str.equals("x")) {
			op = str;
			num1 = num2;
			disp += str;
			label.setText(disp);
			num = "";
		}
		else if(str.equals("/")) {
			op = str;
			num1 = num2;
			disp += str;
			label.setText(disp);
			num = "";
		}
		else if(str.equals("=")) {
			num2 = Double.parseDouble(num);
			
			if(op.equals("+"))
			{
				result = plus(num1, num2);
				label.setText(String.valueOf(result));
				num1 = result;
				num2 = 0;
				op = "";
				disp = "";
				result = 0;
			}
			else if(op.equals("-"))
			{
				result = sub(num1, num2);
				label.setText(String.valueOf(result));
				num1 = result;
				num2 = 0;
				op = "";
				disp = "";
				result = 0;
			}
			else if(op.equals("x"))
			{
				result = mul(num1, num2);
				label.setText(String.valueOf(result));
				num1 = result;
				num2 = 0;
				op = "";
				disp = "";
				result = 0;
			}
			else
			{
				result = div(num1, num2);
				label.setText(String.valueOf(result));
				num1 = result;
				num2 = 0;
				op = "";
				disp = "";
				result = 0;
			}
		}
		else if(str.equals("%")) {
			num1 = Double.parseDouble(num);
			result = num1 / 100;
			label.setText(String.valueOf(result));
			num1 = result;
			num2 = 0;
			op = "";
			disp = "";
			result = 0;
		}
		else if(str.equals("C")) {
			label.setText("0");
			num1 = 0;
			num2 = 0;
			op = "";
			disp = "";
			num = "";
			result = 0;
		}
		else if(str.equals("x^2")) {
			num1 = Double.parseDouble(num);
			result = num1 * num1;
			label.setText(String.valueOf(result));
			num1 = result;
			num2 = 0;
			op = "";
			disp = "";
			result = 0;
		}
		else if(str.equals("←")) {
			num = label.getText();
			num = num.substring(0, num.length() -1);
			num2 = Double.parseDouble(num);
			label.setText(num);
			if(num.length() < 1)
			{
				label.setText("0");
				num1 = 0;
				num2 = 0;
				op = "";
				disp = "";
				num = "";
				result = 0;
			}
		}
		else if(str.equals(".")) {
			num += str;
			label.setText(num);
		}
		else
		{
			num += str;
			num2 = Double.parseDouble(num);
			label.setText(num);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator();
	}
}
