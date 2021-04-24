package unittest;


import java.lang.reflect.Field;


// pour faire les test assert : aller dans console, se positionner dans le repertoire et faire "java -ea Sut.java"
// s'il y a une erreur la console le renverra

public class Sut {

    private boolean elem = false;

    public boolean methode(boolean input){
        elem = true;
        return ! input;
    }


    public static void main(String[] args) throws Exception{

        Sut s = new Sut();
        boolean result = s.methode(true);
        assert result == false;

        Class<Sut> meta = Sut.class;
        Field probe = meta.getDeclaredField("elem");
        boolean value = probe.getBoolean(s);
        assert value == true;
    }

}
