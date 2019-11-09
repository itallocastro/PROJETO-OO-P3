/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author Castro Alves
 */
public class Cronometro extends javax.swing.JFrame {

    /**
     * Creates new form Cronometro
     */
    private Timer tm;
    private int contador=0;
    private boolean rodar = false;
    private int[] array_dados = new int[1000]; 
    private int i = 0;
    public Cronometro() 
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jComboBox1 = new javax.swing.JComboBox<>();
        jIniciar = new javax.swing.JButton();
        jPausar = new javax.swing.JButton();
        jContagem = new javax.swing.JLabel();
        jSalvar = new javax.swing.JButton();
        jExcluir = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jIniciar.setText("Iniciar");
        jIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIniciarActionPerformed(evt);
            }
        });

        jPausar.setText("Pausar");
        jPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPausarActionPerformed(evt);
            }
        });

        jContagem.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jContagem.setText("00:00:00");
        jContagem.setToolTipText("");

        jSalvar.setText("Salvar");
        jSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalvarActionPerformed(evt);
            }
        });

        jExcluir.setText("Excluir");
        jExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPausar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jSalvar)
                        .addGap(151, 151, 151))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jContagem)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jIniciar)
                .addGap(7, 7, 7)
                .addComponent(jContagem)
                .addGap(28, 28, 28)
                .addComponent(jPausar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSalvar)
                    .addComponent(jExcluir))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIniciarActionPerformed
      if(!rodar)
      {
          
        tm = new Timer();
        tm.scheduleAtFixedRate(
        new TimerTask()
        {
            @Override
            public void run()
            {
                
          
                    
                    contador++;
                    int segundo = contador % 60;
                    int minutos = contador / 60;
                    int horas = minutos / 60;
                    minutos %= 60;
                    
                    
                    jContagem.setText(String.format("%02d:%02d:%02d", horas,minutos,segundo)); 
                   
                

                
            }  
        }
                            
        
                ,1000 , 1000);
        rodar = true;
      }
        
        
        
    }//GEN-LAST:event_jIniciarActionPerformed

    private void jPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPausarActionPerformed
        if(rodar)
        {
            tm.cancel();
            rodar = false;
           
        }
    }//GEN-LAST:event_jPausarActionPerformed

    private void jSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalvarActionPerformed
        if(!rodar)
        {
            if(contador!=0) array_dados[i++]=contador;
            contador = 0;
            jContagem.setText(String.format("00:00:00")); 
            tm.cancel();

            rodar = false;
        }
    }//GEN-LAST:event_jSalvarActionPerformed

    private void jExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExcluirActionPerformed
          
        boolean flag = false;
        while(!flag)
        {
           try
           {
               
                if(!rodar)
                {

                    contador = 0;
                    jContagem.setText(String.format("00:00:00")); 
                    tm.cancel();
                    rodar = false;
                }                       
           }
           catch(NullPointerException e)
           {
               JOptionPane.showMessageDialog(null, "Inicie Primeiro.");
               flag=true;
           }
                 
        }
  
    }//GEN-LAST:event_jExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(Cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new Cronometro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jContagem;
    private javax.swing.JButton jExcluir;
    private javax.swing.JButton jIniciar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JButton jPausar;
    private javax.swing.JButton jSalvar;
    // End of variables declaration//GEN-END:variables
}
