
public class Card 
{
	private String name;
	private int number;
	private char suit;
	private boolean facedown;

	public Card(String n, int num, char s, boolean fd){
		name = n;
		number = num;
		suit = s;
		facedown = false;
	}
	
	public void changeFace(boolean face){
		facedown = face;
	}
	public int getNumber(){
		return number;
	}
	
	public char getSuit(){
		return suit;
	}
	
	public String getName(){
		return name;
	}
	public void setNum(int n){
		number = n;
	}
}
