import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {

    JButton btnLogin;
    JButton btnCancel;
    JPanel panel;

    public static void main(String[] args) {
        Login gui = new Login();
        gui.createForm();
    }

    public void createForm() {
        JFrame frame = new JFrame("MyForm");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        JPanel panel = new JPanel();
        JLabel lblUsername = new JLabel("Username:");
        JLabel lblPassword = new JLabel("Password:");
        JTextField txtUsername = new JTextField(20);
        JTextField txtPassword = new JTextField(20);
        btnLogin = new JButton("Login");
        btnCancel = new JButton("Cancel");


        panel.add(lblUsername);
        panel.add(txtUsername);
        panel.add(lblPassword);
        panel.add(txtPassword);
        panel.add(btnLogin);
        panel.add(btnCancel);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(300, 300);

        implementBtnsAction();

    }

    private void implementBtnsAction() {
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
