package moodAnalizer;

public class MoodAnalizeException extends Exception {
	ExceptionType type;

	enum ExceptionType {
		ENTERED_NULL, ENTERED_EMPTY
	}

	public MoodAnalizeException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}
}
