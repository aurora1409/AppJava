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
import static java.awt.font.TextAttribute.FONT;
import java.io.File;
import javax.swing.JColorChooser;
import javax.swing.text.Style;

/**
 *
 * @author PC
 */
public class SettingFont extends javax.swing.JFrame {

    /**
     * Creates new form SettingFont
     */
    private Integer fontSize;
    private String font;
    private Color color;
    private int style;
    private String check;

    public SettingFont() {
        initComponents();
        this.setLocationRelativeTo(null);
        readData();
        fontSize = IOFile.doc("src/controller/size.txt");
        font = IOFileFont.doc("src/controller/font.txt");
        color = IOFileColor.doc("src/controller/color.DAT");
        style = IOFile.doc("src/controller/style.txt");
        m_coChu.setSelectedIndex(fontSize - 1);
        m_fontChu.setSelectedItem(font);
        m_style.setSelectedItem(m_style.getItemAt(style));
        m_colorChose.setBackground(color);
    }

    public void readData() {
        File f1 = new File("src/controller/size.txt");
        if (f1.exists()) {
            fontSize = IOFile.doc("src/controller/size.txt");
        }
        File f2 = new File("src/controller/font.txt");
        if (f2.exists()) {
            font = IOFileFont.doc("src/controller/font.txt");
        }
        File f3 = new File("src/controller/color.DAT");
        if (f3.exists()) {
            color = IOFileColor.doc("src/controller/color.DAT");
        }
        File f4 = new File("src/controller/style.txt");
        if (f4.exists()) {
            style = IOFile.doc("src/controller/style.txt");
        }
    }

