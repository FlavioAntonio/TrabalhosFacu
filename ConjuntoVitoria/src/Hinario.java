import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;

public class Hinario extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hinario frame = new Hinario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Hinario() {
		setTitle("Hinario Adventista do Sentimo Dia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setToolTipText("Vamos adora ao senhor!");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblHinarioAdventistaDo = new JLabel("Hinario Adventista do Setimo dia");
		lblHinarioAdventistaDo.setToolTipText("Vamos adorar ao Senhor!");
		lblHinarioAdventistaDo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHinarioAdventistaDo.setBounds(86, 24, 264, 14);
		contentPane.add(lblHinarioAdventistaDo);

		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNumero.setBounds(12, 120, 76, 14);
		contentPane.add(lblNumero);

		textField = new JTextField();
		textField.setBounds(86, 114, 73, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.addActionListener(this);
		JLabel lblOsHinosVo = new JLabel("Hinos de 1 a 610");
		lblOsHinosVo.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblOsHinosVo.setBounds(131, 236, 197, 14);
		contentPane.add(lblOsHinosVo);
	}

	public void chamarVideo() {
		try {
			String caminhoMPlayer = "cmd.exe /c start wmplayer.exe /play /fullScreen";
			String caminhoArquivo = "C:\\Hinario/" + textField.getText() + ".mp4";
			Runtime.getRuntime().exec(caminhoMPlayer + caminhoArquivo);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		chamarVideo();
	}
}
