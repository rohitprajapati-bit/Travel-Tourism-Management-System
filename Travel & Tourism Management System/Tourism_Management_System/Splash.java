package Tourism_Management_System;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Splash extends JFrame implements Runnable {

    Thread thread;

    Splash() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icons = new JLabel(i3);
        add(icons);

        setVisible(true);

        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        try {
            Thread.sleep(7000);
            setVisible(false);
            new Login();

        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        Splash frame = new Splash();

        int x = 1;
        for (int i = 1; i <= 550; x += 7, i += 6) {
            frame.setLocation(650 - (x + i) / 2, 350 - (i / 2));
            frame.setSize(x + i, i);
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

    }
}