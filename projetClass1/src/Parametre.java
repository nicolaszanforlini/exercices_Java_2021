


public class Parametre {


    public static int somme(int [] t){
        int sum = 0;
        for (int i : t){
            sum+=i;
        }
        return sum;
    }

    public static int somme2(int ... val){
        int sum2 = 0;
        for (int i : val){
            sum2+=i;
        }
        return sum2;
    }

    public static int mini(int ... val){
        int m = val[0];
        for (int i : val){
            if(i<m) {
                m = i;
                }
            }
        return m;
        }



    public static void main(String[] args) {

        int [] tab = {2,1,4};
        System.out.println(somme(tab));
        System.out.println(somme2(4,6,2));
        System.out.println(mini(4,8,1));


    }
}
