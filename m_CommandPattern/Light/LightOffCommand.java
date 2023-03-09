package m_CommandPattern.Light;

import m_CommandPattern.Command;

public class LightOffCommand implements Command {
	
	Light light;

    public LightOffCommand(Light light) {
      this.light = light;
    }

    public void execute() {
      light.off();
    }

}
