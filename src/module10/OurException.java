package module10;

/**
 * Created by GodMod on 2/9/2017.
 */
public class OurException extends Throwable {
    String massegeException;

    OurException (String ex) {
        this.massegeException = ex;
    }
    public String getMassegeException() {
        return massegeException;
    }
}
