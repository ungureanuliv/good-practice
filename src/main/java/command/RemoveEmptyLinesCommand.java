package command;

import java.util.ArrayList;
import java.util.List;

public class RemoveEmptyLinesCommand implements Command{  // 2. a real command
    private final InMemoryFile file;
    private List<String> originalContent;

    public RemoveEmptyLinesCommand(InMemoryFile file) { // 3. we need the "object" on which to run the command
        this.file = file;
    }


    @Override
    public void apply() {
        // we will iterate over all the lines, and when we
        // find a line that is not empty, we will add it to a list that contains only non-empty lines
        // finally, we will save the modified lines in the file.
        List<String> lines = file.getLinesContent();
        this.originalContent = lines;
        List<String> nonEmptyLines = new ArrayList<>();

        for(String line: lines) {
            if (!line.trim().isEmpty()) { // " john Doe ".trim() => "john Doe"
                nonEmptyLines.add(line);
            }
        }
        // " ".isEmpty() => false
        // "   ".isEmpty() => false
        // "".isEmpty() => true

        file.setLinesContent(nonEmptyLines);

    }

    @Override
    public void cancel() {
        if (originalContent != null) {
            file.setLinesContent(originalContent);
        }
    }
}
