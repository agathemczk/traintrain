public class Wagon extends TrainElement {

    private int size;
    private Sprite sprite;

    public Wagon(int size, final Sprite sprite) {
        this.size = size;
        this.sprite = sprite;
    }

    @Override
    public String getPrettyTop() {
        return "_".repeat(this.size);
    }

    @Override
    public String getPrettyBody() {
        return (this.sprite.getChar() + "").repeat(this.size);
    }

    @Override
    public String getPrettyBottom() {
        return "oo" + " ".repeat(this.size - 4) + "oo";
    }

}