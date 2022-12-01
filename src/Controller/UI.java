package Controller;

import Dao.subLN;
import Model.LifeClass;
import java.util.List;
import Controller.Puzzle;

public class UI extends javax.swing.JFrame {

    public UI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        birth = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        output = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        login = new javax.swing.JButton();
        nametexfield = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        output2 = new javax.swing.JTextArea();
        read = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        idTEXTFIELD = new javax.swing.JLabel();
        id = new javax.swing.JTextField();

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controller/99.png"))); // NOI18N
        jLabel9.setText("jLabel9");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controller/99.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("標楷體", 0, 16)); // NOI18N
        jLabel1.setText("生日");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 40, 30));

        birth.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.add(birth, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 100, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setForeground(new java.awt.Color(102, 0, 0));
        jButton1.setText("計算");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 60, -1));

        output.setBackground(new java.awt.Color(248, 248, 248));
        output.setFont(new java.awt.Font("新細明體", 1, 12)); // NOI18N
        output.setForeground(new java.awt.Color(0, 102, 102));
        output.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(output, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 170, 40));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel2.setText("-----結     果-----");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, -1));

        jLabel3.setFont(new java.awt.Font("標楷體", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 0));
        jLabel3.setText("生");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        jLabel4.setFont(new java.awt.Font("標楷體", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("命");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("標楷體", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 204));
        jLabel5.setText("靈");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("標楷體", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6.setText("數");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.setForeground(new java.awt.Color(102, 0, 0));
        jButton2.setText("重填");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 60, -1));

        login.setBackground(new java.awt.Color(255, 231, 219));
        login.setFont(new java.awt.Font("標楷體", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 51, 51));
        login.setText("詳細解說(持續更新)");
        login.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, -1, 40));

        nametexfield.setFont(new java.awt.Font("標楷體", 0, 16)); // NOI18N
        nametexfield.setText("姓名");
        jPanel1.add(nametexfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 400, -1, 30));

        name.setBackground(new java.awt.Color(246, 246, 246));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 100, 30));

        jLabel8.setText("範例:19990909");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controller/99.png"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 50, 360, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 360, 520));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        output2.setBackground(new java.awt.Color(248, 248, 248));
        output2.setColumns(20);
        output2.setFont(new java.awt.Font("標楷體", 1, 16)); // NOI18N
        output2.setForeground(new java.awt.Color(0, 102, 102));
        output2.setRows(5);
        jScrollPane1.setViewportView(output2);

        read.setBackground(new java.awt.Color(245, 225, 206));
        read.setForeground(new java.awt.Color(102, 51, 0));
        read.setText("讀取資料");
        read.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                readMouseClicked(evt);
            }
        });

        delete.setBackground(new java.awt.Color(241, 223, 206));
        delete.setForeground(new java.awt.Color(102, 51, 0));
        delete.setText("刪除資料");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });

        add.setBackground(new java.awt.Color(246, 224, 203));
        add.setForeground(new java.awt.Color(102, 51, 0));
        add.setText("新增資料");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });

        update.setBackground(new java.awt.Color(242, 222, 202));
        update.setForeground(new java.awt.Color(102, 51, 0));
        update.setText("修改資料");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });

        idTEXTFIELD.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        idTEXTFIELD.setText("輸入編號");

        id.setBackground(new java.awt.Color(248, 248, 248));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(add)
                            .addComponent(read))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idTEXTFIELD)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(update, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(delete, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(add)
                        .addComponent(idTEXTFIELD)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(delete))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(read)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 360, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents
LifeClass L=null;
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String B=birth.getText();
        String N=name.getText();
        L=new LifeClass(N);
        try
        {
            char[] c=B.toCharArray();
            int a1 = Character.getNumericValue(c[0]);
            int a2 = Character.getNumericValue(c[1]);
            int a3 = Character.getNumericValue(c[2]);
            int a4 = Character.getNumericValue(c[3]);
            int a5 = Character.getNumericValue(c[4]);
            int a6 = Character.getNumericValue(c[5]);
            int a7 = Character.getNumericValue(c[6]);
            int a8 = Character.getNumericValue(c[7]);
            int sum1=a1+a2+a3+a4+a5+a6+a7+a8;

            if(sum1<10)
            {
                output.setText("親愛的 "+L.getName()+",您是 "+sum1+" 號人");
            }

            String b = String.valueOf(sum1);
            char[] x=b.toCharArray();
            int b1 = Character.getNumericValue(x[0]);
            int b2 = Character.getNumericValue(x[1]);
            int sum2= b1+b2;

            if(sum2<10)
            {
                output.setText("親愛的 "+L.getName()+",您是 "+sum2+" 號人");
            }

            String cc = String.valueOf(sum2);
            char[] x1=cc.toCharArray();
            //System.out.println(x[0]);
            int c1 = Character.getNumericValue(x1[0]);
            int c2 = Character.getNumericValue(x1[1]);
            int sum3= c1+c2;

            if(sum3<10)
            {
                output.setText("親愛的 "+L.getName()+",您是 "+sum3+" 號人");
            }

            String dd = String.valueOf(sum3);
            char[] x2=dd.toCharArray();
            int d1 = Character.getNumericValue(x1[0]);
            int d2 = Character.getNumericValue(x1[1]);
            int sum4= d1+d2;

            if(sum4<10)
            {
                output.setText("親愛的 "+L.getName()+",您是 "+sum4+" 號人");
            }
            

        }
        catch(Exception e)
        {

        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       output.setText(null);
       name.setText(null);
       birth.setText(null);
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        String N=name.getText();
        String B=birth.getText();
        //new subLN().add(N,B);
        new subLN().add(new LifeClass(N,B));
        output2.setText(new subLN().Q());
       
    }//GEN-LAST:event_addMouseClicked

    private void readMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readMouseClicked
        output2.setText(new subLN().Q());
          
    }//GEN-LAST:event_readMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        int ID=Integer.parseInt(id.getText());
        new subLN().delete(ID);
        output2.setText(new subLN().Q());
        
    }//GEN-LAST:event_deleteMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        String N=name.getText();
        String B=birth.getText();
        int ID=Integer.parseInt(id.getText());
        
        LifeClass L=new subLN().Qid(ID);
          L.setName(N);
          L.setBirth(B);
  
          new subLN().update(L);
        
        output2.setText(new subLN().Q());
        
        
        
    }//GEN-LAST:event_updateMouseClicked

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        // TODO add your handling code here:
        Puzzle P=new Puzzle();
        P.setVisible(true);
    }//GEN-LAST:event_loginMouseClicked

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField birth;
    private javax.swing.JButton delete;
    private javax.swing.JTextField id;
    private javax.swing.JLabel idTEXTFIELD;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton login;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nametexfield;
    private javax.swing.JTextField output;
    private javax.swing.JTextArea output2;
    private javax.swing.JButton read;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
