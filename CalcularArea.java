import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcularArea extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldBase;
	private JTextField textField_Altura;
	private JLabel lblResultado;
	private JTextField textFieldRadio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcularArea frame = new CalcularArea();
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
	public CalcularArea() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Base:");
		lblNewLabel.setBounds(36, 55, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Altura:");
		lblNewLabel_1.setBounds(36, 90, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textFieldBase = new JTextField();
		textFieldBase.setBounds(108, 52, 86, 20);
		contentPane.add(textFieldBase);
		textFieldBase.setColumns(10);
		
		textField_Altura = new JTextField();
		textField_Altura.setBounds(108, 84, 86, 20);
		contentPane.add(textField_Altura);
		textField_Altura.setColumns(10);
		
		lblResultado = new JLabel("");
		lblResultado.setBounds(251, 55, 173, 14);
		contentPane.add(lblResultado);
		
		JButton btnNewButton = new JButton("Área cuadrado y rectángulo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
			            int base = Integer.parseInt(textFieldBase.getText());
			            int altura = Integer.parseInt(textField_Altura.getText());

			            int area = base * altura;

			            lblResultado.setText("Área del Rectángulo: " + area);
			        } catch (NumberFormatException ex) {
			            lblResultado.setText("Por favor, ingrese números válidos.");
			        }
			    }
		});
		btnNewButton.setBounds(108, 130, 173, 23);
		contentPane.add(btnNewButton);

		JButton btnCirculo = new JButton("Area Circulo");
		btnCirculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		try {
                    double radio = Double.parseDouble(textFieldRadio.getText());
                    double area = Math.PI * Math.pow(radio, 2);
                    
                    lblResultado.setText("Área del Círculo: " + String.format("%.3f", area));
                } catch (NumberFormatException ex) {
                	 lblResultado.setText("Por favor, ingrese números válidos.");
                }

			}
		});
		btnCirculo.setBounds(108, 205, 173, 23);
		contentPane.add(btnCirculo);
		
		JLabel lblRadio = new JLabel("Radio:");
		lblRadio.setBounds(36, 183, 46, 14);
		contentPane.add(lblRadio);
		
		textFieldRadio = new JTextField();
		textFieldRadio.setColumns(10);
		textFieldRadio.setBounds(108, 174, 86, 20);
		contentPane.add(textFieldRadio);
		
		
	}
}