    public void writeData() {
        String selected = String.valueOf(m_coChu.getSelectedItem());
        int size = Integer.parseInt(selected);
        IOFile.viet("src/controller/size.txt", size);

        String font1 = String.valueOf(m_fontChu.getSelectedItem());
        IOFileFont.viet("src/controller/font.txt", font1);

        IOFileColor.viet("src/controller/color.DAT", color);

        style = m_style.getSelectedIndex();
        IOFile.viet("src/controller/style.txt", style);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        m_coChu = new javax.swing.JComboBox<>();
        m_okBtn = new javax.swing.JToggleButton();
        m_font = new javax.swing.JLabel();
        m_fontChu = new javax.swing.JComboBox<>();
        m_fontStyle = new javax.swing.JLabel();
        m_style = new javax.swing.JComboBox<>();
        m_color = new javax.swing.JLabel();
        m_colorChose = new javax.swing.JTextField();
        m_preview = new javax.swing.JTextField();
        m_previewBtn = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Size");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 49, 70, 37));

        m_coChu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        m_coChu.setMaximumRowCount(10);
        m_coChu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "92", "94", "95", "96", "97", "98", "99", "100" }));
        m_coChu.setToolTipText("Chọn\n");
        jPanel1.add(m_coChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 52, 155, 30));

        m_okBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        m_okBtn.setText("Ok");
        m_okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_okBtnActionPerformed(evt);
            }
        });
        jPanel1.add(m_okBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 70, -1));

        m_font.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        m_font.setText("Font ");
        jPanel1.add(m_font, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 107, 54, 24));

        m_fontChu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        m_fontChu.setMaximumRowCount(10);
        m_fontChu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arial", "Bahnschrift", "Calibri", "Calibri Light", "Cambria", "Cambria Math", "Candara", "Cascadia Code", "Cascadia Mono", "Consolas", "Constantia", "Corbel", "Corbel Light", "Corbel New", "Dialog", "DialogInput", "Microsoft Sans Serif", "Palatino Linotype", "SansSerif", "Segoe UI", "Segoe UI Black", "Segoe UI Light", "Segoe UI Semibold", "Segoe UI Semilight", "Serif", "Sitka Banner", "Sitka Display", "Sitka Heading", "Sitka Small", "Sitka Subheading", "Sitka Text", "Tahoma", "Times New Roman", "Verdana", " " }));
        jPanel1.add(m_fontChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 104, 155, 30));

        m_fontStyle.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        m_fontStyle.setText("Font Style");
        jPanel1.add(m_fontStyle, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 164, 70, 24));

        m_style.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        m_style.setMaximumRowCount(3);
        m_style.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plain", "Bold", "Italic", " ", " " }));
        jPanel1.add(m_style, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 161, 155, 30));

        m_color.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        m_color.setText("Color");
        jPanel1.add(m_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 229, -1, -1));

        m_colorChose.setEditable(false);
        m_colorChose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_colorChoseMouseClicked(evt);
            }
        });
        jPanel1.add(m_colorChose, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 221, 32, 32));

        m_preview.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        m_preview.setText("Hello World");
        m_preview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_previewMouseClicked(evt);
            }
        });
        jPanel1.add(m_preview, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 240, 80));

        m_previewBtn.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        m_previewBtn.setText("Preview");
        m_previewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_previewBtnActionPerformed(evt);
            }
        });
        jPanel1.add(m_previewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 297, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/5/bigger/1 72.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -140, 320, 760));

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

        setBounds(0, 0, 334, 597);
    }// </editor-fold>//GEN-END:initComponents

    private void m_okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_okBtnActionPerformed

        writeData();
        check = IOFileFont.doc("src/controller/check.txt");
        int x = Integer.parseInt(check);
        if (x == 1) {
            new Letter1().setVisible(true);
            this.dispose();
        }
        if (x == 2) {
            new Letter2().setVisible(true);
            this.dispose();
        }
        if (x == 3) {
            new Letter3().setVisible(true);
            this.dispose();
        }
        if (x == 4) {
            new Letter4().setVisible(true);
            this.dispose();
        }
        if (x == 5) {
            new Letter5().setVisible(true);
            this.dispose();
        }
        if (x == 6) {
            new Letter6().setVisible(true);
            this.dispose();
        }
        if (x == 7) {
            new Letter7().setVisible(true);
            this.dispose();
        }
        if (x == 8) {
            new Letter8().setVisible(true);
            this.dispose();
        }
        if (x == 9) {
            new Letter9().setVisible(true);
            this.dispose();
        }
        if (x == 10) {
            new Letter10().setVisible(true);
            this.dispose();
        }
        if (x == 11) {
            new Letter11().setVisible(true);
            this.dispose();
        }
        if (x == 12) {
            new Letter12().setVisible(true);
            this.dispose();
        }
        if (x == 13) {
            new Letter13().setVisible(true);
            this.dispose();
        }
        if (x == 14) {
            new Letter14().setVisible(true);
            this.dispose();
        }
        if (x == 15) {
            new Letter15().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_m_okBtnActionPerformed

    private void m_colorChoseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_colorChoseMouseClicked
        // TODO add your handling code here:
        color = JColorChooser.showDialog(this, "Chon mau", Color.BLACK);
        m_colorChose.setBackground(color);

    }//GEN-LAST:event_m_colorChoseMouseClicked

    private void m_previewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_previewMouseClicked
        // TODO add your handling code here:
        readData();
        Font f;
        if (style == 0) {
            f = new Font(font, Font.PLAIN, fontSize);
            m_preview.setFont(f);
            m_preview.setForeground(color);
        } else if (style == 1) {
            f = new Font(font, Font.BOLD, fontSize);
            m_preview.setFont(f);
            m_preview.setForeground(color);
        } else if (style == 2) {
            f = new Font(font, Font.ITALIC, fontSize);
            m_preview.setFont(f);
            m_preview.setForeground(color);
        }


    }//GEN-LAST:event_m_previewMouseClicked

    private void m_previewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_previewBtnActionPerformed
        // TODO add your handling code here:
        writeData();
        readData();
        Font f;
        if (style == 0) {
            f = new Font(font, Font.PLAIN, fontSize);
            m_preview.setFont(f);
            m_preview.setForeground(color);
        } else if (style == 1) {
            f = new Font(font, Font.BOLD, fontSize);
            m_preview.setFont(f);
            m_preview.setForeground(color);
        } else if (style == 2) {
            f = new Font(font, Font.ITALIC, fontSize);
            m_preview.setFont(f);
            m_preview.setForeground(color);
        }
    }//GEN-LAST:event_m_previewBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> m_coChu;
    private javax.swing.JLabel m_color;
    private javax.swing.JTextField m_colorChose;
    private javax.swing.JLabel m_font;
    private javax.swing.JComboBox<String> m_fontChu;
    private javax.swing.JLabel m_fontStyle;
    private javax.swing.JToggleButton m_okBtn;
    private javax.swing.JTextField m_preview;
    private javax.swing.JToggleButton m_previewBtn;
    private javax.swing.JComboBox<String> m_style;
    // End of variables declaration//GEN-END:variables
}
