package dry;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private int age;

    private static List<String> students = new ArrayList<>();

    public void attendCourse() {
        validateStudent();

        // do the actual logic to attend the course


    }

    public void takeTest() {
        validateStudent();
        // let the user take the test...

    }

    private void validateStudent() {
        if (!students.contains(this.name)) {
            throw new RuntimeException("Student is not enrolled in course!");
        }
    }
}

