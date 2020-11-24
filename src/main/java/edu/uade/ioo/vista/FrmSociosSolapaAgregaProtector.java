package edu.uade.ioo.vista;

import javax.swing.*;

public class FrmSociosSolapaAgregaProtector extends JInternalFrame{
    private JPanel pnlPrincipal;
    private JTextField txtCuit;
    private JTextField textField1;
    private JTextField textField3;
    private JComboBox comboBox1;
    private JTextField textField2;
    private JTextField textField4;
    private JTextField textField5;
    private JButton agregarSocioButton;

    public FrmSociosSolapaAgregaProtector(String title){
        super( title);
        this.setContentPane(pnlPrincipal);

        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    }

}
