/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Mustafa
 */
public class Ayar {

    private JPanel ayar_paneli;
    private JButton ayar_buton;

    public Ayar() {
        ayar_paneli = new JPanel();
        ayar_paneli.setBounds(452, 0, 40, 35);
        ayar_paneli.setOpaque(false);
        ayar_buton = new JButton(" ");
        ImageIcon a = new ImageIcon("src/gui/settings.png");
        ayar_buton.setIcon(a);
        ayar_buton.setBounds(0, 0, 32, 32);
        ayar_buton.setBackground(new Color(101, 109, 120));
        ayar_buton.setForeground(Color.black);
        ayar_buton.setBorder(null);
        
        ayar_paneli.add(ayar_buton);

    }

    public JPanel getAyar_paneli() {
        return ayar_paneli;
    }

    public void setAyar_paneli(JPanel ayar_paneli) {
        this.ayar_paneli = ayar_paneli;
    }

    public JButton getAyar_buton() {
        return ayar_buton;
    }

    public void setAyar_buton(JButton ayar_buton) {
        this.ayar_buton = ayar_buton;
    }

}
