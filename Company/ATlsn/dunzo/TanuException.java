package dunzo.dunzo;

class TanuException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	String errorCode;
	String message;

	public TanuException(String errorCode, String message, Throwable ex) {
		super(message, ex);
		this.errorCode = errorCode;
	}

	public TanuException(String message, Throwable ex) {
		super(message, ex);
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}