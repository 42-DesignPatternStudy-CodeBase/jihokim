package m_CommandPattern.GarageDoor;

import m_CommandPattern.Command;

public class GarageDoorUpCommand implements Command {
	
	GarageDoor garageDoor;

		public GarageDoorUpCommand(GarageDoor garageDoor) {
			this.garageDoor = garageDoor;
		}

		public void execute() {
		garageDoor.up();
		}

}
