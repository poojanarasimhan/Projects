/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SignUp;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.security.Key;
import java.util.Properties;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import sun.misc.BASE64Encoder;

/**
 *
 * @author Pooja Narasimhan
 */
public class SignUp extends javax.swing.JPanel {

    /**
     * Creates new form SignUp
     */
    private JPanel container;
    private EcoSystem system;
    private DB4OUtil db4OUtil;
    private JButton btnLogIn;
    private JButton btnLogOut;
    private JButton btnSignUp;
    private JTextField txtPassword;
    private JTextField txtUserName;
    
   
    public SignUp(JPanel container ,EcoSystem system,DB4OUtil db4OUtil, JButton btnLogIn, JButton btnLogOut,JButton btnSignUp,JTextField txtPassword, JTextField txtUserName ) {
        initComponents();
        this.system=system;
        this.container=container;
        this.db4OUtil = db4OUtil;
        this.btnLogIn = btnLogIn;
        this.btnLogOut = btnLogOut;
        this.btnSignUp = btnSignUp;
        this.txtPassword = txtPassword;
        this.txtUserName = txtUserName;
       
        populateComboBoxAge();
        populateComboBoxCountry();
        populatetypeCombobox();
    }
    public void populateComboBoxAge() {
        agejComboBox.removeAllItems();
        for(int i=1;i<=100;i++) {
            agejComboBox.addItem(String.valueOf(i));
        }
    }
    
    public void populatetypeCombobox(){
        String a = "Individual";
        String b = "Corporate";
        typejComboBox1.removeAllItems();
        typejComboBox1.addItem(a);
        typejComboBox1.addItem(b);
        
    }
    
