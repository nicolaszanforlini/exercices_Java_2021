import helloNicolas.Nicolas;


public class Suite {

    public static void main(String[] args) {

        int [] tab1 = {2,6,8,5,6};
            for(int i : tab1){
                System.out.println(i);
            }

        System.out.println("=====================================1");
        int a = 19;
        int b = 35;
        boolean checka = (a < 10 || a > 30);
        boolean checkb = (b < 10 || b > 30);
        if (checka){
            System.out.println("attention chiffre non compris entre 10 et 30");
        }else if(!checka){
            System.out.println("Ok");
        }
        if(checkb){
            System.out.println("attention chiffre non compris entre 10 et 30");
        }else if(!checkb) {
            System.out.println("Ok");
        }
        System.out.println("=====================================2");

        assert args.length == 2 : "longeur non egal à 2";
        System.out.println(args.length);

    }
}
