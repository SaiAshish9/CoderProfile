
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class accountLog extends javax.swing.JFrame {
public static String name;
public static int age;
public static String sex;
public static Long mob;
public static String gmail;
public static String login;
public static String pass;
    
    public accountLog() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        loginBTN = new javax.swing.JButton();
        signUpBTN = new javax.swing.JButton();
        ForgotPas = new javax.swing.JButton();
        PASS = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Account Login");
        setBackground(new java.awt.Color(204, 255, 153));
        setForeground(new java.awt.Color(204, 255, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 22));
        jLabel3.setText("User_ID");

        ID.setBackground(new java.awt.Color(204, 204, 255));
        ID.setFont(new java.awt.Font("Andalus", 1, 18));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 22));
        jLabel4.setText("Password");

        loginBTN.setBackground(new java.awt.Color(153, 255, 204));
        loginBTN.setFont(new java.awt.Font("Tahoma", 1, 24));
        loginBTN.setForeground(new java.awt.Color(0, 0, 204));
        loginBTN.setText("Log In");
        loginBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        loginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBTNActionPerformed(evt);
            }
        });

        signUpBTN.setBackground(new java.awt.Color(153, 255, 204));
        signUpBTN.setFont(new java.awt.Font("Tahoma", 1, 18));
        signUpBTN.setForeground(new java.awt.Color(51, 0, 255));
        signUpBTN.setText("Sign Up");
        signUpBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        signUpBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBTNActionPerformed(evt);
            }
        });

        ForgotPas.setBackground(new java.awt.Color(153, 255, 204));
        ForgotPas.setFont(new java.awt.Font("Tahoma", 1, 18));
        ForgotPas.setForeground(new java.awt.Color(0, 0, 255));
        ForgotPas.setText("Forgot Password");
        ForgotPas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ForgotPas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForgotPasActionPerformed(evt);
            }
        });

        PASS.setBackground(new java.awt.Color(204, 204, 255));
        PASS.setFont(new java.awt.Font("Andalus", 1, 18));
        PASS.setEchoChar('$');

        jLabel2.setFont(new java.awt.Font("Calibri", 3, 32));
        jLabel2.setForeground(java.awt.Color.orange);
        jLabel2.setText("Welcome to Railways");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wappy3.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(580, 580, 580)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(23, 23, 23)
                .addComponent(PASS, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(loginBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(signUpBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ForgotPas, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(PASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(loginBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(signUpBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(ForgotPas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBTNActionPerformed
try {
     Class.forName("java.sql.Driver");
     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/railway","root","tiger");
     Statement stment = conn.createStatement();
     String iduse = ID.getText();
     String pwd =  new String(PASS.getPassword());
     String qry = " select * from custom_details where Login_ID = '" +iduse+"'";
     ResultSet rs = stment.executeQuery(qry);
     if(rs.first())
      {
         login = rs.getString("login_id");
         pass  = rs.getString("password");
         gmail=rs.getString("gmail_id");
         mob=rs.getLong("mobile_no");
         sex=rs.getString("sex");
         name=rs.getString("name");
         age=rs.getInt("age");
     }
     if (iduse.equalsIgnoreCase(login)==true)
      {
         if(pwd.equals(pass)==true)
           {
            JOptionPane.showMessageDialog(this, "Welcome to railway site");
            new PageMain().setVisible(true);
           }
         else
            JOptionPane.showMessageDialog(this, "Your Password is wrong");
      }
     else
         JOptionPane.showMessageDialog(this, "your Login Id doesn't exist... \n pls Signup or enter correct Login Id");  
  conn.close();
  stment.close();
  rs.close();
 }
catch(Exception exp) {
  JOptionPane.showMessageDialog(null,"erorr!!!  " +exp.getMessage());
 }
    }//GEN-LAST:event_loginBTNActionPerformed

    private void ForgotPasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForgotPasActionPerformed
try {
      Class.forName("java.sql.Driver");
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/railway","root","tiger");
      Statement stment = conn.createStatement();
      gmail = JOptionPane.showInputDialog("Enter your Gmail_ID");
      login  = JOptionPane.showInputDialog("Enter your login_ID");
      String sql = "Select * from custom_details where gmail_ID='"+gmail+"'and login_id='"+login+"'";
      ResultSet rs = stment.executeQuery(sql);
      if (rs.first())
       {
        pass = rs.getString("password");
        JOptionPane.showMessageDialog(this,"Your Password is " +pass);
       }
      else
        JOptionPane.showMessageDialog(this,"Enter correct Login_ID and Gmail_ID");
    }
catch(Exception exp) {
      JOptionPane.showMessageDialog(null,"error!!!" +exp.getMessage());
}
    }//GEN-LAST:event_ForgotPasActionPerformed

    private void signUpBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBTNActionPerformed
this.dispose();
new CreateAcc().setVisible(true);
    }//GEN-LAST:event_signUpBTNActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new accountLog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ForgotPas;
    private javax.swing.JTextField ID;
    private javax.swing.JPasswordField PASS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton loginBTN;
    private javax.swing.JButton signUpBTN;
    // End of variables declaration//GEN-END:variables
}
