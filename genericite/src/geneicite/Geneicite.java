package geneicite;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


class Person {
    String nom;
    String prenom;
    int code;

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String p) {
        this.prenom = p;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public Person(String n, String p, int c){
        setNom(n);
        setPrenom(p);
        setCode(c);
    }
}


public class Geneicite {

    public static void main(String[] args) {

        ArrayList<String> collect = new ArrayList<String>();
        collect.add("toto");
        collect.add("nico");
        collect.add("cart");

        for (String o : collect){
            System.out.println( o.toUpperCase() );
        }

        System.out.println("==============================================");

        ArrayList<Date> date = new ArrayList<Date>();
        date.add( new Date());

        for (Date d : date){
            System.out.println( d );
        }

        System.out.println("==============================================");

        HashMap<String, Person> map = new HashMap<>();
        map.put("p1", new Person("Cart", "man", 77));
        map.put("p2", new Person("Zanfo", "nico", 99));
        map.put("p3", new Person("Tag", "jho", 56));


        for (String s : map.keySet()){
            Person p = map.get(s);
            System.out.println( s + " : " + p.nom + " " + p.prenom + " " + p.code);
        }

    }
}
