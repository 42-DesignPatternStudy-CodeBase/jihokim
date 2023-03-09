package m_CommandPattern.Stereo;

import m_CommandPattern.Command;

public class StereoOnWithCDCommand implements Command {
	
	Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
    	this.stereo = stereo;
    }

    public void execute() {
		stereo.on();
    }

}
