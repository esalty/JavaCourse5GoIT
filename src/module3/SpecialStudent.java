package module3;

/**
 * Created by GodMod on 11/17/2016.
 */
public class SpecialStudent extends CollegeStudent {
    private long secretKey;
    private String email;

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);

    }
    public SpecialStudent(String lastName, Course[] coursesTaken) {

        super(lastName, coursesTaken);
    }

    public SpecialStudent(long secretKey) {
        this.secretKey = secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getSecretKey() {

        return secretKey;
    }

    public String getEmail() {
        return email;
    }


}
