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

	String btn[] = { "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", ".", "=", "/" };

	// 사칙연산을 가지고 있는 변수
	String op = "";
	
	// 연산 식을 보여주는 변수
	String disp = "";
	
	String disp_set = "";
	
	// 실제 연산에 사용되는 변수들
	int num1, num2;
	
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
		panel.setLayout(new GridLayout(4,4,2,2));
		
		
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
	
	public int plus(int a, int b) {
		
		int num = 0;
		
		num = a + b;
		
		return num;
	}
		
	public int sub(int a, int b) {
		
		int num = 0;
		
		num = a - b;
		
		return num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getActionCommand() == "+") {
			if(op.equals("+")) {
				num2 = Integer.parseInt(disp_set);
				result = plus(num1, num2);
				num1 = (int) result;
				op ="";
			} else {
				disp += "+";
				label.setText(disp);
				op = "+";
				num1 = Integer.parseInt(disp_set);
				disp_set = "";
			}
		}
		else if(e.getActionCommand() == "-") {
			if(op.equals("-")) {
				num2 = Integer.parseInt(disp_set);
				result = sub(num1, num2);
				num1 = (int) result;
				op ="";
			} else {
				disp += "+";
				label.setText(disp);
				op = "+";
				num1 = Integer.parseInt(disp_set);
				disp_set = "";
			}
		}
		else if(e.getActionCommand() == "*") {
			
		}
		else if(e.getActionCommand() == "/") {
			
		}
		else if(e.getActionCommand() == "=") {
			
		}
		else {
			if(e.getActionCommand() == btn[0])
			disp += btn[0];
			disp_set += btn[0];
			label.setText(disp);
		}
	}
}
