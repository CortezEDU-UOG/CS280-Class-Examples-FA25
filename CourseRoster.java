import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CourseRoster {
    private String courseCode;
    private ArrayList<String> studentIds = new ArrayList<>();

    public CourseRoster(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void addStudentId(String id) {
        if (!id.matches("\\d\\d\\d\\d")) {
            throw new IllegalArgumentException("Id has to be 4 digits.");
        } else {
            studentIds.add(id);
            System.out.println("Student Id Added!");
        }
    }

    public ArrayList<String> getStudentIdsSnapshot() {
        return new ArrayList<>(studentIds);
    }

    public List<String> getStudentIds() {
        return Collections.unmodifiableList(studentIds);
    }


}
