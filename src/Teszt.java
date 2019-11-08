import java.awt.Color;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Math.sqrt;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Teszt extends javax.swing.JFrame {
    public Teszt() {
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setTitle("K�r�k");
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
        szoveg = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane2_megoldas = new javax.swing.JTextPane();
        bekuldes_gomb = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane4_ellenorzes = new javax.swing.JTextPane();
        mutasd_a_feladatot_gomb = new javax.swing.JButton();
        feladatkep = new javax.swing.JLabel();
        mutasd_a_pontot_gomb = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane1_szoveg1 = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        informacios_szoveg = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        db_kiir = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        feladat_db = new javax.swing.JTextPane();
        felso_valaszto_menu = new javax.swing.JMenuBar();
        fajl_menu = new javax.swing.JMenu();
        kilepes_menu = new javax.swing.JMenuItem();
        segitseg_menu = new javax.swing.JMenu();
        elerhetoseg_menu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        vissza_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/vissza.png"))); // NOI18N
        vissza_gomb.setText("Vissza a men�be");
        vissza_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vissza_gombActionPerformed(evt);
            }
        });

        szovegmezo.setText("�dv�z�llek a teszten! Kattints a \"Mutasd a feladatot\" gombra, �s kezd el megoldani a feladatokat!");

        kilepes_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/kilepes.png"))); // NOI18N
        kilepes_gomb.setText("Kil�p�s");
        kilepes_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kilepes_gombActionPerformed(evt);
            }
        });

        jTextPane1_szoveg.setEditable(false);
        jTextPane1_szoveg.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane2.setViewportView(jTextPane1_szoveg);

        szoveg.setText("A megold�sod ide �rhatod:");

        jTextPane2_megoldas.setBackground(new java.awt.Color(153, 153, 255));
        jScrollPane3.setViewportView(jTextPane2_megoldas);

        bekuldes_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/pipa.png"))); // NOI18N
        bekuldes_gomb.setText("BEK�LD�S");
        bekuldes_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bekuldes_gombActionPerformed(evt);
            }
        });

        jTextPane4_ellenorzes.setEditable(false);
        jTextPane4_ellenorzes.setBackground(new java.awt.Color(153, 153, 255));
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
        jTextPane1_szoveg1.setBackground(new java.awt.Color(153, 153, 255));
        jScrollPane6.setViewportView(jTextPane1_szoveg1);

        informacios_szoveg.setEditable(false);
        informacios_szoveg.setBackground(new java.awt.Color(153, 153, 255));
        informacios_szoveg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        informacios_szoveg.setText("A megold�s be�r�sakor 2-tizedesjegyre val� kerek�t�st kell alkalmazni!\nA be�rt megold�s elfogadott form�tuma: pl.: 281.17\nMinden j� megold�s ut�n kapsz egy plusz pontot, pontjaid sz�ma a /Mutasd a pontjaimat!/ gomb seg�ts�g�vel tekinthet� meg.\nBal oldalt l�thatod, hogy h�ny feladatot siker�lt megoldani helyesen, illetve az id�t.\n");
        jScrollPane1.setViewportView(informacios_szoveg);

        db_kiir.setEditable(false);
        db_kiir.setBackground(new java.awt.Color(153, 153, 255));
        db_kiir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 0)));
        db_kiir.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jScrollPane4.setViewportView(db_kiir);

        feladat_db.setEditable(false);
        feladat_db.setBackground(new java.awt.Color(153, 153, 255));
        feladat_db.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 0)));
        feladat_db.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jScrollPane7.setViewportView(feladat_db);

        fajl_menu.setText("F�jl");

        kilepes_menu.setText("Kil�p�s");
        kilepes_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kilepes_menuActionPerformed(evt);
            }
        });
        fajl_menu.add(kilepes_menu);

        felso_valaszto_menu.add(fajl_menu);

        segitseg_menu.setText("Seg�ts�g");

        elerhetoseg_menu.setText("El�rhet�s�g");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vissza_gomb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kilepes_gomb)
                        .addGap(182, 182, 182))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(szovegmezo, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                                .addGap(733, 733, 733))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(feladatkep, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bekuldes_gomb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mutasd_a_feladatot_gomb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(141, 141, 141)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mutasd_a_pontot_gomb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(szoveg)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(224, 224, 224))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(szovegmezo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(feladatkep, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(szoveg)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mutasd_a_pontot_gomb, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane6)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(bekuldes_gomb, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mutasd_a_feladatot_gomb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vissza_gomb)
                    .addComponent(kilepes_gomb))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vissza_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vissza_gombActionPerformed
        //Vissza a men�be gomb
        Program Program = new Program();
        Program.setVisible(true);
        dispose();
    }//GEN-LAST:event_vissza_gombActionPerformed

    private void kilepes_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kilepes_gombActionPerformed
        //Kil�p�s
        Object[] options = {"Igen","Nem"};
int n = JOptionPane.showOptionDialog(null,
            "Biztosan ki szeretn�l l�pni?",
            "Kil�p�s",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.DEFAULT_OPTION,
            null,
            options,
            options[1]);  
        if(n == 0)
            System.exit(0);
    }//GEN-LAST:event_kilepes_gombActionPerformed

    private void kilepes_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kilepes_menuActionPerformed
        //Kil�p�s
        Object[] options = {"Igen","Nem"};
