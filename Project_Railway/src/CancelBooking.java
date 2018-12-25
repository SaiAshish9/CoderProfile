
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CancelBooking extends javax.swing.JFrame {
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
public static int seats;
   
    public CancelBooking() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cancel = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        pnameTF = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        mobile = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        seatNo = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        classType = new javax.swing.JTextField();
        sexTF = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        tnameTF = new javax.swing.JTextField();
        toTF = new javax.swing.JTextField();
        fromTF = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        pnrTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        tnoTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        departTime = new javax.swing.JTextField();
        journeyDate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cancel Booking");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Andalus", 1, 18));
        cancel.setText("Cancel Ticket");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Andalus", 1, 18));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Passenger Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        jPanel4.setOpaque(false);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 17));
        jLabel21.setText("Passenger Name");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 17));
        jLabel22.setText("Age");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 17));
        jLabel23.setText("Sex");

        pnameTF.setEditable(false);
        pnameTF.setFont(new java.awt.Font("Andalus", 1, 17));

        age.setEditable(false);
        age.setFont(new java.awt.Font("Andalus", 1, 17));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 17));
        jLabel24.setText("Mobile No.");

        mobile.setEditable(false);
        mobile.setFont(new java.awt.Font("Andalus", 1, 17));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 17));
        jLabel32.setText("Seat No.");

        seatNo.setEditable(false);
        seatNo.setFont(new java.awt.Font("Andalus", 1, 17));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 17));
        jLabel33.setText("Class");

        classType.setEditable(false);
        classType.setFont(new java.awt.Font("Andalus", 1, 17));

        sexTF.setEditable(false);
        sexTF.setFont(new java.awt.Font("Andalus", 1, 17));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel21)
                        .addGap(49, 49, 49))
                    .addComponent(pnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel23))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(sexTF, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel32))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(seatNo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(classType, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Journey Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel5.setOpaque(false);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel26.setText("Train name");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel27.setText("From Station");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel28.setText("To Station");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel29.setText("Journey Date");

        tnameTF.setEditable(false);
        tnameTF.setFont(new java.awt.Font("Andalus", 1, 19));

        toTF.setEditable(false);
        toTF.setFont(new java.awt.Font("Andalus", 1, 19));

        fromTF.setEditable(false);
        fromTF.setFont(new java.awt.Font("Andalus", 1, 19));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel30.setText("Enter PNR number");

        pnrTF.setEditable(false);
        pnrTF.setFont(new java.awt.Font("Andalus", 1, 19));
        pnrTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnrTFpnrTFActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Andalus", 1, 16));
        jLabel8.setText("(yyyy-mm-dd)");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel25.setText("Train no.");

        tnoTF.setEditable(false);
        tnoTF.setFont(new java.awt.Font("Andalus", 1, 19));

        jLabel10.setFont(new java.awt.Font("Andalus", 1, 20));
        jLabel10.setText(" Deptarture time");

        departTime.setEditable(false);
        departTime.setFont(new java.awt.Font("Andalus", 1, 19));

        journeyDate.setEditable(false);
        journeyDate.setFont(new java.awt.Font("Andalus", 1, 19));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(departTime, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(25, 25, 25)
                        .addComponent(pnrTF, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel26))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tnameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                            .addComponent(fromTF, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE))))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(jLabel29)
                            .addGap(18, 18, 18)
                            .addComponent(journeyDate, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel8)
                            .addGap(28, 28, 28))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                            .addComponent(jLabel28)
                            .addGap(18, 18, 18)
                            .addComponent(toTF, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel25)
                        .addGap(31, 31, 31)
                        .addComponent(tnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(pnrTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(tnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(journeyDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fromTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(departTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(toTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel28)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/12.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(cancel)
                .addGap(327, 327, 327)
                .addComponent(back))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(back))))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
new PageMain().setVisible(true);
this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
try{
    Class.forName("java.sql.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/railway","root","tiger");
    Statement stment = conn.createStatement();
    pnr = Integer.parseInt(pnrTF.getText());
    type=classType.getText();
    String sql1="delete from "+type+"passenger where pnr_no="+pnr;
    int response = JOptionPane.showConfirmDialog(this,"Do you really want to cancel the confirmed Ticket....");
    if(response==0)  {
      stment.executeUpdate(sql1);
      JOptionPane.showMessageDialog(this,"Your ticket has been cancelled.");
      String qry1="select * from class_seats where train_no="+tno;
      ResultSet rs = stment.executeQuery(qry1);
      if(rs.first()) {
       seats= rs.getInt(type+"_class");
       int seatsRemain=seats+1;
       String query1="update class_seats set "+type+"_class ="+seatsRemain+" where train_no="+tno;
       stment.executeUpdate(query1);
       }
      }
    else 
      System.exit(0);
    conn.close();
    stment.close();            
 }
catch(Exception exp)
 {
   JOptionPane.showMessageDialog(null,"erorr!!!" +exp.getMessage());
 }
    }//GEN-LAST:event_cancelActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
