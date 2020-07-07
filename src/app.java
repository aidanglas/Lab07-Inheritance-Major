
import java.util.ArrayList;

/**
 * @author Aidan Glas
 */
public class app {

  
    public static void main(String[] args) 
    {
        Course c0;
        Course c1;
        Course c2;
        
        c0 = new Course();
        
        CourseName temp0 = new CourseName("Cyber", "100", "h");
        GenEd temp1 = new GenEdData().find("IL");
        CourseName temp2 = new CourseName();
        c1 = new Course(temp0, temp1, "Computer Systens Literacy", 3, 9, 99, temp2);
        
        CourseName temp3 = new CourseName("Cyber", "262", "");
        GenEd temp4 = new GenEdData().find("GS");
        CourseName temp5 = new CourseName();
        c2 = new Course(temp3, temp4, "Cyber-Defense Studio", 3, 9, 99, temp5);
        
        ArrayList<Course> requiredCourses = new ArrayList<Course>();
        requiredCourses.add(c0);
        requiredCourses.add(c1);
        requiredCourses.add(c2);
        
        
        Course c3;
        Course c4;
        Course c5;
        
        CourseName temp6 = new CourseName("COMM", "252", "d");
        GenEd temp7 = new GenEdData().find("US");
        CourseName temp8 = new CourseName();
        c3 = new Course(temp6, temp7, "Communications", 3, 7, 99, temp8);
        
        CourseName temp9 = new CourseName("ECON", "331", "f");
        GenEd temp10 = new GenEdData().find("GHW");
        CourseName temp11 = new CourseName();
        c4 = new Course(temp9, temp10, "IT Economics", 3, 6, 99, temp11);
        
        CourseName temp12 = new CourseName("ENG", "202", "b");
        GenEd temp13 = new GenEdData().find("GN");
        CourseName temp14 = new CourseName();
        c5 = new Course(temp12, temp13, "Technical Writing", 4, 8, 99, temp14);
        
        ArrayList<Course> ETMRequirements = new ArrayList<Course>();
        ETMRequirements.add(c3);
        ETMRequirements.add(c4);
        ETMRequirements.add(c5);

        Major m0;
        m0 = new Major( "Special Studies in Cyber Security", 
                c0.getCreditsMinPerCourse() + 
                c1.getCreditsMinPerCourse() + 
                c2.getCreditsMinPerCourse() + 
                c3.getCreditsMinPerCourse() + 
                c4.getCreditsMinPerCourse() + 
                c5.getCreditsMinPerCourse(), requiredCourses, ETMRequirements);
        
        System.out.println(m0);
    }
}
