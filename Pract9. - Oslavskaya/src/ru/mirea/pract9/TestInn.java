package ru.mirea.pract9;



public class TestInn {
    public static void main(String[] args)
            throws UnacceptableInnException{
        Customer cust1 = new Customer("Marsel", "Aleksandrovich", "Volkov", "109876543210");
        System.out.println(cust1);
        System.out.println("----------------------");
        Customer cust22 = new Customer("Diana", "Romanovna", "Kim", "656857899907");
        System.out.println(cust22);
    }
}
