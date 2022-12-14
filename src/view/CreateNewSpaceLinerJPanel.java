
package view;

import controller.SpaceLiner;
import controller.SpaceLinerDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class CreateNewSpaceLinerJPanel extends javax.swing.JPanel {

    private JPanel cardSequenceJPanel;
    private SpaceLinerDirectory spacelinerDir;
    CreateNewSpaceLinerJPanel(JPanel cardSequenceJPanel, SpaceLinerDirectory spacelinerDir) {
         initComponents();
         this.spacelinerDir = spacelinerDir;
         this.cardSequenceJPanel = cardSequenceJPanel;
    }
    
    public void emptyInputFields(){
        nameTxtField.setText("");
        codeTxtField.setText("");
        countriesOperatedTxtField.setText("");
        originCountryTxtField.setText("");
        noOfFlightsTxtField.setText("");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        codeTxtField = new javax.swing.JTextField();
        countriesOperatedTxtField = new javax.swing.JTextField();
        originCountryTxtField = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        noOfFlightsTxtField = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setText("Name");

        jLabel2.setText("Code");

        jLabel3.setText("Planets Operated");

        jLabel4.setText("Origin Space");

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Fleet");

        backBtn.setText("back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Create SpaceLiner");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(createBtn)
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(noOfFlightsTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))))
                .addGap(198, 198, 198))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(backBtn)
                .addGap(287, 287, 287)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn)
                    .addComponent(jLabel6))
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
                .addGap(13, 13, 13)
                .addComponent(createBtn)
                .addContainerGap(87, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
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
            JOptionPane.showMessageDialog(null, "Please enter number for Planets operated");
            return;
        }
        if("".equals(originCountryTxtField.getText())){
            originCountryTxtField.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel4.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter Origin Space");
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
        
        SpaceLiner newAirliner = new SpaceLiner();
        newAirliner.setName(nameTxtField.getText());
        newAirliner.setSpaceLineCode(codeTxtField.getText());
        newAirliner.setPlanetsOperated((int)Double.parseDouble(countriesOperatedTxtField.getText()));
        newAirliner.setNumOfSpaceFlights((int)Double.parseDouble(noOfFlightsTxtField.getText()));
        newAirliner.setOriginSpace(originCountryTxtField.getText());
        spacelinerDir.addSpaceLiner(newAirliner);
        JOptionPane.showMessageDialog(null, "Spaceliner Created Successfully");
        emptyInputFields();
    }//GEN-LAST:event_createBtnActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField codeTxtField;
    private javax.swing.JTextField countriesOperatedTxtField;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JTextField noOfFlightsTxtField;
    private javax.swing.JTextField originCountryTxtField;
    // End of variables declaration//GEN-END:variables
}
