/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cmsc128;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Reginald Neil C. Recario
 */
public class CMSC128Panel extends javax.swing.JPanel {    
    
    /**
     * Creates new form CMSC128Panel
     */
    public CMSC128Panel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        operandJTextField2 = new javax.swing.JTextField();
        operandJTextField1 = new javax.swing.JTextField();
        sumJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addJButton = new javax.swing.JButton();

        operandJTextField2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        operandJTextField1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        sumJTextField.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Baggage Weight 1:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Baggage Total:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Baggage Weight 2:");

        addJButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        addJButton.setText("Add");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addJButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sumJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(operandJTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(operandJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel3)
                    .addContainerGap(256, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(operandJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(operandJTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sumJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addJButton)
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(104, 104, 104)
                    .addComponent(jLabel3)
                    .addContainerGap(193, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField operandJTextField1;
    private javax.swing.JTextField operandJTextField2;
    private javax.swing.JTextField sumJTextField;
    // End of variables declaration//GEN-END:variables

    public JTextField getOperandJTextField1(){
        return operandJTextField1;
    }
    
    public void setOperandJTextField1(JTextField operandJTextField1){
        this.operandJTextField1 = operandJTextField1;
    }
    
    public JTextField getOperandJTextField2(){
        return operandJTextField2;    
    }
   
    public void setOperandJTextField2(JTextField operandJTextField2){
        this.operandJTextField2 = operandJTextField2;
    }    
    
    public JTextField getSumJTextField(){
         return sumJTextField;     
    }    
    
    public void setSumJTextField1(JTextField sumJTextField){
        this.sumJTextField = sumJTextField;
    }    
    
    public JButton getAddJButton(){
        return addJButton;
    }
    
    public void setAddJButton(JButton addJButton){
        this.addJButton = addJButton;
    }     
    


}
