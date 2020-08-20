import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.print("Deck with 5 cards, 10 seed :");
        showDeck(createDeck(5, 10));
        System.out.print("Deck with 5 cards, 15 seed :");
        showDeck(createDeck(5, 15));
        System.out.print("Deck with 5 cards, 30 seed :");
        showDeck(createDeck(5, 30));

        System.out.println("Battles:");


        Battle colorBattle = new ColorBattle();

        System.out.println("Sizes 5, seeds 10,15, Color Battle result: " +
                colorBattle.checkWinner(createDeck(5, 10), createDeck(5, 15), false));
        System.out.println("Sizes 5, seeds 15,10, Color Battle result: " +
                colorBattle.checkWinner(createDeck(5, 15), createDeck(5, 10), false));
        System.out.println("Sizes 5, seeds 30,30, Color Battle result: " +
                colorBattle.checkWinner(createDeck(5, 30), createDeck(5, 30), false));


        Battle rarityBattle = new RarityBattle();

        System.out.println("Sizes 5, seeds 10,15, Rarity Battle result: " +
                rarityBattle.checkWinner(createDeck(5, 10), createDeck(5, 15), false));
        System.out.println("Sizes 5, seeds 15,10, Rarity Battle result: " +
                rarityBattle.checkWinner(createDeck(5, 15), createDeck(5, 10), false));
        System.out.println("Sizes 5, seeds 30,30, Rarity Battle result: " +
                rarityBattle.checkWinner(createDeck(5, 30), createDeck(5, 30), false));


        Battle normalBattle = new NormalBattle();

        System.out.println("Sizes 5, seeds 10,15, Normal Battle result: " +
                normalBattle.checkWinner(createDeck(5, 10), createDeck(5, 15), true));
        System.out.println("Sizes 5, seeds 15,10, Rarity Battle result: " +
                normalBattle.checkWinner(createDeck(5, 15), createDeck(5, 10), false));
        System.out.println("Sizes 5, seeds 30,30, Rarity Battle result: " +
                normalBattle.checkWinner(createDeck(5, 30), createDeck(5, 30), false));
    }


    static List<Card> createDeck(int size, int seed) {
        Random random = new Random(seed);
        List<Card> deck = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            deck.add(new Card(
                    random.nextInt(10) + 1,
                    Suit.values()[random.nextInt(4)],
                    random.nextBoolean()));
        }
        return deck;
    }


    static void showDeck(List<Card> deck) {
        for (Card card : deck)
            System.out.print(card.showCard());
        System.out.println();
    }
}
