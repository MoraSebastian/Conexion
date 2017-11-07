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

public class Eliminar extends JFrame {

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
	public Eliminar() {
		
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
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String consulta=manipulador.borrarRegistro(Integer.parseInt(id.getText()));
						conexion.ingresar(consulta);
			}
		});
		btnEliminar.setBounds(109, 143, 89, 23);
		contentPane.add(btnEliminar);
	}
}

