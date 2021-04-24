




public class Mathematique {

    public static int maxi(int a, int b){
        return a>b ? a : b;
    }

    public static int mini(int a, int b){
        return a<b ? a : b;
    }

    public static int power(int a, int b){
        int accu=1;
        for(int i=0;i<b;i++){
            accu*=a;
        }
        return accu;
    }



    public static void main(String[] args) {

        System.out.println(maxi(5,2));
        System.out.println(Mathematique.mini(8,3));
        System.out.println(Mathematique.power(4,1));
        System.out.println("=======================================1");



    }

}
