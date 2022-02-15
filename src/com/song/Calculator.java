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
		if(e.getSource() == btn[0])
		{
			num = num + btn[0];
			label.setText(num);
		}
		
	}

}
