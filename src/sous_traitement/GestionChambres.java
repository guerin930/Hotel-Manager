/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sous_traitement;

import donnee.base_de_donnee;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import traitement.Connexion;
import traitement.interfaceChef;

/**
 *
 * @author guerin
 */
public class GestionChambres extends javax.swing.JFrame {

    /**
     * Creates new form GestionChambres
     */
    base_de_donnee connex = new base_de_donnee();
    Connection db;
    ResultSet rs;
    Statement st;
    DefaultTableModel Model = new DefaultTableModel();
    
    public GestionChambres() {
        initComponents();
        Model.addColumn("numero_chambre");
        Model.addColumn("nombre_de_place");
        Model.addColumn("Etat");
        Model.addColumn("type");
        try{
            st = connex.getconnexion().createStatement();
            rs = st.executeQuery("select * from chambre");
            while(rs.next()){
                Model.addRow(new Object[]{rs.getString("numChambre"),rs.getString("nbrPlaces"),rs.getString("Etat"),rs.getString("Type")});
               
            }
            
        }catch(Exception e){System.err.println(e);}
        chambre.setModel(Model);
    }
    private void deplace(int i){
        try{
    numCham.setText(Model.getValueAt(i,0).toString());
    nbreplace.setText(Model.getValueAt(i,1).toString());
    e.setText(Model.getValueAt(i,2).toString());
    t.setText(Model.getValueAt(i,3).toString());
    }catch(Exception e){System.err.println(e);
    JOptionPane.showMessageDialog(null, "erreur de modification"+e.getLocalizedMessage());}
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        t = new javax.swing.JTextField();
        numCham = new javax.swing.JTextField();
        nbreplace = new javax.swing.JTextField();
        e = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        chambre = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("interface du Chef de reception Gestion des Chambres");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(51, 204, 0));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sous_traitement/1486485588-add-create-new-math-sign-cross-plus_81186.png"))); // NOI18N
        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("etat");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("liste des chambres disponibles");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 460, -1));

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("nombre de place");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("type");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 40, -1));

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sous_traitement/go-back256_24856.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        t.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.add(t, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 150, -1));

        numCham.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.add(numCham, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 150, -1));

        nbreplace.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.add(nbreplace, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 150, -1));

        e.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 150, -1));

        jButton3.setBackground(new java.awt.Color(51, 204, 0));
        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sous_traitement/editnote_pencil_edi_6175.png"))); // NOI18N
        jButton3.setText("Modifier");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, -1, -1));

        jButton4.setBackground(new java.awt.Color(51, 204, 0));
        jButton4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sous_traitement/icons8-annuler-40.png"))); // NOI18N
        jButton4.setText("Supprimer");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 260, 160, 60));

        chambre.setModel(new javax.swing.table.DefaultTableModel(
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
        chambre.setShowHorizontalLines(true);
        chambre.setShowVerticalLines(true);
        chambre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chambreMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(chambre);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 470, 170));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sous_traitement/LOGO PRINTEMP.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 140, 150));

        jLabel8.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setText("numero de chambre");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 320));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
void actualiser(){
    try{
             Model.setRowCount(0);
            st = connex.getconnexion().createStatement();
            rs = st.executeQuery("select * from chambre");
            while(rs.next()){
                Model.addRow(new Object[]{rs.getString("numChambre"),rs.getString("nbrPlaces"),rs.getString("Etat"),rs.getString("Type")});
                
            }
            
        }catch(Exception e){System.err.println(e);}
        chambre.setModel(Model);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String requete = "INSERT INTO chambre (numChambre, nbrPlaces, Etat, type) values ('"+numCham.getText()+"','"+nbreplace.getText()+"','"+e.getText()+"','"+t.getText()+"')";
        try {
        st = connex.getconnexion().createStatement();
        st.executeUpdate(requete);
        JOptionPane.showMessageDialog(null, "chambre ajouter ");
        numCham.setText("");
        nbreplace.setText("");
        e.setText("");
        t.setText("");
        }catch (SQLException ex){
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);    
    }
        actualiser();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        interfaceChef C = new interfaceChef();
        C.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
            if(JOptionPane.showConfirmDialog(null, "confirmer la modification", "modification",JOptionPane.YES_NO_OPTION)== JOptionPane.OK_OPTION){
                st.executeUpdate("update chambre set numChambre='"+numCham.getText()+"',nbrPlaces='"+nbreplace.getText()+"',Etat='"+e.getText()+"',type='"+t.getText()+"'where numChambre="+numCham.getText());
        }
            
        }catch(HeadlessException | SQLException e){JOptionPane.showMessageDialog(null, "erreur de modification");System.err.println(e);}
        
        actualiser();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         try{
           if(JOptionPane.showConfirmDialog(null, "vous allez supprimer une chambre, voulez vous continuer ?","chambre supprimer avec success",JOptionPane.YES_NO_OPTION)== JOptionPane.OK_OPTION)
               if(numCham.getText().length() != 0){
               st.executeUpdate("delete from chambre where numChambre="+numCham.getText());
               }else{JOptionPane.showMessageDialog(null, "veuillez remplir le numero de chambre svp!");}
       }catch(Exception e){JOptionPane.showMessageDialog(null, "erreur de suppression"+e.getMessage());}
        
        actualiser();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void chambreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chambreMouseClicked
        // TODO add your handling code here:
        try{
           int i;
           i =  chambre.getSelectedRow();
           deplace(i);
       }catch(Exception e){JOptionPane.showMessageDialog(null, "erreur de fonctionnalite"+e.getLocalizedMessage());}
    }//GEN-LAST:event_chambreMouseClicked

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
            java.util.logging.Logger.getLogger(GestionChambres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionChambres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionChambres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionChambres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionChambres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable chambre;
    private javax.swing.JTextField e;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nbreplace;
    private javax.swing.JTextField numCham;
    private javax.swing.JTextField t;
    // End of variables declaration//GEN-END:variables
}
