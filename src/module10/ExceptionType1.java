package module10;

/**
 * Created by GodMod on 2/9 /2017.
 */
public class ExceptionType1 extends Exception {


    String massegeException;

    ExceptionType1(String ex) {
        this.massegeException = ex;
    }
    public String getMassegeException() {
        return massegeException;
    }
}
