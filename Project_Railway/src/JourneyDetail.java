
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class JourneyDetail extends javax.swing.JFrame {
public static String yr;
public static String mon;
public static String day;
public static String trainClass;
public static String journey;
public static int page;
public static String pname;
public static String psex;
public static int tno;
public static int pnr;
public static String from;
public static String to;
public static String tname;
public static long mobno;
public static int sno;
public static int seatsRemain;
   
    public JourneyDetail() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        reset = new javax.swing.JButton();
        next = new javax.swing.JButton();
        save = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        mobile = new javax.swing.JTextField();
        sex = new javax.swing.JComboBox();
        jLabel31 = new javax.swing.JLabel();
        seatNo = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        tnoTF = new javax.swing.JTextField();
        tnameTF = new javax.swing.JTextField();
        toTF = new javax.swing.JTextField();
        fromTF = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        pnrTF = new javax.swing.JTextField();
        dateJourney = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        seats = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SELECTclass = new javax.swing.JPanel();
        ac1 = new javax.swing.JRadioButton();
        ac2 = new javax.swing.JRadioButton();
        ac3 = new javax.swing.JRadioButton();
        sl = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Passenger Details Entry");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        reset.setFont(new java.awt.Font("Tahoma", 0, 18));
        reset.setText("Reset Passenger Deatils");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        next.setFont(new java.awt.Font("Tahoma", 1, 18));
        next.setText("Next");
        next.setEnabled(false);
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        save.setFont(new java.awt.Font("Tahoma", 1, 18));
        save.setText("Save Journey Details");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Passenger Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel21.setText("Passenger Name");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel22.setText("Age");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel23.setText("Sex");

        name.setFont(new java.awt.Font("Tahoma", 1, 18));

        age.setFont(new java.awt.Font("Tahoma", 1, 18));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel24.setText("Mobile No.");

        mobile.setFont(new java.awt.Font("Tahoma", 1, 18));

        sex.setFont(new java.awt.Font("Tahoma", 1, 14));
        sex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Other" }));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel31.setText("Seat No.");

        seatNo.setEditable(false);
        seatNo.setFont(new java.awt.Font("Tahoma", 1, 18));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel21)))
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel23)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(jLabel31)
                        .addGap(52, 52, 52))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(seatNo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel21))
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Journey Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel25.setText("Train no.");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel26.setText("Train name");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel27.setText("From Station");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel28.setText("To Station");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel29.setText("Journey Date");

        tnoTF.setEditable(false);
        tnoTF.setFont(new java.awt.Font("Tahoma", 1, 18));

        tnameTF.setEditable(false);
        tnameTF.setFont(new java.awt.Font("Tahoma", 1, 18));

        toTF.setEditable(false);
        toTF.setFont(new java.awt.Font("Tahoma", 1, 18));

        fromTF.setEditable(false);
        fromTF.setFont(new java.awt.Font("Tahoma", 1, 18));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel30.setText("PNR number");

        pnrTF.setEditable(false);
        pnrTF.setFont(new java.awt.Font("Tahoma", 1, 18));
        pnrTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnrTFpnrTFActionPerformed(evt);
            }
        });

        dateJourney.setEditable(false);
        dateJourney.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Andalus", 1, 16)); // NOI18N
        jLabel1.setText("(yyyy-mm-dd)");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel25))
                    .addComponent(jLabel26)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel27)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(tnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(jLabel28))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tnameTF)
                            .addComponent(fromTF, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30))))
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnrTF, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(toTF, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(dateJourney, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel25)
                    .addComponent(tnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(dateJourney, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(pnrTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        back.setFont(new java.awt.Font("Tahoma", 1, 18));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        seats.setFont(new java.awt.Font("Tahoma", 0, 16));
        seats.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16));
        jLabel3.setText("  AVAILABLE SEATS");

        SELECTclass.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Class", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N

        buttonGroup1.add(ac1);
        ac1.setFont(new java.awt.Font("Tahoma", 1, 17));
        ac1.setText("AC1");
        ac1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ac1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(ac2);
        ac2.setFont(new java.awt.Font("Tahoma", 1, 17));
        ac2.setText("AC2");
        ac2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ac2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(ac3);
        ac3.setFont(new java.awt.Font("Tahoma", 1, 17));
        ac3.setText("AC3");
        ac3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ac3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(sl);
        sl.setFont(new java.awt.Font("Tahoma", 1, 17));
        sl.setText("SL");
        sl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SELECTclassLayout = new javax.swing.GroupLayout(SELECTclass);
        SELECTclass.setLayout(SELECTclassLayout);
        SELECTclassLayout.setHorizontalGroup(
            SELECTclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SELECTclassLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(sl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(ac1)
                .addGap(18, 18, 18)
                .addComponent(ac2)
                .addGap(18, 18, 18)
                .addComponent(ac3)
                .addGap(38, 38, 38))
        );
        SELECTclassLayout.setVerticalGroup(
            SELECTclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SELECTclassLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(SELECTclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ac1)
                    .addComponent(ac2)
                    .addComponent(sl)
                    .addComponent(ac3)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(back))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(reset)
                                    .addComponent(save)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(next))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(seats, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(SELECTclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(save)
                        .addGap(30, 30, 30)
                        .addComponent(next)
                        .addGap(51, 51, 51)
                        .addComponent(reset)
                        .addGap(26, 26, 26)
                        .addComponent(back)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seats, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(SELECTclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
name.setText("");
age.setText("");
mobile.setText("");
seatNo.setText("");
pnrTF.setText("");
sl.setSelected(true);
    }//GEN-LAST:event_resetActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
BookTrain bt1 = new BookTrain();
BookTrain.tnoTF.setText(JourneyDetail.tnoTF.getText());
BookTrain.pnrTF.setText(JourneyDetail.pnrTF.getText());
BookTrain.typeClass.setText(JourneyDetail.trainClass);
bt1.setVisible(true);
    }//GEN-LAST:event_nextActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
try{
    Class.forName("java.sql.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/railway","root","tiger");
    Statement stment = conn.createStatement();
    pname = name.getText();
    page = Integer.parseInt(age.getText());
    psex = (String)JourneyDetail.sex.getSelectedItem();
    mobno = Long.parseLong(mobile.getText());
    tno = Integer.parseInt(tnoTF.getText());
    from=fromTF.getText();
    to=toTF.getText();
    tname=tnameTF.getText();
    journey=dateJourney.getText();
    int slseats,ac1seats,ac2seats,ac3seats;
    if(sl.isSelected()==true)
      {
        trainClass="sl";
        String sql1="select * from slpassenger order by seat_no";        
        ResultSet rs1=stment.executeQuery(sql1);
        if(rs1.last())
          {
            sno=rs1.getInt("seat_no");
            sno+=1;
          }
        else
          sno=1;
        String qry1="select * from class_seats where train_no="+tno;
        ResultSet rs = stment.executeQuery(qry1);
        if(rs.first()) {
        slseats= rs.getInt("sl_class");
        seatsRemain=slseats-1;
        String query1="update class_seats set "+trainClass+"_class ="+seatsRemain+" where train_no="+tno;
        stment.executeUpdate(query1);
        rs1.close();
        rs.close();
      }
    }
    else if(ac1.isSelected()==true)
      {
        trainClass="ac1";
        String sql2="select * from ac1passenger order by seat_no";
        String qry2="select * from class_seats where train_no="+tno;
        ResultSet rs2=stment.executeQuery(sql2);
        if(rs2.last())
          {
            sno=rs2.getInt("seat_no");
            sno+=1;
          }
        else
          sno=1;
        ResultSet rs5 = stment.executeQuery(qry2);
        if(rs5.first()) {
        ac1seats= rs5.getInt("ac1_class");
        seatsRemain=ac1seats-1;
        String query2="update class_seats set "+trainClass+"_class ="+seatsRemain+" where train_no="+tno;
        stment.executeUpdate(query2);
        rs2.close();
        rs5.close();
      }
    }
    else if(ac2.isSelected()==true)
      {
        trainClass="ac2";
        String sql3="select * from ac2passenger order by seat_no";
        String qry3="select * from class_seats where train_no="+tno;
        ResultSet rs3=stment.executeQuery(sql3);
        if(rs3.last())
          {
            sno=rs3.getInt("seat_no");
            sno+=1;
          }
        else
          sno=1;
        ResultSet rs6 = stment.executeQuery(qry3);
        if(rs6.first()) {
        ac2seats= rs6.getInt("ac2_class");
        seatsRemain=ac2seats-1;
        String query3="update class_seats set "+trainClass+"_class ="+seatsRemain+" where train_no="+tno;
        stment.executeUpdate(query3);
        rs3.close();
        rs6.close();
       }
    }
    else
      {
        trainClass="ac3";
        String sql4="select * from ac3passenger order by seat_no";
        String qry4="select * from class_seats where train_no="+tno;
        ResultSet rs4=stment.executeQuery(sql4);
        if(rs4.last())
          {
            sno=rs4.getInt("seat_no");
            sno+=1;
          }
        else
          sno=1;
        ResultSet rs7 = stment.executeQuery(qry4);
        if(rs7.first()) {
        ac3seats= rs7.getInt("ac3_class");
        seatsRemain=ac3seats-1;
        String query4="update class_seats set "+trainClass+"_class ="+seatsRemain+" where train_no="+tno;
        stment.executeUpdate(query4);
        rs4.close();
        rs7.close();
      }
    }
    pnr = (int) (page+mobno);
    int mess = JOptionPane.showConfirmDialog(null,"your PNR no. is "+pnr);
    if(mess==0)
      {
        if(seatsRemain>0){
        String sql = "insert into "+trainClass+"passenger values('"+pname+"',"+page+",'"+psex+"',"+mobno+","+tno+","+pnr+","+sno+",'"+trainClass+"','"+journey+"')";
        stment.executeUpdate(sql);
        pnrTF.setText(""+pnr);
        seatNo.setText(""+sno);
        JOptionPane.showMessageDialog(this,"Details Added successfully");
        next.setEnabled(true);
        }
        else
            JOptionPane.showMessageDialog(this,"No seats Available");
      }
   conn.close();
   stment.close();
}
catch(Exception exp){
    JOptionPane.showMessageDialog(null,"error!!!" +exp.getMessage());
}
    }//GEN-LAST:event_saveActionPerformed

    private void pnrTFpnrTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnrTFpnrTFActionPerformed
    }//GEN-LAST:event_pnrTFpnrTFActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
