package tamrin_5;

public class Player {
    private String name;
    private Card[] card ;

    public Player(String name, Card[ ] cards){
        this.name = name;
        this.card = cards;
    }

    public void markNumber(int number){
        for (int i = 0; i < card.length; i++) {
            if (card[i].getNumber(number) != null){
                card[i].markNumber(number);
            }
        }

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card[] getCard() {
        return card;
    }

    public void setCard(Card[] card) {
        this.card = card;
    }
}
