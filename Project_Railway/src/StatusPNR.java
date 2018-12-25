
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class StatusPNR extends javax.swing.JFrame {
public static int tno;
public static String pname;
public static int page;
public static String type;
public static String psex;
public static long mob;
public static String journey;
public static int sno;
public static int pnr;
public static String tname;
public static String source;
public static String destination;

    public StatusPNR() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        mobile = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        seatNo = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        classType = new javax.swing.JTextField();
        sexTF = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        pnrTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tnoTF = new javax.swing.JTextField();
        backMain = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        journeyDate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        departTime = new javax.swing.JTextField();
        fromTF = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        toTF = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        tnameTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PNR status\n");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Passenger Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel21.setText("Passenger Name");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel22.setText("Age");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel23.setText("Sex");

        name.setEditable(false);
        name.setFont(new java.awt.Font("Tahoma", 1, 18));

        age.setEditable(false);
        age.setFont(new java.awt.Font("Tahoma", 1, 18));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel24.setText("Mobile No.");

        mobile.setEditable(false);
        mobile.setFont(new java.awt.Font("Tahoma", 1, 18));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel32.setText("Seat No.");

        seatNo.setEditable(false);
        seatNo.setFont(new java.awt.Font("Tahoma", 1, 18));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel33.setText("Class");

        classType.setEditable(false);
        classType.setFont(new java.awt.Font("Tahoma", 1, 18));

        sexTF.setEditable(false);
        sexTF.setFont(new java.awt.Font("Andalus", 1, 18));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel23)
                        .addGap(137, 137, 137)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(sexTF, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel32))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seatNo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(classType, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel31.setText("PNR No.");

        pnrTF.setEditable(false);
        pnrTF.setFont(new java.awt.Font("Tahoma", 1, 18));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel2.setText("Train no.");

        tnoTF.setEditable(false);
        tnoTF.setFont(new java.awt.Font("Tahoma", 1, 18));
        tnoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnoTFActionPerformed(evt);
            }
        });

        backMain.setFont(new java.awt.Font("Andalus", 1, 18));
        backMain.setText("BACK TO MAIN MENU");
        backMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backMainActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 20));
        jLabel5.setText("Date of Journey:-");

        journeyDate.setEditable(false);
        journeyDate.setFont(new java.awt.Font("Andalus", 1, 18));

        jLabel8.setFont(new java.awt.Font("Andalus", 1, 16));
        jLabel8.setText("(yyyy-mm-dd)");

        jLabel10.setFont(new java.awt.Font("Andalus", 1, 20));
        jLabel10.setText(" Deptarture time");

        departTime.setEditable(false);
        departTime.setFont(new java.awt.Font("Andalus", 1, 18));

        fromTF.setEditable(false);
        fromTF.setFont(new java.awt.Font("Tahoma", 1, 18));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel27.setText("From Station");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel28.setText("To Station");

        toTF.setEditable(false);
        toTF.setFont(new java.awt.Font("Tahoma", 1, 18));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel26.setText("Train name");

        tnameTF.setEditable(false);
        tnameTF.setFont(new java.awt.Font("Tahoma", 1, 18));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(departTime, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                .addGap(435, 435, 435))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(404, 404, 404)
                                .addComponent(jLabel28)
                                .addGap(18, 18, 18)
                                .addComponent(toTF, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(304, 304, 304))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(19, 19, 19)
                        .addComponent(fromTF, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(journeyDate, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addContainerGap(218, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addGap(50, 50, 50)
                                .addComponent(pnrTF, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(19, 19, 19)
                                .addComponent(tnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(84, 84, 84)
                        .addComponent(backMain, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1041, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(pnrTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(tnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(tnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backMain, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(departTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(toTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel28)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel5)
                    .addComponent(journeyDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(50, 50, 50)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
try
 {
  Class.forName("java.sql.Driver");
  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/railway","root","tiger");
  Statement stment = conn.createStatement();
  pnr = Integer.parseInt(pnrTF.getText());            
  String sql1="select * from ac1passenger where pnr_no="+pnr;          
  ResultSet rs1=stment.executeQuery(sql1);            
  if(rs1.first())
    {
     pname = rs1.getString("passengerName");
     page = rs1.getInt("age");
     psex = rs1.getString("sex");
     mob  = rs1.getLong("mobno");
     tno=rs1.getInt("train_no");
     sno=rs1.getInt("seat_no");
     journey=rs1.getString("journey_date");
     type=rs1.getString("Class");
     name.setText(pname);
     age.setText(""+page);
     sexTF.setText(psex);
     mobile.setText(""+mob);
     tnoTF.setText(""+tno);
     seatNo.setText(""+sno);
     journeyDate.setText(journey);
     classType.setText(type);
     String sql5="select * from train_details where train_no="+tno;
     ResultSet rs5=stment.executeQuery(sql5);
     if(rs5.first())
       {
        tname=rs5.getString("train_name");
        source=rs5.getString("source");
        destination =rs5.getString("destination");
        String deptTime=rs5.getString("departure_time");
        tnameTF.setText(tname);
        fromTF.setText(source);
        toTF.setText(destination);
        departTime.setText(deptTime);
        rs5.close();
       }
     }
    String sql2="select * from ac2passenger where pnr_no="+pnr;
    ResultSet rs2=stment.executeQuery(sql2);
    if(rs2.first())
      {
       pname = rs2.getString("passengerName");
       page = rs2.getInt("age");
       psex = rs2.getString("sex");
       mob  = rs2.getLong("mobno");
       tno=rs2.getInt("train_no");
       sno=rs2.getInt("seat_no");
       journey=rs2.getString("journey_date");
       type=rs2.getString("Class");
       name.setText(pname);
       age.setText(""+page);
       sexTF.setText(psex);
       mobile.setText(""+mob);
       tnoTF.setText(""+tno);
       seatNo.setText(""+sno);
       journeyDate.setText(journey);
       classType.setText(type);
       String sql6="select * from train_details where train_no="+tno;
       ResultSet rs6=stment.executeQuery(sql6);
       if(rs6.first())
        {
         tname=rs6.getString("train_name");
         source=rs6.getString("source");
         destination =rs6.getString("destination");
         String deptTime=rs6.getString("departure_time");
         tnameTF.setText(tname);
         fromTF.setText(source);
         toTF.setText(destination);
         departTime.setText(deptTime);
         rs6.close();
        }
      }
     String sql3="select * from ac3passenger where pnr_no="+pnr;
     ResultSet rs3=stment.executeQuery(sql3);
     if(rs3.first())
      {
       pname = rs3.getString("passengerName");
       page = rs3.getInt("age");
       psex = rs3.getString("sex");
       mob  = rs3.getLong("mobno");
       tno=rs3.getInt("train_no");
       sno=rs3.getInt("seat_no");
       journey=rs3.getString("journey_date");
       type=rs3.getString("Class");
       name.setText(pname);
       age.setText(""+page);
       sexTF.setText(psex);
       mobile.setText(""+mob);
       tnoTF.setText(""+tno);
       seatNo.setText(""+sno);
       journeyDate.setText(journey);
       classType.setText(type);
       String sql7="select * from train_details where train_no="+tno;
       ResultSet rs7=stment.executeQuery(sql7);
       if(rs7.first())
        {
         tname=rs7.getString("train_name");
         source=rs7.getString("source");
         destination =rs7.getString("destination");
         String deptTime=rs7.getString("departure_time");
         tnameTF.setText(tname);
         fromTF.setText(source);
         toTF.setText(destination);
         departTime.setText(deptTime);
         rs7.close();
        }
      }
     String sql4="select * from slpassenger where pnr_no="+pnr;
     ResultSet rs4=stment.executeQuery(sql4);
     if(rs4.first()){
       pname = rs4.getString("passengerName");
       page = rs4.getInt("age");
       psex = rs4.getString("sex");
       mob  = rs4.getLong("mobno");
       tno=rs4.getInt("train_no");
       sno=rs4.getInt("seat_no");
       journey=rs4.getString("journey_date");
       type=rs4.getString("Class");
       name.setText(pname);
       age.setText(""+page);
       sexTF.setText(psex);
       mobile.setText(""+mob);
       tnoTF.setText(""+tno);
       seatNo.setText(""+sno);
       journeyDate.setText(journey);
       classType.setText(type);
       String sql8="select * from train_details where train_no="+tno;
       ResultSet rs8=stment.executeQuery(sql8);
       if(rs8.first())
        {
          tname=rs8.getString("train_name");
          source=rs8.getString("source");
          destination =rs8.getString("destination");
          String deptTime=rs8.getString("departure_time");
          tnameTF.setText(tname);
          fromTF.setText(source);
          toTF.setText(destination);
          departTime.setText(deptTime);
          rs8.close();
        }
     }
    conn.close();
    stment.close(); 
    rs1.close();
    rs2.close();
    rs3.close();
    rs4.close();                                  
  }
catch(Exception exp)
  {
   JOptionPane.showMessageDialog(null,"erorr!!" +exp.getMessage());
  }
    }//GEN-LAST:event_formWindowOpened

    private void tnoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnoTFActionPerformed
    }//GEN-LAST:event_tnoTFActionPerformed

    private void backMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backMainActionPerformed
this.dispose();
new PageMain().setVisible(true);
    }//GEN-LAST:event_backMainActionPerformed

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
            java.util.logging.Logger.getLogger(StatusPNR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatusPNR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatusPNR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatusPNR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StatusPNR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField age;
    private javax.swing.JButton backMain;
    public static javax.swing.JTextField classType;
    public static javax.swing.JTextField departTime;
    private javax.swing.JTextField fromTF;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JTextField journeyDate;
    public static javax.swing.JTextField mobile;
    public static javax.swing.JTextField name;
    public static javax.swing.JTextField pnrTF;
    public static javax.swing.JTextField seatNo;
    public static javax.swing.JTextField sexTF;
    private javax.swing.JTextField tnameTF;
    public static javax.swing.JTextField tnoTF;
    private javax.swing.JTextField toTF;
    // End of variables declaration//GEN-END:variables
}
