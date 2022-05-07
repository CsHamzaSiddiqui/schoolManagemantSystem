/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import DAOs.studentDAO;
import entities.student;
import java.sql.Date;
import utils.browseImage;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import utils.imageConversion;

/**
 *
 * @author Laptop Point
 */
public class Home extends javax.swing.JFrame {
     studentDAO dao=new studentDAO();
     viewStudent viewStd=new viewStudent();
     updateStudent updateStd = new updateStudent();
    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        addstd.setVisible(false);
        
        jPanel4.add(viewStd);
        viewStd.setBounds(0, 0, 1280, 530);
        viewStd.setVisible(false);
        
        jPanel4.add(updateStd);
        updateStd.setBounds(0, 0, 1280, 530);
        updateStd.setVisible(false);
        
    }

    public void resetValues(){
        id.setText(String.valueOf(dao.getMaxId()));
        name.setText("");
        className.setText("");
        bform.setText("");
        address.setText("");
        roll.setText("");
        cast.setText("");
        fatherCNIC.setText("");
        fatherName.setText("");
        fatherPh.setText("");
        religion.setText("");
        motherName.setText("");
        motherCNIC.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        StudentBox = new javax.swing.JComboBox<>();
        TeacherBox = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        addstd = new javax.swing.JPanel();
        bform = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        path = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        admission = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        roll = new javax.swing.JTextField();
        image = new javax.swing.JLabel();
        className = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        fatherName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        fatherCNIC = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        motherName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        motherCNIC = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        religion = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cast = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        fatherPh = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setForeground(new java.awt.Color(0.0f, 0.0f, 0.0f, 0.1f));
        jPanel2.setLayout(null);

        title.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Home");
        jPanel2.add(title);
        title.setBounds(250, 10, 820, 60);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 20, 1360, 80);

        StudentBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student Details", "View Students", "Add Student", "Update Student", "Delete Student" }));
        StudentBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                StudentBoxItemStateChanged(evt);
            }
        });

        TeacherBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teacher Details", "View Teachers", "Add  Teacher", "Update Teacher", "Delete Teacher" }));
        TeacherBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TeacherBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(StudentBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TeacherBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1064, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StudentBox, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(TeacherBox)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 100, 1370, 30);

        jPanel4.setBackground(new java.awt.Color(51, 51, 255));
        jPanel4.setLayout(null);

        addstd.setLayout(null);

        bform.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bform.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bformKeyPressed(evt);
            }
        });
        addstd.add(bform);
        bform.setBounds(270, 200, 270, 34);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("B.Form No");
        addstd.add(jLabel3);
        jLabel3.setBounds(160, 200, 120, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Name");
        addstd.add(jLabel4);
        jLabel4.setBounds(160, 150, 120, 30);

        name.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addstd.add(name);
        name.setBounds(270, 150, 270, 34);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Sr. NO");
        addstd.add(jLabel5);
        jLabel5.setBounds(160, 100, 120, 30);

        id.setEditable(false);
        id.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addstd.add(id);
        id.setBounds(270, 100, 270, 34);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Address");
        addstd.add(jLabel6);
        jLabel6.setBounds(160, 400, 120, 30);

        address.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        addstd.add(address);
        address.setBounds(270, 400, 680, 34);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Class Name");
        addstd.add(jLabel7);
        jLabel7.setBounds(590, 100, 120, 30);

        path.setEditable(false);
        path.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addstd.add(path);
        path.setBounds(1020, 350, 190, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Admission Date");
        addstd.add(jLabel8);
        jLabel8.setBounds(1000, 90, 120, 30);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        addstd.add(jButton1);
        jButton1.setBounds(1020, 390, 190, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Add Student");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        addstd.add(jButton2);
        jButton2.setBounds(450, 470, 240, 40);

        admission.setDateFormatString("yyyy-MM-dd");
        addstd.add(admission);
        admission.setBounds(1000, 130, 200, 30);
        admission.setDate(Date.valueOf(LocalDate.now()));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Roll No");
        addstd.add(jLabel9);
        jLabel9.setBounds(590, 150, 120, 30);

        roll.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addstd.add(roll);
        roll.setBounds(700, 150, 250, 34);

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imageicon.png"))); // NOI18N
        addstd.add(image);
        image.setBounds(1030, 200, 140, 130);

        className.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addstd.add(className);
        className.setBounds(700, 100, 250, 34);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Father's Name");
        addstd.add(jLabel11);
        jLabel11.setBounds(590, 200, 120, 30);

        fatherName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addstd.add(fatherName);
        fatherName.setBounds(700, 200, 250, 34);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Father's CNIC");
        addstd.add(jLabel12);
        jLabel12.setBounds(160, 250, 120, 30);

        fatherCNIC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        fatherCNIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fatherCNICKeyPressed(evt);
            }
        });
        addstd.add(fatherCNIC);
        fatherCNIC.setBounds(270, 250, 270, 34);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Mother's Name");
        addstd.add(jLabel13);
        jLabel13.setBounds(160, 300, 120, 30);

        motherName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addstd.add(motherName);
        motherName.setBounds(270, 300, 270, 34);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Mother's CNIC");
        addstd.add(jLabel14);
        jLabel14.setBounds(590, 300, 120, 30);

        motherCNIC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        motherCNIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                motherCNICKeyPressed(evt);
            }
        });
        addstd.add(motherCNIC);
        motherCNIC.setBounds(700, 300, 250, 34);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("Religion");
        addstd.add(jLabel15);
        jLabel15.setBounds(160, 350, 120, 30);

        religion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addstd.add(religion);
        religion.setBounds(270, 350, 270, 34);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("Cast");
        addstd.add(jLabel16);
        jLabel16.setBounds(590, 350, 120, 30);

        cast.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addstd.add(cast);
        cast.setBounds(700, 350, 250, 34);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("Father's Ph.");
        addstd.add(jLabel17);
        jLabel17.setBounds(590, 250, 120, 30);

        fatherPh.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        fatherPh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fatherPhKeyPressed(evt);
            }
        });
        addstd.add(fatherPh);
        fatherPh.setBounds(700, 250, 250, 34);

        jPanel4.add(addstd);
        addstd.setBounds(0, 0, 1280, 530);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(30, 160, 1280, 530);
        jPanel4.setVisible(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/school/homeback.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1570, 750);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1354, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StudentBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_StudentBoxItemStateChanged
        TeacherBox.setSelectedIndex(0);
        if(StudentBox.getSelectedIndex()>0){
            jPanel4.setVisible(true);
            title.setText((String) StudentBox.getSelectedItem());
            switch (StudentBox.getSelectedIndex()) {
                case 1:
                    addstd.setVisible(false);
                    updateStd.setVisible(false);
                    viewStd.setVisible(true);
                    viewStd.setValues();
                    break;
                case 2:
                    addstd.setVisible(true);
                    viewStd.setVisible(false);
                    updateStd.setVisible(false);
                    resetValues();
                    break;
                case 3:
                case 4:
                    addstd.setVisible(false);
                    updateStd.setVisible(true);
                    viewStd.setVisible(false);
                    updateStd.resetValues((String) StudentBox.getSelectedItem());
                    break;
                default:
                    break;
            }
        }else{
            jPanel4.setVisible(false);
            title.setText("HOME");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentBoxItemStateChanged

    private void TeacherBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TeacherBoxItemStateChanged
        StudentBox.setSelectedIndex(0);
        if(TeacherBox.getSelectedIndex()>0){
            title.setText((String) TeacherBox.getSelectedItem());
        }else{
            title.setText("HOME");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_TeacherBoxItemStateChanged

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        browseImage browse = new browseImage();
        browse.brows(image, path);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        imageConversion ic=new imageConversion();
        byte[] bytes = ic.fileToByte(path.getText());
        student std=new student();
        std.setId(Integer.parseInt(id.getText()));
        std.setName(name.getText());
        std.setClassName(className.getText());
        std.setCNIC(bform.getText());
        std.setAddress(address.getText());
        std.setAdmissionDate(admission.getDate());
        std.setImage(bytes);
        std.setDeleted(false);
        std.setRollNo(roll.getText());
        std.setCast(cast.getText());
        std.setFatherName(fatherName.getText());
        std.setFatherCNIC(fatherCNIC.getText());
        std.setFatherPh(fatherPh.getText());
        std.setReligion(religion.getText());
        std.setMotherName(motherName.getText());
        std.setMotherCNIC(motherCNIC.getText());
        dao.saveStudent(std);
        JOptionPane.showMessageDialog(null, "Student Saved Successfully...");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bformKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bformKeyPressed
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || Character.isISOControl(c)){
            bform.setEditable(true);
        }else{
            bform.setEditable(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_bformKeyPressed

    private void fatherCNICKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fatherCNICKeyPressed
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || Character.isISOControl(c)){
            fatherCNIC.setEditable(true);
        }else{
            fatherCNIC.setEditable(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_fatherCNICKeyPressed

    private void fatherPhKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fatherPhKeyPressed
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || Character.isISOControl(c)){
            fatherPh.setEditable(true);
        }else{
            fatherPh.setEditable(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_fatherPhKeyPressed

    private void motherCNICKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_motherCNICKeyPressed
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || Character.isISOControl(c)){
            motherCNIC.setEditable(true);
        }else{
            motherCNIC.setEditable(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_motherCNICKeyPressed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> StudentBox;
    private javax.swing.JComboBox<String> TeacherBox;
    private javax.swing.JTextField address;
    private javax.swing.JPanel addstd;
    private com.toedter.calendar.JDateChooser admission;
    private javax.swing.JTextField bform;
    private javax.swing.JTextField cast;
    private javax.swing.JTextField className;
    private javax.swing.JTextField fatherCNIC;
    private javax.swing.JTextField fatherName;
    private javax.swing.JTextField fatherPh;
    private javax.swing.JTextField id;
    public javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField motherCNIC;
    private javax.swing.JTextField motherName;
    private javax.swing.JTextField name;
    private javax.swing.JTextField path;
    private javax.swing.JTextField religion;
    private javax.swing.JTextField roll;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
