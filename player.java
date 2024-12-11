Class Player{
  public class Player(){
    private String name;
    private Hand hand;
    private Hand discardHand;

    
    public Card playCard(Hand hand){
      return hand.topCard()
    }
    public Hand getHand(){
      return hand;
    }
    public Hard getDiscardHand(){
      return discardhand;
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
}
