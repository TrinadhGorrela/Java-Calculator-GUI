package cacluator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleCalculator {

	private JFrame frame;
	private JTextField textField;

	double i;
	double j;
	double r;
	String o;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalculator window = new SimpleCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SimpleCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(230, 240, 255)); 
		frame.setTitle("Calculator");
		frame.setResizable(false);
		frame.setSize(300,400);
		frame.setBounds(100, 100, 311, 425);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 261, 65);
		textField.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField.setEditable(true);    
		textField.setFocusable(true);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	
		
		JButton Div = new JButton("÷");
		Div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i=Double.parseDouble(textField.getText());
				String num=textField.getText()+Div.getText();
				textField.setText(num);
				o="÷";
				
			}
		});
		Div.setFont(new Font("Tahoma", Font.BOLD, 15));
		Div.setBackground(new Color(174, 214, 241));
		Div.setBounds(206, 87, 65, 54);
		frame.getContentPane().add(Div);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn7.getText();
				textField.setText(num);
			}
		});
		btn7.setBackground(new Color(224, 224, 224));
		btn7.setForeground(new Color(0, 0, 0));
		btn7.setBounds(10, 141, 65, 54);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn4.getText();
				textField.setText(num);
			}
		});
		btn4.setBackground(new Color(224, 224, 224));
		btn4.setBounds(10, 191, 65, 54);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn1.getText();
				textField.setText(num);
			}
		});
		btn1.setBackground(new Color(224, 224, 224));
		btn1.setBounds(10, 244, 65, 54);
		frame.getContentPane().add(btn1);
		
		JButton btnC = new JButton("C");
		btnC.setBackground(new Color(255, 0, 0));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 18));
		//btnC.setBackground(new Color(255, 0, 0));
		btnC.setBounds(10, 87, 65, 54);
		frame.getContentPane().add(btnC);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn8.getText();
				textField.setText(num);
			}
		});
		btn8.setBackground(new Color(224, 224, 224));
		btn8.setBounds(75, 140, 65, 54);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn5.getText();
				textField.setText(num);
			}
		});
		btn5.setBackground(new Color(224, 224, 224));
		btn5.setBounds(75, 191, 65, 54);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn2.getText();
				textField.setText(num);
			}
		});
		btn2.setBackground(new Color(224, 224, 224));
		btn2.setBounds(75, 244, 65, 54);
		frame.getContentPane().add(btn2);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn9.getText();
				textField.setText(num);
			}
		});
		btn9.setBackground(new Color(224, 224, 224));
		btn9.setBounds(141, 140, 65, 54);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn6.getText();
				textField.setText(num);
			}
		});
		btn6.setBackground(new Color(224, 224, 224));
		btn6.setBounds(141, 191, 65, 54);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn3.getText();
				textField.setText(num);
			}
		});
		btn3.setBackground(new Color(224, 224, 224));
		btn3.setBounds(141, 244, 65, 54);
		frame.getContentPane().add(btn3);
		
		JButton btnB = new JButton("\uF0E7");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					b=str.toString();
					textField.setText(b);
				}
			}
		});
		btnB.setFont(new Font("Wingdings", Font.BOLD, 18));
		btnB.setBounds(75, 87, 65, 54);
		frame.getContentPane().add(btnB);
		
		JButton Mul = new JButton("×");
		Mul.setFont(new Font("Tahoma", Font.BOLD, 15));
		Mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i=Double.parseDouble(textField.getText());
				String num=textField.getText()+Mul.getText();
				textField.setText(num);
				o="×";
			}
		});
		Mul.setBackground(new Color(174, 214, 241));
		Mul.setBounds(206, 140, 65, 54);
		frame.getContentPane().add(Mul);
		
		JButton Sub = new JButton("-");
		Sub.setFont(new Font("Tahoma", Font.BOLD, 15));
		Sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i=Double.parseDouble(textField.getText());
				String num=textField.getText()+Sub.getText();
				textField.setText(num);
				o="-";
			}
		});
		Sub.setBackground(new Color(174, 214, 241));
		Sub.setBounds(206, 191, 65, 54);
		frame.getContentPane().add(Sub);
		
		JButton Add = new JButton("+");
		Add.setFont(new Font("Tahoma", Font.BOLD, 15));
		Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i=Double.parseDouble(textField.getText());
				String num=textField.getText()+Add.getText();
				textField.setText(num);
				o="+";
				
			}
		});
		Add.setBackground(new Color(174, 214, 241));
		Add.setBounds(207,244, 65, 54);
		frame.getContentPane().add(Add);
		
		JButton Mdiv = new JButton("√");
		Mdiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+Mdiv.getText();
				textField.setText(num);
				o="√";
			}
		});
		Mdiv.setBackground(new Color(174, 214, 241));
		Mdiv.setFont(new Font("Tahoma", Font.BOLD, 15));
		Mdiv.setBounds(10, 296, 65, 54);
		frame.getContentPane().add(Mdiv);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn0.getText();
				textField.setText(num);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn0.setBackground(new Color(224, 224, 224));
		btn0.setBounds(75, 296, 65, 54);
		frame.getContentPane().add(btn0);
		
		JButton btnD = new JButton(".");
		btnD.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+btnD.getText();
				textField.setText(num);
			}
		});
		btnD.setBounds(141, 296, 65, 54);
		frame.getContentPane().add(btnD);
		
		JButton Equal = new JButton("=");
		Equal.setFont(new Font("Tahoma", Font.BOLD, 15));
		Equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				StringBuilder e1=new StringBuilder(textField.getText());
				StringBuilder q=new StringBuilder(e1.reverse());
				StringBuilder b = new StringBuilder();
				
				   char c;
				   for(int i=0;i<q.length();i++)
				   {
					c=q.charAt(i);
						  if((c=='+')||(c=='-')||(c=='÷')||(c=='×')||(c=='√')||(c=='^'))
						  {
							 break;
						  }	  
						  else {
							b=b.append(c);
						  }
						  
				  }
				   StringBuilder w=new StringBuilder(b.reverse());
				
				String k=w.toString();
				
				String a;
				j=Double.parseDouble(k);
		
				try {
				    r = CalculatorLogic.calculate(i, j, o);
				    a = String.format("%f", r);
				    textField.setText(a);
				} 
				catch (ArithmeticException | IllegalArgumentException ex) {
				    textField.setText("Error");
				}

				
			}
		});
		Equal.setBackground(new Color(171, 235, 198));
		Equal.setBounds(206, 296, 65, 54);
		frame.getContentPane().add(Equal);
		
		JButton pow = new JButton("^");
		pow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i=Double.parseDouble(textField.getText());
				String num=textField.getText()+pow.getText();
				textField.setText(num);
				o="^";
			}
		});
		pow.setFont(new Font("Tahoma", Font.BOLD, 15));
		pow.setBackground(new Color(174, 214, 241));
		pow.setBounds(141, 87, 65, 54);
		frame.getContentPane().add(pow);
		
		
	}
}
