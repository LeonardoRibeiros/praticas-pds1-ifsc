package resposta;

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
		setBounds(100, 100, 252, 189);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("N\u00FAmero 1:");
		lblNewLabel.setBounds(24, 27, 69, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero 2:");
		lblNewLabel_1.setBounds(24, 64, 69, 14);
		contentPane.add(lblNewLabel_1);

		txt1 = new JTextField();
		txt1.setBounds(103, 24, 86, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);

		txt2 = new JTextField();
		txt2.setBounds(103, 61, 86, 20);
		contentPane.add(txt2);
		txt2.setColumns(10);

		JButton btnNewButton = new JButton("SOMA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = txt1.getText();
				String num2 = txt2.getText();

				Integer new_num1 = Integer.valueOf(num1);
				Integer new_num2 = Integer.valueOf(num2);
				Integer soma = new_num1 + new_num2;
				JOptionPane.showMessageDialog(null, "A soma dos valores é " + soma);

			}
		});
		btnNewButton.setBounds(103, 104, 86, 20);
		contentPane.add(btnNewButton);
	}
}
