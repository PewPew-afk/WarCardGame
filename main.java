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
            int card1 = topCard(player1);
            int card2 = topCard(player2);

            System.out.println("Player 1: " + card1 + "vs" + " Player 2: " + card2);

            /// Compare cards
            /// Winner adds cards to their discardDeck
            /// If mainDeck is empty, shuffle discardDeck and add cards to mainDeck
        }
        
        /// Players play cards
        /// Compare cards
        /// Winner adds cards to their discardDeck
        /// If mainDeck is empty, shuffle discardDeck and add cards to mainDeck


        //Implement "Wars" on ties
    }

    private int topCard(Player player){
        player.deck.playCard();
    }
}
