package ru.mirea.lab10;
		/*Написать класс, который умеет хранить в себе массив любых типов
		данных (int, long etc.). Реализовать метод, который возвращает
		любой элемент массива по индексу.*/

public class AnyTypeArrTest {

    public static <E> void  s  (String str, E [] arr){

        E [] a = arr;
        AnyTapeArr <E> s = new AnyTapeArr <E> ();
        s.setArr(a);

        System.out.print(str + "  ");

        for(int i = 0; i< s.getLength(); i++)
            System.out.print(s.getArrIndex(i)+" ");

        System.out.println();
    }

    public static void main(String [] args){


        Integer [] integerArr = { 9, 8, 7, 6, 5, 1, 2, 3, 4,};
        s("Integer type" , integerArr );

        Double [] doubleArr = {1.7,1.56,7.9090};
        s("Double type" , doubleArr);

        String [] str = {"Good", "Morning","!"};
        s("String type" , str);
    }
}