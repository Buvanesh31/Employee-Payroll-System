import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import java.sql.*;
import javax.swing.GroupLayout;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
/*
 * Created by JFormDesigner on Wed Apr 15 16:32:49 IST 2020
 */



/**
 * @author buvu
 */
public class addemp {

    public addemp() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {

        String qr="insert into emptab(empId,password,emp_name,emp_address,emp_email,emp_phno,emp_designation,Basic) values('"+textField1.getText()+"','"+textField2.getText()+"','"+textField3.getText()+"','"+textField4.getText()+"','"+textField5.getText()+"','"+textField6.getText()+"','"+textField7.getText()+"','"+textField8.getText()+"')";
        System.out.println(qr);
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl2","SYSTEM","orcl2");
            PreparedStatement ps = null;
            ps = conn.prepareStatement(qr);
            ResultSet rs = ps.executeQuery();
            conn.close();
            rs.close();
        } catch(Exception x) { JOptionPane.showMessageDialog(null,x); }
        String qr1="insert into Sal(empId,Basic) values('"+textField1.getText()+"','"+textField8.getText()+"')";
        try{
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl2","SYSTEM","orcl2");
            Class.forName("oracle.jdbc.driver.OracleDriver");
            PreparedStatement ps = null;
            ps = conn.prepareStatement(qr1);
            ResultSet rs = ps.executeQuery();
            conn.close();
            rs.close();
        } catch(Exception x) { JOptionPane.showMessageDialog(null,x); }
        String qr2="insert into Leave(empId) values('"+textField1.getText()+"')";
        try{
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl2","SYSTEM","orcl2");
            Class.forName("oracle.jdbc.driver.OracleDriver");
            PreparedStatement ps = null;
            ps = conn.prepareStatement(qr2);
            ResultSet rs = ps.executeQuery();
            conn.close();
            rs.close();
        } catch(Exception x) { JOptionPane.showMessageDialog(null,x); }

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - buvu
        addemploy = new JFrame();
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
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        textField5 = new JTextField();
        textField6 = new JTextField();
        textField7 = new JTextField();
        textField8 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();

        //======== addemploy ========
        {
            Container addemployContentPane = addemploy.getContentPane();

            //---- label1 ----
            label1.setText("ADD EMPLOYEE");
            label1.setFont(new Font("Calibri", Font.PLAIN, 37));
            label1.setForeground(new Color(51, 51, 51));
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setVerticalAlignment(SwingConstants.TOP);

            //---- label2 ----
            label2.setText("EMPLOYEE DETAILS");
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

            //---- button1 ----
            button1.setText("ADD");
            button1.addActionListener(e -> button1ActionPerformed(e));

            //---- button2 ----
            button2.setText("CLEAR");

            GroupLayout addemployContentPaneLayout = new GroupLayout(addemployContentPane);
            addemployContentPane.setLayout(addemployContentPaneLayout);
            addemployContentPaneLayout.setHorizontalGroup(
                addemployContentPaneLayout.createParallelGroup()
                    .addGroup(addemployContentPaneLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label10)
                        .addGap(92, 92, 92))
                    .addGroup(addemployContentPaneLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(addemployContentPaneLayout.createParallelGroup()
                            .addGroup(addemployContentPaneLayout.createSequentialGroup()
                                .addGroup(addemployContentPaneLayout.createParallelGroup()
                                    .addComponent(label3)
                                    .addComponent(label4)
                                    .addComponent(label5)
                                    .addComponent(label6)
                                    .addComponent(label7))
                                .addGap(47, 47, 47)
                                .addGroup(addemployContentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(textField3, GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(textField4, GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(textField5, GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(label11)
                                .addGap(34, 34, 34)
                                .addComponent(textField8, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(53, Short.MAX_VALUE))
                            .addGroup(addemployContentPaneLayout.createSequentialGroup()
                                .addGroup(addemployContentPaneLayout.createParallelGroup()
                                    .addComponent(label8)
                                    .addComponent(label9))
                                .addGap(50, 50, 50)
                                .addGroup(addemployContentPaneLayout.createParallelGroup()
                                    .addComponent(textField6, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField7, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 303, Short.MAX_VALUE))))
                    .addGroup(addemployContentPaneLayout.createSequentialGroup()
                        .addGroup(addemployContentPaneLayout.createParallelGroup()
                            .addGroup(addemployContentPaneLayout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE))
                            .addGroup(addemployContentPaneLayout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addComponent(button1)
                                .addGap(76, 76, 76)
                                .addComponent(button2)))
                        .addContainerGap(170, Short.MAX_VALUE))
            );
            addemployContentPaneLayout.setVerticalGroup(
                addemployContentPaneLayout.createParallelGroup()
                    .addGroup(addemployContentPaneLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(addemployContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label10)
                            .addComponent(label2))
                        .addGap(18, 18, 18)
                        .addGroup(addemployContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label3)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField8, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label11))
                        .addGap(46, 46, 46)
                        .addGroup(addemployContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label4)
                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(addemployContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label5)
                            .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(addemployContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label6)
                            .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(addemployContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label7)
                            .addComponent(textField5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(addemployContentPaneLayout.createParallelGroup()
                            .addGroup(addemployContentPaneLayout.createSequentialGroup()
                                .addComponent(textField6, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addGroup(addemployContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(textField7, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label9)))
                            .addComponent(label8))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(addemployContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button1)
                            .addComponent(button2))
                        .addGap(29, 29, 29))
            );
            addemploy.pack();
            addemploy.setLocationRelativeTo(addemploy.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        addemploy.setVisible(true);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - buvu
    private JFrame addemploy;
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
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args){
        addemp ad =new addemp();}
}
