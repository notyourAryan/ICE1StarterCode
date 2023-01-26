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
                printInfo();
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
    //I am done
    private static void printInfo() {

        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is Aryan Rana, but you can call me Aryan");
        System.out.println();

        System.out.println("My career ambitions:");
        System.out.println("-- Be a better coder");
        System.out.println("-- Be the best at whatever i end up doing");
        System.out.println();

        System.out.println("My hobbies:");
        System.out.println("-- Gaming");
        System.out.println("-- Exercise");
        System.out.println("-- Watching TV");

        System.out.println();

    }

}
