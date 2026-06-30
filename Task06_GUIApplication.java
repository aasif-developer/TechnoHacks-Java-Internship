import javax.swing.*;
import java.awt.event.*;

public class Task06_GUIApplication {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Welcome Application");

        JButton button = new JButton("Click Me");

        button.setBounds(100, 70, 150, 40);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Welcome to TechnoHacks Internship!");
            }
        });

        frame.add(button);

        frame.setSize(350, 220);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}