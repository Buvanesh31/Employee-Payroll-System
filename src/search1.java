import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
/*
 * Created by JFormDesigner on Thu Apr 16 17:18:10 IST 2020
 */



/**
 * @author buvu
 */
public class search1 extends JFrame {

    public search1() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {

        String Eid=textField1.getText();

        try{
                Class.forName("oracle.jdbc.driver.OracleDriver");

                Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl2","SYSTEM","orcl2");

                Statement stmt=con.createStatement();

                final String queryCheck = "Select * from emptab where empId=?";

                final PreparedStatement ps = con.prepareStatement(queryCheck);

                ps.setString(1, Eid);

                final ResultSet rs = ps.executeQuery();

                while(rs.next())

                {
                    textField2.setText(rs.getString(2));
                    textField3.setText(rs.getString(3));
                    textField4.setText(rs.getString(4));
                    textField5.setText(rs.getString(5));
                    textField6.setText(rs.getString(6));
                    textField7.setText(rs.getString(7));
                    textField8.setText(rs.getString(8));
                }
                con.close();

        }catch(Exception f){ System.out.println(f);}

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl2","SYSTEM","orcl2");

            Statement stmt=con.createStatement();

            final String queryCheck = "Select * from Sal where empId=?";

            final PreparedStatement ps = con.prepareStatement(queryCheck);

            ps.setString(1, Eid);

            final ResultSet rs = ps.executeQuery();

            while(rs.next())

            {
                textField9.setText(rs.getString(3));
                textField10.setText(rs.getString(4));
                textField11.setText(rs.getString(5));
                textField12.setText(rs.getString(7));
                textField13.setText(rs.getString(8));


            }
            con.close();

        }catch(Exception f){ System.out.println(f);}
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - buvu
        this2 = new JFrame();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        label13 = new JLabel();
        label14 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        textField5 = new JTextField();
        textField6 = new JTextField();
        textField7 = new JTextField();
        label15 = new JLabel();
        textField8 = new JTextField();
        textField9 = new JTextField();
        textField10 = new JTextField();
        textField11 = new JTextField();
        textField12 = new JTextField();
        textField13 = new JTextField();
        label16 = new JLabel();
        button1 = new JButton();

