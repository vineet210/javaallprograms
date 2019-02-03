public class PointP2 extends PointP1 {
    private float z = 0.0f;

    public PointP2()
    {
        super();
        z = 5;
    }

    public PointP2(float x, float y, float z)
    {
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z)
    {
        super.setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ()
    {
        float[] xyz = new float[3];
        xyz[0] = getX();
        xyz[1] = getY();
        xyz[2] = getZ();
        return xyz;
    }

    public String toString1()
    {
        return getXYZ()[0] + "," + getXYZ()[1] + "," + getXYZ()[2];
    }
}