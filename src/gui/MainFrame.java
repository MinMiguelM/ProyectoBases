/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controllers.*;
import entities.DbaTables;
import entities.DbaUsers;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import org.eclipse.persistence.config.EntityManagerProperties;

/**
 *
 * @author William
 */
public class MainFrame extends javax.swing.JFrame {
    
    private EntityManagerFactory emf;
    private String password;

    /**
     * Creates new form Frame
     */
    public MainFrame() {
        try{
            //<property name="javax.persistence.jdbc.password" value="haha"/>
            readPassword();
            Map properties = new HashMap();
            properties.put(EntityManagerProperties.JDBC_PASSWORD,password);
            emf = Persistence.createEntityManagerFactory("ProyectoBasesPU",properties);
            initComponents();
            init();
            this.setResizable(false);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.toString());
            System.exit(0);
        }
    }
    
    public void readPassword() throws IOException{
        FileInputStream in = null;
        try {
            in = new FileInputStream("data.dat");
            BufferedReader buff = new BufferedReader(new InputStreamReader(in));
            password = buff.readLine();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "File not found");
            System.exit(0);
        } finally{
            if(in != null)
                in.close();
        }
    }
    
    public void loadTable(){
        int numTables, numViews, numMViews, numTriggers;
        DbaUsersJpaController userController = new DbaUsersJpaController(emf);
        DbaTablesJpaController tablesController = new DbaTablesJpaController(emf);
        DbaTriggersJpaController triggersController = new DbaTriggersJpaController(emf);
        DbaMviewsJpaController mViewsController = new DbaMviewsJpaController(emf);
        DbaViewsJpaController ViewsController = new DbaViewsJpaController(emf);
        
        DefaultTableModel model = (DefaultTableModel)usuariosTable.getModel();
        List<DbaUsers> users = userController.getUsers();
        for (DbaUsers user : users) {
            numTables = tablesController.getNumTables(user.getUsername());
            numTriggers = triggersController.getNumTriggers(user.getUsername());
            numMViews = mViewsController.getNumMviews(user.getUsername());
            numViews = ViewsController.getNumviews(user.getUsername());
            model.addRow(new Object[]{user.getUsername(),user.getAccountStatus(),user.getDefaultTablespace(),user.getCreated(),
                numTables,numViews,numMViews,numTriggers}); // num vistas, num mViews, num triggers
        }
    }
    
    public void vaciarTabla(){
        DefaultTableModel model = new DefaultTableModel(){
            public Class getColumnClass(int indice){
                Object ob = getValueAt(0,indice);
                if(ob == null)
                    return Object.class;
                return ob.getClass();
            }
        };
        model.addColumn("USUARIO");
        model.addColumn("ESTADO");
        model.addColumn("TABLESPACE");
        model.addColumn("CREADO");
        model.addColumn("# TABLAS");
        model.addColumn("# VISTAS");
        model.addColumn("# VISTAS MAT");
        model.addColumn("# TRIGGERS");
        usuariosTable.setModel(model);
        usuariosScrollPane.setViewportView(usuariosTable);
        repaint();
    }
    
    private void init() {
        usuariosTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        usuariosTable.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event) {
                if (usuariosTable.getSelectedRow() != -1){
                    String estado = usuariosTable.getValueAt(usuariosTable.getSelectedRow(), 1).toString();

                    if (estado.equals("OPEN")) {
                        seleccionarUsuarioButton.setEnabled(true);
                    } else {
                        seleccionarUsuarioButton.setEnabled(false);
                    }
                }
                
            }
        });
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuariosPanel = new javax.swing.JPanel();
        usuariosLabel = new javax.swing.JLabel();
        usuariosScrollPane = new javax.swing.JScrollPane();
        usuariosTable = new javax.swing.JTable();
        seleccionarUsuarioButton = new javax.swing.JButton();
        actualizarUsuariosButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto - Admin. de Bases de Datos");

        usuariosPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        usuariosLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usuariosLabel.setText("Usuarios");

        usuariosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USUARIO", "ESTADO", "TABLESPACE", "CREADO", "# TABLAS", "# VISTAS", "# VISTAS MAT", "# TRIGGERS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        usuariosScrollPane.setViewportView(usuariosTable);

        seleccionarUsuarioButton.setText("Seleccionar");
        seleccionarUsuarioButton.setEnabled(false);
        seleccionarUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarUsuarioButtonActionPerformed(evt);
            }
        });

        actualizarUsuariosButton.setText("Actualizar");
        actualizarUsuariosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarUsuariosButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout usuariosPanelLayout = new javax.swing.GroupLayout(usuariosPanel);
        usuariosPanel.setLayout(usuariosPanelLayout);
        usuariosPanelLayout.setHorizontalGroup(
            usuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuariosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(usuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(usuariosPanelLayout.createSequentialGroup()
                        .addComponent(usuariosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(usuariosScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usuariosPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(actualizarUsuariosButton)
                        .addGap(18, 18, 18)
                        .addComponent(seleccionarUsuarioButton)))
                .addContainerGap())
        );
        usuariosPanelLayout.setVerticalGroup(
            usuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuariosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usuariosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuariosScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(usuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seleccionarUsuarioButton)
                    .addComponent(actualizarUsuariosButton))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usuariosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usuariosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seleccionarUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarUsuarioButtonActionPerformed
        String usuario = usuariosTable.getValueAt(usuariosTable.getSelectedRow(), 0).toString();
        TablasFrame tablasFrame = new TablasFrame(usuario);
        tablasFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tablasFrame.setLocationRelativeTo(null);
        tablasFrame.setVisible(true);
    }//GEN-LAST:event_seleccionarUsuarioButtonActionPerformed

    private void actualizarUsuariosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarUsuariosButtonActionPerformed
        vaciarTabla();
        loadTable();
    }//GEN-LAST:event_actualizarUsuariosButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarUsuariosButton;
    private javax.swing.JButton seleccionarUsuarioButton;
    private javax.swing.JLabel usuariosLabel;
    private javax.swing.JPanel usuariosPanel;
    private javax.swing.JScrollPane usuariosScrollPane;
    private javax.swing.JTable usuariosTable;
    // End of variables declaration//GEN-END:variables
}
