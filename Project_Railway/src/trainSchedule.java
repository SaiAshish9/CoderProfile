
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class trainSchedule extends javax.swing.JFrame {

    public trainSchedule() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        schedule = new javax.swing.JButton();
        trainNo = new javax.swing.JComboBox();
        backBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        trainDTL = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Train Schedule");

        schedule.setFont(new java.awt.Font("Trebuchet MS", 0, 18));
        schedule.setText("Find train schedule");
        schedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleActionPerformed(evt);
            }
        });

        trainNo.setFont(new java.awt.Font("Andalus", 1, 18));
        trainNo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "12204", "12420", "12723", "12724", "12915" }));

        backBTN.setFont(new java.awt.Font("Andalus", 1, 18));
        backBTN.setText("Back");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        jScrollPane1.setFont(new java.awt.Font("Andalus", 1, 14));

        trainDTL.setFont(new java.awt.Font("Andalus", 0, 16));
        trainDTL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Train no.", "Train name       ", "From                ", "Depart time", "To", "Arrive time", "Distance", "Journey Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        trainDTL.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        trainDTL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trainDTLMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(trainDTL);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 24));
        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText(" INDIAN RAILWAYS");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon.jpg"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/M2-162_Indian_Railway_Museum.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(trainNo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(360, 360, 360)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(860, 860, 860)
                .addComponent(backBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(schedule))
            .addGroup(layout.createSequentialGroup()
                .addGap(720, 720, 720)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(trainNo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(180, 180, 180)
                .addComponent(backBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(schedule, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleActionPerformed
DefaultTableModel dtm1 = (DefaultTableModel)trainDTL.getModel();
try
{
Class.forName("java.sql.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/railway","root","tiger");
Statement stment = conn.createStatement();
int tno = Integer.parseInt((String)trainNo.getSelectedItem());
String sql = "select * from train_details where train_no="+tno;
ResultSet rs = stment.executeQuery(sql);
{//To wipe the previous data
    int r = dtm1.getRowCount();
    for (int i = 0;i<r;++i )
        dtm1.removeRow(0);
}
if(rs.next())
{
    String from = rs.getString("source");
    String to = rs.getString("destination");
    String tname = rs.getString("Train_name");
    String deptTime = rs.getString("departure_time");
   String arriveTime = rs.getString("arrival_time");
   double dist = rs.getDouble("distance_km");
   String journey=rs.getString("journey_time");
    Object ob1[] = {tno,tname,from,deptTime,to,arriveTime,dist,journey};
    dtm1.addRow(ob1);
}
else
    JOptionPane.showMessageDialog(null,"this train no."+tno +"does not exist");
conn.close();
stment.close();
rs.close();
}
catch(Exception exp)
{
    JOptionPane.showMessageDialog(null,"erorr!!!" +exp.getMessage());
}
}//GEN-LAST:event_scheduleActionPerformed

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
this.dispose();
new PageMain().setVisible(true);
}//GEN-LAST:event_backBTNActionPerformed

    private void trainDTLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trainDTLMouseClicked

}//GEN-LAST:event_trainDTLMouseClicked

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
            java.util.logging.Logger.getLogger(trainSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(trainSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(trainSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(trainSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new trainSchedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton schedule;
    private javax.swing.JTable trainDTL;
    private javax.swing.JComboBox trainNo;
    // End of variables declaration//GEN-END:variables
}
