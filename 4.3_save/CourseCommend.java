
public class CourseCommend {
    public void AutoCourseCommend(double height, double weight){
        double BMI = weight / (height* height );
        if ( BMI > 30 ){
            System.out.println(" Weight deduction course");
        }
        else{
            if ( BMI > 20 ){
                System.out.println(" Shape building course");
            }
            else{
                System.out.println("Yoga course");
            }
        }
    }
}
