
package view;

import controller.SpaceFlight;
import model.SpaceFlightDirectory;
import model.Seats;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class CreateSpaceLinerFlightScheduleJPanel extends javax.swing.JPanel {

    private JPanel cardSequenceJPanel;
    private SpaceFlightDirectory flightDir;
    public CreateSpaceLinerFlightScheduleJPanel(JPanel cardSequenceJPanel,SpaceFlightDirectory flightDir, String airlinerName) {
        initComponents();
        airlinerTF.setText(airlinerName);
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.flightDir = flightDir;
        otodComboBox.setSelectedItem("Select Option");
    }

    public void emptyInputFields(){
        airlinerTF.setText("");
        flightNumTF.setText("");
        sourceTF.setText("");
        destinationTF.setText("");
        departureTimeTF.setText("");
        arrivalTimeTF.setText("");
        durationTF.setText("");
        dateTF.setText("");
        otodComboBox.setSelectedItem("Select Option");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        airlinerTF = new javax.swing.JTextField();
        flightNumTF = new javax.swing.JTextField();
        sourceTF = new javax.swing.JTextField();
        destinationTF = new javax.swing.JTextField();
        departureTimeTF = new javax.swing.JTextField();
        arrivalTimeTF = new javax.swing.JTextField();
        durationTF = new javax.swing.JTextField();
        dateTF = new javax.swing.JTextField();
        CreateBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        otodComboBox = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Create SpaceLiner Flight Schedule");

        jLabel2.setText("Space Liner");

        jLabel3.setText("Space Flight Number");

        jLabel4.setText("Source");

        jLabel5.setText("Destination");

        jLabel6.setText("Departure Time");

        jLabel7.setText("Arrival Time");

        jLabel8.setText("Duration");

        jLabel9.setText("Date (dd-mm-yyyy)");

        airlinerTF.setEnabled(false);
        airlinerTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlinerTFActionPerformed(evt);
            }
        });

        flightNumTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightNumTFActionPerformed(evt);
            }
        });

        sourceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceTFActionPerformed(evt);
            }
        });

        durationTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationTFActionPerformed(evt);
            }
        });

        CreateBtn.setText("Create");
        CreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateBtnActionPerformed(evt);
            }
        });

        jLabel11.setText("Operated Time of Day");

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        otodComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Option", "Morning", "Afternoon", "Evening", "Night" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addGap(204, 204, 204))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(backBtn)
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(CreateBtn)))
                        .addGap(67, 67, 67)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(otodComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(airlinerTF, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(flightNumTF)
                            .addComponent(sourceTF)
                            .addComponent(destinationTF)
                            .addComponent(departureTimeTF)
                            .addComponent(arrivalTimeTF)
                            .addComponent(durationTF)
                            .addComponent(dateTF))
                        .addContainerGap(434, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn)
                        .addGap(18, 18, 18)))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(otodComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(CreateBtn)
                .addContainerGap(88, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateBtnActionPerformed
        // TODO add your handling code here:
        if("".equals(airlinerTF.getText())){
            JOptionPane.showMessageDialog(null, "Please enter airliner");
            return;
        }
        if("".equals(flightNumTF.getText())){
            flightNumTF.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel3.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter FlightNumber");
            return;
        }
        else{
            flightNumTF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel3.setForeground(Color.BLACK);
        }
        
        if("".equals(sourceTF.getText())){
            JOptionPane.showMessageDialog(null, "Please enter Source");
            return;
        }
         if("".equals(destinationTF.getText())){
            JOptionPane.showMessageDialog(null, "Please enter Destination");
            return;
        }
        
        if("".equals(arrivalTimeTF.getText())){
            JOptionPane.showMessageDialog(null, "Please enter arrival Time in HH:MM");
            return;
        }else{
            Pattern p = Pattern.compile("^(0[0-9]|1[0-9]|2[0-3]|[0-9]):[0-5][0-9]$");
            Matcher m = p.matcher(arrivalTimeTF.getText());
            boolean b = m.matches();
            if(!b){
                JOptionPane.showMessageDialog(null, "Please enter arrival Time in HH:MM");
                return;
            }
        }
        if("".equals(departureTimeTF.getText())){
            JOptionPane.showMessageDialog(null, "Please enter Departure Time in HH:MM");
            return;
        }
        else{
            Pattern p = Pattern.compile("^(0[0-9]|1[0-9]|2[0-3]|[0-9]):[0-5][0-9]$");
            Matcher m = p.matcher(arrivalTimeTF.getText());
            boolean b = m.matches();
            if(!b){
                JOptionPane.showMessageDialog(null, "Please enter departure Time in HH:MM");
                return;
            }
        }
        
        if("".equals(flightNumTF.getText())){
            JOptionPane.showMessageDialog(null, "Please enter Flight Number");
            return;
        }
        if("".equals(dateTF.getText())){
            JOptionPane.showMessageDialog(null, "Please enter Date");

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
        if("".equals(otodComboBox.getSelectedItem().equals("Select Option"))){
            JOptionPane.showMessageDialog(null, "Please enter Code");
            return;
        }
        
        if(otodComboBox.getSelectedItem().equals("Select Option")){
            JOptionPane.showMessageDialog(null, "Please select an option below");
            return;
        }
        
        SpaceFlight newFlight = new SpaceFlight();
        newFlight.setOwner(airlinerTF.getText());
        newFlight.setSpaceFlightNumber(flightNumTF.getText());
        newFlight.setSource(sourceTF.getText());
        newFlight.setDestination(destinationTF.getText());
        newFlight.setDepTime(departureTimeTF.getText());
        newFlight.setArrTime(arrivalTimeTF.getText());
        newFlight.setDuration((int)Double.parseDouble(durationTF.getText())); 
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String dateInString = dateTF.getText();

        try {

            Date date = formatter.parse(dateInString);
            //System.out.println(formatter.format(date));
            newFlight.setDate(date);

        } catch (ParseException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Please enter date in dd-MM-yyyy format");
            return;
        }

        
        Seats seats = new Seats();
        newFlight.setSeats(seats);
        newFlight.setOtod(otodComboBox.getSelectedItem().toString());
        flightDir.addSpaceFlight(newFlight);
        JOptionPane.showMessageDialog(null, "Flight Created Successfully");
        emptyInputFields();
    }//GEN-LAST:event_CreateBtnActionPerformed

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
    private javax.swing.JButton CreateBtn;
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
    private javax.swing.JTextField sourceTF;
    // End of variables declaration//GEN-END:variables
}
