/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.IOFile;
import controller.IOFileColor;
import controller.IOFileFont;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import model.Sound;
import java.lang.Thread;

/**
 *
 * @author PC
 */
public class EditImage extends javax.swing.JFrame {

    private String filePath;
    private String soundPath;
    long start, end;
    long time=0;
    private Sound sound;

    /**
     * Creates new form EditImage
     */
    @SuppressWarnings("empty-statement")
    public EditImage() {
//        this.bufferedImage = cropImage(fileToWrite, WIDTH, WIDTH, WIDTH, WIDTH);
        initComponents();
        this.setLocationRelativeTo(null);
        
//        readData();
        //String path="D:/Data ProPTIT/JavaApp/MyApp/src/Ludum Dare 32 - Track 2.wav";
        //IOFileFont.viet("src/controller/sound.txt", path);
        //soundPath=path;
        
        
        
//        int i=0;
//       while(i<=100) {
//           time=0;
//           while(time<50) {
//                start = System.currentTimeMillis(); // start lấy thời gian theo millisecond
//                for (long j=0; j<100000000; j++);    //vòng lặp không thực hiện thêm lệnh nào
//                end = System.currentTimeMillis();   // start lấy thời gian theo millisecond
//                System.out.println("Time Millis: " + (end - start));
//                time+=(end-start);
//           }
//           i++;
////           System.err.println(i);
//           jSlider1.setValue(i);
//           System.err.println(jSlider1.getValue());
//           jLabel1.setText(""+jSlider1.getValue());
//       }
       
       
//        while(time<500) {
//            start = System.currentTimeMillis(); // start lấy thời gian theo millisecond
//            for (long j=0; j<100000000; j++);    //vòng lặp không thực hiện thêm lệnh nào
//            end = System.currentTimeMillis();   // start lấy thời gian theo millisecond
//            System.out.println("Time Millis: " + (end - start));
//            time+=(end-start);
//            i++;
//            jSlider1.setValue(i);
//            jLabel1.setText(""+jSlider1.getValue());
////            try {
////                Thread.sleep(150);
////            } catch (InterruptedException ex) {
////                Logger.getLogger(EditImage.class.getName()).log(Level.SEVERE, null, ex);
////            }
////            start = System.currentTimeMillis(); // start lấy thời gian theo millisecond
////            for (long j=0; j<100000000; j++);    //vòng lặp không thực hiện thêm lệnh nào
////            end = System.currentTimeMillis();   // start lấy thời gian theo millisecond
////            System.out.println("Time Millis: " + (end - start));
////            time+=(end-start);
//        }
        //jSlider1.setValue(10);
//        jLabel1.setText(""+jSlider1.getValue());
        
        
        
        //Rectangle box=new Rectangle(evt.getXOnScreen(), evt.getYOnScreen(), evt.getX(), evt.getY());
//        File imageFile = new File("D:/Data ProPTIT/JavaApp/BG/1\big/1 (28).jpg");
//        try {
//            BufferedImage bufferedImage = ImageIO.read(imageFile);
//            jLabel2.setIcon((Icon) cropImage(bufferedImage, label., evt.getYOnScreen(), evt.getX(), evt.getY()));
//        } catch (IOException ex) {
//            Logger.getLogger(EditImage.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    
    public void readData() {
        File f2= new File("src/controller/font.txt");
        if (f2.exists()) {
            soundPath = IOFileFont.doc("src/controller/sound.txt");
            //System.out.println(fontSize);
        }
    }
    
//    private BufferedImage cropImage(BufferedImage image, BoundingBox box) {
//        Rectangle goal = new Rectangle(Math.round(box.getLeft()* image.getWidth()),Math.round(box.getTop()* image.getHeight()),Math.round(box.getWidth() * image.getWidth()), Math.round(box.getHeight() * image.getHeight()));
// 
//        Rectangle clip = goal.intersection(new Rectangle(image.getWidth(), image.getHeight()));
// 
//        BufferedImage clippedImg = image.getSubimage(clip.x, clip.y , clip.width, clip.height);
// 
//        return clippedImg;
//    }
    
//    File fileToWrite = new File(filePath, "url");
//    //BufferedImage bufferedImage = cropImage(fileToWrite, x, y, w, h);
//    BufferedImage bufferedImage;
//
//    private BufferedImage cropImage(File filePath, int x, int y, int w, int h){
//
//        try {
//            BufferedImage originalImgage = ImageIO.read(filePath);
//
//            BufferedImage subImgage = originalImgage.getSubimage(x, y, w, h);
//
//            return subImgage;
//        } catch (IOException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(360, 640));
        setMinimumSize(new java.awt.Dimension(360, 640));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(179, 204, 179));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Nỗi nhớ tựa thiên hà");
        jTextField1.setSelectionColor(new java.awt.Color(82, 143, 114));
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(179, 204, 179));
        jTextField2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Melody Of The Night");
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(179, 204, 179));
        jTextField3.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("We Really Love");
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(179, 204, 179));
        jTextField4.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("Windy Hill");
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(179, 204, 179));
        jTextField5.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("Winter Sonata");
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(179, 204, 179));
        jTextField6.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("Love Is Like A Flower");
        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField6MouseClicked(evt);
            }
        });

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(179, 204, 179));
        jTextField7.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("Kiss The Rain");
        jTextField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField7MouseClicked(evt);
            }
        });

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(179, 204, 179));
        jTextField8.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("Love After That");
        jTextField8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField8MouseClicked(evt);
            }
        });

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(179, 204, 179));
        jTextField9.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("Endless Path");
        jTextField9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField9MouseClicked(evt);
            }
        });

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(179, 204, 179));
        jTextField10.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("It's Your Day");
        jTextField10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setViewportView(jPanel2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 39, 336, 560));

        jToggleButton2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jToggleButton2.setText("Quay lại");
        jToggleButton2.setContentAreaFilled(false);
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/BG/3/bigger/1 (63).jpg"))); // NOI18N
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

        setBounds(0, 0, 374, 677);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        new TrangChu().setVisible(true);
        this.dispose();
        //sound.stop();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
        if(sound!=null) {
            sound.stop();
        }
        
        String path="src/Data/sounds/NoiNhoTuaThienHa-CMJ-6316523.wav";
        IOFileFont.viet("src/controller/sound.txt", path);
        soundPath=IOFileFont.doc("src/controller/sound.txt");
        sound=new Sound(soundPath);
        //Khởi tạo đối tượng với đường dận đến file nhạc ở đây mình demo là abc.wav
        sound.start();
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        // TODO add your handling code here:
        if(sound!=null) {
            sound.stop();
        }
        
        String path="src/Data/sounds/NightOfThePiano-HoaTau-3089095.wav";
        IOFileFont.viet("src/controller/sound.txt", path);
        soundPath=IOFileFont.doc("src/controller/sound.txt");
        sound=new Sound(soundPath);
        //Khởi tạo đối tượng với đường dận đến file nhạc ở đây mình demo là abc.wav
        sound.start();
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        // TODO add your handling code here:
        if(sound!=null) {
            sound.stop();
        }
        
        String path="src/Data/sounds/WeReallyLovePiano-VA_3za33.wav";
        IOFileFont.viet("src/controller/sound.txt", path);
        soundPath=IOFileFont.doc("src/controller/sound.txt");
        sound=new Sound(soundPath);
        //Khởi tạo đối tượng với đường dận đến file nhạc ở đây mình demo là abc.wav
        sound.start();
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        // TODO add your handling code here:
        if(sound!=null) {
            sound.stop();
        }
        
        String path="src/Data/sounds/WindyHill-VA-5941232.wav";
        IOFileFont.viet("src/controller/sound.txt", path);
        soundPath=IOFileFont.doc("src/controller/sound.txt");
        sound=new Sound(soundPath);
        //Khởi tạo đối tượng với đường dận đến file nhạc ở đây mình demo là abc.wav
        sound.start();
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        // TODO add your handling code here:
        if(sound!=null) {
            sound.stop();
        }
        
        String path="src/Data/sounds/WinterSonata-RichardClayderman_mbjj.wav";
        IOFileFont.viet("src/controller/sound.txt", path);
        soundPath=IOFileFont.doc("src/controller/sound.txt");
        sound=new Sound(soundPath);
        //Khởi tạo đối tượng với đường dận đến file nhạc ở đây mình demo là abc.wav
        sound.start();
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseClicked
        // TODO add your handling code here:
        if(sound!=null) {
            sound.stop();
        }
        
        String path="src/Data/sounds/LoveIsLikeAFlower-Danbi_3w7nv.wav";
        IOFileFont.viet("src/controller/sound.txt", path);
        soundPath=IOFileFont.doc("src/controller/sound.txt");
        sound=new Sound(soundPath);
        //Khởi tạo đối tượng với đường dận đến file nhạc ở đây mình demo là abc.wav
        sound.start();
    }//GEN-LAST:event_jTextField6MouseClicked

    private void jTextField7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7MouseClicked
        // TODO add your handling code here:
        if(sound!=null) {
            sound.stop();
        }
        
        String path="src/Data/sounds/KissTheRain-Yiruma-75858.wav";
        IOFileFont.viet("src/controller/sound.txt", path);
        soundPath=IOFileFont.doc("src/controller/sound.txt");
        sound=new Sound(soundPath);
        //Khởi tạo đối tượng với đường dận đến file nhạc ở đây mình demo là abc.wav
        sound.start();
    }//GEN-LAST:event_jTextField7MouseClicked

    private void jTextField8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField8MouseClicked
        // TODO add your handling code here:
        if(sound!=null) {
            sound.stop();
        }
        
        String path="src/Data/sounds/LoveAfterThatPiano-VA_3za46.wav";
        IOFileFont.viet("src/controller/sound.txt", path);
        soundPath=IOFileFont.doc("src/controller/sound.txt");
        sound=new Sound(soundPath);
        //Khởi tạo đối tượng với đường dận đến file nhạc ở đây mình demo là abc.wav
        sound.start();
    }//GEN-LAST:event_jTextField8MouseClicked

    private void jTextField9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField9MouseClicked
        // TODO add your handling code here:
        if(sound!=null) {
            sound.stop();
        }
        
        String path="src/Data/sounds/EndlessPathPiano-VA_3za53.wav";
        IOFileFont.viet("src/controller/sound.txt", path);
        soundPath=IOFileFont.doc("src/controller/sound.txt");
        sound=new Sound(soundPath);
        //Khởi tạo đối tượng với đường dận đến file nhạc ở đây mình demo là abc.wav
        sound.start();
    }//GEN-LAST:event_jTextField9MouseClicked

    private void jTextField10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField10MouseClicked
        // TODO add your handling code here:
        if(sound!=null) {
            sound.stop();
        }
        
        String path="src/Data/sounds/ItsYourDay-Yiruma_48t6f.wav";
        IOFileFont.viet("src/controller/sound.txt", path);
        soundPath=IOFileFont.doc("src/controller/sound.txt");
        sound=new Sound(soundPath);
        //Khởi tạo đối tượng với đường dận đến file nhạc ở đây mình demo là abc.wav
        sound.start();
    }//GEN-LAST:event_jTextField10MouseClicked

    public static BufferedImage cropImage(BufferedImage bufferedImage, int x, int y, int width, int height){
        BufferedImage croppedImage = bufferedImage.getSubimage(x, y, width, height);
        return croppedImage;
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(EditImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EditImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EditImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EditImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EditImage().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}
