package module10;

/**
 * Created by GodMod on 2/9/2017.
 */
public class ExceptionType2 extends Exception {


    String massegeException;

    ExceptionType2(String ex) {
        this.massegeException = ex;
    }
    public String getMassegeException() {
        return massegeException;
    }
}
