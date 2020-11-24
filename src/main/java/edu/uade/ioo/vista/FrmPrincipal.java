package edu.uade.ioo.vista;

import edu.uade.ioo.testing.testing;
import edu.uade.ioo.usuario.dominio.Usuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.UUID;

public class FrmPrincipal extends JFrame{
    private JPanel pnlPrincipal;
    private JTextField txtUser;
    private JPasswordField passUser;
    private JButton btnLogin;
    private HashMap<String, String> users;

    private FrmPrincipal self;


    public FrmPrincipal(String title){
        super(title);

//        try {
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (UnsupportedLookAndFeelException e) {
//            e.printStackTrace();
//        }

        this.users = new HashMap<>();
        this.users.put("admin", "1234");
        this.users.put("slavic", "1111");

        this.setContentPane(pnlPrincipal);
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        this.self = this;

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String userIngresado = txtUser.getText();
                String passIngresado = String.valueOf(passUser.getPassword());

                txtUser.setText("");
                passUser.setText("");

                if (users.containsKey(userIngresado)){
                    if (users.get(userIngresado).equals(passIngresado)){
                        System.out.println("Login bien");
                        self.dispose();
                        Usuario.setId(UUID.randomUUID());
                        Usuario.setNombre(userIngresado);
                        FrmMenuSeleccion frame = new FrmMenuSeleccion(self,"Menu Principal");
                        frame.setVisible(true);
                    }else{
                        System.out.println("Pass incorrecta");
                        JOptionPane.showMessageDialog(null,"Pass incorrecta");
                    }
                }else{
                    System.out.println("Usuario inexistente");
                    JOptionPane.showMessageDialog(null,"Usuario inexistente");
                }


            }
        });
    }

}
