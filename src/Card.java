public class Card {
    private int value;
    private Suit suit;
    private boolean rarity;

    public Card(int value, Suit suit, boolean rarity) {
        this.value = value;
        this.suit = suit;
        this.rarity = rarity;
    }


    public boolean isRarity() {
        return rarity;
    }


    public Suit getSuit() {
        return suit;
    }


    public int getValue() {
        return value;
    }


    public String showCard() {
        return " (" + value + ", " + suit.getValue() + ", " + rarity + ")";
    }
}
