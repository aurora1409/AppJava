/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.IOFile;
import controller.IOFileColor;
import controller.IOFileFont;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;

/**
 *
 * @author PC
 */
public class NewQuote extends javax.swing.JFrame {

    /**
     * Creates new form NewQuote
     */
    
    private String save;
    private static int SO=1;
    private Integer fontSize;
    private String font;
    private Color color;
    private int style;
    private Font f;
    private String bgPath;
    
    public NewQuote() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(360, 640);
        jScrollPane2.getViewport().setOpaque(false);
        jScrollPane2.setOpaque(false);
        m_text.setOpaque(false); 
        m_text.setBackground(new Color(0,0,0,0));
        this.save=""+SO++;
        readData();
        
        fontSize=IOFile.doc("src/controller/sizeQuote.txt");
        font=IOFileFont.doc("src/controller/fontQuote.txt");
        color=IOFileColor.doc("src/controller/colorQuote.DAT");
        style=IOFile.doc("src/controller/styleQuote.txt");
        if(style==0) {
            f=new Font(font,Font.PLAIN,fontSize);
        }
        else if(style==1) {
            f=new Font(font,Font.BOLD,fontSize);
        }
        else if(style==2) {
            f=new Font(font,Font.ITALIC,fontSize);
        }
        
        m_text.setFont(f);
        m_text.setForeground(color);
        