    public void populateComboBoxCountry() {
        networkjComboBox.removeAllItems();
        for(Network n : system.getNetworkList()) {
            networkjComboBox.addItem(String.valueOf(n));
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        agejComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtUserName1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAdd1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAdd2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtZipCode = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        networkjComboBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        pwdjPasswordField1 = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        repwdjPasswordField = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblEmailID = new javax.swing.JLabel();
        lblAddress1 = new javax.swing.JLabel();
        lblAddress2 = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        lblPwd = new javax.swing.JLabel();
        lblRePwd = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        typejComboBox1 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Sign Up");

        jLabel2.setText("Name ");

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        jLabel3.setText("Age");

        agejComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("User Name");

        txtUserName1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserName1KeyReleased(evt);
            }
        });

        jLabel5.setText("Email ID");

        txtEmailID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailIDFocusLost(evt);
            }
        });

        jLabel6.setText("Address Line 1");

        jLabel7.setText("Address Line 2");

        jLabel8.setText("Zip Code");

        jLabel9.setText("Network");

        networkjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setText("Password");

        jLabel11.setText("Re Enter Password");

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        jLabel13.setText("Type");

        typejComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNext)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(agejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(typejComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtName)
                            .addComponent(txtUserName1)
                            .addComponent(txtEmailID)
                            .addComponent(txtAdd1)
                            .addComponent(txtAdd2)
                            .addComponent(txtZipCode)
                            .addComponent(networkjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwdjPasswordField1)
                            .addComponent(repwdjPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                        .addGap(53, 53, 53)
                        .addComponent(jLabel12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblUserName))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEmailID))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAddress1)
                                    .addComponent(lblName)
                                    .addComponent(lblAddress2)
                                    .addComponent(lblZipCode)
                                    .addComponent(lblPwd)
                                    .addComponent(lblRePwd))))))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(lblName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(agejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(typejComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUserName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZipCode))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(networkjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(pwdjPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPwd))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(repwdjPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRePwd))
                .addGap(27, 27, 27)
                .addComponent(btnNext)
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        
        String name = txtName.getText();
        String userName = txtUserName1.getText();
        String email = txtEmailID.getText();
        String addressLine1 = txtAdd1.getText();
        String addressLine2 = txtAdd2.getText();
        String age = String.valueOf(agejComboBox.getSelectedItem());
        String typeebill = String.valueOf(typejComboBox1.getSelectedItem());
        String zipCode = txtZipCode.getText();
        String pwd = String.valueOf(pwdjPasswordField1.getPassword());
        String rePwd = String.valueOf(repwdjPasswordField.getPassword());
        int ageInt = Integer.parseInt(age);
        int randNum = 0;
        
        if(userName.length() <6 ||userName.length() >12 || !userName.matches("[a-zA-Z0-9 ]*$") || userName.equals(" ")){
            JOptionPane.showMessageDialog(null, "Invalid username", "Failure", JOptionPane.PLAIN_MESSAGE);
            txtUserName1.setBorder(BorderFactory.createLineBorder(Color.red));
            return;
            
        }
        
        if(name.length() == 0 || !name.matches("[a-zA-Z ]*$") || name.equals(" ")){
            JOptionPane.showMessageDialog(null, "Invalid Name", "Failure", JOptionPane.PLAIN_MESSAGE);
            txtName.setBorder(BorderFactory.createLineBorder(Color.red));
            return;
            
        }
        
        if(email.length() == 0 || !email.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$") || name.equals(" ")){
            JOptionPane.showMessageDialog(null, "Invalid email", "Failure", JOptionPane.PLAIN_MESSAGE);
            txtEmailID.setBorder(BorderFactory.createLineBorder(Color.red));
            return;
        }
        if(zipCode.length() != 5 || !zipCode.matches("[0-9]*$") || zipCode.equals("")){
            JOptionPane.showMessageDialog(null, "Invalid Zipcode", "Failure", JOptionPane.PLAIN_MESSAGE);
            txtZipCode.setBorder(BorderFactory.createLineBorder(Color.red));
            return;
            
        }
        if(addressLine1.length() == 0 || !addressLine1.matches("^[a-zA-Z0-9]*$") || addressLine1.equals("")){
            JOptionPane.showMessageDialog(null, "Invalid address line 1", "Failure", JOptionPane.PLAIN_MESSAGE);
            txtAdd1.setBorder(BorderFactory.createLineBorder(Color.red));
            return;
        }
        if(addressLine2.length() == 0 || !addressLine2.matches("^[a-zA-Z0-9]*$") || addressLine2.equals("")){
            JOptionPane.showMessageDialog(null, "Invalid address line 2", "Failure", JOptionPane.PLAIN_MESSAGE);
            txtAdd2.setBorder(BorderFactory.createLineBorder(Color.red));
            return;
        }
        
       if(pwd.length() ==0 || !pwd.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})") || pwd.equals("")){
            JOptionPane.showMessageDialog(null, "Password must contain a character including one uppercase letter, one special character and alphanumeric characters ", "Failure", JOptionPane.PLAIN_MESSAGE);
            txtPassword.setBorder(BorderFactory.createLineBorder(Color.red));
            return;
        }
       if(!pwd.equals(rePwd)){
           JOptionPane.showMessageDialog(this, "Password Mismatch");
           return;
       }
        
        
        
            for(Network n : system.getNetworkList()) {
                for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    for(UserAccount ua : e.getUserAccountDirectory().getUserAccountList()) {
                        if(ua.equals(userName)) {
                            JOptionPane.showMessageDialog(null, "User Name already exists", "Failure", JOptionPane.PLAIN_MESSAGE);
                            txtUserName1.setBorder(BorderFactory.createLineBorder(Color.red));
                            
                            return;
                        }
                    }
                }
            }
            
            
        

        
            for(Network n : system.getNetworkList()) {
                for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    for(Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        
                            for(UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                                if(ua.getEmployee().getMailId().equals(email)) {
                                    JOptionPane.showMessageDialog(null, "The provided mail ID is already present in the system. Please try to log in to system", "Failure", JOptionPane.PLAIN_MESSAGE);
                                    txtEmailID.setBorder(BorderFactory.createLineBorder(Color.red));
                                    return;
                                }
                            
                        }
                    }
                }
            }
            
            
        

            String net = String.valueOf(networkjComboBox.getSelectedItem());
            Network n1=null;
            for(Network n : system.getNetworkList()) {
                if(n.getName().equals(net)) {
                    n1=n;
                }
            }
        
        
            
        
            if(n1.getEnterpriseDirectory().getEnterpriseList().size() == 0) {
                JOptionPane.showMessageDialog(null, "Enterprise not yet created for the specified network", "Failure", JOptionPane.PLAIN_MESSAGE);
                return;
            }
            int flag =0;
            if(flag == 0) {
            
            String to = email; 
            Random rnd = new Random();
            randNum = 100000 + rnd.nextInt(900000);
            String randNum2 = String.valueOf(randNum);
            String content = "Online payment. Your Confirmation code is ";
            
            String body = content+randNum2;
            
            int flag2=eMail(to, body);
            if(flag2 == 2) {
                JOptionPane.showMessageDialog(null, "Email could not be sent to the specified email ID! Please try again", "Failure", JOptionPane.PLAIN_MESSAGE);
                flag=1;
            } 
        }
        if(flag == 0) {
            
            Enterprise.EnterpriseType type = Enterprise.EnterpriseType.ElectricityBill;
            
            
            
            JOptionPane.showMessageDialog(null, "An email with Confirmation Code has been sent to the provided Email Address!", "Success", JOptionPane.PLAIN_MESSAGE);
            ConfirmationCode cc = new ConfirmationCode(container, system, name, userName, ageInt, email,n1,randNum, db4OUtil, addressLine1, addressLine2, zipCode, pwd, rePwd,typeebill);
            container.add("confirmationCode",cc);
            CardLayout layout = (CardLayout)container.getLayout();
            layout.next(container);
        }
        
        
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtUserName1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserName1KeyReleased
        // TODO add your handling code here:
         int flag=0;
        for(Network n : system.getNetworkList()) {
            for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for(Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    for(UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                        if(txtUserName1.getText().equals(ua.getUsername()) || txtUserName1.getText().equals("sysadmin")) {
                            lblUserName.setText("Username already exists");
                            flag=1;
                            
                        }
                    }
                }
            }
        }
        if(flag == 0) {
            lblUserName.setText("");
        }   
    }//GEN-LAST:event_txtUserName1KeyReleased

    private void txtEmailIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailIDFocusLost
        // TODO add your handling code here:
         String email = txtEmailID.getText();
        int flag = 0;
             for(Network n : system.getNetworkList()) {
            for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for(Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    for(UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                        if(txtEmailID.getText().equals(ua.getEmployee().getMailId()))  {
                            lblEmailID.setText("Email already exists");
                            flag=1;
                            
                        }
                    }
                }
            }
        }
            if(flag == 0) {
            lblEmailID.setText("");
        } 
            
    }//GEN-LAST:event_txtEmailIDFocusLost

    private void txtEmailIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailIDFocusGained
        // TODO add your handling code here:
        lblEmailID.setText("");
    }//GEN-LAST:event_txtEmailIDFocusGained

    public static int eMail(String recipient, String bodyContent) {
        String to = recipient;
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", "465");
        
        Session session = Session.getDefaultInstance(properties,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                       return new PasswordAuthentication("donotreplyonlinepayment@gmail.com", "Pooja.10");
                    }
                    
                }
                               
                );
        
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("donotreplyonlinepayment@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject("Online Payment");
            
                try {                
                    message.setText(bodyContent);
                    Transport.send(message);
                    
                    return 1;
                
                }
                catch(AddressException e) {
                    JOptionPane.showMessageDialog(null, "It appears that your email address id not valid");
                    return 2;
                }
            
            
        } catch(Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            return 2;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> agejComboBox;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAddress1;
    private javax.swing.JLabel lblAddress2;
    private javax.swing.JLabel lblEmailID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPwd;
    private javax.swing.JLabel lblRePwd;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JComboBox<String> networkjComboBox;
    private javax.swing.JPasswordField pwdjPasswordField1;
    private javax.swing.JPasswordField repwdjPasswordField;
    private javax.swing.JTextField txtAdd1;
    private javax.swing.JTextField txtAdd2;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtUserName1;
    private javax.swing.JTextField txtZipCode;
    private javax.swing.JComboBox<String> typejComboBox1;
    // End of variables declaration//GEN-END:variables
}
