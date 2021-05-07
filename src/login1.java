import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
/*
 * Created by JFormDesigner on Mon Apr 20 15:52:04 IST 2020
 */



/**
 * @author buvu
 */
public class login1 extends JFrame {
    public login1() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button1KeyPressed(KeyEvent e) {
        // TODO add your code here
    }

    private void button2ActionPerformed(ActionEvent e) {
        String uname="",pwd="";
        uname=textField1.getText();
        pwd=passwordField1.getText();
        if(uname.equals("admin")&& pwd.equals("admin1"))
        {
            log1.dispose();
            home1 hom= new home1();
        }
       else{
           JOptionPane.showMessageDialog(log1,"Check Credentials");
        }
    }

    private void button1MouseClicked(MouseEvent e) {



        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl2","SYSTEM","orcl2");
            String mob = textField1.getText();
            String pas = new String(passwordField1.getPassword());



            PreparedStatement pst = con.prepareStatement("select * from emptab where empId = ?");
            pst.setString(1,mob);
            ResultSet rs= pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                if(rs.getString(1).equals(mob) && rs.getString(2).equals(pas))
                {
                    JOptionPane.showMessageDialog(null,"Login Successful");
                    log1.setVisible(false);
                    emphome e1 =new emphome();

                }
                else{
                    JOptionPane.showMessageDialog(null,"Check Credentials");
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Check Credentials");
            }
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - buvu
        log1 = new JFrame();
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        label3 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        passwordField1 = new JPasswordField();
        panel1 = new JPanel();
        label4 = new JLabel();

        //======== log1 ========
        {
            Container log1ContentPane = log1.getContentPane();

            //---- label1 ----
            label1.setText("Login");
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 30f));
            label1.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label2 ----
            label2.setText("User Id");
            label2.setFont(new Font("Calibri", Font.PLAIN, 28));
            label2.setBackground(new Color(242, 242, 24));

            //---- label3 ----
            label3.setText("Password");
            label3.setFont(new Font("Calibri", label3.getFont().getStyle(), label3.getFont().getSize() + 14));

            //---- button1 ----
            button1.setText("Employee");
            button1.addActionListener(e -> {
			button1ActionPerformed(e);
			button1ActionPerformed(e);
			button1ActionPerformed(e);
			button1ActionPerformed(e);
			button1ActionPerformed(e);
		});
            button1.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    button1KeyPressed(e);
                }
            });
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
            });

            //---- button2 ----
            button2.setText("Admin");
            button2.addActionListener(e -> {
			button2ActionPerformed(e);
			button2ActionPerformed(e);
			button2ActionPerformed(e);
			button2ActionPerformed(e);
		});

            //======== panel1 ========
            {
                panel1.setBackground(new Color(51, 102, 255));
                panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(
                0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax.swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder
                .BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt.Color.
                red),panel1. getBorder()));panel1. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.
                beans.PropertyChangeEvent e){if("bord\u0065r".equals(e.getPropertyName()))throw new RuntimeException();}});

                //---- label4 ----
                label4.setText("text");
                label4.setIcon(new ImageIcon("C:\\Users\\buvanesh\\IdeaProjects\\download (1).jpg"));

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(23, Short.MAX_VALUE))
                );
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                            .addContainerGap(144, Short.MAX_VALUE)
                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
                            .addGap(139, 139, 139))
                );
            }

            GroupLayout log1ContentPaneLayout = new GroupLayout(log1ContentPane);
            log1ContentPane.setLayout(log1ContentPaneLayout);
            log1ContentPaneLayout.setHorizontalGroup(
                log1ContentPaneLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, log1ContentPaneLayout.createSequentialGroup()
                        .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(log1ContentPaneLayout.createParallelGroup()
                            .addGroup(log1ContentPaneLayout.createParallelGroup()
                                .addComponent(label1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
                            .addGroup(log1ContentPaneLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(log1ContentPaneLayout.createParallelGroup()
                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(log1ContentPaneLayout.createSequentialGroup()
                                        .addComponent(button1)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))))
                        .addGap(51, 51, 51))
            );
            log1ContentPaneLayout.setVerticalGroup(
                log1ContentPaneLayout.createParallelGroup()
                    .addGroup(log1ContentPaneLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(label1)
                        .addGap(52, 52, 52)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(log1ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button1)
                            .addComponent(button2))
                        .addGap(75, 75, 75))
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            log1.pack();
            log1.setLocationRelativeTo(log1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    log1.setVisible(true);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - buvu
    private JFrame log1;
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JLabel label3;
    private JButton button1;
    private JButton button2;
    private JPasswordField passwordField1;
    private JPanel panel1;
    private JLabel label4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args){
        login1 ll =new login1();}
}
