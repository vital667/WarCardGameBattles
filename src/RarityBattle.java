import java.util.List;

public class RarityBattle implements Battle {

    @Override
    public int checkWinner(List<Card> deck1, List<Card> deck2, boolean liveOutput) {

        int max1 = 0;
        int max2 = 0;

        for (Card i : deck1)
            if (i.isRarity()) max1++;
        if (liveOutput) System.out.println("*** deck1 contains " + max1 + " rare cards");

        for (Card i : deck2)
            if (i.isRarity()) max2++;
        if (liveOutput) System.out.println("*** deck1 contains " + max1 + " rare cards");

        if (max1 == max2) return 0;
        return max1 > max2 ? 1 : -1;
    }
}
