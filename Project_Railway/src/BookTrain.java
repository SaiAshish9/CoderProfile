
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BookTrain extends javax.swing.JFrame {
static int tno;
public static String cls;
public static double totalFare;
public static String deptTime;

    public BookTrain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        trainDTL = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tnoTF = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        fareTBL = new javax.swing.JTable();
        BookNOW = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pnrTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        typeClass = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        trainDTL.setFont(new java.awt.Font("Tahoma", 1, 15));
        trainDTL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Train no.", "Train name       ", "From                ", "Depart time", "To", "Arrive time", "Distance(km.)", "Journey Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        trainDTL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trainDTLMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(trainDTL);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setText("PNR number");

        tnoTF.setEditable(false);
        tnoTF.setFont(new java.awt.Font("Tahoma", 1, 18));
        tnoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnoTFActionPerformed(evt);
            }
        });

        fareTBL.setFont(new java.awt.Font("Tahoma", 1, 18));
        fareTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Base Fare", "Reservation fare", "Service Tax", "Total fare"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(fareTBL);

        BookNOW.setFont(new java.awt.Font("Tahoma", 1, 18));
        BookNOW.setText("Book now");
        BookNOW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookNOWActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Tahoma", 1, 18));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel2.setText("Train no.");

        pnrTF.setEditable(false);
        pnrTF.setFont(new java.awt.Font("Tahoma", 1, 18));
        pnrTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnrTFActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel3.setText("    CLASS");

        typeClass.setEditable(false);
        typeClass.setFont(new java.awt.Font("Tahoma", 1, 18));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(typeClass, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(back)
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BookNOW)
                        .addGap(99, 99, 99))))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(tnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(pnrTF, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(346, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1147, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(pnrTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(tnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BookNOW, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeClass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void trainDTLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trainDTLMouseClicked
}//GEN-LAST:event_trainDTLMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
DefaultTableModel dtm1 = (DefaultTableModel)trainDTL.getModel();
DefaultTableModel dtm2 = (DefaultTableModel)fareTBL.getModel();
try
{
Class.forName("java.sql.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/railway","root","tiger");
Statement stment = conn.createStatement();
tno = Integer.parseInt(tnoTF.getText());
String sql = "select * from train_details where train_no="+tno;
ResultSet rs = stment.executeQuery(sql);
{//To wipe the previous data
    int r = dtm1.getRowCount();
    for (int i = 0;i<r;++i )
        dtm1.removeRow(0);
}
if(rs.first())
{
    String from = rs.getString("source");
    String to = rs.getString("destination");
    String tname = rs.getString("Train_name");
    deptTime = rs.getString("departure_time");
   String arriveTime = rs.getString("arrival_time");
   double dist = rs.getDouble("distance_km");
   String journey=rs.getString("journey_time");
    Object ob1[] = {tno,tname,from,deptTime,to,arriveTime,dist,journey};
    dtm1.addRow(ob1);
    {//To wipe the previous data
    int r = dtm2.getRowCount();
    for (int i = 0;i<r;++i )
        dtm2.removeRow(0);
    }
double baseFare = rs.getDouble("base_fare");
int serviceTAX = (int) (0.10*baseFare);
double reservationFare = 0;
cls=typeClass.getText();
if(cls.equalsIgnoreCase("sl"))
    reservationFare=180;
else if(cls.equalsIgnoreCase("ac1"))
    reservationFare=800;
else if(cls.equalsIgnoreCase("ac2"))
    reservationFare=600;
else if(cls.equalsIgnoreCase("ac3"))
    reservationFare=350;
totalFare =reservationFare+baseFare+serviceTAX;
Object obj1[] = {baseFare,reservationFare,serviceTAX,totalFare};
dtm2.addRow(obj1);
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

    private void tnoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnoTFActionPerformed
    }//GEN-LAST:event_tnoTFActionPerformed

    private void BookNOWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookNOWActionPerformed
JOptionPane.showMessageDialog(null,"Your ticket has been Confirmed..Thanks for using "
  +"e-Ticket software."+"\n"+"    Print your ticket from options in main page");
new PageMain().setVisible(true);
    }//GEN-LAST:event_BookNOWActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
this.dispose();
new ticketBooking().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void pnrTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnrTFActionPerformed
    }//GEN-LAST:event_pnrTFActionPerformed

  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new BookTrain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookNOW;
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTable fareTBL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTextField pnrTF;
    public static javax.swing.JTextField tnoTF;
    private javax.swing.JTable trainDTL;
    public static javax.swing.JTextField typeClass;
    // End of variables declaration//GEN-END:variables

}
