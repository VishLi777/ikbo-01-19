/*ЗАДАНИЯ.
        Напишите программу в виде консольного приложения, которая
        моделирует карточную игру «пьяница» и определяет, кто выигрывает. В игре
        участвует 10 карт, имеющих значения от 0 до 9, большая карта побеждает
        меньшую; карта «0» побеждает карту «9».
        Карточная игра “ В пьяницу”. В этой игре карточная колода раздается
        поровну двум игрокам. Далее они открывают по одной верхней карте, и тот, чья
        карта старше, забирает себе обе открытые карты, которые кладутся под низ его
        колоды. Тот, кто остается без карт, - проигрывает.
        Для простоты будем считать, что все карты различны по номиналу и что
        самая младшая карта побеждает самую старшую карту (“шестерка берет туз”).
        Игрок, который забирает себе карты, сначала кладет под низ своей колоды
        карту первого игрока, затем карту второго игрока (то есть карта второго игрока
        оказывается внизу колоды).
        Входные данные.
        Программа получает на вход две строки: первая строка содержит 5 карт
        первого игрока, вторая - 5 карт второго игрока. Карты перечислены сверху вниз,
        то есть каждая строка начинается с той карты, которая будет открыта первой.
        Выходные данные.
        Программа должна определить, кто выигрывает при данной раздаче, и
        вывести слово first или second, после чего вывести количество ходов, сделанных
        до выигрыша. Если на протяжении 106 ходов игра не заканчивается, программа
        должна вывести слово botva.
 */

package ru.mirea.pract7;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main (String[] args){
        System.out.println("First");
        Scanner in = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();
        String text;
        while (true) {
            System.out.println(" 1.Add an item to the stack \n " +
                    " 2.Remove an item from the stack " +
                    "\n 3.Print the stack to the console " +
                    "\n 4.Finish work with stack \n");
            int option = in.nextInt();
            switch(option) {
                case'1':
                    text = in.nextLine();
                    stack.add(text);
                break;
                case '2':
                    stack.pop();
                break;
                case '3':
                    for (int i = 0; i< stack.size(); i++){
                        System.out.println(stack.pop());
                    }
                break;
                case '4':
                    break;

        }
        System.out.println();
        System.out.println("Second");
        ArrayQueue<String> queue = new ArrayQueue<String>(5);
        queue.add("Hello");
        System.out.println(queue.get(0));
        System.out.println("Third");
        ArrayDeque<String> deque = new ArrayDeque<String>();
        deque.add("Hello");
        deque.add("Bye");
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println("Drunkard");
        Stack<Integer> firstDeck = new Stack<Integer>();
        Stack<Integer> secondDeck = new Stack<Integer>();

        for (int i = 0; i < 5; i++){
            firstDeck.add(in.nextInt());
        }

        for (int i = 0; i < 5; i++){
            secondDeck.add(in.nextInt());
        }

        int firstCard;
        int secondCard;
        int counter=0;

        while (counter != 106){
            counter++;
            if (firstDeck.empty() || secondDeck.empty())
                break;
            firstCard = firstDeck.pop();
            secondCard = secondDeck.pop();
            if (firstCard > secondCard || (firstCard == 0 && secondCard == 9)){
                firstDeck.add(firstCard);
                firstDeck.add(secondCard);
            }
            else{
                secondDeck.add(firstCard);
                secondDeck.add(secondCard);
            }
        }
        /*------------------*/
        if(firstDeck.empty()){
            System.out.println("Second win");
        }
        else{
            System.out.println("First win");
        }

        /*------------------*/
        if (counter != 106) {
            System.out.println(counter);
        }
        else{
            System.out.println("botva");
        }
        in.close();
    }
}