package com.main;

import java.awt.image.BufferedImage;
import java.net.URL;
import javax.swing.ImageIcon;


public class dfltcmd extends javax.swing.JFrame {
tts ts=new tts();
    /**
     * Creates new form dfltcmd
     */
    public dfltcmd() {
        initComponents();
        setTitle("Default Commands");
        URL ico=getClass().getResource("/resources/vr.jpg");
        setIconImage(new javax.swing.ImageIcon(ico).getImage());
       // jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
         jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
         setResizable(false);
         jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/maini.jpg")));
        
        ImageIcon img = new javax.swing.ImageIcon(getClass().getResource("/resources/warning_blue.png")); // NOI18N
    //jLabel4.setIcon(new javax.swing.ImageIcon(img.getImage().getScaledInstance(25,25, BufferedImage.SCALE_SMOOTH)));
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(513, 313));

        jPanel1.setPreferredSize(new java.awt.Dimension(550, 350));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("orange juice", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(50, 165, 255));
        jLabel3.setText("Text to Speech");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 170, 30));

        jLabel2.setFont(new java.awt.Font("orange juice", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(50, 165, 255));
        jLabel2.setText("Default Commands");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 320, -1));

        jScrollPane1.setForeground(new java.awt.Color(50, 165, 255));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(10, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(50, 165, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("  wake up\n  sleep\n  kill yourself\n  whats time now\n  whats date\n  Wi-Fi On\n  Wi-Fi Off  \n  open device manager\n  who are you\n  open/close notepad\n  open/close media player\n  open/close   m s/microsoft  excel\n  open/close   m s/microsoft  word\n  open/close   m s/microsoft  powerpoint\n  open/close   m s/microsoft  access\n  open/close   m s/microsoft  paint\n  open task manager\n  open browser\n  open control panel\n  play music\n  stop music\n  site facebook\n  site google\n  site wikipedia\n  site gmail\n  site tweeter  \n  show default commands\n  hide default commands\n  text to speech");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 460, 180));

        jLabel1.setPreferredSize(new java.awt.Dimension(550, 350));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

ts.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}