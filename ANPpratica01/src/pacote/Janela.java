package pacote;
/**Leonardo Ribeiro (25/10/2022)**/
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField nome_txt;
	private JTextField cpf_txt;
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
		setBounds(100, 100, 450, 307);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 129, 134));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("PRONOME:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Maiandra GD", Font.BOLD, 11));
		lblNewLabel.setBounds(209, 22, 67, 14);
		contentPane.add(lblNewLabel);

		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setForeground(new Color(100, 129, 134));
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setBounds(275, 19, 128, 23);
		comboBox.addItem("Sr.");
		comboBox.addItem("Sra.");
		comboBox.addItem("Srta.");
		comboBox.addItem("V.S.a.");
		contentPane.add(comboBox);

		nome_txt = new JTextField();
		nome_txt.setBounds(71, 19, 128, 23);
		contentPane.add(nome_txt);
		nome_txt.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("NOME:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Maiandra GD", Font.BOLD, 11));
		lblNewLabel_1.setBounds(21, 22, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("CPF:");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Maiandra GD", Font.BOLD, 11));
		lblNewLabel_2.setBounds(21, 63, 46, 14);
		contentPane.add(lblNewLabel_2);

		cpf_txt = new JTextField();
		cpf_txt.setBounds(71, 61, 128, 23);
		contentPane.add(cpf_txt);
		cpf_txt.setColumns(10);

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(21, 100, 382, 139);
		contentPane.add(textArea_1);

		JButton btnNewButton = new JButton("ADICIONAR");
		btnNewButton.setFont(new Font("Maiandra GD", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(100, 129, 134));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = nome_txt.getText();
				String cpf = cpf_txt.getText();
				if (name.isEmpty() || cpf.isEmpty()) {
					JOptionPane.showInternalMessageDialog(null, "Campo Vazio");
				}
				nome_txt.setText("");
				cpf_txt.setText("");

				String valorSelecionado = (String) comboBox.getSelectedItem();
				if (textoTotal == null) {
					textoTotal = valorSelecionado + " " + name + " cujo cpf é " + cpf + "\n";
				} else {
					textoTotal = textoTotal + valorSelecionado + name + " cujo CPF é " + cpf + "\n";
				}
				textArea_1.setText(textoTotal);
			}
		});
		btnNewButton.setBounds(209, 61, 194, 23);
		contentPane.add(btnNewButton);

	}
}
