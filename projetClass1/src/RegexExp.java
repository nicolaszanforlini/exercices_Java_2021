import java.io.*;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExp {

    public static boolean verifMail(String s){
        String exp = "^[\\w.-]+@[A-Za-z0-9._-]+\\.[a-z]{2,}$";
        return s.matches(exp);
    }

    public static boolean verifDate(String s){
        String exp = "^(0[1-9]|[1-2][0-9]|3[0-1])\\/(0[1-9]|1[0-2])\\/[12][0-9]{3}$";
        return s.matches(exp);
    }




    public static void main(String[] args) throws IOException, InterruptedException {

        String mail = "toto@hiu.fr";
        System.out.println(verifMail(mail));
        String date = "04/12/1985";
        System.out.println(verifDate(date));
        System.out.println("=========================================1");

        String str = "toto -hello . val";
        String [] t = str.split("[\\s]");
        System.out.println(t[0]+" : "+t[1]+" : "+t[3]);
        for (String s : t) {
            System.out.println(s);
        }

        System.out.println("=========================================2");

        String stri = "<html>blabla</html><b id= test>rerere</b>";
        String reg = "<(.+?)>";
        StringBuilder tab = new StringBuilder();

        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(stri);

        while(m.find()){
            tab.append(m.group(1)+" ");
        }
        System.out.println(tab.toString());

        System.out.println("=========================================3");

        StringBuffer sb = new StringBuffer();
        Process process = Runtime.getRuntime().exec("ifconfig");
        process.waitFor();

        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

        String line = "";
        while ((line = reader.readLine())!= null) {
            sb.append(line + "\n");
        }
        System.out.println(sb.toString());

    }
}
