import java.util.List;

public class ColorBattle implements Battle {

    @Override
    public int checkWinner(List<Card> deck1, List<Card> deck2, boolean liveOutput) {

        int max1 = 0;
        for (Card i : deck1)
            max1 += i.getSuit().getValue();
        if (liveOutput) System.out.println("*** deck1 color values are " + max1);

        int max2 = 0;
        for (Card i : deck2)
            max2 += i.getSuit().getValue();
        if (liveOutput) System.out.println("*** deck2 color values are " + max2);

        if (max1 == max2) return 0;
        return max1 > max2 ? 1 : -1;
    }
}
