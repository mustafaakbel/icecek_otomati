/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import gui.MainGui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Mustafa
 */
public class Actions implements ActionListener {

    private MainGui gui;
    private SepetAction sepet_action = new SepetAction();
    private AyarAction ayar_action = new AyarAction();
    int su_indis, kola_indis, sut_indis, su_sayac, kola_sayac, sut_sayac;
    private boolean su_durum = true;
    private boolean kola_durum = true;
    private boolean sut_durum = true;

    public Actions(MainGui gui) {
        this.gui = gui;

        su_indis = getGui().getSular().getSular().length - 1;
        kola_indis = getGui().getKolalar().getKolalar().length - 1;
        sut_indis = getGui().getSutler().getSutler().length - 1;
        
    }

        public int EklemeSilme(String ad, ActionEvent e, int indis, int ucret, boolean durum, int sayac) {
            getGui().getBakiye().getUcret().setEnabled(false);
            if (indis < 0) {
                showMessageDialog(null, "Stokta " + ad + " kalmadı", "Hata", ERROR_MESSAGE);
            } else if (Integer.parseInt(getGui().getBakiye().getUcret().getText()) >= ucret) {
                if (durum == true) {
                    if (e.getSource().equals(getGui().getSular().getSu())) {
                        getSepet_action().su();
                        getGui().getSepet().getSepet_panel().add(getSepet_action().getSu_say());
                        setSu_durum(false);
                    } else if (e.getSource().equals(getGui().getKolalar().getKola_butonu())) {
                        getSepet_action().kola();
                        getGui().getSepet().getSepet_panel().add(getSepet_action().getKola_say());
                        setKola_durum(false);
                    } else if (e.getSource().equals(getGui().getSutler().getSut_butonu())) {
                        getSepet_action().sut();
                        getGui().getSepet().getSepet_panel().add(getSepet_action().getSut_say());
                        setSut_durum(false);
                    }
                }
                if (e.getSource().equals(getGui().getSular().getSu())) {
                    su_sayac++;
                    getGui().getSepet().getSepet_panel().add(getSepet_action().getAlinan_su());
                    getSepet_action().getSu_say().setText("x" + String.valueOf(su_sayac));
                    getGui().getSular().getSular()[indis].setVisible(false);
                } else if (e.getSource().equals(getGui().getKolalar().getKola_butonu())) {
                    kola_sayac++;
                    getGui().getSepet().getSepet_panel().add(getSepet_action().getAlinan_kola());
                    getSepet_action().getKola_say().setText("x" + String.valueOf(kola_sayac));
                    getGui().getKolalar().getKolalar()[indis].setVisible(false);
                } else if (e.getSource().equals(getGui().getSutler().getSut_butonu())) {
                    sut_sayac++;
                    getGui().getSepet().getSepet_panel().add(getSepet_action().getAlinan_sut());
                    getSepet_action().getSut_say().setText("x" + String.valueOf(sut_sayac));
                    getGui().getSutler().getSutler()[indis].setVisible(false);
                }
                getGui().getSepet().getSepet_panel().repaint();
                getGui().getBakiye().getUcret().setText(String.valueOf(Integer.parseInt(getGui().getBakiye().getUcret().getText()) - ucret));
                getGui().getParaustu().getPara_ustu().setText("₺" +String.valueOf(Integer.parseInt(getGui().getBakiye().getUcret().getText())));
                indis--;
            }

            return indis;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource().equals(getGui().getSular().getSu()) && Integer.parseInt(getGui().getBakiye().getUcret().getText()) >= getGui().getSular().getSu_ucret()) {
                    su_indis = EklemeSilme("su", e, su_indis, getGui().getSular().getSu_ucret(), su_durum, su_sayac);
                } else if (e.getSource().equals(getGui().getKolalar().getKola_butonu()) && Integer.parseInt(getGui().getBakiye().getUcret().getText()) >= getGui().getKolalar().getKola_ucret()) {
                    kola_indis = EklemeSilme("kola", e, kola_indis, getGui().getKolalar().getKola_ucret(), kola_durum, kola_sayac);
                } else if (e.getSource().equals(getGui().getSutler().getSut_butonu()) && Integer.parseInt(getGui().getBakiye().getUcret().getText()) >= getGui().getSutler().getSut_ucret()) {
                    sut_indis = EklemeSilme("süt", e, sut_indis, getGui().getSutler().getSut_ucret(), sut_durum, sut_sayac);
                } else if (e.getSource().equals(getGui().getSular().getSu()) && Integer.parseInt(getGui().getBakiye().getUcret().getText()) < getGui().getSular().getSu_ucret()) {
                    showMessageDialog(null, "Su için yeterli bakiyeniz yok.. ", "Bakiye Uyarı", WARNING_MESSAGE);
                } else if (e.getSource().equals(getGui().getKolalar().getKola_butonu()) && Integer.parseInt(getGui().getBakiye().getUcret().getText()) < getGui().getKolalar().getKola_ucret()) {
                    showMessageDialog(null, "Kola için yeterli bakiyeniz yok.. ", "Bakiye Uyarı", WARNING_MESSAGE);
                } else if (e.getSource().equals(getGui().getSutler().getSut_butonu()) && Integer.parseInt(getGui().getBakiye().getUcret().getText()) < getGui().getSutler().getSut_ucret()) {
                    showMessageDialog(null, "Süt için yeterli bakiyeniz yok.. ", "Bakiye Uyarı", WARNING_MESSAGE);
                } else if (e.getSource().equals(getGui().getParaustu().getPara_ustu())) {
                    ((JButton) e.getSource()).setText("0");
                    setSu_sayac(0);
                    setKola_sayac(0);
                    setSut_sayac(0);
                    setSu_durum(true) ;
                    setSut_durum(true);
                    setKola_durum(true);
                    getGui().getSepet().getSepet_panel().removeAll();
                    getGui().getSepet().getSepet_panel().repaint();
                    getGui().getBakiye().getUcret().setEnabled(true);
                    getGui().getBakiye().getUcret().setText("");
                } else if (e.getActionCommand().equals(" ")) {
                    getAyar_action().ayar();
                    getAyar_action().getSu_ekle().addActionListener(this);
                    getAyar_action().getKola_ekle().addActionListener(this);
                    getAyar_action().getSut_ekle().addActionListener(this);
                } else if (e.getSource().equals(getAyar_action().getSu_ekle())) {
                    if (getSu_indis() >= getGui().getSular().getSular().length - 1) {
                        showMessageDialog(null, "Stokta yeterince su var..! ", "Stok Uyarı", WARNING_MESSAGE);
                    } else {
                        getGui().getSular().getSular()[getSu_indis() + 1].setVisible(true);
                        su_indis++;
                    }
                } else if (e.getSource().equals(getAyar_action().getKola_ekle())) {
                    if (getKola_indis() >= getGui().getKolalar().getKolalar().length - 1) {
                        showMessageDialog(null, "Stokta yeterince kola var..! ", "Stok Uyarı", WARNING_MESSAGE);
                    } else {
                        getGui().getKolalar().getKolalar()[getKola_indis() + 1].setVisible(true);
                        kola_indis++;
                    }
                } else if (e.getSource().equals(getAyar_action().getSut_ekle())) {
                    if (getSut_indis() >= getGui().getSutler().getSutler().length - 1) {
                        showMessageDialog(null, "Stokta yeterince süt var..! ", "Stok Uyarı", WARNING_MESSAGE);
                    } else {
                        getGui().getSutler().getSutler()[getSut_indis() + 1].setVisible(true);
                        sut_indis++;
                    }
                }
            } catch (NumberFormatException d) {
                showMessageDialog(null, "Geçerli ücret giriniz.. ", "Hata", ERROR_MESSAGE);
                getGui().getBakiye().getUcret().setText("");
            }
        }

    

    public void setSu_durum(boolean su_durum) {
        this.su_durum = su_durum;
    }

    public void setKola_durum(boolean kola_durum) {
        this.kola_durum = kola_durum;
    }

    public void setSut_durum(boolean sut_durum) {
        this.sut_durum = sut_durum;
    }

    public int getSu_indis() {
        return su_indis;
    }

    public void setSu_indis(int su_indis) {
        this.su_indis = su_indis;
    }

    public int getKola_indis() {
        return kola_indis;
    }

    public void setKola_indis(int kola_indis) {
        this.kola_indis = kola_indis;
    }

    public int getSut_indis() {
        return sut_indis;
    }

    public void setSut_indis(int sut_indis) {
        this.sut_indis = sut_indis;
    }

    public AyarAction getAyar_action() {
        return ayar_action;
    }

    public void setAyar_action(AyarAction ayar_action) {
        this.ayar_action = ayar_action;
    }

    public SepetAction getSepet_action() {
        return sepet_action;
    }

    public void setSepet_action(SepetAction sepet_action) {
        this.sepet_action = sepet_action;
    }

    public MainGui getGui() {
        return gui;
    }

    public void setGui(MainGui gui) {
        this.gui = gui;
    }

    public int getSut_sayac() {
        return sut_sayac;
    }

    public void setSut_sayac(int sut_sayac) {
        this.sut_sayac = sut_sayac;
    }

    public int getKola_sayac() {
        return kola_sayac;
    }

    public void setKola_sayac(int kola_sayac) {
        this.kola_sayac = kola_sayac;
    }

    public int getSu_sayac() {
        return su_sayac;
    }

    public void setSu_sayac(int su_sayac) {
        this.su_sayac = su_sayac;
    }

}
