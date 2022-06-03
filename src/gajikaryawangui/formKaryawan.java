
package gajikaryawangui;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class formKaryawan extends javax.swing.JFrame {

    public formKaryawan() {
        initComponents();
        selectData();
    }
    public void selectData() {
        String kolom[] = {"No", "Nama", "Alamat", "Umur", "Tgl Diterima", "Golongan", "Gaji", "Username", "Password"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM karyawan WHERE username='"+loginKaryawan.tUsername.getText()+"' AND password='"+loginKaryawan.tPassword.getText()+"'";
              ResultSet rs = koneksiDB.executeQuery(SQL);
        try {
            while(rs.next()) {
                String No               = rs.getString(1);
                String Nama             = rs.getString(2);
                String Alamat           = rs.getString(3);
                String Umur             = rs.getString(4);
                String Tgl_Diterima     = rs.getString(5);
                String Golongan         = rs.getString(6);
                String Gaji             = rs.getString(7);
                String Username         = rs.getString(8);
                String Password         = rs.getString(9);
                String data[]           = {No,Nama,Alamat,Umur,Tgl_Diterima,Golongan,Gaji,Username,Password};
                dtm.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(formAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        tabel.setModel(dtm);
    }  
    
    public void clearData(){
       tNama.setText("");
       tAlamat.setText("");
       tUmur.setText("");
       tTanggal.setText("");
       tGaji.setText("");
       tUsername.setText("");
       tPassword.setText("");
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tNama = new javax.swing.JTextField();
        cbGolongan = new javax.swing.JComboBox<>();
        tGaji = new javax.swing.JTextField();
        bHarga = new javax.swing.JButton();
        bKeluar = new javax.swing.JButton();
        tTanggal = new javax.swing.JTextField();
        tUsername = new javax.swing.JTextField();
        tPassword = new javax.swing.JTextField();
        tAlamat = new javax.swing.JTextField();
        tUmur = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        bUbah = new javax.swing.JButton();
        bRefresh = new javax.swing.JButton();
        tNo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(74, 136, 243));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("FORM KARYAWAN");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(74, 136, 243)));

        tNama.setBackground(new java.awt.Color(242, 243, 247));
        tNama.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        tNama.setForeground(new java.awt.Color(122, 129, 140));
        tNama.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tNama.setToolTipText("");
        tNama.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 129, 140), 2, true), "Nama", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 15), new java.awt.Color(122, 129, 140))); // NOI18N
        tNama.setName("tNama"); // NOI18N

        cbGolongan.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        cbGolongan.setForeground(new java.awt.Color(122, 129, 140));
        cbGolongan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Pilih---", "1", "2", "3", "4", "5" }));
        cbGolongan.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Golongan", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 15), new java.awt.Color(122, 129, 140))); // NOI18N
        cbGolongan.setEnabled(false);
        cbGolongan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbGolonganMouseClicked(evt);
            }
        });

        tGaji.setEditable(false);
        tGaji.setBackground(new java.awt.Color(242, 243, 247));
        tGaji.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        tGaji.setForeground(new java.awt.Color(122, 129, 140));
        tGaji.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tGaji.setToolTipText("");
        tGaji.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 129, 140), 2, true), "Gaji", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 15), new java.awt.Color(122, 129, 140))); // NOI18N
        tGaji.setEnabled(false);
        tGaji.setName("tNama"); // NOI18N

        bHarga.setBackground(new java.awt.Color(74, 146, 243));
        bHarga.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        bHarga.setForeground(new java.awt.Color(255, 255, 255));
        bHarga.setText("Cek Gaji");
        bHarga.setBorder(null);
        bHarga.setBorderPainted(false);
        bHarga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bHarga.setFocusPainted(false);
        bHarga.setFocusable(false);
        bHarga.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHargaActionPerformed(evt);
            }
        });

        bKeluar.setBackground(new java.awt.Color(204, 0, 51));
        bKeluar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        bKeluar.setForeground(new java.awt.Color(255, 255, 255));
        bKeluar.setText("Keluar");
        bKeluar.setBorder(null);
        bKeluar.setBorderPainted(false);
        bKeluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bKeluar.setFocusPainted(false);
        bKeluar.setFocusable(false);
        bKeluar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKeluarActionPerformed(evt);
            }
        });

        tTanggal.setEditable(false);
        tTanggal.setBackground(new java.awt.Color(242, 243, 247));
        tTanggal.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        tTanggal.setForeground(new java.awt.Color(122, 129, 140));
        tTanggal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tTanggal.setToolTipText("");
        tTanggal.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 129, 140), 2, true), "Tanggal Diterima", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 15), new java.awt.Color(122, 129, 140))); // NOI18N
        tTanggal.setEnabled(false);
        tTanggal.setName("namaInput"); // NOI18N
        tTanggal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tTanggalKeyTyped(evt);
            }
        });

        tUsername.setEditable(false);
        tUsername.setBackground(new java.awt.Color(242, 243, 247));
        tUsername.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        tUsername.setForeground(new java.awt.Color(122, 129, 140));
        tUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tUsername.setToolTipText("");
        tUsername.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 129, 140), 2, true), "Username", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 15), new java.awt.Color(122, 129, 140))); // NOI18N
        tUsername.setEnabled(false);
        tUsername.setName("namaInput"); // NOI18N
        tUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tUsernameKeyTyped(evt);
            }
        });

        tPassword.setEditable(false);
        tPassword.setBackground(new java.awt.Color(242, 243, 247));
        tPassword.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        tPassword.setForeground(new java.awt.Color(122, 129, 140));
        tPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tPassword.setToolTipText("");
        tPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 129, 140), 2, true), "Password", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 15), new java.awt.Color(122, 129, 140))); // NOI18N
        tPassword.setEnabled(false);
        tPassword.setName("namaInput"); // NOI18N
        tPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tPasswordKeyTyped(evt);
            }
        });

        tAlamat.setBackground(new java.awt.Color(242, 243, 247));
        tAlamat.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        tAlamat.setForeground(new java.awt.Color(122, 129, 140));
        tAlamat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tAlamat.setToolTipText("");
        tAlamat.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 129, 140), 2, true), "Alamat", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 15), new java.awt.Color(122, 129, 140))); // NOI18N
        tAlamat.setName("tNama"); // NOI18N

        tUmur.setBackground(new java.awt.Color(242, 243, 247));
        tUmur.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        tUmur.setForeground(new java.awt.Color(122, 129, 140));
        tUmur.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tUmur.setToolTipText("");
        tUmur.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 129, 140), 2, true), "Umur", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 15), new java.awt.Color(122, 129, 140))); // NOI18N
        tUmur.setName("namaInput"); // NOI18N
        tUmur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tUmurActionPerformed(evt);
            }
        });
        tUmur.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tUmurKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(122, 129, 140));
        jLabel4.setText("Tahun");

        tabel.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        bUbah.setBackground(new java.awt.Color(255, 204, 0));
        bUbah.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        bUbah.setForeground(new java.awt.Color(255, 255, 255));
        bUbah.setText("Ubah");
        bUbah.setBorder(null);
        bUbah.setBorderPainted(false);
        bUbah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bUbah.setFocusPainted(false);
        bUbah.setFocusable(false);
        bUbah.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUbahActionPerformed(evt);
            }
        });

        bRefresh.setBackground(new java.awt.Color(0, 204, 204));
        bRefresh.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        bRefresh.setForeground(new java.awt.Color(255, 255, 255));
        bRefresh.setText("Refresh");
        bRefresh.setBorder(null);
        bRefresh.setBorderPainted(false);
        bRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bRefresh.setFocusPainted(false);
        bRefresh.setFocusable(false);
        bRefresh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRefreshActionPerformed(evt);
            }
        });

        tNo.setEditable(false);
        tNo.setBackground(new java.awt.Color(242, 243, 247));
        tNo.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        tNo.setForeground(new java.awt.Color(122, 129, 140));
        tNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tNo.setToolTipText("");
        tNo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 129, 140), 2, true), "No", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 15), new java.awt.Color(122, 129, 140))); // NOI18N
        tNo.setName("tNama"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(tNo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(tUmur, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tNama, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tTanggal, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tAlamat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(cbGolongan, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(bHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(tGaji, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bUbah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bKeluar, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tNo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbGolongan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(tUmur, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tGaji, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(bRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbGolonganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbGolonganMouseClicked

    }//GEN-LAST:event_cbGolonganMouseClicked

    private void bHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHargaActionPerformed

        String golongan = null;
        int gaji = 0;
        golongan = (String)cbGolongan.getSelectedItem();
        if(golongan == "1") {
            gaji = 1750000;
        }
        else if(golongan == "2") {
            gaji = 2900000;
        }
        else if(golongan == "3") {
            gaji = 4700000;
        }
        else if(golongan == "4") {
            gaji = 5950000;
        }
        else if(golongan == "5") {
            gaji = 8750000;
        }

        tGaji.setText("" + (String.format("%0,2d", (int) gaji)));
    }//GEN-LAST:event_bHargaActionPerformed

    private void bKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKeluarActionPerformed
        menuLogin menu = new menuLogin();
        menu.pack();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_bKeluarActionPerformed

    private void tTanggalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tTanggalKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tTanggalKeyTyped

    private void tUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tUsernameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tUsernameKeyTyped

    private void tPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPasswordKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tPasswordKeyTyped

    private void tUmurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tUmurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tUmurActionPerformed

    private void tUmurKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tUmurKeyTyped
        char karakter = evt.getKeyChar();
        if(!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Hanya Bisa Masukkan Angka!");
        }
    }//GEN-LAST:event_tUmurKeyTyped

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        int baris = tabel.getSelectedRow();
        if (baris != -1) {
            tNo.setText(tabel.getValueAt(baris, 0).toString());
            tNama.setText(tabel.getValueAt(baris, 1).toString());
            tAlamat.setText(tabel.getValueAt(baris, 2).toString());
            tUmur.setText(tabel.getValueAt(baris, 3).toString());
            tTanggal.setText(tabel.getValueAt(baris, 4).toString());
            cbGolongan.setSelectedItem(tabel.getValueAt(baris, 5).toString());
            tGaji.setText(tabel.getValueAt(baris, 6).toString());
            tUsername.setText(tabel.getValueAt(baris, 7).toString());
            tPassword.setText(tabel.getValueAt(baris, 8).toString());
        }
    }//GEN-LAST:event_tabelMouseClicked

    private void bUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUbahActionPerformed
        if ("".equals(tNama.getText()) || "".equals(tUmur.getText()) || "".equals(tTanggal.getText()) || "".equals(tGaji.getText())) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        } else {

            String SQL = "UPDATE karyawan SET "
            + "nama='"+tNama.getText()+"',"
            + "alamat='"+tAlamat.getText()+"',"
            + "umur='"+tUmur.getText()+"',"
            + "tgl_diterima='"+tTanggal.getText()+"', "
            + "golongan='"+cbGolongan.getSelectedItem()+"', "
            + "gaji='"+tGaji.getText()+"', "
            + "username='"+tUsername.getText()+"', "
            + "password='"+tPassword.getText()+"' "
            + "WHERE no='"+tNo.getText()+"'";
            int status = koneksiDB.execute(SQL);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Diubah", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else {
                JOptionPane.showMessageDialog(this, "Data Gagal Diubah", "Sukses", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_bUbahActionPerformed

    private void bRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRefreshActionPerformed
        selectData();
    }//GEN-LAST:event_bRefreshActionPerformed

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
            java.util.logging.Logger.getLogger(formKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formKaryawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHarga;
    private javax.swing.JButton bKeluar;
    private javax.swing.JButton bRefresh;
    private javax.swing.JButton bUbah;
    private javax.swing.JComboBox<String> cbGolongan;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tAlamat;
    private javax.swing.JTextField tGaji;
    private javax.swing.JTextField tNama;
    private javax.swing.JTextField tNo;
    private javax.swing.JTextField tPassword;
    private javax.swing.JTextField tTanggal;
    private javax.swing.JTextField tUmur;
    private javax.swing.JTextField tUsername;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
