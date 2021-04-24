
import hello1.Hello;
import helloNicolas.Nicolas;

import java.io.File;
import java.util.Date;

public class Main {


    public static void main(String[] args) {
        System.out.println("==================================================");
        Hello h = new Hello();
        h.main();
        Nicolas n = new Nicolas();
        n.main();
        System.out.println("=================================================1");
        String s = "hello je suis nico";
        String [] mot = s.split(" ");
        for(int i = 0;i<mot.length;i++){
            String m = mot[i];
            System.out.print(m+" ");
        }
        int a;
        char c = 'A';
        a = (int) c;
        System.out.println();
        System.out.println("=================================================2");
        System.out.println(a);
        System.out.println((char)a);
        System.out.println("=================================================3\n");
        System.out.printf("%tF, %tT", new Date(), new Date());
        System.out.println("\n=================================================6\n");

        // parcourir un dossier et recupérer les infos "class File"

        File [] files = new File("/home/balibalibali/Téléchargements").listFiles();
        for(File elem : files){
            String name = elem.getName();
            Date date = new Date(elem.lastModified());
            // affichage du nom sur 67 caracteres sur la gauche et de la date et l'heure
            System.out.printf("%-67s : %tF %tT\n",name,date,date);
        }
        System.out.println("\n=================================================7");




    }
}
