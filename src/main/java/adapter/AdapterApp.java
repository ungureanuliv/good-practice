package adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterApp {

    public static void main(String[] args) {

        List<Integer> results = new ArrayList<>();
        results.add(10);
        results.add(8);

        Student student1 = new BasicStudent("John Doe", "john@google.com", true, results);

        List<Student> students = new ArrayList<>();

        students.add(student1);

        //

        int[]grades = new int[] {9,9,6};

        Pupil pupil1 = new Pupil();
        pupil1.setFirstName("Jane");
        pupil1.setLastName("Doe");
        pupil1.setAge(19);
        pupil1.setEmail("jane@google.com");
        pupil1.setGrades(grades);

        students.add(new PupilAdapter(pupil1)); // doesn't work....
        for (Student s:students){
            System.out.println(s.getFullName());
        }
    }
}
