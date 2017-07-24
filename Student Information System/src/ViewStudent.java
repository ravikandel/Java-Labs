
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class ViewStudent extends javax.swing.JFrame {

    ResultSet rs=null;
    String sid=null;
    /**
     * Creates new form ViewStudent
     */
    public ViewStudent() {
        initComponents();
        DB_Connection();
        DisplayInitialValues();
    }
    
    public void DB_Connection()
    {
        dbOperation.dbQueries dbQ=new dbOperation.dbQueries();
        rs=dbQ.viewStudentInformation();
    }
    
    public void DisplayInitialValues()
    {
        
        try {
            if(rs.next())
            {
                sid=rs.getString("id");
                this.txtFirstName.setText(rs.getString("first_name"));
                this.txtLastName.setText(rs.getString("last_name"));
                this.txtAddress.setText(rs.getString("address"));
                // for radio button
                String gen=rs.getString("gender");
                if(gen.equalsIgnoreCase("MALE"))
                {
                    this.radiomale.setSelected(true);
                }
                else if(gen.equalsIgnoreCase("FEMALE"))
                {
                    this.radioFemale.setSelected(true);
                }
                
                this.txtPhone.setText(rs.getString("phone"));
                this.txtEmail.setText(rs.getString("email"));
                
                java.sql.Date dbSqlDate = rs.getDate("dob");
                
                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy"); //Or whatever format fits best your needs.
                String output_date = sdf.format(dbSqlDate);
                
                this.txtDateOfBirth.setText(output_date);
                
                //this.txtDateOfBirth.setText(rs.getString("dob"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        btnlast = new javax.swing.JButton();
        txtFirstName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDateOfBirth = new javax.swing.JTextField();
        radiomale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnfirst = new javax.swing.JButton();
        btnprev = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();

        setTitle("View Student");

        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jScrollPane1.setName("txtaddress"); // NOI18N

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAddress.setRows(5);
        txtAddress.setName("txtAddress"); // NOI18N
        jScrollPane1.setViewportView(txtAddress);

        btnlast.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnlast.setText(">>");
        btnlast.setName("btnlast"); // NOI18N
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        txtFirstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFirstName.setName("txtFirstName"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Gender:");

        txtDateOfBirth.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDateOfBirth.setToolTipText("dd/mm/yyyy");
        txtDateOfBirth.setName("txtDateOfBirth"); // NOI18N

        Gender.add(radiomale);
        radiomale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radiomale.setText("Male");
        radiomale.setName("radioMale"); // NOI18N

        Gender.add(radioFemale);
        radioFemale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radioFemale.setText("Female");
        radioFemale.setName("radioFemale"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Phone:");

        txtPhone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPhone.setToolTipText("mobile or landline");
        txtPhone.setName("txtPhone"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("First Name:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Email:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Last Name:");

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setName("txtEmail"); // NOI18N

        txtLastName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLastName.setToolTipText("");
        txtLastName.setName("txtLastName"); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Date of Birth:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Address:");

        btnfirst.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnfirst.setText("<<");
        btnfirst.setName("btnfirst"); // NOI18N
        btnfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirstActionPerformed(evt);
            }
        });

        btnprev.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnprev.setText("<");
        btnprev.setName("btnprev"); // NOI18N
        btnprev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprevActionPerformed(evt);
            }
        });

        btnnext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnnext.setText(">");
        btnnext.setName("btnnext"); // NOI18N
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnupdate.setBackground(new java.awt.Color(51, 153, 255));
        btnupdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.setName("btnupdate"); // NOI18N
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtFirstName))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radiomale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(radioFemale)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtLastName)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                    .addComponent(txtPhone)
                                    .addComponent(txtEmail)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDateOfBirth))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnfirst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnprev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnnext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnlast)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnupdate)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(radiomale)
                    .addComponent(radioFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnupdate)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnlast)
                        .addComponent(btnfirst)
                        .addComponent(btnnext))
                    .addComponent(btnprev))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        ArrayList data = new ArrayList();
        
        data.add(this.txtFirstName.getText());
        data.add(this.txtLastName.getText());
        data.add(this.txtAddress.getText());
        if (this.radiomale.isSelected()) {
            data.add("Male");
        } else if (this.radioFemale.isSelected()) {
            data.add("Female");
        }
        data.add(this.txtPhone.getText());
        data.add(this.txtEmail.getText());
        data.add(this.txtDateOfBirth.getText());
        data.add(this.sid);
        
        dbOperation.dbQueries dbQ = new dbOperation.dbQueries();
        dbQ.updateStudentInformation(data);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed

        DisplayInitialValues();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnprevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprevActionPerformed
        
        try {
            if(rs.previous())
            {
                sid=rs.getString("id");
                this.txtFirstName.setText(rs.getString("first_name"));
                this.txtLastName.setText(rs.getString("last_name"));
                this.txtAddress.setText(rs.getString("address"));
                // for radio button
                String gen=rs.getString("gender");
                if(gen.equalsIgnoreCase("MALE"))
                {
                    this.radiomale.setSelected(true);
                }
                else if(gen.equalsIgnoreCase("FEMALE"))
                {
                    this.radioFemale.setSelected(true);
                }
                
                this.txtPhone.setText(rs.getString("phone"));
                this.txtEmail.setText(rs.getString("email"));
                
                java.sql.Date dbSqlDate = rs.getDate("dob");
                
                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy"); //Or whatever format fits best your needs.
                String output_date = sdf.format(dbSqlDate);
                
                this.txtDateOfBirth.setText(output_date);
                
                //this.txtDateOfBirth.setText(rs.getString("dob"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnprevActionPerformed

    private void btnfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirstActionPerformed
    
        try {
            if(rs.first())
            {
                sid=rs.getString("id");
                this.txtFirstName.setText(rs.getString("first_name"));
                this.txtLastName.setText(rs.getString("last_name"));
                this.txtAddress.setText(rs.getString("address"));
                // for radio button
                String gen=rs.getString("gender");
                if(gen.equalsIgnoreCase("MALE"))
                {
                    this.radiomale.setSelected(true);
                }
                else if(gen.equalsIgnoreCase("FEMALE"))
                {
                    this.radioFemale.setSelected(true);
                }
                
                this.txtPhone.setText(rs.getString("phone"));
                this.txtEmail.setText(rs.getString("email"));
                
                java.sql.Date dbSqlDate = rs.getDate("dob");
                
                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy"); //Or whatever format fits best your needs.
                String output_date = sdf.format(dbSqlDate);
                
                this.txtDateOfBirth.setText(output_date);
                
                //this.txtDateOfBirth.setText(rs.getString("dob"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnfirstActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed

        try {
            if(rs.last())
            {
                sid=rs.getString("id");
                this.txtFirstName.setText(rs.getString("first_name"));
                this.txtLastName.setText(rs.getString("last_name"));
                this.txtAddress.setText(rs.getString("address"));
                // for radio button
                String gen=rs.getString("gender");
                if(gen.equalsIgnoreCase("MALE"))
                {
                    this.radiomale.setSelected(true);
                }
                else if(gen.equalsIgnoreCase("FEMALE"))
                {
                    this.radioFemale.setSelected(true);
                }
                
                this.txtPhone.setText(rs.getString("phone"));
                this.txtEmail.setText(rs.getString("email"));
                
                java.sql.Date dbSqlDate = rs.getDate("dob");
                
                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy"); //Or whatever format fits best your needs.
                String output_date = sdf.format(dbSqlDate);
                
                this.txtDateOfBirth.setText(output_date);
                
                //this.txtDateOfBirth.setText(rs.getString("dob"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
        } 
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlastActionPerformed

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
            java.util.logging.Logger.getLogger(ViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfirst;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprev;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radiomale;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtDateOfBirth;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
ButtonGroup Gender = new ButtonGroup();

}
