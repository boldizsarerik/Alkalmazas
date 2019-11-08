import java.awt.Color;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Korok extends javax.swing.JFrame {
    public Korok() {
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setTitle("Körök");
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setIcon();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vissza_gomb = new javax.swing.JButton();
        szovegmezo = new javax.swing.JLabel();
        kilepes_gomb = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1_szoveg = new javax.swing.JTextPane();
        szoveg2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane2_megoldas = new javax.swing.JTextPane();
        segedanyag_gomb = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        segedanyag = new javax.swing.JTextPane();
        bekuldes_gomb = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane4_ellenorzes = new javax.swing.JTextPane();
        mutasd_a_feladatot_gomb = new javax.swing.JButton();
        mutasd_a_megoldast_gomb = new javax.swing.JButton();
        feladatkep = new javax.swing.JLabel();
        mutasd_a_pontot_gomb = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane1_szoveg1 = new javax.swing.JTextPane();
        segedanyag_kep = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        informacios_szoveg = new javax.swing.JTextPane();
        felso_valaszto_menu = new javax.swing.JMenuBar();
        kilepes_menu = new javax.swing.JMenu();
        elso_menu = new javax.swing.JMenuItem();
        elerhetoseg_menu = new javax.swing.JMenu();
        masodik_menu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        vissza_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/vissza.png"))); // NOI18N
        vissza_gomb.setText("Vissza a menübe");
        vissza_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vissza_gombActionPerformed(evt);
            }
        });

        szovegmezo.setText("Üdvözöllek a Körök kategóriában! Kattints a \"Mutasd a feladatot\" gombra, és kezd el megoldani a feladatokat!");

        kilepes_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/kilepes.png"))); // NOI18N
        kilepes_gomb.setText("Kilépés");
        kilepes_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kilepes_gombActionPerformed(evt);
            }
        });

        jTextPane1_szoveg.setEditable(false);
        jTextPane1_szoveg.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane2.setViewportView(jTextPane1_szoveg);

        szoveg2.setText("A megoldásod ide írhatod:");

        jTextPane2_megoldas.setBackground(new java.awt.Color(255, 255, 102));
        jScrollPane3.setViewportView(jTextPane2_megoldas);

        segedanyag_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/segitseg.png"))); // NOI18N
        segedanyag_gomb.setText("Segédanyag kérése");
        segedanyag_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segedanyag_gombActionPerformed(evt);
            }
        });

        segedanyag.setEditable(false);
        segedanyag.setBackground(new java.awt.Color(240, 240, 240));
        segedanyag.setBorder(null);
        segedanyag.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        segedanyag.setText("Ha szükséged van segítségre, akkor nyomd meg a /Segédanyag kérése/ gombot!\nHa késõbb elszeretnéd tüntetni, akkor kattints rá a képre, illetve a szövegre!");
        segedanyag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                segedanyagMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(segedanyag);

        bekuldes_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/pipa.png"))); // NOI18N
        bekuldes_gomb.setText("BEKÜLDÉS");
        bekuldes_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bekuldes_gombActionPerformed(evt);
            }
        });

        jTextPane4_ellenorzes.setEditable(false);
        jTextPane4_ellenorzes.setBackground(new java.awt.Color(255, 255, 102));
        jScrollPane5.setViewportView(jTextPane4_ellenorzes);

        mutasd_a_feladatot_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/kovetkezo.png"))); // NOI18N
        mutasd_a_feladatot_gomb.setText("Mutasd a feladatot!");
        mutasd_a_feladatot_gomb.setIconTextGap(12);
        mutasd_a_feladatot_gomb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mutasd_a_feladatot_gombMouseClicked(evt);
            }
        });
        mutasd_a_feladatot_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mutasd_a_feladatot_gombActionPerformed(evt);
            }
        });

        mutasd_a_megoldast_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/kerdojel.png"))); // NOI18N
        mutasd_a_megoldast_gomb.setText("Mutasd a megoldást!");
        mutasd_a_megoldast_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mutasd_a_megoldast_gombActionPerformed(evt);
            }
        });

        feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/korok/sima.jpg"))); // NOI18N
        feladatkep.setToolTipText("");

        mutasd_a_pontot_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/pontok.png"))); // NOI18N
        mutasd_a_pontot_gomb.setText("Mutasd a pontjaimat!");
        mutasd_a_pontot_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mutasd_a_pontot_gombActionPerformed(evt);
            }
        });

        jTextPane1_szoveg1.setEditable(false);
        jTextPane1_szoveg1.setBackground(new java.awt.Color(255, 255, 102));
        jScrollPane6.setViewportView(jTextPane1_szoveg1);

        segedanyag_kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/korok/sima2.jpg"))); // NOI18N
        segedanyag_kep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                segedanyag_kepMouseClicked(evt);
            }
        });

        informacios_szoveg.setEditable(false);
        informacios_szoveg.setBackground(new java.awt.Color(255, 255, 102));
        informacios_szoveg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        informacios_szoveg.setText("A megoldás beírásakor 2-tizedesjegyre való kerekítést kell alkalmazni!\nA beírt megoldás elfogadott formátuma: pl.: 281.17\nMinden jó megoldás után kapsz egy plusz pontot, pontjaid száma a /Mutasd a pontjaimat!/ gomb segítségével tekinthetõ meg. Plusz pontot csak az esetben kaphatsz, ha nem nézted meg elõtte a megoldást.\n");
        jScrollPane1.setViewportView(informacios_szoveg);

        kilepes_menu.setText("Fájl");

        elso_menu.setText("Kilépés");
        elso_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elso_menuActionPerformed(evt);
            }
        });
        kilepes_menu.add(elso_menu);

        felso_valaszto_menu.add(kilepes_menu);

        elerhetoseg_menu.setText("Segítség");

        masodik_menu.setText("Elérhetõség");
        masodik_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masodik_menuActionPerformed(evt);
            }
        });
        elerhetoseg_menu.add(masodik_menu);

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(szoveg2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bekuldes_gomb, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)))
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2)
                            .addComponent(szovegmezo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(feladatkep, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(mutasd_a_pontot_gomb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mutasd_a_feladatot_gomb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(segedanyag_gomb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mutasd_a_megoldast_gomb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4)
                            .addComponent(segedanyag_kep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vissza_gomb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kilepes_gomb)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(szovegmezo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(feladatkep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(35, 35, 35))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(segedanyag_gomb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mutasd_a_pontot_gomb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mutasd_a_feladatot_gomb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mutasd_a_megoldast_gomb)
                                .addGap(18, 18, 18)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(szoveg2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(bekuldes_gomb)
                                .addGap(14, 14, 14))
                            .addComponent(jScrollPane5)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(segedanyag_kep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vissza_gomb)
                    .addComponent(kilepes_gomb))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vissza_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vissza_gombActionPerformed
        //Vissza a menübe gomb
        Program Program = new Program();
        Program.setVisible(true);
        dispose();
    }//GEN-LAST:event_vissza_gombActionPerformed

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

    private void elso_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elso_menuActionPerformed
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
    }//GEN-LAST:event_elso_menuActionPerformed

    private void masodik_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masodik_menuActionPerformed
        //Segitseg
        Segitseg Segitseg = new Segitseg();
        Segitseg.setVisible(true);
    }//GEN-LAST:event_masodik_menuActionPerformed

    float PI = (float) 3.14; //Voltak próbálkozások, de mivel néhány számításnál gyököt kell vonni, ezért mindig lesz hiba,
    //szóval áttérünk a kerekítéshez, amit a "kerekit" függvény végez el, 2 tizedesjegy pontosságra beállítva.
    float megoldas = -1000;
    int szamlalo = 0;
    int sugar = 0;
    int kerulet = 0;
    float terulet = 0;
    int atmero = 0;
    Random rand = new Random();
    int helyes_megoldas = 0;
    float bekuldott_megoldas = 0;
    boolean megnezte_a_megoldast = false;
    
    private void bekuldes_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bekuldes_gombActionPerformed
        //Beküldés 
        try{
        bekuldott_megoldas = Float.parseFloat(jTextPane2_megoldas.getText());
        if(megoldas == -1000)
            jTextPane4_ellenorzes.setText("Nincs kiválasztva feladat!");
        else if (jTextPane2_megoldas.getText().isEmpty())
        {
            jTextPane4_ellenorzes.setText("Nem írtál megoldást!");
        }
        else
        {
        bekuldott_megoldas = Float.parseFloat(jTextPane2_megoldas.getText());
        
        if (bekuldott_megoldas == megoldas)
        {
            //Kell egy változó, ami a mutasd_a_megoldást - gomb megnyomásakor aktiválódik, és itt leellenõrizzük, hogy 
            // adható-e plusz pont, mert ha megnéztük a megoldást, akkor nem jár érte pont.
            jTextPane4_ellenorzes.setText("Helyes!");
            if( megnezte_a_megoldast == false)
            {
            helyes_megoldas++;
            jTextPane4_ellenorzes.setText("Helyes!Szereztél egy plusz pontot!");
            Adatok_megosztasa.kor_pontszam = helyes_megoldas;
            }
            jTextPane4_ellenorzes.setBackground(Color.green);
        }
                    else
        {
            jTextPane4_ellenorzes.setText("Helytelen! Próbálkozz újra!");
            jTextPane4_ellenorzes.setBackground(Color.red);
        }
        }
            }
