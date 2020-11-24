package edu.uade.ioo.vista;

import edu.uade.ioo.Controller.ControladorSGR;
import edu.uade.ioo.socio.dominio.SocioProtector;
import edu.uade.ioo.socio.dominio.TipoEmpresa;
import edu.uade.ioo.usuario.dominio.Historial;
import edu.uade.ioo.utils.MiTableModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

public class FrmSociosSolapaAgregaProtector extends JInternalFrame {
    private JPanel pnlPrincipal;
    private JTextField txtCuit;
    private JTextField txtRazonSocial;
    private JTextField txtActividad;
    private JComboBox cmbTipoEmpresa;
    private JTextField txtDireccion;
    private JTextField txtTelefono;
    private JTextField txtEmail;
    private JButton agregarSocioButton;

    public FrmSociosSolapaAgregaProtector(String title) {
        super(title);
        this.setContentPane(pnlPrincipal);

        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        agregarSocioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String cuit = txtCuit.getText();
                String razonSocial = txtRazonSocial.getText();
                TipoEmpresa tipoEmpresa;
                String tipoEmpresaString = (String) cmbTipoEmpresa.getSelectedItem();
                if (tipoEmpresaString.equals("PEQ")) {
                    tipoEmpresa = TipoEmpresa.PEQUENA;
                } else {
                    tipoEmpresa = TipoEmpresa.MEDIANA;
                }
                String actividad = txtActividad.getText();
                String direccion = txtDireccion.getText();
                String telefono = txtTelefono.getText();
                String email = txtEmail.getText();

                txtCuit.setText("");
                txtRazonSocial.setText("");
                txtActividad.setText("");
                txtDireccion.setText("");
                txtTelefono.setText("");
                txtEmail.setText("");

                System.out.println("creando socio");


                SocioProtector socioProtector = new SocioProtector(
                        cuit
                        , razonSocial
                        , Instant.now()
                        , tipoEmpresa
                        , actividad
                        , direccion
                        , telefono
                        , email
                        , 0);

                ControladorSGR.agregaSocioProtector(socioProtector);

                System.out.println(socioProtector);
                System.out.println(socioProtector.getRazonSocial());
                JOptionPane.showMessageDialog(null,"Socio Agregado Con exito");

            }
        });
    }

}
