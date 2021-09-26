package com.testNorit;

public class Homework1 {
    public static void main(String[] args) {

        byte bt = 3;
        short srt = 111;
        int in = 161161;
        long lg = 911911911;
        float ft = 3.14f;
        double db = 2.3;
        char cr = 91;
        boolean tre = true;
        String g = "geek";

        float a = 5.15f;
        float b = 6.1f;
        float c = 1.3f;
        float d = 23.3f;
        System.out.println(abcd(a, b, c, d));

        int w;
        int s;
        or(10,5);
        System.out.println("То, что сумма чисел w и s лежит в диапазоне от 10 до 20 является "+ or(10,5));  //В консоль выводится значение даже если удалить предыдущую строку, тогда что она именно делает? Вообще запутался)

        int r = 10;
        Positive(r); //Не понимаю, почему здесь метод спокойно вывелся, а в примере ниже для вывода нужно Sysoutprintln использовать

        System.out.println(Positive2(r));

        System.out.println(Positive3(r));

        String name = "Таня";
        HelloName(name);

        int age = 1100;
        AgeVis(age);

    }

    public static float abcd(float a, float b, float c, float d){
        float result = a * (b + (c / d));
        return result;
    }

    public static boolean or(int w, int s) {
        int sum = w + s;
        if (10 <= sum && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void Positive(int r) {
        if (r >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }

    }

    public static boolean Positive2(int r) {
        if (r >= 0) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean Positive3(int r) {
        return r>=0;
    }

    public static void HelloName(String name){
        System.out.println("Привет, "+name+"!");
    }

    public static void AgeVis(int age) {
        int age1 = age%4;
        int age2 = age%400;
        int age3 = age%100;
        int age4 = age%1000;
        if (age4 == 0){
            System.out.println("Год високосный");
        }else if (age2 == 0) {
            System.out.println("Год високосный");
        }else if (age3 == 0) {
            System.out.println("Год не високосный");
        }else if (age1 == 0) {
            System.out.println("Год високосный");
        }else {
            System.out.println("Год не високосный");
        }
    }

}
