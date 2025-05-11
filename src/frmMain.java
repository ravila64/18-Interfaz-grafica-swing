import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmMain {
    private JTextField txtUser;
    private JButton btnInsert;
    private JButton btnEdit;
    private JButton btnDelete;
    private JButton btnExit;
    private JPanel jPanelPrincipal;
    private JLabel lblTexto;
    private JButton btnMensaje;
    private JPasswordField txtPassword;
   private JButton btnIngresar;
   private JCheckBox cbxMostrar;

   public frmMain() {
        btnInsert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // null, no tiene un componente padre
                JOptionPane.showMessageDialog(null, "Hola mundo btn INSERT !!!");
            }
        });
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnMensaje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = txtUser.getText();
                String mensaje = "Bienvenido " + user + " !!! ";
                lblTexto.setText(mensaje);
            }
        });
    }

    public JPanel getjPanelPrincipal() {
        return jPanelPrincipal;
    }
}
