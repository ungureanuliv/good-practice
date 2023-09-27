package adapter;

import java.util.List;

public class BasicStudent implements Student {

    private String fullName;
    private String contact;
    private boolean adult;
    private List<Integer> results;

    public BasicStudent(String fullName, String contact, boolean adult, List<Integer> results) {
        this.fullName = fullName;
        this.contact = contact;
        this.adult = adult;
        this.results = results;
    }

    @Override
    public String getFullName() {
        return fullName;
    }
    public String getContactDetail() {
        return contact;
    }

    @Override
    public boolean isAdult() {
        return adult;
    }

    @Override
    public List<Integer> getResults() {
        return results;
    }
}
