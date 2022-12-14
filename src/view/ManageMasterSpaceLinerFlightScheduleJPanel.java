
package view;

import view.SpaceLinerFlightFoundJPanel;
import controller.SpaceLinerDirectory;
import controller.SpaceFlight;
import model.SpaceFlightDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ManageMasterSpaceLinerFlightScheduleJPanel extends javax.swing.JPanel {

    private JPanel cardSequenceJPanel;
    private SpaceFlightDirectory flightDir;
    
    public ManageMasterSpaceLinerFlightScheduleJPanel(JPanel cardSequenceJPanel, SpaceFlightDirectory flightDir) {
       
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.flightDir = flightDir;
        populateTable();
        otodComboBox.setSelectedItem("Select Option");
    }
        public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblMasterFlight.getModel();
        dtm.setRowCount(0);
        
        for(SpaceFlight a : flightDir.getSpaceFlightDir()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0] = a.getOwner();
            row[1] = a.getSpaceFlightNumber();
            row[2] = a.getSource();
            row[3] = a.getDestination();
            row[4] = a.getDepTime();
            row[5] = a.getArrTime();
            row[6] = a.getDuration();
            row[7] = a.getDate();
            row[8] = a.getOtod();
            dtm.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMasterFlight = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        destinationTxtField = new javax.swing.JTextField();
        sourceTxtField = new javax.swing.JTextField();
        dateTxtField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        otodComboBox = new javax.swing.JComboBox<>();

        tblMasterFlight.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "SpaceLiner", "Space Flight Number", "Source", "Destination", "Departure Time", "Arrival Time", "Duration", "Date", "Time of Day"
            }
        ));
        jScrollPane1.setViewportView(tblMasterFlight);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("MASTER SPACELINER FLIGHT INFORMATION");

        jLabel2.setText("Destination");

        jLabel3.setText("Source");

        jLabel4.setText("Preferred time of Day");

        jLabel5.setText("Date (dd-mm-yyyy)");

        destinationTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationTxtFieldActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        otodComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Option", "Morning", "Afternoon", "Evening", "Night" }));
        otodComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otodComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(128, 128, 128)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(destinationTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(sourceTxtField)
                                    .addComponent(dateTxtField)
                                    .addComponent(otodComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(destinationTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sourceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(otodComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(searchBtn)
                .addContainerGap(173, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void destinationTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinationTxtFieldActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        if("".equals(destinationTxtField.getText())){
            destinationTxtField.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel2.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter Destination");
            return;
        }
        else{
            destinationTxtField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel2.setForeground(Color.BLACK);
        }
        
        if("".equals(sourceTxtField.getText())){
            sourceTxtField.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel3.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter Source");
            return;
        }
        else{
            sourceTxtField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel3.setForeground(Color.BLACK);
        }
        
        if(otodComboBox.getSelectedItem().equals("Select Option")){
            JOptionPane.showMessageDialog(null, "Please enter preferred time of the day");
            return;
        }
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");


        try {

            Date date = formatter.parse(dateTxtField.getText());
            dateTxtField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel5.setForeground(Color.BLACK);
            //System.out.println("Date format is correct");
        } catch (ParseException e) {
            e.printStackTrace();
            dateTxtField.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel5.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter date in dd-MM-yyyy format");
            return;
        }
        ArrayList<SpaceFlight> flightDirFiltered = flightDir.searchMaster(destinationTxtField.getText(),sourceTxtField.getText(),otodComboBox.getSelectedItem().toString(),dateTxtField.getText());
        System.out.println(flightDirFiltered);
        SpaceLinerFlightFoundJPanel panel = new SpaceLinerFlightFoundJPanel(cardSequenceJPanel, flightDirFiltered);
        cardSequenceJPanel.add("FlightFoundJPanel",panel);
        CardLayout layout = (CardLayout)cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
        clearSearchFields();
    }//GEN-LAST:event_searchBtnActionPerformed

    private void clearSearchFields(){
        destinationTxtField.setText("");
        sourceTxtField.setText("");
        otodComboBox.setSelectedItem("Select Option");
        dateTxtField.setText("");
    }
    
    private void otodComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otodComboBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_otodComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateTxtField;
    private javax.swing.JTextField destinationTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> otodComboBox;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField sourceTxtField;
    private javax.swing.JTable tblMasterFlight;
    // End of variables declaration//GEN-END:variables
}
