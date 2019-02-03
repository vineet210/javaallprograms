public class PointP1 {
    private float x = 0.0f;
    private float y = 0.0f;

    public PointP1()
    {
        x = 2;
        y = 3;
    }

    public PointP1(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    float getX() {
        return x;
    }

    float getY() {
        return y;
    }

    void setX(float x) {
        this.x = x;
    }

    void setY(float y) {
        this.y = y;
    }

    void setXY(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    public float[] getXY()
    {
        float[] xy = new float[2];
        xy[0] = x;
        xy[1] = y;
        return xy;
    }

    public String toString1()
    {
        return getXY()[0] + "," + getXY()[1];
    }
}