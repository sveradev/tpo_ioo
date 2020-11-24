package edu.uade.ioo.vista;

import edu.uade.ioo.testing.testing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmMenuSeleccion extends JDialog {
    private JPanel pnlPrincipal;
    private JButton btnSocios;
    private JButton operacionesButton;
    private JButton consultasGeneralesButton;
    private FrmMenuSeleccion self;

    public FrmMenuSeleccion(Window owner, String title) {
        super(owner, title);
        this.setContentPane(pnlPrincipal);

        this.setSize(600, 600);
        this.setModal(true);

        this.self = this;

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        this.setLocationRelativeTo(null);
        testing.inicializarSistema();
        System.out.println("test");

        btnSocios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmGridLog logSocios = new FrmGridLog(self);
                logSocios.setVisible(true);

                FrmSociosManager frmSociosManager = new FrmSociosManager(self,"Socios - Manager");
                frmSociosManager.setVisible(true);


            }
        });
    }
}
