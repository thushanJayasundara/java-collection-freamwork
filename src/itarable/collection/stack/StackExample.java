package itarable.collection.stack;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<String> deckOfCards = new Stack<>();

        String card1 = "Jack : Diamonds";
        String card2 = "Queen : Diamonds";
        String card3 = "King : Diamonds";
        String card4 = "Ace : Diamonds";

        deckOfCards.push(card1);
        deckOfCards.push(card2);
        deckOfCards.push(card3);
        deckOfCards.push(card4);

        System.out.println(deckOfCards);

        //See what's on top w/o removal
        String topCard = deckOfCards.peek();
        System.out.println("Top card: " + topCard);
        System.out.println();

        //See size
        System.out.println("See size " + deckOfCards.size());
        System.out.println();

        //Remove item
        while (!deckOfCards.isEmpty()) {
            String card = deckOfCards.pop();
            System.out.println(card);
        }
    }

}
