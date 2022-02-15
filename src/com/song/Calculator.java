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
	String num = "";
	String num2 = "";
	int op = 0;
	double result = 0;
	
	JLabel label;
	
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
		
		/*
		button[0].addActionListener(event -> {
			num = num + "7";
			label.setText(num);
        });
		
		button[1].addActionListener(event -> {
			num = num + "8";
			label.setText(num);
        });
        
        button[i].addActionListener(event -> {
			num = num + btn[i];
			label.setText(num);
        });
		*/
		
		add(label, BorderLayout.NORTH);
		add(panel, BorderLayout.SOUTH);
		
		setSize(250,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand() == btn[0])
		{
			num += btn[0];
			label.setText(num);
		}else if(e.getActionCommand() == btn[1])
		{
			num = num + btn[1];
			label.setText(num);
		}else if(e.getActionCommand() == btn[2])
		{
			num = num + btn[2];
			label.setText(num);
		}else if(e.getActionCommand() == btn[3])
		{
			num += btn[3];
			label.setText(num);
		}else if(e.getActionCommand() == btn[4])
		{
			num = num + btn[4];
			label.setText(num);
		}else if(e.getActionCommand() == btn[5])
		{
			num = num + btn[5];
			label.setText(num);
		}else if(e.getActionCommand() == btn[6])
		{
			num = num + btn[6];
			label.setText(num);
		}else if(e.getActionCommand() == btn[7])
		{
			num = num + btn[7];
			label.setText(num);
		}else if(e.getActionCommand() == btn[8])
		{
			num = num + btn[8];
			label.setText(num);
		}else if(e.getActionCommand() == btn[9])
		{
			num = num + btn[9];
			label.setText(num);
		}else if(e.getActionCommand() == btn[10])
		{
			num = num + btn[10];
			label.setText(num);
		}else if(e.getActionCommand() == btn[11])
		{
			num = num + btn[11];
			label.setText(num);
		}else if(e.getActionCommand() == btn[12])
		{
			num = num + btn[12];
			label.setText(num);
		}else if(e.getActionCommand() == btn[13])
		{
			num = num + btn[13];
			label.setText(num);
		}else if(e.getActionCommand() == btn[14])
		{
			System.out.println(label.getText());
			
			label.setText(num);
		}else
		{
			num = num + btn[15];
			label.setText(num);
		}
		
	}

}