int n = JOptionPane.showOptionDialog(null,
            "Biztosan ki szeretn�l l�pni?",
            "Kil�p�s",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.DEFAULT_OPTION,
            null,
            options,
            options[1]);  
        if(n == 0)
            System.exit(0);
    }//GEN-LAST:event_kilepes_menuActionPerformed

    private void elerhetoseg_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elerhetoseg_menuActionPerformed
        //Segitseg
        Segitseg Segitseg = new Segitseg();
        Segitseg.setVisible(true);
    }//GEN-LAST:event_elerhetoseg_menuActionPerformed

    int db = 0;
    private void general() //Ezzel a f�ggv�nnyel olyan 3-sz�mot gener�lunk, melyekb�l lehet h�romsz�get szerkeszteni
                        {
                x = rand.nextInt(100)+1;
                y = rand.nextInt(100)+1;
                z = rand.nextInt(100)+1;                          
                        }
    
    float PI = (float) 3.14; //Voltak pr�b�lkoz�sok, de mivel n�h�ny sz�m�t�sn�l gy�k�t kell vonni, ez�rt mindig lesz hiba,
    //sz�val �tt�r�nk a kerek�t�shez, amit a "kerekit" f�ggv�ny v�gez el, 2 tizedesjegy pontoss�gra be�ll�tva.
    float megoldas = -1000;
    int szamlalo = 0;
    int sugar = 0;
    float kerulet = 0;
    float terulet = 0;
    int atmero = 0;
    Random rand = new Random();
    int helyes_megoldas = 0;
    float bekuldott_megoldas = 0;
    boolean megnezte_a_megoldast = false;
    
    float x = 0; //a-oldal rendszerint
    float y = 0; //b-oldal
    float z = 0; //c-oldal
    float szog1 = 0; //A-sz�g
    float szog2 = 0; //B-sz�g
    float szog3 = 0; //C-sz�g
    float szogek_osszege = 0;
    float magassag = 0; 
    
    float a = 0;
    float b = 0;
    float c = 0;
    float d = 0;
    float e = 0;
    float f = 0;
    
    private void bekuldes_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bekuldes_gombActionPerformed
        //Bek�ld�s 
        if (db >= 11)
        {
            jTextPane1_szoveg.setText("V�GE A TESZTNEK! Ki tudsz l�pni a vissza gombbal a men�be, �s megtekintheted a szerzett pontjaid sz�m�t!");
            db_kiir.setText("10 / " + helyes_megoldas);
        }
        else
        {
        try{
        bekuldott_megoldas = Float.parseFloat(jTextPane2_megoldas.getText());
        if(megoldas == -1000)
            jTextPane4_ellenorzes.setText("Nincs kiv�lasztva feladat!");
        else if (jTextPane2_megoldas.getText().isEmpty())
        {
            jTextPane4_ellenorzes.setText("Nem �rt�l megold�st!");
        }
        else
        {
        bekuldott_megoldas = Float.parseFloat(jTextPane2_megoldas.getText());
        
        if (bekuldott_megoldas == megoldas)
        {
            //Kell egy v�ltoz�, ami a mutasd_a_megold�st - gomb megnyom�sakor aktiv�l�dik, �s itt leellen�rizz�k, hogy 
            // adhat�-e plusz pont, mert ha megn�zt�k a megold�st, akkor nem j�r �rte pont.
            jTextPane4_ellenorzes.setText("Helyes!");
            if( megnezte_a_megoldast == false)
            {
            helyes_megoldas++;
            jTextPane4_ellenorzes.setText("Helyes!Szerezt�l egy plusz pontot!");
            Adatok_megosztasa.teszt_pontszam = helyes_megoldas;
            }
            jTextPane4_ellenorzes.setBackground(Color.green);
        }
                    else
        {
            jTextPane4_ellenorzes.setText("Helytelen! Pr�b�lkozz �jra!");
            jTextPane4_ellenorzes.setBackground(Color.red);
        }
        }
            }
catch(NumberFormatException ex)
{
    jTextPane4_ellenorzes.setBackground(Color.MAGENTA);
    jTextPane4_ellenorzes.setText("Nem megfelel� form�tum� a be�rt megold�s, vagy m�g nincs kiv�lasztva feladat! Pr�b�lkozz �jra egy sz�mmal!");
}     
        
        db_kiir.setText(Integer.toString(db)+ " / " + helyes_megoldas);
        }
    }//GEN-LAST:event_bekuldes_gombActionPerformed
    
    private void mutasd_a_feladatot_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mutasd_a_feladatot_gombActionPerformed
        //Mutasd a feladatot
        mutasd_a_feladatot_gomb.setText("K�vetkez� feladat");
        szamlalo = rand.nextInt(62)+1;;
        jTextPane4_ellenorzes.setBackground(new java.awt.Color(153,153,255));
        jTextPane4_ellenorzes.setText("");
        megnezte_a_megoldast = false;
        jTextPane2_megoldas.setText("");
        
        //Feladat sz�m�nak mutat�sa:
        db++;
        if(db < 11)
        {
        feladat_db.setText(db +".FELADAT");
        }
        if(db > 10)
        {
            jTextPane1_szoveg.setText("V�GE A TESZTNEK! Ki tudsz l�pni a vissza gombbal a men�be, �s megtekintheted a szerzett pontjaid sz�m�t!");
            db_kiir.setText("10 / " + helyes_megoldas);
        }
    }//GEN-LAST:event_mutasd_a_feladatot_gombActionPerformed
    
    
    private void mutasd_a_feladatot_gombMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mutasd_a_feladatot_gombMouseClicked
        //Miut�n kattintottunk a mutasd a feladatot/k�vetkez� gombra:
         jTextPane1_szoveg1.setText("Itt n�zheted meg a pontjaid sz�m�t!");
         
             if (db >= 11)
        {
            jTextPane1_szoveg.setText("V�GE A TESZTNEK! Ki tudsz l�pni a vissza gombbal a men�be, �s megtekintheted a szerzett pontjaid sz�m�t!");
            db_kiir.setText("10 / " + helyes_megoldas);
        }
             else {
        if (szamlalo == 1)
        {
            feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/korok/1.jpg")));
            sugar = rand.nextInt(50)+1;
            jTextPane1_szoveg.setText("A k�r sugara, R = "+sugar+" cm. Mennyi lesz a k�r ter�lete?"); 
            megoldas = (float) PI * sugar * sugar;    
            megoldas = (float) Adatok_megosztasa.kerekit (megoldas, 2);
        }
        if (szamlalo == 2)
        {
         feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/korok/2.jpg")));
         sugar = rand.nextInt(50)+1;
         jTextPane1_szoveg.setText("A k�r sugara, R = "+sugar+" cm. Mennyi lesz a k�r ker�lete?"); 
         megoldas = (float) ((float) 2 * PI * sugar);    
         megoldas = (float) Adatok_megosztasa.kerekit (megoldas, 2);
        }
        if (szamlalo == 3)
        {
         feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/korok/3.jpg")));
         atmero = rand.nextInt(50)+1;
         jTextPane1_szoveg.setText("A k�r �tm�r�je, d = "+atmero+" cm. Mennyi lesz a k�r ker�lete?"); 
         megoldas = (float) ((float) PI * atmero);   
         megoldas = (float) Adatok_megosztasa.kerekit (megoldas, 2);
        }
        if (szamlalo == 4)
        {
          feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/korok/4.jpg")));
         atmero = rand.nextInt(50)+1;
         jTextPane1_szoveg.setText("A k�r �tm�r�je, d = "+atmero+" cm. Mennyi lesz a k�r ter�lete?"); 
         megoldas = (float) ((float) PI * atmero * atmero)/4;   
         megoldas = (float) Adatok_megosztasa.kerekit (megoldas, 2);
        }
        if (szamlalo == 5)
        {
          feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/korok/5.jpg")));
         terulet = rand.nextInt(50)+1;
         jTextPane1_szoveg.setText("A k�r ter�lete, T = "+terulet+" cm. Mennyi lesz a k�r sugara?"); 
         terulet = (float) (terulet / PI);
         megoldas = (float)  Math.sqrt(terulet);
         megoldas = (float) Adatok_megosztasa.kerekit (megoldas, 2);
        }
         if (szamlalo == 6)
        {
         feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/korok/6.jpg")));
         terulet = rand.nextInt(50)+1;
         jTextPane1_szoveg.setText("A k�r ter�lete, T = "+terulet+" cm. Mennyi lesz a k�r �tm�r�je?"); 
         terulet = (float) ((terulet * 4) / PI);
         megoldas = (float) Math.sqrt(terulet);
         megoldas = (float) Adatok_megosztasa.kerekit (megoldas, 2);
        }
         if (szamlalo == 7)
        {
         feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/korok/7.jpg")));
         kerulet = rand.nextInt(50)+1;
         jTextPane1_szoveg.setText("A k�r ker�lete, K = "+kerulet+" cm. Mennyi lesz a k�r �tm�r�je?"); 
         megoldas = (float) (kerulet / PI);
         megoldas = (float) Adatok_megosztasa.kerekit (megoldas, 2);
        }
         if (szamlalo == 8)
        {
         feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/korok/8.jpg")));
         kerulet = rand.nextInt(50)+1;
         jTextPane1_szoveg.setText("A k�r ker�lete, K = "+kerulet+" cm. Mennyi lesz a k�r sugara?"); 
         megoldas = (float) (kerulet / (2*PI));
         megoldas = (float) Adatok_megosztasa.kerekit (megoldas, 2);
        }
         if(szamlalo == 9)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/d_1.png")));
                    general();
                    while((x >= y+z) || (y >= x+z) || (z >= y+x)) //Itt vizsg�ljuk meg,hogy szerkeszthet�-e h�romsz�g
                {
                 general(); //Ha valami ott teljes�l, akkor nem,ez�rt ujra meghivjuk addig a "general()"-f�ggv�nyt, amig nem kapunk megfelel� hosszus�gu oldalakat
                    }
                jTextPane1_szoveg.setText("Der�ksz�g� h�romsz�g:\n Adott egy der�ksz�g� h�romsz�g,melynek h�rom oldala ismert: a="+x+" cm, b="+y+" cm, c="+z+" cm, mennyi lesz a h�romsz�g ter�lete?");
                float s = (x+y+z)/2;
                terulet = s*(s-x)*(s-y)*(s-z); //A haszn�lt k�plet: T = gy�k(s*(s-a)*(s-b)*(s-c)), s = (a+b+c)/2
                terulet = (float) sqrt(terulet);
                megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                if(szamlalo == 10)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/d_2.png")));
                    szog1 = rand.nextInt(45)+1; //Az�rt 45-ig megy, mivel igy j�nnek ki a legjobb sz�gek
                 jTextPane1_szoveg.setText("Der�ksz�g� h�romsz�g:\n Adott egy der�ksz�g� h�romsz�g, melynek ismert az egyik sz�ge: B="+szog1+" � Mennyi lesz a C-sz�ge?"); 
            megoldas = 180-90-szog1;   
                }
                if(szamlalo == 11)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/d_3.png")));
                    x = rand.nextInt(100)+1; //A magass�g fele annyira van be�ll�tva, hogy ne j�jjenek ki sz�rre�lis sz�mok
                    magassag = rand.nextInt(50)+1;
                    jTextPane1_szoveg.setText("Der�ksz�g� h�romsz�g:\n Adott egy der�ksz�g� h�romsz�g, melynek ismert az egyik oldala, �s az erre az oldalra illeszked� magass�ga. a="+x+" cm, M'a="+magassag+" cm, ami egyben a b oldal is, mennyi lesz a h�romsz�g ter�lete?"); 
                   terulet = (x*magassag)/2;
                   megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                 if(szamlalo == 12)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/d_4.png")));
                    general();
                    while((x >= y+z) || (y >= x+z) || (z >= y+x)) //Itt vizsg�ljuk meg,hogy szerkeszthet�-e h�romsz�g
                {
                 general(); //Ha valami ott teljes�l, akkor nem,ez�rt ujra meghivjuk addig a "general()"-f�ggv�nyt, amig nem kapunk megfelel� hosszus�gu oldalakat
                }
                    float s = (x+y+z)/2;
                terulet = s*(s-x)*(s-y)*(s-z);
                terulet = (float) sqrt(terulet);
                terulet = (float) Adatok_megosztasa.kerekit(terulet,2);
                    jTextPane1_szoveg.setText("Der�ksz�g� h�romsz�g:\n Adott egy der�ksz�g� h�romsz�g, melynek ismert a ter�lete: T="+terulet+" cm^2, illetve mindh�rom oldala: a="+x+" cm, b="+y+" cm, c="+z+" cm, mennyi lesz M'a �rt�ke?");
                    magassag = (2*terulet)/x;
                    megoldas = (float) Adatok_megosztasa.kerekit(magassag,2);
                }
                if(szamlalo == 13)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/d_5.png")));
                    general();
                    while((x >= y+z) || (y >= x+z) || (z >= y+x)) //Itt vizsg�ljuk meg,hogy szerkeszthet�-e h�romsz�g
                {
                 general(); //Ha valami ott teljes�l, akkor nem,ez�rt ujra meghivjuk addig a "general()"-f�ggv�nyt, amig nem kapunk megfelel� hosszus�gu oldalakat
                }
                    float s = (x+y+z)/2;
                terulet = s*(s-x)*(s-y)*(s-z);
                terulet = (float) sqrt(terulet);
                terulet = (float) Adatok_megosztasa.kerekit(terulet,2);
                magassag = (2*terulet)/z;
                magassag = (float) Adatok_megosztasa.kerekit(magassag,2);
                    jTextPane1_szoveg.setText("Der�ksz�g� h�romsz�g:\n Adott egy der�ksz�g� h�romsz�g, melynek ismert a ter�lete: T="+terulet+" cm^2, illetve 2 oldala: a="+x+" cm, b="+y+" cm, valamint egy magass�ga: M'c="+magassag+" cm, mennyi lesz a h�romsz�g ker�lete?");   
                    megoldas = x+z+y;
                }
                if(szamlalo == 14)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/d_6.png")));
                    general();
                    while((x >= y+z) || (y >= x+z) || (z >= y+x)) //Itt vizsg�ljuk meg,hogy szerkeszthet�-e h�romsz�g
                {
                 general(); //Ha valami ott teljes�l, akkor nem,ez�rt ujra meghivjuk addig a "general()"-f�ggv�nyt, amig nem kapunk megfelel� hosszus�gu oldalakat
                }
                    terulet = (x * x)/2;
                    jTextPane1_szoveg.setText("Der�ksz�g� h�romsz�g:\n Adott egy der�ksz�g� h�romsz�g, ahol az A-sz�g �rt�ke: 90�, �s az 'a', valamint a 'b' oldala is egyar�nt: a=b="+x+" cm, mennyi lesz a h�romsz�g ter�lete?");   
                    megoldas = terulet;
                }
                if(szamlalo == 15)
                        {
                            feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/e_1.png")));
                           kerulet = rand.nextInt(350+1)+150; //igy 150-t�l gener�l 500ig
                           x = rand.nextInt(100)+1; 
                           jTextPane1_szoveg.setText("Egyenl� sz�r� h�romsz�g:\n Adva van egy egyenl�sz�r� h�romsz�g, melynek ismert a ker�lete: K="+kerulet+" cm, illetve az egyik oldala: a="+x+" cm, mennyi lesz a h�romsz�g m�sik k�t oldal�nak a hossza?");
                           y = (kerulet - x)/2;
                           megoldas = y;
                        }
                if(szamlalo == 16)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/e_2.png")));
                    szog2 = rand.nextInt(89)+1; 
                    jTextPane1_szoveg.setText("Egyenl� sz�r� h�romsz�g:\n Adott egy egyenl�sz�r� h�romsz�g, amelynek ismert egy sz�ge: B="+szog2+"�, mennyi lesz a m�sik k�t sz�ge?");
                    szog1 = (180-szog2)/2;
                    megoldas = szog1;
                }
                if(szamlalo == 17)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/e_3.png")));
                    general();
                    x = y;    //Ezt az�rt kell, mivel egyenl�sz�r� a h�romsz�g
                    while((x >= y+z) || (y >= x+z) || (z >= y+x)) //Itt vizsg�ljuk meg,hogy szerkeszthet�-e h�romsz�g
                {
                 general(); //Ha valami ott teljes�l, akkor nem,ez�rt ujra meghivjuk addig a "general()"-f�ggv�nyt, amig nem kapunk megfelel� hosszus�gu oldalakat
                }
                jTextPane1_szoveg.setText("Egyenl� sz�r� h�romsz�g:\n Adott egy egyenl�sz�r� h�romsz�g,melynek h�rom oldala ismert: a="+x+" cm, b="+y+" cm, c="+z+" cm, mennyi lesz a h�romsz�g ter�lete?");
                float s = (x+y+z)/2;
                terulet = s*(s-x)*(s-y)*(s-z);
                terulet = (float) sqrt(terulet);
                megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                if(szamlalo == 18)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/e_4.png")));
                 y = rand.nextInt(100)+1; //A magass�g fele annyira van be�ll�tva, hogy ne j�jjenek ki sz�rre�lis sz�mok
                    magassag = rand.nextInt(50)+1;
                    jTextPane1_szoveg.setText("Egyenl� sz�r� h�romsz�g:\n Adott egy egyenl�sz�r� h�romsz�g, melynek ismert az egyik oldala, �s az erre az oldalra illeszked� magass�ga. b="+y+" cm, M'b="+magassag+" cm, mennyi lesz a h�romsz�g ter�lete?"); 
                   terulet = (y*magassag)/2;
                   megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                if(szamlalo == 19)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/e_5.png")));
                     general();
                     x = y; //Ez az�rt kell, hogy 2-oldala egyenl� legyen
                    while((x >= y+z) || (y >= x+z) || (z >= y+x)) //Itt vizsg�ljuk meg,hogy szerkeszthet�-e h�romsz�g
                {
                 general(); //Ha valami ott teljes�l, akkor nem,ez�rt ujra meghivjuk addig a "general()"-f�ggv�nyt, amig nem kapunk megfelel� hosszus�gu oldalakat
                }
                    float s = (x+y+z)/2;
                terulet = s*(s-x)*(s-y)*(s-z);
                terulet = (float) sqrt(terulet);
                terulet = (float) Adatok_megosztasa.kerekit(terulet,2);
                    jTextPane1_szoveg.setText("Egyenl� sz�r� h�romsz�g:\n Adott egy egyenl�sz�r� h�romsz�g, melynek ismert a ter�lete: T="+terulet+" cm^2, illetve mindh�rom oldala: a="+x+" cm, b="+y+" cm, c="+z+" cm, mennyi lesz M'c �rt�ke?");
                    magassag = (float) Adatok_megosztasa.kerekit(((2*terulet)/z),2);
                    megoldas = (float) Adatok_megosztasa.kerekit(magassag,2);
                }
                if(szamlalo == 20)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/e_6.png")));
                     general();
                     x = y;
                    while((x >= y+z) || (y >= x+z) || (z >= y+x)) //Itt vizsg�ljuk meg,hogy szerkeszthet�-e h�romsz�g
                {
                 general(); //Ha valami ott teljes�l, akkor nem,ez�rt ujra meghivjuk addig a "general()"-f�ggv�nyt, amig nem kapunk megfelel� hosszus�gu oldalakat
                }
                    float s = (x+y+z)/2;
                terulet = s*(s-x)*(s-y)*(s-z);
                terulet = (float) sqrt(terulet);
                terulet = (float) Adatok_megosztasa.kerekit(terulet,2);
                magassag = (2*terulet)/y;
                    jTextPane1_szoveg.setText("Egyenl� sz�r� h�romsz�g:\n Adott egy egyenl�sz�r� h�romsz�g, melynek ismert a ter�lete: T="+terulet+" cm^2, illetve 2 oldala: a="+x+" cm, c="+z+" cm, valamint egy magass�ga: M'b="+magassag+" cm, mennyi lesz a h�romsz�g ker�lete?");   
                    megoldas = x+z+y;
                }
                if(szamlalo == 21)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/e_7.png")));
                     general();
                     x = y;
                    while((x >= y+z) || (y >= x+z) || (z >= y+x)) //Itt vizsg�ljuk meg,hogy szerkeszthet�-e h�romsz�g
                {
                 general(); //Ha valami ott teljes�l, akkor nem,ez�rt ujra meghivjuk addig a "general()"-f�ggv�nyt, amig nem kapunk megfelel� hosszus�gu oldalakat
                }
                    terulet = (y * y)/2;
                    jTextPane1_szoveg.setText("Egyenl� sz�r� h�romsz�g:\n Adott egy egyenl�sz�r� h�romsz�g, melynek ismert a 2 oldala: a=b="+y+"cm, illetve tudjuk, hogy a B sz�ge der�ksz�g, mennyi lesz a ter�lete a h�romsz�gnek?");   
                    megoldas = terulet;
                }
                if(szamlalo == 22)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/h_1.png")));
                    general();
                    while((x >= y+z) || (y >= x+z) || (z >= y+x)) //Itt vizsg�ljuk meg,hogy szerkeszthet�-e h�romsz�g
                {
                 general(); //Ha valami ott teljes�l, akkor nem,ez�rt ujra meghivjuk addig a "general()"-f�ggv�nyt, amig nem kapunk megfelel� hosszus�gu oldalakat
                }
                jTextPane1_szoveg.setText("Hegyessz�g� h�romsz�g:\n Adott egy hegyessz�g� h�romsz�g,melynek h�rom oldala ismert: a="+x+" cm, b="+y+" cm, c="+z+" cm, mennyi lesz a h�romsz�g ter�lete?");
                float s = (x+y+z)/2;
                terulet = s*(s-x)*(s-y)*(s-z);
                terulet = (float) sqrt(terulet);
                megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                if(szamlalo == 23)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/h_2.png")));
                    x = rand.nextInt(100)+1; //A magass�g fele annyira van be�ll�tva, hogy ne j�jjenek ki sz�rre�lis sz�mok
                    magassag = rand.nextInt(50)+1;
                    jTextPane1_szoveg.setText("Hegyessz�g� h�romsz�g:\n Adott egy hegyessz�g� h�romsz�g, melynek ismert az egyik oldala, �s az erre az oldalra illeszked� magass�ga. a="+x+" cm, M'a="+magassag+" cm, mennyi lesz a h�romsz�g ter�lete?"); 
                   terulet = (x*magassag)/2;
                   megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                 if(szamlalo == 24)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/h_3.png")));
                    general();
                    while((x >= y+z) || (y >= x+z) || (z >= y+x)) //Itt vizsg�ljuk meg,hogy szerkeszthet�-e h�romsz�g
                {
                 general(); //Ha valami ott teljes�l, akkor nem,ez�rt ujra meghivjuk addig a "general()"-f�ggv�nyt, amig nem kapunk megfelel� hosszus�gu oldalakat
                }
                    float s = (x+y+z)/2;
                terulet = s*(s-x)*(s-y)*(s-z);
                terulet = (float) sqrt(terulet);
                terulet = (float) Adatok_megosztasa.kerekit(terulet,2);
                    jTextPane1_szoveg.setText("Hegyessz�g� h�romsz�g:\n Adott egy hegyessz�g� h�romsz�g, melynek ismert a ter�lete: T="+terulet+" cm^2, illetve mindh�rom oldala: a="+x+" cm, b="+y+" cm, c="+z+" cm, mennyi lesz M'a �rt�ke?");
                    magassag = (float) Adatok_megosztasa.kerekit(((2*terulet)/x),2);
                    megoldas = (float) Adatok_megosztasa.kerekit(magassag,2);
                }
                if(szamlalo == 25)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/h_4.png")));
                    general();
                    while((x >= y+z) || (y >= x+z) || (z >= y+x)) //Itt vizsg�ljuk meg,hogy szerkeszthet�-e h�romsz�g
                {
                 general(); //Ha valami ott teljes�l, akkor nem,ez�rt ujra meghivjuk addig a "general()"-f�ggv�nyt, amig nem kapunk megfelel� hosszus�gu oldalakat
                }
                    float s = (x+y+z)/2;
                terulet = s*(s-x)*(s-y)*(s-z);
                terulet = (float) sqrt(terulet);
                terulet = (float) Adatok_megosztasa.kerekit(terulet,2);
                magassag = (float) Adatok_megosztasa.kerekit(((2*terulet)/z),2);
                    jTextPane1_szoveg.setText("Hegyessz�g� h�romsz�g:\n Adott egy hegyessz�g� h�romsz�g, melynek ismert a ter�lete: T="+terulet+" cm^2, illetve 2 oldala: a="+x+" cm, b="+y+" cm, valamint egy magass�ga: M'c="+magassag+" cm, mennyi lesz a h�romsz�g ker�lete?");   
                    megoldas = x+z+y;
                }
                if(szamlalo == 26)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/t_1.png")));
                    general();
                    while((x >= y+z) || (y >= x+z) || (z >= y+x)) //Itt vizsg�ljuk meg,hogy szerkeszthet�-e h�romsz�g
                {
                 general(); //Ha valami ott teljes�l, akkor nem,ez�rt ujra meghivjuk addig a "general()"-f�ggv�nyt, amig nem kapunk megfelel� hosszus�gu oldalakat
                }
                jTextPane1_szoveg.setText("Tompasz�g� h�romsz�g:\n Adott egy tompasz�g� h�romsz�g,melynek h�rom oldala ismert: a="+x+" cm, b="+y+" cm, c="+z+" cm, mennyi lesz a h�romsz�g ter�lete?");
                float s = (x+y+z)/2;
                terulet = s*(s-x)*(s-y)*(s-z);
                terulet = (float) sqrt(terulet);
                megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                if(szamlalo == 27)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/t_2.png")));
                    x = rand.nextInt(100)+1; //A magass�g fele annyira van be�ll�tva, hogy ne j�jjenek ki sz�rre�lis sz�mok
                    magassag = rand.nextInt(50)+1;
                    jTextPane1_szoveg.setText("Tompasz�g� h�romsz�g:\n Adott egy tompasz�g� h�romsz�g, melynek ismert az egyik oldala, �s az erre az oldalra illeszked� magass�ga. c="+x+" cm, M'c="+magassag+" cm, mennyi lesz a h�romsz�g ter�lete?"); 
                   terulet = (x*magassag)/2;
                   megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                 if(szamlalo == 28)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/t_3.png")));
                    general();
                    while((x >= y+z) || (y >= x+z) || (z >= y+x)) //Itt vizsg�ljuk meg,hogy szerkeszthet�-e h�romsz�g
                {
                 general(); //Ha valami ott teljes�l, akkor nem,ez�rt ujra meghivjuk addig a "general()"-f�ggv�nyt, amig nem kapunk megfelel� hosszus�gu oldalakat
                }
                    float s = (x+y+z)/2;
                terulet = s*(s-x)*(s-y)*(s-z);
                terulet = (float) sqrt(terulet);
                terulet = (float) Adatok_megosztasa.kerekit(terulet,2);
                    jTextPane1_szoveg.setText("Tompasz�g� h�romsz�g:\n Adott egy tompasz�g� h�romsz�g, melynek ismert a ter�lete: T="+terulet+" cm^2, illetve mindh�rom oldala: a="+x+" cm, b="+y+" cm, c="+z+" cm, mennyi lesz M'b �rt�ke?");
                    magassag = (2*terulet)/y;
                    megoldas = (float) Adatok_megosztasa.kerekit(magassag,2);
                }
                if(szamlalo == 29)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/t_4.png")));
                    general();
                    while((x >= y+z) || (y >= x+z) || (z >= y+x)) //Itt vizsg�ljuk meg,hogy szerkeszthet�-e h�romsz�g
                {
                 general(); //Ha valami ott teljes�l, akkor nem,ez�rt ujra meghivjuk addig a "general()"-f�ggv�nyt, amig nem kapunk megfelel� hosszus�gu oldalakat
                }
                    float s = (x+y+z)/2;
                terulet = s*(s-x)*(s-y)*(s-z);
                terulet = (float) sqrt(terulet);
                terulet = (float) Adatok_megosztasa.kerekit(terulet,2);
                magassag = (float) Adatok_megosztasa.kerekit(((2*terulet)/x),2);
                    jTextPane1_szoveg.setText("Tompasz�g� h�romsz�g:\n Adott egy tompasz�g� h�romsz�g, melynek ismert a ter�lete: T="+terulet+" cm^2, illetve 2 oldala: b="+y+" cm, c="+z+" cm, valamint egy magass�ga: M'a="+magassag+" cm, mennyi lesz a h�romsz�g ker�lete?");   
                    megoldas = x+z+y;
                }
                if(szamlalo == 30)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/a_1.png")));
                    general();
                    while((x >= y+z) || (y >= x+z) || (z >= y+x)) //Itt vizsg�ljuk meg,hogy szerkeszthet�-e h�romsz�g
                {
                 general(); //Ha valami ott teljes�l, akkor nem,ez�rt ujra meghivjuk addig a "general()"-f�ggv�nyt, amig nem kapunk megfelel� hosszus�gu oldalakat
                }
                jTextPane1_szoveg.setText("�ltal�nos h�romsz�g:\n Adott egy h�romsz�g,melynek h�rom oldala ismert: a="+x+" cm, b="+y+" cm, c="+z+" cm, mennyi lesz a h�romsz�g ter�lete?");
                float s = (x+y+z)/2;
                terulet = s*(s-x)*(s-y)*(s-z);
                terulet = (float) sqrt(terulet);
                megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                if(szamlalo == 31)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/a_2.png")));
                    x = rand.nextInt(100)+1; //A magass�g fele annyira van be�ll�tva, hogy ne j�jjenek ki sz�rre�lis sz�mok
                    magassag = rand.nextInt(50)+1;
                    jTextPane1_szoveg.setText("�ltal�nos h�romsz�g:\n Adott egy h�romsz�g, melynek ismert az egyik oldala, �s az erre az oldalra illeszked� magass�ga. b="+x+" cm, M'b="+magassag+" cm, mennyi lesz a h�romsz�g ter�lete?"); 
                   terulet = (x*magassag)/2;
                   megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                 if(szamlalo == 32)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/a_3.png")));
                    general();
                    while((x >= y+z) || (y >= x+z) || (z >= y+x)) //Itt vizsg�ljuk meg,hogy szerkeszthet�-e h�romsz�g
                {
                 general(); //Ha valami ott teljes�l, akkor nem,ez�rt ujra meghivjuk addig a "general()"-f�ggv�nyt, amig nem kapunk megfelel� hosszus�gu oldalakat
                }
                    float s = (x+y+z)/2;
                terulet = s*(s-x)*(s-y)*(s-z);
                terulet = (float) sqrt(terulet);
                terulet = (float) Adatok_megosztasa.kerekit(terulet,2);
                    jTextPane1_szoveg.setText("�ltal�nos h�romsz�g:\n Adott egy h�romsz�g, melynek ismert a ter�lete: T="+terulet+" cm^2, illetve mindh�rom oldala: a="+x+" cm, b="+y+" cm, c="+z+" cm, mennyi lesz M'c �rt�ke?");
                    magassag = (2*terulet)/z;
                    megoldas = (float) Adatok_megosztasa.kerekit(magassag,2);
                }
                if(szamlalo== 33)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/a_4.png")));
                    general();
                    while((x >= y+z) || (y >= x+z) || (z >= y+x)) //Itt vizsg�ljuk meg,hogy szerkeszthet�-e h�romsz�g
                {
                 general(); //Ha valami ott teljes�l, akkor nem,ez�rt ujra meghivjuk addig a "general()"-f�ggv�nyt, amig nem kapunk megfelel� hosszus�gu oldalakat
                }
                    float s = (x+y+z)/2;
                terulet = s*(s-x)*(s-y)*(s-z);
                terulet = (float) sqrt(terulet);
                terulet = (float) Adatok_megosztasa.kerekit(terulet,2);
                magassag = (float) Adatok_megosztasa.kerekit(((2*terulet)/z),2);
                    jTextPane1_szoveg.setText("�ltal�nos h�romsz�g:\n Adott egy h�romsz�g, melynek ismert a ter�lete: T="+terulet+" cm^2, illetve 2 oldala: a="+x+" cm, c="+z+" cm, valamint egy magass�ga: M'b="+magassag+" cm, mennyi lesz a h�romsz�g ker�lete?");   
                    megoldas = x+z+y;
                }
                if(szamlalo == 34)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/sz_1.png")));
                 x = rand.nextInt(250)+1;
                jTextPane1_szoveg.setText("Szab�lyos h�romsz�g:\n Adott egy szab�lyos h�romsz�g,melynek egy oldala ismert: a="+x+"cm, mennyi lesz a h�romsz�g ter�lete?");
                terulet = (float) ((x * x * 1.73)/4);
                megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                if(szamlalo == 35)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/sz_2.png")));
                    magassag = rand.nextInt(50)+1;
                    jTextPane1_szoveg.setText("Szab�lyos h�romsz�g:\n Adott egy szab�lyos h�romsz�g, melynek ismert az egyik magass�ga, M'c="+magassag+" cm, mennyi lesz a h�romsz�g ter�lete?"); 
                    x = (float) (magassag/(1.72/2));
                    terulet = (float) ((1.72/4) * x*x);
                   megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                 if(szamlalo == 36)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/sz_3.png")));
                    z = rand.nextInt(250)+1;
                    jTextPane1_szoveg.setText("Szab�lyos h�romsz�g:\n Adott egy szab�lyos h�romsz�g, melynek ismert egy oldala, c="+z+" cm, mennyi lesz M'b �rt�ke?");
                    magassag = (float) ((1.72/2) * z);
                    megoldas = (float) Adatok_megosztasa.kerekit(magassag,2);
                }
                if(szamlalo == 37)
                {      
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/sz_4.png")));
                    magassag = rand.nextInt(50)+1;
                    x = (float) (magassag/(1.72/2));
                    kerulet = (int) (3*x);
                    jTextPane1_szoveg.setText("Szab�lyos h�romsz�g:\n Adott egy szab�lyos h�romsz�g, melynek ismert egy magass�ga: M'a="+magassag+" cm, mennyi lesz a h�romsz�g ker�lete?");   
                    megoldas = (float) Adatok_megosztasa.kerekit(kerulet,2);
                }
                if(szamlalo == 38)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/sz_5.png")));
                    jTextPane1_szoveg.setText("Szab�lyos h�romsz�g:\n Adott egy szab�lyos h�romsz�g, h�ny fok lesz a 3 sz�ge(A,B,C) k�l�n-k�l�n?");   
                    megoldas = 60;
                }
                if(szamlalo == 39)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/n_1.jpg")));
                    a = rand.nextInt(100)+1;
                    jTextPane1_szoveg.setText("N�gyzet:\nAdva van egy n�gyzet, melynek ismert az oldala, a="+a+"cm, mennyi lesz a n�gyzet ter�lete?");
                terulet = a * a;
                megoldas = terulet;
                }
                if(szamlalo== 40)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/n_2.jpg")));
                    c = rand.nextInt(100)+1;
                    jTextPane1_szoveg.setText("N�gyzet:\nAdva van egy n�gyzet, melynek ismert az oldala, c="+c+"cm, mennyi lesz a n�gyzet ker�let�nek �s ter�let�nek az �sszege?");
                terulet = c * c;
                kerulet = 4 * c;
                megoldas = terulet + kerulet;
                }
                if(szamlalo == 40)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/n_3.jpg")));
                c = rand.nextInt(100)+1;
                terulet = c * c;
                kerulet = 4 * c;
                    jTextPane1_szoveg.setText("N�gyzet:\nAdva van egy n�gyzet, melynek ismert a ter�lete:"+terulet+"cm^2, mennyi lesz a n�gyzet ker�lete?");
                megoldas = kerulet;
                }
                if(szamlalo == 42)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/n_4.jpg")));
                c = rand.nextInt(100)+1;
                terulet = c * c;
                kerulet = 4 * c;
                    jTextPane1_szoveg.setText("N�gyzet:\nAdva van egy n�gyzet, melynek ismert a ker�lete:"+kerulet+"cm, mennyi lesz a n�gyzet ter�lete?");
                megoldas = terulet;
                }
                if(szamlalo == 43)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/n_5.jpg")));
                c = rand.nextInt(100)+1;
                terulet = c * c;
                    jTextPane1_szoveg.setText("N�gyzet:\nAdva van egy n�gyzet, melynek ismert a ter�lete:"+terulet+"cm, mennyi lesz a n�gyzet oldala?");
                megoldas = c;
                }
                if(szamlalo == 44)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/t_1_.jpg")));
                    a = rand.nextInt(100)+1;
                    b = rand.nextInt(100)+1;
                    jTextPane1_szoveg.setText("T�glalap:\nAdva van egy t�glalap, melynek ismert k�t oldala, a="+a+"cm, b="+b+"cm, mennyi lesz a t�glalap ter�lete?");
                terulet = a * b;
                megoldas = terulet;
                }
                if(szamlalo == 45)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/t_2_.jpg")));
                    a = rand.nextInt(100)+1;
                    b = rand.nextInt(100)+1;
                    jTextPane1_szoveg.setText("T�glalap:\nAdva van egy t�glalap, melynek ismert a k�t oldala, b="+b+"cm,a="+a+"cm, mennyi lesz a t�glalap ker�let�nek �s ter�let�nek az �sszege?");
                terulet = a * b;
                kerulet = 2*a + 2*b;
                megoldas = terulet + kerulet;
                }
                if(szamlalo == 46)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/t_3_.jpg")));
                a = rand.nextInt(100)+1;
                b = rand.nextInt(100)+1;
                terulet = a * b;
                kerulet = 2*a + 2*b;
                    jTextPane1_szoveg.setText("T�glalap:\nAdva van egy t�glalap, melynek ismert a ter�lete:"+terulet+"cm^2, illetve egyik oldala,a="+a+"cm, mennyi lesz a t�glalap ker�lete?");
                megoldas = kerulet;
                }
                if(szamlalo == 47)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/t_4_.jpg")));
                a = rand.nextInt(100)+1;
                b = rand.nextInt(100)+1;
                terulet = a * b;
                kerulet = 2*a+2*b;
                    jTextPane1_szoveg.setText("T�glalap:\nAdva van egy t�glalap, melynek ismert a ker�lete:"+kerulet+"cm, �s az egyik oldala,b="+b+"cm, mennyi lesz a t�glalap ter�lete?");
                megoldas = terulet;
                }
                if(szamlalo == 48)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/t_5_.jpg")));
                b = rand.nextInt(100)+1;
                a = rand.nextInt(100)+1;
                kerulet = 2*a+2*b;
                    jTextPane1_szoveg.setText("T�glalap:\nAdva van egy t�glalap, melynek ismert a ker�lete:"+kerulet+"cm, illetve az egyik oldala: b="+b+"cm, mennyi lesz a t�glalap m�sik oldala,a-?");
                megoldas = a;
                }
                if(szamlalo == 49)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/r_1.jpg")));
                    b = rand.nextInt(25)+1;
                    a = rand.nextInt(100)+26;
                    jTextPane1_szoveg.setText("Rombusz:\nAdva van egy rombusz, melynek ismert az oldala, a="+a+"cm, illetve a r� illeszked� magass�g, M'a="+b+"cm, mennyi lesz a rombusz ter�lete?");
                terulet = a * b;
                megoldas = terulet;
                }
                if(szamlalo == 50)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/r_2.jpg")));
                    c = rand.nextInt(100)+26;
                    b = rand.nextInt(25)+1;
                    jTextPane1_szoveg.setText("Rombusz:\nAdva van egy rombusz, melynek ismert az oldala, c="+c+"cm, illetve a r� illeszked� magass�ga, M'c="+b+"cm, mennyi lesz a rombusz ker�let�nek �s ter�let�nek az �sszege?");
                terulet = c * b;
                kerulet = 4 * c;
                megoldas = terulet + kerulet;
                }
                if(szamlalo == 51)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/r_3.jpg")));
                terulet = rand.nextInt(300)+26;
                b = rand.nextInt(25)+1;
                c = terulet / b;
                c = (float) Adatok_megosztasa.kerekit(c,2);
                kerulet = 4 * c;
                    jTextPane1_szoveg.setText("Rombusz:\nAdva van egy rombusz, melynek ismert a ter�lete:"+terulet+"cm^2, illetve az egyik magass�ga, M'b="+b+"cm, mennyi lesz a rombusz ker�lete?");
                megoldas = kerulet;
                }
                if(szamlalo == 52)
                {
                   feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/r_4.jpg")));
                e = rand.nextInt(100)+1;
                f = rand.nextInt(100)+1;
                terulet = (e * f)/2;
                    jTextPane1_szoveg.setText("Rombusz:\nAdva van egy rombusz, melynek ismert mindk�t �tl�ja: e="+e+"cm, f="+f+"cm, mennyi lesz a rombusz ter�lete?");
                megoldas =  (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                if(szamlalo == 53)
                {
                   feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/r_5.jpg")));
                e = rand.nextInt(100)+1;
                terulet = rand.nextInt(400)+101;
                f = (2*terulet)/e;
                    jTextPane1_szoveg.setText("Rombusz:\nAdva van egy rombusz, melynek ismert a ter�lete:"+terulet+"cm, illetve az egyik �tl�ja: e="+e+"cm, mennyi lesz a rombusz m�sik �tl�ja, f-?");
                megoldas = (float) Adatok_megosztasa.kerekit(f,2);
                }
                if(szamlalo == 54)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/d_1.jpg")));
                    b = rand.nextInt(100)+1;
                    a = rand.nextInt(100)+1;
                    jTextPane1_szoveg.setText("Deltoid:\nAdva van egy deltoid, melynek ismert mindk�t oldala, a="+a+"cm, b="+b+"cm, mennyi lesz a deltoid ker�lete?");
               kerulet = 2*a+2*b;
                megoldas = kerulet;
                }
                if(szamlalo == 55)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/d_2.jpg")));
                e = rand.nextInt(100)+1;
                f = rand.nextInt(100)+1;
                terulet = (e * f)/2;
                    jTextPane1_szoveg.setText("Deltoid:\nAdva van egy deltoid, melynek ismert mindk�t �tl�ja: e="+e+"cm, f="+f+"cm, mennyi lesz a deltoid ter�lete?");
                megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                  if(szamlalo == 56)
                {
                   feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/d_3.jpg")));
                    a = rand.nextInt(100)+1;
                    kerulet = rand.nextInt(400)+101;
                    jTextPane1_szoveg.setText("Deltoid:\nAdva van egy deltoid, melynek ismert egyik oldala, a="+a+"cm, �s a ker�lete, K="+kerulet+"cm, mennyi lesz a deltoid m�sik oldala, b-?");
                    b = (kerulet - 2*a) /2;
                megoldas = (float) Adatok_megosztasa.kerekit(b,2);
                }
                if(szamlalo == 57)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/d_4.jpg")));
                f = rand.nextInt(100)+1;
                terulet = rand.nextInt(400)+101;
                e = (2*terulet)/f;
                    jTextPane1_szoveg.setText("Deltoid:\nAdva van egy deltoid, melynek ismert a ter�lete:"+terulet+"cm, illetve az egyik �tl�ja: f="+f+"cm, mennyi lesz a deltoid m�sik �tl�ja, e-?");
                megoldas = (float) Adatok_megosztasa.kerekit(e,2);
                }
                if(szamlalo == 58)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/t1.jpg")));
                    b = rand.nextInt(100)+1; //magass�g
                    a = rand.nextInt(100)+1;
                    c = rand.nextInt(100)+1;
                    terulet = ((a+c)*b)/2;
                    jTextPane1_szoveg.setText("Trap�z:\nAdva van egy trap�z, melynek ismert k�t oldala, a="+a+"cm, c="+c+"cm, illetve egyik magass�ga, M'a="+b+"cm, mennyi lesz a trap�z ter�lete?");
                megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                if(szamlalo == 59)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/t2.jpg")));
                    b = rand.nextInt(100)+1;
                    a = rand.nextInt(100)+1;
                    d = rand.nextInt(100)+1;
                    e = rand.nextInt(100)+1; // magass�g
                    terulet = rand.nextInt(600)+101;
                    c = ((2*terulet)/e) - a;
                    c = (float) Adatok_megosztasa.kerekit(c,2);
                    kerulet = a+b+c+d;
                    jTextPane1_szoveg.setText("Trap�z:\nAdva van egy trap�z, melynek ismert 3-oldala: a="+a+"cm, b="+b+"cm, d="+d+"cm, illetve a ter�lete, T="+terulet+"cm, valamint az egyik magass�ga: M'a="+e+"cm, mennyi lesz a trap�z ker�lete?");
                megoldas = kerulet;
                }
                if(szamlalo == 60)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/p_1.jpg")));
                    b = rand.nextInt(100)+1; //magass�g
                    a = rand.nextInt(100)+1;
                    terulet = a * b;
                    jTextPane1_szoveg.setText("Paralelogramma:\nAdva van egy paralelogramma, melynek ismert az egyik oldala, �s egy magass�ga: a="+a+"cm, �s M'a="+b+"cm, mennyi lesz a paralelogramma ter�lete?");
                megoldas = terulet;
                }
                if(szamlalo == 61)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/p_2.jpg")));
                    kerulet =rand.nextInt(400)+101; 
                    b = rand.nextInt(100)+1; 
                    a = (kerulet - (2 * b) )/2;
                    a = (float) Adatok_megosztasa.kerekit(a,2);
                    jTextPane1_szoveg.setText("Paralelogramma:\nAdva van egy paralelogramma, melynek ismert a ker�lete, illetve az egyik oldala, K="+kerulet+"cm, b="+b+"cm, mennyi lesz az a-oldal hossza?");
                megoldas = a;
                }
                if(szamlalo == 62)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/p_3.jpg")));
                    jTextPane1_szoveg.setText("Paralelogramma:\nAdva van egy paralelogramma, mennyi a bels� sz�geinek �sszege?");
                megoldas = 360;
                }
             }
    }//GEN-LAST:event_mutasd_a_feladatot_gombMouseClicked
    
    private void mutasd_a_pontot_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mutasd_a_pontot_gombActionPerformed
        //mutasd a pontjaimat
        jTextPane1_szoveg1.setText("Az eddigi pontjaid sz�ma: "+helyes_megoldas);
    }//GEN-LAST:event_mutasd_a_pontot_gombActionPerformed
   public boolean megnyomva = false;
        
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Korok().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bekuldes_gomb;
    private javax.swing.JTextPane db_kiir;
    private javax.swing.JMenuItem elerhetoseg_menu;
    private javax.swing.JMenu fajl_menu;
    private javax.swing.JTextPane feladat_db;
    private javax.swing.JLabel feladatkep;
    private javax.swing.JMenuBar felso_valaszto_menu;
    private javax.swing.JTextPane informacios_szoveg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextPane jTextPane1_szoveg;
    private javax.swing.JTextPane jTextPane1_szoveg1;
    private javax.swing.JTextPane jTextPane2_megoldas;
    private javax.swing.JTextPane jTextPane4_ellenorzes;
    private javax.swing.JButton kilepes_gomb;
    private javax.swing.JMenuItem kilepes_menu;
    private javax.swing.JButton mutasd_a_feladatot_gomb;
    private javax.swing.JButton mutasd_a_pontot_gomb;
    private javax.swing.JMenu segitseg_menu;
    private javax.swing.JLabel szoveg;
    private javax.swing.JLabel szovegmezo;
    private javax.swing.JButton vissza_gomb;
    // End of variables declaration//GEN-END:variables
private void setIcon() 
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/eszkozok/program/ikon.jpg"))); //Itt �ll�tom be az ikont
    }
}
