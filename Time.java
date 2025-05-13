import java.ult.Scanner;
public class Time{
	public static void main(String[] args) {
	String zeit ="";
	boolean formatRichtig = true; 
	Scanner in = new Scanner(System.in);
	System.out.println("Eingabe Zeit");
	zeit = in.next();
	If (zeit.length !=5 || zeit[3] != ":"){
		formatRichtig =false;
		}
	}
}
