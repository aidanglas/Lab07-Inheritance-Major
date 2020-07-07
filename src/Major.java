
import java.util.ArrayList;

/**
 * @author Aidan Glas
 */
public class Major extends AcademicProgram 
{
    private ArrayList<Course> ETMRequirements;

    
    public Major( String name, int minimumRequiredCredits, ArrayList<Course> requiredCourses, ArrayList<Course> ETMRequirements) 
    {
        super(name, minimumRequiredCredits, requiredCourses);
        this.ETMRequirements = ETMRequirements;
    }

    public Major() 
    {
        super();
        this.ETMRequirements = ETMRequirements;
        //this.ETMRequirements = new ArrayList<Course>(); DOnt use this
    }

    @Override
    public String toString() {
        return super.toString() + "Major{" + "ETMRequirements=" + ETMRequirements + '}' ;
    }

    public ArrayList<Course> getETMRequirements() {
        return ETMRequirements;
    }

    public void setETMRequirements(ArrayList<Course> ETMRequirements) {
        this.ETMRequirements = ETMRequirements;
    }

    
    
}
