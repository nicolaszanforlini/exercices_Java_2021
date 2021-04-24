package com.company;
import exception_test.Exception_test;
import division.Division;

public class Main {

    public static void main(String[] args) {

        int nba = 10;
        int nbb = 2;
        int nbc = 0;

        Division d = new Division(nba, nbb);
        Division err = new Division(nba, nbc);

        d.division();
        System.out.println("=====================================");

        err.division();
        System.out.println("=====================================");

        int n = 20;
        int den = 0;

        if (den == 0){
            // appel au constructeur sans message
            throw new Exception_test();
        }else{
            System.out.println(n + "/" + den);
            System.out.println(n/den);
        }

    }

}
