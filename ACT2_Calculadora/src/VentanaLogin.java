import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class VentanaLogin extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JPasswordField password;
	private JButton botonOK, botonCancelar;
	
	private JTextField pantallaResultado;
	DecimalFormat formato = new DecimalFormat("#.####");

	//VENTANA DE LOGIN QUE RECIBE EL TEXTO DE LA PANTALLA DE LA CALCULADORA
	public VentanaLogin(JTextField num1) {
		this.pantallaResultado = num1;		
		
		//FORMA Y ESTILO DE LA VENTANA
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setForeground(new Color(255, 255, 255));
		contentPanel.setBackground(new Color(0, 0, 0));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setTitle("CalculaAPP");
		setResizable(false);
		inicializarComponentes();	
		setVisible(true);
		}
		
		//INICIALIZAMOS
		private void inicializarComponentes() {
			//CAMPO DE LA CONTRASEÑA
			password = new JPasswordField();
			password.setBounds(80, 82, 268, 62);
			contentPanel.add(password);		
			
			//BOTON CANCELAR
			botonCancelar = new JButton("BORRAR");			
			botonCancelar.setForeground(new Color(255, 140, 0));
			botonCancelar.setFont(new Font("Tahoma", Font.BOLD, 13));
			botonCancelar.setBounds(223, 155, 125, 23);
			contentPanel.add(botonCancelar);
			
			//BOTON OK PARA VALIDAR PASSWORD
			botonOK = new JButton("INTRODUCIR");			
			botonOK.setFont(new Font("Tahoma", Font.BOLD, 13));
			botonOK.setForeground(new Color(255, 140, 0));
			botonOK.setBounds(80, 155, 125, 23);
			contentPanel.add(botonOK);
			
			//FUNCIONALIDAD BOTON OK
			botonOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//Guardamos en un String el valor de la contraseña introducida
					String contrasena = String.copyValueOf(password.getPassword());
					
					// Establecemos que la contraseña correcta sea avengers. En caso de serlo, se dará paso a la operación
					if(contrasena.equals("avengers")) {		
						
						try {
						// Esta ventana será la que realice la operación con el número que le ha llegado por pantalla desde la ventana principal
						// Convertimos a Double el valor en string de la caja de texto del número
						double numero = Double.parseDouble(pantallaResultado.getText());
						// Calculamos la raíz cuadrada
						double raízCuadrada = Math.cbrt(numero);
						
						// Asignamos a la JLabel que contendrá el resultado del valor de la operación, que saldrá en la etiqueta de la VentanaPrincipal
						pantallaResultado.setText("Resultado: " + formato.format(raízCuadrada));

						// Hacemos que la ventana desaparezca (se cierra) para dar paso a la operación de la calculadora
						dispose();
						
						}
					
						catch (Exception e1) {
							JOptionPane.showMessageDialog(botonOK, "Introduce un número");
							dispose();
						}

					} else {
						setTitle("Contraseña incorrecta, vuelva a introducirla:");
						
						password.setText("");
						password.requestFocus();
						
					}
				}
			});
			
			//FUNCIONALIDAD BOTON CANCELAR
			botonCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {					
					
						password.setText("");
						password.requestFocus();
						
					}
				});	

		
		}
		{
					
		
		}
		
		
		
}
