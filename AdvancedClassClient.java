import java.util.ArrayList;
import java.util.List;

public class AdvancedClassClient {
    public static void main(String[] args) {
        CourseRoster roster = new CourseRoster("CS280");
        roster.addStudentId("1234");
        ArrayList<String> courseStudentIds = roster.getStudentIdsSnapshot();
        List<String> courseStudentIds2 = roster.getStudentIds();

        courseStudentIds.add("Something");
        courseStudentIds.add("Something else");
        System.out.println(courseStudentIds);
        System.out.println(courseStudentIds2);

        System.out.println(roster.getStudentIdsSnapshot());
 
        roster.addStudentId("0002");
        System.out.println(courseStudentIds);
        System.out.println(courseStudentIds2);

        System.out.println(roster.getStudentIdsSnapshot());
    }
}
