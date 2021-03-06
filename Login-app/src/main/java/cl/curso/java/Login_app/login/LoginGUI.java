package cl.curso.java.Login_app.login;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginGUI extends JFrame {

	private static final long serialVersionUID = 6814847342458132255L;
	private JPanel contentPane;
	private JTextField nombreUsuario;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI frame = new LoginGUI();
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
	public LoginGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nombreUsuario = new JTextField();
		nombreUsuario.setBounds(132, 166, 188, 26);
		contentPane.add(nombreUsuario);
		nombreUsuario.setColumns(10);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(131, 224, 188, 26);
		contentPane.add(password);
		
		JLabel lblUsuario = new JLabel("Nombre de usuario");
		lblUsuario.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblUsuario.setBounds(155, 142, 140, 16);
		contentPane.add(lblUsuario);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblPassword.setBounds(189, 204, 71, 16);
		contentPane.add(lblPassword);
		
		JLabel lblInicioDeSesion = new JLabel("Inicio de Sesion");
		lblInicioDeSesion.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblInicioDeSesion.setBounds(128, 27, 179, 42);
		contentPane.add(lblInicioDeSesion);
		
		JLabel lblIngreseSusDatos = new JLabel("Ingrese sus datos para ingresar al sistema");
		lblIngreseSusDatos.setBounds(85, 62, 279, 50);
		contentPane.add(lblIngreseSusDatos);
		
		JLabel mensaje = new JLabel("");
		mensaje.setBounds(94, 338, 261, 16);
		contentPane.add(mensaje);
		
		JButton btnIniciarSesion = new JButton("Iniciar Sesion");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario usuario = new Usuario();
				usuario.setUsuario(nombreUsuario.getText());
				usuario.setPassword( password.getText() );
				
				try {
					UsuarioFacade.login(usuario);
				} catch (AutenticacionException e1) {
					JOptionPane.showMessageDialog(null,
							e1.getMessage(), "Error", 
							JOptionPane.ERROR_MESSAGE);
					nombreUsuario.setText( "" );
					password.setText("");
				} catch (CuentaBloqueadaException e1) {

					JOptionPane.showMessageDialog(null,
							e1.getMessage(), "Error", 
							JOptionPane.ERROR_MESSAGE);
					nombreUsuario.setText( "" );
					password.setText("");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnIniciarSesion.setBounds(167, 276, 117, 29);
		contentPane.add(btnIniciarSesion);
		
		
	}
}
