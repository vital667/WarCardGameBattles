import java.util.List;

public class NormalBattle implements Battle {

    @Override
    public int checkWinner(List<Card> deck1, List<Card> deck2, boolean liveOutput) {

        int index1 = 0;
        int index2 = 0;

        while (true) {
            Card c1 = deck1.get(index1);
            Card c2 = deck2.get(index2);

            if (c1.getValue() > c2.getValue()) {
                index2++;
                if (liveOutput)
                    System.out.println(c1.getValue() + " vs " + c2.getValue() + ", player1 wins (" + index2 + ":" + index1 + ")");
            } else if (c2.getValue() > c1.getValue()) {
                index1++;
                if (liveOutput)
                    System.out.println(c1.getValue() + " vs " + c2.getValue() + ", player2 wins (" + index2 + ":" + index1 + ")");
            } else {
                index1++;
                index2++;
                if (liveOutput)
                    System.out.println(c1.getValue() + " vs " + c2.getValue() + ", draw (" + index2 + ":" + index1 + ")");
            }
            if (index1 == deck1.size() && index2 < deck2.size()) return -1;
            if (index2 == deck2.size() && index1 < deck1.size()) return 1;
            if (index2 == deck2.size() && index1 == deck1.size()) return 0;
        }
    }
}
