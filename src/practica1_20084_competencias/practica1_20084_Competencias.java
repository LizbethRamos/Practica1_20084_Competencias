package practica1_20084_competencias;

import java.util.logging.Level;
import java.util.logging.Logger;


public class practica1_20084_Competencias extends javax.swing.JFrame {

    public practica1_20084_Competencias() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bRun = new javax.swing.JButton();
        bPausa = new javax.swing.JButton();
        bDetener = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Area2 = new javax.swing.JTextArea();
        Hilo1 = new javax.swing.JLabel();
        Hilo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bRun.setText("Iniciar");
        bRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRunActionPerformed(evt);
            }
        });

        bPausa.setText("Pausar");
        bPausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPausaActionPerformed(evt);
            }
        });

        bDetener.setText("Detener");
        bDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDetenerActionPerformed(evt);
            }
        });

        Area1.setColumns(20);
        Area1.setRows(5);
        jScrollPane1.setViewportView(Area1);

        Area2.setColumns(20);
        Area2.setRows(5);
        jScrollPane2.setViewportView(Area2);

        Hilo1.setText("Hilo1");

        Hilo2.setText("Hilo2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bDetener)
                    .addComponent(bRun)
                    .addComponent(bPausa))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(Hilo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Hilo2)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Hilo1)
                            .addComponent(Hilo2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(bRun)
                                .addGap(33, 33, 33)
                                .addComponent(bPausa)
                                .addGap(36, 36, 36)
                                .addComponent(bDetener))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRunActionPerformed
        
            h1 = new Hilo1(Area1);
            h2 = new Hilo2(Area2);
            h1.start();
            h2.start();
            bRun.setEnabled(false);
    }//GEN-LAST:event_bRunActionPerformed

    private void bPausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPausaActionPerformed
        
        if(bPausa.getText().equals("Pausar")){
            bPausa.setText("Continuar");
            h1.pausar();
            h2.pausar();
        }else{
            bPausa.setText("Pausar");
            h1.continuar();
            h2.continuar();
        }
    }//GEN-LAST:event_bPausaActionPerformed

    private void bDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDetenerActionPerformed
        h1.parar();
        h2.parar();
        bRun.setEnabled(true);
    }//GEN-LAST:event_bDetenerActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(practica1_20084_Competencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(practica1_20084_Competencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(practica1_20084_Competencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(practica1_20084_Competencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new practica1_20084_Competencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area1;
    private javax.swing.JTextArea Area2;
    private javax.swing.JLabel Hilo1;
    private javax.swing.JLabel Hilo2;
    private javax.swing.JButton bDetener;
    private javax.swing.JButton bPausa;
    private javax.swing.JButton bRun;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    private Hilo1 h1;
    private Hilo2 h2;
}
