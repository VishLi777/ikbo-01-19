package ru.mirea.pract4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIScore {

    static class Football extends JFrame {

        private int milanCounter = 0;
        private int madridCounter = 0;

        private JButton buttACMilan = new JButton("AC Milan");
        private JButton buttRealMadrid = new JButton("Real Madrid");
        private JLabel matchResult = new JLabel("Result: " + milanCounter + "X" + madridCounter);
        private JLabel lastScLabel = new JLabel("Last Scorer: N/A");
        private Label winnerLabel = new Label("Winner: N/A");

        Football() {
            super("score");
            setLayout(null);

            //задаём шрифт(Times new roman) и размеры надписей Result, Last Scorer, Winner
            matchResult.setFont(new Font("Times new roman", Font.PLAIN,35));
            lastScLabel.setFont(new Font("Times new roman", Font.PLAIN, 18));
            winnerLabel.setFont(new Font("Times new roman", Font.PLAIN, 20));

            //редактируем размеры кнопок, задаём координаты и параметры
            buttACMilan.setBounds(40, 230, 200, 75);
            buttRealMadrid.setBounds(300, 230, 200, 75);
            winnerLabel.setBounds(220, 17, 200, 20);
            matchResult.setBounds(200, 100, 200, 75);
            lastScLabel.setBounds(220, 150, 200, 20);



            add(buttACMilan);
            buttACMilan.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    milanCounter++;
                    lastScLabel.setText("Last scorer: AC Milan");
                    matchResult.setText("Result: " + milanCounter + "X" + madridCounter);
                    if (madridCounter == milanCounter)
                        winnerLabel.setText("Winner: DRAW");
                    else winnerLabel.setText(madridCounter > milanCounter ? "Winner: Real Madrid" : "Winner: AC Milan");
                }
            });

            add(buttRealMadrid);
            buttRealMadrid.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    madridCounter++;
                    lastScLabel.setText("Last scorer: Real Madrid");
                    matchResult.setText("Result: " + milanCounter + "X" + madridCounter);
                    if (madridCounter == milanCounter)
                        winnerLabel.setText("Winner: DRAW");
                    else winnerLabel.setText(madridCounter > milanCounter ? "Winner: Real Madrid" : "Winner: AC Milan");
                }
            });

            setSize(550, 550); //задаём размер открывающегося окна
            add(matchResult);
            add(lastScLabel);
            add(winnerLabel);
            setVisible(true);
        }
    }



}