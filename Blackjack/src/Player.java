import java.util.ArrayList;
import java.util.Scanner;

public class Player {
	private String name;
	private boolean dealer;
	private ArrayList<Card> hand;
	private int points;
	public boolean out;
	public boolean stand;
	
	//Dealer Constructor
	public Player(){
		name = "Dealer";
		dealer = true;
		hand = new ArrayList<Card>();
		points = 1000;
		boolean out = false;
		boolean stand = false;
	}
	
	//Player constructor
	public Player(String n, int p){
		name = n;
		dealer = false;
		hand = new ArrayList<Card>();
		points = p;
		boolean out = false;
		boolean stand = false;
	}
	//-------------------------------------------------------
	public void deal(Player p, Deck d){
		Card card = d.dealCard();
		p.receiveCard(card);
	}
	
	public void deal(Deck d){
		receiveCard(d.dealCard());
		if(hand.size() == 2){
			hand.get(1).changeFace(true);
		}
	}
	
	//---------------------------------------------------------
	public void standOrHit(boolean choice){
		stand = choice;
	}
	
	public int getPoints(){
		return points;
	}
	//figure out how to set it within receiveCard
	public void setAce(Card ace){
		
	}
	
	public void receiveCard(Card newCard){
		hand.add(newCard);
		if(newCard.getName() == "Ace"){
			int i = hand.indexOf(newCard);
			setAce(hand.get(i));
		}
	}
	
	public int bet(Scanner input){
		boolean betWorks = false;
		int rBet = 0;
		while(betWorks){
			if(input.nextInt() > points){
				//Create a dialogue box for bet to high error
			}
			else if(input.nextInt() < 1){
				//create Dialogue box for bet to low
			}
			else{
				rBet = input.nextInt();
			}
		}
		return rBet;
	}
}
