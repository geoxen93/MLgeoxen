package ml;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;
/**
 *
 * @author Admin
 */
public class Search_Module extends javax.swing.JFrame implements ActionListener {
   
   
  
    /**
     * Creates new form Work
     */
    public Search_Module() {
    
        
        
        JL_id = new JLabel("Enter ID:"); 
        JL_id.setBounds(25, 23, 200, 25); 
        JT_id = new JTextField(50); 
        JT_id.setBounds(130, 23, 150, 30); 
        btn_search = new JButton("Search"); 
        btn_search.setBounds(325, 80, 120, 50); 
        btn_search.addActionListener(this); 
        setVisible(true); 
        
         setLocation((Toolkit.getDefaultToolkit().getScreenSize().width  - getSize().width) / 4, (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 4);
        setSize(500,250); 
        JL_fname = new JLabel("First Name: "); 
        JL_fname.setBounds(25, 50, 120, 25); 
        JT_fname = new JTextField(50); 
        JT_fname.setBounds(130, 50, 150, 30); 
        JL_lname = new JLabel("Last Name: ");
        JL_lname.setBounds(25, 80, 120, 25); 
        JT_lname = new JTextField(50); 
        JT_lname.setBounds(130, 80, 150, 30); 
        JL_age = new JLabel("Birth Year: "); 
        JL_age.setBounds(25, 110, 120, 25); 
        JT_age = new JTextField(50); 
        JT_age.setBounds(130, 110, 150, 30); 
        JL_rate = new JLabel("Rating: "); 
        JL_rate.setBounds(25, 140, 120, 25); 
        JT_rate = new JTextField(50); 
        JT_rate.setBounds(130, 140, 150, 30); 
        
        Font font = new Font("Verdana", Font.BOLD,16);
        JL_id.setFont(font);
        JL_fname.setFont(font);
        JL_lname.setFont(font);
        JL_age.setFont(font);
        JL_rate.setFont(font);
        btn_search.setFont(font);
        setLayout(null); add(btn_search); 
        add(JL_fname); 
        add(JT_fname); 
        add(JL_lname); 
        add(JT_lname); 
        add(JL_age); 
        add(JT_age); 
        add(JL_id); 
        add(JT_id);
        add(JL_rate);
        add(JT_rate);

        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JT_rate = new javax.swing.JTextField();
        JL_id = new javax.swing.JLabel();
        JT_age = new javax.swing.JTextField();
        JT_id = new javax.swing.JTextField();
        JT_lname = new javax.swing.JTextField();
        JL_fname = new javax.swing.JLabel();
        btn_search = new javax.swing.JButton();
        JL_age = new javax.swing.JLabel();
        JL_lname = new javax.swing.JLabel();
        JL_rate = new javax.swing.JLabel();
        JT_fname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JT_rate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_rateActionPerformed(evt);
            }
        });

        JL_id.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL_id.setText("Enter ID:");

        JT_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_ageActionPerformed(evt);
            }
        });

        JT_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_idActionPerformed(evt);
            }
        });
        JT_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JT_idKeyPressed(evt);
            }
        });

        JT_lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_lnameActionPerformed(evt);
            }
        });

        JL_fname.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL_fname.setText("First Name:");

        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        JL_age.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL_age.setText("Age:");

        JL_lname.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL_lname.setText("Last Name:");

        JL_rate.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JL_rate.setText("Rating:");

        JT_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_fnameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(JL_id, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_fname)
                    .addComponent(JL_lname)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JL_rate)
                            .addComponent(JL_age, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(JT_id, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT_age, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_id)
                    .addComponent(JT_id, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_lname)
                    .addComponent(JT_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JT_age, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_age, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JT_lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_lnameActionPerformed

    private void JT_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_ageActionPerformed

    private void JT_rateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_rateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_rateActionPerformed

    private void JT_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_fnameActionPerformed

    private void JT_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_idActionPerformed
       
    }//GEN-LAST:event_JT_idActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed

    }//GEN-LAST:event_btn_searchActionPerformed

    private void JT_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JT_idKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            
            btn_search.doClick();
        }
    }//GEN-LAST:event_JT_idKeyPressed

    /**
     * @param args the command line arguments
     */
    @Override
    public void actionPerformed(ActionEvent e) { 
    Function f = new Function(); ResultSet rs = null; 
    String fn = "fname"; 
    String ln = "lname"; 
    String ag = "age"; 
    String rt = "rate";
    rs = f.find(JT_id.getText()); try{ if(rs.next()){ JT_fname.setText(rs.getString("fname"));
    JT_lname.setText(rs.getString("lname")); JT_age.setText(rs.getString("age")); JT_rate.setText(rs.getString("rate"));
    } else{ JOptionPane.showMessageDialog(null, "No Data For This ID. Please Check ID.");
    } }catch(Exception ex){ JOptionPane.showMessageDialog(null, ex.getMessage()); } }
       

    
   public class Function{ Connection con = null;
   ResultSet rs = null; PreparedStatement ps = null;
   public ResultSet find(String s){ try{ con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","1520");
   ps = con.prepareStatement("select * from douleia where id = ?"); 
   ps.setString(1,s); rs = ps.executeQuery();
   }catch(Exception ex){ JOptionPane.showMessageDialog(null, ex.getMessage()); } return rs; } }

    
    
    public static void main(String args[]) {
        new Search_Module();
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
            java.util.logging.Logger.getLogger(Search_Module.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_Module.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_Module.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_Module.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search_Module().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_age;
    private javax.swing.JLabel JL_fname;
    private javax.swing.JLabel JL_id;
    private javax.swing.JLabel JL_lname;
    private javax.swing.JLabel JL_rate;
    private javax.swing.JTextField JT_age;
    private javax.swing.JTextField JT_fname;
    private javax.swing.JTextField JT_id;
    private javax.swing.JTextField JT_lname;
    private javax.swing.JTextField JT_rate;
    private javax.swing.JButton btn_search;
    // End of variables declaration//GEN-END:variables
}
