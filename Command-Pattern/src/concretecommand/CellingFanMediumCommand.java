package concretecommand;

import command.Command;
import receiver.CellingFan;

public class CellingFanMediumCommand extends Command {

  private CellingFan cellingFan;

  public CellingFanMediumCommand(CellingFan cellingFan) {
    this.cellingFan = cellingFan;
  }

  @Override
  public void execute() {
    super.execute();
    cellingFan.onMedium();
  }

  @Override
  public void redo() {
    cellingFan.onMedium();
  }
}
