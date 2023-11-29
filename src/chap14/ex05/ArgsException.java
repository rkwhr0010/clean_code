package chap14.ex05;

@SuppressWarnings("all") class ArgsException extends Exception {
	private char errorArgumentId = '\0';
	private String errorParameter = "TILT";
	private ArgsException.ErrorCode errorCode = ErrorCode.OK;

	public ArgsException() {
	}

	public ArgsException(String message) {
		super(message);
	}

	public ArgsException(ArgsException.ErrorCode errorCode) {
		this.errorCode = errorCode;
	}

	public ArgsException(ArgsException.ErrorCode errorCode, String errorParameter) {
		this.errorCode = errorCode;
		this.errorParameter = errorParameter;
	}

	public ArgsException(ArgsException.ErrorCode errorCode, char errorArgumentId, String errorParameter) {
		this.errorCode = errorCode;
		this.errorArgumentId = errorArgumentId;
		this.errorParameter = errorParameter;
	}

	public char getErrorArgumentId() {
		return errorArgumentId;
	}

	public void setErrorArgumentId(char errorArgumentId) {
		this.errorArgumentId = errorArgumentId;
	}

	public String getErrorParameter() {
		return errorParameter;
	}

	public void setErrorParameter(String errorParameter) {
		this.errorParameter = errorParameter;
	}

	public ArgsException.ErrorCode getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(ArgsException.ErrorCode errorCode) {
		this.errorCode = errorCode;
	}
	
	public String errorMessage() throws Exception {
		switch (errorCode) {
		case OK:
			throw new Exception("TILT: Should not get here.");
		case UNEXPECTED_ARGUMENT:
			return String.format("Argument -%c unecpected.", errorArgumentId);
		case MISSING_STRING:
			return String.format("Could not find string parameter for -%c.", 
					errorArgumentId);
		case INVALID_INTEGER:
			return String.format("Argument -%c expects an integer but was '%s'.", 
					errorArgumentId, errorParameter);
		case MISSING_INTEGER:
			return String.format("Could not find integer parameter for -%c.", 
					errorArgumentId);
		case INVALID_DOUBLE:
			return String.format("Argument -%c expects an double but was '%s'.", 
					errorArgumentId, errorParameter);
		case MISSING_DOUBLE:
			return String.format("Could not find double parameter for -%c.", 
					errorArgumentId);
		}
		return "";
	}

	enum ErrorCode {
		OK, MISSING_STRING, MISSING_INTEGER, INVALID_INTEGER, 
		UNEXPECTED_ARGUMENT, MISSING_DOUBLE, INVALID_DOUBLE
	}
}