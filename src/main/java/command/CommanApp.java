package command;

public class CommanApp {
    public static void main(String[] args) {
    InMemoryFile myFile = new InMemoryFile("CommandApp.java");

        myFile.append("package com.sda.goodpractices.command;");
        myFile.append("public class CommandApp {");
        myFile.append("\n");
        myFile.append("public static void main(String[] args) {");
        myFile.append("\n");
        myFile.append("    }");
        myFile.append("}");

        System.out.println("(Before any command) The file "+myFile.getName()+":\n"+myFile);

        RemoveEmptyLinesCommand removeLinesCmd = new RemoveEmptyLinesCommand(myFile);
        removeLinesCmd.apply();

        RenameFileCommand renameFileCmd = new RenameFileCommand(myFile,"CommandAppWithoutEmptyLines.java");
        renameFileCmd.apply();

        System.out.println("(After commands were applied) The file "+myFile.getName()+":\n"+myFile);

        renameFileCmd.cancel();
        removeLinesCmd.cancel();
        System.out.println("(After commands were canceled) The file "+myFile.getName()+":\n"+myFile);

        DummyCommand dummyCommand = new DummyCommand();
        dummyCommand.apply();
        dummyCommand.cancel();
    }
}
