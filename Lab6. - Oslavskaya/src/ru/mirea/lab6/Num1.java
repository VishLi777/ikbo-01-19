/*
1. Реализуйте игру-угадайку, которая имеет одно текстовое поле и
одну кнопку. Он предложит пользователю угадать число между 0-20 и
дает ему три попытки. Если ему не удастся угадать, то будет выведено
сообщение, что пользователь допустил ошибку в угадывнии и что
число меньше / больше. Если пользователь попытался три раза угадать,
то программу завершается с соответствующим сообщением. Если
пользовательугадал, то программа должна тоже завершаться с
соответствующим сообщением.
 */

package ru.mirea.lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Num1 extends JFrame{

    private JTextField numberField;
    private int randNumber;
    private int attempts_left = 3;


    public Num1() {
        setLayout(null);
        setTitle("Game");
        setMinimumSize(new Dimension(500, 500));
        setSize(700, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel startLabel = new JLabel();
        startLabel.setBounds(90, 80, 400, 40); // поле guess number
        startLabel.setText("Guess the number from 0 to 20");
        startLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));//шрифт и размер текста
        add(startLabel);

        Random random = new Random();
        randNumber = random.nextInt(21);
        System.out.println(randNumber);

        numberField = new JTextField();
        numberField.setBounds(170, 150, 150, 40); //поле вставки числа
        numberField.setFont(new Font("Times New Roman", Font.BOLD, 27));//шрифт и размер текста
        add(numberField);

        JLabel messageLabel = new JLabel();
        messageLabel.setVisible(false);
        add(messageLabel);

        JButton tryButton = new JButton("Try!");
        tryButton.setBounds(170, 200, 150, 50);
        add(tryButton);
        tryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int userNum = Integer.parseInt(numberField.getText());
                if (userNum == randNumber) {
                    messageLabel.setBounds(195, 270, 400, 30); //поле текста состояния игры
                    messageLabel.setFont(new Font("Times New Roman", Font.BOLD, 29));//шрифт и размер текста
                    messageLabel.setText("Winning!");
                    messageLabel.setVisible(true);
                    tryButton.setVisible(false);
                    remove(tryButton);

                } else {
                    if (attempts_left > 1) {
                         if (userNum < randNumber) {
                             messageLabel.setText("");
                            JOptionPane.showMessageDialog(null, "More than " + userNum);
                         } else {
                             messageLabel.setText("");
                             JOptionPane.showMessageDialog(null, "Less than " + userNum);
                         }
                        attempts_left--;
                        messageLabel.setBounds(90, 280, 400, 35);
                        messageLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
                        messageLabel.setText("You didn't guess. Attempts left: " + attempts_left);
                        messageLabel.setVisible(true);

                    } else {
                        messageLabel.setBounds(190, 280, 400, 35);
                        messageLabel.setFont(new Font("Times New Roman", Font.BOLD, 29));
                        messageLabel.setText("Game over");
                        messageLabel.setVisible(true);
                        tryButton.setVisible(false);
                        remove(tryButton);
                    }
                }
            }
        });


        pack();
        setVisible(true);
    }


    public static void main(String[] args) {
        new Num1();
    }
}
