import java.util.Scanner;

public class Time1 {
	public static boolean timeCheck(String[] args) {
		String zeit = "";
		int stunden = 0;
		int minuten = 0;
		boolean formatRichtig = true;
		String[] zeitTeile = new String[2];
		Scanner in = new Scanner(System.in);
		System.out.println("Eingabe Zeit");
		zeit = in.next();

		if (zeit.length() != 5 || zeit.charAt(3) != ':') {
			formatRichtig = false;
		} 
		else {
			zeitTeile = zeit.split(":");
			stunden = Integer.parseInt(zeitTeile[0]);
			minuten = Integer.parseInt(zeitTeile[1]);
			if (stunden < 0 && stunden >= 24) {
				formatRichtig = false;
			} 
			else if (minuten < 0 && minuten >= 60) {
				formatRichtig = false;
			}
		}
		in.close();
		return formatRichtig;
	}
}
