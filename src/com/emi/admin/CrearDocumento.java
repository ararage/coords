package com.emi.admin;

import com.emi.main.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.Timer;
import javax.swing.text.MaskFormatter;

public class CrearDocumento extends javax.swing.JFrame {

    public CrearDocumento() {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.labelError.setVisible(false);
        this.labelError.setText("");
        this.labelErrorFCA.setVisible(false);
        this.labelErrorFCA.setText("");
        this.labelErrorFechaDoc.setVisible(false);
        this.labelErrorFechaDoc.setText("");
        this.labelErrorFechaFCA.setVisible(false);
        this.labelErrorFechaFCA.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        labelError = new javax.swing.JLabel();
        labelErrorFCA = new javax.swing.JLabel();
        labelErrorFechaFCA = new javax.swing.JLabel();
        labelErrorFechaDoc = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Sistema de Control y Seguimiento de Coordenadas");

        jLabel2.setText("Ingrese No. F.C.A.");

        jLabel3.setText("Fecha F.C.A.");

        jLabel4.setText("Fecha de T.I.");

        try{
            jFormattedTextField1 =
            new JFormattedTextField(new MaskFormatter("########"));
        }catch(java.text.ParseException e){
            e.printStackTrace();
        }
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });

        try{
            jFormattedTextField2 =
            new JFormattedTextField(new MaskFormatter("##/##/####"));
        }catch(java.text.ParseException e){
            e.printStackTrace();
        }
        jFormattedTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField2ActionPerformed(evt);
            }
        });

        try{
            jFormattedTextField3 =
            new JFormattedTextField(new MaskFormatter("##/##/####"));
        }catch(java.text.ParseException e){
            e.printStackTrace();
        }
        jFormattedTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField3ActionPerformed(evt);
            }
        });

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        labelError.setText("jLabel5");

        labelErrorFCA.setText("jLabel6");

        labelErrorFechaFCA.setText("jLabel7");

        labelErrorFechaDoc.setText("jLabel8");

        jLabel5.setText("Ingrese T.I.");

        jMenu3.setText("Archivo");

        jMenuItem1.setText("Menu Principal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Cerrar Sesión");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(111, 111, 111))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(78, 78, 78)
                                .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelErrorFechaDoc))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(78, 78, 78)
                                .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelErrorFechaFCA))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelError, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5))
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField1)
                                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))))
                                .addGap(18, 18, 18)
                                .addComponent(labelErrorFCA))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jButton1)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelErrorFechaDoc))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelErrorFechaFCA)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelErrorFCA))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelError)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if((jFormattedTextField1 != null && !jFormattedTextField1.getText().equals("")) && 
            (jFormattedTextField2 != null && !jFormattedTextField2.getText().equals("")) &&
            (jFormattedTextField3 != null && !jFormattedTextField3.getText().equals("")) &&
            (jTextField1 != null && !jTextField1.getText().equals(""))){
            boolean fechaFCA = false;
            boolean fechaDoc = false;
            boolean fca_ = false;
            //Verificamos si la fecha FCA es valida
            SimpleDateFormat dateF = new SimpleDateFormat("dd/mm/yyyy");
            try{
                dateF.parse(jFormattedTextField2.getText());
                fechaFCA = true;
            }catch(ParseException e){
                this.labelErrorFechaFCA.setVisible(true);
                this.labelErrorFechaFCA.setText("Fecha FCA invalida");
            }
            try{
                dateF.parse(jFormattedTextField3.getText());
                fechaDoc = true;
            }catch(ParseException e){
                this.labelErrorFechaDoc.setVisible(true);
                this.labelErrorFechaDoc.setText("Fecha Doc invalida");
            }
            
            if (jFormattedTextField1.getText().length() < 8){
                this.labelErrorFCA.setVisible(true);
                this.labelErrorFCA.setText("Error en el FCA");
            }else{
                fca_ = true;
            }
            
            if(fca_ && fechaFCA && fechaFCA){
                String fca = jFormattedTextField1.getText()+"|"+
                        jFormattedTextField2.getText()+"|"+ 
                        jFormattedTextField3.getText()+"|"+ 
                        jTextField1.getText()+"\n";
                this.labelError.setVisible(true);
                this.labelErrorFCA.setVisible(false);
                this.labelErrorFechaDoc.setVisible(false);
                this.labelErrorFechaFCA.setVisible(false);
                this.labelError.setText("Guardado Exitosamente");
                this.guardarFCA(fca);
                redirect();
            }
        }else{
            this.labelError.setVisible(true);
            this.labelError.setText("Llena todos los campos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void redirect(){
        ActionListener taskPerformer = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VentanaDosCrearDocumento().setVisible(true);
                hideThis();
            }
        };
        Timer timer = new Timer(3000 ,taskPerformer);
        timer.setRepeats(false);
        timer.start();
    }
    
    private void hideThis(){
        this.setVisible(false);
    }
    
    private void jFormattedTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField2ActionPerformed

    private void jFormattedTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField3ActionPerformed

    private void guardarFCA(String fca){
        if(!new File("temp.dat").isFile()){
            try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                 new FileOutputStream("temp.dat"), "utf-8"))) {
                writer.write(fca);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(CrearDocumento.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(CrearDocumento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            String content;
            try {
                content = new String(Files.readAllBytes(Paths.get("temp.dat")));
                System.out.println(content);
                Files.write(Paths.get("temp.dat"), fca.getBytes(), StandardOpenOption.APPEND);
            } catch (IOException ex) {
                Logger.getLogger(CrearDocumento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelError;
    private javax.swing.JLabel labelErrorFCA;
    private javax.swing.JLabel labelErrorFechaDoc;
    private javax.swing.JLabel labelErrorFechaFCA;
    // End of variables declaration//GEN-END:variables
}
