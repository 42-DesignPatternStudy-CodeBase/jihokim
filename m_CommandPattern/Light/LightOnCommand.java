package m_CommandPattern.Light;

import m_CommandPattern.Command;

public class LightOnCommand implements Command {
	
	Light light;

    public LightOnCommand(Light light) {
		this.light = light;
    }

    public void execute() {
		light.on();
    }

}
