/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modulos.ListaTarefas;
import modulos.ListaTarefasEstudos;
import modulos.ListaTarefasLazer;
import modulos.ListaTarefasTrabalho;

/**
 *
 * @author Castro Alves
 */
public final class ListarTarefas extends javax.swing.JFrame {

    ArrayList<ListaTarefas> all_tasks = new ArrayList<>();
    
    AdicionarTarefas controller;
    int cont1=0,cont2=0,cont3=0;
    int realizados1,realizados2,realizados3,horas_tarefas;
    
   

    SimpleDateFormat novo = new SimpleDateFormat();
    
    public ListarTarefas(AdicionarTarefas add) {
        initComponents();
        this.controller = add;
        this.setDefaultCloseOperation(0);
        //DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        //jTable.setRowSorter(new TableRowSorter(modelo));
        
        carregartarefas();
        
        
        
    }
    public ListarTarefas() {
        initComponents();
        this.setDefaultCloseOperation(0);
        carregartarefas();
        progressobarra();
        
        
        
    }

    
    protected void carregartarefas()
    {
        all_tasks = controller.retorna_tarefas();      
        
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        
        Collections.sort(all_tasks);
        
        modelo.setNumRows(0);
        int contador = all_tasks.size();
     
       
        //System.out.println(estudos.size());
        for(int i=0;i<contador;i++)
        {
            if(all_tasks.get(i).getTipo().equals("Estudos"))
            {
                cont1++;
            }
            else if(all_tasks.get(i).getTipo().equals("Trabalho"))
            {
                cont2++;
            }
            else if(all_tasks.get(i).getTipo().equals("Lazer"))
            {
                cont3++;
            }
            if(all_tasks.get(i).getHoras() instanceof String)
            {
                    
                    modelo.addRow(new Object[]{
                    all_tasks.get(i).getNome_tarefa(),
                    all_tasks.get(i).getTipo(),
                    novo.format(all_tasks.get(i).getData()),
                    all_tasks.get(i).isConcluse(),
                    all_tasks.get(i).getHoras()
                });
            }
            else
            {
                
                modelo.addRow(new Object[]{
                    all_tasks.get(i).getNome_tarefa(),
                    all_tasks.get(i).getTipo(),
                    novo.format(all_tasks.get(i).getData()),
                    all_tasks.get(i).isConcluse(),
                    all_tasks.get(i).hora_format((int)all_tasks.get(i).getHoras())
                });
            }
        }
        
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
        jAlterarData = new javax.swing.JButton();
        jBuscar = new javax.swing.JButton();
        jInserirH = new javax.swing.JButton();

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

        jAlterarData.setText("Alterar Data");
        jAlterarData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlterarDataActionPerformed(evt);
            }
        });

        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jInserirH.setText("Inserir Horário");
        jInserirH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInserirHActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jProgressBarLazer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jProgressBarEstudos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jProgressBarTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 291, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jInserirH))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBuscar)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCronometrar)
                                .addGap(31, 31, 31)
                                .addComponent(jConcluido))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jAlterarData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jVoltar)))
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
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
                    .addComponent(jCronometrar)
                    .addComponent(jBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jVoltar)
                    .addComponent(jLabel1)
                    .addComponent(jAlterarData)
                    .addComponent(jInserirH))
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
        
        if(linha_excluir!=-1)
        {
          
            controller.retorna_tarefas().remove(linha_excluir);
            if(jTable.getValueAt(linha_excluir, 1).equals("Estudo"))
            {
               if(controller.retorna_tarefas().get(linha_excluir).isConcluse())
               {
                   realizados1--;
               }
               
               
               cont1--;
            }
            else if(jTable.getValueAt(linha_excluir, 1).equals("Trabalho"))
            {
                
                if(controller.retorna_tarefas().get(linha_excluir).isConcluse())
                {
                   realizados2--;
                }
              
               cont2--;
            }
            else if(jTable.getValueAt(linha_excluir, 1).equals("Lazer"))
            {
                
                if(controller.retorna_tarefas().get(linha_excluir).isConcluse())
                {
                   realizados3--;
                }
               
              
               
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
            controller.retorna_tarefas().get(linha_concluida).setConcluse(true);
            if(jTable.getValueAt(linha_concluida, 1).equals("Estudo"))
            {
               
               realizados1++;
            }
            else if(jTable.getValueAt(linha_concluida, 1).equals("Trabalho"))
            {
               
               realizados2++;
            }
            else if(jTable.getValueAt(linha_concluida, 1).equals("Lazer"))
            {
               
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
           
               Cronometro cro = new Cronometro(linha_selecionada,this);
                cro.setVisible(true);
           
           
           
           
        }
        else
        {
             JOptionPane.showMessageDialog(null, "Selecione uma linha");
        }
    }//GEN-LAST:event_jCronometrarActionPerformed

    private void jAlterarDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlterarDataActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        int linha_alterar_data=jTable.getSelectedRow();
        
        if(linha_alterar_data!=-1)
        {
          
            controller.retorna_tarefas().get(linha_alterar_data).setData(JOptionPane.showInputDialog("Digite uma data válida: (ex: dd/mm/yyyy)"));
                 
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Selecione uma linha");
        }
        carregartarefas();
    }//GEN-LAST:event_jAlterarDataActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        String data_busca = JOptionPane.showInputDialog("Digite uma data para busca: (ex:dd/mm/yyyy)");
        Date a,b;
        ListaTarefas aux = new ListaTarefas() {};
        aux.setData(data_busca);
        b = aux.getData();
        ArrayList<String> tarefas_buscadas = new ArrayList<>();
        if(data_busca!=null)
        {
            for(int i=0;i<controller.retorna_tarefas().size();i++)
            {
                a = controller.retorna_tarefas().get(i).getData();
                if(b.equals(a))
                {
                    tarefas_buscadas.add(controller.retorna_tarefas().get(i).getNome_tarefa());
                    
                } 
            }
            
            FrameBusca buscando = new FrameBusca(tarefas_buscadas,data_busca);
            buscando.setVisible(true);
            
        }
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jInserirHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInserirHActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        String horario;
        int resto;
        
        int linha_concluida=jTable.getSelectedRow();
        if(linha_concluida!=-1)
        {
            
            while(true)
            {
                horario = JOptionPane.showInputDialog("Digite um horário válido: (ex: hh:mm:ss)");
                if(horario!=null)
                {
                    controller.retorna_tarefas().get(linha_concluida).setHoras(horario);
                    
                    break;
                }
            }
            
            
        
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Selecione uma linha");
        }
        carregartarefas();
        
    }//GEN-LAST:event_jInserirHActionPerformed

    
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
    private javax.swing.JButton jAlterarData;
    private javax.swing.JButton jBuscar;
    private javax.swing.JButton jConcluido;
    private javax.swing.JButton jCronometrar;
    private javax.swing.JButton jExcluir;
    private javax.swing.JButton jInserirH;
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
