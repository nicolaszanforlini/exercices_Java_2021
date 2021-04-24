package exception_test;

public class Exception_test extends RuntimeException {

    public Exception_test() {
        this("Erreur, division par 0");
    }

    public Exception_test(String message) {
        super(message);
    }


}
