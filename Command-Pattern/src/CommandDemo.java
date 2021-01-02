import command.Command;
import concretecommand.CellingFanHighCommand;
import concretecommand.CellingFanLowCommand;
import concretecommand.CellingFanMediumCommand;
import concretecommand.CellingFanOffCommand;
import receiver.CellingFan;

public class CommandDemo {

  public static void main(String[] args) {
    CellingFan home = new CellingFan("Home");

    Command cellingFanHighCommand = new CellingFanHighCommand(home);

    cellingFanHighCommand.execute();

    Command cellingFanMediumCommand = new CellingFanMediumCommand(home);

    cellingFanMediumCommand.execute();

    Command cellingFanLowCommand = new CellingFanLowCommand(home);

    cellingFanLowCommand.execute();

    CellingFanOffCommand cellingFanOffCommand = new CellingFanOffCommand(home);

    cellingFanOffCommand.execute();

    Command.undo();
    Command.undo();
    Command.undo();
    Command.undo();
    Command.undo();

  }

}
