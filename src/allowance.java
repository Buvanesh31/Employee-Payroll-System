import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
/*
 * Created by JFormDesigner on Thu Apr 16 19:18:58 IST 2020
 */



/**
 * @author buvu
 */
public class allowance {
    public allowance() {
        initComponents();

    }

    private void button1ActionPerformed(ActionEvent e) {
        String Eid=textField1.getText();
        float da=0,hra=0,med=0,gross=0;
        int basic=0;
        da=Float.parseFloat(textField2.getText());
        hra=Float.parseFloat(textField3.getText());
        med=Float.parseFloat(textField3.getText());
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

            hra=basic*(hra/100);
            da=basic*(da/100);
            med=basic*(med/100);
            gross=basic+hra+da+med;

            final String query = "update Sal set DA=?,HRA=?,Medical=?,GrossPay=? where empId=?";
            System.out.println(basic);

            final PreparedStatement pp = con.prepareStatement(query);

            pp.setFloat(1,da);
            pp.setFloat(2,hra);
            pp.setFloat(3,med);
            pp.setFloat(4,gross);
            pp.setString(5,Eid);

            ResultSet rr = pp.executeQuery();

            con.close();
        }catch(Exception f){ System.out.println(f);}


        }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - buvu
        Allow = new JFrame();
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        label3 = new JLabel();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        button1 = new JButton();

        //======== Allow ========
        {
            Container AllowContentPane = Allow.getContentPane();

            //---- label1 ----
            label1.setText("ALLOWANCE");
            label1.setFont(new Font("Calibri", Font.PLAIN, 28));

            //---- label2 ----
            label2.setText("Enter Employee Id");
            label2.setFont(new Font("Calibri", Font.PLAIN, 20));

            //---- label3 ----
            label3.setText("Enter Allowance (%)");
            label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 6f));

            //---- label4 ----
            label4.setText("DA ");

            //---- label5 ----
            label5.setText("HRA");

            //---- label6 ----
            label6.setText("Medical");

            //---- button1 ----
            button1.setText("UDATE SALARY");
            button1.addActionListener(e -> button1ActionPerformed(e));

            GroupLayout AllowContentPaneLayout = new GroupLayout(AllowContentPane);
            AllowContentPane.setLayout(AllowContentPaneLayout);
            AllowContentPaneLayout.setHorizontalGroup(
                AllowContentPaneLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, AllowContentPaneLayout.createSequentialGroup()
                        .addContainerGap(195, Short.MAX_VALUE)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))
                    .addGroup(AllowContentPaneLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(AllowContentPaneLayout.createParallelGroup()
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
                            .addGroup(AllowContentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(button1)
                                .addGroup(AllowContentPaneLayout.createSequentialGroup()
                                    .addGroup(AllowContentPaneLayout.createParallelGroup()
                                        .addComponent(label4)
                                        .addComponent(label6)
                                        .addComponent(label5))
                                    .addGap(27, 27, 27)
                                    .addGroup(AllowContentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                        .addComponent(textField3, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                        .addComponent(textField4, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)))))
                        .addContainerGap(281, Short.MAX_VALUE))
            );
            AllowContentPaneLayout.setVerticalGroup(
                AllowContentPaneLayout.createParallelGroup()
                    .addGroup(AllowContentPaneLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(label1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label2)
                        .addGap(18, 18, 18)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(label3)
                        .addGap(36, 36, 36)
                        .addGroup(AllowContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label4)
                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(AllowContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5))
                        .addGap(20, 20, 20)
                        .addGroup(AllowContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(button1)
                        .addGap(31, 31, 31))
            );
            Allow.pack();
            Allow.setLocationRelativeTo(Allow.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
Allow.setVisible(true);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - buvu
    private JFrame Allow;
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JLabel label3;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args){
        allowance al =new allowance();
    }
}
