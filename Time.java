import java.ult.Scanner;
public class Time{
	public static void main(String[] args) {
		String zeit ="";
		int stunden = 0;
		int minuten = 0;
		boolean formatRichtig = true;
		String[] zeitTeile = new String[2]; 
		Scanner in = new Scanner(System.in);
		System.out.println("Eingabe Zeit");
		zeit = in.next();
		
		If (zeit.length !=5 || zeit[3] != ":"){
			formatRichtig =false;
		}
		else{
			zeitTeile = zeit.split(:);
			stunden = Integer.parseInt(zeitTeile[0]);
			minuten = Integer.parseInt(zeitTeile[1]);
			If (stunden<0 && stunden>=24){
				formatRichtig =false;
			}
			else If (minuten<0 && minuten >=60){
				formatRichtig =false;
			}
		}
		return formatRichtig;
	}
}
