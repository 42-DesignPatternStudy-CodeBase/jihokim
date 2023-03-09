package n_AdaptorPattern;

// import n_AdaptorPattern.Composition.PrintBanner;
import n_AdaptorPattern.Inheritance.PrintBanner;

public class Client {

	public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    } 

}
