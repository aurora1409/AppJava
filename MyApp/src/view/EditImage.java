/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.IOFileFont;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import static view.NewQuote.SaveScreenShot;

/**
 *
 * @author PC
 */
public class EditImage extends javax.swing.JFrame implements WindowListener, ChangeListener {

    /**
     * Creates new form EditImage
     */
//    private File f;
    Image targetImg;
    int targetWidth;
    int targetHeight;
    private String save;
    BufferedImage Img;
    BufferedImage ImgReset;
    String path;
    int[][][] rbg_buffer;
    File f;

    public EditImage() {
        initComponents();
        addWindowListener(this);
        Img = null;
    }

    public static BufferedImage getScreenShot(Component component) {
        BufferedImage image = new BufferedImage(component.getWidth(), component.getHeight(), BufferedImage.TYPE_INT_RGB);
        component.paint(image.getGraphics());
        return image;
    }

    public static void SaveScreenShot(Component component, String filename) throws Exception {
        BufferedImage img = getScreenShot(component);
        ImageIO.write(img, "png", new File(filename));

    }

    public BufferedImage toBufferedImage(Image image) {
        if (image instanceof BufferedImage) {
            return (BufferedImage) image;
        }

        BufferedImage Img = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics2D gr = Img.createGraphics();
        gr.drawImage(image, 0, 0, null);
        gr.dispose();

        return Img;
    }

    public void ReadImagePixels() {

        for (int row = 0; row < Img.getHeight(); row++) {
            for (int col = 0; col < Img.getWidth(); col++) {
                Color c = new Color(Img.getRGB(col, row));

                rbg_buffer[0][row][col] = c.getRed();
                rbg_buffer[1][row][col] = c.getGreen();
                rbg_buffer[2][row][col] = c.getBlue();
            }
        }
    }

