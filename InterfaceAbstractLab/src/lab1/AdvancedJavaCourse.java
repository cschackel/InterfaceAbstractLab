package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends Course{
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber, double credits, String prerequsites) {
        super(courseName,courseNumber,credits);
        setPrerequisites(prerequsites);
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    public String toString()
    {
        return super.toString() + "\nPrerequisites: " + prerequisites;
    }
}
