public enum Suit {

    HEARTS(1), TILES(2), CLOVERS(3), PIKES(4);

    private int value;

    Suit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
