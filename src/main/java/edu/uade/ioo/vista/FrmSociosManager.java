package edu.uade.ioo.vista;

import javax.swing.*;
import java.awt.*;

public class FrmSociosManager extends JDialog{

    private JPanel pnlPrincipal;
    private JTabbedPane tabbedPane1;
    private JDesktopPane solapaAgregaPro;
    private JDesktopPane solapaAgregaPar;

    public FrmSociosManager(Window owner, String title) {
        super(owner, title);
        this.setContentPane(pnlPrincipal);

        this.setSize(1200, 1000);
        this.setModal(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        FrmSociosSolapaAgregaProtector sociosSolapaAgregaProtector = new FrmSociosSolapaAgregaProtector("Agrega SocPro");
        sociosSolapaAgregaProtector.setVisible(true);
        solapaAgregaPro.add(sociosSolapaAgregaProtector);


    }
}