        m_coChu.setSelectedIndex(fontSize-1);
        m_fontChu.setSelectedItem(font);
        m_style.setSelectedItem(m_style.getItemAt(style));
        m_colorChose.setBackground(color);       
    }
    public void readData() {
        File f1= new File("src/controller/sizeQuote.txt");
        if (f1.exists()) {
            fontSize = IOFile.doc("src/controller/sizeQuote.txt");
        }
        else {
            fontSize=14;
        }
        File f2= new File("src/controller/fontQuote.txt");
        if (f2.exists()) {
            font = IOFileFont.doc("src/controller/fontQuote.txt");
        }
        else {
            font="Segue UI";
        }
        File f3= new File("src/controller/colorQuote.DAT");
        if (f3.exists()) {
            color = IOFileColor.doc("src/controller/colorQuote.DAT");
        }
        else {
            color=Color.BLACK;
        }
        File f4= new File("src/controller/styleQuote.txt");
        if (f4.exists()) {
            style = IOFile.doc("src/controller/styleQuote.txt");
        }
        else {
            style=0;
        }
    }
    public void writeData() {
        String selected=String.valueOf(m_coChu.getSelectedItem());
        int size=Integer.parseInt(selected);
        IOFile.viet("src/controller/sizeQuote.txt", size);
        
        String font1=String.valueOf(m_fontChu.getSelectedItem());
        IOFileFont.viet("src/controller/fontQuote.txt", font1);
        
        IOFileColor.viet("src/controller/colorQuote.DAT", color);
        
        style=m_style.getSelectedIndex();
        IOFile.viet("src/controller/styleQuote.txt", style);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        m_chonAnh = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        m_setFont = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
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
        jPanel1 = new javax.swing.JPanel();
        m_settingImage = new javax.swing.JLabel();
        m_settingFont = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        m_panelQuote = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        m_text = new javax.swing.JTextArea();
        m_BG = new javax.swing.JLabel();
        jOptionPane1 = new javax.swing.JOptionPane();
        m_quayLai = new javax.swing.JToggleButton();

        m_chonAnh.setLocationByPlatform(true);
        m_chonAnh.setMinimumSize(new java.awt.Dimension(370, 650));
        m_chonAnh.setModal(true);
        m_chonAnh.setResizable(false);
        m_chonAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_chonAnhMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(171, 190, 171));
        jPanel2.setMaximumSize(new java.awt.Dimension(370, 650));
        jPanel2.setMinimumSize(new java.awt.Dimension(370, 650));
        jPanel2.setPreferredSize(new java.awt.Dimension(370, 650));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/quote/small/42.jpg"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/quote/small/54.jpg"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/quote/small/57.jpg"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/quote/small/60.jpg"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/5/small/1 87.jpg"))); // NOI18N
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/quote/small/33.jpg"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/quote/small/1 64.jpg"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/quote1/small/1 13.jpg"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/quote/small/1 61.jpg"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/quote/small/1 53.jpg"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/quote/small/1 49.jpg"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/quote1/small/1 8.jpg"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/quote/small/1 46.jpg"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/quote1/small/1 7.jpg"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/quote1/small/1 6.jpg"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/quote/small/1 29.jpg"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/quote1/small/1 2.jpg"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/quote1/small/1 9.jpg"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/quote1/small/1 3.jpg"))); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/quote/small/1 21.jpg"))); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/quote1/small/1 1.jpg"))); // NOI18N
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jScrollPane3.setViewportView(jPanel3);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 62, 336, 490));

        jToggleButton1.setText("Ok");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 70, -1));

        javax.swing.GroupLayout m_chonAnhLayout = new javax.swing.GroupLayout(m_chonAnh.getContentPane());
        m_chonAnh.getContentPane().setLayout(m_chonAnhLayout);
        m_chonAnhLayout.setHorizontalGroup(
            m_chonAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, m_chonAnhLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        m_chonAnhLayout.setVerticalGroup(
            m_chonAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, m_chonAnhLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        m_setFont.setMinimumSize(new java.awt.Dimension(300, 500));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel27.setText("Size");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 49, 70, 37));

        m_coChu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        m_coChu.setMaximumRowCount(10);
        m_coChu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "92", "94", "95", "96", "97", "98", "99", "100" }));
        m_coChu.setToolTipText("Chọn\n");
        jPanel5.add(m_coChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 52, 133, 30));

        m_okBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        m_okBtn.setText("Ok");
        m_okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_okBtnActionPerformed(evt);
            }
        });
        jPanel5.add(m_okBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 70, -1));

        m_font.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        m_font.setText("Font ");
        jPanel5.add(m_font, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 107, 54, 24));

        m_fontChu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        m_fontChu.setMaximumRowCount(10);
        m_fontChu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arial", "Bahnschrift", "Calibri", "Calibri Light", "Cambria", "Cambria Math", "Candara", "Cascadia Code", "Cascadia Mono", "Consolas", "Constantia", "Corbel", "Corbel Light", "Corbel New", "Dialog", "DialogInput", "Microsoft Sans Serif", "Palatino Linotype", "SansSerif", "Segoe UI", "Segoe UI Black", "Segoe UI Light", "Segoe UI Semibold", "Segoe UI Semilight", "Serif", "Sitka Banner", "Sitka Display", "Sitka Heading", "Sitka Small", "Sitka Subheading", "Sitka Text", "Tahoma", "Times New Roman", "Verdana", " " }));
        jPanel5.add(m_fontChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 104, 133, 30));

        m_fontStyle.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        m_fontStyle.setText("Font Style");
        jPanel5.add(m_fontStyle, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 164, 70, 24));

        m_style.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        m_style.setMaximumRowCount(3);
        m_style.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plain", "Bold", "Italic", " ", " " }));
        jPanel5.add(m_style, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 161, 133, 30));

        m_color.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        m_color.setText("Color");
        jPanel5.add(m_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 229, -1, -1));

        m_colorChose.setEditable(false);
        m_colorChose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_colorChoseMouseClicked(evt);
            }
        });
        jPanel5.add(m_colorChose, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 221, 32, 32));

        m_preview.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        m_preview.setText("Hello World");
        m_preview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_previewMouseClicked(evt);
            }
        });
        jPanel5.add(m_preview, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 240, 63));

        m_previewBtn.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        m_previewBtn.setText("Preview");
        m_previewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_previewBtnActionPerformed(evt);
            }
        });
        jPanel5.add(m_previewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/bigger/64.jpg"))); // NOI18N
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -80, 310, 580));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout m_setFontLayout = new javax.swing.GroupLayout(m_setFont.getContentPane());
        m_setFont.getContentPane().setLayout(m_setFontLayout);
        m_setFontLayout.setHorizontalGroup(
            m_setFontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        m_setFontLayout.setVerticalGroup(
            m_setFontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(360, 640));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(195, 217, 213));

        m_settingImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/icon/icons8-picture-32.png"))); // NOI18N
        m_settingImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_settingImageMouseClicked(evt);
            }
        });

        m_settingFont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/icon/icons8-fonts-app-48.png"))); // NOI18N
        m_settingFont.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_settingFontMouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/icon/icons8-download-32.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        m_panelQuote.setMinimumSize(new java.awt.Dimension(345, 560));
        m_panelQuote.setPreferredSize(new java.awt.Dimension(345, 540));
        m_panelQuote.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setEnabled(false);
        jScrollPane2.setFocusable(false);

        m_text.setColumns(20);
        m_text.setRows(20);
        jScrollPane2.setViewportView(m_text);

        m_panelQuote.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 39, 300, 470));

        m_BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/quote/bigger/42.jpg"))); // NOI18N
        m_panelQuote.add(m_BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 334, 540));

        m_quayLai.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        m_quayLai.setText("Quay lại");
        m_quayLai.setContentAreaFilled(false);
        m_quayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_quayLaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(m_quayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(m_settingFont, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(m_settingImage, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(m_panelQuote, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jOptionPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(m_settingImage)
                        .addComponent(m_settingFont, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(m_quayLai))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m_panelQuote, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jOptionPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

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

    public static BufferedImage getScreenShot(Component component) {
        BufferedImage image= new BufferedImage(component.getWidth(), component.getHeight(), BufferedImage.TYPE_INT_RGB);
        component.paint(image.getGraphics());
        return image;
    }
    
    public static void SaveScreenShot(Component component, String filename) throws Exception{
        BufferedImage img=getScreenShot(component);
        ImageIO.write(img, "png", new File(filename));
        
    }
    
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        
        int x=jOptionPane1.showConfirmDialog(this, "Bạn có chắc chắn muốn lưu?");
        if( x==jOptionPane1.YES_OPTION) {
            String fileName=jOptionPane1.showInputDialog(this, "File name:", "Lưu ảnh", jOptionPane1.DEFAULT_OPTION);
            save=fileName;
            try {
                SaveScreenShot(m_panelQuote,save+".png");
                //save=""+SO++;
            } catch (Exception e) {
            }
        }
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void m_quayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_quayLaiActionPerformed
        // TODO add your handling code here:
        new MyQuote().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_m_quayLaiActionPerformed

    private void m_settingImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_settingImageMouseClicked
        // TODO add your handling code here:
        m_chonAnh.setLocationRelativeTo(null);
        m_chonAnh.setVisible(true);
        m_chonAnh.setLocationRelativeTo(null);
    }//GEN-LAST:event_m_settingImageMouseClicked

    private void m_chonAnhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_chonAnhMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_m_chonAnhMouseClicked

    private void m_okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_okBtnActionPerformed

        writeData();
        readData();
        fontSize=IOFile.doc("src/controller/sizeQuote.txt");
        font=IOFileFont.doc("src/controller/fontQuote.txt");
        color=IOFileColor.doc("src/controller/colorQuote.DAT");
        style=IOFile.doc("src/controller/styleQuote.txt");
        if(style==0) {
            f=new Font(font,Font.PLAIN,fontSize);
        }
        else if(style==1) {
            f=new Font(font,Font.BOLD,fontSize);
        }
        else if(style==2) {
            f=new Font(font,Font.ITALIC,fontSize);
        }
        
        m_text.setFont(f);
        m_text.setForeground(color);
        
        m_setFont.setVisible(false);
    }//GEN-LAST:event_m_okBtnActionPerformed

    private void m_colorChoseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_colorChoseMouseClicked
        // TODO add your handling code here:
        color=JColorChooser.showDialog(this, "Chon mau", Color.BLACK);
        m_colorChose.setBackground(color);

    }//GEN-LAST:event_m_colorChoseMouseClicked

    private void m_previewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_previewMouseClicked
        // TODO add your handling code here:
        readData();
        Font f;
        if(style==0) {
            f=new Font(font,Font.PLAIN,fontSize);
            m_preview.setFont(f);
            m_preview.setForeground(color);
        }
        else if(style==1) {
            f=new Font(font,Font.BOLD,fontSize);
            m_preview.setFont(f);
            m_preview.setForeground(color);
        }
        else if(style==2) {
            f=new Font(font,Font.ITALIC,fontSize);
            m_preview.setFont(f);
            m_preview.setForeground(color);
        }

    }//GEN-LAST:event_m_previewMouseClicked

    private void m_previewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_previewBtnActionPerformed
        // TODO add your handling code here:
        writeData();
        readData();
        Font f;
        if(style==0) {
            f=new Font(font,Font.PLAIN,fontSize);
            m_preview.setFont(f);
            m_preview.setForeground(color);
        }
        else if(style==1) {
            f=new Font(font,Font.BOLD,fontSize);
            m_preview.setFont(f);
            m_preview.setForeground(color);
        }
        else if(style==2) {
            f=new Font(font,Font.ITALIC,fontSize);
            m_preview.setFont(f);
            m_preview.setForeground(color);
        }
    }//GEN-LAST:event_m_previewBtnActionPerformed

    private void m_settingFontMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_settingFontMouseClicked
        // TODO add your handling code here:
        m_setFont.setLocationRelativeTo(null);
        m_setFont.setVisible(true);
        m_setFont.setLocationRelativeTo(null);
    }//GEN-LAST:event_m_settingFontMouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        m_chonAnh.setVisible(false);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        bgPath="src/Data/BG/quote/bigger/42.jpg";
        m_BG.setIcon(new ImageIcon(bgPath));
        IOFileFont.viet("src/controller/BGQuote.txt", bgPath);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        bgPath="src/Data/BG/quote/bigger/54.jpg";
        m_BG.setIcon(new ImageIcon(bgPath));
        IOFileFont.viet("src/controller/BGQuote.txt", bgPath);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        bgPath="src/Data/BG/quote/bigger/57.jpg";
        m_BG.setIcon(new ImageIcon(bgPath));
        IOFileFont.viet("src/controller/BGQuote.txt", bgPath);
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        bgPath="src/Data/BG/quote/bigger/60.jpg";
        m_BG.setIcon(new ImageIcon(bgPath));
        IOFileFont.viet("src/controller/BGQuote.txt", bgPath);
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        bgPath="src/Data/BG/quote1/bigger/1 87.jpg";
        m_BG.setIcon(new ImageIcon(bgPath));
        IOFileFont.viet("src/controller/BGQuote.txt", bgPath);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        bgPath="src/Data/BG/quote/bigger/33.jpg";
        m_BG.setIcon(new ImageIcon(bgPath));
        IOFileFont.viet("src/controller/BGQuote.txt", bgPath);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        bgPath="src/Data/BG/quote/bigger/1 64.jpg";
        m_BG.setIcon(new ImageIcon(bgPath));
        IOFileFont.viet("src/controller/BGQuote.txt", bgPath);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        bgPath="src/Data/BG/quote1/bigger/1 13.jpg";
        m_BG.setIcon(new ImageIcon(bgPath));
        IOFileFont.viet("src/controller/BGQuote.txt", bgPath);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        bgPath="src/Data/BG/quote/bigger/1 61.jpg";
        m_BG.setIcon(new ImageIcon(bgPath));
        IOFileFont.viet("src/controller/BGQuote.txt", bgPath);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        bgPath="src/Data/BG/quote/bigger/1 53.jpg";
        m_BG.setIcon(new ImageIcon(bgPath));
        IOFileFont.viet("src/controller/BGQuote.txt", bgPath);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        bgPath="src/Data/BG/quote/bigger/1 49.jpg";
        m_BG.setIcon(new ImageIcon(bgPath));
        IOFileFont.viet("src/controller/BGQuote.txt", bgPath);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        bgPath="src/Data/BG/quote1/bigger/1 8.jpg";
        m_BG.setIcon(new ImageIcon(bgPath));
        IOFileFont.viet("src/controller/BGQuote.txt", bgPath);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        bgPath="src/Data/BG/quote/bigger/1 46.jpg";
        m_BG.setIcon(new ImageIcon(bgPath));
        IOFileFont.viet("src/controller/BGQuote.txt", bgPath);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        bgPath="src/Data/BG/quote1/bigger/1 7.jpg";
        m_BG.setIcon(new ImageIcon(bgPath));
        IOFileFont.viet("src/controller/BGQuote.txt", bgPath);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        bgPath="src/Data/BG/quote1/bigger/1 6.jpg";
        m_BG.setIcon(new ImageIcon(bgPath));
        IOFileFont.viet("src/controller/BGQuote.txt", bgPath);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        bgPath="src/Data/BG/quote/bigger/1 29.jpg";
        m_BG.setIcon(new ImageIcon(bgPath));
        IOFileFont.viet("src/controller/BGQuote.txt", bgPath);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        bgPath="src/Data/BG/quote1/bigger/1 2.jpg";
        m_BG.setIcon(new ImageIcon(bgPath));
        IOFileFont.viet("src/controller/BGQuote.txt", bgPath);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        bgPath="src/Data/BG/quote1/bigger/1 9.jpg";
        m_BG.setIcon(new ImageIcon(bgPath));
        IOFileFont.viet("src/controller/BGQuote.txt", bgPath);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        bgPath="src/Data/BG/quote1/bigger/1 3.jpg";
        m_BG.setIcon(new ImageIcon(bgPath));
        IOFileFont.viet("src/controller/BGQuote.txt", bgPath);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
        bgPath="src/Data/BG/quote/bigger/1 21.jpg";
        m_BG.setIcon(new ImageIcon(bgPath));
        IOFileFont.viet("src/controller/BGQuote.txt", bgPath);
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        // TODO add your handling code here:
        bgPath="src/Data/BG/quote1/bigger/1 1.jpg";
        m_BG.setIcon(new ImageIcon(bgPath));
        IOFileFont.viet("src/controller/BGQuote.txt", bgPath);
    }//GEN-LAST:event_jLabel25MouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel m_BG;
    private javax.swing.JDialog m_chonAnh;
    private javax.swing.JComboBox<String> m_coChu;
    private javax.swing.JLabel m_color;
    private javax.swing.JTextField m_colorChose;
    private javax.swing.JLabel m_font;
    private javax.swing.JComboBox<String> m_fontChu;
    private javax.swing.JLabel m_fontStyle;
    private javax.swing.JToggleButton m_okBtn;
    private javax.swing.JPanel m_panelQuote;
    private javax.swing.JTextField m_preview;
    private javax.swing.JToggleButton m_previewBtn;
    private javax.swing.JToggleButton m_quayLai;
    private javax.swing.JDialog m_setFont;
    private javax.swing.JLabel m_settingFont;
    private javax.swing.JLabel m_settingImage;
    private javax.swing.JComboBox<String> m_style;
    private javax.swing.JTextArea m_text;
    // End of variables declaration//GEN-END:variables
}
