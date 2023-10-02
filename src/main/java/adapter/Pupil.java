package adapter;

public class Pupil {
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;
    private int[] grades;

    public String getFirstName() {

        return firstName;
    }

    public Pupil setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {

        return lastName;
    }

    public Pupil setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {

        return email;
    }

    public Pupil setEmail(String email) {
        this.email = email;
        return this;
    }

    public Integer getAge() {

        return age;
    }

    public Pupil setAge(Integer age) {
        this.age = age;
        return this;
    }

    public int[] getGrades() {

        return grades;
    }

    public Pupil setGrades(int[] grades) {
        this.grades = grades;
        return this;
    }
}
