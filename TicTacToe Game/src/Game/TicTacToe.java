package Game;

import java.awt.Color;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class TicTacToe {
	
	JFrame frame;
	private JTextField b4;
	private JTextField b9;
	int count1=0;
	int count2=0;
	String Start="X";
	
	int num=10;
	int num1=10;
	int num2=10;
	int num3=10;
	int num4=10;
	int num5=10;
	int num6=10;
	int num7=10;
	int num8=10;
	int i=0;
	
	
	public void wingame() {
		//For X Player Only
		if(num==1 && num1==1 && num2==1) {
			
			JOptionPane.showMessageDialog(frame, "Player1 Win","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			count1++;
			b4.setText(String.valueOf(count1));
		}
		else if(num3==1 && num4==1 && num5==1) {
			
			JOptionPane.showMessageDialog(frame, "Player1 Win","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			count1++;
			b4.setText(String.valueOf(count1));
		}
		else if(num6==1 && num7==1 && num8==1) {
			
			JOptionPane.showMessageDialog(frame, "Player1 Win","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			count1++;
			b4.setText(String.valueOf(count1));
		}
		else if(num==1 && num3==1 && num6==1) {
			
			JOptionPane.showMessageDialog(frame, "Player1 Win","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			count1++;
			b4.setText(String.valueOf(count1));
		}
		else if(num1==1 && num4==1 && num7==1) {
			
			JOptionPane.showMessageDialog(frame, "Player1 Win","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			count1++;
			b4.setText(String.valueOf(count1));
		}
		else if(num2==1 && num5==1 && num8==1) {
			
			JOptionPane.showMessageDialog(frame, "Player1 Win","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			count1++;
			b4.setText(String.valueOf(count1));
		}
		else if(num==1 && num4==1 && num8==1) {
			
			JOptionPane.showMessageDialog(frame, "Player1 Win","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			count1++;
			b4.setText(String.valueOf(count1));
		}
		else if(num2==1 && num4==1 && num6==1) {
			
			JOptionPane.showMessageDialog(frame, "Player1 Win","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			count1++;
			b4.setText(String.valueOf(count1));
		}
		
		//For O Player Only
		else if(num==0 && num1==0 && num2==0) {
			
			JOptionPane.showMessageDialog(frame, "Player2 Win","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			count2++;
			b9.setText(String.valueOf(count2));
		}
		else if(num3==0 && num4==0 && num5==0) {
			
			JOptionPane.showMessageDialog(frame, "Player2 Win","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			count2++;
			b9.setText(String.valueOf(count2));
		}
		else if(num6==0 && num7==0 && num8==0) {
			
			JOptionPane.showMessageDialog(frame, "Player2 Win","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			count2++;
			b9.setText(String.valueOf(count2));
		}
		else if(num==0 && num3==0 && num6==0) {
			
			JOptionPane.showMessageDialog(frame, "Player2 Win","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			count2++;
			b9.setText(String.valueOf(count2));
		}
		else if(num1==0 && num4==0 && num7==0) {
			
			JOptionPane.showMessageDialog(frame, "Player2 Win","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			count2++;
			b9.setText(String.valueOf(count2));
		}
		else if(num2==0 && num5==0 && num8==0) {
			
			JOptionPane.showMessageDialog(frame, "Player2 Win","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			count2++;
			b9.setText(String.valueOf(count2));
		}
		else if(num==0 && num4==0 && num8==0) {
			
			JOptionPane.showMessageDialog(frame, "Player2 Win","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			count2++;
			b9.setText(String.valueOf(count2));
		}
		else if(num2==0 && num4==0 && num6==0) {
			
			JOptionPane.showMessageDialog(frame, "Player2 Win","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			count2++;
			b9.setText(String.valueOf(count2));
		}
		else if(i==9) {
			
			JOptionPane.showMessageDialog(frame, "No One Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
	
	public void chooseply() {
		if(Start.equalsIgnoreCase("X")) {
		
			Start="0";
		}
		else {
			Start="X";
		}
	}
	
	public TicTacToe() {
		
		JFrame frame = new JFrame();
		frame.setTitle("Tic Tac Toe");
		
		//Button
		JButton b = new JButton("");
		b.setBounds(200, 200, 100, 50);
		b.setFont(new Font("Arial", Font.BOLD, 80));
		frame.add(b);
		b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				b.setText(Start);
				if(Start.equalsIgnoreCase("X")) {
					b.setForeground(Color.GREEN);
					num=1;
					i++;
				}
				else {
					b.setForeground(Color.BLUE);
					num=0;
					i++;
				}
				chooseply();
				wingame();
			}
		});
		JButton b1 = new JButton("");
		b1.setFont(new Font("Arial", Font.BOLD, 80));
		frame.add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					b1.setText(Start);
					if(Start.equalsIgnoreCase("X")) {
						b1.setForeground(Color.GREEN);
						num1=1;
						i++;
					}
					else {
						b1.setForeground(Color.BLUE);
						num1=0;
						i++;
					}
					chooseply();
					wingame();
				}
			});
		
		JButton b2 = new JButton("");
		b2.setFont(new Font("Arial", Font.BOLD, 80));
		frame.add(b2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					b2.setText(Start);
					if(Start.equalsIgnoreCase("X")) {
						b2.setForeground(Color.GREEN);
						num2=1;
						i++;
					}
					else {
						b2.setForeground(Color.BLUE);
						num2=0;
						i++;
					}
					chooseply();
					wingame();
				}
			});
		
		
		JTextField b3 = new JTextField();
		b3.setText("Player 1");
		b3.setHorizontalAlignment(SwingConstants.CENTER);
		b3.setFont(new Font("Arial", Font.BOLD, 20));
		frame.add(b3);
		
		//Text Field
		b4 = new JTextField();
		b4.setFont(new Font("Arial", Font.BOLD, 30));
		b4.setHorizontalAlignment(SwingConstants.CENTER);
		b4.setText("0");
		frame.add(b4);
	
		
		JButton b5 = new JButton("");
		b5.setFont(new Font("Arial", Font.BOLD, 80));
		frame.add(b5);	
		b5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				b5.setText(Start);
				if(Start.equalsIgnoreCase("X")) {
					b5.setForeground(Color.GREEN);
					num3=1;
					i++;
				}
				else {
					b5.setForeground(Color.BLUE);
					num3=0;
					i++;
				}
				chooseply();
				wingame();
			}
		});
		JButton b6 = new JButton("");
		b6.setFont(new Font("Arial", Font.BOLD, 80));
		frame.add(b6);
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					b6.setText(Start);
					if(Start.equalsIgnoreCase("X")) {
						b6.setForeground(Color.GREEN);
						num4=1;
						i++;
					}
					else {
						b6.setForeground(Color.BLUE);
						num4=0;
						i++;
					}
					chooseply();
					wingame();
				}
			});
		
		JButton b7 = new JButton("");
		b7.setFont(new Font("Arial", Font.BOLD, 80));
		frame.add(b7);
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					b7.setText(Start);
					if(Start.equalsIgnoreCase("X")) {
						b7.setForeground(Color.GREEN);
						num5=1;
						i++;
					}
					else {
						b7.setForeground(Color.BLUE);
						num5=0;
						i++;
					}
					chooseply();
					wingame();
				}
			});

		JTextField b8 = new JTextField("    Player 2");
		b8.setFont(new Font("Arial", Font.BOLD, 20));
		b8.setHorizontalAlignment(SwingConstants.CENTER);
		frame.add(b8);
		
		b9 = new JTextField();
		b9.setFont(new Font("Arial", Font.BOLD, 30));
		b9.setHorizontalAlignment(SwingConstants.CENTER);
		b9.setText("0");
		frame.add(b9);

		
		JButton b10 = new JButton("");
		b10.setFont(new Font("Arial", Font.BOLD, 80));
		frame.add(b10);
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					b10.setText(Start);
					if(Start.equalsIgnoreCase("X")) {
						b10.setForeground(Color.GREEN);
						num6=1;
						i++;
					}
					else {
						b10.setForeground(Color.BLUE);
						num6=0;
						i++;
					}
					chooseply();
					wingame();
				}
			});
		
		JButton b11 = new JButton("");
		b11.setFont(new Font("Arial", Font.BOLD, 80));
		frame.add(b11);
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					b11.setText(Start);
					if(Start.equalsIgnoreCase("X")) {
						b11.setForeground(Color.GREEN);
						num7=1;
						i++;
					}
					else {
						b11.setForeground(Color.BLUE);
						num7=0;
						i++;
					}
					chooseply();
					wingame();
				}
			});
		
		JButton b12 = new JButton("");
		b12.setFont(new Font("Arial", Font.BOLD, 80));
		frame.add(b12);
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					b12.setText(Start);
					if(Start.equalsIgnoreCase("X")) {
						b12.setForeground(Color.GREEN);
						num8=1;
						i++;
					}
					else {
						b12.setForeground(Color.BLUE);
						num8=0;
						i++;
					}
					chooseply();
					wingame();
				}
			});
		
		JButton b13 = new JButton("Reset");
		b13.setFont(new Font("Arial", Font.BOLD, 20));
		frame.add(b13);
		b13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b.setText(null);
				b1.setText(null);
				b2.setText(null);
				b5.setText(null);
				b6.setText(null);
				b7.setText(null);
				b10.setText(null);
				b11.setText(null);
				b12.setText(null);
				num=10;
				num1=10;
				num2=10;
				num3=10;
				num4=10;
				num5=10;
				num6=10;
				num7=10;
				num8=10;
				i=0;
			}
		});
		
		JButton b14 = new JButton("Exit");
		b14.setFont(new Font("Arial", Font.BOLD, 20));
		frame.add(b14);
		b14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm You Want To Exit","Tic Tac Toe", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) 
				{   
					System.exit(0);
				}
			}
		});
		
		frame.setSize(600,400);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setLayout(new GridLayout(3,4));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[]) {
		new TicTacToe();
	}	
}
