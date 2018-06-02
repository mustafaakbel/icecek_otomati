/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Mustafa
 */
public class SepetAction {

    int kola_sayac, sut_sayac;
    JLabel alinan_kola, alinan_su, alinan_sut, su_say, kola_say, sut_say;

    public void su() {
        ImageIcon su_gorsel = new ImageIcon("src/gui/bottle.png");
        alinan_su = new JLabel(su_gorsel);
        alinan_su.setBounds(12, 0, 40, 90);
        su_say = new JLabel();
        su_say.setForeground(new Color(242, 242, 242));
        su_say.setBounds(24, 95, 25, 20);

    }

    public void sut() {
        ImageIcon sut_gorsel = new ImageIcon("src/gui/milk.png");
        alinan_sut = new JLabel(sut_gorsel);
        alinan_sut.setBounds(163, 15, 45, 80);
        sut_say = new JLabel();
        sut_say.setForeground(new Color(242, 242, 242));
        sut_say.setBounds(176, 95, 25, 20);
    }

    public void kola() {
        ImageIcon kola_gorsel = new ImageIcon("src/gui/cola.png");
        alinan_kola = new JLabel(kola_gorsel);
        alinan_kola.setBounds(85, 17, 45, 80);
        kola_say = new JLabel();
        kola_say.setForeground(new Color(242, 242, 242));
        kola_say.setBounds(95, 95, 25, 20);

    }

    public JLabel getSut_say() {
        return sut_say;
    }

    public void setSut_say(JLabel sut_say) {
        this.sut_say = sut_say;
    }

    public JLabel getKola_say() {
        return kola_say;
    }

    public void setKola_say(JLabel kola_say) {
        this.kola_say = kola_say;
    }

    public JLabel getSu_say() {
        return su_say;
    }

    public void setSu_say(JLabel su_say) {
        this.su_say = su_say;
    }

    public int getSut_sayac() {
        return sut_sayac;
    }

    public void setSut_sayac(int sut_sayac) {
        this.sut_sayac = sut_sayac;
    }

    public JLabel getAlinan_sut() {
        return alinan_sut;
    }

    public void setAlinan_sut(JLabel alinan_sut) {
        this.alinan_sut = alinan_sut;
    }

    public JLabel getAlinan_kola() {
        return alinan_kola;
    }

    public void setAlinan_kola(JLabel alinan_kola) {
        this.alinan_kola = alinan_kola;
    }

    public int getKola_sayac() {
        return kola_sayac;
    }

    public void setKola_sayac(int kola_sayac) {
        this.kola_sayac = kola_sayac;
    }

    public JLabel getAlinan_su() {
        return alinan_su;
    }

    public void setAlinan_su(JLabel alinan_su) {
        this.alinan_su = alinan_su;
    }

}
