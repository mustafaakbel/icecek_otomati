/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Mustafa
 */
public class Bakiye {

    private JLabel info;
    private JTextField ucret;
    private JPanel bakiye_panel;

    public Bakiye() {
        bakiye_panel = new JPanel();
        bakiye_panel.setLayout(null);
        bakiye_panel.setBounds(325, 30, 150, 50);
        bakiye_panel.setOpaque(false);

        info = new JLabel("Bakiyeyi giriniz.. ");
        info.setBounds(1, 1, 145, 20);
        info.setForeground(new Color(242, 242, 242));

        ucret = new JTextField();
        ucret.setBounds(0, 20, 90, 25);
        ucret.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(null),
                BorderFactory.createEmptyBorder(0, 5, 0, 0)));

        bakiye_panel.add(info);
        bakiye_panel.add(ucret);

    }

    public JLabel getInfo() {
        return info;
    }

    public void setInfo(JLabel info) {
        this.info = info;
    }

    public JTextField getUcret() {
        return ucret;
    }

    public void setUcret(JTextField ucret) {
        this.ucret = ucret;
    }

    public JPanel getBakiye_panel() {
        return bakiye_panel;
    }

    public void setBakiye_panel(JPanel bakiye_panel) {
        this.bakiye_panel = bakiye_panel;
    }

}
