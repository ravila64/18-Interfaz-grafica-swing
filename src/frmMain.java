import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmMain {
   private JTextField textField1;
   private JTextField textField2;
   private JButton btnInsert;
   private JButton btnEdit;
   private JButton btnDelete;
   private JButton btnExit;
   private JPanel jPanelPrincipal;

   public frmMain() {
      btnInsert.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            // null, no tiene un componente padre
            JOptionPane.showMessageDialog(null,"Hola mundo btn INSERT !!!");
         }
      });
   }

   public JPanel getjPanelPrincipal() {
      return jPanelPrincipal;
   }
}
