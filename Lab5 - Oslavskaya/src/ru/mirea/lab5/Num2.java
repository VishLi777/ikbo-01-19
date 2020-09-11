package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;


public class Num2 extends JFrame {
    public Num2(String path) {
        setTitle("picture");//название окна
        setLayout(null); //бесцветный фон

        setMinimumSize(new Dimension(1000, 1000));
        setSize(1000, 500); // размер  окна
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon(path); //путь к картинке
        JLabel imgLabel = new JLabel(icon);


        imgLabel.setBounds(150, 30, 800, 800);//границы картинки
        add(imgLabel);
        pack();
        setVisible(true); // чтобы было видно картинку(делаем её видимой)
    }
}
//C:\Users\lidao\Pictures\Видеопроекты\IMG_20200313_124104.jpg
//C:\Users\lidao\Pictures\Видеопроекты\IMG_20200313_134744.jpg