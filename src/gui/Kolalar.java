package gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Mustafa
 */
public class Kolalar {

    private JLabel[] kolalar = new JLabel[5];
    private JPanel kola_panel;
    private int baslangic_yeri;
    private JButton kola_butonu;
    private int kola_ucret = 4;
    public Kolalar() {
        kola_panel = new JPanel();
        kola_panel.setLayout(null);
        kola_panel.setBounds(55, 147, 500, 80);
        kola_panel.setOpaque(false);

        kola_butonu = new JButton("Kola ₺"+kola_ucret);
        Font font = new Font("Arial", Font.BOLD, 12);
        kola_butonu.setFont(font);
        kola_butonu.setBounds(280, 35, 80, 20);
        kola_butonu.setBackground(Color.black);
        kola_butonu.setForeground(new Color(242, 242, 242));
        kola_butonu.setBorder(null);

        ImageIcon cola_bg = new ImageIcon("src/gui/cola.png");
        baslangic_yeri = 7;
        for (int i = 0; i < kolalar.length; i++) {
            kolalar[i] = new JLabel(cola_bg);
            kolalar[i].setBounds(baslangic_yeri, 0, 45, 80);
            kola_panel.add(kolalar[i]);
            baslangic_yeri += 45;
        }
        kola_panel.add(kola_butonu);
    }

    public int getKola_ucret() {
        return kola_ucret;
    }

    public void setKola_ucret(int kola_ucret) {
        this.kola_ucret = kola_ucret;
    }

    public JLabel[] getKolalar() {
        return kolalar;
    }

    public void setKolalar(JLabel[] kolalar) {
        this.kolalar = kolalar;
    }

    public JButton getKola_butonu() {
        return kola_butonu;
    }

    public void setKola_butonu(JButton kola_butonu) {
        this.kola_butonu = kola_butonu;
    }

    public JPanel getKola_panel() {
        return kola_panel;
    }

    public void setKola_panel(JPanel kola_panel) {
        this.kola_panel = kola_panel;
    }

}
