package org.cantact.ui;

import org.cantact.core.CanFrame;
import org.cantact.core.DeviceManager;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
        dtd = "-//org.cantact.ui//Transmit//EN",
        autostore = false
)
@TopComponent.Description(
        preferredID = "TransmitTopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE", 
        persistenceType = TopComponent.PERSISTENCE_ALWAYS
)
@TopComponent.Registration(mode = "leftSlidingSide", openAtStartup = true)
@ActionID(category = "Window", id = "org.cantact.ui.TransmitTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_TransmitAction",
        preferredID = "TransmitTopComponent"
)
@Messages({
    "CTL_TransmitAction=Transmit",
    "CTL_TransmitTopComponent=Transmit Window",
    "HINT_TransmitTopComponent=This is a Transmit window"
})
public final class TransmitTopComponent extends TopComponent {
    public TransmitTopComponent() {
        initComponents();
        setName(Bundle.CTL_TransmitTopComponent());
        setToolTipText(Bundle.HINT_TransmitTopComponent());
        putClientProperty(TopComponent.PROP_MAXIMIZATION_DISABLED, Boolean.TRUE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        byte0Field = new javax.swing.JTextField();
        byte1Field = new javax.swing.JTextField();
        byte2Field = new javax.swing.JTextField();
        byte3Field = new javax.swing.JTextField();
        byte4Field = new javax.swing.JTextField();
        byte5Field = new javax.swing.JTextField();
        byte6Field = new javax.swing.JTextField();
        byte7Field = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dlcComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        transmitButton = new javax.swing.JButton();

        byte0Field.setText(org.openide.util.NbBundle.getMessage(TransmitTopComponent.class, "TransmitTopComponent.byte0Field.text")); // NOI18N

        byte1Field.setText(org.openide.util.NbBundle.getMessage(TransmitTopComponent.class, "TransmitTopComponent.byte1Field.text")); // NOI18N

        byte2Field.setText(org.openide.util.NbBundle.getMessage(TransmitTopComponent.class, "TransmitTopComponent.byte2Field.text")); // NOI18N

        byte3Field.setText(org.openide.util.NbBundle.getMessage(TransmitTopComponent.class, "TransmitTopComponent.byte3Field.text")); // NOI18N

        byte4Field.setText(org.openide.util.NbBundle.getMessage(TransmitTopComponent.class, "TransmitTopComponent.byte4Field.text")); // NOI18N

        byte5Field.setText(org.openide.util.NbBundle.getMessage(TransmitTopComponent.class, "TransmitTopComponent.byte5Field.text")); // NOI18N

        byte6Field.setText(org.openide.util.NbBundle.getMessage(TransmitTopComponent.class, "TransmitTopComponent.byte6Field.text")); // NOI18N

        byte7Field.setText(org.openide.util.NbBundle.getMessage(TransmitTopComponent.class, "TransmitTopComponent.byte7Field.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(TransmitTopComponent.class, "TransmitTopComponent.jLabel1.text")); // NOI18N

        idField.setText(org.openide.util.NbBundle.getMessage(TransmitTopComponent.class, "TransmitTopComponent.idField.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(TransmitTopComponent.class, "TransmitTopComponent.jLabel2.text")); // NOI18N

        dlcComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(TransmitTopComponent.class, "TransmitTopComponent.jLabel3.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(transmitButton, org.openide.util.NbBundle.getMessage(TransmitTopComponent.class, "TransmitTopComponent.transmitButton.text")); // NOI18N
        transmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transmitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(dlcComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(byte0Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(byte1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(byte2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(byte3Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(byte4Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(byte5Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(byte6Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(byte7Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(transmitButton))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(dlcComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(byte0Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(byte1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(byte2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(byte3Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(byte4Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(byte5Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(byte6Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(byte7Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(transmitButton))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void transmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transmitButtonActionPerformed
        CanFrame txFrame = new CanFrame();
        txFrame.setId(Integer.decode(this.idField.getText()));
        txFrame.setDlc(Integer.decode(this.dlcComboBox.getSelectedItem().toString()));
        int[] data = {
            Integer.decode(this.byte0Field.getText()),
            Integer.decode(this.byte1Field.getText()),
            Integer.decode(this.byte2Field.getText()),
            Integer.decode(this.byte3Field.getText()),
            Integer.decode(this.byte4Field.getText()),
            Integer.decode(this.byte5Field.getText()),
            Integer.decode(this.byte6Field.getText()),
            Integer.decode(this.byte7Field.getText())
        };
        txFrame.setData(data);
        DeviceManager.transmit(txFrame);
    }//GEN-LAST:event_transmitButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField byte0Field;
    private javax.swing.JTextField byte1Field;
    private javax.swing.JTextField byte2Field;
    private javax.swing.JTextField byte3Field;
    private javax.swing.JTextField byte4Field;
    private javax.swing.JTextField byte5Field;
    private javax.swing.JTextField byte6Field;
    private javax.swing.JTextField byte7Field;
    private javax.swing.JComboBox dlcComboBox;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton transmitButton;
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }
}
