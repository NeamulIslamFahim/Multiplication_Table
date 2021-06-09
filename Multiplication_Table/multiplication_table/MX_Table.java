package multiplication_table;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class MX_Table extends JFrame implements ActionListener {

    private Container c;
    private JLabel label, label2, label3;
    private JPanel panel;
    private ImageIcon img;
    private Font f, f2, f3, f4;
    private JTextArea ta;
    private JTextField tf;
    private JButton btn;

    MX_Table() {
        components();
    }

    public void components() {
        c = this.getContentPane();
        c.setLayout(null);
        label2 = new JLabel("Made by Neamul_Islam_Fahim");
        label2.setBounds(400, 740, 180, 20);
        f2 = new Font("SERIF", Font.HANGING_BASELINE, 18);
        c.setBackground(Color.MAGENTA);
        c.setFont(f2);
        c.add(label2);
        
        img = new ImageIcon(getClass().getResource("MX.png"));
        this.setIconImage(img.getImage());

        f = new Font("Arial", Font.ROMAN_BASELINE, 25);
        f3 = new Font("Serif", Font.BOLD, 20);
        f4 = new Font("Times New Roman", Font.TYPE1_FONT, 20);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(10, 10, 575, 730);
        panel.setBackground(Color.CYAN);
        panel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        c.add(panel);

        label = new JLabel("Multiplication Table");
        label.setBounds(170, 20, 300, 50);
        label.setForeground(Color.BLUE);
        label.setFont(f);
        panel.add(label);

        ta = new JTextArea();
        ta.setBounds(10, 100, 300, 600);
        ta.setFont(f4);
        panel.add(ta);

        label3 = new JLabel("Enter any number");
        label3.setBounds(350, 100, 200, 50);
        label3.setFont(f3);
        panel.add(label3);

        tf = new JTextField();
        tf.setBounds(400, 150, 100, 50);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setFont(f4);
        panel.add(tf);

        btn = new JButton("Clear");
        btn.setBounds(400, 220, 100, 50);
        panel.add(btn);

        btn.addActionListener(this);
        tf.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String value = tf.getText();
        ta.setText("");
        if (value.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter number");
        } else {
            int n = Integer.parseInt(tf.getText());

            for (int i = 1; i <= 10; i++) {
                int res = n * i;

                String r = String.valueOf(res);
                String inc = String.valueOf(i);
                String num = String.valueOf(n);

                ta.append(num + "  X  " + inc + "  =  " + r + "\n\n");
            }
            ta.append("  \n***Thank you!!***");
        }
        if (ae.getSource().equals(btn)) {
            ta.setText("");
            tf.setText("");
        }

    }

    public static void main(String[] args) {

        MX_Table f = new MX_Table();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(500, 200, 600, 800);
        f.setResizable(false);
        f.setTitle("Multiplication Table");

    }

}
