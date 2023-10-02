package command;

public class RenameFileCommand implements Command{ // 2. implement the interface

    private InMemoryFile file;
    private String originalFileName;

    private String newFileName;


    // 3. add a constructor with a parameter of type: InMemoryFile and the new name of the file
    public RenameFileCommand(InMemoryFile file, String newFileName){ // 3. we need the object on which the command will be applied!!!
        this.file = file;
        this.newFileName = newFileName;
    }



    @Override
    public void apply() {
        this.originalFileName = file.getName();
        file.setName(newFileName);
    }

    @Override
    public void cancel() {
        if(originalFileName != null) {
            file.setName(originalFileName);
        }
    }
}
