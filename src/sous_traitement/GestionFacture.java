/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sous_traitement;

import donnee.base_de_donnee;
import donneeConsulter.check;
import java.awt.HeadlessException;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.Date;
import static java.sql.JDBCType.NULL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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

public class GestionFacture extends javax.swing.JFrame {

    /**
     * Creates new form GestionFacture
     */
    base_de_donnee connex = new base_de_donnee();
    Connection db;
    ResultSet rs;
    Statement st;
    DefaultTableModel Model = new DefaultTableModel();
    public GestionFacture() {
        initComponents();
        jam();
        check();
        Fillcomboclient();
        Model.addColumn("Chambre");
        Model.addColumn("client");
        Model.addColumn("date de facture");
        Model.addColumn("type de paiement");
        Model.addColumn("montant");
        Model.addColumn("QTE");
        Model.addColumn("total_payer");
        
        
        try{
            st = connex.getconnexion().createStatement();
            rs = st.executeQuery("select client.Nom , chambre.numChambre, facture.DateFacture , facture.typepaiement , facture.Montant, facture.qte, facture.mntTTC from client, chambre inner join facture where client.idclient = facture.idClient and chambre.idChambre = facture.idChambre");
            while(rs.next()){
                Model.addRow(new Object[]{ rs.getString("numChambre"),rs.getString("Nom"),rs.getString("DateFacture"),rs.getString("typepaiement"),rs.getString("Montant"), rs.getString("qte"), rs.getString("mntTTC")});
               
            }
            
        }catch(SQLException e){System.err.println(e);}
        facture.setModel(Model);
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
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        m = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        facture = new javax.swing.JTable();
        tpaie = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        dfact = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        listclient = new javax.swing.JComboBox<>();
        listchambre = new javax.swing.JComboBox<>();
        suite = new javax.swing.JLabel();
        ss = new javax.swing.JLabel();
        ss1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        recepice = new javax.swing.JTextArea();
        jButton7 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        quant = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        mntTTC = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("interface du Chef de reception Gestion des factures");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(51, 204, 0));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sous_traitement/Save_37110.png"))); // NOI18N
        jButton1.setText("enregistrer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 200, 60));

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("type de paiement");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("date de facture");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sous_traitement/go-back256_24856.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, -1, -1));

        m.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 150, -1));

        jButton3.setBackground(new java.awt.Color(51, 204, 0));
        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sous_traitement/editnote_pencil_edi_6175.png"))); // NOI18N
        jButton3.setText("modifier");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 160, -1));

        jButton4.setBackground(new java.awt.Color(51, 204, 0));
        jButton4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sous_traitement/blue_update_arrow_right_12427.png"))); // NOI18N
        jButton4.setText("actualiser");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, 160, 50));

        facture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        facture.setModel(new javax.swing.table.DefaultTableModel(
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
        facture.setShowHorizontalLines(true);
        facture.setShowVerticalLines(true);
        facture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                factureMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(facture);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 440, 170));

        tpaie.setBackground(new java.awt.Color(204, 204, 255));
        tpaie.setFont(new java.awt.Font("Nirmala UI Semilight", 3, 12)); // NOI18N
        tpaie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Espece", "Cheque", "Carte electronique", "Mobile money" }));
        tpaie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpaieActionPerformed(evt);
            }
        });
        jPanel1.add(tpaie, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 150, -1));

        jLabel7.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setText("chambre");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 70, -1));

        dfact.setBackground(new java.awt.Color(204, 204, 255));
        dfact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dfactActionPerformed(evt);
            }
        });
        jPanel1.add(dfact, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 150, -1));

        jLabel8.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 204));
        jLabel8.setText("client");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\guerin\\Pictures\\LOGO PRINTEMP.png")); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 380, 140, 130));

        jButton5.setBackground(new java.awt.Color(51, 204, 0));
        jButton5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sous_traitement/icons8-annuler-40.png"))); // NOI18N
        jButton5.setText("supprimer");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 160, 60));

        listclient.setBackground(new java.awt.Color(0, 204, 255));
        listclient.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listclientItemStateChanged(evt);
            }
        });
        listclient.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                listclientPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        listclient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listclientMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listclientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listclientMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listclientMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listclientMouseReleased(evt);
            }
        });
        listclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listclientActionPerformed(evt);
            }
        });
        listclient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                listclientKeyReleased(evt);
            }
        });
        jPanel1.add(listclient, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 200, 30));

        listchambre.setBackground(new java.awt.Color(0, 204, 255));
        listchambre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119", "120" }));
        listchambre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listchambreItemStateChanged(evt);
            }
        });
        listchambre.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                listchambrePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        listchambre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listchambreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listchambreMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listchambreMousePressed(evt);
            }
        });
        listchambre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listchambreActionPerformed(evt);
            }
        });
        jPanel1.add(listchambre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 60, 40));
        jPanel1.add(suite, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, 10));
        jPanel1.add(ss, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 110, 20));
        jPanel1.add(ss1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 110, 20));

        recepice.setColumns(20);
        recepice.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        recepice.setRows(5);
        jScrollPane3.setViewportView(recepice);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 320, 250));

        jButton7.setBackground(new java.awt.Color(51, 204, 0));
        jButton7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sous_traitement/Print_icon-icons.com_73705.png"))); // NOI18N
        jButton7.setText("imprimer");
        jButton7.setContentAreaFilled(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 250, 130, 80));

        jLabel10.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("liste des factures enregistree");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 430, 30));

        jButton6.setBackground(new java.awt.Color(51, 204, 0));
        jButton6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jButton6.setText("Creer Facture");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 260, 140, 50));

        jLabel11.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 204));
        jLabel11.setText("montant");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 70, -1));

        quant.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.add(quant, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 150, -1));

        jLabel12.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 204));
        jLabel12.setText("quantite");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 70, -1));
        jPanel1.add(mntTTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 100, 20));

        jLabel13.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 204));
        jLabel13.setText("total a payer :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 110, -1));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("consulter dernieres reservaions");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
        jMenuItem1.setText("consulter");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1054, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
void actualiser(){
    try{
             Model.setRowCount(0);
             st = connex.getconnexion().createStatement();
             rs = st.executeQuery("select client.Nom , chambre.numChambre, facture.DateFacture , facture.typepaiement , facture.Montant, facture.qte, facture.mntTTC from client, chambre inner join facture where client.idclient = facture.idClient and chambre.idChambre = facture.idChambre");
                while(rs.next()){
                Model.addRow(new Object[]{ rs.getString("numChambre"),rs.getString("Nom"),rs.getString("DateFacture"),rs.getString("typepaiement"),rs.getString("Montant"), rs.getString("qte"), rs.getString("mntTTC")});
               
            
            }
            
        }catch(SQLException e){System.err.println(e);}
        facture.setModel(Model);
            m.setText("");
            tpaie.setSelectedItem(2);
            dfact.setText("");
            quant.setText("");
    }
 public void jam() {
        java.util.Date s = new java.util.Date();
        SimpleDateFormat tgl = new SimpleDateFormat("dd-MMM-yyyy");
        dfact.setText(tgl.format(s));}
 
 private void Fillcomboclient(){
        try{
           
            st = connex.getconnexion().createStatement();
            rs = st.executeQuery("select Nom from client");
            while(rs.next()){
            listclient.addItem( rs.getString("Nom"));
            }
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null, e);
        }
    }
 private void fillcomboclient1(){
 try{
            st = connex.getconnexion().createStatement();
            rs = st.executeQuery("select client.idClient from client where client.Nom = '"+listclient.getSelectedItem().toString()+"'");
            while(rs.next()){
                ss1.setText(rs.getString(1));
                ss1.setVisible(false);
            }

 }catch(SQLException e ){JOptionPane.showMessageDialog(null, e);}
 }
 private void fillcombochambre(){
        try{
            st = connex.getconnexion().createStatement();
            rs = st.executeQuery("select chambre.idChambre , tarif.Prix from chambre inner join tarif where chambre.idTarif = tarif.idTarif and numChambre = '"+listchambre.getSelectedItem().toString()+"'");
            while(rs.next()){
                ss.setText(rs.getString("idChambre"));
                m.setText(rs.getString("Prix"));
                ss.setVisible(false);
            }
           }catch(SQLException e){JOptionPane.showMessageDialog(null, e);}
    }

