import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Mon Apr 27 12:53:48 IST 2020
 */



/**
 * @author buvu
 */
public class delete {
    public delete() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        try {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl2", "SYSTEM", "orcl2");
            PreparedStatement ps = null;
            ps = con.prepareStatement("DELETE FROM emptab WHERE empId = '" + textField1.getText() + "'");
            ResultSet rs = ps.executeQuery();
            PreparedStatement p = null;
            p = con.prepareStatement("DELETE FROM Sal WHERE empId = '" + textField1.getText() + "'");
            ResultSet r = p.executeQuery();
            PreparedStatement pp = null;
            pp = con.prepareStatement("DELETE FROM Leave WHERE empId = '" + textField1.getText() + "'");
            ResultSet rr = pp.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "successfully deleted");
            } else {
                JOptionPane.showMessageDialog(null, "No record Found.Enter valid Employee Id");
            }
            con.close();
            rs.close();
            r.close();
            rr.close();
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, x);
        }
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - buvu
        del = new JFrame();
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();

        //======== del ========
        {
            Container delContentPane = del.getContentPane();

            //---- label1 ----
            label1.setText("DELETE EMPLOYEE RECORD");
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 12f));
            label1.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label2 ----
            label2.setText("Enter Employee Id:");

            //---- button1 ----
            button1.setText("DELETE");
            button1.addActionListener(e -> button1ActionPerformed(e));

            GroupLayout delContentPaneLayout = new GroupLayout(delContentPane);
            delContentPane.setLayout(delContentPaneLayout);
            delContentPaneLayout.setHorizontalGroup(
                delContentPaneLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, delContentPaneLayout.createSequentialGroup()
                        .addContainerGap(25, Short.MAX_VALUE)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(delContentPaneLayout.createSequentialGroup()
                        .addGroup(delContentPaneLayout.createParallelGroup()
                            .addGroup(delContentPaneLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(label2)
                                .addGap(35, 35, 35)
                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
                            .addGroup(delContentPaneLayout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(button1)))
                        .addContainerGap(56, Short.MAX_VALUE))
            );
            delContentPaneLayout.setVerticalGroup(
                delContentPaneLayout.createParallelGroup()
                    .addGroup(delContentPaneLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(delContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(button1)
                        .addContainerGap(54, Short.MAX_VALUE))
            );
            del.pack();
            del.setLocationRelativeTo(del.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    del.setVisible(true);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - buvu
    private JFrame del;
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args){
        delete de =new delete();}
}
