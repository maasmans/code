import java.util.*
import 

class Cardset{
	String[] kleuren = {"rood", "zwart"};
	String[] types = {"2","3","4","5","6","7","8","9","10","B","V","K","A"};
	String[] namen = {"Harten","Schoppen","Klaveren","Ruiten"};
	Arraylist cardSet;
	
	Cardset(){
		for(String kleur: kleuren){
			for(String type: types){
				for(String naam: namen){
					cardSet.add(kleur + "" + type + "" + naam);
				}
			}
		}
	}	
	
	public static void main(String[] args){
	for(String card: cardSet) {
			System.out.println(card);
		}
		
		Collections.shuffle(cardSet)
		
		for(String card: cardSet) {
            System.out.println(card);
        }	
	}
}