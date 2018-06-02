/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Mustafa
 */
public class ParaUstu {

    private JLabel info;
    private JButton para_ustu;
    private JPanel paraustu_paneli;

    public ParaUstu() {
        paraustu_paneli = new JPanel();
        paraustu_paneli.setLayout(null);
        paraustu_paneli.setBounds(330, 338, 150, 90);

        paraustu_paneli.setOpaque(false);

        info = new JLabel("Para üstü.. ");
        info.setBounds(0, 0, 150, 20);
        info.setForeground(new Color(242, 242, 242));
        Font font = new Font("Arial", Font.BOLD, 12);
        para_ustu = new JButton();
        para_ustu.setFont(font);
        para_ustu.setBackground(new Color(255, 206, 84));
        para_ustu.setBorder(null);
        para_ustu.setForeground(Color.black);
        para_ustu.setBounds(17, 37, 50, 50);

        paraustu_paneli.add(info);
        paraustu_paneli.add(para_ustu);
    }

    public JPanel getParaustu_paneli() {
        return paraustu_paneli;
    }

    public void setParaustu_paneli(JPanel paraustu_paneli) {
        this.paraustu_paneli = paraustu_paneli;
    }

    public JButton getPara_ustu() {
        return para_ustu;
    }

    public void setPara_ustu(JButton para_ustu) {
        this.para_ustu = para_ustu;
    }

}
