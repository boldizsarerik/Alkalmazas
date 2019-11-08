import java.awt.Color;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Math.sqrt;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Haromszogek extends javax.swing.JFrame {
    public Haromszogek() {
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setTitle("H�romsz�gek");
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setIcon(); 
        
        elore_gomb.setBackground(new java.awt.Color(240, 240, 241));
        elore_gomb.setText("");
        elore_gomb.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vissza_gomb = new javax.swing.JButton();
        szovegmezo = new javax.swing.JLabel();
        kilepes_gomb = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        valaszto_menu = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1_szoveg = new javax.swing.JTextPane();
        szoveg2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane2_megoldas = new javax.swing.JTextPane();
        segedanyag_gomb = new javax.swing.JButton();
        bekuldes_gomb = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane4_ellenorzes = new javax.swing.JTextPane();
        mutasd_a_feladatot_gomb = new javax.swing.JButton();
        mutasd_a_megoldast_gomb = new javax.swing.JButton();
        feladatkep = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane1_szoveg1 = new javax.swing.JTextPane();
        mutasd_a_pontot_gomb = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        informacios_szoveg = new javax.swing.JTextPane();
        segedanyag_kep = new javax.swing.JLabel();
        elore_gomb = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        segedanyag = new javax.swing.JTextPane();
        felso_valaszto_menu = new javax.swing.JMenuBar();
        kilepes_menu = new javax.swing.JMenu();
        elso_menu = new javax.swing.JMenuItem();
        elerhetoseg_menu = new javax.swing.JMenu();
        masodik_menu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        vissza_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/vissza.png"))); // NOI18N
        vissza_gomb.setText("Vissza a men�be");
        vissza_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vissza_gombActionPerformed(evt);
            }
        });

        szovegmezo.setText("�dv�z�llek a H�romsz�gek kateg�ri�ban! V�lassz egy feladatt�tpust �s oldd meg!");

        kilepes_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/kilepes.png"))); // NOI18N
        kilepes_gomb.setText("Kil�p�s");
        kilepes_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kilepes_gombActionPerformed(evt);
            }
        });

        valaszto_menu.setBackground(new java.awt.Color(153, 255, 204));
        valaszto_menu.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Hegyessz�g� h�romsz�g", "Der�ksz�g� h�romsz�g", "Tompasz�g� h�romsz�g", "�ltal�nos h�romsz�g", "Egyenl� sz�r� h�romsz�g", "Szab�lyos h�romsz�g", "V�letlenszer�" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        valaszto_menu.setSelectionBackground(new java.awt.Color(204, 255, 204));
        valaszto_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                valaszto_menuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(valaszto_menu);

        jTextPane1_szoveg.setEditable(false);
        jScrollPane2.setViewportView(jTextPane1_szoveg);

        szoveg2.setText("A megold�sod ide �rhatod:");

        jTextPane2_megoldas.setBackground(new java.awt.Color(153, 255, 204));
        jScrollPane3.setViewportView(jTextPane2_megoldas);

        segedanyag_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/segitseg.png"))); // NOI18N
        segedanyag_gomb.setText("Seg�danyag k�r�se");
        segedanyag_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segedanyag_gombActionPerformed(evt);
            }
        });

        bekuldes_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/pipa.png"))); // NOI18N
        bekuldes_gomb.setText("BEK�LD�S");
        bekuldes_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bekuldes_gombActionPerformed(evt);
            }
        });

        jTextPane4_ellenorzes.setEditable(false);
        jTextPane4_ellenorzes.setBackground(new java.awt.Color(153, 255, 204));
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
        mutasd_a_megoldast_gomb.setText("Mutasd a  megold�st!");
        mutasd_a_megoldast_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mutasd_a_megoldast_gombActionPerformed(evt);
            }
        });

        feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/sima.JPG"))); // NOI18N
        feladatkep.setText("ITT LESZ A FELADATK�P");

        jTextPane1_szoveg1.setEditable(false);
        jTextPane1_szoveg1.setBackground(new java.awt.Color(153, 255, 204));
        jScrollPane6.setViewportView(jTextPane1_szoveg1);

        mutasd_a_pontot_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/pontok.png"))); // NOI18N
        mutasd_a_pontot_gomb.setText("Mutasd a pontjaimat!");
        mutasd_a_pontot_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mutasd_a_pontot_gombActionPerformed(evt);
            }
        });

        informacios_szoveg.setEditable(false);
        informacios_szoveg.setBackground(new java.awt.Color(153, 255, 204));
        informacios_szoveg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        informacios_szoveg.setText("A megold�s be�r�sakor 2-tizedesjegyre val� kerek�t�st kell alkalmazni!\nA be�rt megold�s elfogadott form�tuma: pl.: 281.17\nMinden j� megold�s ut�n kapsz egy plusz pontot, pontjaid sz�ma a /Mutasd a pontjaimat!/ gomb seg�ts�g�vel tekinthet� meg. Plusz pontot csak az esetben kaphatsz, ha nem n�zted meg el�tte a megold�st.\nV�lassz ki egy feladattipust, �s azt�n nyomd meg a /Mutasd a feladatot/ gombot.");
        jScrollPane7.setViewportView(informacios_szoveg);

        segedanyag_kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/sima2.jpg"))); // NOI18N
        segedanyag_kep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                segedanyag_kepMouseClicked(evt);
            }
        });
        segedanyag_kep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                segedanyag_kepKeyPressed(evt);
            }
        });

        elore_gomb.setText("K�vetkez�");
        elore_gomb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        elore_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elore_gombActionPerformed(evt);
            }
        });

        segedanyag.setEditable(false);
        segedanyag.setBackground(new java.awt.Color(240, 240, 240));
        segedanyag.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        segedanyag.setText("Ha sz�ks�ged van segits�gre, nyomd meg a /Seg�danyag k�r�se/ gombot!\nHa k�s�bb elszeretn�d t�ntetni, akkor kattints r� a k�pre, illetve a sz�vegre!");
        segedanyag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                segedanyagMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(segedanyag);

        kilepes_menu.setText("F�jl");

        elso_menu.setText("Kil�p�s");
        elso_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elso_menuActionPerformed(evt);
            }
        });
        kilepes_menu.add(elso_menu);

        felso_valaszto_menu.add(kilepes_menu);

        elerhetoseg_menu.setText("Seg�ts�g");

        masodik_menu.setText("El�rhet�s�g");
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
                        .addComponent(vissza_gomb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kilepes_gomb))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(szovegmezo, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(feladatkep, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mutasd_a_feladatot_gomb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(mutasd_a_pontot_gomb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(segedanyag_gomb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mutasd_a_megoldast_gomb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(szoveg2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(bekuldes_gomb)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(segedanyag_kep, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(elore_gomb)
                                    .addGap(204, 204, 204)))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(szovegmezo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(segedanyag_gomb)
                                .addGap(4, 4, 4)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mutasd_a_pontot_gomb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mutasd_a_feladatot_gomb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mutasd_a_megoldast_gomb))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(feladatkep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(szoveg2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(bekuldes_gomb)
                                        .addGap(14, 14, 14))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane3))))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(segedanyag_kep, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(elore_gomb)
                        .addGap(18, 18, 18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void elso_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elso_menuActionPerformed
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
    }//GEN-LAST:event_elso_menuActionPerformed

    private void masodik_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masodik_menuActionPerformed
        //Segitseg
        Segitseg Segitseg = new Segitseg();
        Segitseg.setVisible(true);
    }//GEN-LAST:event_masodik_menuActionPerformed

    float megoldas = -1000;
    Random rand = new Random();
    int helyes_megoldas = 0;
    float x = 0; //a-oldal rendszerint
    float y = 0; //b-oldal
    float z = 0; //c-oldal
    float terulet = 0;
    float kerulet = 0;
    float szog1 = 0; //A-sz�g
    float szog2 = 0; //B-sz�g
    float szog3 = 0; //C-sz�g
    float szogek_osszege = 0;
    float magassag = 0; 
    int d_szamlalo = 1; //Hogy �ppen hol j�r, hanyadik tipusu feladat j�n
    int h_szamlalo = 1;
    int e_szamlalo = 1;
    int t_szamlalo = 1;
    int a_szamlalo = 1;
    int sz_szamlalo = 1;
    int sz_veletlenszeru = 1;
    boolean veletlenszeru = false;
    boolean egyenloszaru = false; //Ezekkel azt vizsg�lom, hogy �ppen melyik fajta feladattipusok vannak kiv�lasztva
    boolean tompaszogu = false;
    boolean altalanos = false;
    boolean szabalyos = false;
    boolean derekszogu = false;
    boolean hegyesszogu = false;
    float bekuldott_megoldas = 0;
    boolean valasztott = false; //Van-e feladatfajta kiv�lasztva
    boolean megnezte_a_megoldast = false; 
    
    private void valaszto_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valaszto_menuMouseClicked
        //Feladattipusv�laszt�s
        valasztott = true;
    }//GEN-LAST:event_valaszto_menuMouseClicked

    private void bekuldes_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bekuldes_gombActionPerformed
        //Bek�ld�s 
        try{
        jTextPane4_ellenorzes.setBackground(new java.awt.Color(153, 255, 204)); //Mindig az alapszinre v�ltoztatjuk az ellen�rz�s fel�letet
        bekuldott_megoldas = Float.parseFloat(jTextPane2_megoldas.getText()); //A sztringet float-ra konvert�ljuk
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
            Adatok_megosztasa.haromszog_pontszam = helyes_megoldas;
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
    jTextPane4_ellenorzes.setText("Nem megfelel� form�tum� a be�rt megold�s, vagy m�g nincs kiv�lasztva feladat! Pr�b�lkozz �jra egy sz�mmal!");
}    
    }//GEN-LAST:event_bekuldes_gombActionPerformed

    private void mutasd_a_megoldast_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mutasd_a_megoldast_gombActionPerformed
        //Mutasd a megold�st gomb
        megnezte_a_megoldast = true;
        jTextPane4_ellenorzes.setBackground(new java.awt.Color(153, 255, 204));
        if(megoldas == -1000)
        jTextPane4_ellenorzes.setText("Nincs kiv�lasztva feladat!");
        else
        jTextPane4_ellenorzes.setText("A feladat megold�sa: " + Float.toString(megoldas));
    }//GEN-LAST:event_mutasd_a_megoldast_gombActionPerformed

    private void mutasd_a_feladatot_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mutasd_a_feladatot_gombActionPerformed
        //Mutasd a feladatot gomb
        mutasd_a_feladatot_gomb.setText("K�vetkez� feladat");
        jTextPane4_ellenorzes.setBackground(new java.awt.Color(153, 255, 204));
        jTextPane4_ellenorzes.setText("");
        megnezte_a_megoldast = false;
        jTextPane2_megoldas.setText("");
        
        if(valasztott == false)
        {
            jTextPane4_ellenorzes.setText("Nincs kiv�lasztva feladattipus!");
             mutasd_a_feladatot_gomb.setText("Mutasd a feladatot!");
        }
        if(derekszogu)
        d_szamlalo++;
        
        if(hegyesszogu)
        h_szamlalo++;
        
        if(tompaszogu)
        t_szamlalo++;
        
        if(altalanos)
        a_szamlalo++;
        
        if(szabalyos)
        sz_szamlalo++;
        
        if(egyenloszaru)
        e_szamlalo++;
        
        if(veletlenszeru)
        sz_veletlenszeru = rand.nextInt(30)+1;;
    }//GEN-LAST:event_mutasd_a_feladatot_gombActionPerformed

    private void general() //Ezzel a f�ggv�nnyel olyan 3-sz�mot gener�lunk, melyekb�l lehet h�romsz�get szerkeszteni
                        {
                x = rand.nextInt(100)+1;
                y = rand.nextInt(100)+1;
                z = rand.nextInt(100)+1;                          
                        }
    private void mutasd_a_feladatot_gombMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mutasd_a_feladatot_gombMouseClicked
        //Miut�n kattintunk egyet
        if(valasztott)
        {
        String valami = (String) valaszto_menu.getSelectedValue();
        switch (valami)
        {
            case "Der�ksz�g� h�romsz�g" :
              //  System.out.println(d_szamlalo); Tulsz�mol a sz�ml�l�, �s m�r 7-8n�l tart.Ez�rt kell a k�vetkez� �rt�kad�ssorozat:
                h_szamlalo = 0;
                e_szamlalo = 0;
                t_szamlalo = 0;
                a_szamlalo = 0;
                sz_szamlalo = 0;
                derekszogu = true;
                if(d_szamlalo == 1)
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
                if(d_szamlalo == 2)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/d_2.png")));
                    szog1 = rand.nextInt(45)+1; //Az�rt 45-ig megy, mivel igy j�nnek ki a legjobb sz�gek
                 jTextPane1_szoveg.setText("Der�ksz�g� h�romsz�g:\n Adott egy der�ksz�g� h�romsz�g, melynek ismert az egyik sz�ge: B="+szog1+" � Mennyi lesz a C-sz�ge?"); 
            megoldas = 180-90-szog1;   
                }
                if(d_szamlalo == 3)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/d_3.png")));
                    x = rand.nextInt(100)+1; //A magass�g fele annyira van be�ll�tva, hogy ne j�jjenek ki sz�rre�lis sz�mok
                    magassag = rand.nextInt(50)+1;
                    jTextPane1_szoveg.setText("Der�ksz�g� h�romsz�g:\n Adott egy der�ksz�g� h�romsz�g, melynek ismert az egyik oldala, �s az erre az oldalra illeszked� magass�ga. a="+x+" cm, M'a="+magassag+" cm, ami egyben a b oldal is, mennyi lesz a h�romsz�g ter�lete?"); 
                   terulet = (x*magassag)/2;
                   megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                 if(d_szamlalo == 4)
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
                if(d_szamlalo == 5)
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
                if(d_szamlalo == 6)
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
                    d_szamlalo = 0;
                }
            break;          
            
            case "Egyenl� sz�r� h�romsz�g" : 
                d_szamlalo = 0;
                h_szamlalo = 0;
                t_szamlalo = 0;
                a_szamlalo = 0;
                sz_szamlalo = 0;
                egyenloszaru = true;
                if(e_szamlalo == 1)
                        {
                           feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/e_1.png")));
                           kerulet = rand.nextInt(350+1)+150; //igy 150-t�l gener�l 500ig
                           x = rand.nextInt(100)+1; 
                           jTextPane1_szoveg.setText("Egyenl� sz�r� h�romsz�g:\n Adva van egy egyenl�sz�r� h�romsz�g, melynek ismert a ker�lete: K="+kerulet+" cm, illetve az egyik oldala: a="+x+" cm, mennyi lesz a h�romsz�g m�sik k�t oldal�nak a hossza?");
                           y = (kerulet - x)/2;
                           megoldas = y;
                        }
                if(e_szamlalo == 2)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/e_2.png")));
                    szog2 = rand.nextInt(89)+1; 
                    jTextPane1_szoveg.setText("Egyenl� sz�r� h�romsz�g:\n Adott egy egyenl�sz�r� h�romsz�g, amelynek ismert egy sz�ge: B="+szog2+"�, mennyi lesz a m�sik k�t sz�ge?");
                    szog1 = (180-szog2)/2;
                    megoldas = szog1;
                }
                if(e_szamlalo == 3)
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
                if(e_szamlalo == 4)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/e_4.png")));
                 y = rand.nextInt(100)+1; //A magass�g fele annyira van be�ll�tva, hogy ne j�jjenek ki sz�rre�lis sz�mok
                    magassag = rand.nextInt(50)+1;
                    jTextPane1_szoveg.setText("Egyenl� sz�r� h�romsz�g:\n Adott egy egyenl�sz�r� h�romsz�g, melynek ismert az egyik oldala, �s az erre az oldalra illeszked� magass�ga. b="+y+" cm, M'b="+magassag+" cm, mennyi lesz a h�romsz�g ter�lete?"); 
                   terulet = (y*magassag)/2;
                   megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                if(e_szamlalo == 5)
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
                    magassag = (2*terulet)/z;
                    megoldas = (float) Adatok_megosztasa.kerekit(magassag,2);
                }
                if(e_szamlalo == 6)
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
                magassag = (float) Adatok_megosztasa.kerekit(((2*terulet)/y),2);
                    jTextPane1_szoveg.setText("Egyenl� sz�r� h�romsz�g:\n Adott egy egyenl�sz�r� h�romsz�g, melynek ismert a ter�lete: T="+terulet+" cm^2, illetve 2 oldala: a="+x+" cm, c="+z+" cm, valamint egy magass�ga: M'b="+magassag+" cm, mennyi lesz a h�romsz�g ker�lete?");   
                    megoldas = x+z+y;
                }
                if(e_szamlalo == 7)
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
                    e_szamlalo = 0;
                }
            break; 
            
            case "Hegyessz�g� h�romsz�g" : 
                d_szamlalo = 0;
                e_szamlalo = 0;
                t_szamlalo = 0;
                a_szamlalo = 0;
                sz_szamlalo = 0;
                hegyesszogu = true;
                if(h_szamlalo == 1)
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
                if(h_szamlalo == 2)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/h_2.png")));
                    x = rand.nextInt(100)+1; //A magass�g fele annyira van be�ll�tva, hogy ne j�jjenek ki sz�rre�lis sz�mok
                    magassag = rand.nextInt(50)+1;
                    jTextPane1_szoveg.setText("Hegyessz�g� h�romsz�g:\n Adott egy hegyessz�g� h�romsz�g, melynek ismert az egyik oldala, �s az erre az oldalra illeszked� magass�ga. a="+x+" cm, M'a="+magassag+" cm, mennyi lesz a h�romsz�g ter�lete?"); 
                   terulet = (x*magassag)/2;
                   megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                 if(h_szamlalo == 3)
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
                    magassag = (2*terulet)/x;
                    megoldas = (float) Adatok_megosztasa.kerekit(magassag,2);
                }
                if(h_szamlalo == 4)
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
                magassag = (2*terulet)/z;
                magassag = (float) Adatok_megosztasa.kerekit(magassag,2);
                    jTextPane1_szoveg.setText("Hegyessz�g� h�romsz�g:\n Adott egy hegyessz�g� h�romsz�g, melynek ismert a ter�lete: T="+terulet+" cm^2, illetve 2 oldala: a="+x+" cm, b="+y+" cm, valamint egy magass�ga: M'c="+magassag+" cm, mennyi lesz a h�romsz�g ker�lete?");   
                    megoldas = x+z+y;
                    h_szamlalo = 0;
                }
            break;
            
            case "Tompasz�g� h�romsz�g" : 
                tompaszogu = true;
                d_szamlalo = 0;
                e_szamlalo = 0;
                h_szamlalo = 0;
                a_szamlalo = 0;
                sz_szamlalo = 0;
                if(t_szamlalo == 1)
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
                if(t_szamlalo == 2)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/t_2.png")));
                    x = rand.nextInt(100)+1; //A magass�g fele annyira van be�ll�tva, hogy ne j�jjenek ki sz�rre�lis sz�mok
                    magassag = rand.nextInt(50)+1;
                    jTextPane1_szoveg.setText("Tompasz�g� h�romsz�g:\n Adott egy tompasz�g� h�romsz�g, melynek ismert az egyik oldala, �s az erre az oldalra illeszked� magass�ga. c="+x+" cm, M'c="+magassag+" cm, mennyi lesz a h�romsz�g ter�lete?"); 
                   terulet = (x*magassag)/2;
                   megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                 if(t_szamlalo == 3)
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
                if(t_szamlalo == 4)
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
                    t_szamlalo = 0;
                }
            break;
            
            case "�ltal�nos h�romsz�g" :
                altalanos = true;
                d_szamlalo = 0;
                e_szamlalo = 0;
                h_szamlalo = 0;
                t_szamlalo = 0;
                sz_szamlalo = 0;
                if(a_szamlalo == 1)
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
                if(a_szamlalo == 2)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/a_2.png")));
                    x = rand.nextInt(100)+1; //A magass�g fele annyira van be�ll�tva, hogy ne j�jjenek ki sz�rre�lis sz�mok
                    magassag = rand.nextInt(50)+1;
                    jTextPane1_szoveg.setText("�ltal�nos h�romsz�g:\n Adott egy h�romsz�g, melynek ismert az egyik oldala, �s az erre az oldalra illeszked� magass�ga. b="+x+" cm, M'b="+magassag+" cm, mennyi lesz a h�romsz�g ter�lete?"); 
                   terulet = (x*magassag)/2;
                   megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                 if(a_szamlalo == 3)
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
                if(a_szamlalo == 4)
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
                magassag = (float) Adatok_megosztasa.kerekit((((2*terulet)/z)),2);
                    jTextPane1_szoveg.setText("�ltal�nos h�romsz�g:\n Adott egy h�romsz�g, melynek ismert a ter�lete: T="+terulet+" cm^2, illetve 2 oldala: a="+x+" cm, c="+z+" cm, valamint egy magass�ga: M'b="+magassag+" cm, mennyi lesz a h�romsz�g ker�lete?");   
                    megoldas = x+z+y;
                    a_szamlalo = 0;
                }
            break;
            
            case "Szab�lyos h�romsz�g" :
                szabalyos = true;
                d_szamlalo = 0;
                e_szamlalo = 0;
                h_szamlalo = 0;
                a_szamlalo = 0;
                t_szamlalo = 0;
                if(sz_szamlalo == 1)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/sz_1.png")));
                 x = rand.nextInt(250)+1;
                jTextPane1_szoveg.setText("Szab�lyos h�romsz�g:\n Adott egy szab�lyos h�romsz�g,melynek egy oldala ismert: a="+x+"cm, mennyi lesz a h�romsz�g ter�lete?");
                terulet = (float) ((x * x * 1.73)/4);
                megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                if(sz_szamlalo == 2)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/sz_2.png")));
                    magassag = rand.nextInt(50)+1;
                    jTextPane1_szoveg.setText("Szab�lyos h�romsz�g:\n Adott egy szab�lyos h�romsz�g, melynek ismert az egyik magass�ga, M'c="+magassag+" cm, mennyi lesz a h�romsz�g ter�lete?"); 
                    x = (float) (magassag/(1.72/2));
                    terulet = (float) ((1.72/4) * x*x);
                   megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                 if(sz_szamlalo == 3)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/sz_3.png")));
                    z = rand.nextInt(250)+1;
                    jTextPane1_szoveg.setText("Szab�lyos h�romsz�g:\n Adott egy szab�lyos h�romsz�g, melynek ismert egy oldala, c="+z+" cm, mennyi lesz M'b �rt�ke?");
                    magassag = (float) ((1.72/2) * z);
                    megoldas = (float)Adatok_megosztasa.kerekit(magassag,2);
                }
                if(sz_szamlalo == 4)
                {      
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/sz_4.png")));
                    magassag = rand.nextInt(50)+1;
                    x = x = (float) (magassag/(1.72/2));
                    kerulet = 3*x;
                    jTextPane1_szoveg.setText("Szab�lyos h�romsz�g:\n Adott egy szab�lyos h�romsz�g, melynek ismert egy magass�ga: M'a="+magassag+" cm, mennyi lesz a h�romsz�g ker�lete?");   
                    megoldas = (float) Adatok_megosztasa.kerekit(kerulet,2);
                }
                if(sz_szamlalo == 5)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/sz_5.png")));
                    jTextPane1_szoveg.setText("Szab�lyos h�romsz�g:\n Adott egy szab�lyos h�romsz�g, h�ny fok lesz a 3 sz�ge(A,B,C) k�l�n-k�l�n?");   
                    megoldas = 60;
                    sz_szamlalo = 0;
                }
            break;       
            
            case "V�letlenszer�" :
                veletlenszeru = true;
                h_szamlalo = 0;
                e_szamlalo = 0;
                t_szamlalo = 0;
                a_szamlalo = 0;
                sz_szamlalo = 0;
                d_szamlalo = 0;
                
                if(sz_veletlenszeru == 1)
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
                if(sz_veletlenszeru == 2)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/d_2.png")));
                    szog1 = rand.nextInt(45)+1; //Az�rt 45-ig megy, mivel igy j�nnek ki a legjobb sz�gek
                 jTextPane1_szoveg.setText("Der�ksz�g� h�romsz�g:\n Adott egy der�ksz�g� h�romsz�g, melynek ismert az egyik sz�ge: B="+szog1+" � Mennyi lesz a C-sz�ge?"); 
            megoldas = 180-90-szog1;   
                }
                if(sz_veletlenszeru == 3)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/d_3.png")));
                    x = rand.nextInt(100)+1; //A magass�g fele annyira van be�ll�tva, hogy ne j�jjenek ki sz�rre�lis sz�mok
                    magassag = rand.nextInt(50)+1;
                    jTextPane1_szoveg.setText("Der�ksz�g� h�romsz�g:\n Adott egy der�ksz�g� h�romsz�g, melynek ismert az egyik oldala, �s az erre az oldalra illeszked� magass�ga. a="+x+" cm, M'a="+magassag+" cm, ami egyben a b oldal is, mennyi lesz a h�romsz�g ter�lete?"); 
                   terulet = (x*magassag)/2;
                   megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                 if(sz_veletlenszeru == 4)
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
                if(sz_veletlenszeru == 5)
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
                if(sz_veletlenszeru == 6)
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
                if(sz_veletlenszeru == 7)
                        {
                            feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/e_1.png")));
                           kerulet = rand.nextInt(350+1)+150; //igy 150-t�l gener�l 500ig
                           x = rand.nextInt(100)+1; 
                           jTextPane1_szoveg.setText("Egyenl� sz�r� h�romsz�g:\n Adva van egy egyenl�sz�r� h�romsz�g, melynek ismert a ker�lete: K="+kerulet+" cm, illetve az egyik oldala: a="+x+" cm, mennyi lesz a h�romsz�g m�sik k�t oldal�nak a hossza?");
                           y = (kerulet - x)/2;
                           megoldas = y;
                        }
                if(sz_veletlenszeru == 8)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/e_2.png")));
                    szog2 = rand.nextInt(89)+1; 
                    jTextPane1_szoveg.setText("Egyenl� sz�r� h�romsz�g:\n Adott egy egyenl�sz�r� h�romsz�g, amelynek ismert egy sz�ge: B="+szog2+"�, mennyi lesz a m�sik k�t sz�ge?");
                    szog1 = (180-szog2)/2;
                    megoldas = szog1;
                }
                if(sz_veletlenszeru == 9)
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
                if(sz_veletlenszeru == 10)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/e_4.png")));
                 y = rand.nextInt(100)+1; //A magass�g fele annyira van be�ll�tva, hogy ne j�jjenek ki sz�rre�lis sz�mok
                    magassag = rand.nextInt(50)+1;
                    jTextPane1_szoveg.setText("Egyenl� sz�r� h�romsz�g:\n Adott egy egyenl�sz�r� h�romsz�g, melynek ismert az egyik oldala, �s az erre az oldalra illeszked� magass�ga. b="+y+" cm, M'b="+magassag+" cm, mennyi lesz a h�romsz�g ter�lete?"); 
                   terulet = (y*magassag)/2;
                   megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                if(sz_veletlenszeru == 11)
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
                if(sz_veletlenszeru == 12)
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
                if(sz_veletlenszeru == 13)
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
                if(sz_veletlenszeru == 14)
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
                if(sz_veletlenszeru == 15)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/h_2.png")));
                    x = rand.nextInt(100)+1; //A magass�g fele annyira van be�ll�tva, hogy ne j�jjenek ki sz�rre�lis sz�mok
                    magassag = rand.nextInt(50)+1;
                    jTextPane1_szoveg.setText("Hegyessz�g� h�romsz�g:\n Adott egy hegyessz�g� h�romsz�g, melynek ismert az egyik oldala, �s az erre az oldalra illeszked� magass�ga. a="+x+" cm, M'a="+magassag+" cm, mennyi lesz a h�romsz�g ter�lete?"); 
                   terulet = (x*magassag)/2;
                   megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                 if(sz_veletlenszeru == 16)
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
                if(sz_veletlenszeru == 17)
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
                if(sz_veletlenszeru == 18)
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
                if(sz_veletlenszeru == 19)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/t_2.png")));
                    x = rand.nextInt(100)+1; //A magass�g fele annyira van be�ll�tva, hogy ne j�jjenek ki sz�rre�lis sz�mok
                    magassag = rand.nextInt(50)+1;
                    jTextPane1_szoveg.setText("Tompasz�g� h�romsz�g:\n Adott egy tompasz�g� h�romsz�g, melynek ismert az egyik oldala, �s az erre az oldalra illeszked� magass�ga. c="+x+" cm, M'c="+magassag+" cm, mennyi lesz a h�romsz�g ter�lete?"); 
                   terulet = (x*magassag)/2;
                   megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                 if(sz_veletlenszeru == 20)
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
                if(sz_veletlenszeru == 21)
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
                if(sz_veletlenszeru == 22)
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
                if(sz_veletlenszeru == 23)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/a_2.png")));
                    x = rand.nextInt(100)+1; //A magass�g fele annyira van be�ll�tva, hogy ne j�jjenek ki sz�rre�lis sz�mok
                    magassag = rand.nextInt(50)+1;
                    jTextPane1_szoveg.setText("�ltal�nos h�romsz�g:\n Adott egy h�romsz�g, melynek ismert az egyik oldala, �s az erre az oldalra illeszked� magass�ga. b="+x+" cm, M'b="+magassag+" cm, mennyi lesz a h�romsz�g ter�lete?"); 
                   terulet = (x*magassag)/2;
                   megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                 if(sz_veletlenszeru == 24)
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
                if(sz_veletlenszeru == 25)
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
                if(sz_veletlenszeru == 26)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/sz_1.png")));
                 x = rand.nextInt(250)+1;
                jTextPane1_szoveg.setText("Szab�lyos h�romsz�g:\n Adott egy szab�lyos h�romsz�g,melynek egy oldala ismert: a="+x+"cm, mennyi lesz a h�romsz�g ter�lete?");
                terulet = (float) ((x * x * 1.73)/4);
                megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                if(sz_veletlenszeru == 27)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/sz_2.png")));
                    magassag = rand.nextInt(50)+1;
                    jTextPane1_szoveg.setText("Szab�lyos h�romsz�g:\n Adott egy szab�lyos h�romsz�g, melynek ismert az egyik magass�ga, M'c="+magassag+" cm, mennyi lesz a h�romsz�g ter�lete?"); 
                    x = (float) (magassag/(1.72/2));
                    terulet = (float) ((1.72/4) * x*x);
                   megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                 if(sz_veletlenszeru == 28)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/sz_3.png")));
                    z = rand.nextInt(250)+1;
                    jTextPane1_szoveg.setText("Szab�lyos h�romsz�g:\n Adott egy szab�lyos h�romsz�g, melynek ismert egy oldala, c="+z+" cm, mennyi lesz M'b �rt�ke?");
                    magassag = (float) ((1.72/2) * z);
                    megoldas = (float) Adatok_megosztasa.kerekit(magassag,2);
                }
                if(sz_veletlenszeru == 29)
                {      
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/sz_4.png")));
                    magassag = rand.nextInt(50)+1;
                    x = x = (float) (magassag/(1.72/2));
                    kerulet = 3*x;
                    jTextPane1_szoveg.setText("Szab�lyos h�romsz�g:\n Adott egy szab�lyos h�romsz�g, melynek ismert egy magass�ga: M'a="+magassag+" cm, mennyi lesz a h�romsz�g ker�lete?");   
                    megoldas = (float) Adatok_megosztasa.kerekit(kerulet,2);
                }
                if(sz_veletlenszeru == 30)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/sz_5.png")));
                    jTextPane1_szoveg.setText("Szab�lyos h�romsz�g:\n Adott egy szab�lyos h�romsz�g, h�ny fok lesz a 3 sz�ge(A,B,C) k�l�n-k�l�n?");   
                    megoldas = 60;
                }
                break;
            
            default: System.out.println("Hiba!");
        }  
    }//GEN-LAST:event_mutasd_a_feladatot_gombMouseClicked
    }
   
    private void mutasd_a_pontot_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mutasd_a_pontot_gombActionPerformed
        //mutasd a pontjaimat
        jTextPane1_szoveg1.setText("Az eddigi pontjaid sz�ma: "+helyes_megoldas);
    }//GEN-LAST:event_mutasd_a_pontot_gombActionPerformed

    private void segedanyag_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segedanyag_gombActionPerformed
        //Seg�danyag k�r�se
        megnezte_a_megoldast = true;
        
          String negyszogek ="";
