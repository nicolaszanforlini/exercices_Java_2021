package com.company;
import division.Division;

public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        Division d = new Division(a, b);
        d.division();

//=============================================================================
        // déclencher une exception
        int c = 4;
        if(c == 4){
            throw new RuntimeException("attention c = 4");
        }else{
            System.out.println("c différent de 4");
        }
//==============================================================================
    }
}
