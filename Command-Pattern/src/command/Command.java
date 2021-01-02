package command;

import java.util.LinkedList;

public abstract class Command {

  public static final LinkedList<Command> undoCommandList = new LinkedList<>();

  public void execute() {
    undoCommandList.add(this);
  }

  public abstract void redo();

  public static void undo() {
    if (undoCommandList.size() < 2) {
      System.out.println("NO UNDO ! ");
      return;
    }
    undoCommandList.removeLast();

    Command last = undoCommandList.getLast();
    if (null != last) {
      last.redo();
    } else {
      System.out.println("NO UNDO ! ");
      return;
    }
  }

}