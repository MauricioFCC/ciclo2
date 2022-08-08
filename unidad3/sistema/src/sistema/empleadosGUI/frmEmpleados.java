// importar Paketes
package sistema.empleadosGUI;
import sistema.empleadosDAL.conexion;
import sistema.empleadosBL.empleadosBL;
//libreria para SQL
import java.sql.*;
//librerias para la tabla
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

public class frmEmpleados extends javax.swing.JFrame {
    
    //Importamos libreria para crear la tabla
    DefaultTableModel model;
    
    //Metodo constructor
    public frmEmpleados(){
        initComponents();
        String[] titulos = {"ID", "Name", "Email"};
        model = new DefaultTableModel(null, titulos);
        
        tblEmployees.setModel(model);
        mostrarDatos();
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployees = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDataID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployees);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel1.setText("Name");

        jLabel2.setText("Email");

        jLabel4.setText("Id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAdd)
                            .addGap(44, 44, 44)
                            .addComponent(btnEdit)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete)
                            .addGap(43, 43, 43)
                            .addComponent(btnCancel))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(txtEmail)
                        .addComponent(txtName)
                        .addComponent(txtDataID, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDataID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete)
                    .addComponent(btnCancel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        //insertar
        conexion objtConexion = new conexion(); //Conexion a la base de datos
        empleadosBL objEmpleados = recuperarDatosGUI(); //recuperar informacion de la base de datos
        String strSentenciaInsertar = String.format("INSERT INTO EMPLOYEE(dataID, name, email)" // Insertar datos
               + "VALUES ('%d', '%S', '%S')", objEmpleados.getDataID(), objEmpleados.getName(), objEmpleados.getEmail());
        objtConexion.ejecutarSentenciaSQL(strSentenciaInsertar); //Ejecuta la sentencia insertar datos
        mostrarDatos();
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeesMouseClicked
        // Seleccionar filas de tabla
        if (evt.getClickCount() == 1){
            JTable receptor = (JTable) evt.getSource();
            txtDataID.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            txtName.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            txtEmail.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_tblEmployeesMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        //borrar
        conexion objtConexion = new conexion(); //Conexion a la base de datos
        empleadosBL objEmpleados = recuperarDatosGUI(); //recuperar informacion de la base de datos
        String strSentenciaBorrar = String.format("DELETE FROM EMPLOYEE WHERE DataID = '%d'", objEmpleados.getDataID()); //eliminar datos
        objtConexion.ejecutarSentenciaSQL(strSentenciaBorrar); //Ejecuta la sentencia borrar
        this.mostrarDatos();
    }//GEN-LAST:event_btnDeleteActionPerformed
    public void mostrarDatos(){ 
        conexion objtConexion = new conexion(); //Conexion a la base de datos
        /*
        empleadosBL objEmpleados = recuperarDatosGUI(); //recuperar informacion de la base de datos
        String strSentenciaInsertar = String.format("INSERT INTO EMPLOYEE(dataID, name, email)" 
               + "VALUES ('%d', '%S', '%S')", objEmpleados.getDataID(), objEmpleados.getName(), objEmpleados.getEmail());
        objtConexion.ejecutarSentenciaSQL(strSentenciaInsertar);
        //probar la base de datos
        //objetConexion.ejecutarSentenciaSQL("INSERT INTO EMPLOYEE(dataID, name, email) VALUES(null, 'Mauricio', 'Mauricio@mauricio.com')");
        */
        try{
            ResultSet resultado = objtConexion.consultaRegistros("SELECT * FROM EMPLOYEE");
            while (resultado.next()){
                System.out.println(resultado.getString("dataID"));
                System.out.println(resultado.getString("name"));
                System.out.println(resultado.getString("email"));
                
                Object[] usuario = {
                    resultado.getString("dataID"), resultado.getString("name"), resultado.getString("email")};
                    model.addRow(usuario);
                }
            }
        catch(SQLException e){
            System.out.println(e);
        }
    }
    //Metodo de captura de datos del formulario con retorno a la base de datos
    public empleadosBL recuperarDatosGUI(){
        empleadosBL objEmpleados = new empleadosBL();
        int dataID = (txtDataID.getText().isEmpty()?0: Integer.parseInt(txtDataID.getText()));
        objEmpleados.setDataID(dataID);
        objEmpleados.setName(txtName.getText());
        objEmpleados.setEmail(txtEmail.getText());
        return objEmpleados;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmEmpleados().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmployees;
    private javax.swing.JTextField txtDataID;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
