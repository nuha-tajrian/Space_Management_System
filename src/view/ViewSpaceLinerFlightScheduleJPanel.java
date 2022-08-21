
package view;

import view.ManageSpaceLinerFlightScheduleJPanel;
import controller.SpaceFlight;
import model.SpaceFlightDirectory;
import model.Seats;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class ViewSpaceLinerFlightScheduleJPanel extends javax.swing.JPanel {

    private JPanel cardSequenceJPanel;
    private SpaceFlight flight;
    private SpaceFlightDirectory flightDir;
    public ViewSpaceLinerFlightScheduleJPanel(JPanel cardSequenceJPanel, SpaceFlight flight,SpaceFlightDirectory flightDir) {
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.flight = flight;
        this.flightDir= flightDir;
        autoFillInputs();
    }
    
    private void autoFillInputs(){
        airlinerTF.setText(flight.getOwner());
        flightNumTF.setText(flight.getSpaceFlightNumber());
        sourceTF.setText(flight.getSource());
        destinationTF.setText(flight.getDestination());
        departureTimeTF.setText(flight.getDepTime());
        arrivalTimeTF.setText(flight.getArrTime());
        durationTF.setText(Integer.toString(flight.getDuration()));
        dateTF.setText(flight.getDate().toString());
       otodComboBox.setSelectedItem(flight.getOtod().toString());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        departureTimeTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        arrivalTimeTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        durationTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dateTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        airlinerTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        flightNumTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        sourceTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        destinationTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        otodComboBox = new javax.swing.JComboBox<>();

        departureTimeTF.setEnabled(false);

        jLabel4.setText("Source");

        arrivalTimeTF.setEnabled(false);

        jLabel5.setText("Destination");

        durationTF.setEnabled(false);
        durationTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationTFActionPerformed(evt);
            }
        });

        jLabel6.setText("Departure Time");

        dateTF.setEnabled(false);

        jLabel7.setText("Arrival Time");

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        jLabel8.setText("Duration");

        jLabel9.setText("Date (dd-mm-yyyy)");

        airlinerTF.setEnabled(false);
        airlinerTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlinerTFActionPerformed(evt);
            }
        });

        jLabel11.setText("Operated Time of Day");

        flightNumTF.setEnabled(false);
        flightNumTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightNumTFActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("                          View Flight Schedule");

        sourceTF.setEnabled(false);
        sourceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceTFActionPerformed(evt);
            }
        });

        jLabel2.setText("Space Liner");

        destinationTF.setEnabled(false);

        jLabel3.setText("Space Flight Number");

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        otodComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Time", "Morning", "Afternoon", "Evening", "Night", " " }));
        otodComboBox.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(updateBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(backBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(airlinerTF)
                    .addComponent(flightNumTF)
                    .addComponent(sourceTF)
                    .addComponent(destinationTF)
                    .addComponent(departureTimeTF)
                    .addComponent(arrivalTimeTF)
                    .addComponent(durationTF)
                    .addComponent(dateTF)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(saveBtn))
                    .addComponent(otodComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(backBtn)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(airlinerTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(flightNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(sourceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(destinationTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(departureTimeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addComponent(arrivalTimeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(durationTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(otodComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn)
                    .addComponent(saveBtn))
                .addGap(72, 72, 72))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void durationTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_durationTFActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        if("".equals(airlinerTF.getText())){
            JOptionPane.showMessageDialog(null, "Please enter Name");
            return;
        }
        if("".equals(arrivalTimeTF.getText())){
            JOptionPane.showMessageDialog(null, "Please enter arrival Time");
            return;
        }
        if("".equals(departureTimeTF.getText())){
            JOptionPane.showMessageDialog(null, "Please enter Departure Time");
            return;
        }
        if(otodComboBox.getSelectedItem().equals("Select Time")){
            JOptionPane.showMessageDialog(null, "Please select a Time");
            return;
        }
        if("".equals(flightNumTF.getText())){
            JOptionPane.showMessageDialog(null, "Please enter Flight Number");
            return;
        }
        if("".equals(dateTF.getText())){
            JOptionPane.showMessageDialog(null, "Please enter Date");

            return;
        }
        if("".equals(durationTF.getText())){
            JOptionPane.showMessageDialog(null, "Please enter Duration");
            return;
        }
        if("".equals(sourceTF.getText())){
            JOptionPane.showMessageDialog(null, "Please enter Source");
            return;
        }
        if("".equals(destinationTF.getText())){
            JOptionPane.showMessageDialog(null, "Please enter Destination");
            return;
        }
        

  try{
           Integer.parseInt(durationTF.getText());        }
  catch(Exception e){
           JOptionPane.showMessageDialog(null, "Please enter valid duartion");
         return;    }
        
  
        flight.setOwner(airlinerTF.getText());
        flight.setSpaceFlightNumber(flightNumTF.getText());
        flight.setSource(sourceTF.getText());
        flight.setDestination(destinationTF.getText());
        flight.setDepTime(departureTimeTF.getText());
        flight.setArrTime(arrivalTimeTF.getText());
        flight.setDuration((int)Double.parseDouble(durationTF.getText()));
        Date newDate = new Date();
        flight.setDate(newDate);//edit
        Seats seats = new Seats();
        flight.setSeats(seats);
       flight.setOtod(otodComboBox.getSelectedItem().toString());
        JOptionPane.showMessageDialog(null, "Flight Upadated Successfully");
        disabled();
        saveBtn.setEnabled(false);
    }//GEN-LAST:event_saveBtnActionPerformed

    private void airlinerTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlinerTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airlinerTFActionPerformed

    private void flightNumTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightNumTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightNumTFActionPerformed

    private void sourceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sourceTFActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
            airlinerTF.setEnabled(true);
            arrivalTimeTF.setEnabled(true);
            dateTF.setEnabled(true);
            durationTF.setEnabled(true);
            flightNumTF.setEnabled(true);
            destinationTF.setEnabled(true);
            otodComboBox.setEnabled(true);
            sourceTF.setEnabled(true);
            departureTimeTF.setEnabled(true);
             updateBtn.setEnabled(false);
    }//GEN-LAST:event_updateBtnActionPerformed
public void disabled(){
            airlinerTF.setEnabled(false);
            arrivalTimeTF.setEnabled(false);
            dateTF.setEnabled(false);
            durationTF.setEnabled(false);
            flightNumTF.setEnabled(false);
            destinationTF.setEnabled(false);
            otodComboBox.setEnabled(false);
            sourceTF.setEnabled(false);
            departureTimeTF.setEnabled(false);
            updateBtn.setEnabled(true);}
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        cardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();

        Component[] components = cardSequenceJPanel.getComponents();
        for(Component component: components){
            if(component instanceof ManageSpaceLinerFlightScheduleJPanel){
                ManageSpaceLinerFlightScheduleJPanel mpp = (ManageSpaceLinerFlightScheduleJPanel) component;
                mpp.populateTable();
            }
        }

        layout.previous(cardSequenceJPanel);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airlinerTF;
    private javax.swing.JTextField arrivalTimeTF;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField dateTF;
    private javax.swing.JTextField departureTimeTF;
    private javax.swing.JTextField destinationTF;
    private javax.swing.JTextField durationTF;
    private javax.swing.JTextField flightNumTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> otodComboBox;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField sourceTF;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
