/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

/**
 *
 * @author Castro Alves
 */
public class MenuDeOpcoes extends javax.swing.JFrame 
{

    /**
     * Creates new form MenuDeOpcoes
     */
    MetasOpcoes meta = new MetasOpcoes();
    OpcoesTarefas adicionar = new OpcoesTarefas();
    public MenuDeOpcoes() {
        initComponents();
        this.setDefaultCloseOperation(0);
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jChamarMetas = new javax.swing.JButton();
        jTarefas = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Opcoes = new javax.swing.JMenu();
        Sair = new javax.swing.JMenu();
        jSairItem = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar3.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar3.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        jChamarMetas.setText("Metas");
        jChamarMetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChamarMetasActionPerformed(evt);
            }
        });

        jTarefas.setText("Tarefas");
        jTarefas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTarefasActionPerformed(evt);
            }
        });

        Opcoes.setText("Opcoes");
        jMenuBar1.add(Opcoes);

        Sair.setText("Sair");

        jSairItem.setText("Exit");
        jSairItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSairItemActionPerformed(evt);
            }
        });
        Sair.add(jSairItem);

        jMenuBar1.add(Sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jChamarMetas)
                .addGap(77, 77, 77)
                .addComponent(jTarefas)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChamarMetas)
                    .addComponent(jTarefas))
                .addContainerGap(181, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jSairItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jSairItemActionPerformed

    private void jChamarMetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChamarMetasActionPerformed
        meta.setLocationRelativeTo(null);
        meta.setVisible(true);
    }//GEN-LAST:event_jChamarMetasActionPerformed

    private void jTarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTarefasActionPerformed
        meta.setLocationRelativeTo(null);
        adicionar.setVisible(true);  
        
        
    }//GEN-LAST:event_jTarefasActionPerformed

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
            java.util.logging.Logger.getLogger(MenuDeOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDeOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDeOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDeOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDeOpcoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Opcoes;
    private javax.swing.JMenu Sair;
    private javax.swing.JButton jChamarMetas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jSairItem;
    private javax.swing.JButton jTarefas;
    // End of variables declaration//GEN-END:variables
}
