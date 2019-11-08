import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Segitseg extends javax.swing.JFrame {
    public Segitseg() {
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setTitle("Segítség-Elérhetõség");
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        szoveg = new javax.swing.JLabel();
        kilepes_gomb = new javax.swing.JButton();
        szovegmezo = new javax.swing.JFormattedTextField();
        vissza_gomb = new javax.swing.JButton();
        kep_logo = new javax.swing.JLabel();
        szoveg2 = new javax.swing.JLabel();
        felso_valaszto_menu = new javax.swing.JMenuBar();
        fajl_menu = new javax.swing.JMenu();
        kilepes_menu = new javax.swing.JMenuItem();
        segitseg_menu = new javax.swing.JMenu();
        elerhetoseg_menu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        szoveg.setText("Segítség:");

        kilepes_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/kilepes.png"))); // NOI18N
        kilepes_gomb.setText("Kilépés");
        kilepes_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kilepes_gombActionPerformed(evt);
            }
        });

        szovegmezo.setEditable(false);
        szovegmezo.setBackground(new java.awt.Color(204, 204, 204));
        szovegmezo.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        szovegmezo.setForeground(new java.awt.Color(255, 0, 0));
        szovegmezo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        szovegmezo.setText("Ha bármilyen problémád akadt a programmal kapcsolatban, írj egy emailt a be1997deda@gmail.com címre.");
        szovegmezo.setCaretColor(new java.awt.Color(255, 0, 51));
        szovegmezo.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        szovegmezo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                szovegmezoActionPerformed(evt);
            }
        });

        vissza_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/vissza.png"))); // NOI18N
        vissza_gomb.setText("Visszalépés az elõzõ menübe");
        vissza_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vissza_gombActionPerformed(evt);
            }
        });

        kep_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/ikon.jpg"))); // NOI18N
        kep_logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        szoveg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/logo.png"))); // NOI18N

        fajl_menu.setText("Fájl");

        kilepes_menu.setText("Kilépés");
        kilepes_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kilepes_menuActionPerformed(evt);
            }
        });
        fajl_menu.add(kilepes_menu);

        felso_valaszto_menu.add(fajl_menu);

        segitseg_menu.setText("Segítség");

        elerhetoseg_menu.setText("Elérhetõség");
        elerhetoseg_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elerhetoseg_menuActionPerformed(evt);
            }
        });
        segitseg_menu.add(elerhetoseg_menu);

        felso_valaszto_menu.add(segitseg_menu);

        setJMenuBar(felso_valaszto_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(szoveg, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(szovegmezo, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vissza_gomb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kep_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kilepes_gomb)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(szoveg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(szoveg, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(szovegmezo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(kep_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(szoveg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kilepes_gomb)
                    .addComponent(vissza_gomb))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kilepes_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kilepes_gombActionPerformed
        //Kilépés
        Object[] options = {"Igen","Nem"};
int n = JOptionPane.showOptionDialog(null,
            "Biztosan ki szeretnél lépni?",
            "Kilépés",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.DEFAULT_OPTION,
            null,
            options,
            options[1]);  
        if(n == 0)
            System.exit(0);
    }//GEN-LAST:event_kilepes_gombActionPerformed

    private void kilepes_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kilepes_menuActionPerformed
        //Kilépés
        Object[] options = {"Igen","Nem"};
int n = JOptionPane.showOptionDialog(null,
            "Biztosan ki szeretnél lépni?",
            "Kilépés",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.DEFAULT_OPTION,
            null,
            options,
            options[1]);  
        if(n == 0)
            System.exit(0);
    }//GEN-LAST:event_kilepes_menuActionPerformed

    private void szovegmezoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_szovegmezoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_szovegmezoActionPerformed

    private void elerhetoseg_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elerhetoseg_menuActionPerformed
        //Segitseg
        Segitseg Segitseg = new Segitseg();
        Segitseg.setVisible(true);
        dispose();
    }//GEN-LAST:event_elerhetoseg_menuActionPerformed

    private void vissza_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vissza_gombActionPerformed
        dispose();
    }//GEN-LAST:event_vissza_gombActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Haromszogek().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem elerhetoseg_menu;
    private javax.swing.JMenu fajl_menu;
    private javax.swing.JMenuBar felso_valaszto_menu;
    private javax.swing.JLabel kep_logo;
    private javax.swing.JButton kilepes_gomb;
    private javax.swing.JMenuItem kilepes_menu;
    private javax.swing.JMenu segitseg_menu;
    private javax.swing.JLabel szoveg;
    private javax.swing.JLabel szoveg2;
    private javax.swing.JFormattedTextField szovegmezo;
    private javax.swing.JButton vissza_gomb;
    // End of variables declaration//GEN-END:variables
private void setIcon() 
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/eszkozok/program/ikon.jpg"))); //Itt állítom be az ikont
    }
}
