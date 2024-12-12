import java.util.Stack;
import java.util.Collections;

class Main{

    public static void main(String[] args){
        //Generate 2 Players, Deck of cards and deal their hands
        Player player1 = new Player("Pete");
        Player player2 = new Player("Em");
        dealHand(player1, player2, generateDeck());

        boolean winner = false;

        //Core Game Loop
        while(!winner){
            /// Players play cards
            Card card1 = player1.getHand().pop();
            Card card2 = player2.getHand().pop();

            System.out.println(player1.getName() + ": " + card1.value + " vs " + player2.getName() + ": " + card2.value);

            // Compare cards
            //Implement "Wars" on ties
            if(card1.value == card2.value){
                System.out.println("War! ----- WIP");
                break;
            };
            //Winner adds played cards to their discard deck
            if(card1.value > card2.value){
                System.out.println(player1.getName() + " wins this round.");
                player1.addDiscard(card1);
                player1.addDiscard(card2);
            } else {
                System.out.println(player2.getName() + " wins this round.");
                player2.addDiscard(card1);
                player2.addDiscard(card2);
            }
            
            //Check for winner
            winner = checkWinner(player1, player2);

            //Check decks if they need to shuffle in discardDeck
            if(player1.getHand().isEmpty() && !player1.getDiscardHand().isEmpty()){
                player1.getDiscardHand().shuffle();
                player1.setHand(player1.getDiscardHand());
                player1.getDiscardHand().clear();
            }
            if(player2.getHand().isEmpty() && !player2.getDiscardHand().isEmpty()){
                player2.getDiscardHand().shuffle();
                player2.setHand(player2.getDiscardHand());
                player2.getDiscardHand().clear();


            }
        }
    }

    private static boolean checkWinner(Player player1, Player player2){
        if(player1.getHand().isEmpty() && player1.getDiscardHand().isEmpty()){
            System.out.println(player2.getName() + " wins!");
            return true;
        }
        if(player2.getHand().isEmpty() && player2.getDiscardHand().isEmpty()){
            System.out.println(player1.getName() + " wins!");
            return true;
        }
        return false;
    }

    private static Hand generateDeck(){
        Hand fullDeck = new Hand();
        for(int i = 2; i <= 13; i++){
            for(int j = 1; j <= 4; j++){
                Card card = new Card(j);
                fullDeck.addCard(card);
            }
        }
        return fullDeck;
    }

    private static void dealHand(Player player1, Player player2, Hand fullDeck){
        fullDeck.shuffle();
        for(int i = 1; i <= 26; i++){
            player1.addCard(fullDeck.pop());
        }
        while(!fullDeck.isEmpty()){
            player2.addCard(fullDeck.pop());
        }
    }
}
