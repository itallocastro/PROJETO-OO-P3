/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modulos.ListaTarefasEstudos;
import modulos.ListaTarefasLazer;
import modulos.ListaTarefasTrabalho;

/**
 *
 * @author Castro Alves
 */
public final class ListarTarefas extends javax.swing.JFrame {

    
    ArrayList<ListaTarefasEstudos> estudos = new ArrayList<>();
    ArrayList<ListaTarefasLazer> lazer = new ArrayList<>();
    ArrayList<ListaTarefasTrabalho> trabalho = new ArrayList<>();
    AdicionarTarefas controller;
    int cont1=0,cont2=0,cont3=0;
    int realizados1,realizados2,realizados3,horas_tarefas;
   

    SimpleDateFormat novo = new SimpleDateFormat();
    
    public ListarTarefas(AdicionarTarefas add) {
        initComponents();
        this.controller = add;
        
        //DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        //jTable.setRowSorter(new TableRowSorter(modelo));
        
        carregartarefas();
        
        
        
    }
    public ListarTarefas() {
        initComponents();
        
        carregartarefas();
        
        
        
    }

    
    protected void carregartarefas()
    {
        estudos = controller.retorna_estudos();      
        lazer = controller.retorna_lazer();
        trabalho = controller.retorna_trabalho();
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        Collections.sort(estudos);
        Collections.sort(lazer);
        Collections.sort(trabalho);
        modelo.setNumRows(0);
        int contador = estudos.size();
     
       
        //System.out.println(estudos.size());
        for(int i=0;i<contador;i++)
        {
            modelo.addRow(new Object[]{
                estudos.get(i).getNome_tarefa(),
                estudos.get(i).getTipo(),//+" - "+estudos.get(i).getNome_materia(),
                novo.format(estudos.get(i).getData()),
                estudos.get(i).isConcluse(),
                estudos.get(i).hora_format(estudos.get(i).getHoras())
            });
        }
        cont1=contador;
        contador=trabalho.size();
        for(int i=0;i<contador;i++)
        {
            modelo.addRow(new Object[]{
                trabalho.get(i).getNome_tarefa(),
                trabalho.get(i).getTipo(),
                novo.format(trabalho.get(i).getData()),
                trabalho.get(i).isConcluse(),
                trabalho.get(i).hora_format(trabalho.get(i).getHoras())
                
            });
        }
        cont2=contador;
        contador=lazer.size();
        for(int i=0;i<contador;i++)
        {
            modelo.addRow(new Object[]{
                lazer.get(i).getNome_tarefa(),
                lazer.get(i).getTipo(),
                novo.format(lazer.get(i).getData()),
                lazer.get(i).isConcluse(),
                lazer.get(i).hora_format(lazer.get(i).getHoras())
            });
        }
        cont3=contador;
    }
    private void progressobarra() 
    {
        float porcentagem=((float)realizados1/cont1)*100;
        if(cont1>0) jProgressBarEstudos.setValue((int)porcentagem);
        else jProgressBarEstudos.setValue(0);
        
        porcentagem=((float)realizados2/cont2)*100;
        if(cont2>0) jProgressBarTrabalho.setValue((int)porcentagem);
        else jProgressBarTrabalho.setValue(0);
        
        porcentagem=((float)realizados3/cont3)*100;
        if(cont3>0) jProgressBarLazer.setValue((int)porcentagem);
        else jProgressBarLazer.setValue(0);
              
    }

    
        
    
       

    
       

    
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jVoltar = new javax.swing.JButton();
        jExcluir = new javax.swing.JButton();
        jConcluido = new javax.swing.JButton();
        jProgressBarEstudos = new javax.swing.JProgressBar();
        jProgressBarTrabalho = new javax.swing.JProgressBar();
        jProgressBarLazer = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCronometrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null,  new Boolean(false), null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome da Tarefa", "Tipo de Tarefa", "Data de realização", "CheckList", "Tempo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setResizable(false);
            jTable.getColumnModel().getColumn(1).setResizable(false);
            jTable.getColumnModel().getColumn(2).setResizable(false);
            jTable.getColumnModel().getColumn(3).setResizable(false);
            jTable.getColumnModel().getColumn(4).setResizable(false);
        }

        jVoltar.setText("Voltar");
        jVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVoltarActionPerformed(evt);
            }
        });

        jExcluir.setText("Excluir");
        jExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExcluirActionPerformed(evt);
            }
        });

        jConcluido.setText("Concluído");
        jConcluido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConcluidoActionPerformed(evt);
            }
        });

        jProgressBarEstudos.setStringPainted(true);

        jProgressBarTrabalho.setStringPainted(true);

        jProgressBarLazer.setStringPainted(true);

        jLabel1.setText("Progresso Estudo");

        jLabel2.setText("Progresso Trabalho");

        jLabel3.setText("Progresso Lazer");

        jCronometrar.setText("Cronometrar");
        jCronometrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCronometrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jVoltar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCronometrar)
                                .addGap(31, 31, 31)
                                .addComponent(jConcluido)))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jProgressBarLazer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jProgressBarEstudos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jProgressBarTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addContainerGap(565, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jExcluir)
                    .addComponent(jConcluido)
                    .addComponent(jCronometrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jVoltar)
                    .addComponent(jLabel1))
                .addGap(8, 8, 8)
                .addComponent(jProgressBarEstudos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addComponent(jProgressBarTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBarLazer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExcluirActionPerformed
         DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        int linha_excluir=jTable.getSelectedRow();
        int resto;
        if(linha_excluir!=-1)
        {
          
          
            if(jTable.getValueAt(linha_excluir, 1).equals("Estudo"))
            {
               if(controller.retorna_estudos().get(linha_excluir).isConcluse())
               {
                   realizados1--;
               }
               controller.retorna_estudos().remove(linha_excluir);
               
               cont1--;
            }
            else if(jTable.getValueAt(linha_excluir, 1).equals("Trabalho"))
            {
                resto=controller.retorna_estudos().size();
                if(controller.retorna_trabalho().get(linha_excluir%resto).isConcluse())
                {
                   realizados2--;
                }
               controller.retorna_trabalho().remove(linha_excluir%resto);
               cont2--;
            }
            else if(jTable.getValueAt(linha_excluir, 1).equals("Lazer"))
            {
                resto=controller.retorna_estudos().size()+ controller.retorna_trabalho().size();
                if(controller.retorna_lazer().get(linha_excluir%resto).isConcluse())
                {
                   realizados3--;
                }
               controller.retorna_lazer().remove(linha_excluir%resto);
               cont3--;
            }
        
            modelo.removeRow(linha_excluir);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Selecione uma linha");
        }
        progressobarra();
            
    }//GEN-LAST:event_jExcluirActionPerformed

    private void jVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVoltarActionPerformed
           this.dispose();
    }//GEN-LAST:event_jVoltarActionPerformed

    private void jConcluidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConcluidoActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        
        int linha_concluida=jTable.getSelectedRow();
        if(linha_concluida!=-1)
        {
            if(jTable.getValueAt(linha_concluida, 1).equals("Estudo"))
            {
               controller.retorna_estudos().get(linha_concluida).setConcluse(true);
               realizados1++;
            }
            else if(jTable.getValueAt(linha_concluida, 1).equals("Trabalho"))
            {
               controller.retorna_trabalho().get(linha_concluida).setConcluse(true);
               realizados2++;
            }
            else if(jTable.getValueAt(linha_concluida, 1).equals("Lazer"))
            {
               controller.retorna_lazer().get(linha_concluida).setConcluse(true);
               realizados3++;
            }
        
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Selecione uma linha");
        }
        carregartarefas();
        progressobarra();
            
        
    }//GEN-LAST:event_jConcluidoActionPerformed

    private void jCronometrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCronometrarActionPerformed
        int linha_selecionada = jTable.getSelectedRow();
        int resto;
        if(linha_selecionada!=-1)
        {
           
           
           if(jTable.getValueAt(linha_selecionada, 1).equals("Estudo"))
            {
                Cronometro cro = new Cronometro(linha_selecionada,this,1);
                cro.setVisible(true);
               //controller.retorna_estudos().get(linha_selecionada).setHoras(horas_tarefas);
            }
            else if(jTable.getValueAt(linha_selecionada, 1).equals("Trabalho"))
            {
                Cronometro cro = new Cronometro(linha_selecionada,this,2);
                cro.setVisible(true);
                //resto=controller.retorna_estudos().size();
                //controller.retorna_trabalho().get(linha_selecionada%resto).setHoras(horas_tarefas);
                
            }
            else if(jTable.getValueAt(linha_selecionada, 1).equals("Lazer"))
            {
                Cronometro cro = new Cronometro(linha_selecionada,this,3);
                cro.setVisible(true);
                //resto=controller.retorna_estudos().size()+ controller.retorna_trabalho().size();
                //controller.retorna_lazer().get(linha_selecionada%resto).setHoras(horas_tarefas);
            }
           
           
        }
        else
        {
             JOptionPane.showMessageDialog(null, "Selecione uma linha");
        }
    }//GEN-LAST:event_jCronometrarActionPerformed

    
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
            java.util.logging.Logger.getLogger(ListarTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarTarefas().setVisible(true);
            }
        });
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jConcluido;
    private javax.swing.JButton jCronometrar;
    private javax.swing.JButton jExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBarEstudos;
    private javax.swing.JProgressBar jProgressBarLazer;
    private javax.swing.JProgressBar jProgressBarTrabalho;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton jVoltar;
    // End of variables declaration//GEN-END:variables

    
}
