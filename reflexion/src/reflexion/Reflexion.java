package reflexion;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.sql.Ref;
import java.util.Date;

class Base {
    private int first;
    public int second;
    private void methodPrivateB(){};
    public void methodPublicB(){};
    private static void methodStaticPrivateB(){};
    public static void methodStaticPublicB(){};
}

public class Reflexion extends Base{

    private int numericValue;
    protected String str;
    double price;
    public Date date;

    private void methodPrivate(){};
    public void methodPublic(){};
    private static void methodStaticPrivate(){};
    public static void methodStaticPublic(){};

    public static void main(String[] args) throws Exception{

        // récupérer donnees à partir d'une instance
//        Reflexion objet = new Reflexion();
//        Class<?extends Reflexion> meta2 = objet.getClass();
/*
        // recuperer donnees à partir de la class
        Class<Reflexion> meta = Reflexion.class;
//        Field [] field = meta.getFields();  // recuperer les attributs public de la class et class fille
        Field [] field = meta.getDeclaredFields(); // recuperer tous les attributs de la class sans les class fille

        for (Field f: field) {
            System.out.printf("name : %s, type : %s, primitive %b\n",
                    f.getName(),
                    f.getType().getName(),
                    f.getType().isPrimitive()
                    );
        }
*/

/*
        // recuperer tous les attributs de la class et class fille
        Class<?> meta = Reflexion.class;
        while(true) {
            System.out.println(meta.getName());

            Field [] f = meta.getDeclaredFields();
            for (Field field : f){
                System.out.printf("name : %s, type : %s, primitive %b\n",
                        field.getName(),
                        field.getType().getName(),
                        field.getType().isPrimitive()
                );
            }

            meta = meta.getSuperclass();
            if(meta == null)break;
        }
*/
        // recuperer metadonnees des methodes de la class
        Class<Reflexion> meta = Reflexion.class;
        Method [] m = meta.getDeclaredMethods();
        System.out.println(meta.getName());

        for (Method met : m){
            System.out.printf("visibilitée : %s, name : %s, type : %s\n",
                    Modifier.toString(met.getModifiers()),
                    met.getName(),
                    met.getReturnType().getName());

        }

    }

}
