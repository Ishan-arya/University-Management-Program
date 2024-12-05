package University.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {
    About(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/niet.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(350,0,300,200);
        add(img);

        JLabel heading = new JLabel("<html>Noida Institute Of Engineering and Technology</html>");
        heading.setBounds(70,20,300,130);
        heading.setFont(new Font("Tahoma", Font.BOLD,30));
        add(heading);

        JLabel name = new JLabel("This project is made by only using java " );

        name.setBounds(60,260,550,40);
        name.setFont(new Font("Tahoma", Font.BOLD,18));
        add(name);

        JLabel hcv = new JLabel("This program is made by Narendra, Adarsh and Om");

        hcv.setBounds(60,260,550,80);
        hcv.setFont(new Font("Tahoma", Font.BOLD,18));
        add(hcv);


        JLabel contact = new JLabel("0231cse149, "  +
                "0231cse217, "  +
                "0231cse029 ");
        contact.setBounds(70,340,550,40);
        contact.setFont(new Font("Tahoma", Font.BOLD,18));
        add(contact);

        setSize(700,500);
        setLocation(400,150);
        getContentPane().setBackground(new Color(252,228,210));
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        new About();
    }
}
