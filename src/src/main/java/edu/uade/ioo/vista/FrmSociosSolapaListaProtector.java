package edu.uade.ioo.vista;

import edu.uade.ioo.Controller.ControladorSGR;
import edu.uade.ioo.socio.dominio.SocioProtector;
import edu.uade.ioo.testing.ColorItem;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



public class FrmSociosSolapaListaProtector extends JInternalFrame{
    private JPanel pnlPrincipal;
    private JComboBox cmbSocioPro;
    private List<ColorItem> colores= new ArrayList<ColorItem>();



    public FrmSociosSolapaListaProtector(String title) {
        super(title);
        this.setContentPane(pnlPrincipal);

        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);

//        colores.add(new ColorItem(10, "Verde"));
//        colores.add(new ColorItem(20, "Rojo"));
//        colores.add(new ColorItem(30, "Azul"));
//        colores.add(new ColorItem(40, "Violeta"));
//        colores.add(new ColorItem(50, "Amarillo"));
//
//
//        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
//
//        modelo.addAll(colores);
//        cmbSocioPro.setModel(modelo);


    }
}
