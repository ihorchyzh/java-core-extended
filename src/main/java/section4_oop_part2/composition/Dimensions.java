package section4_oop_part2.composition;

/**
 * Created by ihorchyzh on 5/4/17.
 */
public class Dimensions {
    private int with;
    private int height;
    private int depth;

    public Dimensions(int with, int height, int depth) {
        this.with = with;
        this.height = height;
        this.depth = depth;
    }

    public int getWith() {
        return with;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}
