package pclab;

public class Dimension {

    int width;
    int height;
    int depth;

    public Dimension(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public String toString(){
        return "Dimension{" +
                "Width='" + width + '\'' +
                ", Height ='" + height + '\'' +
                ", Depth='" + depth + '\'' +
                '}';
    }


}
