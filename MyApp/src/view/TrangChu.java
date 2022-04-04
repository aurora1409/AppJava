/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author PC
 */
public class TrangChu extends javax.swing.JFrame {

    public TrangChu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(360, 640);

    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        m_danhMucBtn = new javax.swing.JToggleButton();
        m_myQuote = new javax.swing.JToggleButton();
        m_no = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(360, 640));
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(360, 640));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        m_danhMucBtn.setBackground(new java.awt.Color(113, 165, 138));
        m_danhMucBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        m_danhMucBtn.setText("Danh mục");
        m_danhMucBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        m_danhMucBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_danhMucBtnActionPerformed(evt);
            }
        });
        jPanel1.add(m_danhMucBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 190, 50));

        m_myQuote.setBackground(new java.awt.Color(113, 165, 138));
        m_myQuote.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        m_myQuote.setText("Tạo Quote");
        m_myQuote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_myQuoteActionPerformed(evt);
            }
        });
        jPanel1.add(m_myQuote, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 190, 50));

        m_no.setBackground(new java.awt.Color(113, 165, 138));
        m_no.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        m_no.setText("Enjoy Music");
        m_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_noActionPerformed(evt);
            }
        });
        jPanel1.add(m_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 190, 50));

        jToggleButton1.setBackground(new java.awt.Color(113, 165, 138));
        jToggleButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jToggleButton1.setText("Chỉnh sửa ảnh");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 190, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/3/bigger/1 (32).jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 360, 680));

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

    private void m_danhMucBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_danhMucBtnActionPerformed
        // TODO add your handling code here:
        new DanhMuc().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_m_danhMucBtnActionPerformed

    private void m_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_noActionPerformed
        // TODO add your handling code here:
        new EnjoyMusic().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_m_noActionPerformed

    private void m_myQuoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_myQuoteActionPerformed
        // TODO add your handling code here:
        new MyQuote().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_m_myQuoteActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        new EditImage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton m_danhMucBtn;
    private javax.swing.JToggleButton m_myQuote;
    private javax.swing.JToggleButton m_no;
    // End of variables declaration//GEN-END:variables
}
