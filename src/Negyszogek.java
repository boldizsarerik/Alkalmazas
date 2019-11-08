import java.awt.Color;
import java.awt.Desktop;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Negyszogek extends javax.swing.JFrame {
    public Negyszogek() {
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setTitle("N�gysz�gek");
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setIconImage(Toolkit.getDefaultToolkit().getImage("/eszkozok/program/ikon.jpg"));
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
        jScrollPane4 = new javax.swing.JScrollPane();
        segedanyag = new javax.swing.JTextPane();
        bekuldes_gomb = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane4_ellenorzes = new javax.swing.JTextPane();
        mutasd_a_feladatot_gomb = new javax.swing.JButton();
        mutasd_a_megoldast_gomb = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane1_szoveg1 = new javax.swing.JTextPane();
        mutasd_a_pontot_gomb = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        informacios_szoveg = new javax.swing.JTextPane();
        feladatkep = new javax.swing.JLabel();
        segedanyag_kep = new javax.swing.JLabel();
        elore_gomb = new javax.swing.JButton();
        felso_valaszto_menu = new javax.swing.JMenuBar();
        kilepes_menu = new javax.swing.JMenu();
        elso_menu = new javax.swing.JMenuItem();
        elerhetoseg_menu = new javax.swing.JMenu();
        masodik_menu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        vissza_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/vissza.png"))); // NOI18N
        vissza_gomb.setText("Vissza a men�be");
        vissza_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vissza_gombActionPerformed(evt);
            }
        });

        szovegmezo.setText("�dv�z�llek a N�gysz�gek kateg�ri�ban! V�lassz egy feladatt�tpust �s oldd meg!");

        kilepes_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/kilepes.png"))); // NOI18N
        kilepes_gomb.setText("Kil�p�s");
        kilepes_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kilepes_gombActionPerformed(evt);
            }
        });

        valaszto_menu.setBackground(new java.awt.Color(153, 255, 102));
        valaszto_menu.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "N�gyzet", "T�glalap", "Rombusz", "Deltoid", "Trap�z", "Paralelogramma", "V�letlenszer�" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        valaszto_menu.setSelectionBackground(new java.awt.Color(153, 255, 153));
        valaszto_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                valaszto_menuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(valaszto_menu);

        jTextPane1_szoveg.setEditable(false);
        jScrollPane2.setViewportView(jTextPane1_szoveg);

        szoveg2.setText("A megold�sod ide �rhatod:");

        jTextPane2_megoldas.setBackground(new java.awt.Color(153, 255, 102));
        jScrollPane3.setViewportView(jTextPane2_megoldas);

        segedanyag_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/segitseg.png"))); // NOI18N
        segedanyag_gomb.setText("Seg�danyag k�r�se");
        segedanyag_gomb.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                segedanyag_gombComponentAdded(evt);
            }
        });
        segedanyag_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segedanyag_gombActionPerformed(evt);
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

        bekuldes_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/pipa.png"))); // NOI18N
        bekuldes_gomb.setText("BEK�LD�S");
        bekuldes_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bekuldes_gombActionPerformed(evt);
            }
        });

        jTextPane4_ellenorzes.setEditable(false);
        jTextPane4_ellenorzes.setBackground(new java.awt.Color(153, 255, 102));
        jScrollPane5.setViewportView(jTextPane4_ellenorzes);

        mutasd_a_feladatot_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/kovetkezo.png"))); // NOI18N
        mutasd_a_feladatot_gomb.setText("Mutasd a feladatot!");
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

        jTextPane1_szoveg1.setEditable(false);
        jTextPane1_szoveg1.setBackground(new java.awt.Color(153, 255, 102));
        jScrollPane6.setViewportView(jTextPane1_szoveg1);

        mutasd_a_pontot_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/pontok.png"))); // NOI18N
        mutasd_a_pontot_gomb.setText("Mutasd a pontjaimat!");
        mutasd_a_pontot_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mutasd_a_pontot_gombActionPerformed(evt);
            }
        });

        informacios_szoveg.setEditable(false);
        informacios_szoveg.setBackground(new java.awt.Color(153, 255, 102));
        informacios_szoveg.setText("A megold�s be�r�sakor 2-tizedesjegyre val� kerek�t�st kell alkalmazni!\nA be�rt megold�s elfogadott form�tuma: pl.: 281.17\nMinden j� megold�s ut�n kapsz egy plusz pontot, pontjaid sz�ma a /Mutasd a pontjaimat!/ gomb seg�ts�g�vel tekinthet� meg. Plusz pontot csak az esetben kaphatsz, ha nem n�zted meg el�tte a megold�st.\nV�lassz ki egy feladattipust, �s azt�n nyomd meg a /Mutasd a feladatot/ gombot.");
        jScrollPane7.setViewportView(informacios_szoveg);

        feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/sima.JPG"))); // NOI18N

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
                        .addComponent(szovegmezo, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(vissza_gomb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kilepes_gomb))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(2, 2, 2)
                                                .addComponent(bekuldes_gomb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(szoveg2)
                                                    .addComponent(feladatkep, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 5, Short.MAX_VALUE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(mutasd_a_megoldast_gomb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(mutasd_a_feladatot_gomb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(mutasd_a_pontot_gomb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(segedanyag_gomb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jScrollPane6)
                                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 5, Short.MAX_VALUE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(segedanyag_kep, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(elore_gomb)
                                        .addGap(196, 196, 196)))))
                        .addGap(12, 12, 12))))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(segedanyag_kep, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(segedanyag_gomb)
                                        .addGap(5, 5, 5)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mutasd_a_pontot_gomb)
                                        .addGap(1, 1, 1)
                                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mutasd_a_feladatot_gomb)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mutasd_a_megoldast_gomb))
                                    .addComponent(feladatkep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(szoveg2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addComponent(bekuldes_gomb)
                                    .addGap(15, 15, 15))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elore_gomb))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vissza_gomb)
                    .addComponent(kilepes_gomb))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vissza_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vissza_gombActionPerformed
        //Vissza a menz�be gomb
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

    int helyes_megoldas = 0;
    float megoldas = -1000;
    Random rand = new Random();
    float terulet = 0;
    float kerulet = 0;
    float a = 0;
    float b = 0;
    float c = 0;
    float d = 0;
    float e = 0;
    float f = 0;
    int sz_negyzet = 1;
    int sz_teglalap = 1;
    int sz_rombusz = 1;
    int sz_deltoid = 1;
    int sz_trapez = 1;
    int sz_para_a = 1;
    int sz_veletlenszeru = 1;
    boolean veletlenszeru = false;
    boolean negyzet = false;
    boolean teglalap = false;
    boolean rombusz = false;
    boolean deltoid = false;
    boolean trapez = false;
    boolean para_a = false;
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
        jTextPane4_ellenorzes.setBackground(new java.awt.Color(153,255,102)); //Mindig az alapszinre v�ltoztatjuk az ellen�rz�s fel�letet
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
            Adatok_megosztasa.negyszog_pontszam = helyes_megoldas;
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
        jTextPane4_ellenorzes.setBackground(new java.awt.Color(153,255,102));
        if(megoldas == -1000)
        jTextPane4_ellenorzes.setText("Nincs kiv�lasztva feladat!");
        else
        jTextPane4_ellenorzes.setText("A feladat megold�sa: " + Float.toString(megoldas));
    }//GEN-LAST:event_mutasd_a_megoldast_gombActionPerformed

    private void mutasd_a_pontot_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mutasd_a_pontot_gombActionPerformed
        //mutasd a pontjaimat
        jTextPane1_szoveg1.setText("Az eddigi pontjaid sz�ma: "+helyes_megoldas);
    }//GEN-LAST:event_mutasd_a_pontot_gombActionPerformed

    private void mutasd_a_feladatot_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mutasd_a_feladatot_gombActionPerformed
        //Mutasd a feladatot gomb
        mutasd_a_feladatot_gomb.setText("K�vetkez� feladat");
        jTextPane4_ellenorzes.setBackground(new java.awt.Color(153,255,102));
        jTextPane4_ellenorzes.setText("");
        megnezte_a_megoldast = false;
        jTextPane2_megoldas.setText("");
        
        if(valasztott == false)
        {
            jTextPane4_ellenorzes.setText("Nincs kiv�lasztva feladattipus!");
             mutasd_a_feladatot_gomb.setText("Mutasd a feladatot!");
        }
        if(negyzet)
        sz_negyzet++;
        
        if(teglalap)
        sz_teglalap++;
        
        if(rombusz)
        sz_rombusz++;
        
        if(deltoid)
        sz_deltoid++;
        
        if(trapez)
        sz_trapez++;
        
        if(para_a)
        sz_para_a++;
        
        if(veletlenszeru)
        sz_veletlenszeru = rand.nextInt(24)+1;;   
    }//GEN-LAST:event_mutasd_a_feladatot_gombActionPerformed

    private void mutasd_a_feladatot_gombMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mutasd_a_feladatot_gombMouseClicked
        //Miut�n kattintunk egyet
        if(valasztott)
        {
        String valami = (String) valaszto_menu.getSelectedValue();
        switch (valami)
        {
            case "N�gyzet" :
                sz_teglalap = 0;
                sz_rombusz = 0;
                sz_deltoid = 0;
                sz_trapez = 0;
                sz_para_a = 0;
                negyzet = true;
                if(sz_negyzet == 1)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/n_1.jpg")));
                    a = rand.nextInt(100)+1;
                    jTextPane1_szoveg.setText("N�gyzet:\nAdva van egy n�gyzet, melynek ismert az oldala, a="+a+"cm, mennyi lesz a n�gyzet ter�lete?");
                terulet = a * a;
                megoldas = terulet;
                }
                if(sz_negyzet == 2)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/n_2.jpg")));
                    c = rand.nextInt(100)+1;
                    jTextPane1_szoveg.setText("N�gyzet:\nAdva van egy n�gyzet, melynek ismert az oldala, c="+c+"cm, mennyi lesz a n�gyzet ker�let�nek �s ter�let�nek az �sszege?");
                terulet = c * c;
                kerulet = 4 * c;
                megoldas = terulet + kerulet;
                }
                if(sz_negyzet == 3)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/n_3.jpg")));
                c = rand.nextInt(100)+1;
                terulet = c * c;
                kerulet = 4 * c;
                    jTextPane1_szoveg.setText("N�gyzet:\nAdva van egy n�gyzet, melynek ismert a ter�lete:"+terulet+"cm^2, mennyi lesz a n�gyzet ker�lete?");
                megoldas = kerulet;
                }
                if(sz_negyzet == 4)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/n_4.jpg")));
                c = rand.nextInt(100)+1;
                terulet = c * c;
                kerulet = 4 * c;
                    jTextPane1_szoveg.setText("N�gyzet:\nAdva van egy n�gyzet, melynek ismert a ker�lete:"+kerulet+"cm, mennyi lesz a n�gyzet ter�lete?");
                megoldas = terulet;
                }
                if(sz_negyzet == 5)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/n_5.jpg")));
                c = rand.nextInt(100)+1;
                terulet = c * c;
                    jTextPane1_szoveg.setText("N�gyzet:\nAdva van egy n�gyzet, melynek ismert a ter�lete:"+terulet+"cm, mennyi lesz a n�gyzet oldala?");
                megoldas = c;
                sz_negyzet = 0;
                }
            break;
            case "T�glalap" :
                sz_negyzet = 0;
                sz_rombusz = 0;
                sz_deltoid = 0;
                sz_trapez = 0;
                sz_para_a = 0;
                teglalap = true;
                if(sz_teglalap == 1)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/t_1_.jpg")));
                    a = rand.nextInt(100)+1;
                    b = rand.nextInt(100)+1;
                    jTextPane1_szoveg.setText("T�glalap:\nAdva van egy t�glalap, melynek ismert k�t oldala, a="+a+"cm, b="+b+"cm, mennyi lesz a t�glalap ter�lete?");
                terulet = a * b;
                megoldas = terulet;
                }
                if(sz_teglalap == 2)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/t_2_.jpg")));
                    a = rand.nextInt(100)+1;
                    b = rand.nextInt(100)+1;
                    jTextPane1_szoveg.setText("T�glalap:\nAdva van egy t�glalap, melynek ismert a k�t oldala, b="+b+"cm,a="+a+"cm, mennyi lesz a t�glalap ker�let�nek �s ter�let�nek az �sszege?");
                terulet = a * b;
                kerulet = 2*a + 2*b;
                megoldas = terulet + kerulet;
                }
                if(sz_teglalap == 3)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/t_3_.jpg")));
                a = rand.nextInt(100)+1;
                b = rand.nextInt(100)+1;
                terulet = a * b;
                kerulet = 2*a + 2*b;
                    jTextPane1_szoveg.setText("T�glalap:\nAdva van egy t�glalap, melynek ismert a ter�lete:"+terulet+"cm^2, illetve egyik oldala,a="+a+"cm, mennyi lesz a t�glalap ker�lete?");
                megoldas = kerulet;
                }
                if(sz_teglalap == 4)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/t_4_.jpg")));
                a = rand.nextInt(100)+1;
                b = rand.nextInt(100)+1;
                terulet = a * b;
                kerulet = 2*a+2*b;
                    jTextPane1_szoveg.setText("T�glalap:\nAdva van egy t�glalap, melynek ismert a ker�lete:"+kerulet+"cm, �s az egyik oldala,b="+b+"cm, mennyi lesz a t�glalap ter�lete?");
                megoldas = terulet;
                }
                if(sz_teglalap == 5)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/t_5_.jpg")));
                b = rand.nextInt(100)+1;
                a = rand.nextInt(100)+1;
                kerulet = 2*a+2*b;
                    jTextPane1_szoveg.setText("T�glalap:\nAdva van egy t�glalap, melynek ismert a ker�lete:"+kerulet+"cm, illetve az egyik oldala: b="+b+"cm, mennyi lesz a t�glalap m�sik oldala,a-?");
                megoldas = a;
                sz_teglalap = 0;
                }
            break;
            case "Rombusz" :
                sz_negyzet = 0;
                sz_teglalap = 0;
                sz_deltoid = 0;
                sz_trapez = 0;
                sz_para_a = 0;
                rombusz = true;
                if(sz_rombusz == 1)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/r_1.jpg")));
                    b = rand.nextInt(25)+1;
                    a = rand.nextInt(100)+26;
                    jTextPane1_szoveg.setText("Rombusz:\nAdva van egy rombusz, melynek ismert az oldala, a="+a+"cm, illetve a r� illeszked� magass�g, M'a="+b+"cm, mennyi lesz a rombusz ter�lete?");
                terulet = a * b;
                megoldas = terulet;
                }
                if(sz_rombusz == 2)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/r_2.jpg")));
                    c = rand.nextInt(100)+26;
                    b = rand.nextInt(25)+1;
                    jTextPane1_szoveg.setText("Rombusz:\nAdva van egy rombusz, melynek ismert az oldala, c="+c+"cm, illetve a r� illeszked� magass�ga, M'c="+b+"cm, mennyi lesz a rombusz ker�let�nek �s ter�let�nek az �sszege?");
                terulet = c * b;
                kerulet = 4 * c;
                megoldas = terulet + kerulet;
                }
                if(sz_rombusz == 3)
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
                if(sz_rombusz == 4)
                {
                   feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/r_4.jpg")));
                e = rand.nextInt(100)+1;
                f = rand.nextInt(100)+1;
                terulet = (e * f)/2;
                    jTextPane1_szoveg.setText("Rombusz:\nAdva van egy rombusz, melynek ismert mindk�t �tl�ja: e="+e+"cm, f="+f+"cm, mennyi lesz a rombusz ter�lete?");
                megoldas =  (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                if(sz_rombusz == 5)
                {
                   feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/r_5.jpg")));
                e = rand.nextInt(100)+1;
                terulet = rand.nextInt(400)+101;
                f = (2*terulet)/e;
                    jTextPane1_szoveg.setText("Rombusz:\nAdva van egy rombusz, melynek ismert a ter�lete:"+terulet+"cm, illetve az egyik �tl�ja: e="+e+"cm, mennyi lesz a rombusz m�sik �tl�ja, f-?");
                megoldas = (float) Adatok_megosztasa.kerekit(f,2);
                sz_rombusz = 0;
                }
            break;
            case "Deltoid" :
                sz_negyzet = 0;
                sz_teglalap = 0;
                sz_rombusz = 0;
                sz_trapez = 0;
                sz_para_a = 0;
                deltoid = true;
                if(sz_deltoid == 1)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/d_1.jpg")));
                    b = rand.nextInt(100)+1;
                    a = rand.nextInt(100)+1;
                    jTextPane1_szoveg.setText("Deltoid:\nAdva van egy deltoid, melynek ismert mindk�t oldala, a="+a+"cm, b="+b+"cm, mennyi lesz a deltoid ker�lete?");
               kerulet = 2*a+2*b;
                megoldas = kerulet;
                }
                if(sz_deltoid == 2)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/d_2.jpg")));
                e = rand.nextInt(100)+1;
                f = rand.nextInt(100)+1;
                terulet = (e * f)/2;
                    jTextPane1_szoveg.setText("Deltoid:\nAdva van egy deltoid, melynek ismert mindk�t �tl�ja: e="+e+"cm, f="+f+"cm, mennyi lesz a deltoid ter�lete?");
                megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                  if(sz_deltoid == 3)
                {
                   feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/d_3.jpg")));
                    a = rand.nextInt(100)+1;
                    kerulet = rand.nextInt(400)+101;
                    jTextPane1_szoveg.setText("Deltoid:\nAdva van egy deltoid, melynek ismert egyik oldala, a="+a+"cm, �s a ker�lete, K="+kerulet+"cm, mennyi lesz a deltoid m�sik oldala, b-?");
                    b = (kerulet - 2*a) /2;
                megoldas = (float) Adatok_megosztasa.kerekit(b,2);
                }
                if(sz_deltoid == 4)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/d_4.jpg")));
                f = rand.nextInt(100)+1;
                terulet = rand.nextInt(400)+101;
                e = (2*terulet)/f;
                    jTextPane1_szoveg.setText("Deltoid:\nAdva van egy deltoid, melynek ismert a ter�lete:"+terulet+"cm, illetve az egyik �tl�ja: f="+f+"cm, mennyi lesz a deltoid m�sik �tl�ja, e-?");
                megoldas = (float) Adatok_megosztasa.kerekit(e,2);
                sz_deltoid = 0;
                }
            break;
            case "Trap�z" :
                sz_negyzet = 0;
                sz_teglalap = 0;
                sz_rombusz = 0;
                sz_deltoid = 0;
                sz_para_a = 0;
                trapez = true;
                if(sz_trapez == 1)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/t1.jpg")));
                    b = rand.nextInt(100)+1; //magass�g
                    a = rand.nextInt(100)+1;
                    c = rand.nextInt(100)+1;
                    terulet = ((a+c)*b)/2;
                    jTextPane1_szoveg.setText("Trap�z:\nAdva van egy trap�z, melynek ismert k�t oldala, a="+a+"cm, c="+c+"cm, illetve egyik magass�ga, M'a="+b+"cm, mennyi lesz a trap�z ter�lete?");
                megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                if(sz_trapez == 2)
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
                sz_trapez = 0;
                }
            break;
            case "Paralelogramma" :
                sz_negyzet = 0;
                sz_teglalap = 0;
                sz_rombusz = 0;
                sz_deltoid = 0;
                sz_trapez = 0;
                para_a = true;
                if(sz_para_a == 1)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/p_1.jpg")));
                    b = rand.nextInt(100)+1; //magass�g
                    a = rand.nextInt(100)+1;
                    terulet = a * b;
                    jTextPane1_szoveg.setText("Paralelogramma:\nAdva van egy paralelogramma, melynek ismert az egyik oldala, �s egy magass�ga: a="+a+"cm, �s M'a="+b+"cm, mennyi lesz a paralelogramma ter�lete?");
                megoldas = terulet;
                }
                if(sz_para_a == 2)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/p_2.jpg")));
                    kerulet =rand.nextInt(400)+101; 
                    b = rand.nextInt(100)+1; 
                    a = (kerulet - (2 * b) )/2;
                    a = (float) Adatok_megosztasa.kerekit(a,2);
                    jTextPane1_szoveg.setText("Paralelogramma:\nAdva van egy paralelogramma, melynek ismert a ker�lete, illetve az egyik oldala, K="+kerulet+"cm, b="+b+"cm, mennyi lesz az a-oldal hossza?");
                megoldas = a;
                }
                if(sz_para_a == 3)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/p_3.jpg")));
                    jTextPane1_szoveg.setText("Paralelogramma:\nAdva van egy paralelogramma, mennyi a bels� sz�geinek �sszege?");
                megoldas = 360;
                sz_para_a = 0;
                }
            break;
            case "V�letlenszer�" :
                sz_teglalap = 0;
                sz_rombusz = 0;
                sz_deltoid = 0;
                sz_trapez = 0;
                sz_para_a = 0;
                sz_negyzet = 0;
                veletlenszeru = true;
                if(sz_veletlenszeru == 1)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/n_1.jpg")));
                    a = rand.nextInt(100)+1;
                    jTextPane1_szoveg.setText("N�gyzet:\nAdva van egy n�gyzet, melynek ismert az oldala, a="+a+"cm, mennyi lesz a n�gyzet ter�lete?");
                terulet = a * a;
                megoldas = terulet;
                }
                if(sz_veletlenszeru == 2)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/n_2.jpg")));
                    c = rand.nextInt(100)+1;
                    jTextPane1_szoveg.setText("N�gyzet:\nAdva van egy n�gyzet, melynek ismert az oldala, c="+c+"cm, mennyi lesz a n�gyzet ker�let�nek �s ter�let�nek az �sszege?");
                terulet = c * c;
                kerulet = 4 * c;
                megoldas = terulet + kerulet;
                }
                if(sz_veletlenszeru == 3)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/n_3.jpg")));
                c = rand.nextInt(100)+1;
                terulet = c * c;
                kerulet = 4 * c;
                    jTextPane1_szoveg.setText("N�gyzet:\nAdva van egy n�gyzet, melynek ismert a ter�lete:"+terulet+"cm^2, mennyi lesz a n�gyzet ker�lete?");
                megoldas = kerulet;
                }
                if(sz_veletlenszeru == 4)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/n_4.jpg")));
                c = rand.nextInt(100)+1;
                terulet = c * c;
                kerulet = 4 * c;
                    jTextPane1_szoveg.setText("N�gyzet:\nAdva van egy n�gyzet, melynek ismert a ker�lete:"+kerulet+"cm, mennyi lesz a n�gyzet ter�lete?");
                megoldas = terulet;
                }
                if(sz_veletlenszeru == 5)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/n_5.jpg")));
                c = rand.nextInt(100)+1;
                terulet = c * c;
                    jTextPane1_szoveg.setText("N�gyzet:\nAdva van egy n�gyzet, melynek ismert a ter�lete:"+terulet+"cm, mennyi lesz a n�gyzet oldala?");
                megoldas = c;
                }
                if(sz_veletlenszeru == 6)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/t_1_.jpg")));
                    a = rand.nextInt(100)+1;
                    b = rand.nextInt(100)+1;
                    jTextPane1_szoveg.setText("T�glalap:\nAdva van egy t�glalap, melynek ismert k�t oldala, a="+a+"cm, b="+b+"cm, mennyi lesz a t�glalap ter�lete?");
                terulet = a * b;
                megoldas = terulet;
                }
                if(sz_veletlenszeru == 7)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/t_2_.jpg")));
                    a = rand.nextInt(100)+1;
                    b = rand.nextInt(100)+1;
                    jTextPane1_szoveg.setText("T�glalap:\nAdva van egy t�glalap, melynek ismert a k�t oldala, b="+b+"cm,a="+a+"cm, mennyi lesz a t�glalap ker�let�nek �s ter�let�nek az �sszege?");
                terulet = a * b;
                kerulet = 2*a + 2*b;
                megoldas = terulet + kerulet;
                }
                if(sz_veletlenszeru == 8)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/t_3_.jpg")));
                a = rand.nextInt(100)+1;
                b = rand.nextInt(100)+1;
                terulet = a * b;
                kerulet = 2*a + 2*b;
                    jTextPane1_szoveg.setText("T�glalap:\nAdva van egy t�glalap, melynek ismert a ter�lete:"+terulet+"cm^2, illetve egyik oldala,a="+a+"cm, mennyi lesz a t�glalap ker�lete?");
                megoldas = kerulet;
                }
                if(sz_veletlenszeru == 9)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/t_4_.jpg")));
                a = rand.nextInt(100)+1;
                b = rand.nextInt(100)+1;
                terulet = a * b;
                kerulet = 2*a+2*b;
                    jTextPane1_szoveg.setText("T�glalap:\nAdva van egy t�glalap, melynek ismert a ker�lete:"+kerulet+"cm, �s az egyik oldala,b="+b+"cm, mennyi lesz a t�glalap ter�lete?");
                megoldas = terulet;
                }
                if(sz_veletlenszeru == 10)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/t_5_.jpg")));
                b = rand.nextInt(100)+1;
                a = rand.nextInt(100)+1;
                kerulet = 2*a+2*b;
                    jTextPane1_szoveg.setText("T�glalap:\nAdva van egy t�glalap, melynek ismert a ker�lete:"+kerulet+"cm, illetve az egyik oldala: b="+b+"cm, mennyi lesz a t�glalap m�sik oldala,a-?");
                megoldas = a;
                }
                if(sz_veletlenszeru == 11)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/r_1.jpg")));
                    b = rand.nextInt(25)+1;
                    a = rand.nextInt(100)+26;
                    jTextPane1_szoveg.setText("Rombusz:\nAdva van egy rombusz, melynek ismert az oldala, a="+a+"cm, illetve a r� illeszked� magass�g, M'a="+b+"cm, mennyi lesz a rombusz ter�lete?");
                terulet = a * b;
                megoldas = terulet;
                }
                if(sz_veletlenszeru == 12)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/r_2.jpg")));
                    c = rand.nextInt(100)+26;
                    b = rand.nextInt(25)+1;
                    jTextPane1_szoveg.setText("Rombusz:\nAdva van egy rombusz, melynek ismert az oldala, c="+c+"cm, illetve a r� illeszked� magass�ga, M'c="+b+"cm, mennyi lesz a rombusz ker�let�nek �s ter�let�nek az �sszege?");
                terulet = c * b;
                kerulet = 4 * c;
                megoldas = terulet + kerulet;
                }
                if(sz_veletlenszeru == 13)
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
                if(sz_veletlenszeru == 14)
                {
                   feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/r_4.jpg")));
                e = rand.nextInt(100)+1;
                f = rand.nextInt(100)+1;
                terulet = (e * f)/2;
                    jTextPane1_szoveg.setText("Rombusz:\nAdva van egy rombusz, melynek ismert mindk�t �tl�ja: e="+e+"cm, f="+f+"cm, mennyi lesz a rombusz ter�lete?");
                megoldas =  (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                if(sz_veletlenszeru == 15)
                {
                   feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/r_5.jpg")));
                e = rand.nextInt(100)+1;
                terulet = rand.nextInt(400)+101;
                f = (2*terulet)/e;
                    jTextPane1_szoveg.setText("Rombusz:\nAdva van egy rombusz, melynek ismert a ter�lete:"+terulet+"cm, illetve az egyik �tl�ja: e="+e+"cm, mennyi lesz a rombusz m�sik �tl�ja, f-?");
                megoldas = (float) Adatok_megosztasa.kerekit(f,2);
                }
                if(sz_veletlenszeru == 16)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/d_1.jpg")));
                    b = rand.nextInt(100)+1;
                    a = rand.nextInt(100)+1;
                    jTextPane1_szoveg.setText("Deltoid:\nAdva van egy deltoid, melynek ismert mindk�t oldala, a="+a+"cm, b="+b+"cm, mennyi lesz a deltoid ker�lete?");
               kerulet = 2*a+2*b;
                megoldas = kerulet;
                }
                if(sz_veletlenszeru == 17)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/d_2.jpg")));
                e = rand.nextInt(100)+1;
                f = rand.nextInt(100)+1;
                terulet = (e * f)/2;
                    jTextPane1_szoveg.setText("Deltoid:\nAdva van egy deltoid, melynek ismert mindk�t �tl�ja: e="+e+"cm, f="+f+"cm, mennyi lesz a deltoid ter�lete?");
                megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                  if(sz_veletlenszeru == 18)
                {
                   feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/d_3.jpg")));
                    a = rand.nextInt(100)+1;
                    kerulet = rand.nextInt(400)+101;
                    jTextPane1_szoveg.setText("Deltoid:\nAdva van egy deltoid, melynek ismert egyik oldala, a="+a+"cm, �s a ker�lete, K="+kerulet+"cm, mennyi lesz a deltoid m�sik oldala, b-?");
                    b = (kerulet - 2*a) /2;
                megoldas = (float) Adatok_megosztasa.kerekit(b,2);
                }
                if(sz_veletlenszeru == 19)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/d_4.jpg")));
                f = rand.nextInt(100)+1;
                terulet = rand.nextInt(400)+101;
                e = (2*terulet)/f;
                    jTextPane1_szoveg.setText("Deltoid:\nAdva van egy deltoid, melynek ismert a ter�lete:"+terulet+"cm, illetve az egyik �tl�ja: f="+f+"cm, mennyi lesz a deltoid m�sik �tl�ja, e-?");
                megoldas = (float) Adatok_megosztasa.kerekit(e,2);
                }
                if(sz_veletlenszeru == 20)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/t1.jpg")));
                    b = rand.nextInt(100)+1; //magass�g
                    a = rand.nextInt(100)+1;
                    c = rand.nextInt(100)+1;
                    terulet = ((a+c)*b)/2;
                    jTextPane1_szoveg.setText("Trap�z:\nAdva van egy trap�z, melynek ismert k�t oldala, a="+a+"cm, c="+c+"cm, illetve egyik magass�ga, M'a="+b+"cm, mennyi lesz a trap�z ter�lete?");
                megoldas = (float) Adatok_megosztasa.kerekit(terulet,2);
                }
                if(sz_veletlenszeru == 21)
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
                if(sz_veletlenszeru == 22)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/p_1.jpg")));
                    b = rand.nextInt(100)+1; //magass�g
                    a = rand.nextInt(100)+1;
                    terulet = a * b;
                    jTextPane1_szoveg.setText("Paralelogramma:\nAdva van egy paralelogramma, melynek ismert az egyik oldala, �s egy magass�ga: a="+a+"cm, �s M'a="+b+"cm, mennyi lesz a paralelogramma ter�lete?");
                megoldas = terulet;
                }
                if(sz_veletlenszeru == 23)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/p_2.jpg")));
                    kerulet =rand.nextInt(400)+101; 
                    b = rand.nextInt(100)+1; 
                    a = (kerulet - (2 * b) )/2;
                    a = (float) Adatok_megosztasa.kerekit(a,2);
                    jTextPane1_szoveg.setText("Paralelogramma:\nAdva van egy paralelogramma, melynek ismert a ker�lete, illetve az egyik oldala, K="+kerulet+"cm, b="+b+"cm, mennyi lesz az a-oldal hossza?");
                megoldas = a;
                }
                if(sz_veletlenszeru == 24)
                {
                    feladatkep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/p_3.jpg")));
                    jTextPane1_szoveg.setText("Paralelogramma:\nAdva van egy paralelogramma, mennyi a bels� sz�geinek �sszege?");
                megoldas = 360;
                }
            break;
            
            default: System.out.println("Hiba!");
        }
        }
    }//GEN-LAST:event_mutasd_a_feladatot_gombMouseClicked
   
         int segedanyag_sz = 1;
    
    private void segedanyag_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segedanyag_gombActionPerformed
        //Seg�danyag k�r�se
        megnezte_a_megoldast = true;   
        
        String negyszogek ="";
