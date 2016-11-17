package module3;

/**
 * Created by GodMod on 11/17/2016.
 */
public class CollegeStudent extends Student {


    private String collegeName;
    private int rating;
    private long id;
    private String firstName;
    private String lastName;
    private int group;
    private Course[] coursesTaken;
    private int age;

    public CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public CollegeStudent(){

    }

    public CollegeStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
           }

    public CollegeStudent(String collegeName, int rating, long id) {
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }


    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCollegeName() {

        return collegeName;
    }

    public int getRating() {
        return rating;
    }

    public long getId() {
        return id;
    }


}
