package resposta;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JComboBox<String> comboBox;
	private JTextArea textArea;
	private String textoTotal;

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
		setBounds(100, 100, 478, 274);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(215, 223, 223));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setBounds(102, 28, 194, 22);
		comboBox.addItem("Brasil");
		comboBox.addItem("Argentina");
		comboBox.addItem("Chile");
		comboBox.addItem("Peru");
		contentPane.add(comboBox);

		JLabel lblNewLabel = new JLabel("OPÇÕES:");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setForeground(new Color(44, 44, 44));
		lblNewLabel.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		lblNewLabel.setBounds(37, 32, 71, 14);
		contentPane.add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 73, 429, 136);
		contentPane.add(scrollPane);
		JTextArea textArea_1 = new JTextArea();
		scrollPane.setViewportView(textArea_1);
		textArea_1.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 13));

		JButton btnNewButton = new JButton("ADICIONAR");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(44, 44, 44));
		btnNewButton.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String valorSelecionado = (String) comboBox.getSelectedItem();
				if (textoTotal == null) {
					textoTotal = valorSelecionado;
				} else {
					textoTotal = textoTotal + ", " + valorSelecionado;
				}
				textArea_1.setText(textoTotal);
			}
		});
		btnNewButton.setBounds(306, 28, 133, 23);
		contentPane.add(btnNewButton);

	}
}