
package view;

import controller.SpaceLiner;
import controller.SpaceLinerDirectory;
import controller.CustomerDirectory;
import model.SpaceFlightDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class TravelAgencyMain extends javax.swing.JFrame {

    private SpaceLinerDirectory airlinerDir;
    private SpaceFlightDirectory flightDir;
    private CustomerDirectory customerDir;
    public TravelAgencyMain() {
        initComponents();
        this.airlinerDir = new SpaceLinerDirectory();
        this.flightDir = new SpaceFlightDirectory();
        this.customerDir = new CustomerDirectory();
        airlinerSelectComboBoxBuild();
    }
    
    public void airlinerSelectComboBoxBuild(){
        ArrayList<String> airlinerArray = new ArrayList();
        DefaultComboBoxModel cBmodel = new DefaultComboBoxModel();
        cBmodel.addElement("Select Airliner");
        for(SpaceLiner airliner: airlinerDir.getSpaceLinerDir()){
            if(airlinerArray.contains(airliner.getName())){continue;}
            else {
                airlinerArray.add(airliner.getName());
                cBmodel.addElement(airliner.getName());
            }
        }
        SpaceLinerSelectComboBox.setModel(cBmodel);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        navJPanel = new javax.swing.JPanel();
        manageAirlinersBtn = new javax.swing.JButton();
        SpaceLinerSelectComboBox = new javax.swing.JComboBox<>();
        goBtn = new javax.swing.JButton();
        travelAgencyBtn = new javax.swing.JButton();
        customerBtn = new javax.swing.JButton();
        cardSequenceJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        manageAirlinersBtn.setText("Manage SpaceLiners");
        manageAirlinersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAirlinersBtnActionPerformed(evt);
            }
        });

        goBtn.setText("Go");
        goBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBtnActionPerformed(evt);
            }
        });

        travelAgencyBtn.setText("Travel Agency");
        travelAgencyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                travelAgencyBtnActionPerformed(evt);
            }
        });

        customerBtn.setText("Customer");
        customerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navJPanelLayout = new javax.swing.GroupLayout(navJPanel);
        navJPanel.setLayout(navJPanelLayout);
        navJPanelLayout.setHorizontalGroup(
            navJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navJPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(navJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(SpaceLinerSelectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(manageAirlinersBtn))
                    .addComponent(goBtn, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(navJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(travelAgencyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        navJPanelLayout.setVerticalGroup(
            navJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navJPanelLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(manageAirlinersBtn)
                .addGap(41, 41, 41)
                .addComponent(SpaceLinerSelectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(goBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(travelAgencyBtn)
                .addGap(28, 28, 28)
                .addComponent(customerBtn)
                .addGap(36, 36, 36))
        );

        splitPane.setLeftComponent(navJPanel);

        cardSequenceJPanel.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(cardSequenceJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageAirlinersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAirlinersBtnActionPerformed
        // TODO add your handling code here:
        ManageSpaceLinersJPanel panel = new ManageSpaceLinersJPanel(cardSequenceJPanel, airlinerDir);
        cardSequenceJPanel.add("ManageAirlinersJPanel",panel);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
    }//GEN-LAST:event_manageAirlinersBtnActionPerformed

    private void goBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBtnActionPerformed
        // TODO add your handling code here:
        if(SpaceLinerSelectComboBox.getSelectedItem().equals("Select Airliner")){
            JOptionPane.showMessageDialog(null, "Please select an option above");
            return; 
        }
        String airlinerName = SpaceLinerSelectComboBox.getSelectedItem().toString();
        ManageSpaceLinerFlightScheduleJPanel panel = new ManageSpaceLinerFlightScheduleJPanel(cardSequenceJPanel, flightDir, airlinerName);
        cardSequenceJPanel.add("ManageAirlinerFlightScheduleJPanel",panel);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
    }//GEN-LAST:event_goBtnActionPerformed
    private void travelAgencyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_travelAgencyBtnActionPerformed
        // TODO add your handling code here:
        ManageMasterSpaceLinerFlightScheduleJPanel panel = new ManageMasterSpaceLinerFlightScheduleJPanel(cardSequenceJPanel, flightDir);
        cardSequenceJPanel.add("ManageMasterFlightScheduleJPanel",panel);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
    }//GEN-LAST:event_travelAgencyBtnActionPerformed

    private void customerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerBtnActionPerformed
        // TODO add your handling code here:
        
        CustomerSpaceLinerInformationJPanel panel = new CustomerSpaceLinerInformationJPanel(cardSequenceJPanel, CustomerDirectory.customerList);
        cardSequenceJPanel.add("CustomerInformationJPanel",panel);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
    }//GEN-LAST:event_customerBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TravelAgencyMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> SpaceLinerSelectComboBox;
    private javax.swing.JPanel cardSequenceJPanel;
    private javax.swing.JButton customerBtn;
    private javax.swing.JButton goBtn;
    private javax.swing.JButton manageAirlinersBtn;
    private javax.swing.JPanel navJPanel;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JButton travelAgencyBtn;
    // End of variables declaration//GEN-END:variables
}
