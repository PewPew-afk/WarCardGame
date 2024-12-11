import java.util.Stack;

Class Hand{
    public Hand(){}

    Stack<Card> cards = new Stack<>();

    public Hand(Stack<Card> cards){
        this.cards = cards;
    }

    private void shuffle(){
        //Implement shuffle logic
    }

    public Card playCard(){
        if(!cards.isEmpty()){
            return cards.pop();
        }
    }
}
