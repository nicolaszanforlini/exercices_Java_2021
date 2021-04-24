
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


class FinallyClose implements AutoCloseable {

    public FinallyClose(){
        System.out.println(" construction objet close");
    }

    @Override
    public void close() throws Exception {
        System.out.println("fichier close");
        }
}




public class Finally {


    public static void saveDataFinallyClose() throws Exception {
        try (FileOutputStream fos = new FileOutputStream("save.data")){
            fos.write("ok".getBytes());
        }
    }




    public static void main(String[] args) throws Exception{
        saveDataFinallyClose();
    }
}
