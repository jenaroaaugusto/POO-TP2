/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.visao;

import java.util.List;
import javax.swing.JOptionPane;
import locadora.Database;
import locadora.Fabrica;
import locadora.controle.FilmeControle;
import locadora.modelo.Filme;
import locadora.tabelas.TabelaFilme;


public class FilmeVisao extends javax.swing.JPanel implements Visao{

    protected TabelaFilme modeloTabela;
	private FilmeControle controle;
    /**
     * Creates new form FilmeVisao
     */
    public FilmeVisao() {
        modeloTabela = new TabelaFilme(Database.getInstance().getFilmes());
        controle = (FilmeControle) Fabrica.getFabrica("filme").criaControle();
        initComponents();
        addDialog.pack();
        addDialog.setLocationRelativeTo(null);
        editDialog.pack();
        editDialog.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        addDialog = new javax.swing.JDialog();
        addNomeField = new javax.swing.JTextField();
        addNomeLabel = new javax.swing.JLabel();
        addConfirmButton = new javax.swing.JButton();
        addCancelButton = new javax.swing.JButton();
        editDialog = new javax.swing.JDialog();
        editNomeField = new javax.swing.JTextField();
        editNomeLabel = new javax.swing.JLabel();
        editConfirmButton = new javax.swing.JButton();
        editCancelButton = new javax.swing.JButton();
        pane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();

        addDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addDialog.setTitle("Novo Filme");
        addDialog.setAlwaysOnTop(true);
        addDialog.setResizable(false);

        addNomeLabel.setText("Nome:");

        addConfirmButton.setText("Confirmar");
        addConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addConfirmButtonActionPerformed(evt);
            }
        });

        addCancelButton.setText("Cancelar");
        addCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addDialogLayout = new javax.swing.GroupLayout(addDialog.getContentPane());
        addDialog.getContentPane().setLayout(addDialogLayout);
        addDialogLayout.setHorizontalGroup(
            addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addDialogLayout.createSequentialGroup()
                        .addComponent(addNomeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(addNomeField, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addDialogLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addConfirmButton)
                        .addGap(38, 38, 38)
                        .addComponent(addCancelButton)))
                .addContainerGap())
        );
        addDialogLayout.setVerticalGroup(
            addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addNomeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCancelButton)
                    .addComponent(addConfirmButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        editDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        editDialog.setTitle("Editar Filme");
        editDialog.setAlwaysOnTop(true);
        editDialog.setResizable(false);

        editNomeLabel.setText("Nome:");

        editConfirmButton.setText("Confirmar");
        editConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editConfirmButtonActionPerformed(evt);
            }
        });

        editCancelButton.setText("Cancelar");
        editCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editDialogLayout = new javax.swing.GroupLayout(editDialog.getContentPane());
        editDialog.getContentPane().setLayout(editDialogLayout);
        editDialogLayout.setHorizontalGroup(
            editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editDialogLayout.createSequentialGroup()
                        .addComponent(editNomeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(editNomeField, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editDialogLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(editConfirmButton)
                        .addGap(36, 36, 36)
                        .addComponent(editCancelButton)))
                .addContainerGap())
        );
        editDialogLayout.setVerticalGroup(
            editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editNomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editNomeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editCancelButton)
                    .addComponent(editConfirmButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table.setAutoCreateRowSorter(true);
        table.setModel(modeloTabela);
        pane.setViewportView(table);

        addButton.setText("Adicionar");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Remover");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        editButton.setText("Editar");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pane, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(removeButton)
                    .addComponent(editButton))
                .addContainerGap())
        );
    }//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        setEnabled(false);
        addNomeField.setText("");
        addDialog.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        try{
            controle.removerFilme(modeloTabela.getValueAt(table.convertRowIndexToModel(table.getSelectedRow())));
        }catch (IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this, "Selecione um filme", "Não é possível remover", JOptionPane.ERROR_MESSAGE);
        }
        modeloTabela.fireTableDataChanged();
    }//GEN-LAST:event_removeButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        getParent().setEnabled(false);
        try{
            editNomeField.setText((String) table.getValueAt(table.convertRowIndexToModel(table.getSelectedRow()), 0));
            editDialog.setVisible(true);
        }catch (IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this, "Selecione um filme", "Não é possível editar", JOptionPane.ERROR_MESSAGE);
            getParent().setEnabled(true);
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void addConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addConfirmButtonActionPerformed
        controle.adicionarFilme(addNomeField.getText());
        modeloTabela.fireTableDataChanged();
        addDialog.dispose();
        getParent().setEnabled(true);
    }//GEN-LAST:event_addConfirmButtonActionPerformed

    private void addCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCancelButtonActionPerformed
        addDialog.dispose();
        getParent().setEnabled(false);
    }//GEN-LAST:event_addCancelButtonActionPerformed

    private void editConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editConfirmButtonActionPerformed
        controle.editarFilme(modeloTabela.getValueAt(table.getSelectedRow()), editNomeField.getText());
        modeloTabela.fireTableDataChanged();
        editDialog.dispose();
        getParent().setEnabled(true);
    }//GEN-LAST:event_editConfirmButtonActionPerformed

    private void editCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCancelButtonActionPerformed
        editDialog.dispose();
        getParent().setEnabled(false);
    }//GEN-LAST:event_editCancelButtonActionPerformed
    
    public void update(){
        modeloTabela.fireTableDataChanged();
    }

    public void update(List<Filme> filmes){
        modeloTabela.setFilmes(filmes);
        modeloTabela.fireTableDataChanged();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton addCancelButton;
    private javax.swing.JButton addConfirmButton;
    private javax.swing.JDialog addDialog;
    private javax.swing.JTextField addNomeField;
    private javax.swing.JLabel addNomeLabel;
    private javax.swing.JButton editButton;
    private javax.swing.JButton editCancelButton;
    private javax.swing.JButton editConfirmButton;
    private javax.swing.JDialog editDialog;
    private javax.swing.JTextField editNomeField;
    private javax.swing.JLabel editNomeLabel;
    private javax.swing.JScrollPane pane;
    private javax.swing.JButton removeButton;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
