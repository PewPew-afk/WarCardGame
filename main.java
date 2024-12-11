Class Main{

    public static void main(String[] args){
        //Generate 2 Players, Deck of cards and deal their hands

        //Core game Logic
        int turnCount = 0;
        Player player1 = new Player();
        Player player2 = new Player();
        player1.dealDeck();
        player2.dealDeck();

        boolean winner = false;

        //Core Game Loop
        while(!winner){
            /// Players play cards
            Card card1 = player1.playCard();
            Card card2 = player2.playCard();

            System.out.println(player1.getName() + ": " + card1.val + " vs " + player2.getName() + ": " + card2.val);

            // Compare cards
            //Implement "Wars" on ties
            ///if(card1.val == card2.val) {war!};
            //Winner adds played cards to their discard deck
            if(card1.val > card2.val){
                System.out.println(player1.getName() + " wins!");
                player1.addDiscard(card1);
                player1.addDiscard(card2);
            } else {
                System.out.println(player2.getName() + " wins!");
                player2.addDiscard(card1);
                player2.addDiscard(card2);
            }
            
            // If mainDeck is empty, shuffle discardDeck and add cards to mainDeck
            //if losing player deck is empty and their discard deck is empty, they lose
            //if either player's deck is empty, shuffle discard deck and add to main deck

            //Check for winner
        }

        //Check for winner
    }

}
