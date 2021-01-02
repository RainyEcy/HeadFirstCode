package concretecommand;

import command.Command;
import receiver.CellingFan;

public class CellingFanOffCommand extends Command {

  private CellingFan cellingFan;

  public CellingFanOffCommand(CellingFan cellingFan) {
    this.cellingFan = cellingFan;
  }

  @Override
  public void execute() {
    super.execute();
    cellingFan.off();
  }

  @Override
  public void redo() {
    cellingFan.off();
  }

}
