package xyz.leet.translator;

import xyz.leet.translator.enums.EncryptionType;

/**
 * GUI for Leet Translator
 * @since 0.1
 */
// TODO: Clean up code.
public class LeetGUI extends javax.swing.JFrame {

    public LeetGUI() {
        initComponents();
    }

    /*
    Sorry about the messy GUI code, it's been generated by Netbeans. ~redam
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        leetDifficultySelector = new javax.swing.JComboBox<>();
        tButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tInput = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tOutput = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leetDifficultySelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LEET_LEVEL_1", "LEET_LEVEL_2", "LEET_LEVEL_3", "FUCKERY", "CAESAR_SHIFT", "EMOJI" }));

        tButton.setText("Translate");
        tButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tButtonActionPerformed(evt);
            }
        });

        tInput.setColumns(20);
        tInput.setRows(5);
        jScrollPane1.setViewportView(tInput);

        jScrollPane2.setViewportView(tOutput);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(leetDifficultySelector, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tButton, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(leetDifficultySelector))
                .addContainerGap())
        );

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

    LeetTranslatorImpl lTranslator = new LeetTranslatorImpl();
    private void tButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tButtonActionPerformed
        String leetLvl = (String) leetDifficultySelector.getSelectedItem();
        String tTranslatedInput = lTranslator.convert(tInput.getText(), EncryptionType.valueOf(leetLvl));
        tOutput.setText(tTranslatedInput);
        System.out.println(tTranslatedInput);
    }//GEN-LAST:event_tButtonActionPerformed
                                      
    public void buildGUI() {
        java.awt.EventQueue.invokeLater(() -> {
            new LeetGUI().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JComboBox<String> leetDifficultySelector;
    private javax.swing.JButton tButton;
    private javax.swing.JTextArea tInput;
    private javax.swing.JTextPane tOutput;
    // End of variables declaration//GEN-END:variables
}