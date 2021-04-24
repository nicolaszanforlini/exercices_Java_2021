package com.company;


public class Start {

    private static int a;
    private static int b;
    private static int result;

    public Start(int a, int b){
        setStartA(a);
        setStartB(b);
    }

    private void setStartA(int a){
        Start.a = a;
    }
    private int getStartA(){
        return a;
    }
    private void setStartB(int b){
        Start.b = b;
    }
    private int getStartB(){
        return b;
    }

    public static int division(Start s){
        Start.result = a/ b;
        return Start.result;
    }


    public static void main(String[] args) {

        Start start = new Start(48, 4);

        System.out.println(division(start));
        System.out.println("============================================");

        Start start2 = new Start(26,2);
        System.out.println(division(start2));

    }


}
