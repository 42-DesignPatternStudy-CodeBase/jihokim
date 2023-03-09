package n_AdaptorPattern.Inheritance;

import n_AdaptorPattern.Banner;
import n_AdaptorPattern.Print;

public class PrintBanner extends Banner implements Print {

	public PrintBanner(String string) {
		super(string);
	}

	@Override
	public void printWeak() {
		super.showWithParen();
	}

	@Override
	public void printStrong() {
		super.showWithAster();
	}
}