try {
    Class.forName("java.sql.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/railway","root","tiger");
    Statement stment = conn.createStatement();
    pnr = Integer.parseInt(JOptionPane.showInputDialog("Enter PNR no. to cancel ticket.... "));            
    String sql1="select * from ac1passenger where pnr_no="+pnr;
    ResultSet rs1=stment.executeQuery(sql1);
    if(rs1.first())
    {
     pnrTF.setText(""+pnr);
     pname = rs1.getString("passengerName");
     page = rs1.getInt("age");
     psex = rs1.getString("sex");
     mob  = rs1.getLong("mobno");
     tno=rs1.getInt("train_no");
     sno=rs1.getInt("seat_no");
     journey=rs1.getString("journey_date");
     type=rs1.getString("Class");
     pnameTF.setText(pname);
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
        pnrTF.setText(""+pnr);
        pname = rs2.getString("passengerName");
        page = rs2.getInt("age");
        psex = rs2.getString("sex");
        mob  = rs2.getLong("mobno");
        tno=rs2.getInt("train_no");
        sno=rs2.getInt("seat_no");
        journey=rs2.getString("journey_date");
        type=rs2.getString("Class");
        pnameTF.setText(pname);
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
         pnrTF.setText(""+pnr);
         pname = rs3.getString("passengerName");
         page = rs3.getInt("age");
         psex = rs3.getString("sex");
         mob  = rs3.getLong("mobno");
         tno=rs3.getInt("train_no");
         sno=rs3.getInt("seat_no");
         journey=rs3.getString("journey_date");
         type=rs3.getString("Class");
         pnameTF.setText(pname);
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
       if(rs4.first())
        {
         pnrTF.setText(""+pnr);
         pname = rs4.getString("passengerName");
         page = rs4.getInt("age");
         psex = rs4.getString("sex");
         mob  = rs4.getLong("mobno");
         tno=rs4.getInt("train_no");
         sno=rs4.getInt("seat_no");
         journey=rs4.getString("journey_date");
         type=rs4.getString("Class");
         pnameTF.setText(pname);
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
    JOptionPane.showMessageDialog(null,"erorr!!!" +exp.getMessage());
 }
    }//GEN-LAST:event_formWindowOpened

    private void pnrTFpnrTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnrTFpnrTFActionPerformed

}//GEN-LAST:event_pnrTFpnrTFActionPerformed

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
            java.util.logging.Logger.getLogger(CancelBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancelBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancelBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancelBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CancelBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JButton back;
    private javax.swing.JButton cancel;
    public static javax.swing.JTextField classType;
    public static javax.swing.JTextField departTime;
    private javax.swing.JTextField fromTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField journeyDate;
    public static javax.swing.JTextField mobile;
    private javax.swing.JTextField pnameTF;
    public static javax.swing.JTextField pnrTF;
    public static javax.swing.JTextField seatNo;
    private javax.swing.JTextField sexTF;
    private javax.swing.JTextField tnameTF;
    public static javax.swing.JTextField tnoTF;
    private javax.swing.JTextField toTF;
    // End of variables declaration//GEN-END:variables
}
