
package view;

import view.ManageSpaceLinersJPanel;
import controller.SpaceLiner;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class ViewSpaceLinerJPanel extends javax.swing.JPanel {

    private JPanel cardSequenceJPanel;
    private SpaceLiner airliner;
    public ViewSpaceLinerJPanel(JPanel cardSequenceJPanel, SpaceLiner airliner) {
        initComponents();
        this.airliner = airliner;
        this.cardSequenceJPanel = cardSequenceJPanel;
        saveBtn.setEnabled(false);
        populateInputs();
    }
    
    private void populateInputs(){
        nameTxtField.setText(airliner.getName());
        originCountryTxtField.setText(airliner.getOriginSpace());
        codeTxtField.setText(airliner.getSpaceLineCode());
        countriesOperatedTxtField.setText(Integer.toString(airliner.getPlanetsOperated()));
        noOfFlightsTxtField.setText(Integer.toString(airliner.getNumOfSpaceFlights()));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        codeTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        countriesOperatedTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        originCountryTxtField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        noOfFlightsTxtField = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        backBtn.setText("back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Name");

        nameTxtField.setEnabled(false);

        jLabel2.setText("Code");

        codeTxtField.setEnabled(false);

        jLabel3.setText("Planets Operated");

        countriesOperatedTxtField.setEnabled(false);

        jLabel4.setText("Origin Space");

        originCountryTxtField.setEnabled(false);

        jLabel5.setText("Fleet");

        noOfFlightsTxtField.setEnabled(false);

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("View/Update SpaceLiner");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(534, Short.MAX_VALUE)
                .addComponent(updateBtn)
                .addGap(80, 80, 80)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
            .addGroup(layout.createSequentialGroup()
                .addGap(422, 422, 422)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(122, 122, 122)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(131, 131, 131)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(104, 104, 104)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nameTxtField)
                                .addComponent(codeTxtField)
                                .addComponent(countriesOperatedTxtField)
                                .addComponent(originCountryTxtField)
                                .addComponent(noOfFlightsTxtField)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(backBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 590, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(123, 123, 123)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 464, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn)
                    .addComponent(saveBtn))
                .addGap(32, 32, 32))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(94, 94, 94)
                    .addComponent(backBtn)
                    .addGap(57, 57, 57)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(51, 51, 51)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(codeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(50, 50, 50)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(countriesOperatedTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(55, 55, 55)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(originCountryTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(40, 40, 40)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(noOfFlightsTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(94, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        cardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();

        Component[] components = cardSequenceJPanel.getComponents();
        for(Component component: components){
            if(component instanceof ManageSpaceLinersJPanel){
                ManageSpaceLinersJPanel mpp = (ManageSpaceLinersJPanel) component;
                mpp.populateTable();
            }
        }

        layout.previous(cardSequenceJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        nameTxtField.setEnabled(true);
        originCountryTxtField.setEnabled(true);
        codeTxtField.setEnabled(true);
        countriesOperatedTxtField.setEnabled(true);
        noOfFlightsTxtField.setEnabled(true);
        updateBtn.setEnabled(false);
        saveBtn.setEnabled(true);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        if("".equals(nameTxtField.getText())){
            nameTxtField.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel1.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter Name");
            return;
        }
        else{
            nameTxtField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel1.setForeground(Color.BLACK);
        }
        if("".equals(codeTxtField.getText())){
            codeTxtField.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel2.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter Code");
            return;
        }
        else{
            codeTxtField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel2.setForeground(Color.BLACK);
        }
        
        try{
            Double.parseDouble(countriesOperatedTxtField.getText());
            countriesOperatedTxtField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel3.setForeground(Color.BLACK);
        }
        catch(Exception e){
            countriesOperatedTxtField.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel3.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter number for Countries operated");
            return;
        }
        if("".equals(originCountryTxtField.getText())){
            originCountryTxtField.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel4.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter Origin Country");
            return;
        }
        else{
            originCountryTxtField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel4.setForeground(Color.BLACK);
        }
        try{
            Integer.parseInt(noOfFlightsTxtField.getText());
            noOfFlightsTxtField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel5.setForeground(Color.BLACK);
        }
        catch(Exception e){
            noOfFlightsTxtField.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel4.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter number for Fleet");
            return;
        }
        
        airliner.setName(nameTxtField.getText());
        airliner.setSpaceLineCode(codeTxtField.getText());
        airliner.setPlanetsOperated((int)Double.parseDouble(countriesOperatedTxtField.getText()));
        airliner.setNumOfSpaceFlights((int)Double.parseDouble(noOfFlightsTxtField.getText()));
        airliner.setOriginSpace(originCountryTxtField.getText());
        JOptionPane.showMessageDialog(null, "SpaceLiner Updated Successfully");
        nameTxtField.setEnabled(false);
        originCountryTxtField.setEnabled(false);
        codeTxtField.setEnabled(false);
        countriesOperatedTxtField.setEnabled(false);
        noOfFlightsTxtField.setEnabled(false);
        saveBtn.setEnabled(false);
        updateBtn.setEnabled(true);
    }//GEN-LAST:event_saveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField codeTxtField;
    private javax.swing.JTextField countriesOperatedTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JTextField noOfFlightsTxtField;
    private javax.swing.JTextField originCountryTxtField;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
