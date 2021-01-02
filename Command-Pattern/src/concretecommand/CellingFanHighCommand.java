package concretecommand;

import command.Command;
import receiver.CellingFan;

public class CellingFanHighCommand extends Command {

  private CellingFan cellingFan;

  public CellingFanHighCommand(CellingFan cellingFan) {
    this.cellingFan = cellingFan;
  }

  @Override
  public void execute() {
    super.execute();
    cellingFan.onHigh();
  }

  @Override
  public void redo() {
    cellingFan.onHigh();
  }

}
