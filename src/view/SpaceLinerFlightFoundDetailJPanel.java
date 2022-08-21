
package view;

import controller.Customer;
import controller.CustomerDirectory;
import controller.SpaceFlight;
import view.CustomerSpaceLinerInformationJPanel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class SpaceLinerFlightFoundDetailJPanel extends javax.swing.JPanel {

    private JPanel cardSequenceJPanel;
    private SpaceFlight selectedFlight;

    SpaceLinerFlightFoundDetailJPanel(JPanel cardSequenceJPanel, SpaceFlight selectedFlight) {
       
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.selectedFlight = selectedFlight;
        flightNumbTF.setText(selectedFlight.getSpaceFlightNumber());
        priceTF.setText(Double.toString(selectedFlight.getPrice()));
        seatSelectComboBoxBuild();
    }
    
    public void seatSelectComboBoxBuild(){
        DefaultComboBoxModel cBmodel = new DefaultComboBoxModel();
        cBmodel.addElement("Select Seat");
        for(int i=0;i<selectedFlight.getSeats().getSeat().size();i++){
            cBmodel.addElement(selectedFlight.getSeats().getSeat().get(i));
        }
        seatComboBox.setModel(cBmodel);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        firstNameTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lastNameTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ageTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        phoneTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ssnTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        priceTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        flightNumbTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        seatComboBox = new javax.swing.JComboBox<>();
        bookBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        backBtn.setText("Cancel");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("FirstName");

        jLabel2.setText("LastName");

        jLabel3.setText("Age");

        jLabel4.setText("Phone");

        jLabel5.setText("SSN");

        ssnTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssnTFActionPerformed(evt);
            }
        });

        jLabel6.setText("Price");

        priceTF.setEnabled(false);

        jLabel7.setText("SpaceFlightNumber");

        flightNumbTF.setEnabled(false);

        jLabel8.setText("Seat Choice");

        seatComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Seat" }));
        seatComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatComboBoxActionPerformed(evt);
            }
        });

        bookBtn.setText("Confirm Booking");
        bookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("SpaceLiner Booking Page");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(flightNumbTF, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bookBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel1))
                                            .addComponent(jLabel3))
                                        .addGap(120, 120, 120))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(140, 140, 140)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(148, 148, 148)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(153, 153, 153)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ssnTF, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(136, 136, 136)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(firstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ssnTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(flightNumbTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(seatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookBtn)
                    .addComponent(backBtn))
                .addContainerGap(177, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBtnActionPerformed
        // TODO add your handling code here:
        if(firstNameTF.getText().equals(""))
        {
            firstNameTF.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel1.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter First Name");
            return;
        }
        else{
            firstNameTF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel1.setForeground(Color.BLACK);
        }
        
        if(lastNameTF.getText().equals(""))
        {
            lastNameTF.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel2.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter Last Name");
            return;
        }
        else{
            lastNameTF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel2.setForeground(Color.BLACK);
        }
        
        if(ageTF.getText().equals(""))
        {
            ageTF.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel3.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter your age");
            return;
        }
        try{
            ageTF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel3.setForeground(Color.BLACK);
            Integer.parseInt(ageTF.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter number for age");
            return;
        }
        if(phoneTF.getText().equals(""))
        {
            phoneTF.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel4.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter your phone number");
            return;
        }
        else{
            phoneTF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel4.setForeground(Color.BLACK);
        }
        
        if(ssnTF.getText().equals(""))
        {
            ssnTF.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel5.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter your SSN");
            return;
        }
        else{
            ssnTF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel5.setForeground(Color.BLACK);
        }
        
        try{
            ssnTF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel5.setForeground(Color.BLACK);
            Integer.parseInt(ssnTF.getText());
        }
        catch(Exception e){
            ssnTF.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel5.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter number for SSN");
            return;
        }
        if(seatComboBox.getSelectedItem().equals("Select Seat")){
            JOptionPane.showMessageDialog(null, "Please select a seat");
            return;
        }
        Customer newCustomer = new Customer();
        newCustomer.setFirstName(firstNameTF.getText());
        newCustomer.setLastName(lastNameTF.getText());
        newCustomer.setAge((int)Double.parseDouble(ageTF.getText()));
        newCustomer.setPhNum(phoneTF.getText());
        newCustomer.setSsn(ssnTF.getText());
        newCustomer.setSpaceFlightBooked(selectedFlight);
        newCustomer.setSeatBooked(seatComboBox.getSelectedItem().toString());
        CustomerDirectory.customerList.add(newCustomer);
        
       
        selectedFlight.getSeats().getSeat().remove(seatComboBox.getSelectedItem());
        
        JOptionPane.showMessageDialog(null, "Flight Ticket Booked");
        cardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        Component[] components = cardSequenceJPanel.getComponents();
        for(Component component: components){
            if(component instanceof SpaceLinerFlightFoundJPanel){
                SpaceLinerFlightFoundJPanel mpp = (SpaceLinerFlightFoundJPanel) component;
                mpp.populateTable();
            }
        }
        layout.previous(cardSequenceJPanel);
    }//GEN-LAST:event_bookBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        cardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        Component[] components = cardSequenceJPanel.getComponents();
        for(Component component: components){
            if(component instanceof SpaceLinerFlightFoundJPanel){
                SpaceLinerFlightFoundJPanel mpp = (SpaceLinerFlightFoundJPanel) component;
                mpp.populateTable();
            }
        }
        layout.previous(cardSequenceJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void seatComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatComboBoxActionPerformed

    private void ssnTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssnTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ssnTFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTF;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bookBtn;
    private javax.swing.JTextField firstNameTF;
    private javax.swing.JTextField flightNumbTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastNameTF;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JTextField priceTF;
    private javax.swing.JComboBox<String> seatComboBox;
    private javax.swing.JTextField ssnTF;
    // End of variables declaration//GEN-END:variables
}
