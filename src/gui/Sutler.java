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
public class Sutler {

    private JLabel sutler[] = new JLabel[5];
    private JPanel sutler_panel;
    private JButton sut_butonu;
    private int baslangic_yeri;
    private int sut_ucret=3;
    public Sutler() {
        sutler_panel = new JPanel();
        sutler_panel.setLayout(null);
        sutler_panel.setBounds(55, 170, 500, 180);
        sutler_panel.setOpaque(false);

        sut_butonu = new JButton("Süt ₺"+sut_ucret);
        Font font = new Font("Arial", Font.BOLD, 12);
        sut_butonu.setFont(font);
        sut_butonu.setBounds(280, 42, 80, 20);
        sut_butonu.setBackground(Color.black);
        sut_butonu.setForeground(new Color(242, 242, 242));
        sut_butonu.setBorder(null);

        ImageIcon sut_bg = new ImageIcon("src/gui/milk.png");
        baslangic_yeri = 8;
        for (int i = 0; i < sutler.length; i++) {
            sutler[i] = new JLabel(sut_bg);
            sutler[i].setBounds(baslangic_yeri, 80, 45, 90);
            sutler_panel.add(sutler[i]);
            baslangic_yeri += 45;
        }
        sutler_panel.add(sut_butonu);
    }

    public int getSut_ucret() {
        return sut_ucret;
    }

    public void setSut_ucret(int sut_ucret) {
        this.sut_ucret = sut_ucret;
    }

    public JLabel[] getSutler() {
        return sutler;
    }

    public void setSutler(JLabel[] sutler) {
        this.sutler = sutler;
    }

    public JButton getSut_butonu() {
        return sut_butonu;
    }

    public void setSut_butonu(JButton sut_butonu) {
        this.sut_butonu = sut_butonu;
    }

    public JPanel getSutler_panel() {
        return sutler_panel;
    }

    public void setSutler_panel(JPanel sutler_panel) {
        this.sutler_panel = sutler_panel;
    }

}
