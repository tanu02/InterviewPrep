package dunzo.dunzo;

import java.net.http.HttpResponse;

import org.apache.http.HttpMessage;
import org.apache.http.HttpStatus;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

class HashMapExp {
	private static final Logger logger = LogManager.getLogger(HashMapExp.class);
	public void getBookDetail() {
		HttpResponse<HashObject> resp = null ; 
		try {
			String abc = null;
			abc.charAt(0);
			logger.info("Success fetching Book Id " + "123");
		} catch (NullPointerException e) {
			String message = String.format("Error in fetching Book Details for Book Id %s", "123");
			logger.error(message, e);
			throw new TanuException(Integer.toString(500),message, e);
			//throw new TanuException(Integer.toString(HttpStatus.SC_BAD_REQUEST),e );
		}
	}
}