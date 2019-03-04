package lab2;

import lab1.AdvancedJavaCourse;
import lab1.Course;
import lab1.IntroJavaCourse;
import lab1.IntroToProgrammingCourse;

public class StartUp {

    public static void main(String[] args)
    {
        Course[] courses = {
                 new IntroJavaCourse("Java 1", "0118999", 2,"Basic Knowledge"),
                new IntroToProgrammingCourse("Prog 1", "757832", 2.5),
                new AdvancedJavaCourse("Java 10", "6678765", 3, "Dino Hunting"),
        };

        for(int i=0;i<courses.length;i++)
        {
            System.out.println(courses[i]);
        }

        /*
        This kind of implementation with interfaces prevents sub-classes from accidentally inheriting code that may not
        apply to them, because they only provide the methods and outputs, and requires each thing that implements it to
        write its own code and satisfy the requirements however it sees fit. Thus, each class' code is specifically built
        for that class and will definitely apply.

         */

        //Using the substitution is good when you want to use only attributes of the parent class, or if you are collecting
        //multiple child objects of that parent. It is not good if you need to access methods and properties of the child.
    }
}
