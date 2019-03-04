package lab1;

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
        After the changes this hiracrchy is much more efficient as the sheer ammount of code that had to be written is
        signifigantly smaller than at the beginning. If the credit options for all courses changed, then the change would
        only need to be implemented in one place and would apply to all classes.

         */

        //Using the substitution is good when you want to use only attributes of the parent class, or if you are collecting
        //multiple child objects of that parent. It is not good if you need to access methods and properties of the child.
    }
}
