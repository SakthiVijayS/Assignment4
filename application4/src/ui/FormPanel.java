/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Patient;

/**
 *
 * @author shakt
 */
public class FormPanel extends javax.swing.JPanel {

    /**
     * Creates new form formPanel
     */
    private JPanel bottomPanel;
    Patient tempPatient;
    public FormPanel(JPanel inputPanel) {
        initComponents();
        this.bottomPanel = inputPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGroup = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        fnameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        fnameField = new javax.swing.JTextField();
        ageField = new javax.swing.JTextField();
        maleButton = new javax.swing.JRadioButton();
        femaleButton = new javax.swing.JRadioButton();
        nondiscloseButton = new javax.swing.JRadioButton();
        typeDropdown = new javax.swing.JComboBox<>();
        typeLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        lnameLabel = new javax.swing.JLabel();
        lnameField = new javax.swing.JTextField();
        uploadPhotoButton = new javax.swing.JButton();
        messageField = new javax.swing.JTextField();
        messageLabel = new javax.swing.JLabel();

        mainPanel.setBackground(new java.awt.Color(255, 255, 51));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("User Form");

        fnameLabel.setText("First Name");

        ageLabel.setText("Age");

        genderLabel.setText("Gender");
        genderLabel.setToolTipText("");

        fnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameFieldActionPerformed(evt);
            }
        });

        genderGroup.add(maleButton);
        maleButton.setText("Male");
        maleButton.setActionCommand("MALE");
        maleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleButtonActionPerformed(evt);
            }
        });

        genderGroup.add(femaleButton);
        femaleButton.setText("Female");
        femaleButton.setActionCommand("FEMALE");
        femaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleButtonActionPerformed(evt);
            }
        });

        genderGroup.add(nondiscloseButton);
        nondiscloseButton.setText("Rather Not Say");
        nondiscloseButton.setActionCommand("UNDISCLOSED");
        nondiscloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nondiscloseButtonActionPerformed(evt);
            }
        });

        typeDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Guest" }));
        typeDropdown.setSelectedIndex(-1);

        typeLabel.setText("Type");

        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        emailLabel.setText("E-mail");

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        lnameLabel.setText("Last Name");

        uploadPhotoButton.setText("Upload Photo");
        uploadPhotoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadPhotoButtonActionPerformed(evt);
            }
        });

        messageLabel.setText("Message");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(uploadPhotoButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lnameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                    .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(typeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genderLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fnameLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(typeDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fnameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ageField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lnameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(maleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(femaleButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nondiscloseButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(13, 13, 13)
                .addComponent(messageLabel)
                .addGap(41, 41, 41)
                .addComponent(messageField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(titleLabel)
                .addGap(38, 38, 38)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fnameLabel)
                            .addComponent(fnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(messageLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lnameLabel)
                            .addComponent(lnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageLabel)
                            .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderLabel)
                            .addComponent(maleButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(femaleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nondiscloseButton)
                        .addGap(40, 40, 40)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(typeDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeLabel)))
                    .addComponent(messageField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(uploadPhotoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitButton)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameFieldActionPerformed

    private void maleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleButtonActionPerformed

    private void femaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleButtonActionPerformed

    private void nondiscloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nondiscloseButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nondiscloseButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        Patient newPatient = new Patient();
        newPatient.setFname(fnameField.getText());
        newPatient.setMessage(messageField.getText());
        String message = newPatient.getMessage();
        String fname = newPatient.getFname();
        if (!fname.matches("^[a-zA-Z\\s]+$") || fname.isEmpty() || fname.length() > 50) {
            JOptionPane.showMessageDialog(this, "Please enter a valid First name( no numbers or special characters).", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        newPatient.setLname(lnameField.getText());
        String lname = newPatient.getLname();
        if (!lname.matches("^[a-zA-Z\\s]+$") || lname.isEmpty() || lname.length() > 50) {
            JOptionPane.showMessageDialog(this, "Please enter a valid Last name ( no numbers or special characters).", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
         newPatient.setAge(ageField.getText());
         String age = newPatient.getAge();
        int tage = -1;
        try {
            tage = Integer.parseInt(age);
            if (tage < 1 || tage > 150) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid age (1-120).", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            String ttype= typeDropdown.getSelectedItem().toString();
        }catch (Exception ty) {
            JOptionPane.showMessageDialog(this, "Please select a Client Type (Guest or Customer).", "Validation Error", JOptionPane.ERROR_MESSAGE);
        }
        newPatient.setType(typeDropdown.getSelectedItem().toString());
        String type = newPatient.getType();

        try{
            String tgender = genderGroup.getSelection().getActionCommand();
        }catch(Exception x){
            JOptionPane.showMessageDialog(this, "Please select a gender.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        }
        newPatient.setGender(genderGroup.getSelection().getActionCommand());
        String gender = newPatient.getGender();

        boolean isEmailValid = false;
        try{
            String email = emailField.getText();
            String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
            Pattern pattern = Pattern.compile(emailRegex);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {

                isEmailValid = true;
            } else {

                throw new IllegalArgumentException("Invalid email format");
            }} catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(this, "Enter a valid email", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;}
            newPatient.setTemail(emailField.getText());
            String temail = newPatient.getTemail();
            
            try{
            newPatient.profilePic = tempPatient.profilePic;
            }catch (Exception ex)  {
              JOptionPane.showMessageDialog(this, "Please enter correct details", "Error", HEIGHT);
            }
              ViewPanel newViewPanel = new ViewPanel(newPatient);
        bottomPanel.add(newViewPanel);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
        
        
        
        
        
        
            System.out.println();
            JOptionPane.showMessageDialog(this, "First Name: " + fname + "\n" +
                "Last Name: " + lname + "\n" +
                "Age: " + age + "\n" +
                "Gender: " + gender + "\n" +
                "Type: " + type + "\n" +
                "Email: " + temail, "User Information", HEIGHT);

    }//GEN-LAST:event_submitButtonActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void uploadPhotoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadPhotoButtonActionPerformed
        // TODO add your handling code here:
       tempPatient= uploadPhoto(tempPatient);
    }//GEN-LAST:event_uploadPhotoButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JRadioButton femaleButton;
    private javax.swing.JTextField fnameField;
    private javax.swing.JLabel fnameLabel;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField lnameField;
    private javax.swing.JLabel lnameLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JRadioButton maleButton;
    private javax.swing.JTextField messageField;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JRadioButton nondiscloseButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JComboBox<String> typeDropdown;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JButton uploadPhotoButton;
    // End of variables declaration//GEN-END:variables

    public Patient uploadPhoto(Patient tempPatient) {
         tempPatient = new Patient();
     JFileChooser file = new JFileChooser();  
    FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "JPG & GIF Images", "jpg", "gif");
    file.setFileFilter(filter);
    int returnVal = file.showOpenDialog(null);
    if(returnVal == JFileChooser.APPROVE_OPTION) {
       try{
         BufferedImage img = ImageIO.read(file.getSelectedFile());
         Image scaled      =  img.getScaledInstance(150,216, Image.SCALE_DEFAULT);
        tempPatient.setProfilePic(new ImageIcon(scaled));
    }                                        
       catch(Exception ex){
           JOptionPane.showMessageDialog(this, "Please upload valid image.", "Error - Invalid image", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
       }
    } 
    return tempPatient;
       
    }
}
