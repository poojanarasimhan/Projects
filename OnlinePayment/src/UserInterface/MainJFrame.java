/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.IP.IP;
import Business.IP.IPList;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.SignUp.SignUp;
import java.awt.CardLayout;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Pooja Narasimhan
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public static Logger logger = Logger.getLogger("MyLog");
    public static FileHandler fh;
    private IPList iplist;
    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        
        try {

            // This block configure the logger with handler and formatter  
            fh = new FileHandler("C:\\Users\\Pooja Narasimhan\\Documents\\NetBeansProjects\\log.txt");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            // the following statement is used to log any messages  
            logger.info("My first log");

        } catch (Exception e) {
            e.printStackTrace();
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

        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnLogIn = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        btnSignUp = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane2.setDividerLocation(150);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setText("User Name");

        jLabel2.setText("Password");

        btnLogIn.setText("Log In");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });

        btnLogOut.setText("Log Out");
        btnLogOut.setEnabled(false);
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnSignUp.setText("SignUp");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        btnCancel.setText("cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtUserName)
                    .addComponent(txtPassword)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(btnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 68, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnLogIn)
                .addGap(18, 18, 18)
                .addComponent(btnLogOut)
                .addGap(18, 18, 18)
                .addComponent(btnSignUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancel)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jSplitPane2.setLeftComponent(jPanel3);

        container.setBackground(new java.awt.Color(204, 255, 204));
        container.setLayout(new java.awt.CardLayout());
        jSplitPane2.setRightComponent(container);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        // TODO add your handling code here:
        
        String userName = txtUserName.getText();
        // Get Password
        char[] passwordCharArray = txtPassword.getPassword();
        String password = String.valueOf(passwordCharArray);
        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        if (userAccount == null) {
            //Step2: Go inside each network to check each enterprise
            for (Network network : system.getNetworkList()) {
                //Step 2-a: Check against each enterprise
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if (userAccount == null) {
                        //Step3: Check against each organization inside that enterprise
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                            if (userAccount != null) {
                                inEnterprise = enterprise;
                                inOrganization = organization;
                                break;
                            }
                        }
                    } else {
                        inEnterprise = enterprise;
                        break;
                    }
                    if (inOrganization != null) {
                        break;
                    }
                }
                if (inEnterprise != null) {
                    break;
                }
            }
        }

        if (userAccount == null) {
            InetAddress ip;
            String hostname= null;
            String a=null;
            ArrayList<String> ipAddrees = new ArrayList<>();
            ipAddrees.add("192.168.1.10");
            ipAddrees.add("192.168.1.11");
            ipAddrees.add("192.168.1.12");
            ipAddrees.add("192.168.0.117");
            ipAddrees.add("10.103.65.33");
            ipAddrees.add("10.0.0.130");
            ipAddrees.add("10.103.46.110");
            try
                {
                    ip = InetAddress.getLocalHost();
        
                    a=ip.getHostAddress();
        
                }
            catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this, "ip error");
                
                }
                    
                    IP ip1 = system.getiPList().createIP();
                    
                    ip1.setIpAddress(a);
                    ip1.setStatus("SEVERE");
                    ip1.setUserName(userName);
                    ip1.setPassword(password);
                    JOptionPane.showMessageDialog(null, "Invalid Credentails!");
                    
        } else {
             InetAddress ip;
            String hostname= null;
            String a=null;
            ArrayList<String> ipAddrees = new ArrayList<>();
            ipAddrees.add("192.168.1.10");
            ipAddrees.add("192.168.1.11");
            ipAddrees.add("192.168.0.117");
            ipAddrees.add("192.168.1.13");
            ipAddrees.add("10.103.65.33");
            ipAddrees.add("10.0.0.130");
            ipAddrees.add("10.103.46.110");
            try
                {
                    ip = InetAddress.getLocalHost();
        
                    a=ip.getHostAddress();
        
                }
            catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this, "ip error");
                
                }
            int flag = 0;
            for(String s: ipAddrees){
                if(s.equals(a)){
                    CardLayout layout = (CardLayout) container.getLayout();
                    container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, system));
                    layout.next(container);
                    flag=1;
                    IP ip1 = system.getiPList().createIP();
                    ip1.setIpAddress(a);
                    ip1.setStatus("SAFE");
                    ip1.setUserName(userName);
                    ip1.setPassword(password);
                }
                
                
            }
            if(flag == 0) {
                IP ip1 = system.getiPList().createIP();
                    ip1.setIpAddress(a);
                    ip1.setStatus("WARNING");
                    ip1.setUserName(userName);
                    ip1.setPassword(password);    
                JOptionPane.showMessageDialog(this, "Invalid ip address");
                    MainJFrame.logger.warning("Attacker");
                
            }
           
            
        }
        
        for(IP i : system.getiPList().getListOfIP()) {
            logger.info("IP Address"+i.getIpAddress() +"\n"+"Status"+i.getStatus()+"\n UserName"+i.getUserName()+"\n Password"+i.getPassword());
        }
        btnLogIn.setEnabled(false);
        btnLogOut.setEnabled(true);
        txtUserName.setEnabled(false);
        txtPassword.setEnabled(false);
        
    }//GEN-LAST:event_btnLogInActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        btnLogOut.setEnabled(false);
        txtUserName.setEnabled(true);
        txtPassword.setEnabled(true);
        btnLogIn.setEnabled(true);

        txtUserName.setText("");
        txtPassword.setText("");

        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        if (system.getNetworkList().size() == 0) {
            JOptionPane.showMessageDialog(null, "No network has been created", "Failure", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        SignUp su = new SignUp(container, system, dB4OUtil, btnLogIn, btnLogOut, btnSignUp, txtPassword, txtUserName);
        container.add("signup", su);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);

        txtPassword.setEnabled(false);
        txtUserName.setEnabled(false);
        btnLogIn.setEnabled(false);
        btnLogOut.setEnabled(false);
         btnSignUp.setEnabled(false);
        btnCancel.setEnabled(true);

    }//GEN-LAST:event_btnSignUpActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        btnLogOut.setEnabled(false);
        txtUserName.setEnabled(true);
        txtPassword.setEnabled(true);
        btnLogIn.setEnabled(true);
        btnSignUp.setEnabled(true);
        btnCancel.setEnabled(false);
        txtPassword.setText("");
        txtUserName.setText("");
         FirstPageJPanel opjp = new FirstPageJPanel();
        container.add("FirstPageJPanel",opjp);
        CardLayout layout = (CardLayout)container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogIn;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
