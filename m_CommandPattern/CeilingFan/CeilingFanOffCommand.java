package m_CommandPattern.CeilingFan;

import m_CommandPattern.Command;

public class CeilingFanOffCommand implements Command {
	
	CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
    	this.ceilingFan = ceilingFan;
    }

    public void execute() {
      ceilingFan.on();
    }

}
