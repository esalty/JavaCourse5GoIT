package module10;

/**
 * Created by GodMod on 2/9/2017.
 */
public class MyException extends Exception {


    String massegeException;

    MyException(String ex) {
        this.massegeException = ex;
    }
    public String getMassegeException() {
        return massegeException;
    }
}
