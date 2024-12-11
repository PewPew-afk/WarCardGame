import java.util.Stack;

Class Hand{
    public Hand(){}

    Stack<Card> cards = new Stack<>();

    public Hand(Stack<Card> cards){
        this.cards = cards;
    }

    public Stack<Card> getCards(){
        return cards;
    }
    public void setCards(Stack<Card> cards){
        this.cards = cards;
    }

    private void shuffle(){
        //Implement shuffle logic
    }

    public Card topCard(){
        if(!cards.isEmpty()){
            return cards.pop();
        }
    }

    public boolean isEmpty(){
        return cards.isEmpty();
    }
}
