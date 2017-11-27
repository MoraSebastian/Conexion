package conexion.bd;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import java.awt.Color;

import javax.swing.ListSelectionModel;

public class PantallaInicio extends JFrame {

	//HOLA MUNDO CACA wtf
	
	private JPanel contentPane;
	private JTable tabla;
	ConexionBD conexion= new ConexionBD();
	ManipulandoDatos manejo = new ManipulandoDatos();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaInicio frame = new PantallaInicio();
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
	public PantallaInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 300);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(25, 11, 399, 196);
		getContentPane().add(panel);
		
		tabla = new JTable();
		tabla.setDoubleBuffered(true);
		tabla.setDragEnabled(true);
		tabla.setFocusCycleRoot(true);
		tabla.setFocusTraversalPolicyProvider(true);
		tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tabla.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		tabla.setSurrendersFocusOnKeystroke(true);
		tabla.setColumnSelectionAllowed(true);
		tabla.setFillsViewportHeight(true);
		tabla.setCellSelectionEnabled(true);
		tabla.setRowSelectionAllowed(true);
		tabla.setToolTipText("");
		panel.add(tabla);
		conexion.consultar(tabla,manejo.obtenerRegistros());
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InterfazAgregar agregar = new InterfazAgregar();
		    	agregar.setVisible(true);
		       agregar.setLocationRelativeTo(null);
			}	
		});
		btnAgregar.setBounds(35, 218, 89, 23);
		getContentPane().add(btnAgregar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Eliminar eliminar= new Eliminar();
		    	eliminar.setVisible(true);
		       eliminar.setLocationRelativeTo(null);
			}
		});
		btnEliminar.setBounds(144, 218, 89, 23);
		getContentPane().add(btnEliminar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
		        while(modelo.getRowCount()>0)
		        	{
		        	modelo.removeRow(0);
		        	}
		        TableColumnModel modCol = tabla.getColumnModel();
		        while(modCol.getColumnCount()>0){
		        	modCol.removeColumn(modCol.getColumn(0));
		        }
		        conexion.consultar(tabla,manejo.obtenerRegistros());
				
			}
		});
		btnActualizar.setBounds(279, 218, 89, 23);
		getContentPane().add(btnActualizar);
		
	}
}
