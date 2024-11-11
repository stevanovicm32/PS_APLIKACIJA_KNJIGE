/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.Controller;
import domain.Knjiga;
import domain.Zanr;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class GlavnaForma extends javax.swing.JFrame {
    private Controller controller;
    /**
     * Creates new form GlavnaForma
     */
    public GlavnaForma() {
        initComponents();
        controller = Controller.getInstance();
        ModelTabeleKnjige modelTabele = new ModelTabeleKnjige(controller.getListaKnjiga());
        tabelaKnjige.setModel(modelTabele);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaKnjige = new javax.swing.JTable();
        dugmeObrisi = new javax.swing.JButton();
        dugmeIzmeni = new javax.swing.JButton();
        dugmeDodaj = new javax.swing.JButton();
        labelaNaziv = new javax.swing.JLabel();
        labelaAutor = new javax.swing.JLabel();
        TextFieldNaziv = new javax.swing.JTextField();
        TextFieldAutor = new javax.swing.JTextField();
        labelaZanr = new javax.swing.JLabel();
        ComboBoxZanr = new javax.swing.JComboBox<>();
        CheckBoxStrip = new javax.swing.JCheckBox();
        CheckBoxNaucni = new javax.swing.JCheckBox();
        dugmeFiltriraj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaKnjige.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaKnjige);

        dugmeObrisi.setText("Obrisi");
        dugmeObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugmeObrisiActionPerformed(evt);
            }
        });

        dugmeIzmeni.setText("Izmeni");
        dugmeIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugmeIzmeniActionPerformed(evt);
            }
        });

        dugmeDodaj.setText("Dodaj");
        dugmeDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugmeDodajActionPerformed(evt);
            }
        });

        labelaNaziv.setText("Naziv");

        labelaAutor.setText("Autor");

        labelaZanr.setText("Zanr");

        ComboBoxZanr.setModel(new DefaultComboBoxModel(Zanr.values()));
        ComboBoxZanr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxZanrActionPerformed(evt);
            }
        });

        CheckBoxStrip.setText("strip");

        CheckBoxNaucni.setText("naucni casopis");

        dugmeFiltriraj.setText("Filtriraj");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dugmeObrisi)
                                .addGap(179, 179, 179)
                                .addComponent(dugmeIzmeni)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dugmeDodaj)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelaNaziv)
                            .addComponent(labelaAutor))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextFieldNaziv, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(TextFieldAutor))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelaZanr)
                                .addGap(18, 18, 18)
                                .addComponent(ComboBoxZanr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dugmeFiltriraj))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CheckBoxStrip, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CheckBoxNaucni, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelaNaziv)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TextFieldNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelaZanr)
                                .addComponent(ComboBoxZanr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelaAutor)
                            .addComponent(TextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(9, Short.MAX_VALUE)
                        .addComponent(dugmeFiltriraj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CheckBoxStrip)
                            .addComponent(CheckBoxNaucni))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dugmeObrisi)
                    .addComponent(dugmeDodaj)
                    .addComponent(dugmeIzmeni))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dugmeDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugmeDodajActionPerformed
        FormaKnjiga fk=new FormaKnjiga(this, true,null);
        fk.setVisible(true);
    }//GEN-LAST:event_dugmeDodajActionPerformed

    private void ComboBoxZanrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxZanrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxZanrActionPerformed

    private void dugmeObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugmeObrisiActionPerformed
        int selektovaniRed= tabelaKnjige.getSelectedRow();
        
        if(selektovaniRed==-1)
        {
            JOptionPane.showMessageDialog(this, "Morate selektovati knjigu da biste je obrisali!","Upozorenje", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            Controller controller=Controller.getInstance();
            controller.obrisiKnjigu(selektovaniRed);
        }
        
        osveziTabelu();
    }//GEN-LAST:event_dugmeObrisiActionPerformed

    private void dugmeIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugmeIzmeniActionPerformed
        int selektovaniRed = tabelaKnjige.getSelectedRow();
        if(selektovaniRed==-1)
        {
            JOptionPane.showMessageDialog(this, "Morate odabrati knjigu!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        } Knjiga selektovanaKnjiga = (Knjiga) Controller.getInstance().getListaKnjiga().get(selektovaniRed);
        FormaKnjiga fk=new FormaKnjiga(this, true, selektovanaKnjiga);
        fk.setVisible(true);
    }//GEN-LAST:event_dugmeIzmeniActionPerformed

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
            java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GlavnaForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxNaucni;
    private javax.swing.JCheckBox CheckBoxStrip;
    private javax.swing.JComboBox<String> ComboBoxZanr;
    private javax.swing.JTextField TextFieldAutor;
    private javax.swing.JTextField TextFieldNaziv;
    private javax.swing.JButton dugmeDodaj;
    private javax.swing.JButton dugmeFiltriraj;
    private javax.swing.JButton dugmeIzmeni;
    private javax.swing.JButton dugmeObrisi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelaAutor;
    private javax.swing.JLabel labelaNaziv;
    private javax.swing.JLabel labelaZanr;
    private javax.swing.JTable tabelaKnjige;
    // End of variables declaration//GEN-END:variables

    void osveziTabelu() {
        ModelTabeleKnjige modelTabele=(ModelTabeleKnjige) tabelaKnjige.getModel();
        modelTabele.osveziPodatke();
    }
}