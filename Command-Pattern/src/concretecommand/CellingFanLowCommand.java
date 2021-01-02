package concretecommand;

import command.Command;
import receiver.CellingFan;

public class CellingFanLowCommand extends Command {

  private CellingFan cellingFan;

  public CellingFanLowCommand(CellingFan cellingFan) {
    this.cellingFan = cellingFan;
  }

  @Override
  public void execute() {
    super.execute();
    cellingFan.onLow();
  }

  @Override
  public void redo() {
    cellingFan.onLow();
  }

}
