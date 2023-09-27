package adapter;

import java.util.ArrayList;
import java.util.List;

public class PupilAdapter implements Student { // 2.implement the interface of the new model (Student in our case)

    private final Pupil pupil;
    // 1. declare a constructor that accepts a param of "old type" (Pupil in our case)

    public PupilAdapter(Pupil pupil) {
        this.pupil = pupil;
    }

    // 3. This are the methods that allow us to pull out info from adapter in the new model
    // 4. Implement the actual logic, from the old model to the new model
    @Override
    public String getFullName() {
        return pupil.getFirstName() + " " + pupil.getLastName();
    }

    @Override
    public String getContactDetail() {
        return pupil.getEmail();
    }

    @Override
    public boolean isAdult() {
        if (pupil.getAge() > 18) {
            return true;
        } else
            return false;
    }


    @Override
    public List<Integer> getResults() {
        List<Integer> results = new ArrayList<>();
        for (int grade : pupil.getGrades()) {
            results.add(grade);
        }
        return results;
    }
}
