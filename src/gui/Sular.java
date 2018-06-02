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
public class Sular {

    private JLabel sular[] = new JLabel[6];
    private JPanel sular_paneli;
    private int baslangic_yeri;
    private JButton su;
    private int su_ucret=2;
    public Sular() {
        sular_paneli = new JPanel();
        sular_paneli.setLayout(null);
        sular_paneli.setBounds(55, 22, 500, 150);
        sular_paneli.setOpaque(false);
        Font font = new Font("Arial", Font.BOLD, 12);
        su = new JButton("Su ₺"+su_ucret);
        su.setBounds(280, 130, 80, 20);
        su.setBackground(Color.black);
        su.setFont(font);
        su.setForeground(new Color(242, 242, 242));
        su.setBorder(null);

        baslangic_yeri = 5;
        ImageIcon su_bg = new ImageIcon("src/gui/bottle.png");
        for (int i = 0; i < sular.length; i++) {
            sular[i] = new JLabel(su_bg);
            sular[i].setBounds(baslangic_yeri, 2, 40, 90);
            sular_paneli.add(sular[i]);
            baslangic_yeri += 40;
        }
        sular_paneli.add(su);

    }

    public int getSu_ucret() {
        return su_ucret;
    }

    public void setSu_ucret(int su_ucret) {
        this.su_ucret = su_ucret;
    }

    public JPanel getSular_paneli() {
        return sular_paneli;
    }

    public void setSular_paneli(JPanel sular_paneli) {
        this.sular_paneli = sular_paneli;
    }

    public JLabel[] getSular() {
        return sular;
    }

    public void setSular(JLabel[] sular) {
        this.sular = sular;
    }

    public JButton getSu() {
        return su;
    }

    public void setSu(JButton su) {
        this.su = su;
    }

}
