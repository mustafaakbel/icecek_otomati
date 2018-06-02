/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.awt.Color;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Mustafa
 */
public class AyarAction {

    private JFrame ayar_pencere;
    private JPanel ayarlar;
    private JButton su_ekle, kola_ekle, sut_ekle;

    public void ayar() {
        
        
        ayar_pencere = new JFrame("Ayar");
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int width = gd.getDisplayMode().getWidth();
        int height = gd.getDisplayMode().getHeight();
        
        ayar_pencere.setBounds((width/2)+250, (height/2)-275, 200, 200);
        ayar_pencere.setVisible(true);
        ayarlar = new JPanel();
        ayarlar.setLayout(null);
        ayarlar.setBackground(new Color(101, 109, 120));

        su_ekle = new JButton("Su Ekle");
        su_ekle.setBounds(40, 10, 90, 30);
        su_ekle.setBackground(new Color(255, 206, 84));
        su_ekle.setForeground(Color.BLACK);
        su_ekle.setBorder(BorderFactory.createLineBorder(Color.black));

        kola_ekle = new JButton("Kola Ekle");
        kola_ekle.setBounds(40, 60, 90, 30);
        kola_ekle.setBackground(new Color(255, 206, 84));
        kola_ekle.setForeground(Color.BLACK);
        kola_ekle.setBorder(BorderFactory.createLineBorder(Color.black));

        sut_ekle = new JButton("Süt Ekle");
        sut_ekle.setBounds(40, 110, 90, 30);
        sut_ekle.setBackground(new Color(255, 206, 84));
        sut_ekle.setForeground(Color.BLACK);
        sut_ekle.setBorder(BorderFactory.createLineBorder(Color.black));

        ayarlar.add(su_ekle);
        ayarlar.add(kola_ekle);
        ayarlar.add(sut_ekle);
        ayar_pencere.add(ayarlar);
    }

    public JFrame getAyar_pencere() {
        return ayar_pencere;
    }

    public void setAyar_pencere(JFrame ayar_pencere) {
        this.ayar_pencere = ayar_pencere;
    }

    public JPanel getAyarlar() {
        return ayarlar;
    }

    public void setAyarlar(JPanel ayarlar) {
        this.ayarlar = ayarlar;
    }

    public JButton getSu_ekle() {
        return su_ekle;
    }

    public void setSu_ekle(JButton su_ekle) {
        this.su_ekle = su_ekle;
    }

    public JButton getKola_ekle() {
        return kola_ekle;
    }

    public void setKola_ekle(JButton kola_ekle) {
        this.kola_ekle = kola_ekle;
    }

    public JButton getSut_ekle() {
        return sut_ekle;
    }

    public void setSut_ekle(JButton sut_ekle) {
        this.sut_ekle = sut_ekle;
    }

}
