import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
/*
 * Created by JFormDesigner on Tue Apr 21 10:09:39 IST 2020
 */



/**
 * @author buvu
 */
public class deduction {
    public deduction() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        String Eid = textField1.getText();
        float pf = 0, tax = 0, net = 0, ded = 0;
        float gross = 0;
        pf = Float.parseFloat(textField2.getText());
        tax = Float.parseFloat(textField3.getText());
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl2", "SYSTEM", "orcl2");

            Statement stmt = con.createStatement();

            final String queryCheck = "select Grosspay from Sal where empId=?";

            final PreparedStatement ps = con.prepareStatement(queryCheck);

            ps.setString(1, Eid);

            final ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                gross = rs.getInt(1);
            }

            pf = gross * (pf / 100);
            tax = gross * (tax / 100);
            ded = pf + tax;
            net = gross - (ded);

            final String query = "update Sal set deduction=?,NetPay=? where empId=?";
            System.out.println(net);

            final PreparedStatement pp = con.prepareStatement(query);

            pp.setFloat(1, ded);
            pp.setFloat(2, net);
            pp.setString(3, Eid);

            ResultSet rr = pp.executeQuery();

            con.close();
        } catch (Exception f) {
            System.out.println(f);
        }
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - buvu
        dedu = new JFrame();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        button1 = new JButton();
        label4 = new JLabel();
        textField3 = new JTextField();

        //======== dedu ========
        {
            Container deduContentPane = dedu.getContentPane();

            //---- label1 ----
            label1.setText("Deduction");
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 12f));
            label1.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label2 ----
            label2.setText("Provident Fund");
            label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 7f));

            //---- label3 ----
            label3.setText("Tax");
            label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 7f));

            //---- button1 ----
            button1.setText("UPDATE SALARY");
            button1.addActionListener(e -> button1ActionPerformed(e));

            //---- label4 ----
            label4.setText("Enter Employee Id");

            GroupLayout deduContentPaneLayout = new GroupLayout(deduContentPane);
            deduContentPane.setLayout(deduContentPaneLayout);
            deduContentPaneLayout.setHorizontalGroup(
                deduContentPaneLayout.createParallelGroup()
                    .addGroup(deduContentPaneLayout.createSequentialGroup()
                        .addGroup(deduContentPaneLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, deduContentPaneLayout.createSequentialGroup()
                                .addComponent(label4)
                                .addGap(49, 49, 49))
                            .addGroup(deduContentPaneLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(deduContentPaneLayout.createParallelGroup()
                                    .addComponent(label2)
                                    .addComponent(label3))
                                .addGap(63, 63, 63)))
                        .addGroup(deduContentPaneLayout.createParallelGroup()
                            .addComponent(textField3)
                            .addGroup(deduContentPaneLayout.createSequentialGroup()
                                .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(textField1))
                        .addGap(85, 85, 85))
                    .addGroup(deduContentPaneLayout.createSequentialGroup()
                        .addGroup(deduContentPaneLayout.createParallelGroup()
                            .addGroup(deduContentPaneLayout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(button1))
                            .addGroup(deduContentPaneLayout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            deduContentPaneLayout.setVerticalGroup(
                deduContentPaneLayout.createParallelGroup()
                    .addGroup(deduContentPaneLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(deduContentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(deduContentPaneLayout.createSequentialGroup()
                                .addGroup(deduContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label4)
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(deduContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2))
                                .addGap(122, 122, 122))
                            .addGroup(deduContentPaneLayout.createSequentialGroup()
                                .addGroup(deduContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label3)
                                    .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)))
                        .addComponent(button1)
                        .addContainerGap(62, Short.MAX_VALUE))
            );
            dedu.pack();
            dedu.setLocationRelativeTo(dedu.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
   dedu.setVisible(true);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - buvu
    private JFrame dedu;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JLabel label4;
    private JTextField textField3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args){
        deduction d1 =new deduction();}
}
