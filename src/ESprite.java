public enum ESprite implements Sprite {
    MOTO('%'),
    PEOPLE('☺'),
    FLAVOR('f');

    private char charSprite;

    ESprite(final char charSprite) {
        this.charSprite = charSprite;
    }

    @Override
    public char getChar() {
        return this.charSprite;
    }
}