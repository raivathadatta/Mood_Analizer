package moodAnalizer;

public class MoodAnalizer {
	String string;

	public MoodAnalizer(String string) {
		this.string = string;
	}

	public MoodAnalizer() {
	}

	public String analizeMood() throws MoodAnalizeException {
		try {
			if (string.length() == 0)
				throw new MoodAnalizeException(MoodAnalizeException.ExceptionType.ENTERED_EMPTY,
						"Please enter proper message!");
			if (string.contains("sad")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			throw new MoodAnalizeException(MoodAnalizeException.ExceptionType.ENTERED_NULL,
					"Please enter proper message!");
		}
	}

}