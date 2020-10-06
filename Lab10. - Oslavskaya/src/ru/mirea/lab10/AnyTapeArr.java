package ru.mirea.lab10;

public class AnyTapeArr <E> {
    private E [] arr;

    public void setArr( E [] arr){
        this.arr =  arr;
    }
    public E getArrIndex(int i){
        return  arr[i] ;
    }

    public int getLength(){
        return  arr.length ;
    }

}