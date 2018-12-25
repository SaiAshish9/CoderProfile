
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class passengerList extends javax.swing.JFrame {

    public passengerList() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tnoTF = new javax.swing.JTextField();
        dateTF = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        passengerTBL = new javax.swing.JTable();
        classCombo = new javax.swing.JComboBox();
        displayBTN = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Passenger List");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Andalus", 1, 24));
        jLabel1.setForeground(new java.awt.Color(0, 255, 204));
        jLabel1.setText("Train No.");

        jLabel2.setFont(new java.awt.Font("Andalus", 1, 24));
        jLabel2.setForeground(new java.awt.Color(0, 255, 204));
        jLabel2.setText("Date(yyyy-mm-dd)");

        jLabel3.setFont(new java.awt.Font("Andalus", 1, 24));
        jLabel3.setForeground(new java.awt.Color(0, 255, 204));
        jLabel3.setText("Class");

        tnoTF.setEditable(false);
        tnoTF.setFont(new java.awt.Font("Comic Sans MS", 1, 18));

        dateTF.setEditable(false);
        dateTF.setFont(new java.awt.Font("Comic Sans MS", 1, 18));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Passenger List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Andalus", 1, 18))); // NOI18N

        passengerTBL.setFont(new java.awt.Font("Andalus", 1, 18));
        passengerTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PNR No. ", "Passenger Name", "Age", "Sex", "Seat No."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(passengerTBL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        classCombo.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        classCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "sl", "ac1", "ac2", "ac3" }));

        displayBTN.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        displayBTN.setText("Display");
        displayBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBTNActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Tahoma", 1, 18));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/train_motion_nature_fall_91415_1024x768.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(tnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290)
                .addComponent(displayBTN))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(classCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(dateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(720, 720, 720)
                .addComponent(back))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(displayBTN))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(classCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(dateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(back))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
int tno=Integer.parseInt(JOptionPane.showInputDialog(this,"Enter train no."));
String date=JOptionPane.showInputDialog(this,"Enter date (yyyy-mm-dd)");
tnoTF.setText(""+tno);
dateTF.setText(date);
    }//GEN-LAST:event_formWindowOpened

    private void displayBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBTNActionPerformed
DefaultTableModel dtm1 = (DefaultTableModel)passengerTBL.getModel();
try
{
    int tno=Integer.parseInt(tnoTF.getText());
    String date=dateTF.getText();
    String classType=(String)classCombo.getSelectedItem();
    Class.forName("java.sql.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/railway","root","tiger");
    Statement stment = conn.createStatement();
    String sql="select * from "+classType+"passenger where train_no="+tno
            +" && journey_Date='"+date+"' order by seat_no asc";
    ResultSet rs=stment.executeQuery(sql);
    {//To wipe the previous data
    int r = dtm1.getRowCount();
    for (int i = 0;i<r;++i )
        dtm1.removeRow(0);
    }
    while(rs.next())
    {
       int pnr=rs.getInt("PNR_no");
       String passenger=rs.getString("passengerName");
       String sex=rs.getString("sex");
       int age=rs.getInt("age");
       int sno=rs.getInt("Seat_No");
       Object ob1[] = {pnr,passenger,age,sex,sno};
       dtm1.addRow(ob1);
    }
conn.close();
stment.close();
rs.close();
}
catch(Exception exp)
{
    JOptionPane.showMessageDialog(null,"erorr!!!" +exp.getMessage());
}
}//GEN-LAST:event_displayBTNActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
new PageMain().setVisible(true);
}//GEN-LAST:event_backActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new passengerList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JComboBox classCombo;
    private javax.swing.JTextField dateTF;
    private javax.swing.JButton displayBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable passengerTBL;
    private javax.swing.JTextField tnoTF;
    // End of variables declaration//GEN-END:variables

}
