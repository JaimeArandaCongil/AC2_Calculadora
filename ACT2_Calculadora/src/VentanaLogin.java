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


	/**
	 * Create the dialog.
	 */
	public VentanaLogin(JTextField num1) {
		this.pantallaResultado = num1;		
		
		
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
			//CAMPO DE LA CONTRASE�A
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
					
					//Guardamos en un String el valor de la contrase�a introducida
					String contrasena = String.copyValueOf(password.getPassword());
					
					// Establecemos que la contrase�a correcta sea avengers. En caso de serlo, se dar� paso a la operaci�n
					if(contrasena.equals("avengers")) {		
						
						try {
						// Esta ventana ser� la que realice la operaci�n con el n�mero que le ha llegado por pantalla desde la ventana principal
						// Convertimos a Double el valor en string de la caja de texto del n�mero
						double numero = Double.parseDouble(pantallaResultado.getText());
						// Calculamos la ra�z cuadrada
						double ra�zCuadrada = Math.cbrt(numero);
						
						// Asignamos a la JLabel que contendr� el resultado del valor de la operaci�n, que saldr� en la etiqueta de la VentanaPrincipal
						pantallaResultado.setText("Resultado: " + formato.format(ra�zCuadrada));

						// Hacemos que la ventana desaparezca (se cierra) para dar paso a la operaci�n de la calculadora
						dispose();
						
						}
					
						catch (Exception e1) {
							JOptionPane.showMessageDialog(botonOK, "Introduce un n�mero");
							dispose();
						}

					} else {
						setTitle("Contrase�a incorrecta, vuelva a introducirla:");
						
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