catch(NumberFormatException ex)
{
    jTextPane4_ellenorzes.setText("Nem megfelelõ formátumú a beírt megoldás, vagy még nincs kiválasztva feladat! Próbálkozz újra egy számmal!");
}     
    }//GEN-LAST:event_bekuldes_gombActionPerformed
    
    private void mutasd_a_feladatot_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mutasd_a_feladatot_gombActionPerformed
        //Mutasd a feladatot
        mutasd_a_feladatot_gomb.setText("Következõ feladat");
        szamlalo = rand.nextInt(8)+1;;
        jTextPane4_ellenorzes.setBackground(new java.awt.Color(255, 255, 102));
        jTextPane4_ellenorzes.setText("");
        megnezte_a_megoldast = false;
        jTextPane2_megoldas.setText("");
    }//GEN-LAST:event_mutasd_a_feladatot_gombActionPerformed

    private void mutasd_a_megoldast_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mutasd_a_megoldast_gombActionPerformed
        //Mutasd a megoldást gomb
        megnezte_a_megoldast = true;
        jTextPane4_ellenorzes.setBackground(new java.awt.Color(255, 255, 102));
        if(megoldas == -1000)
        jTextPane4_ellenorzes.setText("Nincs kiválasztva feladat!");
        else
        jTextPane4_ellenorzes.setText("A feladat megoldása: " + Float.toString(megoldas));
    }//GEN-LAST:event_mutasd_a_megoldast_gombActionPerformed

    private void mutasd_a_feladatot_gombMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mutasd_a_feladatot_gombMouseClicked
        //Miután kattintottunk a mutasd a feladatot/következõ gombra:
         jTextPane1_szoveg1.setText("Itt nézheted meg a pontjaid számát!");
        
        if (szamlalo == 1)
        {
            feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/korok/1.jpg")));
            sugar = rand.nextInt(50)+1;
            jTextPane1_szoveg.setText("A kör sugara, R = "+sugar+" cm. Mennyi lesz a kör területe?"); 
            megoldas = (float) PI * sugar * sugar;    
            megoldas = (float) Adatok_megosztasa.kerekit (megoldas, 2);
        }
        if (szamlalo == 2)
        {
         feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/korok/2.jpg")));
         sugar = rand.nextInt(50)+1;
         jTextPane1_szoveg.setText("A kör sugara, R = "+sugar+" cm. Mennyi lesz a kör kerülete?"); 
         megoldas = (float) ((float) 2 * PI * sugar);    
         megoldas = (float) Adatok_megosztasa.kerekit (megoldas, 2);
        }
        if (szamlalo == 3)
        {
         feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/korok/3.jpg")));
         atmero = rand.nextInt(50)+1;
         jTextPane1_szoveg.setText("A kör átmérõje, d = "+atmero+" cm. Mennyi lesz a kör kerülete?"); 
         megoldas = (float) ((float) PI * atmero);   
         megoldas = (float) Adatok_megosztasa.kerekit (megoldas, 2);
        }
        if (szamlalo == 4)
        {
          feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/korok/4.jpg")));
         atmero = rand.nextInt(50)+1;
         jTextPane1_szoveg.setText("A kör átmérõje, d = "+atmero+" cm. Mennyi lesz a kör területe?"); 
         megoldas = (float) ((float) PI * atmero * atmero)/4;   
         megoldas = (float) Adatok_megosztasa.kerekit (megoldas, 2);
        }
        if (szamlalo == 5)
        {
          feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/korok/5.jpg")));
         terulet = rand.nextInt(50)+1;
         jTextPane1_szoveg.setText("A kör területe, T = "+terulet+" cm. Mennyi lesz a kör sugara?"); 
         terulet = (float) (terulet / PI);
         megoldas = (float)  Math.sqrt(terulet);
         megoldas = (float) Adatok_megosztasa.kerekit (megoldas, 2);
        }
         if (szamlalo == 6)
        {
         feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/korok/6.jpg")));
         terulet = rand.nextInt(50)+1;
         jTextPane1_szoveg.setText("A kör területe, T = "+terulet+" cm. Mennyi lesz a kör átmérõje?"); 
         terulet = (float) ((terulet * 4) / PI);
         megoldas = (float) Math.sqrt(terulet);
         megoldas = (float) Adatok_megosztasa.kerekit (megoldas, 2);
        }
         if (szamlalo == 7)
        {
         feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/korok/7.jpg")));
         kerulet = rand.nextInt(50)+1;
         jTextPane1_szoveg.setText("A kör kerülete, K = "+kerulet+" cm. Mennyi lesz a kör átmérõje?"); 
         megoldas = (float) (kerulet / PI);
         megoldas = (float) Adatok_megosztasa.kerekit (megoldas, 2);
        }
         if (szamlalo == 8)
        {
         feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/korok/8.jpg")));
         kerulet = rand.nextInt(50)+1;
         jTextPane1_szoveg.setText("A kör kerülete, K = "+kerulet+" cm. Mennyi lesz a kör sugara?"); 
         megoldas = (float) (kerulet / (2*PI));
         megoldas = (float) Adatok_megosztasa.kerekit (megoldas, 2);
        }
    }//GEN-LAST:event_mutasd_a_feladatot_gombMouseClicked

    private void mutasd_a_pontot_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mutasd_a_pontot_gombActionPerformed
        //mutasd a pontjaimat
        jTextPane1_szoveg1.setText("Az eddigi pontjaid száma: "+helyes_megoldas);
    }//GEN-LAST:event_mutasd_a_pontot_gombActionPerformed
   public boolean megnyomva = false;
    
    private void segedanyag_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segedanyag_gombActionPerformed
        //Segédanyagos gomb
        megnezte_a_megoldast = true;
        megnyomva = true;
        //névváltoztatás:
        
        String korok ="";
