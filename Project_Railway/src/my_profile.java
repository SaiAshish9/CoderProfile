
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class my_profile extends javax.swing.JFrame {
   
    public my_profile() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back_main = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sexTF = new javax.swing.JTextField();
        mobTF = new javax.swing.JTextField();
        cnameTF = new javax.swing.JTextField();
        gmailTF = new javax.swing.JTextField();
        cageTF = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        passwordBTN = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        back_main.setFont(new java.awt.Font("Tahoma", 1, 18));
        back_main.setText("BACK");
        back_main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_mainActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Andalus", 1, 20));
        jLabel7.setText("Gmail ID");

        jLabel2.setFont(new java.awt.Font("Andalus", 1, 20));
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Andalus", 1, 20));
        jLabel3.setText("Mobile No.");

        jLabel4.setFont(new java.awt.Font("Andalus", 1, 20));
        jLabel4.setText("Sex");

        jLabel5.setFont(new java.awt.Font("Andalus", 1, 20));
        jLabel5.setText("Age");

        sexTF.setFont(new java.awt.Font("Andalus", 1, 18));

        mobTF.setFont(new java.awt.Font("Andalus", 1, 18));

        cnameTF.setFont(new java.awt.Font("Andalus", 1, 18));

        gmailTF.setEditable(false);
        gmailTF.setFont(new java.awt.Font("Andalus", 1, 18));

        cageTF.setFont(new java.awt.Font("Andalus", 1, 18));

        update.setFont(new java.awt.Font("Andalus", 1, 20));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        passwordBTN.setFont(new java.awt.Font("Andalus", 1, 20));
        passwordBTN.setText("Change Password");
        passwordBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordBTNActionPerformed(evt);
            }
        });

        Exit.setFont(new java.awt.Font("Tahoma", 1, 20));
        Exit.setText("CLOSE");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/train_snow_winter_painting_canvas_smoke_99131_1024x768.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(cageTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(update))
                    .addComponent(passwordBTN)))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addComponent(mobTF, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(29, 29, 29)
                .addComponent(gmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(back_main))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(Exit))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(sexTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(cnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(cageTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(update)
                        .addGap(19, 19, 19)
                        .addComponent(passwordBTN)))
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(mobTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(gmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(back_main))
            .addGroup(layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(Exit))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(sexTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(cnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_mainActionPerformed
new PageMain().setVisible(true);
}//GEN-LAST:event_back_mainActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
try{
  String login=accountLog.login;
  Class.forName("java.sql.Driver");
  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/railway","root","tiger");
  Statement stment = conn.createStatement();
  String name = cnameTF.getText();
  int cage = Integer.parseInt(cageTF.getText());
  String csex = sexTF.getText();
  long mob =Long.parseLong(mobTF.getText());
  String qry="update custom_details set name='"+name+"',age="+cage+
  ",sex='"+csex+"',mobile_no="+mob+" where login_id='"+login+"'";
  if(JOptionPane.showConfirmDialog(this,"Do you really want to make the changes")==0)
  {
   stment.executeUpdate(qry);
   JOptionPane.showMessageDialog(this,"Your profile has been updated successfully");
  }
  conn.close();
  stment.close();
 }
catch(Exception exp) {
  JOptionPane.showMessageDialog(this,"Error !! "+exp.getMessage());
 }
}//GEN-LAST:event_updateActionPerformed

    private void passwordBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordBTNActionPerformed
try{
 Class.forName("java.sql.Driver");
 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/railway","root","tiger");
 Statement stment = conn.createStatement();
 String passOld=JOptionPane.showInputDialog(this,"Enter Old Password");
 String gmail=gmailTF.getText();
 String qry="select * from custom_details where gmail_id='"+gmail+"'";
 ResultSet rs=stment.executeQuery(qry);
 if(rs.first()) {
   String pass=rs.getString("password");
   if(passOld.equals(pass)==true) {
   String newPassword=JOptionPane.showInputDialog(this,"Enter New Password");
   String qry1="update custom_details set password='"+newPassword+"' where gmail_id='"+gmail+"'";
   JOptionPane.showMessageDialog(this,"Your password has been changed successfully");
  stment.executeUpdate(qry1);
  }
 }
 conn.close();
 stment.close();
 rs.close();
 }
catch(Exception exp) {
  JOptionPane.showMessageDialog(null,"erorr!!!" +exp.getMessage());
 }
}//GEN-LAST:event_passwordBTNActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
System.exit(0);
}//GEN-LAST:event_ExitActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new my_profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton back_main;
    public static javax.swing.JTextField cageTF;
    public static javax.swing.JTextField cnameTF;
    public static javax.swing.JTextField gmailTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JTextField mobTF;
    private javax.swing.JButton passwordBTN;
    public static javax.swing.JTextField sexTF;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

}
