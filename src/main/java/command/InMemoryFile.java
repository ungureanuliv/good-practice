package command;

import java.util.ArrayList;
import java.util.List;

public class InMemoryFile {

    private String name;
    private List<String> linesContent = new ArrayList<>(); // this represents the whole file


    public InMemoryFile(String fileName) {

        this.name = fileName;
    }

    void append(String line) {

        linesContent.add(line);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(String line: linesContent) {
            sb.append(line);
            sb.append("\n");
        }
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public List<String> getLinesContent() {
        return linesContent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLinesContent(List<String> linesContent) {
        this.linesContent = linesContent;
    }

    //    public void removeEmptyLine() {
//        for(String line: linesContent) {
//            // check and remove empty lines
//        }
//    }
}
