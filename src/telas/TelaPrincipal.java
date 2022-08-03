/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.util.Date;
import java.text.DateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author walquiria
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUser = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuUser = new javax.swing.JMenu();
        cad_usuario = new javax.swing.JMenuItem();
        cons_usuario = new javax.swing.JMenuItem();
        rel_user = new javax.swing.JMenuItem();
        menuAcervo = new javax.swing.JMenu();
        cad_acervo = new javax.swing.JMenuItem();
        cons_acervo = new javax.swing.JMenuItem();
        emp_acervo = new javax.swing.JMenuItem();
        rel_acervo = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca ETE_MB");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        desktop.setPreferredSize(new java.awt.Dimension(768, 629));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/etemb_min.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("Olá");

        txtUser.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtUser.setForeground(new java.awt.Color(0, 0, 153));
        txtUser.setText("Usuário");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Seja, Bem-vindo(a)");

        txtData.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtData.setForeground(new java.awt.Color(0, 0, 153));
        txtData.setText("Data");

        menuUser.setText("Usuário");
        menuUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUserActionPerformed(evt);
            }
        });

        cad_usuario.setText("Cadastro");
        cad_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad_usuarioActionPerformed(evt);
            }
        });
        menuUser.add(cad_usuario);

        cons_usuario.setText("Consulta");
        cons_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cons_usuarioActionPerformed(evt);
            }
        });
        menuUser.add(cons_usuario);

        rel_user.setText("Relátorio");
        menuUser.add(rel_user);

        jMenuBar1.add(menuUser);

        menuAcervo.setText("Acervo");

        cad_acervo.setText("Cadastro");
        cad_acervo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad_acervoActionPerformed(evt);
            }
        });
        menuAcervo.add(cad_acervo);

        cons_acervo.setText("Consulta");
        cons_acervo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cons_acervoActionPerformed(evt);
            }
        });
        menuAcervo.add(cons_acervo);

        emp_acervo.setText("Empréstimo");
        emp_acervo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_acervoActionPerformed(evt);
            }
        });
        menuAcervo.add(emp_acervo);

        rel_acervo.setText("Relátorio");
        menuAcervo.add(rel_acervo);

        jMenuBar1.add(menuAcervo);

        menuSair.setText("Sair");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtData)
                .addContainerGap(305, Short.MAX_VALUE))
            .addComponent(desktop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1016, 688));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
      int resposta;
      resposta = JOptionPane.showConfirmDialog(null,"Deseja Sair do Sistema?","Aviso",JOptionPane.YES_NO_OPTION);
      if (resposta== JOptionPane.YES_OPTION){
          System.exit(0);
      }
    }//GEN-LAST:event_menuSairMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       Date data = new Date ();
       DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
       txtData.setText(formatador.format(data));
       
    }//GEN-LAST:event_formWindowActivated

    private void cad_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad_usuarioActionPerformed
      CadUsuario cadastro = new CadUsuario();
      cadastro.setVisible(true);
      desktop.add(cadastro);
    }//GEN-LAST:event_cad_usuarioActionPerformed

    private void menuUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuUserActionPerformed

    private void cad_acervoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad_acervoActionPerformed
        CadAcervo acervo = new CadAcervo();
        acervo.setVisible(true);
        desktop.add(acervo);
    }//GEN-LAST:event_cad_acervoActionPerformed

    private void cons_acervoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cons_acervoActionPerformed
      ConsAcervo consuacervo = new ConsAcervo();
      consuacervo.setVisible(true);
      desktop.add(consuacervo);
    }//GEN-LAST:event_cons_acervoActionPerformed

    private void emp_acervoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_acervoActionPerformed
     EmpAcervo emprestimo = new EmpAcervo();
     emprestimo.setVisible(true);
     desktop.add(emprestimo);
    }//GEN-LAST:event_emp_acervoActionPerformed

    private void cons_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cons_usuarioActionPerformed
     ConsUsuario consulta =  new ConsUsuario();
     consulta.setVisible(true);
     desktop.add(consulta);
    }//GEN-LAST:event_cons_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cad_acervo;
    private javax.swing.JMenuItem cad_usuario;
    private javax.swing.JMenuItem cons_acervo;
    private javax.swing.JMenuItem cons_usuario;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuItem emp_acervo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuAcervo;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenu menuUser;
    private javax.swing.JMenuItem rel_acervo;
    private javax.swing.JMenuItem rel_user;
    private javax.swing.JLabel txtData;
    public static javax.swing.JLabel txtUser;
    // End of variables declaration//GEN-END:variables

    private ConsUsuario ConsUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}