try {
    BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Boldizs�r Erik\\Documents\\NetBeansProjects\\Alkalmazas\\src\\eszkozok\\negyszogek\\negyszogek.txt"));
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
    segedanyag_kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/negyzet.jpg")));
    
    elore_gomb.setText("K�vetkez�");
    elore_gomb.setBackground(new java.awt.Color(240, 240, 240));
    elore_gomb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_segedanyag_gombActionPerformed

    private void segedanyagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segedanyagMouseClicked
        // ha r�kattintunk a seg�danyagos sz�vegre,akkor az is elt�nik
        String negyszogek ="";
try {
    BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Boldizs�r Erik\\Documents\\NetBeansProjects\\Alkalmazas\\src\\eszkozok\\negyszogek\\negyszogek2.txt"));
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

    private void segedanyag_kepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_segedanyag_kepKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_segedanyag_kepKeyPressed
    
    private void segedanyag_kepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segedanyag_kepMouseClicked
        // ha r�kattintunk a seg�danyagos k�pre,akkor az elt�nik
        segedanyag_sz = 0;
        segedanyag_kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/sima2.jpg")));
        elore_gomb.setBackground(new java.awt.Color(240, 240, 241));
        elore_gomb.setText("");
        elore_gomb.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    }//GEN-LAST:event_segedanyag_kepMouseClicked

    private void segedanyag_gombComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_segedanyag_gombComponentAdded

    }//GEN-LAST:event_segedanyag_gombComponentAdded

    private void elore_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elore_gombActionPerformed
        //K�vetkez� gomb:
        segedanyag_sz++;
        if(segedanyag_sz == 1)
    {
    segedanyag_kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/negyzet.jpg")));
    }
    if(segedanyag_sz == 2)
    {
    segedanyag_kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/teglalap.jpg")));
    }
    if(segedanyag_sz == 3)
    {
    segedanyag_kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/rombusz.jpg")));
    }
    if(segedanyag_sz == 4)
    {
    segedanyag_kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/deltoid.jpg")));
    }
    if(segedanyag_sz == 5)
    {
    segedanyag_kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/trapez.jpg")));
    }
    if(segedanyag_sz == 6)
    {
    segedanyag_kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/negyszogek/para.jpg")));
    segedanyag_sz = 0;
    }
    }//GEN-LAST:event_elore_gombActionPerformed
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Negyszogek().setVisible(true);
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
