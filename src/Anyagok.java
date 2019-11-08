import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Anyagok extends javax.swing.JFrame {   
    public Anyagok() {
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setTitle("Segédanyagok");
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vissza_gomb = new javax.swing.JButton();
        szoveg = new javax.swing.JLabel();
        kilepes_gomb = new javax.swing.JButton();
        valaszto = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        szovegmezo = new javax.swing.JTextPane();
        kep2 = new javax.swing.JLabel();
        kep = new javax.swing.JLabel();
        kep3 = new javax.swing.JLabel();
        kov_gomb = new javax.swing.JButton();
        felso_valaszto_menu = new javax.swing.JMenuBar();
        fajl_menu = new javax.swing.JMenu();
        kilepes = new javax.swing.JMenuItem();
        segitseg_menu = new javax.swing.JMenu();
        elerhetoseg = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        vissza_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/vissza.png"))); // NOI18N
        vissza_gomb.setText("Vissza a menübe");
        vissza_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vissza_gombActionPerformed(evt);
            }
        });

        szoveg.setText("Üdvözöllek a segédanyagoknál! Válaszd ki, a megfelelõ témakört!");

        kilepes_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/kilepes.png"))); // NOI18N
        kilepes_gomb.setText("Kilépés");
        kilepes_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kilepes_gombActionPerformed(evt);
            }
        });

        valaszto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Háromszögek", "Négyszögek", "Körök" }));
        valaszto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valasztoActionPerformed(evt);
            }
        });

        szovegmezo.setEditable(false);
        jScrollPane2.setViewportView(szovegmezo);

        kep2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/segedanyagok/0.jpg"))); // NOI18N

        kep.setBackground(new java.awt.Color(102, 255, 102));
        kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/segedanyagok/sima.jpg"))); // NOI18N

        kep3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/program/bagoly.jpg"))); // NOI18N

        kov_gomb.setBackground(new java.awt.Color(240, 240, 241));
        kov_gomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/segedanyagok/kov.png"))); // NOI18N
        kov_gomb.setText("Lapozás a következõre");
        kov_gomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kov_gombActionPerformed(evt);
            }
        });

        fajl_menu.setText("Fájl");
        fajl_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fajl_menuActionPerformed(evt);
            }
        });

        kilepes.setText("Kilépés");
        kilepes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kilepesActionPerformed(evt);
            }
        });
        fajl_menu.add(kilepes);

        felso_valaszto_menu.add(fajl_menu);

        segitseg_menu.setText("Segítség");
        segitseg_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segitseg_menuActionPerformed(evt);
            }
        });

        elerhetoseg.setText("Elérhetõség");
        elerhetoseg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elerhetosegActionPerformed(evt);
            }
        });
        segitseg_menu.add(elerhetoseg);

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(szoveg, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valaszto, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(kep2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(40, 40, 40))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(kep3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(vissza_gomb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1078, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kep, javax.swing.GroupLayout.PREFERRED_SIZE, 1650, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kov_gomb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kilepes_gomb)
                                .addGap(604, 604, 604))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(szoveg, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valaszto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kep, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kov_gomb)
                        .addGap(182, 182, 182))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(kep2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kep3)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kilepes_gomb)
                            .addComponent(vissza_gomb))
                        .addGap(161, 161, 161))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vissza_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vissza_gombActionPerformed
        //Vissza a menübe gomb
        Program Program = new Program();
        Program.setVisible(true);
        dispose();
    }//GEN-LAST:event_vissza_gombActionPerformed

    boolean haromszog = false;
    boolean negyszog = false;
    int sz_haromszog = 1;
    int sz_negyszog = 1;
    
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
          
    private void valasztoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valasztoActionPerformed
                //Választás-menü               
            String valami = (String) valaszto.getSelectedItem();
            switch (valami)
            {
                case "Háromszögek" : 
                    negyszog = false;
                    haromszog = true;
                    kep2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/segedanyagok/h.jpg")));
                    szovegmezo.setText("Háromszögek");
                String haromszogek ="";
try {
    BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Boldizsár Erik\\Documents\\NetBeansProjects\\Alkalmazas\\src\\eszkozok\\segedanyagok\\haromszogek\\haromszogek.txt"));
    // Az ékezeteket az ISO-8859-2-vel lehet megnyitni!
    StringBuilder sb = new StringBuilder();
    String line = br.readLine();
    while (line != null)
    {
        sb.append(line);
        sb.append(System.lineSeparator());
        line = br.readLine();
    }
    haromszogek = sb.toString();
    }
        catch(IOException ex)
            {
           System.out.println("Nincs meg a fájl!");
           }  
                    szovegmezo.setText(haromszogek);
                    
                    //itt jön a képbeillesztés:
                    kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/segedanyagok/haromszogek/1.jpg")));
                break;
                
                case "Négyszögek" :     
                    haromszog = false;
                    negyszog = true;
                    kep2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/segedanyagok/n.jpg")));
                     String negyszogek ="";
try {
    BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Boldizsár Erik\\Documents\\NetBeansProjects\\Alkalmazas\\src\\eszkozok\\segedanyagok\\negyszogek\\negyszogek.txt"));
    // Az ékezeteket az ISO-8859-2-vel lehet megnyitni!
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
           System.out.println("Nincs meg a fájl!");
           }  
                    szovegmezo.setText(negyszogek);
                    
                    //itt jön a képbeillesztés:
                    kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/segedanyagok/negyszogek/1.jpg")));
                break;
                             
                case "Körök" : 
                    negyszog = false;
                    haromszog = false;
                    kep2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/segedanyagok/k.jpg")));
                    String korok ="";
try {
    BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Boldizsár Erik\\Documents\\NetBeansProjects\\Alkalmazas\\src\\eszkozok\\segedanyagok\\korok\\korok.txt"));
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
                    szovegmezo.setText(korok);
                    //itt jön a képbeillesztés:
                    kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/segedanyagok/korok/kor.jpg")));
                break;
                default: System.out.println("Hiba!");
            }        
    }//GEN-LAST:event_valasztoActionPerformed

    private void fajl_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fajl_menuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fajl_menuActionPerformed

    private void kilepesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kilepesActionPerformed
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
    }//GEN-LAST:event_kilepesActionPerformed

    private void segitseg_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segitseg_menuActionPerformed
        
    }//GEN-LAST:event_segitseg_menuActionPerformed

    private void elerhetosegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elerhetosegActionPerformed
        //Segitseg
        Segitseg Segitseg = new Segitseg();
        Segitseg.setVisible(true);
    }//GEN-LAST:event_elerhetosegActionPerformed

    private void kov_gombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kov_gombActionPerformed
        //Lapozás a következõ oldalra, négyszögek és háromszögek esetén:
        if (haromszog)
        {
            sz_haromszog++;
            if(sz_haromszog == 1)
            {
                 kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/segedanyagok/haromszogek/1.jpg")));
            }
            if(sz_haromszog == 2)
                    {
                          kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/segedanyagok/haromszogek/2.jpg")));
                    sz_haromszog = 0;
                    }
        }
        else
        if(negyszog)
        {
            sz_negyszog++;
            if(sz_negyszog == 1)
                    {
                          kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/segedanyagok/negyszogek/1.jpg")));
                    }
            if(sz_negyszog == 2)
                    {
                          kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/segedanyagok/negyszogek/2.jpg")));
                    }
                     if(sz_negyszog == 3)
                    {
                          kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/segedanyagok/negyszogek/3.jpg")));
                    sz_negyszog = 0;
                    }
        }
        else
        {
            kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eszkozok/segedanyagok/korok/kor.jpg")));
        }
    }//GEN-LAST:event_kov_gombActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Haromszogek().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem elerhetoseg;
    private javax.swing.JMenu fajl_menu;
    private javax.swing.JMenuBar felso_valaszto_menu;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel kep;
    private javax.swing.JLabel kep2;
    private javax.swing.JLabel kep3;
    private javax.swing.JMenuItem kilepes;
    private javax.swing.JButton kilepes_gomb;
    private javax.swing.JButton kov_gomb;
    private javax.swing.JMenu segitseg_menu;
    private javax.swing.JLabel szoveg;
    private javax.swing.JTextPane szovegmezo;
    private javax.swing.JComboBox<String> valaszto;
    private javax.swing.JButton vissza_gomb;
    // End of variables declaration//GEN-END:variables
private void setIcon() 
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/eszkozok/program/ikon.jpg"))); //Itt állítom be az ikont
    }
}
