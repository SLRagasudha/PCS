
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ragasudha
 */
public class Start extends javax.swing.JFrame {

    /**
     * Creates new form Start
     */
    public Start() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 378));
        setMinimumSize(new java.awt.Dimension(700, 378));
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Upload Videos");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 100, 140, 20);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Predictable Convergent Solutions");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 30, 430, 40);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter Keyword");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 140, 110, 20);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enter Description");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 180, 130, 20);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(200, 140, 130, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(200, 180, 130, 30);

        jButton1.setText("Upload");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(140, 240, 100, 30);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Search videos");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(450, 100, 160, 20);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Provide Keyword");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(380, 140, 130, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(540, 140, 140, 30);

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(560, 190, 100, 30);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Play video");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(400, 270, 100, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select video" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(550, 270, 130, 30);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plain_background_pictures_1280228600.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(500, 900));
        jLabel3.setMinimumSize(new java.awt.Dimension(700, 900));
        jLabel3.setPreferredSize(new java.awt.Dimension(900, 500));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 700, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String keyword =jTextField1.getText();
        String description=jTextField2.getText();
        URL mediaURL = null;
        String file[] = new String[5];
        String replace[] = new String [3];
        String test=null;
        String strQuery=null;
        JFileChooser filechooser = new JFileChooser();
        int result = filechooser.showOpenDialog(this);
        String res=null;
        if(result == JFileChooser.APPROVE_OPTION)
        {
            mediaURL = null;
            try {
                    mediaURL = filechooser.getSelectedFile().toURL();
                } catch (MalformedURLException ex)
                {
                    Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        System.out.println(mediaURL);
       file[0] = mediaURL.toString();
        replace[0] = file[0].replace("file:/","file:///");
        res=replace[0];
        System.out.println(res);
        try {       
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pcs","root","root");
            Statement st = con.createStatement();
            strQuery = "insert into video values('"+keyword+"','"+description+"','"+res+"')"; 
            int rs = st.executeUpdate(strQuery);
            System.out.println(rs);
            System.out.println("Query Executed Successfully++++++++++++++");
             //PreparedStatement pst=con.prepareStatement("insert into video values(?,?,?)");
             //pst.setString(1,keyword);
             //pst.setString(2,description);
             //pst.setInt(3,result);
             //int n= pst.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String searchkeyword =jTextField3.getText();
        String keyword=null;
        String desc=null;
        String path=null;
         String file[] = new String[5];
        try {       
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pcs","root","root");
            Statement st = con.createStatement();
            ResultSet rs1;
            //rs1 = st.executeQuery("SELECT videopath FROM video where keyword='"+keyword+"'");
         rs1 = st.executeQuery("SELECT * FROM video");
         while(rs1.next())
         {
                    keyword=rs1.getString("keyword");
                    desc=rs1.getString("description");
                    path=rs1.getString("videopath");
                    System.out.println("key::::"+keyword);
                    System.out.println("desc::::"+desc);
                    System.out.println("path::::"+path);
                    if(desc.contains(searchkeyword))
                    {
                        String wanted=path;
                        System.out.println("-------------:"+wanted);
                        jComboBox1.addItem(desc);
                        
                    }
                    
	  }
            //System.out.println("path::::"+path);
            
            
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String video=null; 
       String video1[] = new String[3];
       String videopath = null;
        video=jComboBox1.getSelectedItem().toString();
        System.out.println("combo::::"+video);
        try {       
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pcs","root","root");
            Statement st = con.createStatement();
            ResultSet rs1;
            rs1 = st.executeQuery("SELECT videopath FROM video where description='"+video+"'");
       while(rs1.next())
				   {
                    videopath=rs1.getString("videopath");
                     System.out.println("path+++++++++++++"+videopath);
				   }
            //System.out.println("path+++++++++++++"+videopath);
           // jComboBox1.addItem(path);
            video1[0]=videopath;
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }
        MediaPlayer mp = new MediaPlayer();
            MediaPlayer.main(video1);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
