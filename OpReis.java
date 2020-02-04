import java.util.Scanner;
import java.util.*;

class OpReis{
	public static void main(String[] args) {
		String eersteAntwoord;
		String antwoord;
		char deEersteLetter;
		char deLaatsteLetter;
		ArrayList<String> lijst = new ArrayList<String>();
		
		//De eerste ronde
		System.out.println("welkom bij Ik ging op vakantie, wat neem je mee?");
		Scanner mijnScanner = new Scanner(System.in);
		eersteAntwoord = mijnScanner.nextLine();
		lijst.add(eersteAntwoord);
		deLaatsteLetter = eersteAntwoord.charAt(eersteAntwoord.length() - 1);
		
		//Vier beurten loop, indien niet goed wordt de ronde herhaald
		for(int i = 1; i<5; i++) {
		System.out.println("We zijn op ronde " + i);
		System.out.println("volgend item moet starten met een " + deLaatsteLetter);
		System.out.println("Wat neem je mee?");
		antwoord = mijnScanner.nextLine();
		deEersteLetter = antwoord.charAt(0);
		if(deEersteLetter == deLaatsteLetter) {
			System.out.println("Goede keuze dit mag!");
			deLaatsteLetter = antwoord.charAt(antwoord.length() - 1);
			lijst.add(antwoord);
		}else {
			System.out.println("Dit mag niet probeer opnieuw!");
			i--;
		}
		}
		//EINDE van de loop met de resultaten
		System.out.println("Einde van het spelletje, zie hieronder de spulletjes:");
		System.out.println(lijst);

}
