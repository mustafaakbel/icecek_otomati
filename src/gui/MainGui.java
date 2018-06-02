package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import logic.Actions;

/**
 *
 * @author Mustafa
 */
public class MainGui {

    private JFrame pencere;
    private JPanel panel;
    private JLabel arkaplan;
    private JLayeredPane paneller = new JLayeredPane(); //Panelleri üst üste ekleme
    private Sular sular = new Sular();
    private Kolalar kolalar = new Kolalar();
    private Sutler sutler = new Sutler();
    private Bakiye bakiye = new Bakiye();
    private ParaUstu paraustu = new ParaUstu();
    private Sepet sepet = new Sepet();
    private Ayar ayar = new Ayar();
    private Actions action=null;
    
    
    public MainGui() {
        actioncontrol();
        pencere = new JFrame("İçecek Otamatı"); //Frame oluşturma
        panel = new JPanel();
        panel.setLayout(null);

        arkaplan = new JLabel();
        arkaplan.setIcon(new ImageIcon("src/gui/bg.png")); // arkaplanı ayarlama
        arkaplan.setBounds(0, 6, 500, 500);

        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int width = gd.getDisplayMode().getWidth();
        int height = gd.getDisplayMode().getHeight();
        pencere.setBounds((width-500)/2,(height-550)/2,500, 550);
        pencere.setVisible(true);

        pencere.setResizable(false);
        panel.setBackground(new Color(101, 109, 120)); //Ana panelin rengi
        panel.setSize(500, 550);
        panel.add(arkaplan);
        paneller.add(panel, new Integer(1));
        paneller.add(getSepet().getSepet_panel(), new Integer(2));
        paneller.add(getSular().getSular_paneli(), new Integer(3));
        paneller.add(getKolalar().getKola_panel(), new Integer(4));
        paneller.add(getSutler().getSutler_panel(), new Integer(5));
        paneller.add(getBakiye().getBakiye_panel(), new Integer(6));
        paneller.add(getParaustu().getParaustu_paneli(), new Integer(7));
        paneller.add(getAyar().getAyar_paneli(), new Integer(8));
        pencere.add(paneller);
        getAyar().getAyar_buton().addActionListener(action);
        getSular().getSu().addActionListener(action);
        getKolalar().getKola_butonu().addActionListener(action);
        getParaustu().getPara_ustu().addActionListener(action);
        getSutler().getSut_butonu().addActionListener(action);
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public Actions getAction() {
        return action;
    }

    public void actioncontrol() {
        if(this.action==null){
            this.action = new Actions(this);
        }
    }
    
    
    
    public Ayar getAyar() {
        return ayar;
    }

    public void setAyar(Ayar ayar) {
        this.ayar = ayar;
    }

    public Sepet getSepet() {
        return sepet;
    }

    public void setSepet(Sepet sepet) {
        this.sepet = sepet;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JFrame getPencere() {
        return pencere;
    }

    public void setPencere(JFrame pencere) {
        this.pencere = pencere;
    }

    public Sutler getSutler() {
        return sutler;
    }

    public void setSutler(Sutler sutler) {
        this.sutler = sutler;
    }

    public Kolalar getKolalar() {
        return kolalar;
    }

    public void setKolalar(Kolalar kolalar) {
        this.kolalar = kolalar;
    }

    public ParaUstu getParaustu() {
        return paraustu;
    }

    public void setParaustu(ParaUstu paraustu) {
        this.paraustu = paraustu;
    }

    public Sular getSular() {
        return sular;
    }

    public void setSular(Sular sular) {
        this.sular = sular;
    }

    public Bakiye getBakiye() {
        return bakiye;
    }

    public void setBakiye(Bakiye bakiye) {
        this.bakiye = bakiye;
    }

}
