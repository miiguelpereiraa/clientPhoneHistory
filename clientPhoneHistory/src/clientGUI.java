
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MisterZii
 */
public class clientGUI extends javax.swing.JFrame {

    String loggedUser;
    String loggedPassHash;

    /**
     * Creates new form clientGUI
     */
    public clientGUI() throws IOException, NoSuchAlgorithmException {
        initComponents();
        Security.addProvider(new BouncyCastleProvider());
        jTPane.remove(jPServ);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTPane = new javax.swing.JTabbedPane();
        jPAut = new javax.swing.JPanel();
        jTPAut = new javax.swing.JTabbedPane();
        jPLogin = new javax.swing.JPanel();
        txtUserLogin = new javax.swing.JTextField();
        txtPassLogin = new javax.swing.JPasswordField();
        btLogin = new javax.swing.JButton();
        txtIP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPort = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPReg = new javax.swing.JPanel();
        txtUserReg = new javax.swing.JTextField();
        txtPassReg = new javax.swing.JPasswordField();
        btRegistar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtLogReg = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPServ = new javax.swing.JPanel();
        jTPServ = new javax.swing.JTabbedPane();
        jPIReg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtImei = new javax.swing.JTextField();
        btAddReg = new javax.swing.JButton();
        txtMarca = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtRede = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtRep = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtMat = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        txtMinAnim = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtLogIRegisto = new javax.swing.JTextPane();
        jPConsult = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtGImei = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();
        btPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLogConsult = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btLogin.setText("Login");
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });

        txtIP.setText("192.168.1.122");
        txtIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIPActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Endereço IP");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Porto");

        txtPort.setText("10020");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Username:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Password:");

        javax.swing.GroupLayout jPLoginLayout = new javax.swing.GroupLayout(jPLogin);
        jPLogin.setLayout(jPLoginLayout);
        jPLoginLayout.setHorizontalGroup(
            jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLoginLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtPort)
                    .addComponent(jLabel4)
                    .addComponent(txtIP, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(btLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addComponent(txtUserLogin)
                    .addComponent(jLabel5)
                    .addComponent(jLabel15))
                .addContainerGap(317, Short.MAX_VALUE))
        );
        jPLoginLayout.setVerticalGroup(
            jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLoginLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btLogin)
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        jTPAut.addTab("Login", jPLogin);

        txtPassReg.setText("jPasswordField1");

        btRegistar.setText("Registar");
        btRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistarActionPerformed(evt);
            }
        });

        txtLogReg.setBorder(javax.swing.BorderFactory.createTitledBorder("Log"));
        jScrollPane5.setViewportView(txtLogReg);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Username:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Password:");

        javax.swing.GroupLayout jPRegLayout = new javax.swing.GroupLayout(jPReg);
        jPReg.setLayout(jPRegLayout);
        jPRegLayout.setHorizontalGroup(
            jPRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegLayout.createSequentialGroup()
                .addGroup(jPRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPRegLayout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addGroup(jPRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassReg, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(txtUserReg, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPRegLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPRegLayout.setVerticalGroup(
            jPRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel6)
                .addGap(7, 7, 7)
                .addComponent(txtUserReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(7, 7, 7)
                .addComponent(txtPassReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btRegistar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTPAut.addTab("Registo", jPReg);

        javax.swing.GroupLayout jPAutLayout = new javax.swing.GroupLayout(jPAut);
        jPAut.setLayout(jPAutLayout);
        jPAutLayout.setHorizontalGroup(
            jPAutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPAut)
        );
        jPAutLayout.setVerticalGroup(
            jPAutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPAut)
        );

        jTPane.addTab("Autenticação", jPAut);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("IMEI:");

        txtImei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImeiActionPerformed(evt);
            }
        });

        btAddReg.setText("Adicionar Registo");
        btAddReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddRegActionPerformed(evt);
            }
        });

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Marca:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Modelo:");

        txtRede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRedeActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Rede:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("País:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Reparação:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Material:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Descrição");

        txtLogIRegisto.setBorder(javax.swing.BorderFactory.createTitledBorder("Log"));
        jScrollPane6.setViewportView(txtLogIRegisto);

        javax.swing.GroupLayout jPIRegLayout = new javax.swing.GroupLayout(jPIReg);
        jPIReg.setLayout(jPIRegLayout);
        jPIRegLayout.setHorizontalGroup(
            jPIRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPIRegLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPIRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPIRegLayout.createSequentialGroup()
                        .addGroup(jPIRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPIRegLayout.createSequentialGroup()
                                .addGroup(jPIRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPIRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtImei, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPIRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addComponent(txtModelo)
                                        .addComponent(txtRede)
                                        .addComponent(txtMat)
                                        .addComponent(txtPais)
                                        .addComponent(txtRep)
                                        .addComponent(txtDesc))))
                            .addComponent(jLabel13))
                        .addGap(22, 22, 22)
                        .addComponent(btAddReg)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMinAnim))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPIRegLayout.setVerticalGroup(
            jPIRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPIRegLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPIRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPIRegLayout.createSequentialGroup()
                        .addGroup(jPIRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtImei, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(btAddReg))
                        .addGap(7, 7, 7)
                        .addGroup(jPIRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPIRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPIRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtRede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPIRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPIRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPIRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPIRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addComponent(jScrollPane6))
                .addGap(35, 35, 35)
                .addComponent(txtMinAnim, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTPServ.addTab("Inserir Registo", jPIReg);

        jLabel2.setText("Introduza o IMEI do equipamento que deseja pesquisar:");

        txtResult.setColumns(20);
        txtResult.setRows(5);
        jScrollPane2.setViewportView(txtResult);

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(txtLogConsult);

        javax.swing.GroupLayout jPConsultLayout = new javax.swing.GroupLayout(jPConsult);
        jPConsult.setLayout(jPConsultLayout);
        jPConsultLayout.setHorizontalGroup(
            jPConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConsultLayout.createSequentialGroup()
                .addGroup(jPConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPConsultLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                            .addGroup(jPConsultLayout.createSequentialGroup()
                                .addGroup(jPConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtGImei))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPConsultLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPConsultLayout.setVerticalGroup(
            jPConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConsultLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPConsultLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGImei, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        jTPServ.addTab("Consultar", jPConsult);

        javax.swing.GroupLayout jPServLayout = new javax.swing.GroupLayout(jPServ);
        jPServ.setLayout(jPServLayout);
        jPServLayout.setHorizontalGroup(
            jPServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPServ)
        );
        jPServLayout.setVerticalGroup(
            jPServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPServ)
        );

        jTPane.addTab("Serviço", jPServ);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtImeiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImeiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImeiActionPerformed

    private void btAddRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddRegActionPerformed
        String ip = txtIP.getText();
        int port = Integer.parseInt(txtPort.getText());
        if(validateInput() == ""){
            new Thread(
                () -> {
                    try {
                        String aux = "addreg "
                        + this.loggedUser + " "
                        + this.loggedPassHash + " "
                        + txtImei.getText() + " "
                        + txtDesc.getText() + " "
                        + txtMarca.getText() + " "
                        + txtModelo.getText() + " "
                        + txtPais.getText() + " "
                        + txtRede.getText() + " "
                        + txtRep.getText() + " "
                        + txtMat.getText();

                        String send = Base64.getEncoder().encodeToString(aux.getBytes());
                        //Abre o socket
                        Socket client = new Socket(ip, port);
                        //Abre as streams IO
                        DataInputStream in = new DataInputStream(client.getInputStream());
                        DataOutputStream out = new DataOutputStream(client.getOutputStream());
                        //Envia a informação

                        Thread.sleep(1000);
                        out.writeUTF(send);
                        out.flush();
                        //Recebe a resposta
                        String resposta = in.readUTF();
                        //Fecha as streams
                        in.close();
                        out.close();
                        client.close();
                        displayLog(txtLogIRegisto, "Adicionar Registo", resposta);
                    } catch (IOException ex) {
                        Logger.getLogger(clientGUI.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InterruptedException ex) {
                    Logger.getLogger(clientGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                }).start();
        }else
            displayLog(txtLogIRegisto, "Adicionar Registo", "P.f preencha todos os campos.");
        
    }//GEN-LAST:event_btAddRegActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtRedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRedeActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        String ip = txtIP.getText();
        int port = Integer.parseInt(txtPort.getText());

        new Thread(
                () -> {
                    try {
                        String aux = "pesquisar " + this.loggedUser + " " + txtGImei.getText();
                        String send = Base64.getEncoder().encodeToString(aux.getBytes());
                        //Abre o socket
                        Socket client = new Socket(ip, port);
                        //Abre as streams IO
                        DataInputStream in = new DataInputStream(client.getInputStream());
                        DataOutputStream out = new DataOutputStream(client.getOutputStream());
                        //Envia a informação
                        out.writeUTF(send);
                        out.flush();
                        //Recebe a resposta
                        String resposta = in.readUTF();
                        if (resposta == "") {
                            displayLog(txtLogConsult, "Pesquisa", "Não há resultados para o imei introduzido");
                        } else {
                            String[] result = resposta.split(";");
                            for (String string : result) {
                                String[] campos = string.split("#");
                                String strFormated = "\nIMEI: " + campos[0]
                                + "\nMarca: " + campos[1]
                                + "\nModelo: " + campos[2]
                                + "\nRede: " + campos[3]
                                + "\nPaís: " + campos[4]
                                + "\nReparação: " + campos[5]
                                + "\nMaterial: " + campos[6]
                                + "\nDescrição: " + campos[7];
                                txtResult.setText(strFormated
                                        + "\n\n"
                                        + "--------------------------------"
                                        + "\n\n"
                                );
                            }

                        }
                        //Fecha as streams
                        in.close();
                        out.close();
                        client.close();
                    } catch (IOException ex) {
                        Logger.getLogger(clientGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }).start();

    }//GEN-LAST:event_btPesquisarActionPerformed

    private void txtIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIPActionPerformed

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        String ip = txtIP.getText();
        int port = Integer.parseInt(txtPort.getText());
        try {
            MessageDigest hasher = MessageDigest.getInstance("SHA3-256");

            //Obter a hash do username e da password
            String user = txtUserLogin.getText();
            String pass = new String(txtPassLogin.getPassword());

            byte[] hPass = hasher.digest(pass.getBytes());
            String hashPass = Base64.getEncoder().encodeToString(hPass);

            String aux = "login " + user + " " + hashPass;
            String send = Base64.getEncoder().encodeToString(aux.getBytes());

            //Abre o socket
            Socket client = new Socket(ip, port);
            //Abre as streams IO
            DataInputStream in = new DataInputStream(client.getInputStream());
            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            //Envia a informação
            out.writeUTF(send);
            out.flush();
            //Recebe a resposta
            String resposta = in.readUTF();
            //Guarda o utilizador actual
            this.loggedUser = user;
            this.loggedPassHash = hashPass;

            displayLog(txtLogReg, "Registo", resposta);

            //Fecha as streams
            in.close();
            out.close();
            client.close();

        } catch (Exception ex) {
            displayException(txtLogReg, "Registo", ex);
        }
        jTPane.remove(jPAut);
        jTPane.addTab("Serviço", jPServ);

    }//GEN-LAST:event_btLoginActionPerformed

    private void btRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistarActionPerformed
        String ip = txtIP.getText();
        int port = Integer.parseInt(txtPort.getText());
        try {
            MessageDigest hasher = MessageDigest.getInstance("SHA3-256");

            //Obter a hash do username e da password
            String user = txtUserReg.getText();
            String pass = new String(txtPassReg.getPassword());

            byte[] hPass = hasher.digest(pass.getBytes());
            String hashPass = Base64.getEncoder().encodeToString(hPass);

            String aux = "registo " + user + " " + hashPass;
            String send = Base64.getEncoder().encodeToString(aux.getBytes());

            //Abre o socket
            Socket client = new Socket(ip, port);
            //Abre as streams IO
            DataInputStream in = new DataInputStream(client.getInputStream());
            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            //Envia a informação
            out.writeUTF(send);
            out.flush();
            //Recebe a resposta
            String resposta = in.readUTF();

            displayLog(txtLogReg, "Registo", resposta);

            //Fecha as streams
            in.close();
            out.close();
            client.close();

        } catch (Exception ex) {
            displayException(txtLogReg, "Registo", ex);
        }
    }//GEN-LAST:event_btRegistarActionPerformed

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
            java.util.logging.Logger.getLogger(clientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new clientGUI().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(clientGUI.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(clientGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddReg;
    private javax.swing.JButton btLogin;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btRegistar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPAut;
    private javax.swing.JPanel jPConsult;
    private javax.swing.JPanel jPIReg;
    private javax.swing.JPanel jPLogin;
    private javax.swing.JPanel jPReg;
    private javax.swing.JPanel jPServ;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTPAut;
    private javax.swing.JTabbedPane jTPServ;
    private javax.swing.JTabbedPane jTPane;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtGImei;
    private javax.swing.JTextField txtIP;
    private javax.swing.JTextField txtImei;
    private javax.swing.JTextPane txtLogConsult;
    private javax.swing.JTextPane txtLogIRegisto;
    private javax.swing.JTextPane txtLogReg;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMat;
    private javax.swing.JLabel txtMinAnim;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPais;
    private javax.swing.JPasswordField txtPassLogin;
    private javax.swing.JPasswordField txtPassReg;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextField txtRede;
    private javax.swing.JTextField txtRep;
    private javax.swing.JTextArea txtResult;
    private javax.swing.JTextField txtUserLogin;
    private javax.swing.JTextField txtUserReg;
    // End of variables declaration//GEN-END:variables

    public void displayLog(JTextPane comp, String source, String txt) {
        comp.setText(
                source + "\t" + txt + "\n" + comp.getText()
        );
    }

    public void displayException(JTextPane comp, String source, Exception ex) {
        comp.setText(
                source + "\t" + ex.getMessage() + "\n" + comp.getText()
        );
        Logger.getLogger(clientGUI.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    public String validateInput(){
        ArrayList<JTextField> comp = new ArrayList<>();
        comp.add(txtImei);
        comp.add(txtDesc);
        comp.add(txtMarca);
        comp.add(txtModelo);
        comp.add(txtPais);
        comp.add(txtRede);
        comp.add(txtRep);
        comp.add(txtMat);
        for (JTextField field : comp) {
            if(field.getText() == "")
                return "P.f preencha todos os campos.";
        }
        return "";
    }

}
