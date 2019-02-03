public class BoxWeight extends Box {
    float weight;

    BoxWeight()
    {
        super();
        weight = 4;
    }

    BoxWeight(float width, float weight, float height, float depth)
    {
        super(width,height,depth);
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setDimensions(float height,float depth, float width, float weight) {
        this.height = height;
        this.depth = depth;
        this.width = width;
        this.weight = weight;
    }

    Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void displayWeight()
    {
        float weight = getWeight()*getDepth()*getHeight()*getWidth();
        System.out.println(" The Weight of box is : " + weight);
    }
}