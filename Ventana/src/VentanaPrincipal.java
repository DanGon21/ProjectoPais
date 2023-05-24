
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author chave
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    static final String USER = "a21dangonsem_pais";
    static final String PWD = "Pais12345";
    static final String URL = "labs.inspedralbes.cat";
    static final String PORT = "3306";
    static final String BD_NAME = "a21dangonsem_Pais";

    static BDConnection bdCon;
    static PaisTable pt;
    static CiudadTable ct;
    static PaisEntity pe;
    static DefaultListModel model = new DefaultListModel();
    static DefaultListModel model2 = new DefaultListModel();

    /**
     * Creates new form VentanaPrincipal
     *
     * @throws NullConnectionException
     * @throws java.sql.SQLException
     */
    public VentanaPrincipal() throws NullConnectionException, SQLException {
        initComponents();
        listaPais.setModel(model);
        ArrayList<PaisEntity> pais;
        pais = pt.GetAll();
        listaCiudades.setModel(model2);
        for (PaisEntity pai : pais) {
            modificarlistaPais(this);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Codi = new javax.swing.JLabel();
        Nom = new javax.swing.JLabel();
        Europa = new javax.swing.JLabel();
        Poblacio = new javax.swing.JLabel();
        codi = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        europa = new javax.swing.JRadioButton();
        afegir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPais = new javax.swing.JList<>();
        buttonEdit = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaCiudades = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        buttonCerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        poblacio = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Codi.setText("Codi");

        Nom.setText("Nom");

        Europa.setText("Pertany a Europa");

        Poblacio.setText("Poblacio");

        europa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                europaActionPerformed(evt);
            }
        });

        afegir.setText("AÑADIR");
        afegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afegirActionPerformed(evt);
            }
        });

        listaPais.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaPais.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaPais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaPaisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaPais);

        buttonEdit.setText("EDITAR");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonDelete.setText("ELIMINAR");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        listaCiudades.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaCiudades.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(listaCiudades);

        jLabel1.setText("Lista Paises");

        buttonCerrar.setText("CERRAR");
        buttonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCerrarActionPerformed(evt);
            }
        });

        jLabel2.setText("Lista Ciudades ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Codi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(codi, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Poblacio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(poblacio, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonEdit, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonDelete, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(afegir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCerrar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Europa, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(europa, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(Codi))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonDelete))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Nom))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Poblacio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(poblacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Europa)
                            .addComponent(europa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(afegir)
                            .addComponent(buttonCerrar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void afegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afegirActionPerformed
        if (!europa.isSelected()) {
            pe = new PaisEntity(Integer.parseInt(this.codi.getText()), this.nom.getText(), (Integer)poblacio.getValue());
        } else {
            pe = new PaisEntity(Integer.parseInt(this.codi.getText()), this.nom.getText(), (Integer)poblacio.getValue(), this.europa.isEnabled());
        }
        try {
            pt.Insert(pe);
            confirmarCanvis(pt);
            modificarlistaPais(this);
        } catch (NullConnectionException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_afegirActionPerformed

    private void confirmarCanvis(ORMTable o) {
        int ventanaYesNo = JOptionPane.showConfirmDialog(null, "¿Quieres confirmar este cambio?", "Valores", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (ventanaYesNo == 0) {
            try {
                o.Validar();
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (ventanaYesNo == 1) {
            try {
                o.Cancelar();
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        int indice = listaPais.getSelectedIndex();
        try {
            pe = pt.GetAll().get(indice);
            pt.Delete(pe);
            confirmarCanvis(pt);
            modificarlistaPais(this);
        } catch (NullConnectionException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void europaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_europaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_europaActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        int indice = listaPais.getSelectedIndex();
        try {
            PaisEntity paiseleccionado = pt.GetAll().get(indice);
            JTextField nomTextOption = new JTextField(paiseleccionado.getNom());
            JSpinner poblacionOption = new JSpinner(new SpinnerNumberModel(0,0,450000000,1));
            poblacionOption.setValue(paiseleccionado.getPoblacion());
            JRadioButton europaButton = new JRadioButton("", paiseleccionado.isEuropa());
            Object[] paismensaje = {
                "Nom: ", nomTextOption,
                "Poblacion: ", poblacionOption,
                "Pertenece a Europa: ", europaButton
            };
            int option = JOptionPane.showConfirmDialog(null, paismensaje, "Update Pais", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                String nom = nomTextOption.getText();
                int poblacion = (Integer) poblacionOption.getValue();
                boolean europa = europaButton.isSelected();
                PaisEntity paisActualizar = new PaisEntity(paiseleccionado.getCodi(), nom, poblacion, europa);
                pt.Update(paisActualizar);
                confirmarCanvis(pt);
                modificarlistaPais(this);
                modificarlistaCiudad(this, paiseleccionado);
                listaPais.setSelectedIndex(indice);

            }
        } catch (NullConnectionException | SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCerrarActionPerformed
        super.dispose();
    }//GEN-LAST:event_buttonCerrarActionPerformed

    private void listaPaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPaisMouseClicked
        int indice = listaPais.getSelectedIndex();

        try {
            modificarlistaCiudad(this, pt.GetAll().get(indice));
        } catch (NullConnectionException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listaPaisMouseClicked

    public static void modificarlistaPais(VentanaPrincipal VP) throws NullConnectionException, SQLException {
        ArrayList<PaisEntity> listPA = pt.GetAll();
        DefaultListModel<String> listmodel = new DefaultListModel();

        for (PaisEntity paE : listPA) {
            String paisString = paE.getCodi() + ", " + paE.getNom() + ", " + paE.getPoblacion() + (paE.isEuropa() ? " + pertenece a europa" : "");
            listmodel.addElement(paisString);
        }
        VP.listaPais.setModel(listmodel);
    }

    public void modificarlistaCiudad(VentanaPrincipal VP, PaisEntity pe) throws NullConnectionException, SQLException {
        ArrayList<CiudadEntity> listCA = ct.GetAllByPais(pe);
        DefaultListModel<String> listmodel = new DefaultListModel();
        for (CiudadEntity ciE : listCA) {
            String ciudadString = ciE.getNom() + ", " + ciE.getPoblacion();
            listmodel.addElement(ciudadString);
        }
        VP.listaCiudades.setModel(listmodel);
    }

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

            //Crear la connexió a la BD
            bdCon = new BDConnection(URL, PORT, BD_NAME, USER, PWD);
            pt = new PaisTable();
            pt.setConnection(bdCon);
            ct = new CiudadTable();
            ct.setConnection(bdCon);
        } catch (ClassNotFoundException ce) {
            System.out.println("Error al carregar el driver");
        } catch (SQLException se) {
            System.out.println("Excepcio: ");
            System.out.println();
            System.out.println("El getSQLState es: " + se.getSQLState());
            System.out.println();
            System.out.println("El getMessage es: " + se.getMessage());
        }
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VentanaPrincipal().setVisible(true);
                } catch (NullConnectionException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Codi;
    private javax.swing.JLabel Europa;
    private javax.swing.JLabel Nom;
    private javax.swing.JLabel Poblacio;
    private javax.swing.JButton afegir;
    private javax.swing.JButton buttonCerrar;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JTextField codi;
    private javax.swing.JRadioButton europa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaCiudades;
    private javax.swing.JList<String> listaPais;
    private javax.swing.JTextField nom;
    private javax.swing.JSpinner poblacio;
    // End of variables declaration//GEN-END:variables
}
