public abstract class Wagon extends TrainElement {

    public final int size;
    public final Sprite sprite;


    protected Wagon(final int size, final Sprite sprite) {
        this.size = size;
        this.sprite = sprite;
    }
}