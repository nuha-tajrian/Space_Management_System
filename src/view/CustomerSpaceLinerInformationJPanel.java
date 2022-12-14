
package view;

import view.BookingSpaceLinerInformationJPanel;
import controller.Customer;
import controller.SpaceFlight;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class CustomerSpaceLinerInformationJPanel extends javax.swing.JPanel {

    private List<Customer> customerList;
    private JPanel cardSequenceJPanel;
    public CustomerSpaceLinerInformationJPanel(JPanel cardSequenceJPanel, List<Customer> customerList) {
         initComponents();
         this.customerList = customerList;
         this.cardSequenceJPanel = cardSequenceJPanel;
         populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)customersTbl.getModel();
        dtm.setRowCount(0);
        
        for(Customer c : customerList){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]= c.getFirstName();
            row[1]= c.getLastName();
            row[2]= c.getAge();
            row[3] = c.getPhNum();
            row[4] = c.getSsn();
            dtm.addRow(row);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customersTbl = new javax.swing.JTable();
        viewBookingHistory = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Customers");

        customersTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "FirstName", "LastName", "Age", "Phone", "SSN"
            }
        ));
        jScrollPane1.setViewportView(customersTbl);

        viewBookingHistory.setText("View Booking Information");
        viewBookingHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBookingHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(viewBookingHistory)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(396, 396, 396)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(127, 127, 127)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(viewBookingHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(310, 310, 310))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewBookingHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBookingHistoryActionPerformed
        // TODO add your handling code here:
        int selectedRow = customersTbl.getSelectedRow();
        if(selectedRow > -1){
           SpaceFlight bookedFlight = customerList.get(selectedRow).getSpaceFlightBooked();
           BookingSpaceLinerInformationJPanel panel = new BookingSpaceLinerInformationJPanel(cardSequenceJPanel, bookedFlight, customerList.get(selectedRow).getSeatBooked());
           cardSequenceJPanel.add("FlightFoundDetailJPanel",panel);
           CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
           layout.next(cardSequenceJPanel);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
    }//GEN-LAST:event_viewBookingHistoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable customersTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewBookingHistory;
    // End of variables declaration//GEN-END:variables
}
