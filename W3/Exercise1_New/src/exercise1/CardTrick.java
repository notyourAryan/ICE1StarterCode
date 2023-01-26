package exercise1;
import java.util.Scanner;
/**
 * @author Aryan Rana
 * @date 25th january
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] hand = new Card[7];
        //Generating values of the cards
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            
            card.setSuit(Card.SUITS[(int)(0+Math.random()*3)]);
            card.setValue((int)(1+Math.random()*13));
         
            hand[i] = card;
           System.out.println(hand[i].getSuit() +" "+ hand[i].getValue());
        }

        // Asking users to guesstehir cards
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of the card from 1 to 13 ");
        int num = input.nextInt();
        System.out.println("Enter suit of the card");
        String suit=input.next();
        
        boolean pointer=true;
       
        for (Card hand1 : hand) {
            if (num == hand1.getValue() && suit.equals(hand1.getSuit())) {
                pointer = true;
                System.out.println("Guessed correct");
                break;
                
            } else {
                pointer = false;
            }
        }
            if(pointer == false){
                System.out.println("Guessed wrong Suit/Number");
                
            
        }
    }

    /**
     * @author Aryan Rana
     */
    private static void printInfo() {

        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();

        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
        System.out.println();

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();

    }

}
