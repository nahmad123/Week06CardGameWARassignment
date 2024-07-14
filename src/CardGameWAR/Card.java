package CardGameWAR;

public class Card {

	/*
 * i.     Fields
          1. value (contains a value from 2-14 representing cards 2-Ace)
          2. name (e.g. Ace of Diamonds, or Two of Hearts)

   ii.    Methods
          1. Getters and Setters
          2. describe (prints out information about a card)
 */
	
		 String name;
		 int value;
		 
		 public Card(String name, int value){
			 this.name = name;
			 this.value = value;
			 
		 }
		 
		public Card() {
	
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}

		public void describe() {
			System.out.println(this.name + " is " + this.value);
			
		}
}

