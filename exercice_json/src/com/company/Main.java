package com.company;
import infos.Infos;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import bdd.Bdd;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, SQLException {

        Infos info = new Infos();

        String nom;
        String prenom;
        String age;
        String mail;

        boolean boolPrenom = false;
        boolean boolNom = false;
        boolean boolAge = false;
        boolean boolMail = false;

        while (!boolNom) {
            System.out.print("entrer votre nom : ");
            nom = info.scanInfos();
            info.setNom(nom);
            boolNom = info.verifInfoNom(info);
        }
        while (!boolPrenom) {
            System.out.print("entrer votre prenom : ");
            prenom = info.scanInfos();
            info.setPrenom(prenom);
            boolPrenom = info.verifInfoPrenom(info);
        }
        while ( !boolAge ) {
            System.out.print("entrer votre age : ");
            age = info.scanInfos();
            info.setAge(age);
            boolAge = info.verifInfoAge(info);
        }
        while ( !boolMail ) {
            System.out.print("entrer votre mail : ");
            mail = info.scanInfos();
            info.setMail(mail);
            boolMail = info.verifInfoMail(info);
        }
        if (boolAge && boolMail && boolNom && boolPrenom){
            System.out.println("Save Data");
            System.out.println("nom : " + info.getNom());
            System.out.println("prenom : " + info.getPrenom());
            System.out.println("age : " + info.getAge());
            System.out.println("mail : " + info.getMail());
        }

        info.writeJson(info);

        //================================================================

        // mot clé "static" permet d'avoir acces aux méthode et attributs "static" sans creer d'instance

        Infos.affiche(Infos.stri);

        //=================================================================

        // base de donnees

        System.out.println("Inserer les informations dans la base de données ? ");
        String stringDemandeBdd = "empty";
        boolean response = false;

        while ( !response ){
            System.out.print("yes / no   : ");
            stringDemandeBdd = Bdd.demandeInsertion();
            if (stringDemandeBdd.contains("yes")) {
                Bdd.startBdd();
                Bdd.insertInfos(info);
                response = true;
            }else if(stringDemandeBdd.contains("no")){
                System.out.println("données non insérées...");
                response = true;
            }else{
                System.out.println("invalid caractère, recommencez...");
                response = false;
            }
        }



    }



}
