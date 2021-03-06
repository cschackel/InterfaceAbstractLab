package lab2;

import javax.swing.*;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse implements  Course{
    String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String newCourseName, String newCourseNumber, double newCourseCredits, String preReq)
    {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
        setCredits(credits);
         setPrerequisites(preReq);
    }

    final public String getCourseName() {
        return courseName;
    }

    final public void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            System.out.println("Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    final public String getCourseNumber() {
        return courseNumber;
    }

    final public void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    final public double getCredits() {
        return credits;
    }

    final public void setCredits(double credits) {
        if(credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits=credits;
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
        return "Course Name: " + courseName + "\nCourse Number: " + courseNumber + "\nCredits: " + credits + "\nPrerequsites: " + prerequisites;
    }

    
}
