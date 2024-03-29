/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.IOFile;
import controller.IOFileColor;
import controller.IOFileFont;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author PC
 */
public class Letter15 extends javax.swing.JFrame {

    /**
     * Creates new form Letter15
     */
    private Integer fontSize;
    private String font;
    Color color;
    private int style;
    private Font f;
    private String bgPath;
    public Letter15() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(360, 640);
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setOpaque(false);
        m_letterTP2.setOpaque(false); 
        m_letterTP2.setBackground(new Color(0,0,0,0));
        
        fontSize=IOFile.doc("src/controller/size.txt");
        font=IOFileFont.doc("src/controller/font.txt");
        color=IOFileColor.doc("src/controller/color.DAT");
        style=IOFile.doc("src/controller/style.txt");
      
        if(style==0) {
            f=new Font(font,Font.PLAIN,fontSize);
        }
        else if(style==1) {
            f=new Font(font,Font.BOLD,fontSize);
        }
        else if(style==2) {
            f=new Font(font,Font.ITALIC,fontSize);
        }
        
        m_letterTP2.setFont(f);
        m_letterTP2.setForeground(color);
        
        bgPath = IOFileFont.doc("src/controller/BG15.txt");
        m_BG.setIcon(new ImageIcon(bgPath));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        m_anhCoSan = new javax.swing.JMenuItem();
        m_taiAnhLen = new javax.swing.JMenuItem();
        m_chonAnh = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        m_quayLaiBtn = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        m_letterTP2 = new javax.swing.JTextArea();
        m_settingFont = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        m_BG = new javax.swing.JLabel();

