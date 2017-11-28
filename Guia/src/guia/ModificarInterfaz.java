/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia;

import javax.swing.JOptionPane;

/**
 *
 * @author Victoria
 */
public class ModificarInterfaz extends javax.swing.JFrame {
    ManipulandoDatos manipulador = new ManipulandoDatos();
    ConexionBD conexion = new ConexionBD ();
    /**
     * Creates new form NuevaGuia
     */
    
    
    public ModificarInterfaz() {
        initComponents();
        conexion.ConsultarLista(ID, "Guia");
        conexion.ConsultarLista(id_cliente, "Cliente");
        conexion.ConsultarLista(id_empleado, "Empleado");
        conexion.ConsultarLista(id_aseguradora, "Aseguradora");
        conexion.ConsultarLista(id_embalaje, "Embalaje");
        conexion.ConsultarLista(id_delicado, "Delicado");
        conexion.ConsultarLista(id_orden, "Orden");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id_cliente = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        id_empleado = new javax.swing.JComboBox<>();
        Estado = new javax.swing.JLabel();
        id_delicado = new javax.swing.JComboBox<>();
        id = new javax.swing.JLabel();
        id_aseguradora = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        id_embalaje = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        id_orden = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        ID = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("ID:");

        jLabel2.setText("Id cliente: ");

        id_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\t", " " }));

        jLabel3.setText("Id empleado");

        id_empleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\t", " " }));
        id_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_empleadoActionPerformed(evt);
            }
        });

        Estado.setText("Id estado");

        id_delicado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\t", " " }));
        id_delicado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_delicadoActionPerformed(evt);
            }
        });

        id.setText("Id aseguradora");

        id_aseguradora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\t", " " }));
        id_aseguradora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_aseguradoraActionPerformed(evt);
            }
        });

        jLabel4.setText("Id embalaje");

        id_embalaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\t", " " }));

        jLabel5.setText("Id ordenServicio");

        id_orden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\t", " " }));
        id_orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_ordenActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id_delicado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id_aseguradora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id_embalaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id_orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jButton1)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(id_orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(id_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Estado)
                    .addComponent(id_delicado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id)
                    .addComponent(id_aseguradora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(id_embalaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_empleadoActionPerformed
       
    }//GEN-LAST:event_id_empleadoActionPerformed

    private void id_delicadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_delicadoActionPerformed
         if((int)id_delicado.getSelectedItem()==2){
            id_aseguradora.setEnabled(false);
            id_aseguradora.setSelectedItem(null);
        }
         
    }//GEN-LAST:event_id_delicadoActionPerformed

    private void id_ordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_ordenActionPerformed
        if(!id_orden.getSelectedItem().equals(" ")){
            id_cliente.setEnabled(false);
        }
    }//GEN-LAST:event_id_ordenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        GuiaModelo guia = new GuiaModelo();
        guia.setId((int)(ID.getSelectedItem()));
        guia.setId_aseguradora((int)(id_aseguradora.getSelectedItem()));
        guia.setId_cliente((int)(id_cliente.getSelectedItem()));
        guia.setId_empleado((int)(id_empleado.getSelectedItem()));
        guia.setId_estadoDelicado((int)(id_delicado.getSelectedItem()));
        guia.setId_embalaje((int)(id_embalaje.getSelectedItem()));
        guia.setId_aseguradora((int)(id_orden.getSelectedItem()));  
        
        conexion.ingresar(manipulador.actualizarBD(guia));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void id_aseguradoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_aseguradoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_aseguradoraActionPerformed
   
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String args[]) {
    
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarInterfaz().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Estado;
    private javax.swing.JComboBox<String> ID;
    private javax.swing.JLabel id;
    private javax.swing.JComboBox<String> id_aseguradora;
    private javax.swing.JComboBox<String> id_cliente;
    private javax.swing.JComboBox<String> id_delicado;
    private javax.swing.JComboBox<String> id_embalaje;
    private javax.swing.JComboBox<String> id_empleado;
    private javax.swing.JComboBox<String> id_orden;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables



}
