package dunzo.dunzo;

import org.apache.log4j.BasicConfigurator;

public class App {
	public static void main(String[] args) {
		BasicConfigurator.configure();
		HashMapExp hash = new HashMapExp();
		try {
			hash.getBookDetail();
		} catch (TanuException e) {
			throw e;
		}
	}

}
