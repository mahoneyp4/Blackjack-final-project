import java.util.ArrayList;
public class Deck{
	private ArrayList<Card> originalDeck;
	private ArrayList<Card> shuffledDeck;
	
	public Deck(){
		originalDeck = new ArrayList<Card>();
		shuffledDeck = new ArrayList<Card>();
		originalDeck.add(new Card("Ace", 1, 's', false));
		originalDeck.add(new Card("Two", 2, 's', false));
		originalDeck.add(new Card("Three", 3, 's', false));
		originalDeck.add(new Card("Four", 4, 's', false));
		originalDeck.add(new Card("Five", 5, 's', false));
		originalDeck.add(new Card("Six", 6, 's', false));
		originalDeck.add(new Card("Seven", 7, 's', false));
		originalDeck.add(new Card("Eight", 8, 's', false));
		originalDeck.add(new Card("Nine", 9, 's', false));
		originalDeck.add(new Card("Ten", 10, 's', false));
		originalDeck.add(new Card("Jack", 10, 's', false));
		originalDeck.add(new Card("Queen", 10, 's', false));
		originalDeck.add(new Card("King", 10, 's', false));
		originalDeck.add(new Card("Ace", 1, 'c', false));
		originalDeck.add(new Card("Two", 2, 'c', false));
		originalDeck.add(new Card("Three", 3, 'c', false));
		originalDeck.add(new Card("Four", 4, 'c', false));
		originalDeck.add(new Card("Five", 5, 'c', false));
		originalDeck.add(new Card("Six", 6, 'c', false));
		originalDeck.add(new Card("Seven", 7, 'c', false));
		originalDeck.add(new Card("Eight", 8, 'c', false));
		originalDeck.add(new Card("Nine", 9, 'c', false));
		originalDeck.add(new Card("Ten", 10, 'c', false));
		originalDeck.add(new Card("Jack", 10, 'c', false));
		originalDeck.add(new Card("Queen", 10, 'c', false));
		originalDeck.add(new Card("King", 10, 'c', false));
		originalDeck.add(new Card("Ace", 1, 'd', false));
		originalDeck.add(new Card("Two", 2, 'd', false));
		originalDeck.add(new Card("Three", 3, 'd', false));
		originalDeck.add(new Card("Four", 4, 'd', false));
		originalDeck.add(new Card("Five", 5, 'd', false));
		originalDeck.add(new Card("Six", 6, 'd', false));
		originalDeck.add(new Card("Seven", 7, 'd', false));
		originalDeck.add(new Card("Eight", 8, 'd', false));
		originalDeck.add(new Card("Nine", 9, 'd', false));
		originalDeck.add(new Card("Ten", 10, 'd', false));
		originalDeck.add(new Card("Jack", 10, 'd', false));
		originalDeck.add(new Card("Queen", 10, 'd', false));
		originalDeck.add(new Card("King", 10, 'd', false));
		originalDeck.add(new Card("Ace", 1, 'h', false));
		originalDeck.add(new Card("Two", 2, 'h', false));
		originalDeck.add(new Card("Three", 3, 'h', false));
		originalDeck.add(new Card("Four", 4, 'h', false));
		originalDeck.add(new Card("Five", 5, 'h', false));
		originalDeck.add(new Card("Six", 6, 'h', false));
		originalDeck.add(new Card("Seven", 7, 'h', false));
		originalDeck.add(new Card("Eight", 8, 'h', false));
		originalDeck.add(new Card("Nine", 9, 'h', false));
		originalDeck.add(new Card("Ten", 10, 'h', false));
		originalDeck.add(new Card("Jack", 10, 'h', false));
		originalDeck.add(new Card("Queen", 10, 'h', false));
		originalDeck.add(new Card("King", 10, 'h', false));
		
		for(int i = 0; i< originalDeck.size(); i++){
			shuffledDeck.add(new Card("temp", 0, 't', true));	
		}
	}
	//regular shuffle
	public void shuffle(){
		Card controlCard = new Card("temp", 0, 't', true);
		boolean placeFits = false;
		for(int i = 0; i < originalDeck.size(); i++){
			while(placeFits == false){
				Card tempCard = originalDeck.get(i);
				int newPosition = (int)(Math.random()*originalDeck.size());
				if(shuffledDeck.get(i).equals(controlCard)){
					shuffledDeck.set(i,tempCard);
					placeFits = true;
				}
			}
			placeFits = false;
		}
			
	}
	//shuffles deck so the user will have an easy win if on a loss streak greater than 3
	public void shuffle(boolean easyWin){
		
	}
	
	public ArrayList<Card> getShuffledDeck(){
		return shuffledDeck;
	}
	
	public Card dealCard(){
		Card temp = shuffledDeck.get(0);
		shuffledDeck.remove(0);
		return temp;
	}
	
}
