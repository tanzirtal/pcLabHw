package pclab;

public class Resolution {

    private int width;
    int height;

    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString(){
        return "Resolution{" +
                "Width='" + width + '\'' +
                ", Height='" + height + '\'' + '}';
    }


}
