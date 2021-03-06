/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatroom_server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author omar
 */
public class SERVER extends javax.swing.JFrame {

    /**
     * Creates new form SERVER
     */
    
    
    public boolean flag1, flag2;
    private  ServerSocket ss;

    
    
    public SERVER() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        server = new javax.swing.JToggleButton();
        ACC = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        chatDisplay = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        onlineUsers = new javax.swing.JTextArea();
        msg = new javax.swing.JTextField();
        send = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        actionsDisplay = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        portDisplay = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText(" SERVER");

        server.setText("Enable");
        server.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverActionPerformed(evt);
            }
        });

        ACC.setText("Enable");
        ACC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACCActionPerformed(evt);
            }
        });

        jLabel1.setText("Auto Accept Clients");

        chatDisplay.setEditable(false);
        chatDisplay.setColumns(20);
        chatDisplay.setRows(5);
        jScrollPane1.setViewportView(chatDisplay);

        jScrollPane2.setHorizontalScrollBar(null);

        onlineUsers.setEditable(false);
        onlineUsers.setColumns(20);
        onlineUsers.setRows(5);
        jScrollPane2.setViewportView(onlineUsers);

        msg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                msgKeyTyped(evt);
            }
        });

        send.setText("send");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });

        jLabel3.setText("Chat Room");

        jLabel4.setText("Online Users");

        actionsDisplay.setEditable(false);
        actionsDisplay.setColumns(20);
        actionsDisplay.setRows(5);
        jScrollPane3.setViewportView(actionsDisplay);

        jLabel6.setText("Actions");

        jLabel7.setText("port ");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(msg)
                        .addGap(18, 18, 18)
                        .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ACC, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addComponent(jLabel1))
                        .addGap(23, 23, 23)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(server, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(portDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel3)
                .addGap(178, 178, 178)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(244, 244, 244))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ACC))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(send)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(server)
                                    .addComponent(portDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setButtonStatus(boolean kind)//----------------------------------------------
    {
        if(kind)
            server.setText("Enable");
        else
            server.setText("Disable");    
        server.setSelected(!kind);
    }
    
    class getDataFClient implements Runnable{
        
        private Socket client;
        private InetAddress add;
        private String cName, str;
        
        public getDataFClient(Socket client, String cName){
            this.client = client;
            this.cName = cName;
        }

        @Override
        public void run() {
            try{
                add = client.getInetAddress();
                DataInputStream din = new DataInputStream(client.getInputStream());
                while(true){
                    str = din.readUTF();
                    chatDisplay.append('\n' +cName + ": " + str);
                }
            }catch(Exception e){
            }
        }
    }
    
    class clientsThreads implements Runnable{ //-----------------------------------------------
        
        private Socket client;
        private InetAddress cA;
        private String cName;
        private Thread getDataThread;
        
        public clientsThreads(Socket client){
            this.client = client;
            try{
                DataInputStream din = new DataInputStream(client.getInputStream());
                cName = din.readUTF().trim();
                onlineUsers.append(cName + '\n');
            }catch(Exception ee){
                actionsDisplay.append("-At: "+new Date()+" Couldn't get name from "+cA.getHostAddress()+'\n');
                cName = cA.getHostAddress();
            }
            getDataFClient aa = new getDataFClient(client, cName);
            getDataThread = new Thread(aa);
            getDataThread.start();
        }
        
        @Override
        public void run() {
            String str;
            DataOutputStream dout;
            DataInputStream din;
                try{
                    dout = new DataOutputStream(client.getOutputStream());
                    while(true){
                        Thread.sleep(1000);
                        dout = new DataOutputStream(client.getOutputStream());
                        dout.writeUTF(chatDisplay.getText().trim());
                        dout.writeUTF(onlineUsers.getText().trim());
                    }
                }catch(Exception e){
                    actionsDisplay.append("-At " + new Date() + " Error in data transactions with: " + cName + '\n');
                }
            actionsDisplay.append("-At " + new Date() + " Connection disabled with: " + cName + '\n');
            onlineUsers.setText(onlineUsers.getText().replaceFirst(cName+"\n", ""));
        }
    }

    
    class enableServer implements Runnable{//-------------------------------------------------
        private int port;
        public enableServer(int port){
            this.port = port;
            portDisplay.setText(Integer.toString(port));
        }
        
        @Override
        public void run() {
            try{
                ss = new ServerSocket(1201);
                actionsDisplay.append("-At: " + new Date() + " Server is enabled with port: "+ Integer.toString(port) + '\n');
                while(true){
                    Socket s = ss.accept();
                    InetAddress cA = s.getInetAddress();
                    actionsDisplay.append("-At " + new Date() + ", " + cA.getHostName() +" requested connection" + '\n');
                    if(ACC.isSelected() || (JOptionPane.showConfirmDialog(null, "Confirm connection with: " + cA.getHostAddress() , null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)){
                        clientsThreads client = new clientsThreads(s);
                        new Thread(client).start();
                    }else{
                        actionsDisplay.append("-At " + new Date() + ", " + cA.getHostName() +" stopped from connection" + '\n');
                    }
                }
            }catch(Exception e){
                if(server.isSelected()){
                    actionsDisplay.append("-At: " + new Date() + " Error with enabling server" + '\n');
                    portDisplay.setText("");
                    setButtonStatus(true);
                }else{
                    actionsDisplay.append("-At: " + new Date() + " Server is disabled" + '\n');
                    portDisplay.setText("");
                }
            }
        }
        
    }
                                                                        //------------------
    private void serverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverActionPerformed
        if(!server.isSelected()){
            try{
                ss.close();
                setButtonStatus(true);
            }catch(Exception e){
                actionsDisplay.append("-At: "+ new Date() + "Error while closing the socket" + '\n');
                setButtonStatus(false);
            }
        }
        
        else{
            try{
               // int port = Integer.parseInt(JOptionPane.showInputDialog("Enter the port"));
                enableServer task = new enableServer(1201);
                Thread eST = new Thread(task);
                eST.start();
                setButtonStatus(false);
            }catch(Exception e){
                actionsDisplay.append("-At: "+ new Date() +"Error in starting server thread " + '\n');
                setButtonStatus(true);
            }
        }
    }//GEN-LAST:event_serverActionPerformed
    
    
    private void setter()
    {
        chatDisplay.append("\nServer: " + msg.getText());
        msg.setText("");
    }
    
    
    private void ACCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACCActionPerformed
        if("Enable".equals(ACC.getText()))
            ACC.setText("Disable");
        else
            ACC.setText("Enable");
    }//GEN-LAST:event_ACCActionPerformed

    private void msgKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_msgKeyTyped
        if(evt.getKeyChar() == '\n')
            setter();
    }//GEN-LAST:event_msgKeyTyped

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        setter();
    }//GEN-LAST:event_sendActionPerformed

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
            java.util.logging.Logger.getLogger(SERVER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SERVER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SERVER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SERVER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SERVER().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ACC;
    private static javax.swing.JTextArea actionsDisplay;
    private static javax.swing.JTextArea chatDisplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private static javax.swing.JTextField msg;
    private static javax.swing.JTextArea onlineUsers;
    private javax.swing.JLabel portDisplay;
    private static javax.swing.JButton send;
    private javax.swing.JToggleButton server;
    // End of variables declaration//GEN-END:variables
}
