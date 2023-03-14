package r_FlyweightPattern;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BigChar {

	private String bigchar;

	public BigChar(char ch) {
		try {
			this.bigchar = Files.readString(Paths.get("r_FlyweightPattern/BigCharacters/" + ch));
		} catch (IOException e) {
			this.bigchar = "" + ch + "?\n";
		}
	}

	public void print() {
		System.out.print(bigchar);
	}

}
