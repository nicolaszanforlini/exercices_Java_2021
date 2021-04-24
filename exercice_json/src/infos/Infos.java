package infos;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Infos {

    private String prenom;
    private String nom;
    private String mail;
    private String age;
    public static String stri = "Hello test static";

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getAge() {
        return age;
    }
    public String getMail() {
        return mail;
    }

    public boolean verifInfoNom(Infos info) {
        String regexNomPrenom = "^[A-Za-z]+$";
        Pattern patternNomPrenom = Pattern.compile(regexNomPrenom);
        Matcher matchNom = patternNomPrenom.matcher(info.nom);
        boolean boolNom = matchNom.matches();
        if ( !boolNom ) System.out.println("nom invalid, recommencer");
        return boolNom;
    }

    public boolean verifInfoPrenom(Infos info) {
        String regexNomPrenom = "^[A-Za-z]+$";
        Pattern patternNomPrenom = Pattern.compile(regexNomPrenom);
        Matcher matchNom = patternNomPrenom.matcher(info.nom);
        boolean boolPrenom = matchNom.matches();
        if ( !boolPrenom ) System.out.println("prenom invalid, recommencer");
        return boolPrenom;
    }

    public boolean verifInfoAge(Infos info) {
        String regexAge = "^[1-9]+$";
        Pattern patternAge = Pattern.compile(regexAge);
        Matcher matchAge = patternAge.matcher(info.age);
        boolean boolAge = matchAge.matches();
        if ( !boolAge ) System.out.println("age invalid, recommencer");
        return boolAge;
    }

    public boolean verifInfoMail(Infos info) {
        String regexMail = "^[A-Za-z0-9\\._]+@[\\w]+\\.[a-z]{2,3}$";
        Pattern patternMail = Pattern.compile(regexMail);
        Matcher matchMail = patternMail.matcher(info.mail);
        boolean boolMail = matchMail.matches();
        if ( !boolMail ) System.out.println("mail invalid, recommencer");
        return boolMail;
    }

    public String scanInfos () {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        return s;
    }

    public void writeJson (Infos i) throws FileNotFoundException {

        String file = "./data.json";

        try ( PrintWriter print = new PrintWriter( file ) ) {
            print.print("{\n\t\"nom\": \"" + i.nom + "\",\n");
            print.print("\t\"prenom\": \"" + i.prenom + "\",\n");
            print.print("\t\"age\": \"" + i.age + "\",\n");
            print.print("\t\"mail\": \"" + i.mail + "\"\n}");
        }
    }
    public static void affiche (String s) {
        System.out.println(s);
    }

}
