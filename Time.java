
public class Time {
	public static boolean timeCheck(String time) {

		String regex = "^(?:[01]\\d|2[0-3]):[0-5]\\d$";
		boolean formatRichtig = false;

		if (time == null) {
			formatRichtig = false;
		} else if (time.length() != 5 || time.charAt(2) != ':') {
			formatRichtig = false;
		} else {
			if (time.matches(regex)) {
				formatRichtig = true;
			}
		}
		return formatRichtig;
	}

	public static void main(String[] args) {
		System.out.println(timeCheck(null));
	}
}
