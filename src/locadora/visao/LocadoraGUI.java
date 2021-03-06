/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.visao;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import locadora.Database;
import locadora.Fabrica;
import locadora.controle.ArquivoManager;

public class LocadoraGUI extends javax.swing.JFrame {

    /**
     * Creates new form LocadoraGUI
     */
    public LocadoraGUI() {
        initComponents();
        clienteVisao.modeloTabela.addTableModelListener(locacaoVisao.modeloTabela);
        filmeVisao.modeloTabela.addTableModelListener(locacaoVisao.modeloTabela);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        salvarArquivoChooser = new javax.swing.JFileChooser();
        abrirArquivoChooser = new javax.swing.JFileChooser();
        mainPane = new javax.swing.JTabbedPane();
        clienteVisao = new locadora.visao.ClienteVisao();
        filmeVisao = new locadora.visao.FilmeVisao();
        locacaoVisao = new locadora.visao.LocacaoVisao();
        menuBar = new javax.swing.JMenuBar();
        arquivoMenu = new javax.swing.JMenu();
        salvarArquivoItem = new javax.swing.JMenuItem();
        abrirArquivoItem = new javax.swing.JMenuItem();

        salvarArquivoChooser.setAcceptAllFileFilterUsed(false);
        salvarArquivoChooser.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        salvarArquivoChooser.setApproveButtonText("Salvar");
        salvarArquivoChooser.setDialogTitle("Salvar Como...");
        salvarArquivoChooser.setFileFilter(new Filtro());

        abrirArquivoChooser.setAcceptAllFileFilterUsed(false);
        abrirArquivoChooser.setApproveButtonText("Abrir");
        abrirArquivoChooser.setFileFilter(new Filtro());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Locadora");

        mainPane.addTab("Clientes", clienteVisao);
        mainPane.addTab("Filmes", filmeVisao);
        mainPane.addTab("Locações", locacaoVisao);

        getContentPane().add(mainPane, java.awt.BorderLayout.CENTER);

        arquivoMenu.setText("Arquivo");

        salvarArquivoItem.setText("Salvar Como...");
        salvarArquivoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarArquivoItemActionPerformed(evt);
            }
        });
        arquivoMenu.add(salvarArquivoItem);

        abrirArquivoItem.setText("Abrir Arquivo");
        abrirArquivoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirArquivoItemActionPerformed(evt);
            }
        });
        arquivoMenu.add(abrirArquivoItem);

        menuBar.add(arquivoMenu);

        setJMenuBar(menuBar);

        pack();
    }//GEN-END:initComponents

    private void salvarArquivoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarArquivoItemActionPerformed
        int retorno = salvarArquivoChooser.showSaveDialog(this);
        if(retorno == JFileChooser.APPROVE_OPTION){
            Path path = Paths.get(salvarArquivoChooser.getSelectedFile().getPath());
            try {
                ArquivoManager.getInstance().salvar(Database.getInstance(), path);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(salvarArquivoChooser, ex.getMessage(), "Ocorreu um erro", JOptionPane.ERROR_MESSAGE);
                
            }
        }
    }//GEN-LAST:event_salvarArquivoItemActionPerformed

    private void abrirArquivoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirArquivoItemActionPerformed
        int retorno = salvarArquivoChooser.showOpenDialog(this);
        if(retorno == JFileChooser.APPROVE_OPTION){
            Path path = Paths.get(salvarArquivoChooser.getSelectedFile().getPath());
            try {
                Database.setInstance((Database) ArquivoManager.getInstance().abrir(path));
                clienteVisao.update(Database.getInstance().getClientes());
                filmeVisao.update(Database.getInstance().getFilmes());
                locacaoVisao.update(Database.getInstance().getLocacoes());
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(salvarArquivoChooser, ex.getMessage(), "Ocorreu um erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_abrirArquivoItemActionPerformed

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
            java.util.logging.Logger.getLogger(LocadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LocadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LocadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LocadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LocadoraGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser abrirArquivoChooser;
    private javax.swing.JMenuItem abrirArquivoItem;
    private javax.swing.JMenu arquivoMenu;
    private locadora.visao.ClienteVisao clienteVisao;
    private locadora.visao.FilmeVisao filmeVisao;
    private locadora.visao.LocacaoVisao locacaoVisao;
    private javax.swing.JTabbedPane mainPane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JFileChooser salvarArquivoChooser;
    private javax.swing.JMenuItem salvarArquivoItem;
    // End of variables declaration//GEN-END:variables
}

class Filtro extends FileFilter {

    @Override
    public boolean accept(File f) {
        return f.isDirectory() || f.getAbsolutePath().endsWith(".ser");
    }

    @Override
    public String getDescription() {
        return "Objetos Serializados (*.ser)";
    }    
}
