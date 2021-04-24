package division;
import exception_test.Exception_test;


public class Division {

    private  int a;
    private  int b;

    public void setA (int a){
        this.a = a;
    }
    public void setB (int b){
        this.b = b;
    }

    public Division(int a, int b){
        this.setA(a);
        this.setB(b);
    }

    public void division(){
        try {
            int res = this.a / this.b;
            System.out.println(this.a + "/" + this.b);
            System.out.println(a / b);
        }catch(Exception e){
            System.out.println(this.a + "/" + this.b);
            System.out.println("erreur b = 0, changement de b = 4");
            this.b = 4;
            System.out.println(this.a + "/" + this.b);
            System.out.println(this.a/this.b);
        }

    }



}
