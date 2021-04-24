package division;

public class Division {

    private int a;
    private int b;

    public  void setA(int a) {
        this.a = a ;
    }
    public  void setB(int b) {
        this.b = b ;
    }

    public Division(int a, int b){
        setA(a);
        setB(b);
    }

    public void division(){

        try{
            int r = a/b;
            System.out.println("resultat : " + r);
        }catch(Exception e){
            System.out.println("attention b = 0");
            e.printStackTrace();
        }
    }




}
