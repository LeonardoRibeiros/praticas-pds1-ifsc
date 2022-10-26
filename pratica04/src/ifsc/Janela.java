package ifsc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtnota1;
	private JTextField txtnota2;
	private JTextField txtnota3;

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
		setBounds(100, 100, 283, 233);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtNome = new JTextField();
		txtNome.setBackground(new Color(255, 255, 255));
		txtNome.setBounds(131, 11, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtnota1 = new JTextField();
		txtnota1.setBackground(new Color(255, 255, 255));
		txtnota1.setBounds(131, 42, 86, 20);
		contentPane.add(txtnota1);
		txtnota1.setColumns(10);

		txtnota2 = new JTextField();
		txtnota2.setBackground(new Color(255, 255, 255));
		txtnota2.setBounds(131, 73, 86, 20);
		contentPane.add(txtnota2);
		txtnota2.setColumns(10);

		txtnota3 = new JTextField();
		txtnota3.setBackground(new Color(255, 255, 255));
		txtnota3.setBounds(131, 104, 86, 20);
		contentPane.add(txtnota3);
		txtnota3.setColumns(10);

		JLabel lblNewLabel = new JLabel("NOME:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBackground(new Color(64, 128, 128));
		lblNewLabel.setBounds(47, 14, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("NOTA 1:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(47, 45, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("NOTA 2:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(47, 76, 46, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("NOTA 3:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(47, 107, 46, 14);
		contentPane.add(lblNewLabel_3);

		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setForeground(new Color(64, 128, 128));
		btnCalcular.setBackground(new Color(255, 255, 255));
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.getText();

				String n1 = txtnota1.getText();
				String n2 = txtnota2.getText();
				String n3 = txtnota3.getText();
				if (n1.isEmpty() || n2.isEmpty() || n3.isEmpty()) {
					JOptionPane.showInternalMessageDialog(null, "Campo Vazio");
				}

				Float newn1 = Float.valueOf(n1);
				Float newn2 = Float.valueOf(n2);
				Float newn3 = Float.valueOf(n3);

				float media = (newn1 + newn2 + newn3) / 3;
				JOptionPane.showInternalMessageDialog(null, "A média final é: " + media);
			}
		});
		btnCalcular.setBounds(78, 150, 111, 23);
		contentPane.add(btnCalcular);
	}
}