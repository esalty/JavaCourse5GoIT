package module3;

import java.util.Date;

/**
 * Created by GodMod on 11/17/2016.
 */
public class Solution {


    public static void main(String[] args) {
        Date startDate = new Date();
        Course c0 = new Course(startDate, "Geography");
        Course c1 = new Course(5, "Math", "John");
        Course c2 = new Course(2, "Programming", "Ada");
        Course c3 = new Course(startDate, "Literature");
        Course c4 = new Course(5, "Poetry", "Itan");
        Course c5 = new Course(5, "Language", "Valve");
        Course[] c = {c0, c1, c2, c3, c4, c5};
        Student s6 = new Student("Ivan", "Petrovcev", 5);
        Student s7 = new Student("Vasukov", c);
        CollegeStudent cs8 = new CollegeStudent("MIT", 90, 15577);
        CollegeStudent cs9 = new CollegeStudent("Rene", "Star", 9);
        CollegeStudent cs10 = new CollegeStudent("Ford", c);

        SpecialStudent ss11 = new SpecialStudent(12313l);
        SpecialStudent ss12 = new SpecialStudent("Bishop", c);
        SpecialStudent ss13 = new SpecialStudent("Roman", "Winter", 23);

        for (Course item : c) {
            System.out.println("Course name:" + item.getName());
            System.out.println("Course duration:" + item.getHoursDuration());
            System.out.println("Course teacher's name:" + item.getName());
            System.out.println("Course start date:" + item.getStartDate());
        }
        


    }
}
