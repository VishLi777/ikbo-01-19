package ru.mirea.pract8;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        UnfairWaitList<String> strUnfairWaitList = new UnfairWaitList<>();
        System.out.println("UnfairWaitList is empty: " + strUnfairWaitList.isEmpty());
        strUnfairWaitList.add("Good");
        strUnfairWaitList.add("Morning");
        strUnfairWaitList.add("Guys");
        strUnfairWaitList.add("!");
        System.out.println("UnfairWaitList is empty: " + strUnfairWaitList.isEmpty());
        System.out.println("UnfairWaitList includes \"Good\": " + strUnfairWaitList.contains("Good"));
        System.out.println(strUnfairWaitList);
        System.out.println(strUnfairWaitList);
        strUnfairWaitList.moveToBack("New");
        System.out.print(strUnfairWaitList);
        System.out.println("------------------");
        System.out.println();

        WaitListI<Integer> wList = new BoundedWaitList<>(10);
        for (int i = 0; i < 10; i++) {
            wList.add((int) (Math.random() * 100 + 1));
        }
        System.out.println(wList);
        System.out.println("It includes 0: " + wList.contains(0));
        System.out.println("It includes 100: " + wList.contains(100));
        System.out.println("It is empty: " + wList.isEmpty());
        List<Integer> test = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            test.add((int) (Math.random() * 100 + 1));
        }
        System.out.println("It includes test-list: " + wList.containsAll(test));
        System.out.println();


    }
}