try {
    BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Boldizs�r Erik\\Documents\\NetBeansProjects\\Alkalmazas\\src\\eszkozok\\haromszogek\\haromszogek.txt"));
    // Az �kezeteket az ISO-8859-2-vel lehet megnyitni!
    StringBuilder sb = new StringBuilder();
    String line = br.readLine();
    while (line != null)
    {
        sb.append(line);
        sb.append(System.lineSeparator());
        line = br.readLine();
    }
    negyszogek = sb.toString();
    }
        catch(IOException ex)
            {
           System.out.println("Nincs meg a f�jl!");
           }  
    segedanyag.setText(negyszogek);  
    
    //Most j�n a k�pbeilleszt�s:
    segedanyag_kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/hegyesszogu.jpg")));
    
    elore_gomb.setText("K�vetkez�");
    elore_gomb.setBackground(new java.awt.Color(240, 240, 240));
    elore_gomb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_segedanyag_gombActionPerformed

    int segedanyag_sz = 1;
    
    private void segedanyag_kepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segedanyag_kepMouseClicked
        // ha r�kattintunk a seg�danyagos k�pre,akkor az elt�nik
        segedanyag_sz = 0;
        segedanyag_kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/sima2.jpg")));
        elore_gomb.setBackground(new java.awt.Color(240, 240, 241));
        elore_gomb.setText("");
        elore_gomb.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    }//GEN-LAST:event_segedanyag_kepMouseClicked

    private void segedanyag_kepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_segedanyag_kepKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_segedanyag_kepKeyPressed

    private void elore_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elore_gombActionPerformed
        //K�vetkez� gomb:
        segedanyag_sz++;
        if(segedanyag_sz == 1)
        {
            segedanyag_kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/hegyesszogu.jpg")));
        }
        if(segedanyag_sz == 2)
        {
            segedanyag_kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/derekszogu.jpg")));
        }
        if(segedanyag_sz == 3)
        {
            segedanyag_kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/tompaszogu.jpg")));
        }
        if(segedanyag_sz == 4)
        {
            segedanyag_kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/egyenloszaru.jpg")));
        }
        if(segedanyag_sz == 5)
        {
            segedanyag_kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/szabalyos.jpg")));
        }
        if(segedanyag_sz == 6)
        {
            segedanyag_kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/haromszogek/altalanos.jpg")));
            segedanyag_sz = 0;
        }
    }//GEN-LAST:event_elore_gombActionPerformed

    private void segedanyagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segedanyagMouseClicked
        // ha r�kattintunk a seg�danyagos sz�vegre,akkor az is elt�nik
        String negyszogek ="";
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Boldizs�r Erik\\Documents\\NetBeansProjects\\Alkalmazas\\src\\eszkozok\\haromszogek\\haromszogek2.txt"));
            // Az �kezeteket az ISO-8859-2-vel lehet megnyitni!
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null)
            {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            negyszogek = sb.toString();
        }
        catch(IOException ex)
        {
            System.out.println("Nincs meg a f�jl!");
        }
        segedanyag.setText(negyszogek);
    }//GEN-LAST:event_segedanyagMouseClicked
        
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Haromszogek().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bekuldes_gomb;
    private javax.swing.JMenu elerhetoseg_menu;
    private javax.swing.JButton elore_gomb;
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
    private javax.swing.JScrollPane jScrollPane7;
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
    private javax.swing.JList<String> valaszto_menu;
    private javax.swing.JButton vissza_gomb;
    // End of variables declaration//GEN-END:variables
private void setIcon() 
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/eszkozok/program/ikon.jpg"))); //Itt �ll�tom be az ikont
    }
}
