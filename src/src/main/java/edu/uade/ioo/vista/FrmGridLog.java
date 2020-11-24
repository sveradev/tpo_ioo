package edu.uade.ioo.vista;

import edu.uade.ioo.utils.MiTableModel;

import javax.swing.*;
import java.awt.*;

public class FrmGridLog extends JDialog {
    private JPanel pnlPrincipal;
    private JTable tableUsuario;

    private MiTableModel miModelo = new MiTableModel();

    public FrmGridLog(Window owner) {
        super(owner, "Demo Grids");
        this.setContentPane(pnlPrincipal);

        this.setSize(400, 400);
//        this.setModal(true);


        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        this.setLocationRelativeTo(null);

        tableUsuario.setModel(miModelo);

        miModelo.cargarSocios();

    }
}