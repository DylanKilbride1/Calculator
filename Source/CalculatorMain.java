import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;


public class CalculatorMain extends JFrame {

	private JPanel contentPane;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JButton btnDivision;
	private JButton btnNo9;
	private JButton btnNo8;
	private JButton btnNo7;
	private JButton btnMultiplication;
	private JButton btnNo6;
	private JButton btnNo5;
	private JButton btnNo4;
	private JButton btnSub;
	private JButton btnNo3;
	private JButton btnNo2;
	private JButton btnNo1;
	private JButton btnAdd;
	private JButton btnEquals;
	private JButton btnNo0;
	private JButton btnClear;
	private JTextField textField;
	private Color numberColour = new Color(220, 220, 220);
	private Color operatorColour = new Color(193, 213, 255);
	private JTextField partEquationTextField;
	private String partOneString;
	private String partTwoString;
	private String answerString;
	private double partOneDouble;
	private double partTwoDouble;
	private double answerDouble;
	private Integer ifAnsIsWhole;
	private DecimalFormat numberFormat = new DecimalFormat("#.###########");
	private JButton btnDecimal;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorMain frame = new CalculatorMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculatorMain() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(6, 4, 0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Arial", Font.PLAIN, 40));
		textField.setEditable(false);
		panel_1.add(textField);
		textField.setColumns(10);
		
		panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.activeCaption);
		contentPane.add(panel_2);
		
		partEquationTextField = new JTextField();
		partEquationTextField.setForeground(new Color(30, 144, 255));
		partEquationTextField.setFont(new Font("Arial", Font.BOLD, 15));
		partEquationTextField.setEditable(false);
		partEquationTextField.setBackground(new Color(200, 200, 200));
		panel_2.add(partEquationTextField);
		partEquationTextField.setColumns(20);
		
		panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		btnNo7 = new JButton("7");
		btnNo7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		btnNo7.setBackground(Color.white);
		btnNo7.setFont(new Font("Arial", Font.BOLD, 23));
		panel_3.add(btnNo7);
		btnNo7.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	btnNo7.setBackground(numberColour);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	btnNo7.setBackground(Color.WHITE);
		    }
		});
		
		btnNo8 = new JButton("8");
		btnNo8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		btnNo8.setBackground(Color.white);
		btnNo8.setFont(new Font("Arial", Font.BOLD, 23));
		panel_3.add(btnNo8);
		btnNo8.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	btnNo8.setBackground(numberColour);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	btnNo8.setBackground(Color.white);
		    }
		});
		
		btnNo9 = new JButton("9");
		btnNo9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		btnNo9.setBackground(Color.white);
		btnNo9.setFont(new Font("Arial", Font.BOLD, 23));
		panel_3.add(btnNo9);
		btnNo9.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	btnNo9.setBackground(numberColour);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	btnNo9.setBackground(Color.white);
		    }
		});
		
		btnDivision = new JButton("\u00F7");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				partOneString = textField.getText();
				partOneDouble = Double.parseDouble(partOneString);
				
				partEquationTextField.setText(textField.getText() + " \u00F7 ");
				textField.setText("");
			}
		});
		btnDivision.setBackground(operatorColour);
		btnDivision.setFont(new Font("Arial", Font.BOLD, 23));
		panel_3.add(btnDivision);
		
		panel_4 = new JPanel();
		contentPane.add(panel_4);
		panel_4.setLayout(new GridLayout(1, 0, 0, 0));
		
		btnNo4 = new JButton("4");
		btnNo4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		btnNo4.setBackground(Color.white);
		btnNo4.setFont(new Font("Arial", Font.BOLD, 23));
		panel_4.add(btnNo4);
		btnNo4.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	btnNo4.setBackground(numberColour);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	btnNo4.setBackground(Color.white);
		    }
		});
		
		btnNo5 = new JButton("5");
		btnNo5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		btnNo5.setBackground(Color.white);
		btnNo5.setFont(new Font("Arial", Font.BOLD, 23));
		panel_4.add(btnNo5);
		btnNo5.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	btnNo5.setBackground(numberColour);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	btnNo5.setBackground(Color.white);
		    }
		});
		
		btnNo6 = new JButton("6");
		btnNo6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		btnNo6.setBackground(Color.white);
		btnNo6.setFont(new Font("Arial", Font.BOLD, 23));
		panel_4.add(btnNo6);
		btnNo6.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	btnNo6.setBackground(numberColour);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	btnNo6.setBackground(Color.white);
		    }
		});
		
		btnMultiplication = new JButton("x");
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				partOneString = textField.getText();
				partOneDouble = Double.parseDouble(partOneString);
				
				partEquationTextField.setText(textField.getText() + " * ");
				textField.setText("");
			}
		});
		btnMultiplication.setBackground(operatorColour);
		btnMultiplication.setFont(new Font("Arial", Font.BOLD, 23));
		panel_4.add(btnMultiplication);
		
		panel_5 = new JPanel();
		contentPane.add(panel_5);
		panel_5.setLayout(new GridLayout(1, 0, 0, 0));
		
		btnNo1 = new JButton("1");
		btnNo1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		btnNo1.setBackground(Color.white);
		btnNo1.setFont(new Font("Arial", Font.BOLD, 23));
		panel_5.add(btnNo1);
		btnNo1.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	btnNo1.setBackground(numberColour);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	btnNo1.setBackground(Color.white);
		    }
		});
		
		btnNo2 = new JButton("2");
		btnNo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		btnNo2.setBackground(Color.white);
		btnNo2.setFont(new Font("Arial", Font.BOLD, 23));
		panel_5.add(btnNo2);
		btnNo2.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	btnNo2.setBackground(numberColour);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	btnNo2.setBackground(Color.white);
		    }
		});
		
		btnNo3 = new JButton("3");
		btnNo3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		btnNo3.setBackground(Color.white);
		btnNo3.setFont(new Font("Arial", Font.BOLD, 23));
		panel_5.add(btnNo3);
		btnNo3.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	btnNo3.setBackground(numberColour);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	btnNo3.setBackground(Color.white);
		    }
		});
		
		btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				partOneString = textField.getText();
				partOneDouble = Double.parseDouble(partOneString);
				
				partEquationTextField.setText(textField.getText() + " - ");
				textField.setText("");
			}
		});
		btnSub.setBackground(operatorColour);
		btnSub.setFont(new Font("Arial", Font.BOLD, 23));
		panel_5.add(btnSub);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				partEquationTextField.setText("");
			}
		});
		btnClear.setBackground(operatorColour);
		btnClear.setFont(new Font("Arial", Font.BOLD, 23));
		panel.add(btnClear);
		
		btnNo0 = new JButton("0");
		btnNo0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		
		btnDecimal = new JButton(".");
		btnDecimal.setBackground(new Color(255, 255, 255));
		btnDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + ".");
			}
		});
		btnDecimal.setFont(new Font("Arial", Font.BOLD, 30));
		panel.add(btnDecimal);
		btnDecimal.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	btnDecimal.setBackground(numberColour);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	btnDecimal.setBackground(Color.white);
		    }
		});
		
		btnNo0.setBackground(Color.white);
		btnNo0.setFont(new Font("Arial", Font.BOLD, 23));
		panel.add(btnNo0);
		btnNo0.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	btnNo0.setBackground(numberColour);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	btnNo0.setBackground(Color.white);
		    }
		});
		
		btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Complete Equation
				
				partTwoString = textField.getText();
				partTwoDouble = Double.parseDouble(partTwoString);
				
				if(partEquationTextField.getText().contains("+")){
					
					answerDouble = partOneDouble + partTwoDouble;
					if(answerDouble % 1 == 0){
						ifAnsIsWhole = (int) answerDouble;
						answerString = Integer.toString(ifAnsIsWhole);
					} else {
						answerString = Double.toString(answerDouble);
					}
				
					textField.setText(answerString);
					partEquationTextField.setText(partOneString + " + " + (int)partTwoDouble);
				
				} else if(partEquationTextField.getText().contains("*")){
					
					answerDouble = partOneDouble * partTwoDouble;
					if(answerDouble % 1 == 0){
						ifAnsIsWhole = (int) answerDouble;
						answerString = Integer.toString(ifAnsIsWhole);
					} else {
						answerString = Double.toString(answerDouble);
					}
				
					textField.setText(answerString);
					partEquationTextField.setText(partOneString + " * " + (int)partTwoDouble);
						
				} else if(partEquationTextField.getText().contains("\u00F7")){
					
					//answerDouble = partOneDouble / partTwoDouble;
					String newAns = numberFormat.format(partOneDouble / partTwoDouble); //rounds to 7 decimal places - updated to perfrom calculation inside function
					if(answerDouble % 1 == 0){
						ifAnsIsWhole = (int) answerDouble;
						answerString = Integer.toString(ifAnsIsWhole);
					} else {
						answerString = Double.toString(answerDouble);
					}
				
					textField.setText(newAns);
					partEquationTextField.setText(partOneString + " \u00F7 " + (int)partTwoDouble);
						
				} else if(partEquationTextField.getText().contains("-")){
					
					answerDouble = partOneDouble - partTwoDouble;
					if(answerDouble % 1 == 0){
						ifAnsIsWhole = (int) answerDouble;
						answerString = Integer.toString(ifAnsIsWhole);
					} else {
						answerString = Double.toString(answerDouble);
					}
				
					textField.setText(answerString);
					partEquationTextField.setText(partOneString + " - " +  (int)partTwoDouble);
						
				}
				
			}
		});
		btnEquals.setBackground(operatorColour);
		btnEquals.setFont(new Font("Arial", Font.BOLD, 23));
		panel.add(btnEquals);
		
		btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				partOneString = textField.getText();
				partOneDouble = Double.parseDouble(partOneString);
				
				partEquationTextField.setText(textField.getText() + " + ");
				textField.setText("");
				
			}
		});
		btnAdd.setBackground(operatorColour);
		btnAdd.setFont(new Font("Arial", Font.BOLD, 23));
		panel.add(btnAdd);
	}

}
