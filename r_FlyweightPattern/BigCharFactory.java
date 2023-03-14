package r_FlyweightPattern;

import java.util.HashMap;

public class BigCharFactory {

	static private BigCharFactory instance = new BigCharFactory();
	private HashMap<Character, BigChar> flyweight = new HashMap<>();

	private BigCharFactory() {
		BigCharFactory.instance = this;
	}

	static public BigCharFactory getInstance() {
		return BigCharFactory.instance;
	}

	public BigChar getBigChar(char ch) {
		if (this.flyweight.containsKey(ch)) {
			return this.flyweight.get(ch);
		} else {
			BigChar big = new BigChar(ch);
			this.flyweight.put(ch, big);
			return big;
		}
	}

}
