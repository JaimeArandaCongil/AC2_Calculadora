import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField panelresultados;
	private double resultado;	
	private String operador;
	private DecimalFormat formato = new DecimalFormat("#.####");
	

	//VENTANA PRINCIPAL
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage("calcu.png"));
		setTitle("CalculaAPP");
		setResizable(false);
		inicializarComponentes();
	}
	//INICIALIZAMOS LOS COMPONENTES
	private void inicializarComponentes() {
		
		//LOS BOTONES DIGITOS
		//BOTON 1
		JButton boton1 = new JButton("");
		boton1.setBackground(new Color(0, 0, 0));
		boton1.setBorder(new LineBorder(Color.BLACK));
		boton1.setIcon(new ImageIcon("1.png"));
		boton1.setForeground(new Color(0, 0, 0));
		boton1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		boton1.setBounds(29, 466, 65, 50);
		contentPane.add(boton1);
		//BOTON 2 	
		JButton boton2 = new JButton("");
		boton2.setIcon(new ImageIcon("2.png"));
		boton2.setBorder(new LineBorder(Color.BLACK));
		boton2.setBackground(new Color(0, 0, 0));
		boton2.setForeground(new Color(255, 255, 255));
		boton2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		boton2.setBounds(118, 466, 65, 50);
		contentPane.add(boton2);
		//BOTON 3	
		JButton boton3 = new JButton("");
		boton3.setIcon(new ImageIcon("3.png"));
		boton3.setBorder(new LineBorder(Color.BLACK));		
		boton3.setBackground(new Color(0, 0, 0));
		boton3.setForeground(new Color(255, 255, 255));
		boton3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		boton3.setBounds(206, 466, 65, 50);
		contentPane.add(boton3);
		//BOTON 4
		JButton boton4 = new JButton("");
		boton4.setIcon(new ImageIcon("4.png"));
		boton4.setBorder(new LineBorder(Color.BLACK));
		boton4.setBackground(new Color(0, 0, 0));
		boton4.setForeground(new Color(255, 255, 255));
		boton4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		boton4.setBounds(29, 388, 65, 50);
		contentPane.add(boton4);
		//BOTON 5
		JButton boton5 = new JButton("");
		boton5.setIcon(new ImageIcon("5.png"));
		boton5.setBorder(new LineBorder(Color.BLACK));
		boton5.setBackground(new Color(0, 0, 0));
		boton5.setForeground(new Color(255, 255, 255));
		boton5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		boton5.setBounds(118, 388, 65, 50);
		contentPane.add(boton5);
		//BOTON 6
		JButton boton6 = new JButton("");
		boton6.setIcon(new ImageIcon("6.png"));
		boton6.setBorder(new LineBorder(Color.BLACK));
		boton6.setBackground(new Color(0, 0, 0));
		boton6.setForeground(new Color(255, 255, 255));
		boton6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		boton6.setBounds(206, 388, 65, 50);
		contentPane.add(boton6);
		//BOTON 7	
		JButton boton7 = new JButton("");
		boton7.setIcon(new ImageIcon("7.png"));
		boton7.setBorder(new LineBorder(Color.BLACK));
		boton7.setBackground(new Color(0, 0, 0));
		boton7.setForeground(new Color(255, 255, 255));
		boton7.setFont(new Font("Tahoma", Font.BOLD, 13));
		boton7.setBounds(29, 307, 65, 50);
		contentPane.add(boton7);
		//BOTON 8
		JButton boton8 = new JButton("");
		boton8.setIcon(new ImageIcon("8.png"));
		boton8.setBorder(new LineBorder(Color.BLACK));
		boton8.setBackground(new Color(0, 0, 0));
		boton8.setForeground(new Color(255, 255, 255));
		boton8.setFont(new Font("Tahoma", Font.BOLD, 13));
		boton8.setBounds(118, 307, 65, 50);
		contentPane.add(boton8);
		//BOTON 9
		JButton boton9 = new JButton("");
		boton9.setIcon(new ImageIcon("9.png"));
		boton9.setBorder(new LineBorder(Color.BLACK));
		boton9.setBackground(new Color(0, 0, 0));
		boton9.setForeground(new Color(255, 255, 255));
		boton9.setFont(new Font("Tahoma", Font.BOLD, 13));
		boton9.setBounds(206, 307, 65, 50);
		contentPane.add(boton9);
		//BOTON 0
		JButton boton0 = new JButton("");
		boton0.setIcon(new ImageIcon("0.png"));
		boton0.setForeground(Color.BLACK);
		boton0.setBorder(new LineBorder(Color.BLACK));
		boton0.setFont(new Font("Tahoma", Font.PLAIN, 12));
		boton0.setBorder(new LineBorder(Color.BLACK));
		boton0.setBackground(Color.BLACK);
		boton0.setBounds(29, 223, 65, 50);
		contentPane.add(boton0);
		
		//BOTON PARA OBTENER RESULTADO		
		JButton botonresultado = new JButton("RESULTADO");		
		botonresultado.setBackground(new Color(0, 0, 0));
		botonresultado.setForeground(new Color(255, 255, 255));
		botonresultado.setFont(new Font("Impact", Font.PLAIN, 23));
		botonresultado.setBounds(29, 135, 242, 63);
		contentPane.add(botonresultado);
		
		//BOTON PARA BORRAR LOS DIGITOS
		JButton botonborrar = new JButton("");
		botonborrar.setIcon(new ImageIcon("C.png"));
		botonborrar.setBorder(new LineBorder(Color.BLACK));
		botonborrar.setBackground(new Color(0, 0, 0));
		botonborrar.setForeground(new Color(255, 165, 0));
		botonborrar.setFont(new Font("Tahoma", Font.BOLD, 13));		
		botonborrar.setBounds(296, 140, 65, 50);
		contentPane.add(botonborrar);
		
		//BOTON PARA DIVIDIR
		JButton botondividir = new JButton("");
		botondividir.setIcon(new ImageIcon("division.png"));
		botondividir.setBorder(new LineBorder(Color.BLACK));
		botondividir.setBackground(new Color(0, 0, 0));
		botondividir.setForeground(new Color(255, 165, 0));
		botondividir.setFont(new Font("Tahoma", Font.BOLD, 13));
		botondividir.setBounds(118, 223, 65, 50);
		contentPane.add(botondividir);
		
		//BOTON PARA MULTIPLICAR
		JButton botonmultiplicar = new JButton("");
		botonmultiplicar.setIcon(new ImageIcon("X.png"));
		botonmultiplicar.setBorder(new LineBorder(Color.BLACK));
		botonmultiplicar.setBackground(new Color(0, 0, 0));
		botonmultiplicar.setForeground(new Color(255, 165, 0));
		botonmultiplicar.setFont(new Font("Tahoma", Font.BOLD, 13));
		botonmultiplicar.setBounds(206, 223, 65, 50);
		contentPane.add(botonmultiplicar);
		
		//BOTON PARA RESTAR
		JButton botonresta = new JButton("");
		botonresta.setIcon(new ImageIcon("-.png"));
		botonresta.setBorder(new LineBorder(Color.BLACK));
		botonresta.setBackground(new Color(0, 0, 0));
		botonresta.setForeground(new Color(250, 128, 114));
		botonresta.setFont(new Font("Tahoma", Font.BOLD, 13));
		botonresta.setBounds(296, 307, 65, 50);
		contentPane.add(botonresta);
		
		//BOTON PARA SUMAR
		JButton botonsuma = new JButton("");			
		botonsuma.setIcon(new ImageIcon("+.png"));
		botonsuma.setBorder(new LineBorder(Color.BLACK));
		botonsuma.setBackground(new Color(0, 0, 0));
		botonsuma.setForeground(new Color(255, 165, 0));
		botonsuma.setFont(new Font("Tahoma", Font.BOLD, 13));
		botonsuma.setBounds(296, 388, 65, 50);
		contentPane.add(botonsuma);
		
		//BOTON PARA AÑADIR UNA COMA
		JButton botoncoma = new JButton("");
		botoncoma.setIcon(new ImageIcon("coma.png"));
		botoncoma.setBorder(new LineBorder(Color.BLACK));
		botoncoma.setBackground(new Color(0, 0, 0));
		botoncoma.setForeground(new Color(255, 165, 0));
		botoncoma.setFont(new Font("Tahoma", Font.BOLD, 13));
		botoncoma.setBounds(296, 466, 65, 50);
		contentPane.add(botoncoma);
		
		JButton botonraiz3 = new JButton("Raiz 3");
		botonraiz3.setBackground(new Color(255, 165, 0));
		botonraiz3.setBorder(new LineBorder(Color.BLACK));
		botonraiz3.setForeground(new Color(0, 0, 0));
		botonraiz3.setFont(new Font("Tahoma", Font.BOLD, 11));
		botonraiz3.setBounds(296, 248, 65, 25);
		contentPane.add(botonraiz3);		
	
		JButton botonraiz2 = new JButton("Raiz 2");
		botonraiz2.setForeground(new Color(0, 0, 0));
		botonraiz2.setBorder(new LineBorder(Color.BLACK));
		botonraiz2.setFont(new Font("Tahoma", Font.BOLD, 11));
		botonraiz2.setBackground(new Color(255, 165, 0));
		botonraiz2.setBounds(296, 223, 65, 25);
		contentPane.add(botonraiz2);
		
		//PANTALLA QUE MUESTRA LOS DIGITOS Y OPERACIONES
		panelresultados = new JTextField();
		panelresultados.setFont(new Font("Tahoma", Font.BOLD, 31));
		panelresultados.setHorizontalAlignment(SwingConstants.RIGHT);
		panelresultados.setBorder(new LineBorder(Color.BLACK));
		panelresultados.setText("0");
		panelresultados.setForeground(new Color(255, 255, 255));
		panelresultados.setBackground(new Color(0, 0, 0));
		panelresultados.setBounds(29, 43, 332, 63);
		contentPane.add(panelresultados);
		panelresultados.setColumns(10);
		
		
		//FUNCIONALIDAD BOTONES DIGITOS 1-9
		//BOTON DIGITO 1
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				if (panelresultados.getText().equals("0")) {
					panelresultados.setText("1");	
				}else {
					panelresultados.setText(panelresultados.getText() + "1");
					
				}						
			}
		});
		//BOTON DIGITO 2
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
				if (panelresultados.getText().equals("0")) {
					panelresultados.setText("2");	
				}else {
					panelresultados.setText(panelresultados.getText() + "2");
					
				}
										
			}
		});
		//BOTON DIGITO 3
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (panelresultados.getText().equals("0")) {
					panelresultados.setText("3");	
				}else {
					panelresultados.setText(panelresultados.getText() + "3");
					
				}
				
			}
		});
		//BOTON DIGITO 4
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (panelresultados.getText().equals("0")) {
					panelresultados.setText("4");	
				}else {
					panelresultados.setText(panelresultados.getText() + "4");
					
				}
				
			}
		});
		//BOTON DIGITO 5
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (panelresultados.getText().equals("0")) {
					panelresultados.setText("5");	
				}else {
					panelresultados.setText(panelresultados.getText() + "5");
					
				}
				
			}
		});
		//BOTON DIGITO 6
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (panelresultados.getText().equals("0")) {
					panelresultados.setText("6");	
				}else {
					panelresultados.setText(panelresultados.getText() + "6");
					
				}
				
			}
		});
		//BOTON DIGITO 7
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (panelresultados.getText().equals("0")) {
					panelresultados.setText("7");	
				}else {
					panelresultados.setText(panelresultados.getText() + "7");
					
				}
				
			}
		});
		//BOTON DIGITO 8
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (panelresultados.getText().equals("0")) {
					panelresultados.setText("8");	
				}else {
					panelresultados.setText(panelresultados.getText() + "8");
					
				}
				
			}
		});
		//BOTON DIGITO 9
		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (panelresultados.getText().equals("0")) {
					panelresultados.setText("9");	
				}else {
					panelresultados.setText(panelresultados.getText() + "9");
					
				}
				
			}
		});
		//BOTON DIGITO 0
		boton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (panelresultados.getText().equals("0")) {
					panelresultados.setText("0");	
				}else {
					panelresultados.setText(panelresultados.getText() + "0");
					
				}
			}
		});
		
		//FUNCIONALIDAD OPERACIONES
		//SUMA
		botonsuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				operador = "+";
				resultado = Double.parseDouble(panelresultados.getText());
				panelresultados.setText("");				
				
			}
		});
		//RESTA
		botonresta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				operador = "-";
				resultado = Double.parseDouble(panelresultados.getText());
				panelresultados.setText("");				
				
			}
		});
		//MULTIPLICACIÓN
		botonmultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				operador = "*";
				resultado = Double.parseDouble(panelresultados.getText());
				panelresultados.setText("");				
				
			}
		});
		//DIVISIÓN
		botondividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				operador = "/";
				resultado = Double.parseDouble(panelresultados.getText());
				panelresultados.setText("");				
				
			}
		});
		//PUNTO PARA DECIMALES
		botoncoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!panelresultados.getText().contains(".")) {
					if (panelresultados.getText().equals("0")) {
						panelresultados.setText(".");
					} else {
						panelresultados.setText(panelresultados.getText() + ".");
					}
				}
			}
		});
			
		//BORRAR
		botonborrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				operador = "";
				resultado = 0;
				panelresultados.setText("");				
				
			}
		});
		//LLAMA A UN MÉTODO QUE CALCULA EL RESULTADO
		botonresultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calcularResultado();			
				
			}
		});
		//SACA UN AVISO DE NO DISPONIBILIDAD
		botonraiz2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(botonraiz2, "Funcionalidad no disponible");				
				
			}
		});
		//ABRE OTRA VENTANA DE LA CLASE VentanaLogin en la que introducir una contraseña
		//Una vez acertada se podrá utilizar la operación
		botonraiz3.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {				
				// Cuando se hace click en el botón de raíz cuadrada, se crea un objeto de tipo
				// ventanaLogin, por lo que esta se creará. Se le pasan los valores de la caja de texto del número1
				// y de la etiqueta del resultado, para que puedan intercambiarse los valores entre las dos ventanas
				// La operación de raíz cúbica se realizará en la otra ventana con los valores que le llegen a trvés de estos parámetros
				// Y la ventana principal recibirá el resultado desde la ventana de login, una vez haya hecho la operación
				VentanaLogin ventanaLogin = new VentanaLogin(panelresultados);
			}		
		});
		
	    }
		//METODO QUE REALIZA LAS DIFERENTES OPERACIONES
		private void calcularResultado() {
			try {
				if (operador.equals("+")) {
					resultado += new Double(panelresultados.getText());
				} else if (operador.equals("-")) {
					resultado -= new Double(panelresultados.getText());
				} else if (operador.equals("/")) {
					resultado /= new Double(panelresultados.getText());
				} else if (operador.equals("*")) {
					resultado *= new Double(panelresultados.getText());
				}
				//CON .FORMAT LIMITAMOS EL NUMERO DE DECIMALES A 4
				panelresultados.setText("" + formato.format(resultado));
				operador = "";
			}
			
			catch (Exception e1) {
				JOptionPane.showMessageDialog(panelresultados, "Introduce un número");
			}
			
		}
	}

