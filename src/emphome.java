import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import java.util.Date;
/*
 * Created by JFormDesigner on Tue Apr 21 19:14:33 IST 2020
 */



/**
 * @author buvu
 */
public class emphome {
    public emphome() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {

        String Eid = textField1.getText();
        String name="", add="", email="", ph="", desig="";
        String basic="", da="", hra="", med="", ded="", net="";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl2", "SYSTEM", "orcl2");

            Statement stmt = con.createStatement();

            final String queryCheck = "Select * from emptab where empId=?";

            final PreparedStatement ps = con.prepareStatement(queryCheck);

            ps.setString(1, Eid);

            final ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                name = rs.getString(3);
                add = rs.getString(4);
                email = rs.getString(5);
                ph = rs.getString(6);
                desig = rs.getString(7);
            }
            con.close();

        } catch (Exception f) {
            System.out.println(f);
        }
        try {
            OutputStream file = new FileOutputStream(new File("E:\\payslip.pdf"));

            Document document = new Document();

            PdfWriter.getInstance(document, file);

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl2", "SYSTEM", "orcl2");

            Statement stmt = con.createStatement();

            final String queryCheck = "Select * from Sal where empId=?";

            final PreparedStatement ps = con.prepareStatement(queryCheck);

            ps.setString(1, Eid);

            final ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                basic = rs.getString(2);
                da = rs.getString(3);
                hra = rs.getString(4);
                med = rs.getString(5);
                ded = rs.getString(7);
                net = rs.getString(8);
            }
            PdfPTable table=new PdfPTable(2);
            PdfPCell cell = new PdfPCell (new Paragraph ("Personal Information"));
            cell.setColspan (2);
            cell.setHorizontalAlignment (Element.ALIGN_CENTER);
            cell.setPadding (10.0f);
            cell.setBackgroundColor (new BaseColor (140, 221, 8));
            table.addCell(cell);
            table.addCell("Name");
            table.addCell(name);
            table.addCell("address");
            table.addCell(add);
            table.addCell("email");
            table.addCell(email);
            table.addCell("phone no.");
            table.addCell(ph);
            table.addCell("Designation");
            table.addCell(desig);
            table.setSpacingBefore(30.0f);
            table.setSpacingAfter(30.0f);
            PdfPTable table1=new PdfPTable(2);
            PdfPCell cell1 = new PdfPCell (new Paragraph ("PAY SLIP"));
            cell1.setColspan (2);
            cell1.setHorizontalAlignment (Element.ALIGN_CENTER);
            cell1.setPadding (10.0f);
            cell1.setBackgroundColor (new BaseColor (140, 221, 8));
            table1.addCell(cell1);
            table1.addCell("Basic Pay");
            table1.addCell(basic);
            table1.addCell("DA");
            table1.addCell(da);
            table1.addCell("Hra");
            table1.addCell(hra);
            table1.addCell("Medical");
            table1.addCell(med);
            table1.addCell("deduction");
            table1.addCell(ded);
            table1.addCell("Net Pay");
            table1.addCell(net);
            table1.setSpacingBefore(30.0f);
            table1.setSpacingAfter(30.0f);
            document.open();
            Paragraph paragraph1 = new Paragraph();
            paragraph1.add("COMPUTER SOLUTIONS");
            paragraph1.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph1);
            document.add(new Paragraph("Employee Details"));
            document.add(table);
            document.add(new Paragraph("Pay Slip Generated On - "+new Date().toString()));
            document.add(table1);
            document.close();
            file.close();
        }catch(Exception f){ System.out.println(f);}

    }

        private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - buvu
        ehome = new JFrame();
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        textField1 = new JTextField();
        label2 = new JLabel();

        //======== ehome ========
        {
            Container ehomeContentPane = ehome.getContentPane();

            //---- label1 ----
            label1.setText("EMPLOYEE LOGIN");
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 20f));
            label1.setHorizontalAlignment(SwingConstants.CENTER);

            //---- button1 ----
            button1.setText("PAYSLIP");
            button1.addActionListener(e -> button1ActionPerformed(e));

            //---- button2 ----
            button2.setText("EDIT PROFILE");

            //---- label2 ----
            label2.setText("Enter Id");

            GroupLayout ehomeContentPaneLayout = new GroupLayout(ehomeContentPane);
            ehomeContentPane.setLayout(ehomeContentPaneLayout);
            ehomeContentPaneLayout.setHorizontalGroup(
                ehomeContentPaneLayout.createParallelGroup()
                    .addGroup(ehomeContentPaneLayout.createSequentialGroup()
                        .addGroup(ehomeContentPaneLayout.createParallelGroup()
                            .addGroup(ehomeContentPaneLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(label2)
                                .addGap(59, 59, 59)
                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.TRAILING, ehomeContentPaneLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(button2, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(82, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, ehomeContentPaneLayout.createSequentialGroup()
                        .addGap(0, 37, Short.MAX_VALUE)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))
            );
            ehomeContentPaneLayout.setVerticalGroup(
                ehomeContentPaneLayout.createParallelGroup()
                    .addGroup(ehomeContentPaneLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(ehomeContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2))
                        .addGap(62, 62, 62)
                        .addGroup(ehomeContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(71, Short.MAX_VALUE))
            );
            ehome.pack();
            ehome.setLocationRelativeTo(ehome.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
            ehome.setVisible(true);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - buvu
    private JFrame ehome;
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    private JTextField textField1;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args){
        emphome eh =new emphome();
    }
}