        //======== this2 ========
        {
            Container this2ContentPane = this2.getContentPane();

            //---- label1 ----
            label1.setText("SEARCH EMPLOYEE");
            label1.setFont(new Font("Calibri", Font.PLAIN, 37));
            label1.setForeground(new Color(51, 51, 51));
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setVerticalAlignment(SwingConstants.TOP);

            //---- label2 ----
            label2.setText("Enter Employee ID");
            label2.setFont(new Font("Calibri", Font.PLAIN, 20));

            //---- label3 ----
            label3.setText("Employee ID");

            //---- label4 ----
            label4.setText("Password");

            //---- label5 ----
            label5.setText("Name");

            //---- label6 ----
            label6.setText("Address");

            //---- label7 ----
            label7.setText("Email");

            //---- label8 ----
            label8.setText("Phone");

            //---- label9 ----
            label9.setText("Designation");

            //---- label10 ----
            label10.setText("SALARY DETAILS");
            label10.setFont(new Font("Calibri", Font.PLAIN, 20));

            //---- label11 ----
            label11.setText("Basic Pay");

            //---- label12 ----
            label12.setText("HRA");

            //---- label13 ----
            label13.setText("DA");

            //---- label14 ----
            label14.setText("Medical");

            //---- label15 ----
            label15.setText("Deduction");

            //---- label16 ----
            label16.setText("Net Salary");

            //---- button1 ----
            button1.setText("SEARCH");
            button1.addActionListener(e -> button1ActionPerformed(e));

            GroupLayout this2ContentPaneLayout = new GroupLayout(this2ContentPane);
            this2ContentPane.setLayout(this2ContentPaneLayout);
            this2ContentPaneLayout.setHorizontalGroup(
                this2ContentPaneLayout.createParallelGroup()
                    .addGroup(this2ContentPaneLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(this2ContentPaneLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, this2ContentPaneLayout.createSequentialGroup()
                                .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addGroup(GroupLayout.Alignment.TRAILING, this2ContentPaneLayout.createSequentialGroup()
                                        .addComponent(label8)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textField6, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(label15))
                                    .addGroup(this2ContentPaneLayout.createSequentialGroup()
                                        .addGroup(this2ContentPaneLayout.createParallelGroup()
                                            .addComponent(label9)
                                            .addComponent(label6))
                                        .addGap(50, 50, 50)
                                        .addGroup(this2ContentPaneLayout.createParallelGroup()
                                            .addGroup(this2ContentPaneLayout.createSequentialGroup()
                                                .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(label12))
                                            .addGroup(this2ContentPaneLayout.createSequentialGroup()
                                                .addComponent(textField7, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(label16))
                                            .addGroup(this2ContentPaneLayout.createSequentialGroup()
                                                .addComponent(textField5, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(label14))))
                                    .addComponent(label5))
                                .addGroup(this2ContentPaneLayout.createParallelGroup()
                                    .addGroup(this2ContentPaneLayout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                        .addComponent(textField9, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                                        .addGap(59, 59, 59))
                                    .addGroup(this2ContentPaneLayout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(this2ContentPaneLayout.createParallelGroup()
                                            .addComponent(textField13, GroupLayout.Alignment.TRAILING)
                                            .addGroup(this2ContentPaneLayout.createSequentialGroup()
                                                .addGroup(this2ContentPaneLayout.createParallelGroup()
                                                    .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(textField11, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(textField10, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(textField12, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(0, 61, Short.MAX_VALUE))))
                            .addGroup(GroupLayout.Alignment.TRAILING, this2ContentPaneLayout.createSequentialGroup()
                                .addComponent(label4)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 318, Short.MAX_VALUE)
                                .addComponent(textField8, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))
                            .addGroup(this2ContentPaneLayout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addGroup(this2ContentPaneLayout.createParallelGroup()
                                    .addComponent(textField3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
                                .addGroup(this2ContentPaneLayout.createParallelGroup()
                                    .addGroup(this2ContentPaneLayout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(label10)
                                        .addGap(0, 98, Short.MAX_VALUE))
                                    .addGroup(this2ContentPaneLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(this2ContentPaneLayout.createParallelGroup()
                                            .addComponent(label13)
                                            .addComponent(label11))
                                        .addContainerGap(236, Short.MAX_VALUE))))
                            .addGroup(this2ContentPaneLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(this2ContentPaneLayout.createParallelGroup()
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(this2ContentPaneLayout.createSequentialGroup()
                                        .addComponent(label3)
                                        .addGap(89, 89, 89)
                                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(button1)))
                                .addGap(0, 74, Short.MAX_VALUE))
                            .addGroup(this2ContentPaneLayout.createSequentialGroup()
                                .addComponent(label7)
                                .addContainerGap(527, Short.MAX_VALUE))))
                    .addGroup(this2ContentPaneLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 155, Short.MAX_VALUE))
            );
            this2ContentPaneLayout.setVerticalGroup(
                this2ContentPaneLayout.createParallelGroup()
                    .addGroup(this2ContentPaneLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label2)
                        .addGap(13, 13, 13)
                        .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3)
                            .addComponent(button1))
                        .addGap(41, 41, 41)
                        .addComponent(label10)
                        .addGap(31, 31, 31)
                        .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label11)
                            .addComponent(textField8, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4)
                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(textField9, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5)
                            .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label13))
                        .addGap(35, 35, 35)
                        .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(textField10, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6)
                            .addComponent(label12))
                        .addGap(27, 27, 27)
                        .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label7)
                            .addComponent(textField5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField11, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label14))
                        .addGap(33, 33, 33)
                        .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(textField6, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label8)
                            .addComponent(label15)
                            .addComponent(textField12, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(this2ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label9)
                            .addComponent(textField7, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label16)
                            .addComponent(textField13, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(58, Short.MAX_VALUE))
            );
            this2.pack();
            this2.setLocationRelativeTo(this2.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        this2.setVisible(true);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - buvu
    private JFrame this2;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JLabel label14;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JLabel label15;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField13;
    private JLabel label16;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args){
        search1 a1 =new search1();}
}
