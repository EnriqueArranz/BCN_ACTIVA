package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Undo {


    List<String> commandList;

    private static Undo instance;
    private Undo()
    {
        commandList = new ArrayList<>();

    }

    public static Undo getInstance()
    {
        if(instance == null)
        {
            instance = new Undo();
        }

        return instance;
    }

    public void addCommand(String command)
    {
        commandList.add(command);
    }

    public void undoCommand()
    {
        int lastCommand = commandList.size()-1;
        commandList.remove(lastCommand);
    }

    public void showHistoryCommands()
    {
        new LinkedList<>(commandList)
                .descendingIterator()
                .forEachRemaining(System.out::println);
    }
}