    public void SmoothImage() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                ReadImagePixels();
                for (int row = 1; row < Img.getHeight() - 1; row++) {
                    for (int col = 1; col < Img.getWidth() - 1; col++) {
                        int r = rbg_buffer[0][row - 1][col - 1]
                                + rbg_buffer[0][row - 1][col]
                                + rbg_buffer[0][row - 1][col + 1]
                                + rbg_buffer[0][row][col - 1]
                                + rbg_buffer[0][row][col]
                                + rbg_buffer[0][row][col + 1]
                                + rbg_buffer[0][row + 1][col - 1]
                                + rbg_buffer[0][row + 1][col]
                                + rbg_buffer[0][row + 1][col + 1];

                        int g = rbg_buffer[1][row - 1][col - 1]
                                + rbg_buffer[1][row - 1][col]
                                + rbg_buffer[1][row - 1][col + 1]
                                + rbg_buffer[1][row][col - 1]
                                + rbg_buffer[1][row][col]
                                + rbg_buffer[1][row][col + 1]
                                + rbg_buffer[1][row + 1][col - 1]
                                + rbg_buffer[1][row + 1][col]
                                + rbg_buffer[1][row + 1][col + 1];

                        int b = rbg_buffer[2][row - 1][col - 1]
                                + rbg_buffer[2][row - 1][col]
                                + rbg_buffer[2][row - 1][col + 1]
                                + rbg_buffer[2][row][col - 1]
                                + rbg_buffer[2][row][col]
                                + rbg_buffer[2][row][col + 1]
                                + rbg_buffer[2][row + 1][col - 1]
                                + rbg_buffer[2][row + 1][col]
                                + rbg_buffer[2][row + 1][col + 1];

                        Color c = new Color(r / 9, g / 9, b / 9);
                        Img.setRGB(col, row, c.getRGB());
                    }
                }
                repaint();
            }

        }).start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        slider_h = new javax.swing.JSlider();
        slider_v = new javax.swing.JSlider();
        quayLai = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        chooseImg = new javax.swing.JToggleButton();
        download = new javax.swing.JToggleButton();
        blur = new javax.swing.JToggleButton();
        reset = new javax.swing.JToggleButton();
        img = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(405, 700));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(223, 237, 233));
        jPanel1.setMinimumSize(new java.awt.Dimension(405, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(405, 700));

        jPanel2.setBackground(new java.awt.Color(223, 237, 233));

        slider_h.setMinimum(1);
        slider_h.setValue(100);
        slider_h.setName("slider_h"); // NOI18N

        slider_v.setMinimum(1);
        slider_v.setValue(100);
        slider_v.setName("slider_v"); // NOI18N

        quayLai.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        quayLai.setText("Quay lại");
        quayLai.setContentAreaFilled(false);
        quayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quayLaiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Width");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Height");

        chooseImg.setBackground(new java.awt.Color(113, 165, 138));
        chooseImg.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        chooseImg.setText("Chọn ảnh");
        chooseImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseImgActionPerformed(evt);
            }
        });

        download.setBackground(new java.awt.Color(113, 165, 138));
        download.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        download.setText("Tải xuống");
        download.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadActionPerformed(evt);
            }
        });

        blur.setBackground(new java.awt.Color(113, 165, 138));
        blur.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        blur.setText("Blur");
        blur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blurActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(113, 165, 138));
        reset.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(quayLai)
                        .addGap(97, 97, 97)
                        .addComponent(chooseImg)
                        .addGap(18, 18, 18)
                        .addComponent(download))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(32, 32, 32)
                                .addComponent(slider_h, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addComponent(slider_v, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(blur, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quayLai)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chooseImg)
                            .addComponent(download))))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addComponent(slider_h, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(slider_v, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(blur))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(reset))))
        );

        img.setBackground(new java.awt.Color(161, 204, 195));

        javax.swing.GroupLayout imgLayout = new javax.swing.GroupLayout(img);
        img.setLayout(imgLayout);
        imgLayout.setHorizontalGroup(
            imgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 363, Short.MAX_VALUE)
        );
        imgLayout.setVerticalGroup(
            imgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(419, 737));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void quayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quayLaiActionPerformed
        // TODO add your handling code here:
        new TrangChu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_quayLaiActionPerformed

    private void chooseImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseImgActionPerformed

        slider_h.setValue(100);
        slider_v.setValue(100);
        img.removeAll();

        img.setLayout(new BorderLayout());
        slider_h.addChangeListener((ChangeListener) this);
        slider_v.addChangeListener((ChangeListener) this);

        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Hinh anh", "jpg", "png");
        fileChooser.setFileFilter(imageFilter);
        fileChooser.setMultiSelectionEnabled(false);

        int x = fileChooser.showDialog(this, "Chon file");
        if (x == JFileChooser.APPROVE_OPTION) {
            f = fileChooser.getSelectedFile();

            path = f.getAbsolutePath();

            try {
                targetImg = ImageIO.read(f);
                Img = toBufferedImage(targetImg);
                rbg_buffer = new int[3][Img.getHeight()][Img.getWidth()];

                repaint();
            } catch (IOException ex) {
                Logger.getLogger(EditImage.class.getName()).log(Level.SEVERE, null, ex);
            }
            targetWidth = targetImg.getWidth(null);
            targetHeight = targetImg.getHeight(null);

            JLabel lbImg = new JLabel(new ImageIcon(targetImg));

            lbImg.setHorizontalAlignment(SwingConstants.CENTER);
            lbImg.setVerticalAlignment(SwingConstants.CENTER);
            img.add(lbImg, BorderLayout.CENTER);
            img.updateUI();

        }


    }//GEN-LAST:event_chooseImgActionPerformed

    private void downloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadActionPerformed
        // TODO add your handling code here:
        JOptionPane jOptionPane1 = new JOptionPane();
        int x = jOptionPane1.showConfirmDialog(this, "Bạn có chắc chắn muốn lưu?");
        if (x == jOptionPane1.YES_OPTION) {
            String fileName = jOptionPane1.showInputDialog(this, "File name:", "Lưu ảnh", jOptionPane1.DEFAULT_OPTION);
            save = fileName;
            try {
                SaveScreenShot(img, save + ".png");
                //save=""+SO++;
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_downloadActionPerformed

    private void blurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blurActionPerformed
        
        JLabel lb = (JLabel) img.getComponent(0);
        lb.setSize(new Dimension(targetWidth, targetHeight));
        lb.setIcon(new ImageIcon(targetImg.getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH)));
        SmoothImage();

    }//GEN-LAST:event_blurActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
       
        rbg_buffer = new int[3][Img.getHeight()][Img.getWidth()];
       
        try {
           
            targetImg = ImageIO.read(f);
        } catch (IOException ex) {
            Logger.getLogger(EditImage.class.getName()).log(Level.SEVERE, null, ex);
        }
        Img = toBufferedImage(targetImg);
        repaint();
        slider_h.setValue(100);
        slider_v.setValue(100);
        JLabel lb = (JLabel) img.getComponent(0);
       
        lb.setIcon(new ImageIcon(path));
        repaint();

    }//GEN-LAST:event_resetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton blur;
    private javax.swing.JToggleButton chooseImg;
    private javax.swing.JToggleButton download;
    private javax.swing.JPanel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton quayLai;
    private javax.swing.JToggleButton reset;
    private javax.swing.JSlider slider_h;
    private javax.swing.JSlider slider_v;
    // End of variables declaration//GEN-END:variables


    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        
        JSlider j = (JSlider) e.getSource();
        JLabel lb = (JLabel) img.getComponent(0);
        switch (j.getName()) {
            case "slider_h":
                targetWidth = (targetImg.getWidth(null) * j.getValue()) / 100;
                lb.setSize(new Dimension(targetWidth, targetHeight));
                lb.setIcon(new ImageIcon(targetImg.getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH)));               
                break;
            case "slider_v":
                targetHeight = (targetImg.getHeight(null) * j.getValue()) / 100;
                lb.setSize(new Dimension(targetWidth, targetHeight));
                lb.setIcon(new ImageIcon(targetImg.getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH)));
                break;
            
        }
        lb.updateUI();
    }

    @Override
    public void windowClosing(WindowEvent e) {
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }

}