        m_anhCoSan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        m_anhCoSan.setText("Ảnh có sẵn");
        m_anhCoSan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_anhCoSanActionPerformed(evt);
            }
        });
        jPopupMenu1.add(m_anhCoSan);

        m_taiAnhLen.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        m_taiAnhLen.setText("Tải ảnh lên");
        m_taiAnhLen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_taiAnhLenActionPerformed(evt);
            }
        });
        jPopupMenu1.add(m_taiAnhLen);

        m_chonAnh.setMinimumSize(new java.awt.Dimension(340, 650));
        m_chonAnh.setResizable(false);

        jPanel2.setBackground(new java.awt.Color(171, 190, 171));
        jPanel2.setMaximumSize(new java.awt.Dimension(340, 650));
        jPanel2.setMinimumSize(new java.awt.Dimension(340, 650));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/3/small/21.jpg"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/5/small/1 57.jpg"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/3/small/23.jpg"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/3/small/24.jpg"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/3/small/26.jpg"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/3/small/27.jpg"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/3/small/28.jpg"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/3/small/29.jpg"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/3/small/30.jpg"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jToggleButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jToggleButton1.setLabel("Ok");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jToggleButton1)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout m_chonAnhLayout = new javax.swing.GroupLayout(m_chonAnh.getContentPane());
        m_chonAnh.getContentPane().setLayout(m_chonAnhLayout);
        m_chonAnhLayout.setHorizontalGroup(
            m_chonAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        m_chonAnhLayout.setVerticalGroup(
            m_chonAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(360, 640));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        m_quayLaiBtn.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        m_quayLaiBtn.setText("Quay lại");
        m_quayLaiBtn.setContentAreaFilled(false);
        m_quayLaiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_quayLaiBtnActionPerformed(evt);
            }
        });
        jPanel1.add(m_quayLaiBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 90, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setEnabled(false);
        jScrollPane1.setFocusable(false);

        m_letterTP2.setColumns(20);
        m_letterTP2.setRows(30);
        m_letterTP2.setText("#15 \n\n\"Đời người tựa như một\ncon đường dài quanh co\nkhúc khuỷu, bạn muốn \nvượt qua một cách dễ dàng\nthì phải học được cách nhìn\nxa trông rộng; cuộc sống\ngiống như tách cà phê \nđắng ngắt, muốn nó trở\nnên ngọt ngào hơn thì bạn \nphải tự cho thêm đường.\"");
        m_letterTP2.setBorder(null);
        m_letterTP2.setOpaque(false);
        m_letterTP2.setRequestFocusEnabled(false);
        m_letterTP2.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(m_letterTP2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 240, 460));

        m_settingFont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/icon/icons8-fonts-app-48.png"))); // NOI18N
        m_settingFont.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_settingFontMouseClicked(evt);
            }
        });
        m_settingFont.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m_settingFontKeyTyped(evt);
            }
        });
        jPanel1.add(m_settingFont, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/icon/icons8-picture-32.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 16, -1, 30));
        jPanel1.add(m_BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 360, 700));

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

        setBounds(0, 0, 374, 677);
    }// </editor-fold>//GEN-END:initComponents

    private void m_quayLaiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_quayLaiBtnActionPerformed
        // TODO add your handling code here:
        new DanhMuc().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_m_quayLaiBtnActionPerformed

    private void m_settingFontMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_settingFontMouseClicked
        // TODO add your handling code here:
        fontSize=IOFile.doc("src/controller/size.txt");
       
        Font f=new Font("Segue UI",Font.PLAIN,fontSize);
        m_letterTP2.setFont(f);
        new SettingFont().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_m_settingFontMouseClicked

    private void m_settingFontKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m_settingFontKeyTyped
        // TODO add your handling code here:
        new SettingFont().setVisible(true);
    }//GEN-LAST:event_m_settingFontKeyTyped

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        jPopupMenu1.show(m_settingFont, evt.getX(), evt.getY());
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        bgPath="src/Data/BG/3/bigger/1 (21).jpg";
        m_BG.setIcon(new ImageIcon(bgPath));
        IOFileFont.viet("src/controller/BG15.txt", bgPath);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        bgPath="src/Data/BG/5/bigger/1 57.jpg";
        m_BG.setIcon(new ImageIcon(bgPath));
        IOFileFont.viet("src/controller/BG15.txt", bgPath);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        bgPath="src/Data/BG/3/bigger/1 (23).jpg";
        m_BG.setIcon(new ImageIcon(bgPath));
        IOFileFont.viet("src/controller/BG15.txt", bgPath);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        bgPath="src/Data/BG/3/bigger/1 (24).jpg";
        m_BG.setIcon(new ImageIcon(bgPath));
        IOFileFont.viet("src/controller/BG15.txt", bgPath);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        bgPath="src/Data/BG/3/bigger/1 (26).jpg";
        m_BG.setIcon(new ImageIcon(bgPath));
        IOFileFont.viet("src/controller/BG15.txt", bgPath);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        bgPath="src/Data/BG/3/bigger/1 (27).jpg";
        m_BG.setIcon(new ImageIcon(bgPath));
        IOFileFont.viet("src/controller/BG15.txt", bgPath);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        bgPath="src/Data/BG/3/bigger/1 (28).jpg";
        m_BG.setIcon(new ImageIcon(bgPath));
        IOFileFont.viet("src/controller/BG15.txt", bgPath);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        bgPath="src/Data/BG/3/bigger/1 (29).jpg";
        m_BG.setIcon(new ImageIcon(bgPath));
        IOFileFont.viet("src/controller/BG15.txt", bgPath);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        bgPath="src/Data/BG/3/bigger/1 (30).jpg";
        m_BG.setIcon(new ImageIcon(bgPath));
        IOFileFont.viet("src/controller/BG15.txt", bgPath);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        m_chonAnh.setVisible(false);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void m_anhCoSanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_anhCoSanActionPerformed
        // TODO add your handling code here:
        m_chonAnh.setLocationRelativeTo(null);
        m_chonAnh.setVisible(true);
        m_chonAnh.setLocationRelativeTo(null);
    }//GEN-LAST:event_m_anhCoSanActionPerformed

    private void m_taiAnhLenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_taiAnhLenActionPerformed
        // TODO add your handling code here:
        File f1= new File("src/controller/BG15.txt");
        if (f1.exists()) {
            bgPath = IOFileFont.doc("src/controller/BG15.txt");
         
        }
        
        m_BG.setIcon(new ImageIcon(bgPath));
        
        
        JFileChooser fileChooser=new JFileChooser();
        FileNameExtensionFilter imageFilter=new FileNameExtensionFilter("Hinh anh", "jpg","png");
        fileChooser.setFileFilter(imageFilter);
        fileChooser.setMultiSelectionEnabled(false);
        
        
        int x=fileChooser.showDialog(this, "Chon file");
        if(x==JFileChooser.APPROVE_OPTION) {
            File f=fileChooser.getSelectedFile();
            
            m_BG.setIcon(new ImageIcon(f.getAbsolutePath()));
            IOFileFont.viet("src/controller/BG15.txt", f.getAbsolutePath());
            
        }
    }//GEN-LAST:event_m_taiAnhLenActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel m_BG;
    private javax.swing.JMenuItem m_anhCoSan;
    private javax.swing.JDialog m_chonAnh;
    private javax.swing.JTextArea m_letterTP2;
    private javax.swing.JToggleButton m_quayLaiBtn;
    private javax.swing.JLabel m_settingFont;
    private javax.swing.JMenuItem m_taiAnhLen;
    // End of variables declaration//GEN-END:variables
}
