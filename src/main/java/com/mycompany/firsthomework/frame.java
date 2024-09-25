package com.mycompany.firsthomework;

import java.awt.event.*;
import java.io.*;

public class frame extends javax.swing.JFrame {
      
    public frame() {
        initComponents();
    }
  /*  void addInf(String j) throws IOException{
     try {
         FileWriter file = new FileWriter("input.txt");
         file.write(j);
      System.out.println("successfully wrote in the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");}
     }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        first = new javax.swing.JTextField();
        second = new javax.swing.JTextField();
        third = new javax.swing.JTextField();
        forth = new javax.swing.JTextField();
        fifth = new javax.swing.JTextField();
        bName = new javax.swing.JLabel();
        ISBN = new javax.swing.JLabel();
        auther = new javax.swing.JLabel();
        PNumber = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        add = new javax.swing.JButton();
        search = new javax.swing.JButton();
        jLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(246, 255, 246));

        jPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 15));

        first.setBackground(new java.awt.Color(234, 255, 234));
        first.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        second.setBackground(new java.awt.Color(234, 255, 234));
        second.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        third.setBackground(new java.awt.Color(234, 255, 234));
        third.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        forth.setBackground(new java.awt.Color(234, 255, 234));
        forth.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        fifth.setBackground(new java.awt.Color(234, 255, 234));
        fifth.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        bName.setBackground(new java.awt.Color(204, 255, 204));
        bName.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        bName.setForeground(new java.awt.Color(0, 102, 0));
        bName.setText("B Name:");
        bName.setToolTipText("");
        bName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));

        ISBN.setBackground(new java.awt.Color(204, 255, 204));
        ISBN.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        ISBN.setForeground(new java.awt.Color(0, 102, 0));
        ISBN.setText("ISBN:");
        ISBN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));

        auther.setBackground(new java.awt.Color(204, 255, 204));
        auther.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        auther.setForeground(new java.awt.Color(0, 102, 0));
        auther.setText("Auther:");
        auther.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));

        PNumber.setBackground(new java.awt.Color(204, 255, 204));
        PNumber.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        PNumber.setForeground(new java.awt.Color(0, 102, 0));
        PNumber.setText("P.Number:");
        PNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));

        date.setBackground(new java.awt.Color(204, 255, 204));
        date.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        date.setForeground(new java.awt.Color(0, 102, 0));
        date.setText("DATE:");
        date.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));

        delete.setBackground(new java.awt.Color(204, 255, 204));
        delete.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 102, 51));
        delete.setText("DELETE");

        update.setBackground(new java.awt.Color(204, 255, 204));
        update.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        update.setForeground(new java.awt.Color(0, 102, 51));
        update.setText("UPDATE");

        add.setBackground(new java.awt.Color(204, 255, 204));
        add.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        add.setForeground(new java.awt.Color(0, 102, 51));
        add.setText("ADD");

        search.setBackground(new java.awt.Color(204, 255, 204));
        search.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        search.setForeground(new java.awt.Color(0, 102, 51));
        search.setText("SEARCH");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date)
                            .addComponent(PNumber)
                            .addComponent(bName)
                            .addComponent(ISBN)
                            .addComponent(auther))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(first)
                                .addComponent(second)
                                .addComponent(third, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(forth)
                                .addComponent(fifth, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delete)
                            .addComponent(add))
                        .addGap(41, 41, 41)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(search)
                            .addComponent(update))
                        .addGap(24, 24, 24)))
                .addGap(49, 49, 49))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bName)
                    .addComponent(first, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ISBN)
                    .addComponent(second, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(auther)
                    .addComponent(third, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(PNumber)
                        .addGap(18, 18, 18)
                        .addComponent(date))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(forth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fifth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(search))
                .addGap(17, 17, 17)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete)
                    .addComponent(update))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLabel.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel.setForeground(new java.awt.Color(0, 102, 51));
        jLabel.setText("BOOKS SYSTEM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(311, Short.MAX_VALUE)
                .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(309, 309, 309))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
      
     /*  add.addActionListener((ActionEvent e) -> {
          String ALL;
          String firstData=first.getText();
          String secondData=second.getText();
          String thirdData=third.getText();
          String forthData=forth.getText();
          String fifthData=fifth.getText();
          
          ALL=firstData+","+secondData+","+thirdData+","+forthData+"," +fifthData;
          try {
              addInf(ALL);
          } catch (IOException ex) {
              System.out.println(".errore");
          }
      }); */ 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ISBN;
    private javax.swing.JLabel PNumber;
    private javax.swing.JButton add;
    private javax.swing.JLabel auther;
    private javax.swing.JLabel bName;
    private javax.swing.JLabel date;
    private javax.swing.JButton delete;
    private javax.swing.JTextField fifth;
    private javax.swing.JTextField first;
    private javax.swing.JTextField forth;
    private javax.swing.JLabel jLabel;
    private javax.swing.JPanel jPanel;
    private javax.swing.JButton search;
    private javax.swing.JTextField second;
    private javax.swing.JTextField third;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
 
   
    public static void main(String args[]) throws Exception { frame j=new frame();  }
}
