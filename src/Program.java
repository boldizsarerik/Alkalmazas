import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Program extends javax.swing.JFrame {
    public Program() {
        initComponents();
        setTitle("Oktatóprogram");
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setIcon();
        pontszamok_kepernyo.setText("   A Háromszögek kategóriában elért pontjaid száma: " + Integer.toString(Adatok_megosztasa.haromszog_pontszam) +
                "\n\n\n  A Négyszögek kategóriában elért pontjaid száma: "+Integer.toString(Adatok_megosztasa.negyszog_pontszam) +
                "\n\n\n   A Körök kategóriában elért pontjaid száma: "+Integer.toString(Adatok_megosztasa.kor_pontszam) +
                "\n\n\n   A TESZTEN elért pontjaid száma: "+Integer.toString(Adatok_megosztasa.teszt_pontszam)
        );
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kilepes_gomb = new javax.swing.JButton();
        szovegmezo = new javax.swing.JLabel();
        haromszogek_gomb = new javax.swing.JButton();
        negyszogek_gomb = new javax.swing.JButton();
        korok_gomb = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        felirat = new javax.swing.JLabel();
        segedanyag_gomb = new javax.swing.JButton();
        kep = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        pontszamok_kepernyo = new javax.swing.JTextPane();
        statisztika_törlése = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        teszt_gomb = new javax.swing.JButton();
        felso_valaszto_menu = new javax.swing.JMenuBar();
        kilepes_menu = new javax.swing.JMenu();
        elsomenu = new javax.swing.JMenuItem();
        elerhetoseg_menu = new javax.swing.JMenu();
        masodikmenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(Toolkit.getDefaultToolkit().getImage("/eszkozok/program/ikon.jpg"));
        setName("Program"); // NOI18N

        kilepes_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/kilepes.png"))); // NOI18N
        kilepes_gomb.setText("Kilépés");
        kilepes_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kilepes_gombActionPerformed(evt);
            }
        });

        szovegmezo.setText("Üdvözöllek! Válaszd ki a menübõl, hogy mit szeretnél.");

        haromszogek_gomb.setBackground(new java.awt.Color(240, 240, 241));
        haromszogek_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/haromszog.png"))); // NOI18N
        haromszogek_gomb.setText("Háromszögek");
        haromszogek_gomb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                haromszogek_gombFocusGained(evt);
            }
        });
        haromszogek_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                haromszogek_gombActionPerformed(evt);
            }
        });

        negyszogek_gomb.setBackground(new java.awt.Color(240, 240, 241));
        negyszogek_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/negyszog.png"))); // NOI18N
        negyszogek_gomb.setText("Négyszögek");
        negyszogek_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negyszogek_gombActionPerformed(evt);
            }
        });

        korok_gomb.setBackground(new java.awt.Color(240, 240, 241));
        korok_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/kor.png"))); // NOI18N
        korok_gomb.setText("Körök");
        korok_gomb.setMaximumSize(new java.awt.Dimension(91, 23));
        korok_gomb.setMinimumSize(new java.awt.Dimension(91, 23));
        korok_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                korok_gombActionPerformed(evt);
            }
        });

        felirat.setText("Boldizsár Erik");

        segedanyag_gomb.setBackground(new java.awt.Color(102, 255, 102));
        segedanyag_gomb.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        segedanyag_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/seged.jpg"))); // NOI18N
        segedanyag_gomb.setText("Segédanyagok");
        segedanyag_gomb.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));
        segedanyag_gomb.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        segedanyag_gomb.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        segedanyag_gomb.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        segedanyag_gomb.setIconTextGap(70);
        segedanyag_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segedanyag_gombActionPerformed(evt);
            }
        });

        kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/logo.png"))); // NOI18N

        pontszamok_kepernyo.setEditable(false);
        pontszamok_kepernyo.setBackground(new java.awt.Color(102, 255, 102));
        pontszamok_kepernyo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));
        pontszamok_kepernyo.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        pontszamok_kepernyo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pontszamok_kepernyo.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        pontszamok_kepernyo.setSelectionColor(new java.awt.Color(204, 204, 255));
        pontszamok_kepernyo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pontszamok_kepernyoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pontszamok_kepernyo);

        statisztika_törlése.setBackground(new java.awt.Color(240, 240, 241));
        statisztika_törlése.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/torles.png"))); // NOI18N
        statisztika_törlése.setText("Eddigi pontszámok törlése");
        statisztika_törlése.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statisztika_törléseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("S T A T I S Z T I K A :");

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        teszt_gomb.setBackground(new java.awt.Color(240, 240, 241));
        teszt_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/test.png"))); // NOI18N
        teszt_gomb.setText("Teszt indítása");
        teszt_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teszt_gombActionPerformed(evt);
            }
        });

        kilepes_menu.setText("Fájl");
        kilepes_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kilepes_menuActionPerformed(evt);
            }
        });

        elsomenu.setText("Kilépés");
        elsomenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elsomenuActionPerformed(evt);
            }
        });
        kilepes_menu.add(elsomenu);

        felso_valaszto_menu.add(kilepes_menu);

        elerhetoseg_menu.setText("Segítség");

        masodikmenu.setText("Elérhetõség");
        masodikmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masodikmenuActionPerformed(evt);
            }
        });
        elerhetoseg_menu.add(masodikmenu);

        felso_valaszto_menu.add(elerhetoseg_menu);

        setJMenuBar(felso_valaszto_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(szovegmezo)
                        .addGap(549, 549, 549))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(haromszogek_gomb, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addGap(27, 27, 27)
                            .addComponent(negyszogek_gomb, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addGap(30, 30, 30)
                            .addComponent(korok_gomb, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addGap(415, 415, 415)
                            .addComponent(teszt_gomb, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addGap(197, 197, 197))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(felirat)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(kilepes_gomb)
                                    .addContainerGap())
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(kep, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(statisztika_törlése, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(segedanyag_gomb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(53, 53, 53)))))))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(szovegmezo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(haromszogek_gomb)
                            .addComponent(negyszogek_gomb)
                            .addComponent(korok_gomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(kep, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(statisztika_törlése)
                                        .addComponent(jLabel1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(segedanyag_gomb, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1161, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(felirat)
                            .addComponent(kilepes_gomb)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(teszt_gomb, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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

    private void elsomenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elsomenuActionPerformed
        //Kilépés lehetõség a felsõ menüben
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
    }//GEN-LAST:event_elsomenuActionPerformed

    private void haromszogek_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_haromszogek_gombActionPerformed
        //Háromszögek
        Haromszogek Haromszogek = new Haromszogek();
        Haromszogek.setVisible(true);
        dispose();
    }//GEN-LAST:event_haromszogek_gombActionPerformed

    private void negyszogek_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negyszogek_gombActionPerformed
        //Négyszögek
        Negyszogek Negyszogek = new Negyszogek();
        Negyszogek.setVisible(true);
        dispose();
    }//GEN-LAST:event_negyszogek_gombActionPerformed

    private void korok_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_korok_gombActionPerformed
        //Korok
        Korok Korok = new Korok();
        Korok.setVisible(true);
        dispose();
    }//GEN-LAST:event_korok_gombActionPerformed

    private void segedanyag_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segedanyag_gombActionPerformed
        //Anyagok
        Anyagok Anyagok = new Anyagok();
        Anyagok.setVisible(true);
        dispose();
    }//GEN-LAST:event_segedanyag_gombActionPerformed

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

    private void masodikmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masodikmenuActionPerformed
        //Segitseg
        Segitseg Segitseg = new Segitseg();
        Segitseg.setVisible(true);
    }//GEN-LAST:event_masodikmenuActionPerformed

    private void pontszamok_kepernyoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pontszamok_kepernyoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pontszamok_kepernyoMouseClicked

    private void statisztika_törléseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statisztika_törléseActionPerformed
        //Ezzel töröljük az eddig szerzett pontszámokat:
        Adatok_megosztasa.haromszog_pontszam = 0;
        Adatok_megosztasa.kor_pontszam = 0;
        Adatok_megosztasa.negyszog_pontszam = 0;
         Adatok_megosztasa.teszt_pontszam = 0;
         pontszamok_kepernyo.setText("   A Háromszögek kategóriában elért pontjaid száma: " + Integer.toString(Adatok_megosztasa.haromszog_pontszam) +
                "\n\n\n\n   A Négyszögek kategóriában elért pontjaid száma: "+Integer.toString(Adatok_megosztasa.negyszog_pontszam) +
                "\n\n\n\n   A Körök kategóriában elért pontjaid száma: "+Integer.toString(Adatok_megosztasa.kor_pontszam) +
                "\n\n\n\n   A TESZTEN elért pontjaid száma: "+Integer.toString(Adatok_megosztasa.teszt_pontszam)
         );
    }//GEN-LAST:event_statisztika_törléseActionPerformed

    private void haromszogek_gombFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_haromszogek_gombFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_haromszogek_gombFocusGained

    private void teszt_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teszt_gombActionPerformed
        //Teszt gomb:
        Teszt Teszt = new Teszt();
        Teszt.setVisible(true);
        dispose();
    }//GEN-LAST:event_teszt_gombActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Program().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu elerhetoseg_menu;
    private javax.swing.JMenuItem elsomenu;
    private javax.swing.JLabel felirat;
    private javax.swing.JMenuBar felso_valaszto_menu;
    private javax.swing.JButton haromszogek_gomb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel kep;
    private javax.swing.JButton kilepes_gomb;
    private javax.swing.JMenu kilepes_menu;
    private javax.swing.JButton korok_gomb;
    private javax.swing.JMenuItem masodikmenu;
    private javax.swing.JButton negyszogek_gomb;
    private javax.swing.JTextPane pontszamok_kepernyo;
    private javax.swing.JButton segedanyag_gomb;
    private javax.swing.JButton statisztika_törlése;
    private javax.swing.JLabel szovegmezo;
    private javax.swing.JButton teszt_gomb;
    // End of variables declaration//GEN-END:variables

    private void setIcon() 
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/eszkozok/program/ikon.jpg"))); //Itt állítom be az ikont
    }
}