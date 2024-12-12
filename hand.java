import java.util.Stack;
import java.util.Collections;

class Hand{
    public Hand(){
        this.cards = new Stack<Card>();
    }

    private Stack<Card> cards = new Stack<>();

    public Stack<Card> getCards(){
        return cards;
    }
    public void setCards(Stack<Card> cards){
        this.cards = cards;
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public boolean isEmpty(){
        return cards.isEmpty();
    }

    public void addCard(Card card){
        cards.push(card);
    }

    public void clear(){
        cards.clear();
    }

    public Card pop(){
        return cards.pop();
    }

    
}
