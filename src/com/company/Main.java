package com.company;

public class Main {

    public static void main(String[] args) {
        freeTime(32,43);
        freeTime(10, 21);
        freeTime(30, 11);
        freeTime(61, -9);
        freeTime(17, -17);
    }
    public static void freeTime(int age, int temperature) {
        if ((age > 20 && age < 45) && (temperature > -20 && temperature < 30)) {
            System.out.println(" Можно идти гулять ");
            return;
        }
        if (age < 20 && (temperature > 0 && temperature < 20)) {
            System.out.println(" Можно идти гулять ");
            return;
        }
        if (age > 45 && (temperature > -10 && temperature< 25)) {
            System.out.println(" Можно идти гулять ");
        }else {
            System.out.println(" Оставайтесь дома ");
        }
    }
}
