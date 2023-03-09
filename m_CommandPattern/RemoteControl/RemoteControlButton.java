package m_CommandPattern.RemoteControl;

import m_CommandPattern.Command;

public class RemoteControlButton {

	private int id;
	private Command commandOn;
	private Command commandOff;

	public RemoteControlButton(int id, Command on, Command off) {
		this.id = id;
		this.commandOn = on;
		this.commandOff = off;
	}

	public void on() {
		this.commandOn.execute();
	}

	public void off() {
		this.commandOff.execute();
	}

	@Override
	public String toString() {
		return "Button" + this.id;
	}
}
