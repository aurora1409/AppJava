/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.IOFileFont;

/**
 *
 * @author PC
 */
public class DanhMuc extends javax.swing.JFrame {

    
    private String check;
    public DanhMuc() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(360, 640);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        m_letter1 = new javax.swing.JTextField();
        m_letter2 = new javax.swing.JTextField();
        m_letter3 = new javax.swing.JTextField();
        m_letter4 = new javax.swing.JTextField();
        m_letter5 = new javax.swing.JTextField();
        m_letter6 = new javax.swing.JTextField();
        m_letter7 = new javax.swing.JTextField();
        m_letter8 = new javax.swing.JTextField();
        m_letter9 = new javax.swing.JTextField();
        m_letter10 = new javax.swing.JTextField();
        m_letter11 = new javax.swing.JTextField();
        m_letter12 = new javax.swing.JTextField();
        m_letter13 = new javax.swing.JTextField();
        m_letter14 = new javax.swing.JTextField();
        m_letter15 = new javax.swing.JTextField();
        m_quayLaiBtn = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(360, 640));
        setMinimumSize(new java.awt.Dimension(360, 640));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(204, 226, 217));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setFocusCycleRoot(true);
        jScrollPane1.setFocusTraversalPolicyProvider(true);

        jPanel3.setForeground(new java.awt.Color(204, 226, 217));

        m_letter1.setEditable(false);
        m_letter1.setBackground(new java.awt.Color(179, 204, 179));
        m_letter1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        m_letter1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        m_letter1.setText("Bức thư thứ 1");
        m_letter1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                m_letter1MousePressed(evt);
            }
        });

        m_letter2.setEditable(false);
        m_letter2.setBackground(new java.awt.Color(179, 204, 179));
        m_letter2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        m_letter2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        m_letter2.setText("Bức thư thứ 2");
        m_letter2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_letter2MouseClicked(evt);
            }
        });

        m_letter3.setEditable(false);
        m_letter3.setBackground(new java.awt.Color(179, 204, 179));
        m_letter3.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        m_letter3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        m_letter3.setText("Bức thư thứ 3");
        m_letter3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_letter3MouseClicked(evt);
            }
        });

        m_letter4.setEditable(false);
        m_letter4.setBackground(new java.awt.Color(179, 204, 179));
        m_letter4.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        m_letter4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        m_letter4.setText("Bức thư thứ 4");
        m_letter4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_letter4MouseClicked(evt);
            }
        });

        m_letter5.setEditable(false);
        m_letter5.setBackground(new java.awt.Color(179, 204, 179));
        m_letter5.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        m_letter5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        m_letter5.setText("Bức thư thứ 5");
        m_letter5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_letter5MouseClicked(evt);
            }
        });

        m_letter6.setEditable(false);
        m_letter6.setBackground(new java.awt.Color(179, 204, 179));
        m_letter6.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        m_letter6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        m_letter6.setText("Bức thư thứ 6");
        m_letter6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_letter6MouseClicked(evt);
            }
        });

        m_letter7.setEditable(false);
        m_letter7.setBackground(new java.awt.Color(179, 204, 179));
        m_letter7.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        m_letter7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        m_letter7.setText("Bức thư thứ 7");
        m_letter7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_letter7MouseClicked(evt);
            }
        });

        m_letter8.setEditable(false);
        m_letter8.setBackground(new java.awt.Color(179, 204, 179));
        m_letter8.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        m_letter8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        m_letter8.setText("Bức thư thứ 8");
        m_letter8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_letter8MouseClicked(evt);
            }
        });

        m_letter9.setEditable(false);
        m_letter9.setBackground(new java.awt.Color(179, 204, 179));
        m_letter9.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        m_letter9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        m_letter9.setText("Bức thư thứ 9");
        m_letter9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_letter9MouseClicked(evt);
            }
        });

        m_letter10.setEditable(false);
        m_letter10.setBackground(new java.awt.Color(179, 204, 179));
        m_letter10.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        m_letter10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        m_letter10.setText("Bức thư thứ 10");
        m_letter10.setToolTipText("");
        m_letter10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_letter10MouseClicked(evt);
            }
        });

        m_letter11.setEditable(false);
        m_letter11.setBackground(new java.awt.Color(179, 204, 179));
        m_letter11.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        m_letter11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        m_letter11.setText("Bức thư thứ 11");
        m_letter11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_letter11MouseClicked(evt);
            }
        });

        m_letter12.setEditable(false);
        m_letter12.setBackground(new java.awt.Color(179, 204, 179));
        m_letter12.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        m_letter12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        m_letter12.setText("Bức thư thứ 12");
        m_letter12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_letter12MouseClicked(evt);
            }
        });

        m_letter13.setEditable(false);
        m_letter13.setBackground(new java.awt.Color(179, 204, 179));
        m_letter13.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        m_letter13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        m_letter13.setText("Bức thư thứ 13");
        m_letter13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_letter13MouseClicked(evt);
            }
        });

        m_letter14.setEditable(false);
        m_letter14.setBackground(new java.awt.Color(179, 204, 179));
        m_letter14.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        m_letter14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        m_letter14.setText("Bức thư thứ 14");
        m_letter14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_letter14MouseClicked(evt);
            }
        });

        m_letter15.setEditable(false);
        m_letter15.setBackground(new java.awt.Color(179, 204, 179));
        m_letter15.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        m_letter15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        m_letter15.setText("Bức thư thứ 15");
        m_letter15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_letter15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(m_letter1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(m_letter2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(m_letter3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(m_letter4, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(m_letter5, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(m_letter6, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(m_letter7, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(m_letter8, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(m_letter9, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(m_letter10, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(m_letter11, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(m_letter12, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(m_letter13, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(m_letter14, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(m_letter15, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(m_letter1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(m_letter2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(m_letter3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(m_letter4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(m_letter5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(m_letter6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(m_letter7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(m_letter8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(m_letter9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(m_letter10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(m_letter11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(m_letter12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(m_letter13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(m_letter14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(m_letter15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setViewportView(jPanel3);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 51, 320, 520));

        m_quayLaiBtn.setBackground(new java.awt.Color(255, 255, 204));
        m_quayLaiBtn.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        m_quayLaiBtn.setText("Quay lại");
        m_quayLaiBtn.setContentAreaFilled(false);
        m_quayLaiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_quayLaiBtnActionPerformed(evt);
            }
        });
        jPanel1.add(m_quayLaiBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/5/bigger/1 55.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(374, 677));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void m_quayLaiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_quayLaiBtnActionPerformed
        
        new TrangChu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_m_quayLaiBtnActionPerformed

    private void m_letter1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_letter1MousePressed
       
        check="1";
        IOFileFont.viet("src/controller/check.txt", check);
        new Letter1().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_m_letter1MousePressed

    private void m_letter2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_letter2MouseClicked
        
        check="2";
        IOFileFont.viet("src/controller/check.txt", check);
        new Letter2().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_m_letter2MouseClicked

    private void m_letter3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_letter3MouseClicked
        
        check="3";
        IOFileFont.viet("src/controller/check.txt", check);
        new Letter3().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_m_letter3MouseClicked

    private void m_letter4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_letter4MouseClicked
        
        check="4";
        IOFileFont.viet("src/controller/check.txt", check);
        new Letter4().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_m_letter4MouseClicked

    private void m_letter5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_letter5MouseClicked
        
        check="5";
        IOFileFont.viet("src/controller/check.txt", check);
        new Letter5().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_m_letter5MouseClicked

    private void m_letter6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_letter6MouseClicked
        
        check="6";
        IOFileFont.viet("src/controller/check.txt", check);
        new Letter6().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_m_letter6MouseClicked

    private void m_letter7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_letter7MouseClicked
        
        check="7";
        IOFileFont.viet("src/controller/check.txt", check);
        new Letter7().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_m_letter7MouseClicked

    private void m_letter8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_letter8MouseClicked
        
        check="8";
        IOFileFont.viet("src/controller/check.txt", check);
        new Letter8().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_m_letter8MouseClicked

    private void m_letter9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_letter9MouseClicked
        
        check="9";
        IOFileFont.viet("src/controller/check.txt", check);
        new Letter9().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_m_letter9MouseClicked

    private void m_letter10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_letter10MouseClicked
        
        check="10";
        IOFileFont.viet("src/controller/check.txt", check);
        new Letter10().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_m_letter10MouseClicked

    private void m_letter11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_letter11MouseClicked
        
        check="11";
        IOFileFont.viet("src/controller/check.txt", check);
        new Letter11().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_m_letter11MouseClicked

    private void m_letter12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_letter12MouseClicked
        
        check="12";
        IOFileFont.viet("src/controller/check.txt", check);
        new Letter12().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_m_letter12MouseClicked

    private void m_letter13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_letter13MouseClicked
        
        check="13";
        IOFileFont.viet("src/controller/check.txt", check);
        new Letter13().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_m_letter13MouseClicked

    private void m_letter14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_letter14MouseClicked
       
        check="14";
        IOFileFont.viet("src/controller/check.txt", check);
        new Letter14().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_m_letter14MouseClicked

    private void m_letter15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_letter15MouseClicked
        
        check="15";
        IOFileFont.viet("src/controller/check.txt", check);
        new Letter15().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_m_letter15MouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField m_letter1;
    private javax.swing.JTextField m_letter10;
    private javax.swing.JTextField m_letter11;
    private javax.swing.JTextField m_letter12;
    private javax.swing.JTextField m_letter13;
    private javax.swing.JTextField m_letter14;
    private javax.swing.JTextField m_letter15;
    private javax.swing.JTextField m_letter2;
    private javax.swing.JTextField m_letter3;
    private javax.swing.JTextField m_letter4;
    private javax.swing.JTextField m_letter5;
    private javax.swing.JTextField m_letter6;
    private javax.swing.JTextField m_letter7;
    private javax.swing.JTextField m_letter8;
    private javax.swing.JTextField m_letter9;
    private javax.swing.JToggleButton m_quayLaiBtn;
    // End of variables declaration//GEN-END:variables
}
