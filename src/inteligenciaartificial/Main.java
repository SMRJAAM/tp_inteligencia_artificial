package inteligenciaartificial;

import java.awt.Color;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import weka.classifiers.Classifier;
import weka.classifiers.lazy.IB1;
import weka.classifiers.lazy.IBk;
import weka.classifiers.trees.Id3;
import weka.classifiers.trees.J48;
import weka.core.Instances;

public class Main extends javax.swing.JFrame {

    int importStatus;
    String urlTreino;
    String urlTeste;
    FileReader leitorTreino;
    FileReader leitorTeste;
    Instances baseArffTreino;
    Instances baseArffTeste;
    int attrClasse;

    public Main() {
        initComponents();
        afterInitComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelComponentes = new javax.swing.JPanel();
        jPanelInnerComponentes = new javax.swing.JPanel();
        jTextFieldURL = new javax.swing.JTextField();
        jButtonProcurar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jCheckBoxIB1 = new javax.swing.JCheckBox();
        jCheckBoxIBk = new javax.swing.JCheckBox();
        jCheckBoxJ48 = new javax.swing.JCheckBox();
        jCheckBoxDE = new javax.swing.JCheckBox();
        jButtonLimpar = new javax.swing.JButton();
        jButtonClassificar = new javax.swing.JButton();
        jButtonExportar = new javax.swing.JButton();
        jPanelConteudo = new javax.swing.JPanel();
        jTabbedPaneConteudo = new javax.swing.JTabbedPane();
        jPanelMatrizConfusao = new javax.swing.JPanel();
        jScrollPaneMatrizConfusao = new javax.swing.JScrollPane();
        jEditorPaneMatrizConfusao = new javax.swing.JEditorPane();
        jPanelTreino = new javax.swing.JPanel();
        jScrollPaneTreino = new javax.swing.JScrollPane();
        jTextAreaTreino = new javax.swing.JTextArea();
        jPanelTeste = new javax.swing.JPanel();
        jScrollPaneTeste = new javax.swing.JScrollPane();
        jTextAreaTeste = new javax.swing.JTextArea();
        jToolBarImprimir = new javax.swing.JToolBar();
        jLabelStatusTreino = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelStatusTeste = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuItemNovo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Avaliação de Classificadores 1.0");
        setMaximumSize(new java.awt.Dimension(655, 550));
        setMinimumSize(new java.awt.Dimension(655, 550));
        setPreferredSize(new java.awt.Dimension(655, 550));
        setResizable(false);

        jPanelComponentes.setPreferredSize(new java.awt.Dimension(863, 140));

        jTextFieldURL.setEditable(false);
        jTextFieldURL.setFocusable(false);
        jTextFieldURL.setPreferredSize(new java.awt.Dimension(450, 28));

        jButtonProcurar.setText("Importar");
        jButtonProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProcurarActionPerformed(evt);
            }
        });

        jCheckBoxIB1.setText("IB1 (Weka)");
        jCheckBoxIB1.setEnabled(false);
        jCheckBoxIB1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBoxIB1ItemStateChanged(evt);
            }
        });

        jCheckBoxIBk.setText("IBk (Weka)");
        jCheckBoxIBk.setEnabled(false);
        jCheckBoxIBk.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBoxIBkItemStateChanged(evt);
            }
        });

        jCheckBoxJ48.setText("J48 (Weka)");
        jCheckBoxJ48.setEnabled(false);
        jCheckBoxJ48.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBoxJ48ItemStateChanged(evt);
            }
        });

        jCheckBoxDE.setText("Distância Euclidiana");
        jCheckBoxDE.setEnabled(false);
        jCheckBoxDE.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBoxDEItemStateChanged(evt);
            }
        });
        jCheckBoxDE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDEActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setEnabled(false);
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonClassificar.setText("Classificar");
        jButtonClassificar.setEnabled(false);
        jButtonClassificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClassificarActionPerformed(evt);
            }
        });

        jButtonExportar.setText("Exportar");
        jButtonExportar.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxIB1)
                    .addComponent(jCheckBoxIBk))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBoxDE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonLimpar)
                        .addGap(1, 1, 1)
                        .addComponent(jButtonClassificar)
                        .addGap(1, 1, 1)
                        .addComponent(jButtonExportar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBoxJ48)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxIB1)
                    .addComponent(jCheckBoxJ48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxIBk)
                    .addComponent(jCheckBoxDE))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonClassificar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelInnerComponentesLayout = new javax.swing.GroupLayout(jPanelInnerComponentes);
        jPanelInnerComponentes.setLayout(jPanelInnerComponentesLayout);
        jPanelInnerComponentesLayout.setHorizontalGroup(
            jPanelInnerComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInnerComponentesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInnerComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(jPanelInnerComponentesLayout.createSequentialGroup()
                        .addComponent(jTextFieldURL, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonProcurar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelInnerComponentesLayout.setVerticalGroup(
            jPanelInnerComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInnerComponentesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanelInnerComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelComponentesLayout = new javax.swing.GroupLayout(jPanelComponentes);
        jPanelComponentes.setLayout(jPanelComponentesLayout);
        jPanelComponentesLayout.setHorizontalGroup(
            jPanelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInnerComponentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelComponentesLayout.setVerticalGroup(
            jPanelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComponentesLayout.createSequentialGroup()
                .addComponent(jPanelInnerComponentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelComponentes, java.awt.BorderLayout.PAGE_START);

        jPanelConteudo.setLayout(new java.awt.BorderLayout());

        jPanelMatrizConfusao.setLayout(new java.awt.BorderLayout());

        jEditorPaneMatrizConfusao.setEditable(false);
        jEditorPaneMatrizConfusao.setContentType("text/html"); // NOI18N
        jScrollPaneMatrizConfusao.setViewportView(jEditorPaneMatrizConfusao);

        jPanelMatrizConfusao.add(jScrollPaneMatrizConfusao, java.awt.BorderLayout.CENTER);

        jTabbedPaneConteudo.addTab("Matriz de Confusão", jPanelMatrizConfusao);

        jPanelTreino.setLayout(new java.awt.BorderLayout());

        jTextAreaTreino.setEditable(false);
        jTextAreaTreino.setColumns(20);
        jTextAreaTreino.setRows(5);
        jScrollPaneTreino.setViewportView(jTextAreaTreino);

        jPanelTreino.add(jScrollPaneTreino, java.awt.BorderLayout.CENTER);

        jTabbedPaneConteudo.addTab("(Treino)", jPanelTreino);

        jPanelTeste.setLayout(new java.awt.BorderLayout());

        jTextAreaTeste.setEditable(false);
        jTextAreaTeste.setColumns(20);
        jTextAreaTeste.setRows(5);
        jScrollPaneTeste.setViewportView(jTextAreaTeste);

        jPanelTeste.add(jScrollPaneTeste, java.awt.BorderLayout.CENTER);

        jTabbedPaneConteudo.addTab("(Teste)", jPanelTeste);

        jPanelConteudo.add(jTabbedPaneConteudo, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanelConteudo, java.awt.BorderLayout.CENTER);

        jToolBarImprimir.setFloatable(false);
        jToolBarImprimir.setRollover(true);
        jToolBarImprimir.setPreferredSize(new java.awt.Dimension(13, 22));
        jToolBarImprimir.add(Box.createHorizontalGlue());

        jLabelStatusTreino.setBackground(new java.awt.Color(255, 51, 51));
        jLabelStatusTreino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelStatusTreino.setEnabled(false);
        jLabelStatusTreino.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelStatusTreino.setMaximumSize(new java.awt.Dimension(15, 15));
        jLabelStatusTreino.setMinimumSize(new java.awt.Dimension(15, 15));
        jLabelStatusTreino.setOpaque(true);
        jLabelStatusTreino.setPreferredSize(new java.awt.Dimension(15, 15));
        jToolBarImprimir.add(jLabelStatusTreino);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Arquivo de treino");
        jLabel2.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 20));
        jToolBarImprimir.add(jLabel2);

        jLabelStatusTeste.setBackground(new java.awt.Color(255, 51, 51));
        jLabelStatusTeste.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelStatusTeste.setEnabled(false);
        jLabelStatusTeste.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelStatusTeste.setMaximumSize(new java.awt.Dimension(15, 15));
        jLabelStatusTeste.setMinimumSize(new java.awt.Dimension(15, 15));
        jLabelStatusTeste.setOpaque(true);
        jLabelStatusTeste.setPreferredSize(new java.awt.Dimension(15, 15));
        jToolBarImprimir.add(jLabelStatusTeste);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Arquivo de teste");
        jLabel4.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel4.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 20));
        jToolBarImprimir.add(jLabel4);

        getContentPane().add(jToolBarImprimir, java.awt.BorderLayout.PAGE_END);

        jMenuBar1.setPreferredSize(new java.awt.Dimension(76, 30));

        jMenuArquivo.setMnemonic('A');
        jMenuArquivo.setText("Arquivo");
        jMenuArquivo.setPreferredSize(new java.awt.Dimension(50, 28));

        jMenuItemNovo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemNovo.setMnemonic('N');
        jMenuItemNovo.setText("Novo");
        jMenuItemNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNovoActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemNovo);
        jMenuArquivo.add(jSeparator1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem2.setMnemonic('S');
        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItem2);

        jMenuBar1.add(jMenuArquivo);

        jMenuSobre.setMnemonic('I');
        jMenuSobre.setText("Info");
        jMenuSobre.setPreferredSize(new java.awt.Dimension(50, 28));
        jMenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSobreActionPerformed(evt);
            }
        });

        jMenuItem1.setMnemonic('S');
        jMenuItem1.setText("Sobre");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuSobre.add(jMenuItem1);

        jMenuBar1.add(jMenuSobre);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProcurarActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Attribute-Relation File Format (*.arff)", "arff");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            jTextFieldURL.setText(chooser.getSelectedFile().getPath());
            importar();
        } else {
            jTextFieldURL.setText(null);
        }
    }//GEN-LAST:event_jButtonProcurarActionPerformed

    private void jMenuItemNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNovoActionPerformed
        limparCampos();
    }//GEN-LAST:event_jMenuItemNovoActionPerformed

    private void jCheckBoxIB1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxIB1ItemStateChanged
        jButtonClassificar.setEnabled(verificarCheckBoxes());
    }//GEN-LAST:event_jCheckBoxIB1ItemStateChanged

    private void jCheckBoxIBkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxIBkItemStateChanged
        jButtonClassificar.setEnabled(verificarCheckBoxes());
    }//GEN-LAST:event_jCheckBoxIBkItemStateChanged

    private void jCheckBoxJ48ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxJ48ItemStateChanged
        jButtonClassificar.setEnabled(verificarCheckBoxes());
    }//GEN-LAST:event_jCheckBoxJ48ItemStateChanged

    private void jCheckBoxDEItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxDEItemStateChanged
        jButtonClassificar.setEnabled(verificarCheckBoxes());
    }//GEN-LAST:event_jCheckBoxDEItemStateChanged

    private void jButtonClassificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClassificarActionPerformed

        String matriz = "<html><head></head><body>";

        if (jCheckBoxIB1.isSelected()) {
            try {
                matriz += classificarWeka(baseArffTeste, baseArffTreino, new IB1());
            } catch (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (jCheckBoxIBk.isSelected()) {
            try {
                matriz += classificarWeka(baseArffTeste, baseArffTreino, new IBk());
            } catch (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (jCheckBoxJ48.isSelected()) {
            try {
                matriz += classificarWeka(baseArffTeste, baseArffTreino, new J48());
            } catch (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (jCheckBoxDE.isSelected()) {
            matriz += classificarDistanciaEuclidiana(baseArffTeste, baseArffTreino);
        }

        matriz += "</body></html>";

        jEditorPaneMatrizConfusao.setText(matriz);
        SwingUtilities.invokeLater(doScroll);
        
        jButtonLimpar.setEnabled(true);
        
    }//GEN-LAST:event_jButtonClassificarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jEditorPaneMatrizConfusao.setText("");
        jButtonLimpar.setEnabled(false);
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jMenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSobreActionPerformed

    }//GEN-LAST:event_jMenuSobreActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(this, "Software de Avaliação de Classificadores versão 1.0 \n\n Desenvolvido por: \n Stevan Mosquetti Ribeiro \n Jhordan A. A. Martinez ", "Sobre", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jCheckBoxDEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxDEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxDEActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClassificar;
    private javax.swing.JButton jButtonExportar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonProcurar;
    private javax.swing.JCheckBox jCheckBoxDE;
    private javax.swing.JCheckBox jCheckBoxIB1;
    private javax.swing.JCheckBox jCheckBoxIBk;
    private javax.swing.JCheckBox jCheckBoxJ48;
    private javax.swing.JEditorPane jEditorPaneMatrizConfusao;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelStatusTeste;
    private javax.swing.JLabel jLabelStatusTreino;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemNovo;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelComponentes;
    private javax.swing.JPanel jPanelConteudo;
    private javax.swing.JPanel jPanelInnerComponentes;
    private javax.swing.JPanel jPanelMatrizConfusao;
    private javax.swing.JPanel jPanelTeste;
    private javax.swing.JPanel jPanelTreino;
    private javax.swing.JScrollPane jScrollPaneMatrizConfusao;
    private javax.swing.JScrollPane jScrollPaneTeste;
    private javax.swing.JScrollPane jScrollPaneTreino;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPaneConteudo;
    private javax.swing.JTextArea jTextAreaTeste;
    private javax.swing.JTextArea jTextAreaTreino;
    private javax.swing.JTextField jTextFieldURL;
    private javax.swing.JToolBar jToolBarImprimir;
    // End of variables declaration//GEN-END:variables

    private void afterInitComponentes() {
        importStatus = 0;
        jEditorPaneMatrizConfusao.setText("");

        jButtonProcurar.requestFocusInWindow();
    }

    private void limparCampos() {
        importStatus = 0;
        urlTreino = null;
        urlTeste = null;

        leitorTreino = null;
        leitorTeste = null;
        baseArffTreino = null;
        baseArffTeste = null;

        jTextFieldURL.setText(null);
        jLabelStatusTreino.setBackground(Color.RED);
        jLabelStatusTeste.setBackground(Color.RED);
        jCheckBoxIB1.setEnabled(false);
        jCheckBoxIBk.setEnabled(false);
        jCheckBoxJ48.setEnabled(false);
        jCheckBoxDE.setEnabled(false);
        jCheckBoxIB1.setSelected(false);
        jCheckBoxIBk.setSelected(false);
        jCheckBoxJ48.setSelected(false);
        jCheckBoxDE.setSelected(false);
        jButtonLimpar.setEnabled(false);
        jButtonClassificar.setEnabled(false);
        jButtonExportar.setEnabled(false);

        jEditorPaneMatrizConfusao.setText(null);
        jTextAreaTreino.setText(null);
        jTextAreaTeste.setText(null);

        jTabbedPaneConteudo.setTitleAt(1, "(Teste)");
        jTabbedPaneConteudo.setTitleAt(2, "(Teste)");

        jButtonProcurar.requestFocusInWindow();
        jButtonProcurar.setEnabled(true);
    }

    private boolean verificarCheckBoxes() {
        return jCheckBoxIB1.isSelected() || jCheckBoxIBk.isSelected() || jCheckBoxJ48.isSelected() || jCheckBoxDE.isSelected();
    }

    private String classificarWeka(Instances baseArffTeste, Instances baseArffTreino, Classifier classificador) throws Exception {

        int numInstancesTeste = baseArffTeste.numInstances();

        classificador.buildClassifier(baseArffTreino);

        int[][] matrix = new int[baseArffTeste.attribute(attrClasse).numValues()][baseArffTeste.attribute(attrClasse).numValues()];
        int classeReal = 0;
        int classe = 0;

        for (int i = 0; i < numInstancesTeste; i++) {

            classeReal = (int) baseArffTeste.instance(i).classValue();
            classe = (int) classificador.classifyInstance(baseArffTeste.instance(i));

            matrix[classe][classeReal]++;

        }

        String title = "";

        if (classificador instanceof IB1) {
            title = "(IB1 -  Weka)";
        } else if (classificador instanceof IBk) {
            title = "(IBk -  Weka)";
        } else {
            title = "(J48 - Weka)";
        }

        //-------------------------------------------------------------------------------------------------------
        return printMatrizConfusao(title, baseArffTeste, matrix);
        //-------------------------------------------------------------------------------------------------------			

    }

    private String classificarDistanciaEuclidiana(Instances baseArffTeste, Instances baseArffTreino) {

        int numInstancesTreino = baseArffTreino.numInstances();
        int numInstancesTeste = baseArffTeste.numInstances();

        int numValues = baseArffTeste.attribute(attrClasse).numValues();
        int[][] matrix = new int[numValues][numValues];

        for (int i = 0; i < numInstancesTeste; i++) {
            int classeReal = (int) baseArffTeste.instance(i).classValue();
            int index = 0;
            HashMap<Integer, Double> mapa = new HashMap();
            for (int c = 0; c < numInstancesTreino; c++) {
                Double distancia = null;
                Double aux = 0.00;
                for (int j = 0; j < baseArffTreino.instance(c).numAttributes() - 1; j++) {
                    aux += Math.pow(baseArffTreino.instance(c).value(j) - baseArffTeste.instance(i).value(j), 2);
                }
                distancia = Math.sqrt(aux);
                mapa.put(c, distancia);
            }

            mapa = (HashMap<Integer, Double>) sortByValue(mapa);

            for (Entry<Integer, Double> entry : mapa.entrySet()) {
                index = (int) baseArffTreino.instance(entry.getKey()).value(attrClasse);
                break;
            }
            matrix[index][classeReal]++;
        }

        //-------------------------------------------------------------------------------------------------------
        return printMatrizConfusao("(Distância Euclidiana)", baseArffTeste, matrix);
        //-------------------------------------------------------------------------------------------------------			

    }

    public String printMatrizConfusao(String title, Instances baseArffTeste, int[][] matrix) {
        int numValues = baseArffTeste.attribute(attrClasse).numValues();
        int numClasses = baseArffTeste.numClasses() + 1;

        double v = 0;
        double f = 0;
        HashMap<Integer, Double> diagMap = new HashMap();
        HashMap<Integer, Double> vertMap = new HashMap();
        HashMap<Integer, Double> horzMap = new HashMap();

        String matriz = ("<table><tr><td>");

        matriz += ("<table border=\"1\">");
        matriz += ("<tr><th colspan=\"" + numClasses + "\">" + title + "</th></tr>");
        matriz += ("<tr><td></td>");
        for (int i = 0; i < numValues; i++) {
            matriz += ("<td>" + baseArffTeste.instance(i).attribute(attrClasse).value(i) + "</td>");
            diagMap.put(i, 0.00);
            vertMap.put(i, 0.00);            
            horzMap.put(i, 0.00);            
        }
        for (int i = 0; i < numValues; i++) {
            matriz += ("<tr><td>" + baseArffTeste.instance(i).attribute(attrClasse).value(i) + "</td>");
            for (int j = 0; j < numValues; j++) {
                matriz += "<td>";
                if (i == j) {
                    matriz += "<font color=\"#FFF\">" + matrix[j][i] + "</font>";
                    v += matrix[j][i];
                    diagMap.put(i, (double)matrix[j][i]);
                } else {
                    matriz += matrix[j][i];
                    f += matrix[j][i];
                    vertMap.put(j, (vertMap.get(j)+matrix[j][i]));
                    horzMap.put(i, (horzMap.get(i)+matrix[j][i]));
                }
                matriz += "</td>";

            }
            matriz += "</tr>";
        }

        double precisao = 0;
        double revocacao = 0;
        for (int i = 0; i < numValues; i++){
            precisao += diagMap.get(i)/(diagMap.get(i)+vertMap.get(i));
            revocacao += diagMap.get(i)/(diagMap.get(i)+horzMap.get(i));
            System.out.println("Pr: "+diagMap.get(i)+" / ("+diagMap.get(i)+" + "+vertMap.get(i)+") = "+diagMap.get(i)/(diagMap.get(i)+vertMap.get(i)));
            System.out.println("Re: "+diagMap.get(i)+" / ("+diagMap.get(i)+" + "+horzMap.get(i)+") = "+diagMap.get(i)/(diagMap.get(i)+horzMap.get(i)));
        }
        
        System.out.println("Média Pr: "+precisao+" / "+numValues+" = "+precisao/numValues);        
        precisao = arredondarNumero((precisao/numValues), 1000);
        
        System.out.println("Média Re: "+revocacao+" / "+numValues+" = "+revocacao/numValues);        
        revocacao = arredondarNumero((revocacao/numValues), 1000);        
        
        matriz += "</table>";
        matriz += "</td>";
        matriz += "<td>";
        matriz += "Precisão: " + precisao + "<br> "
                + "Revocação: " + revocacao + "<br> "
                + "Acurácia: " + arredondarNumero((v / (v + f)), 1000) + "<br> "
                + "Taxa de Erro: " + arredondarNumero((f / (v + f)), 1000) + "<br> ";
        matriz += "</td>";
        matriz += "</tr></table>";
        matriz += "<br>";

        return matriz;
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {

        List<Map.Entry<K, V>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<K, V>>() {

            @Override
            public int compare(Entry<K, V> arg0, Entry<K, V> arg1) {
                return (arg0.getValue().compareTo(arg1.getValue()));
            }

        });

        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;

    }

    Runnable doScroll = new Runnable() {
        public void run() {
            jScrollPaneMatrizConfusao.getVerticalScrollBar().setValue(0);
            jScrollPaneTreino.getVerticalScrollBar().setValue(0);
            jScrollPaneTeste.getVerticalScrollBar().setValue(0);
        }
    };

    private void importar() {
        if (importStatus != 2) {
            if (urlTreino != null && jTextFieldURL.getText().trim().equals(urlTreino.trim())) {
                JOptionPane.showMessageDialog(this, "Arquivo de teste não pode ser igual ao arquivo de treino!", "Aviso", JOptionPane.WARNING_MESSAGE);
                jTextFieldURL.setText(null);
                return;
            } else {
                importStatus++;
            }
        }
        if (importStatus == 1) {
            urlTreino = jTextFieldURL.getText();
            try {
                leitorTreino = new FileReader(urlTreino);
                baseArffTreino = new Instances(leitorTreino);
                attrClasse = baseArffTreino.numAttributes() - 1;
                baseArffTreino.setClassIndex(attrClasse);

//        Id3 arvore = new Id3();
//        try {
//            arvore.buildClassifier(baseArffTreino);
//        } catch (Exception ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        System.out.println(arvore);                
                byte[] encoded = Files.readAllBytes(Paths.get(urlTreino));
                jTextAreaTreino.setText(new String(encoded, Charset.defaultCharset()));
                SwingUtilities.invokeLater(doScroll);
                jTabbedPaneConteudo.setTitleAt(1, urlTreino.substring(urlTreino.lastIndexOf("\\") + 1) + " (Treino)");
                jLabelStatusTreino.setBackground(Color.GREEN);
            } catch (Exception ex) {
                importStatus--;
                jLabelStatusTreino.setBackground(Color.RED);
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (importStatus == 2) {
            urlTeste = jTextFieldURL.getText();
            try {
                leitorTeste = new FileReader(urlTeste);
                baseArffTeste = new Instances(leitorTeste);
                baseArffTeste.setClassIndex(attrClasse);
                byte[] encoded = Files.readAllBytes(Paths.get(urlTeste));
                jTextAreaTeste.setText(new String(encoded, Charset.defaultCharset()));
                jTabbedPaneConteudo.setTitleAt(2, urlTeste.substring(urlTeste.lastIndexOf("\\") + 1) + " (Teste)");
                SwingUtilities.invokeLater(doScroll);
                jButtonProcurar.setEnabled(false);
                jLabelStatusTeste.setBackground(Color.GREEN);
            } catch (Exception ex) {
                importStatus--;
                jLabelStatusTeste.setBackground(Color.RED);
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        jCheckBoxIB1.setEnabled(importStatus == 2);
        jCheckBoxIBk.setEnabled(importStatus == 2);
        jCheckBoxJ48.setEnabled(importStatus == 2);
        jCheckBoxDE.setEnabled(importStatus == 2);

        jTextFieldURL.setText(null);
    }

    private double arredondarNumero(double numero, int precisao) {
        return (double) Math.round(numero*precisao)/precisao;
    }

}
