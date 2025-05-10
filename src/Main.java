import javax.swing.*;
import java.awt.*;

public class Main {
   public static void main(String[] args) {//       JFrame frame = new JFrame("Conversor de Monedas");

      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(500,250);
      frmMain window = new frmMain();
      frame.setContentPane(window.getjPanelPrincipal());
      frame.setVisible(true);
      //       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//       frame.setSize(500,500);
//       JLabel label = new JLabel("Bienvenido");
//       JButton btn1 = new JButton("Boton 1");
//       JButton btn2 = new JButton("Boton 2");
//       JButton btn3 = new JButton("Boton 3");
//       JButton btn4 = new JButton("Boton 4");
//       frame.add(btn1, BorderLayout.NORTH);
//       frame.add(btn2, BorderLayout.SOUTH);
//       frame.add(btn3, BorderLayout.EAST);
//       frame.add(btn4, BorderLayout.WEST);
//       frame.add(label,BorderLayout.CENTER);
//       frame.setVisible(true);

   }
}
