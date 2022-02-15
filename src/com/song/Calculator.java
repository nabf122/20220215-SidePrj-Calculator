package com.song;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculator extends JFrame {
	
	public Calculator() {
		super("계산기");
		
		// JPanel
		JPanel mainPanel = new JPanel();
		
		// Label
		JLabel label = new JLabel("숫자를 입력해주세요");
		
		// button
		JButton btn1 = new JButton("test button");
		
		mainPanel.add(label);
		mainPanel.add(btn1);
		
		add(mainPanel);
		// size 지정
		setSize(450, 800);
		setVisible(true);
		
		// 종료 이벤트
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator cal = new Calculator();
		
	}

}
