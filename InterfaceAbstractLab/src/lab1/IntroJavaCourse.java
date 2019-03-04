package lab1;

import javax.swing.*;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends  Course {
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        super(courseName,courseNumber,credits);
        setPrerequisites(prerequisites);
    }



    final public String getPrerequisites() {
        return prerequisites;
    }

    final public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            System.out.println("Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    public String toString()
    {
        return super.toString() + "\nPrerequisites: " + prerequisites;
    }

}
