/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import menu.AddMaterias;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modulos.ListaTarefasEstudos;
import modulos.ListaTarefasLazer;
import modulos.ListaTarefasTrabalho;

/**
 *
 * @author Castro Alves
 */
public class AdicionarTarefas extends javax.swing.JFrame {

    AddMaterias adicionar_materias = new AddMaterias();
    int cont,anterior;
    String[] materias = new String[20];
    ArrayList<ListaTarefasEstudos> estudos = new ArrayList<>();
    ArrayList<ListaTarefasLazer> lazer = new ArrayList<>();
    ArrayList<ListaTarefasTrabalho> trabalho = new ArrayList<>();
    
    
    
    
    public int cont()
    {
        return estudos.size();
    }
    public void atribui_string()
    {
        for(int i=0;i<cont;i++)
        {
        
            materias[i] = adicionar_materias.getmaterias_estudos(i);
        }
        
    }
    public AdicionarTarefas() 
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

        jPanel1 = new javax.swing.JPanel();
        jAdd = new javax.swing.JButton();
        jVoltar = new javax.swing.JButton();
        jNomeTarefa = new javax.swing.JTextField();
        jTipos = new javax.swing.JComboBox<>();
        jMaterias = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jAddMaterias = new javax.swing.JMenu();
        jAdicionar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jAdd.setText("Adicionar");
        jAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddActionPerformed(evt);
            }
        });

        jVoltar.setText("Voltar");
        jVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVoltarActionPerformed(evt);
            }
        });

        jTipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudos", "Trabalho", "Lazer"}));
        jTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTiposActionPerformed(evt);
            }
        });

        jMaterias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));

        jLabel1.setText("Nome da tarefa");

        jLabel2.setText("Tipo");

        jLabel3.setText("Matéria(Somente para o tipo de estudo)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jAdd)
                .addGap(61, 61, 61))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNomeTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTipos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(52, 52, 52)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jMaterias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNomeTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAdd)
                    .addComponent(jVoltar))
                .addGap(101, 101, 101))
        );

        jAddMaterias.setText("Adicionar Matérias");

        jAdicionar.setText("Adicionar");
        jAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAdicionarActionPerformed(evt);
            }
        });
        jAddMaterias.add(jAdicionar);

        jMenuBar1.add(jAddMaterias);

        setJMenuBar(jMenuBar1);

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTiposActionPerformed
        String tipo =(String) jTipos.getSelectedItem();
        if(tipo.equals("Estudos"))
        {
            jMaterias.enable();
            cont = adicionar_materias.getcontador();
            atribui_string();
             for(int i=anterior;i<cont;i++)
             {
                
                jMaterias.addItem(materias[i]);
                
             }
            anterior = cont; 
        }
        else if(tipo.equals("Trabalho"))
        {
            jMaterias.disable();
        }
        else if(tipo.equals("Lazer"))
        {
            jMaterias.disable();
        }
        
    }//GEN-LAST:event_jTiposActionPerformed

    private void jAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAdicionarActionPerformed
        
        adicionar_materias.setVisible(true);
        
    }//GEN-LAST:event_jAdicionarActionPerformed

    private void jAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddActionPerformed
       String tipo =(String) jTipos.getSelectedItem();
        if(tipo.equals("Estudos") && (!jNomeTarefa.getText().equals("")))
        {
            ListaTarefasEstudos novo_estudo = new ListaTarefasEstudos(jNomeTarefa.getText(),String.valueOf(jMaterias.getSelectedItem()));
            estudos.add(novo_estudo);           
             JOptionPane.showMessageDialog(null, "Adicionado com sucesso!");
        }
        else if(tipo.equals("Trabalho") && (!jNomeTarefa.getText().equals("")))
        {
            ListaTarefasTrabalho nova_tarefa = new ListaTarefasTrabalho(jNomeTarefa.getText());
            trabalho.add(nova_tarefa);
            JOptionPane.showMessageDialog(null, "Adicionado com sucesso!");
        }
        else if(tipo.equals("Lazer") && (!jNomeTarefa.getText().equals("")))
        {
            ListaTarefasLazer novo_lazer = new ListaTarefasLazer(jNomeTarefa.getText());
            lazer.add(novo_lazer);
            JOptionPane.showMessageDialog(null, "Adicionado com sucesso!");
        }
        jNomeTarefa.setText("");
       
       
    }//GEN-LAST:event_jAddActionPerformed

    private void jVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVoltarActionPerformed
        this.dispose();
       
        
    }//GEN-LAST:event_jVoltarActionPerformed
    public ArrayList<ListaTarefasEstudos> retorna_estudos()
    {
        
        return this.estudos;
    }
    public ArrayList<ListaTarefasLazer> retorna_lazer()
    {
        return this.lazer;
    }
    public ArrayList<ListaTarefasTrabalho> retorna_trabalho()
    {
        return this.trabalho;
    }
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
            java.util.logging.Logger.getLogger(AdicionarTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarTarefas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAdd;
    private javax.swing.JMenu jAddMaterias;
    private javax.swing.JMenuItem jAdicionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> jMaterias;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jNomeTarefa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jTipos;
    private javax.swing.JButton jVoltar;
    // End of variables declaration//GEN-END:variables
}
