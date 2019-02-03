import java.util.Scanner;

public class Box {
    Scanner scan = new Scanner(System.in);
    float width, height, depth;

    Box()
    {
        width = 1;
        height = 2;
        depth = 3;
    }
    Box(float width,float height,float depth)
    {
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public float getDepth() {
        return depth;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public void setDimensions(float height,float depth, float width) {
        this.height = height;
        this.depth = depth;
        this.width = width;
    }

    
    Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void displayVolume()
    {
        float volume = getDepth()*getHeight()*getWidth();
        System.out.println(" The volume is : " + volume);
    }
}
