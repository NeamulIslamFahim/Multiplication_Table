package multiplication_table;

import javax.swing.JFrame;

public class Multiplication_Table {

    public static void main(String[] args) {
        MX_Table f = new MX_Table();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(500, 200, 600, 800);
        f.setResizable(false);
        f.setTitle("Multiplication Table");

    }

}