try {
    BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Boldizsár Erik\\Documents\\NetBeansProjects\\Alkalmazas\\src\\eszkozok\\korok\\korok.txt"));
    // Az ékezeteket az ISO-8859-2-vel lehet megnyitni!
    StringBuilder sb = new StringBuilder();
    String line = br.readLine();
    while (line != null)
    {
        sb.append(line);
        sb.append(System.lineSeparator());
        line = br.readLine();
    }
    korok = sb.toString();
    }
        catch(IOException ex)
            {
           System.out.println("Nincs meg a fájl!");
           }  
    segedanyag.setText(korok);
    //Most jön a képbeillesztés:
    segedanyag_kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/korok/kor.jpg")));
    }//GEN-LAST:event_segedanyag_gombActionPerformed

    private void segedanyag_kepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segedanyag_kepMouseClicked
        // ha rákattintunk a segédanyagos képre,akkor az eltünik
        segedanyag_kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/korok/sima2.jpg")));
    }//GEN-LAST:event_segedanyag_kepMouseClicked

    private void segedanyagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segedanyagMouseClicked
        // ha rákattintunk a segédanyagos szövegre,akkor az is eltünik
        String korok ="";
try {
    BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Boldizsár Erik\\Documents\\NetBeansProjects\\Alkalmazas\\src\\eszkozok\\korok\\korok2.txt"));
    // Az ékezeteket az ISO-8859-2-vel lehet megnyitni!
    StringBuilder sb = new StringBuilder();
    String line = br.readLine();
    while (line != null)
    {
        sb.append(line);
        sb.append(System.lineSeparator());
        line = br.readLine();
    }
    korok = sb.toString();
    }
        catch(IOException ex)
            {
           System.out.println("Nincs meg a fájl!");
           }  
    segedanyag.setText(korok);
    }//GEN-LAST:event_segedanyagMouseClicked
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Korok().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bekuldes_gomb;
    private javax.swing.JMenu elerhetoseg_menu;
    private javax.swing.JMenuItem elso_menu;
    private javax.swing.JLabel feladatkep;
    private javax.swing.JMenuBar felso_valaszto_menu;
    private javax.swing.JTextPane informacios_szoveg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextPane jTextPane1_szoveg;
    private javax.swing.JTextPane jTextPane1_szoveg1;
    private javax.swing.JTextPane jTextPane2_megoldas;
    private javax.swing.JTextPane jTextPane4_ellenorzes;
    private javax.swing.JButton kilepes_gomb;
    private javax.swing.JMenu kilepes_menu;
    private javax.swing.JMenuItem masodik_menu;
    private javax.swing.JButton mutasd_a_feladatot_gomb;
    private javax.swing.JButton mutasd_a_megoldast_gomb;
    private javax.swing.JButton mutasd_a_pontot_gomb;
    private javax.swing.JTextPane segedanyag;
    private javax.swing.JButton segedanyag_gomb;
    private javax.swing.JLabel segedanyag_kep;
    private javax.swing.JLabel szoveg2;
    private javax.swing.JLabel szovegmezo;
    private javax.swing.JButton vissza_gomb;
    // End of variables declaration//GEN-END:variables
private void setIcon() 
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/eszkozok/program/ikon.jpg"))); //Itt állítom be az ikont
    }
}