this.dispose();
new ticketBooking().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
try
{
Class.forName("java.sql.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/railway","root","tiger");
Statement stment = conn.createStatement();
tno = Integer.parseInt(JOptionPane.showInputDialog("Enter train to book for..........."));
tnoTF.setText(""+tno);
String sql = "select * from train_details where train_no="+tno;
ResultSet rs = stment.executeQuery(sql);
if(rs.first())
{
    from = rs.getString("source");
    to = rs.getString("destination");
    tname = rs.getString("Train_name");
    tnameTF.setText(tname);
    toTF.setText(to);
    fromTF.setText(from);
}

conn.close();
stment.close();
rs.close();
}
catch(Exception exp)
{
    JOptionPane.showMessageDialog(null,"erorr!!!" +exp.getMessage());
}
    }//GEN-LAST:event_formWindowOpened

    private void ac1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ac1ActionPerformed
try{
     Class.forName("java.sql.Driver");
     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/railway","root","tiger");
     Statement stment = conn.createStatement();
     tno = Integer.parseInt(tnoTF.getText());
     String qry = "Select * from class_seats where train_no ="+tno;
     ResultSet rs = stment.executeQuery(qry);
     if(rs.first()) {
       int seatsAc1= rs.getInt("ac1_class");
       seats.setText(""+seatsAc1);
      }
     conn.close();
     stment.close();
     rs.close();
  }