private void deplace(int i){
        try{
    listchambre.setSelectedItem(Model.getValueAt(i,0).toString());
    listclient.setSelectedItem(Model.getValueAt(i,1).toString());
    dfact.setText(Model.getValueAt(i,2).toString());
    tpaie.setSelectedItem(Model.getValueAt(i,3).toString());
    m.setText(Model.getValueAt(i,4).toString());
    quant.setText(Model.getValueAt(i, 5).toString());
    mntTTC.setText(Model.getValueAt(i, 6).toString());
    }catch(Exception e){System.err.println(e);
    JOptionPane.showMessageDialog(null, "erreur de modification "+ e.getLocalizedMessage());}
        }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String requete = "INSERT INTO facture (DateFacture, Montant, typepaiement , idChambre , idClient , qte , mntTTC ) values ('"+dfact.getText()+"','"+m.getText()+"','"+tpaie.getSelectedItem().toString()+"', '"+ss.getText()+"', '"+ss1.getText()+"', '"+quant.getText()+"', '"+mntTTC.getText()+"')";
        try {
            st = connex.getconnexion().createStatement();
            st.executeUpdate(requete);
            JOptionPane.showMessageDialog(null, "facture creer avec succes ");
            
        }catch (SQLException ex){
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "veuillez creer la facture avant d'enregistrer SVP !");
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
                st.executeUpdate("update facture set DateFacture='"+dfact.getText()+"', typepaiement='"+tpaie.getSelectedItem()+"',Montant='"+m.getText()+"',qte='"+quant.getText()+"' where Montant="+m.getText());
            }

        }catch(HeadlessException | SQLException e){JOptionPane.showMessageDialog(null, "erreur de modification");System.err.println(e);}

        actualiser();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        actualiser();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void factureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_factureMouseClicked
        // TODO add your handling code here:
        fillcomboclient1();
        try{
            int i;
            i =  facture.getSelectedRow();
            deplace(i);
        }catch(Exception e){JOptionPane.showMessageDialog(null, "erreur de fonctionnalite"+e.getLocalizedMessage());}
    }//GEN-LAST:event_factureMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         try{
           if(JOptionPane.showConfirmDialog(null, "vous allez supprimer une facture, voulez vous continuer ?"," facture supprimer avec success",JOptionPane.YES_NO_OPTION)== JOptionPane.OK_OPTION)
               if(dfact.getText().length() != 0){
               st.executeUpdate("delete from facture where DateFacture="+dfact.getText());
               }else{JOptionPane.showMessageDialog(null, "veuillez remplir la date de  la facture svp!");}
       }catch(HeadlessException | SQLException e){JOptionPane.showMessageDialog(null, "erreur de suppression "+e.getMessage());}
        
        actualiser();                   
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tpaieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpaieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpaieActionPerformed

    private void dfactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dfactActionPerformed
   
    }//GEN-LAST:event_dfactActionPerformed

    private void listchambreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listchambreMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_listchambreMousePressed

    private void listchambreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listchambreMouseClicked
        // TODO add your handling code here:
         
        
    }//GEN-LAST:event_listchambreMouseClicked

    private void listchambreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listchambreMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_listchambreMouseEntered

    private void listclientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listclientMouseEntered
        // TODO add your handling code here:
       
    }//GEN-LAST:event_listclientMouseEntered

    private void listclientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listclientMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_listclientMouseClicked

    private void listclientMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listclientMouseReleased
        // TODO add your handling code here:
      
    }//GEN-LAST:event_listclientMouseReleased

    private void listclientMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listclientMousePressed
        // TODO add your handling code here:
          
    }//GEN-LAST:event_listclientMousePressed

    private void listclientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listclientMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_listclientMouseExited

    private void listclientKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listclientKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_listclientKeyReleased

    private void listclientItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listclientItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_listclientItemStateChanged

    private void listchambreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listchambreItemStateChanged
        // TODO add your handling code here:
       
    }//GEN-LAST:event_listchambreItemStateChanged

    private void listchambreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listchambreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listchambreActionPerformed

    private void listclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listclientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listclientActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            // TODO add your handling code here:
            recepice.print();
        } catch (PrinterException ex) {
            Logger.getLogger(GestionFacture.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         recepice.append("Hotel le Printemps BP 600 Yaoundé TEL :237 242 66 72 68\n\n"+
                "\t Facture : "+"\n\n"+
                "Bienvenue a l'Hotel le printemps \n\n"+
                "Cher Client(e) Mr/Mdme :\t"+ listclient.getSelectedItem().toString()+
                "\n**********************************************************\n"+
                "vous allez passer un sejour debutant le : "+dfact.getText()+"\n\n"+
                "votre sejour durera : "+quant.getText()+" jour \n\n"+
                "Designation No : "+listchambre.getSelectedItem().toString()+"\n\n"+
                "le paiement a ete effectuer par : "+tpaie.getSelectedItem().toString()+"\n\n"+
                "Le montant a payer est : \n"+
                Integer.parseInt(m.getText())* Integer.parseInt(quant.getText()) +" FCFA"+
                "\n**********************************************************\n"+
                "Situé à Ekounou rue AMASIA(COLLAVINO)\n"
                );
         int resultat = Integer.parseInt(m.getText())* Integer.parseInt(quant.getText());
         mntTTC.setText(Integer.toString(resultat)+" FCFA");
    }//GEN-LAST:event_jButton6ActionPerformed

    private boolean check(){
        check c = new check();
        if(c.isVisible()){
        } else {
            this.setVisible(true);
            return true;
        }
        return false;
    }
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        check c = new check();
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void listchambrePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_listchambrePopupMenuWillBecomeInvisible
        fillcombochambre();
    }//GEN-LAST:event_listchambrePopupMenuWillBecomeInvisible

    private void listclientPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_listclientPopupMenuWillBecomeInvisible
        fillcomboclient1();
    }//GEN-LAST:event_listclientPopupMenuWillBecomeInvisible

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
            java.util.logging.Logger.getLogger(GestionFacture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionFacture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionFacture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionFacture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionFacture().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dfact;
    private javax.swing.JTable facture;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> listchambre;
    private javax.swing.JComboBox<String> listclient;
    private javax.swing.JTextField m;
    private javax.swing.JLabel mntTTC;
    private javax.swing.JTextField quant;
    private javax.swing.JTextArea recepice;
    private javax.swing.JLabel ss;
    private javax.swing.JLabel ss1;
    private javax.swing.JLabel suite;
    private javax.swing.JComboBox<String> tpaie;
    // End of variables declaration//GEN-END:variables
}
