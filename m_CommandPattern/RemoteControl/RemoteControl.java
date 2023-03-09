package m_CommandPattern.RemoteControl;

import java.util.ArrayList;

import m_CommandPattern.Command;

public class RemoteControl {

	ArrayList<RemoteControlButton> buttons = new ArrayList<>();

	public void setCommand(int id, Command on, Command off) {
		buttons.add(id, new RemoteControlButton(id, on, off));
	}

	public void onButtonWasPushed(int id) {
		try {
			buttons.get(id).on();
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Not available ButtonID: " + id);
		}
	}

	public void offButtonWasPushed(int id) {
		try {
			buttons.get(id).off();
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Not available ButtonID: " + id);
		}
	}
}
