package m_CommandPattern.CeilingFan;

import m_CommandPattern.Command;

public class CeilingFanOnCommand implements Command {
	
	CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
    	this.ceilingFan = ceilingFan;
    }

    public void execute() {
      ceilingFan.on();
    }

}
