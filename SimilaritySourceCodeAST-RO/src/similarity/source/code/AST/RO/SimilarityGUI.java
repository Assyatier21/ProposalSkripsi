/*
 * Nama  : Muhammad Sholeh
 * NIM   : 09021281823172
 * Informatika Reguler 2018
 */
package similarity.source.code.AST.RO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.DecimalFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author Muhammad Sholeh
 */
public class SimilarityGUI extends javax.swing.JFrame {

    /**
     * Creates new form SimilarityGUI
     */ 
    private static final DecimalFormat df = new DecimalFormat("0.00000000");
    private double[] percentage = new double[4];
    private double[] percentageWOAST = new double[4];
    private String[] rawSC = new String[5];
    private String[] rawSCWOAST = new String[5];
    private String pathDC = "";
    
    
    public SimilarityGUI() {
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

        AppTitle = new javax.swing.JLabel();
        DocSCmain = new javax.swing.JLabel();
        duplicateSourceCodeLabel = new javax.swing.JLabel();
        mainDocFile = new javax.swing.JButton();
        duplicateFileFolder = new javax.swing.JButton();
        mainDocument = new javax.swing.JLabel();
        processingLabel = new javax.swing.JLabel();
        folderPath = new javax.swing.JLabel();
        runDetection = new javax.swing.JButton();
        preprocessingLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        preprocessedSC = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tokenizedSC = new javax.swing.JTextArea();
        tokenizingLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        percentTable = new javax.swing.JTable();
        tokenizingLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Source Code Similarity AST-RO");

        AppTitle.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        AppTitle.setText("Source Code Similarity Detector");

        DocSCmain.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        DocSCmain.setText("Main Source Code :");

        duplicateSourceCodeLabel.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        duplicateSourceCodeLabel.setText("Duplicate Source Code :");

        mainDocFile.setText("Choose File....");
        mainDocFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainDocFileActionPerformed(evt);
            }
        });

        duplicateFileFolder.setText("Choose File....");
        duplicateFileFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duplicateFileFolderActionPerformed(evt);
            }
        });

        mainDocument.setBackground(new java.awt.Color(255, 255, 255));

        processingLabel.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        processingLabel.setText("Process Source Code Documents");

        folderPath.setBackground(new java.awt.Color(255, 255, 255));

        runDetection.setText("EXECUTE PROGRAM");
        runDetection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runDetectionActionPerformed(evt);
            }
        });

        preprocessingLabel.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        preprocessingLabel.setText("Preprocessing Source Code");

        preprocessedSC.setEditable(false);
        preprocessedSC.setColumns(20);
        preprocessedSC.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        preprocessedSC.setRows(5);
        jScrollPane1.setViewportView(preprocessedSC);
        preprocessedSC.setLineWrap(true);
        preprocessedSC.setWrapStyleWord(true);

        tokenizedSC.setEditable(false);
        tokenizedSC.setColumns(20);
        tokenizedSC.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        tokenizedSC.setRows(5);
        jScrollPane2.setViewportView(tokenizedSC);
        tokenizedSC.setLineWrap(true);
        tokenizedSC.setWrapStyleWord(true);

        tokenizingLabel.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        tokenizingLabel.setText("Tokenizing Source Code Using ANTLR");

        percentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"  Dengan AST", null, null, null, null},
                {"  Tanpa AST", null, null, null, null}
            },
            new String [] {
                "Metode", "Modifikasi 1", "Modifikasi 2", "Modifikasi 3", "Modifikasi 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        percentTable.setRowHeight(1, 30);
        percentTable.setRowHeight(30);
        percentTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(percentTable);
        if (percentTable.getColumnModel().getColumnCount() > 0) {
            percentTable.getColumnModel().getColumn(0).setResizable(false);
            percentTable.getColumnModel().getColumn(1).setResizable(false);
            percentTable.getColumnModel().getColumn(2).setResizable(false);
            percentTable.getColumnModel().getColumn(3).setResizable(false);
            percentTable.getColumnModel().getColumn(4).setResizable(false);
        }

        tokenizingLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        tokenizingLabel1.setText("Percentage of Similarity ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(runDetection, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(duplicateFileFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mainDocFile, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tokenizingLabel)
                                .addComponent(jScrollPane2)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE))
                            .addComponent(tokenizingLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(preprocessingLabel)
                            .addComponent(AppTitle)
                            .addComponent(processingLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(duplicateSourceCodeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addComponent(folderPath, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DocSCmain)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mainDocument, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(AppTitle)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mainDocument, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(folderPath, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(DocSCmain)
                                .addGap(25, 25, 25)
                                .addComponent(duplicateSourceCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addComponent(processingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(preprocessingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tokenizingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mainDocFile)
                                .addGap(18, 18, 18)
                                .addComponent(duplicateFileFolder)
                                .addGap(59, 59, 59)
                                .addComponent(runDetection, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53)
                        .addComponent(tokenizingLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void duplicateFileFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duplicateFileFolderActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser(); 
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Duplicate Source Code Folder");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
          
          File folder = new File(chooser.getSelectedFile().toString());
          File[] listOfFiles = folder.listFiles();
          
          if(listOfFiles.length == 4)
          {
            folderPath.setText(chooser.getSelectedFile().toString());
            pathDC = chooser.getSelectedFile().toString();
          }
          else{
              JOptionPane.showMessageDialog(null, "The Total File Does Not Match The Format!");
          }
        }
        else 
            System.out.println("No Selection!");
        
    }//GEN-LAST:event_duplicateFileFolderActionPerformed

    private void mainDocFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainDocFileActionPerformed
        // TODO add your handling code here:
        
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) 
        {
            File selectedFile = fileChooser.getSelectedFile();
            String mainExt = FilenameUtils.getExtension(selectedFile.getName());

            if(mainExt.equals("java"))
            {
                mainDocument.setText(fileChooser.getSelectedFile().toString());
                
                // Insert Line by Line Code Into Array
                try
                {
                    FileReader fr = new FileReader(selectedFile);
                    BufferedReader br = new BufferedReader(fr);
                    StringBuffer sb = new StringBuffer();

                    String content = "";

                    while((content = br.readLine()) != null)
                    {
                        sb.append(content);
                        sb.append("\n");
                    }
                    fr.close();


                    // Insert Main Doc Into Array Global
                    rawSC[0] = sb.toString();
                }
                catch(Exception e)
                {
                    e.printStackTrace();  
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Wrong Extension");
            }
        }
    }//GEN-LAST:event_mainDocFileActionPerformed

    private void runDetectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runDetectionActionPerformed
        // TODO add your handling code here:
        File folder = new File(pathDC);
        File[] listOfFiles = folder.listFiles();
        
        String PreProcessingAllText = "";
        String TokenizingAllText = "";
        int i = 1;
        int k = 0;
        
        // Reading File
        try
        {            
            for (File file : listOfFiles) 
            {
                if (file.isFile()) 
                {
                    try
                    {
                        FileReader fr = new FileReader(file);
                        BufferedReader br = new BufferedReader(fr);
                        StringBuffer sb = new StringBuffer();
                        String content = "";

                        while((content = br.readLine()) != null)
                        {
                            sb.append(content);
                            sb.append("\n");
                        }
                        fr.close();

                        // Insert Duplicate Doc Into Array Global
                        rawSC[i] = sb.toString();
                        i++;
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();  
                    }
                }
            }
            
            prepText process = new prepText();
            tokenizeCode next = new tokenizeCode();
            ROalgorithm algorithm = new ROalgorithm();
            
            // Copying Element From Input Files
            for (int j = 0; j < rawSC.length; j++) 
                rawSCWOAST[j] = rawSC[j];
            
            // Pre-Processing Source Code
            rawSC[0] = process.ppTextwithAST(rawSC[0]);
            rawSCWOAST[0] = process.ppTextnoAST(rawSCWOAST[0]);
            
            PreProcessingAllText += "\n--------------------------------MAIN DOCUMENT--------------------------------------\n";
            PreProcessingAllText += rawSC[0];
            PreProcessingAllText += "------------------------------------------------------------------------------------\n";
            
            rawSC[0] = next.tokenizerJava(rawSC[0]);
            TokenizingAllText += "\n------------------------MAIN DOCUMENT-------------------------\n";
            TokenizingAllText += rawSC[0];
            TokenizingAllText += "\n--------------------------------------------------------------\n";
            
            
            for (int j = 1; j < rawSC.length; j++) 
            {
                try
                {
                    rawSC[j] = process.ppTextwithAST(rawSC[j]);
                    rawSCWOAST[j] = process.ppTextnoAST(rawSCWOAST[j]);
                    
                    PreProcessingAllText += "\n-------------------------------DUPLICATED-" + j + "-----------------------------------------\n";
                    PreProcessingAllText += rawSC[j];
                    PreProcessingAllText += "------------------------------------------------------------------------------------\n";
                    
                    rawSC[j] = next.tokenizerJava(rawSC[j]);
                    TokenizingAllText += "\n------------------------DUPLICATED-" + j + "--------------------------\n";
                    TokenizingAllText += rawSC[j];
                    TokenizingAllText += "\n--------------------------------------------------------------\n";
                    
                    percentage[k] = Double.valueOf(df.format(algorithm.similarity(rawSC[0], rawSC[j])));
                    percentageWOAST[k] = Double.valueOf(df.format(algorithm.similarity(rawSCWOAST[0], rawSCWOAST[j])));
                    k++;
                    
                } 
                catch (Exception e)
                {
                    System.out.println("Error!");
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        preprocessedSC.setText(PreProcessingAllText);
        tokenizedSC.setText(TokenizingAllText);
        
        // Insert Value of Similarity 
        for (int j = 0; j < 4; j++) 
        { 
            percentTable.setValueAt(percentage[j], 0, (j + 1));
            percentTable.setValueAt(percentageWOAST[j], 1, (j + 1));
        }
       
        
    }//GEN-LAST:event_runDetectionActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SimilarityGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimilarityGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimilarityGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimilarityGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimilarityGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppTitle;
    private javax.swing.JLabel DocSCmain;
    private javax.swing.JButton duplicateFileFolder;
    private javax.swing.JLabel duplicateSourceCodeLabel;
    private javax.swing.JLabel folderPath;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton mainDocFile;
    private javax.swing.JLabel mainDocument;
    private javax.swing.JTable percentTable;
    private javax.swing.JTextArea preprocessedSC;
    private javax.swing.JLabel preprocessingLabel;
    private javax.swing.JLabel processingLabel;
    private javax.swing.JButton runDetection;
    private javax.swing.JTextArea tokenizedSC;
    private javax.swing.JLabel tokenizingLabel;
    private javax.swing.JLabel tokenizingLabel1;
    // End of variables declaration//GEN-END:variables
}
