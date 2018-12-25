
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ticketBooking extends javax.swing.JFrame {
    public static String yr;
    public static String mon;
    public static String day;
    public static String journeyDate;
    
    public ticketBooking() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        yearCOMBO = new javax.swing.JComboBox();
        dayCOMBO = new javax.swing.JComboBox();
        condition = new javax.swing.JCheckBox();
        submit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        fromCOMBO = new javax.swing.JComboBox();
        toCOMBO = new javax.swing.JComboBox();
        monthCOMBO = new javax.swing.JComboBox();
        back = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        trainTABLE = new javax.swing.JTable();
        furtherDetails = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Start Booking");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setText("FROM");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel2.setText("TO");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel3.setText("Date of journey");

        yearCOMBO.setFont(new java.awt.Font("Tahoma", 1, 18));
        yearCOMBO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2016", "2017", "2018", "2019", "2020" }));

        dayCOMBO.setFont(new java.awt.Font("Tahoma", 1, 18));
        dayCOMBO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        condition.setFont(new java.awt.Font("Tahoma", 1, 14));
        condition.setText("I am agree with all terms and conditions");
        condition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conditionActionPerformed(evt);
            }
        });

        submit.setFont(new java.awt.Font("Tahoma", 1, 24));
        submit.setText("Submit");
        submit.setEnabled(false);
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Tahoma", 1, 24));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jRadioButton1.setText("e-ticket");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel4.setText("Ticket type");

        fromCOMBO.setFont(new java.awt.Font("Tahoma", 1, 18));
        fromCOMBO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "New Delhi-NDLS", "Hyderabad Decan-HYB", "Ahmedabad-ADI" }));

        toCOMBO.setFont(new java.awt.Font("Tahoma", 1, 18));
        toCOMBO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "New Delhi-NDLS", "Lucknow-LKN", "Hyderabad Decan-HYB", "Ahmedabad-ADI" }));

        monthCOMBO.setFont(new java.awt.Font("Tahoma", 1, 18));
        monthCOMBO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(submit)
                        .addGap(50, 50, 50)
                        .addComponent(reset))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fromCOMBO, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(toCOMBO, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(yearCOMBO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(monthCOMBO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(dayCOMBO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(70, 70, 70)
                                .addComponent(jRadioButton1))
                            .addComponent(condition, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fromCOMBO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(toCOMBO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearCOMBO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayCOMBO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(monthCOMBO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(condition)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        back.setFont(new java.awt.Font("Tahoma", 1, 18));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        trainTABLE.setFont(new java.awt.Font("Tahoma", 1, 12));
        trainTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Train no.", "Train name              ", "From", "Depart time", "To", "Arrival time", "Distt.(Km)", "Journey Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(trainTABLE);

        furtherDetails.setFont(new java.awt.Font("Tahoma", 1, 24));
        furtherDetails.setText("Further Details ");
        furtherDetails.setEnabled(false);
        furtherDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                furtherDetailsActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Indian-Railway-Logo.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(furtherDetails))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(back)))
                .addGap(16, 16, 16)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(furtherDetails)
                        .addGap(27, 27, 27)
                        .addComponent(back))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
DefaultTableModel dtm1 = (DefaultTableModel)trainTABLE.getModel();
try
 {
  String from = (String)fromCOMBO.getSelectedItem();
  String to = (String)toCOMBO.getSelectedItem();
  Class.forName("java.sql.Driver");
  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/railway","root","tiger");
  Statement stment = conn.createStatement();
  String sql = "select * from train_details where source = '"+from+"'&& destination = '"+to+"'";
  ResultSet rs = stment.executeQuery(sql);
   {//To wipe the previous data
   int r = dtm1.getRowCount();
   for (int i = 0;i<r;++i )
   dtm1.removeRow(0);
   }
  while(rs.next())
   {
    int tno = rs.getInt("Train_no");
    String tname = rs.getString("Train_name");
    String deptTime = rs.getString("departure_time");
    String arriveTime = rs.getString("arrival_time");
    double dist = rs.getDouble("distance_km");
    String journey=rs.getString("journey_time");
    Object ob1[] = {tno,tname,from,deptTime,to,arriveTime,dist,journey};
    dtm1.addRow(ob1);
   }
  furtherDetails.setEnabled(true);
  conn.close();
  stment.close();
  rs.close();
 }
catch(Exception exp)
 {
  JOptionPane.showMessageDialog(null,"erorr!!!" +exp.getMessage());
 } 
    }//GEN-LAST:event_submitActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
submit.setEnabled(false);
condition.setSelected(false);
furtherDetails.setEnabled(false);
fromCOMBO.setSelectedItem("New Delhi-NLDS");
toCOMBO.setSelectedItem("New Delhi-NLDS");
    }//GEN-LAST:event_resetActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
this.dispose();
new PageMain().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void furtherDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_furtherDetailsActionPerformed
JourneyDetail journey=new JourneyDetail();
yr=(String)yearCOMBO.getSelectedItem();
mon=(String)monthCOMBO.getSelectedItem();
day=(String)dayCOMBO.getSelectedItem();
int mon_no;
    if(mon.equalsIgnoreCase("jan"))
      mon_no=01;
    else if(mon.equalsIgnoreCase("feb"))
      mon_no=02;
    else if(mon.equalsIgnoreCase("march"))
      mon_no=03;
    else if(mon.equalsIgnoreCase("april"))
      mon_no=04;
    else if(mon.equalsIgnoreCase("may"))
      mon_no=05;
    else if(mon.equalsIgnoreCase("june"))
      mon_no=06;
    else if(mon.equalsIgnoreCase("july"))
      mon_no=07;
    else if(mon.equalsIgnoreCase("aug"))
      mon_no =8;
    else if(mon.equalsIgnoreCase("sept"))
      mon_no=9;
    else if(mon.equalsIgnoreCase("oct"))
      mon_no=10;
    else if(mon.equalsIgnoreCase("nov"))
      mon_no=11;
    else
      mon_no=12;
    journeyDate=yr+"-"+mon_no+"-"+day;
JourneyDetail.dateJourney.setText(ticketBooking.journeyDate);
journey.setVisible(true);
}//GEN-LAST:event_furtherDetailsActionPerformed

    private void conditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conditionActionPerformed
submit.setEnabled(true);
}//GEN-LAST:event_conditionActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ticketBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JCheckBox condition;
    public static javax.swing.JComboBox dayCOMBO;
    private javax.swing.JComboBox fromCOMBO;
    private javax.swing.JButton furtherDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JComboBox monthCOMBO;
    private javax.swing.JButton reset;
    private javax.swing.JButton submit;
    private javax.swing.JComboBox toCOMBO;
    private javax.swing.JTable trainTABLE;
    public static javax.swing.JComboBox yearCOMBO;
    // End of variables declaration//GEN-END:variables
}
