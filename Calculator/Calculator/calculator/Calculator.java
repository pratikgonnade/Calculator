package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Calculator implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextArea textArea = new JTextArea(2,10);
	
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	JButton button0 = new JButton();
	
	JButton buttonAdd = new JButton();
	JButton buttonSub = new JButton();
	JButton buttonMulti = new JButton();
	JButton buttonDiv = new JButton();
	JButton buttonClear = new JButton();
	
	JButton buttonDot = new JButton();
	JButton buttonEqual = new JButton();
	
	double number1, number2, result;
	int add=0, sub=0, multi=0, div=0;
	
	public Calculator() {
		frame.setSize(340,450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Calculator By Raz0rX");
		frame.setResizable(false);
		
		//Adding Panel
		frame.add(panel);
		panel.setBackground(Color.white);
		Border border = BorderFactory.createLineBorder(Color.red,4);
		
		panel.add(textArea);
		textArea.setBackground(Color.black);
		Border tborder = BorderFactory.createLineBorder(Color.blue,3);
		textArea.setBorder(tborder);
		Font font = new Font("arial",Font.BOLD,33);
		textArea.setFont(font);
		textArea.setForeground(Color.white);
		
		textArea.setPreferredSize(new Dimension(2,10));
		textArea.setLineWrap(true);
		
		button1.setPreferredSize(new Dimension(100,40));
		button1.setIcon(new ImageIcon("D:\\MindScript\\ClassWork\\Eclipse\\CoreJava\\Calculator\\Calculator1\\1.png"));

		button2.setPreferredSize(new Dimension(100,40));
		button2.setIcon(new ImageIcon("D:\\MindScript\\ClassWork\\Eclipse\\CoreJava\\Calculator\\Calculator1\\2.png"));
		
		button3.setPreferredSize(new Dimension(100,40));
		button3.setIcon(new ImageIcon("D:\\MindScript\\ClassWork\\Eclipse\\CoreJava\\Calculator\\Calculator1\\3.png"));
		
		button4.setPreferredSize(new Dimension(100,40));
		button4.setIcon(new ImageIcon("D:\\MindScript\\ClassWork\\Eclipse\\CoreJava\\Calculator\\Calculator1\\4.png"));

		button5.setPreferredSize(new Dimension(100,40));
		button5.setIcon(new ImageIcon("D:\\MindScript\\ClassWork\\Eclipse\\CoreJava\\Calculator\\Calculator1\\5.png"));
		
		button6.setPreferredSize(new Dimension(100,40));
		button6.setIcon(new ImageIcon("D:\\MindScript\\ClassWork\\Eclipse\\CoreJava\\Calculator\\Calculator1\\6.png"));
		
		button7.setPreferredSize(new Dimension(100,40));
		button7.setIcon(new ImageIcon("D:\\MindScript\\ClassWork\\Eclipse\\CoreJava\\Calculator\\Calculator1\\7.png"));
		
		button8.setPreferredSize(new Dimension(100,40));
		button8.setIcon(new ImageIcon("D:\\MindScript\\ClassWork\\Eclipse\\CoreJava\\Calculator\\Calculator1\\8.png"));
		
		button9.setPreferredSize(new Dimension(100,40));
		button9.setIcon(new ImageIcon("D:\\MindScript\\ClassWork\\Eclipse\\CoreJava\\Calculator\\Calculator1\\9.png"));
		
		button0.setPreferredSize(new Dimension(100,40));
		button0.setIcon(new ImageIcon("D:\\MindScript\\ClassWork\\Eclipse\\CoreJava\\Calculator\\Calculator1\\0.png"));
		
		//Adding Operators 
		buttonDot.setPreferredSize(new Dimension(100,40));
		buttonDot.setIcon(new ImageIcon("D:\\MindScript\\ClassWork\\Eclipse\\CoreJava\\Calculator\\Calculator1\\Dot.png"));
		
		buttonSub.setPreferredSize(new Dimension(100,40));
		buttonSub.setIcon(new ImageIcon("D:\\MindScript\\ClassWork\\Eclipse\\CoreJava\\Calculator\\Calculator1\\-.png"));
		
		buttonMulti.setPreferredSize(new Dimension(100,40));
		buttonMulti.setIcon(new ImageIcon("D:\\MindScript\\ClassWork\\Eclipse\\CoreJava\\Calculator\\Calculator1\\multi.png"));
		
		buttonDiv.setPreferredSize(new Dimension(100,40));
		buttonDiv.setIcon(new ImageIcon("D:\\MindScript\\ClassWork\\Eclipse\\CoreJava\\Calculator\\Calculator1\\Div.png"));
		
		buttonAdd.setPreferredSize(new Dimension(100,40));
		buttonAdd.setIcon(new ImageIcon("D:\\MindScript\\ClassWork\\Eclipse\\CoreJava\\Calculator\\Calculator1\\+.png"));
		
		buttonEqual.setPreferredSize(new Dimension(100,40));
		buttonEqual.setIcon(new ImageIcon("D:\\MindScript\\ClassWork\\Eclipse\\CoreJava\\Calculator\\Calculator1\\Equal.png"));
		
		buttonClear.setPreferredSize(new Dimension(100,40));
		buttonClear.setIcon(new ImageIcon("D:\\MindScript\\ClassWork\\Eclipse\\CoreJava\\Calculator\\Calculator1\\C.png"));

		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button0);
		panel.add(buttonDot);
		panel.add(buttonSub);
		panel.add(buttonMulti);
		panel.add(buttonDiv);
		panel.add(buttonAdd);
		panel.add(buttonEqual);
		panel.add(buttonClear);
		
		button1.addActionListener((ActionListener) this);
		button2.addActionListener((ActionListener) this);
		button3.addActionListener((ActionListener) this);
		button4.addActionListener((ActionListener) this);
		button5.addActionListener((ActionListener) this);
		button6.addActionListener((ActionListener) this);
		button7.addActionListener((ActionListener) this);
		button8.addActionListener((ActionListener) this);
		button9.addActionListener((ActionListener) this);
		button0.addActionListener((ActionListener) this);
		buttonDot.addActionListener((ActionListener) this);
		buttonSub.addActionListener((ActionListener) this);
		buttonMulti.addActionListener((ActionListener) this);
		buttonDiv.addActionListener((ActionListener) this);
		buttonAdd.addActionListener((ActionListener) this);
		buttonEqual.addActionListener((ActionListener) this);
		buttonClear.addActionListener((ActionListener) this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == buttonClear) {
			number1=0.0;
			number2=0.0;
			textArea.setText("");
		}
		if(source == button1) {
			textArea.append("1");
		}
		if(source == button2) {
			textArea.append("2");
		}
		if(source == button3) {
			textArea.append("3");
		}
		if(source == button4) {
			textArea.append("4");
		}
		if(source == button5) {
			textArea.append("5");
		}
		if(source == button6) {
			textArea.append("6");
		}
		if(source == button7) {
			textArea.append("7");
		}
		if(source == button8) {
			textArea.append("8");
		}
		if(source == button9) {
			textArea.append("9");
		}
		if(source == button0) {
			textArea.append("0");
		}
		if(source == buttonDot) {
			textArea.append(".");
		}
		if(source == buttonAdd) {
			number1=number_reader();
			textArea.setText("+");
			add=1;
			div=0;
			sub=0;
			multi=0;
		}
		if(source == buttonDiv) {
			number1=number_reader();
			textArea.setText("");
			add=0;
			div=1;
			sub=0;
			multi=0;
		}
		if(source == buttonSub) {
			number1=number_reader();
			textArea.setText("");
			add=0;
			div=0;
			sub=1;
			multi=0;
		}
		if(source == buttonMulti) {
			number1=number_reader();
			textArea.setText("");
			add=0;
			div=0;
			sub=0;
			multi=1;
		}
		if(source == buttonEqual) {
			number2=number_reader();
			if(add>0) {
				result=number1+number2;
				textArea.setText(Double.toString(result));
			}
			if(sub>0) {
				result=number1-number2;
				textArea.setText(Double.toString(result));
			}
			if(multi>0) {
				result=number1*number2;
				textArea.setText(Double.toString(result));
			}
			if(div>0) {
				result=number1/number2;
				textArea.setText(Double.toString(result));
			}
		}
		
	}
	public double number_reader() {
		double num1;
		String s;
		s=textArea.getText();
		num1= Double.valueOf(s);
		return num1;
	}
}
