/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Mustafa
 */
public class Sepet {

    private JPanel sepet_panel;

    public Sepet() {
        sepet_panel = new JPanel();
        sepet_panel.setLayout(null);
        sepet_panel.setBounds(70, 350, 230, 130);
        sepet_panel.setVisible(true);
        sepet_panel.setOpaque(false);

    }

    public JPanel getSepet_panel() {
        return sepet_panel;
    }

    public void setSepet_panel(JPanel sepet_panel) {
        this.sepet_panel = sepet_panel;
    }

}
