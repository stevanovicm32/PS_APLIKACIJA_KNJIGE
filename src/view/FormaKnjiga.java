/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.Controller;
import domain.Autor;
import domain.Knjiga;
import domain.Zanr;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class FormaKnjiga extends javax.swing.JDialog {
private Controller controller;
private GlavnaForma gf;
private Knjiga knjigaZaIzmenu;
    /**
     * Creates new form FormaKnjiga
     */
    public FormaKnjiga(java.awt.Frame parent, boolean modal, Knjiga knjigaZaIzmenu) {
        super(parent, modal);
        initComponents();
        controller = Controller.getInstance();
        this.gf=(GlavnaForma) parent;
        popuniComboBoxAutorima();
        if(knjigaZaIzmenu != null)
        {
            this.knjigaZaIzmenu=knjigaZaIzmenu;
            jTextFieldNaziv.setText(knjigaZaIzmenu.getNaslov());
            jTextFieldGodina.setText(String.valueOf(knjigaZaIzmenu.getGodinaIzdanja()));
            jTextFieldISBN.setText(knjigaZaIzmenu.getISBN());
            jComboBoxAutor.setSelectedItem(knjigaZaIzmenu.getAutor());
            jComboBoxZanr.setSelectedItem(knjigaZaIzmenu.getZanr());
            dugmeDodaj.setVisible(false);
            jTextFieldISBN.setEnabled(false);
        }
        else{
           dugmeIzmeni.setVisible(false); 
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

        jLabel1 = new javax.swing.JLabel();
        jTextFieldNaziv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldISBN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldGodina = new javax.swing.JTextField();
        jComboBoxZanr = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        dugmeDodaj = new javax.swing.JButton();
        dugmeOdustani = new javax.swing.JButton();
        jComboBoxAutor = new javax.swing.JComboBox<>();
        dugmeIzmeni = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Naziv");

        jTextFieldNaziv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNazivActionPerformed(evt);
            }
        });

        jLabel2.setText("ISBN");

        jLabel3.setText("Autor");

        jLabel4.setText("Godina");

        jComboBoxZanr.setModel(new DefaultComboBoxModel(Zanr.values()));

        jLabel5.setText("Zanr");

        dugmeDodaj.setText("Dodaj");
        dugmeDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugmeDodajActionPerformed(evt);
            }
        });

        dugmeOdustani.setText("Odustani");
        dugmeOdustani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugmeOdustaniActionPerformed(evt);
            }
        });

        jComboBoxAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAutorActionPerformed(evt);
            }
        });

        dugmeIzmeni.setText("Izmeni");
        dugmeIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugmeIzmeniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(20, 20, 20)
                                    .addComponent(jComboBoxAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                    .addGap(21, 21, 21)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldISBN, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                        .addComponent(jTextFieldNaziv))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxZanr, 0, 192, Short.MAX_VALUE)
                                    .addComponent(jTextFieldGodina))))
                        .addGap(132, 132, 132))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dugmeDodaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dugmeIzmeni)
                        .addGap(43, 43, 43)
                        .addComponent(dugmeOdustani)
                        .addGap(55, 55, 55))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldGodina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxZanr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dugmeDodaj)
                    .addComponent(dugmeOdustani)
                    .addComponent(dugmeIzmeni))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNazivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNazivActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNazivActionPerformed

    private void dugmeOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugmeOdustaniActionPerformed
        this.dispose();
    }//GEN-LAST:event_dugmeOdustaniActionPerformed

    private void jComboBoxAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAutorActionPerformed

    private void dugmeDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugmeDodajActionPerformed
        String ime = jTextFieldNaziv.getText();
        String isbn = jTextFieldISBN.getText();
        int godina;
        try{
            godina = Integer.parseInt(jTextFieldGodina.getText());
        }catch(NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(this, "Morate uneti broj!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Zanr zanr = (Zanr) jComboBoxZanr.getSelectedItem();
        Autor autor = (Autor) jComboBoxAutor.getSelectedItem();
        
        Knjiga novaKnjiga= new Knjiga(ime,autor,isbn,godina,zanr);
        controller.dodajKnjigu(novaKnjiga);
        JOptionPane.showMessageDialog(this, "Knjiga je dodata", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
        
        gf.osveziTabelu();
        this.dispose();
    }//GEN-LAST:event_dugmeDodajActionPerformed

    private void dugmeIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugmeIzmeniActionPerformed
        String naziv= jTextFieldNaziv.getText();
        String isbn= jTextFieldISBN.getText();
        int godina= Integer.parseInt(jTextFieldGodina.getText());
        Autor autor= (Autor) jComboBoxAutor.getSelectedItem();
        Zanr zanr = (Zanr) jComboBoxZanr.getSelectedItem();
        
        knjigaZaIzmenu.setNaslov(naziv);
        knjigaZaIzmenu.setAutor(autor);
        knjigaZaIzmenu.setGodinaIzdanja(godina);
        knjigaZaIzmenu.setISBN(isbn);
        knjigaZaIzmenu.setZanr(zanr);
        
        JOptionPane.showMessageDialog(this, "Knjiga je izmenjena", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
        gf.osveziTabelu();
        this.dispose();
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
            java.util.logging.Logger.getLogger(FormaKnjiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormaKnjiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormaKnjiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormaKnjiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormaKnjiga dialog = new FormaKnjiga(new javax.swing.JFrame(), true,null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dugmeDodaj;
    private javax.swing.JButton dugmeIzmeni;
    private javax.swing.JButton dugmeOdustani;
    private javax.swing.JComboBox<Autor> jComboBoxAutor;
    private javax.swing.JComboBox<String> jComboBoxZanr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFieldGodina;
    private javax.swing.JTextField jTextFieldISBN;
    private javax.swing.JTextField jTextFieldNaziv;
    // End of variables declaration//GEN-END:variables

    
    private void popuniComboBoxAutorima() {
        jComboBoxAutor.removeAllItems();
        List<Autor> autori = Controller.getInstance().getListaAutora();
        for (Autor autor : autori) {
            jComboBoxAutor.addItem(autor);
        }
    }
}