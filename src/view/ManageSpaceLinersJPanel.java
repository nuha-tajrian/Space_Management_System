
package view;

import view.CreateNewSpaceLinerJPanel;
import controller.SpaceLiner;
import controller.SpaceLinerDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ManageSpaceLinersJPanel extends javax.swing.JPanel {

    private JPanel cardSequenceJPanel;
    private SpaceLinerDirectory airlinerDir;
    public ManageSpaceLinersJPanel(JPanel cardSequenceJPanel, SpaceLinerDirectory airlinerDir) {
        initComponents();
        this.airlinerDir = airlinerDir;
        this.cardSequenceJPanel = cardSequenceJPanel;
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)SpaceLinerTable.getModel();
        dtm.setRowCount(0);
        
        for(SpaceLiner a : airlinerDir.getSpaceLinerDir()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]= a;
            row[1]= a.getSpaceLineCode();
            row[2]= a.getPlanetsOperated();
            row[3] = a.getOriginSpace();
            row[4] = a.getNumOfSpaceFlights();
            dtm.addRow(row);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SpaceLinerTable = new javax.swing.JTable();
        viewAirlinerBtn = new javax.swing.JButton();
        createAirlinerBtn = new javax.swing.JButton();
        deleteAirlinerBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage SpaceLiners");

        SpaceLinerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "SpaceLineCode", "Planets Operated", "Origin Space", "Fleet"
            }
        ));
        jScrollPane1.setViewportView(SpaceLinerTable);

        viewAirlinerBtn.setText("View SpaceLiner");
        viewAirlinerBtn.setPreferredSize(new java.awt.Dimension(135, 40));
        viewAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAirlinerBtnActionPerformed(evt);
            }
        });

        createAirlinerBtn.setText("Create SpaceLiner");
        createAirlinerBtn.setPreferredSize(new java.awt.Dimension(135, 40));
        createAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAirlinerBtnActionPerformed(evt);
            }
        });

        deleteAirlinerBtn.setText("Delete SpaceLiner");
        deleteAirlinerBtn.setPreferredSize(new java.awt.Dimension(135, 40));
        deleteAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAirlinerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteAirlinerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(387, 387, 387)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(98, 98, 98)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(createAirlinerBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewAirlinerBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(createAirlinerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewAirlinerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteAirlinerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAirlinerBtnActionPerformed
        // TODO add your handling code here:
        CreateNewSpaceLinerJPanel panel = new CreateNewSpaceLinerJPanel(cardSequenceJPanel, airlinerDir);
        cardSequenceJPanel.add("CreateNewAirlinerJPanel",panel);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
    }//GEN-LAST:event_createAirlinerBtnActionPerformed

    private void viewAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAirlinerBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = SpaceLinerTable.getSelectedRow();
        if(selectedRow > -1){
            SpaceLiner airliner = airlinerDir.getSpaceLinerDir().get(selectedRow);
            ViewSpaceLinerJPanel panel = new ViewSpaceLinerJPanel(cardSequenceJPanel, airliner);
            cardSequenceJPanel.add("ViewAirlinerJPanel",panel);
            CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
            layout.next(cardSequenceJPanel);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row above");
            return;
        }
    }//GEN-LAST:event_viewAirlinerBtnActionPerformed

    private void deleteAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAirlinerBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = SpaceLinerTable.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                SpaceLiner airliner = (SpaceLiner)SpaceLinerTable.getValueAt(selectedRow, 0);
                airlinerDir.removeSpaceLiner(airliner);
                populateTable();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_deleteAirlinerBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable SpaceLinerTable;
    private javax.swing.JButton createAirlinerBtn;
    private javax.swing.JButton deleteAirlinerBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewAirlinerBtn;
    // End of variables declaration//GEN-END:variables
}
