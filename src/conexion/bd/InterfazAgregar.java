package conexion.bd;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazAgregar extends JFrame {

	private JPanel contentPane;
	private JTextField id;
	private JTextField nombre;
	private JTextField tel;
	ManipulandoDatos manipulador = new ManipulandoDatos();
	ConexionBD conexion=new ConexionBD();
	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public InterfazAgregar() {
		
		setBounds(100, 100, 340, 237);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID ");
		lblId.setBounds(96, 39, 46, 14);
		contentPane.add(lblId);
		
		id = new JTextField();
		id.setBounds(174, 36, 86, 20);
		contentPane.add(id);
		id.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(96, 70, 46, 14);
		contentPane.add(lblNombre);
		
		nombre = new JTextField();
		nombre.setBounds(174, 67, 86, 20);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		JLabel lblTelefono = new JLabel("telefono");
		lblTelefono.setBounds(96, 103, 46, 14);
		contentPane.add(lblTelefono);
		
		tel = new JTextField();
		tel.setBounds(174, 100, 86, 20);
		contentPane.add(tel);
		tel.setColumns(10);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String consulta=manipulador.insertarBD
						(Integer.parseInt(id.getText()),nombre.getText(), tel.getText());
						conexion.ingresar(consulta);
			}
		});
		btnAgregar.setBounds(109, 143, 89, 23);
		contentPane.add(btnAgregar);
	}
}