catch(Exception exp) {
     JOptionPane.showMessageDialog(null,"erorr!!!" +exp.getMessage());
  }
}//GEN-LAST:event_ac1ActionPerformed

    private void ac2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ac2ActionPerformed
try {
  Class.forName("java.sql.Driver");
  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/railway","root","tiger");
  Statement stment = conn.createStatement();
  tno = Integer.parseInt(tnoTF.getText());
  String qry = "Select * from class_seats where train_no ="+tno;
  ResultSet rs = stment.executeQuery(qry);
  if(rs.first()) {
    int seatsAc2= rs.getInt("ac2_class");
    seats.setText(""+seatsAc2);
   }

  conn.close();
  stment.close();
  rs.close();
   }
catch(Exception exp) {
  JOptionPane.showMessageDialog(null,"erorr!!!" +exp.getMessage());
   }
}//GEN-LAST:event_ac2ActionPerformed

    private void ac3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ac3ActionPerformed
try {
   Class.forName("java.sql.Driver");
   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/railway","root","tiger");
   Statement stment = conn.createStatement();
   tno = Integer.parseInt(tnoTF.getText());
   String qry = "Select * from class_seats where train_no ="+tno;
   ResultSet rs = stment.executeQuery(qry);
   if(rs.first()) {
     int seatsAc3= rs.getInt("ac3_class");
     seats.setText(""+seatsAc3);
    }
   conn.close();
   stment.close();
   rs.close();
   }
catch(Exception exp) {
   JOptionPane.showMessageDialog(null,"erorr!!!" +exp.getMessage());
   }
}//GEN-LAST:event_ac3ActionPerformed

    private void slActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slActionPerformed
try {
   Class.forName("java.sql.Driver");
   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/railway","root","tiger");
   Statement stment = conn.createStatement();
   tno = Integer.parseInt(tnoTF.getText());
   String qry = "Select * from class_seats where train_no ="+tno;
   ResultSet rs = stment.executeQuery(qry);
   if(rs.first()) {
     int seatsSL= rs.getInt("sl_class");
     seats.setText(""+seatsSL);
    }
   conn.close();
   stment.close();
   rs.close();
   }
catch(Exception exp) {
   JOptionPane.showMessageDialog(null,"erorr!!!" +exp.getMessage());
   }
}//GEN-LAST:event_slActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JourneyDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SELECTclass;
    private javax.swing.JRadioButton ac1;
    private javax.swing.JRadioButton ac2;
    private javax.swing.JRadioButton ac3;
    public static javax.swing.JTextField age;
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JTextField dateJourney;
    public static javax.swing.JTextField fromTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public static javax.swing.JTextField mobile;
    public static javax.swing.JTextField name;
    private javax.swing.JButton next;
    public static javax.swing.JTextField pnrTF;
    private javax.swing.JButton reset;
    private javax.swing.JButton save;
    public static javax.swing.JTextField seatNo;
    private javax.swing.JLabel seats;
    public static javax.swing.JComboBox sex;
    private javax.swing.JRadioButton sl;
    public static javax.swing.JTextField tnameTF;
    public static javax.swing.JTextField tnoTF;
    public static javax.swing.JTextField toTF;
    // End of variables declaration//GEN-END:variables
}
