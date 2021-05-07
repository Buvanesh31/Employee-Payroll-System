import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Wed Apr 15 16:18:49 IST 2020
 */
/**
 * @author buvu
 */
public class home1 {
    //this.setVisible(true);
    public home1() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {

        addemp ade= new addemp();
    }

    private void button2ActionPerformed(ActionEvent e) {

        search1 s1= new search1();
    }

    private void button4ActionPerformed(ActionEvent e) {

        allowance ao= new allowance();
    }

    private void button5ActionPerformed(ActionEvent e) {

        deduction ded1= new deduction();
    }

    private void menuItem1ActionPerformed(ActionEvent e) {
        h1.dispose();
        login1 lo1=new login1();
    }

    private void button6ActionPerformed(ActionEvent e) {
        delete d1=new delete();
    }

    private void button3ActionPerformed(ActionEvent e) {
        update up = new update();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - buvu
        h1 = new JFrame();
        panel1 = new JPanel();
        labet1 = new JLabel();
        menuItem1 = new JMenuItem();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();

        //======== h1 ========
        {
            Container h1ContentPane = h1.getContentPane();

            //======== panel1 ========
            {
                panel1.setBackground(new Color(0, 102, 204));
                panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
                . border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax. swing. border. TitledBorder
                . CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069al\u006fg" ,java .
                awt .Font .BOLD ,12 ), java. awt. Color. red) ,panel1. getBorder( )) )
                ; panel1. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
                ) {if ("\u0062or\u0064er" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
                ;

                //---- labet1 ----
                labet1.setText("Administrator Login");
                labet1.setFont(new Font("Calibri", Font.PLAIN, 36));
                labet1.setForeground(Color.white);
                labet1.setHorizontalAlignment(SwingConstants.CENTER);

                //---- menuItem1 ----
                menuItem1.setText("LOGOUT");
                menuItem1.addActionListener(e -> menuItem1ActionPerformed(e));

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGap(121, 121, 121)
                            .addComponent(labet1, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(143, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                            .addGap(0, 517, Short.MAX_VALUE)
                            .addComponent(menuItem1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                );
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addComponent(menuItem1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42)
                            .addComponent(labet1, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(62, Short.MAX_VALUE))
                );
            }

            //---- button1 ----
            button1.setText("ADD ");
            button1.addActionListener(e -> button1ActionPerformed(e));

            //---- button2 ----
            button2.setText("SEARCH");
            button2.addActionListener(e -> button2ActionPerformed(e));

            //---- button3 ----
            button3.setText("UPDATE");
            button3.addActionListener(e -> button3ActionPerformed(e));

            //---- button4 ----
            button4.setText("ALLOWANCE");
            button4.addActionListener(e -> button4ActionPerformed(e));

            //---- button5 ----
            button5.setText("DEDUCTION");
            button5.addActionListener(e -> button5ActionPerformed(e));

            //---- button6 ----
            button6.setText("DELETE");
            button6.addActionListener(e -> {
			button6ActionPerformed(e);
			button6ActionPerformed(e);
		});

            GroupLayout h1ContentPaneLayout = new GroupLayout(h1ContentPane);
            h1ContentPane.setLayout(h1ContentPaneLayout);
            h1ContentPaneLayout.setHorizontalGroup(
                h1ContentPaneLayout.createParallelGroup()
                    .addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(h1ContentPaneLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(h1ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button4, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addGroup(h1ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button5, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addGroup(h1ContentPaneLayout.createParallelGroup()
                            .addComponent(button3, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(78, Short.MAX_VALUE))
            );
            h1ContentPaneLayout.setVerticalGroup(
                h1ContentPaneLayout.createParallelGroup()
                    .addGroup(h1ContentPaneLayout.createSequentialGroup()
                        .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(h1ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button3, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(h1ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button4, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button5, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button6, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(34, Short.MAX_VALUE))
            );
            h1.pack();
            h1.setLocationRelativeTo(h1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    h1.setVisible(true);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - buvu
    private JFrame h1;
    private JPanel panel1;
    private JLabel labet1;
    private JMenuItem menuItem1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args){
        home1 hom =new home1();
    }
}
