package ru.mirea.pract12;


public class PhoneNumber {
    final private String reg = "^((\\+\\d{11})|(\\d{11}))$";
    final private String codeCountry;
    final private String codeOperator;
    final private String pref;
    final private String number;


    public PhoneNumber(String string) {
        if (string.matches(reg)) {
            if (string.length() == 12) {
                codeCountry = String.valueOf(string.charAt(1));
                codeOperator = string.substring(2, 5);
                pref = string.substring(5, 8);
                number = string.substring(8, 12);
                return;
            }
            codeCountry = String.valueOf((Integer.parseInt(String.valueOf(string.charAt(0))) - 1));
            codeOperator = string.substring(1, 4);
            pref = string.substring(4, 7);
            number = string.substring(7, 11);
            return;
        }
        throw new IllegalStateException("Wrong data");
    }

    @Override
    public String toString(){
        return String.format("+%s%s-%s-%s", codeCountry, codeOperator, pref, number);
    }

}

