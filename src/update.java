import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Tue Apr 21 13:14:15 IST 2020
 */



/**
 * @author buvu
 */
public class update {
    public update() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        String Eid=textField1.getText();
        String reason=textField4.getText();
        float inc=0,perday=0,basic=0;
        int day;
        day= Integer.parseInt(textField3.getText());
        inc=Float.parseFloat(textField2.getText());
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl2","SYSTEM","orcl2");

            Statement stmt=con.createStatement();

            final String queryCheck = "select Basic from Sal where empId=?";

            final PreparedStatement ps = con.prepareStatement(queryCheck);

            ps.setString(1, Eid);

            final ResultSet rs = ps.executeQuery();

            while(rs.next())
            {basic=rs.getInt(1);}

            basic=basic+inc;
            if(day>1)
            {
                perday=basic/21;
                basic=basic-(perday*(day-1));
            }

            final String query = "update Sal set Basic=? where empId=?";
            //System.out.println(basic);

            final PreparedStatement pp = con.prepareStatement(query);

            pp.setFloat(1,basic);
            pp.setString(2,Eid);


            ResultSet rr = pp.executeQuery();

            con.close();
        }catch(Exception f){ System.out.println(f);}
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl2","SYSTEM","orcl2");

            Statement stmt=con.createStatement();


            final String query = "update Leave set noofdays=?,reason=? where empId=?";

            final PreparedStatement pp = con.prepareStatement(query);

            pp.setInt(1,day);
            pp.setString(2,reason);
            pp.setString(3,Eid);


            ResultSet rr = pp.executeQuery();

            con.close();
        }catch(Exception f){ System.out.println(f);}
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl2","SYSTEM","orcl2");

            Statement stmt=con.createStatement();


            final String query = "update emptab set Basic=? where empId=?";

            final PreparedStatement pp = con.prepareStatement(query);

            pp.setFloat(1,basic);
            pp.setString(2,Eid);


            ResultSet rr = pp.executeQuery();

            con.close();
        }catch(Exception f){ System.out.println(f);}
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - buvu
        up = new JFrame();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        textField1 = new JTextField();
        label4 = new JLabel();
        textField2 = new JTextField();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        textField3 = new JTextField();
        textField4 = new JTextField();
        button1 = new JButton();

        //======== up ========
        {
            Container upContentPane = up.getContentPane();

            //---- label1 ----
            label1.setText("UPDATE SALARY");
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 13f));

            //---- label3 ----
            label3.setText("Enter Employee Id");

            //---- label4 ----
            label4.setText("Enter Increment");

            //---- label5 ----
            label5.setText("Enter leave Details");

            //---- label6 ----
            label6.setText("No of days (per month)");

            //---- label7 ----
            label7.setText("Reason");

            //---- button1 ----
            button1.setText("UPDATE");
            button1.addActionListener(e -> button1ActionPerformed(e));

            GroupLayout upContentPaneLayout = new GroupLayout(upContentPane);
            upContentPane.setLayout(upContentPaneLayout);
            upContentPaneLayout.setHorizontalGroup(
                upContentPaneLayout.createParallelGroup()
                    .addGroup(upContentPaneLayout.createSequentialGroup()
                        .addGroup(upContentPaneLayout.createParallelGroup()
                            .addGroup(upContentPaneLayout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(label1))
                            .addGroup(upContentPaneLayout.createSequentialGroup()
                                .addGroup(upContentPaneLayout.createParallelGroup()
                                    .addGroup(upContentPaneLayout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(upContentPaneLayout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addGroup(upContentPaneLayout.createParallelGroup()
                                            .addComponent(label5, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(upContentPaneLayout.createSequentialGroup()
                                                .addGroup(upContentPaneLayout.createParallelGroup()
                                                    .addComponent(label6)
                                                    .addComponent(label3)
                                                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(label7))
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addGroup(upContentPaneLayout.createParallelGroup()
                                    .addGroup(upContentPaneLayout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(upContentPaneLayout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addGroup(upContentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textField3, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                            .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                            .addComponent(textField4, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))))))
                        .addContainerGap(74, Short.MAX_VALUE))
                    .addGroup(upContentPaneLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(button1)
                        .addContainerGap(193, Short.MAX_VALUE))
            );
            upContentPaneLayout.setVerticalGroup(
                upContentPaneLayout.createParallelGroup()
                    .addGroup(upContentPaneLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(label2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(upContentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(label3)
                            .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(upContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label4)
                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(label5)
                        .addGap(18, 18, 18)
                        .addGroup(upContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label6)
                            .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(upContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label7)
                            .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(button1)
                        .addGap(25, 25, 25))
            );
            up.pack();
            up.setLocationRelativeTo(up.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    up.setVisible(true);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - buvu
    private JFrame up;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField textField1;
    private JLabel label4;
    private JTextField textField2;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JTextField textField3;
    private JTextField textField4;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args){
        update u1 =new update();}
}
