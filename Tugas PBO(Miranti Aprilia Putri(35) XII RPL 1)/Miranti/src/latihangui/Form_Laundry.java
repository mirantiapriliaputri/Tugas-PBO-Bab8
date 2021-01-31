package latihangui;


import javax.swing.JOptionPane;

public class Form_Laundry extends javax.swing.JFrame {

    public Form_Laundry() {
        initComponents();
        //setLocationRelativeTo(this);
    }
    
    public int total;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBayar = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtBerat = new javax.swing.JTextField();
        txtTtlharga = new javax.swing.JTextField();
        Jenis_cuci = new javax.swing.JComboBox();
        btnBatal = new javax.swing.JButton();
        btnTransaksi = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Californian FB", 1, 24));
        jLabel1.setText("Aplikasi Laundry");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 200, 30));

        jLabel2.setFont(new java.awt.Font("Californian FB", 0, 18));
        jLabel2.setText("Bayar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 100, 40));

        jLabel3.setFont(new java.awt.Font("Californian FB", 0, 18));
        jLabel3.setText("Jenis Cuci");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 100, 30));

        jLabel4.setFont(new java.awt.Font("Californian FB", 0, 18));
        jLabel4.setText("Harga Per Kilo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 120, 40));

        jLabel5.setFont(new java.awt.Font("Californian FB", 0, 18));
        jLabel5.setText("Berat");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 100, 40));

        jLabel6.setFont(new java.awt.Font("Californian FB", 0, 18));
        jLabel6.setText("Total Harga");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 100, 40));

        txtBayar.setFont(new java.awt.Font("Californian FB", 0, 18));
        txtBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBayarActionPerformed(evt);
            }
        });
        jPanel1.add(txtBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 180, 30));

        txtHarga.setFont(new java.awt.Font("Californian FB", 0, 18));
        jPanel1.add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 180, 30));

        txtBerat.setFont(new java.awt.Font("Californian FB", 0, 18));
        txtBerat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBeratKeyReleased(evt);
            }
        });
        jPanel1.add(txtBerat, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 180, 30));

        txtTtlharga.setFont(new java.awt.Font("Californian FB", 0, 18));
        jPanel1.add(txtTtlharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 180, 30));

        Jenis_cuci.setFont(new java.awt.Font("Californian FB", 0, 15)); // NOI18N
        Jenis_cuci.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih", "Cuci Kering", "Cuci Basah", "Cuci Setrika" }));
        Jenis_cuci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jenis_cuciActionPerformed(evt);
            }
        });
        jPanel1.add(Jenis_cuci, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 140, 30));

        btnBatal.setFont(new java.awt.Font("Californian FB", 0, 18));
        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        jPanel1.add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 100, 40));

        btnTransaksi.setFont(new java.awt.Font("Californian FB", 0, 18));
        btnTransaksi.setText("Transaksi");
        btnTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransaksiActionPerformed(evt);
            }
        });
        jPanel1.add(btnTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, 40));

        jButton1.setFont(new java.awt.Font("Californian FB", 0, 18));
        jButton1.setText("Keluar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 90, 40));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 450, 400);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-464)/2, (screenSize.height-439)/2, 464, 439);
    }// </editor-fold>//GEN-END:initComponents

    private void Jenis_cuciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jenis_cuciActionPerformed
        if (Jenis_cuci.getSelectedItem().equals("Cuci Kering")) {
            txtHarga.setText("4000");
        }else if (Jenis_cuci.getSelectedItem().equals("Cuci Basah")) {
            txtHarga.setText("3000");
        }else if (Jenis_cuci.getSelectedItem().equals("Cuci Setrika")) {
            txtHarga.setText("5000");
        }
    }//GEN-LAST:event_Jenis_cuciActionPerformed

    private void txtBeratKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBeratKeyReleased
        int Berat = Integer.parseInt(txtBerat.getText());
        int harga = Integer.parseInt(txtHarga.getText());
        total = Berat * harga;
        txtTtlharga.setText(String.valueOf(total));
    }//GEN-LAST:event_txtBeratKeyReleased

    private void btnTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransaksiActionPerformed
        int Bayar = Integer.parseInt(txtBayar.getText());
        int kembalian = Bayar - total;
        JOptionPane.showMessageDialog(null, "Kembalian Anda :\n" + String.valueOf(kembalian));
        
        Jenis_cuci.setSelectedItem("Pilih");
        txtHarga.setText("");
        txtBerat.setText("");
        txtTtlharga.setText("");
        txtBayar.setText("");
    }//GEN-LAST:event_btnTransaksiActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        Jenis_cuci.setSelectedItem("Pilih");
        txtHarga.setText("");
        txtBerat.setText("");
        txtTtlharga.setText("");
        txtBayar.setText("");
    }//GEN-LAST:event_btnBatalActionPerformed

private void txtBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBayarActionPerformed
}//GEN-LAST:event_txtBayarActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 int answer=JOptionPane.showConfirmDialog(null, "Anda Yakin Keluar?", "Keluar", JOptionPane.OK_OPTION);
    if(answer==JOptionPane.OK_OPTION){
        dispose();
    }
}//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Laundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Laundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Laundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Laundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Form_Laundry().setVisible(true);
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Jenis_cuci;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnTransaksi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JTextField txtBerat;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtTtlharga;
    // End of variables declaration//GEN-END:variables
}
