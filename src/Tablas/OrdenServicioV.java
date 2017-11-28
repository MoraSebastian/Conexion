package Tablas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JCalendar;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class OrdenServicioV extends JFrame {

	private JPanel contentPane;
	private JTextField txtOS;
	private JTextField txtDOS;
	private JTextField txtFecha;
	private Calendar fechaA;
	private JLabel lblEmpleado;
	private JTextField txtCosto;
	
	
	
	//Creo los objetos de cada una de las tablas
	public Aseguradora seguro = new Aseguradora();
	public Costo costo = new Costo();
	public OrdenServicio OS = new OrdenServicio();
	public DetalleOrdenServicio DOS = new DetalleOrdenServicio();
	public Embalaje embalaje = new Embalaje();
	public Persona persona = new Persona();
	public TipoServicio TS = new TipoServicio();
	public Compuesta compuesta;
	
	private JButton btnAgregar;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrdenServicioV frame = new OrdenServicioV();
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
	public OrdenServicioV() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblOrdenServicio = new JLabel("Orden Servicio");
		lblOrdenServicio.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrdenServicio.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblOrdenServicio.setBounds(100, 20, 200, 30);
		contentPane.add(lblOrdenServicio);
		
		JLabel label = new JLabel("#");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Verdana", Font.PLAIN, 14));
		label.setBounds(30, 50, 70, 30);
		contentPane.add(label);
		
		txtOS = new JTextField();
		txtOS.setEditable(false);
		txtOS.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtOS.setBounds(100, 60, 30, 30);
		contentPane.add(txtOS);
		txtOS.setColumns(10);
		fechaA = new GregorianCalendar();
		
		txtDOS = new JTextField();
		txtDOS.setEditable(false);
		txtDOS.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtDOS.setBounds(130, 60, 30, 30);
		contentPane.add(txtDOS);
		txtDOS.setColumns(10);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblFecha.setBounds(180, 60, 100, 30);
		contentPane.add(lblFecha);
		
		txtFecha = new JTextField();
		txtFecha.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtFecha.setEditable(false);
		String hoy = fechaA.get(Calendar.DATE)+"/"+fechaA.get(Calendar.MONTH)+"/"+fechaA.get(Calendar.YEAR);
		txtFecha.setText(hoy);
		txtFecha.setBounds(290, 60, 100, 30);
		contentPane.add(txtFecha);
		txtFecha.setColumns(10);
		
		lblEmpleado = new JLabel("Empleado");
		lblEmpleado.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblEmpleado.setBounds(30, 120, 150, 30);
		contentPane.add(lblEmpleado);
		
		JComboBox cbxEmpleado = new JComboBox();
		cbxEmpleado.setFont(new Font("Verdana", Font.PLAIN, 14));
		cbxEmpleado.setBounds(200, 120, 150, 30);
		contentPane.add(cbxEmpleado);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCliente.setBounds(30, 160, 150, 30);
		contentPane.add(lblCliente);
		
		JComboBox cbxCliente = new JComboBox();
		cbxCliente.setBounds(200, 160, 150, 30);
		contentPane.add(cbxCliente);
		
		JLabel lblTipoServicio = new JLabel("Tipo Servicio");
		lblTipoServicio.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblTipoServicio.setBounds(30, 200, 150, 30);
		contentPane.add(lblTipoServicio);
		
		JComboBox cbxTS = new JComboBox();
		cbxTS.setFont(new Font("Verdana", Font.PLAIN, 14));
		cbxTS.setBounds(200, 200, 150, 30);
		contentPane.add(cbxTS);
		
		JLabel lblEmbalaje = new JLabel("Embalaje");
		lblEmbalaje.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblEmbalaje.setBounds(30, 240, 150, 30);
		contentPane.add(lblEmbalaje);
		
		JComboBox cbxEmbalaje = new JComboBox();
		cbxEmbalaje.setBounds(200, 240, 150, 30);
		contentPane.add(cbxEmbalaje);
		
		JLabel lblAseguradora = new JLabel("Aseguradora");
		lblAseguradora.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblAseguradora.setBounds(30, 280, 150, 30);
		contentPane.add(lblAseguradora);
		
		JComboBox cbxAseguradora = new JComboBox();
		cbxAseguradora.setFont(new Font("Verdana", Font.PLAIN, 14));
		cbxAseguradora.setBounds(200, 280, 150, 30);
		contentPane.add(cbxAseguradora);
		
		JLabel lblCosto = new JLabel("Costo");
		lblCosto.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCosto.setBounds(30, 320, 150, 30);
		contentPane.add(lblCosto);
		
		txtCosto = new JTextField();
		txtCosto.setEditable(false);
		txtCosto.setBounds(200, 320, 150, 30);
		contentPane.add(txtCosto);
		txtCosto.setColumns(10);
		
		
		JButton btnGenerar = new JButton("Generar Orden");
		btnGenerar.setFont(new Font("Verdana", Font.PLAIN, 10));
		btnGenerar.setBounds(250, 380, 120, 25);
		contentPane.add(btnGenerar);
		
		btnAgregar = new JButton("Agregar Producto");
		btnAgregar.setFont(new Font("Verdana", Font.PLAIN, 10));
		btnAgregar.setBounds(50, 380, 142, 25);
		contentPane.add(btnAgregar);
		
		//LLeno los combobox con los datos que hay en los Array de cada uno de los objetos
		for(int i =0;i<persona.idPersona.size();i++) {
			cbxEmpleado.addItem(persona.idPersona.get(i));
			cbxCliente.addItem(persona.idPersona.get(i));
		}
		for(int i =0;i<seguro.idAseguradora.size();i++){
			cbxAseguradora.addItem(seguro.idAseguradora.get(i));
		}
		for(int i =0;i<TS.idTipoServicio.size();i++){
			cbxTS.addItem(TS.idTipoServicio.get(i));
		}
		for(int i =0;i<embalaje.idEmbalaje.size();i++){
			cbxEmbalaje.addItem(embalaje.idEmbalaje.get(i));
		}
		
		//Inicio los id cada de cada uno 
		txtOS.setText(Integer.toString(OS.idOrdenServicio.size()+1));
		txtDOS.setText("1");
		
		/***
		 * Cada vez que agrego un nuevo producto a la orden lo que hago es formar la llave compuesta 
		 * y agregar cada uno de los datos a los respectivos Array del objeto DOS
		 */
		btnAgregar.addActionListener (new ActionListener()
	       {			@Override
			public void actionPerformed(ActionEvent arg0) {
	    	   compuesta = new Compuesta(Integer.parseInt(txtOS.getText()),Integer.parseInt(txtDOS.getText()));
	    	   DOS.compuesta.add(compuesta);
	    	   DOS.aseguradora.add(cbxAseguradora.getSelectedIndex());
	    	   DOS.costo.add(Double.parseDouble(txtCosto.getText()));
	    	   DOS.embalaje.add(cbxEmbalaje.getSelectedIndex());
	    	   OS.cliente.add(cbxCliente.getSelectedIndex());
	    	   OS.empleado.add(cbxEmpleado.getSelectedIndex());
	    	   OS.fecha.add(txtFecha.getText());
	    	   txtDOS.setText(String.valueOf(Integer.parseInt(txtDOS.getText())+1));
			}
	       });
		
		/***
		 * Cuando le digo que genere la orden de Servicio aumenta el valor del txtOS y se reinicia txtDOS
		 * la idea es que cuando se generé este se devuelva como a la ventana principal en donde puedo crear guías u ordenes
		 */
		btnGenerar.addActionListener (new ActionListener()
	       {			@Override
			public void actionPerformed(ActionEvent arg0) {
	    	   txtOS.setText(String.valueOf(Integer.parseInt(txtOS.getText())+1));
	    	   txtDOS.setText("1");
			}
	       });
		
		/**
		 * Esto lo que hace es que cada que se cambie el Combo Box calcule nuevamente el peso 
		 */
		cbxEmbalaje.addActionListener (new ActionListener()
	       {			@Override
			public void actionPerformed(ActionEvent arg0) {
	    	   txtCosto.setText(Double.toString(costo.calcular(embalaje.peso.get(cbxEmbalaje.getSelectedIndex()))));
			}
	       });
		
		
	}
}
