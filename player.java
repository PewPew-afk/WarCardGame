import java.util.Stack;
import java.util.Collections;

class Player{
    Player(){};
    Player(String name){
      this.name = name;
      this.hand = new Hand();
      this.discardHand = new Hand();
    };
    private String name;
    private Hand hand;
    private Hand discardHand;

    public void addCard(Card card){
      hand.getCards().push(card);
    }
    public void addDiscard(Card card){
      discardHand.getCards().push(card);
    }
    public Hand getHand(){
      return hand;
    }
    public Hand getDiscardHand(){
      return discardHand;
    }
    public void setHand(Hand hand){
      this.hand = hand;
    }
    public void setDiscardHand(Hand discardHand){
      this.discardHand = discardHand;
    }
    public String getName(){
      return name;
    }
    public void setName(String name){
      this.name = name;
    }
}
