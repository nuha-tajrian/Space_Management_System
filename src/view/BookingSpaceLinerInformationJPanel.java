
package view;

import controller.SpaceFlight;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JPanel;


public class BookingSpaceLinerInformationJPanel extends javax.swing.JPanel {

    private JPanel cardSequenceJPanel;
    private SpaceFlight bookedFlight;
    private String seatBooked;
    BookingSpaceLinerInformationJPanel(JPanel cardSequenceJPanel, SpaceFlight bookedFlight, String seatBooked) {
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.bookedFlight = bookedFlight;
        this.seatBooked = seatBooked;
        populateInputFields();  
    }
    
    private void populateInputFields(){
        airlinerTF.setText(bookedFlight.getOwner());
        flightNumTF.setText(bookedFlight.getSpaceFlightNumber());
        destinationTF.setText(bookedFlight.getDestination());
        sourceTF.setText(bookedFlight.getSource());
        arrivalTimeTF.setText(bookedFlight.getArrTime());
        departureTimeTF.setText(bookedFlight.getDepTime());
        durationTF.setText(Integer.toString(bookedFlight.getDuration()));
        operatedTimeTF.setText(bookedFlight.getOtod());
        String strDate = "";
        try {
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            strDate = dateFormat.format(bookedFlight.getDate());
        } catch (Exception e) {
            e.printStackTrace();
        }
        dateTF.setText(strDate);
        seatTF.setText(seatBooked);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        airlinerTF = new javax.swing.JTextField();
        flightNumTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        sourceTF = new javax.swing.JTextField();
        destinationTF = new javax.swing.JTextField();
        departureTimeTF = new javax.swing.JTextField();
        arrivalTimeTF = new javax.swing.JTextField();
        durationTF = new javax.swing.JTextField();
        dateTF = new javax.swing.JTextField();
        operatedTimeTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        seatTF = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Booking SpaceLiner Information");

        jLabel2.setText("Space Liner");

        airlinerTF.setEnabled(false);
        airlinerTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlinerTFActionPerformed(evt);
            }
        });

        flightNumTF.setEnabled(false);
        flightNumTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightNumTFActionPerformed(evt);
            }
        });

        jLabel3.setText("Space Flight Number");

        jLabel4.setText("Source");

        jLabel5.setText("Destination");

        jLabel6.setText("Departure Time");

        jLabel7.setText("Arrival Time");

        jLabel8.setText("Duration");

        jLabel9.setText("Date");

        jLabel11.setText("Operated Time of Day");

        sourceTF.setEnabled(false);
        sourceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceTFActionPerformed(evt);
            }
        });

        destinationTF.setEnabled(false);

        departureTimeTF.setEnabled(false);

        arrivalTimeTF.setEnabled(false);

        durationTF.setEnabled(false);
        durationTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationTFActionPerformed(evt);
            }
        });

        dateTF.setEnabled(false);

        operatedTimeTF.setEnabled(false);
        operatedTimeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operatedTimeTFActionPerformed(evt);
            }
        });

        jLabel10.setText("Seat");

        seatTF.setEnabled(false);

        backBtn.setText("back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(backBtn)
                .addGap(181, 181, 181)
                .addComponent(jLabel1)
                .addContainerGap(229, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(seatTF, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(204, 204, 204)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(jLabel11))
                    .addGap(204, 204, 204)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(operatedTimeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(airlinerTF, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(flightNumTF)
                            .addComponent(sourceTF)
                            .addComponent(destinationTF)
                            .addComponent(departureTimeTF)
                            .addComponent(arrivalTimeTF)
                            .addComponent(durationTF)
                            .addComponent(dateTF)))
                    .addContainerGap(204, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 419, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(seatTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(115, 115, 115)
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
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addComponent(operatedTimeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(115, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void airlinerTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlinerTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airlinerTFActionPerformed

    private void flightNumTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightNumTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightNumTFActionPerformed

    private void sourceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sourceTFActionPerformed

    private void durationTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_durationTFActionPerformed

    private void operatedTimeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operatedTimeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_operatedTimeTFActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        cardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();

        Component[] components = cardSequenceJPanel.getComponents();
        for(Component component: components){
            if(component instanceof CustomerSpaceLinerInformationJPanel){
                CustomerSpaceLinerInformationJPanel mpp = (CustomerSpaceLinerInformationJPanel) component;
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField operatedTimeTF;
    private javax.swing.JTextField seatTF;
    private javax.swing.JTextField sourceTF;
    // End of variables declaration//GEN-END:variables
}
