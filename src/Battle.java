import java.util.List;

public interface Battle {
    int checkWinner(List<Card> deck1, List<Card> deck2, boolean liveOutput);
}
