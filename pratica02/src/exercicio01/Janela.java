package exercicio01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 356, 153);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("N\u00FAmero 1:");
		lblNewLabel.setBounds(24, 28, 82, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero 2:");
		lblNewLabel_1.setBounds(24, 69, 82, 14);
		contentPane.add(lblNewLabel_1);

		txt1 = new JTextField();
		txt1.setBounds(96, 25, 86, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);

		txt2 = new JTextField();
		txt2.setBounds(96, 66, 86, 20);
		contentPane.add(txt2);
		txt2.setColumns(10);

		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = txt1.getText();
				String b = txt2.getText();
				Float num1 = Float.valueOf(a);
				Float num2 = Float.valueOf(b);
				Float soma = num1 + num2;
				JOptionPane.showMessageDialog(null, soma);
			}
		});
		btnNewButton.setBounds(209, 24, 41, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("x");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = txt1.getText();
				String b = txt2.getText();
				Float num1 = Float.valueOf(a);
				Float num2 = Float.valueOf(b);
				Float mult = num1 * num2;
				JOptionPane.showMessageDialog(null, mult);
			}
		});
		btnNewButton_1.setBounds(209, 65, 41, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("-");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = txt1.getText();
				String b = txt2.getText();
				Float num1 = Float.valueOf(a);
				Float num2 = Float.valueOf(b);
				Float sub = num1 - num2;
				JOptionPane.showMessageDialog(null, sub);
			}
		});
		btnNewButton_2.setBounds(260, 24, 41, 23);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("\u00F7");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = txt1.getText();
				String b = txt2.getText();
				Float num1 = Float.valueOf(a);
				Float num2 = Float.valueOf(b);
				Float div = num1 / num2;
				JOptionPane.showMessageDialog(null, div);
			}
		});
		btnNewButton_3.setBounds(260, 65, 41, 23);
		contentPane.add(btnNewButton_3);
	}

}
