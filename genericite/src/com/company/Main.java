package com.company;

import geneicite.GeneriqueBox;

public class Main {

    public static void main(String[] args) {

        System.out.println("==================================");
        GeneriqueBox<String> box = new GeneriqueBox<>("Toto");
        System.out.println( box.getElement() );
    }
}
