package dontlookback;

public abstract class Objects implements Entities {

    protected float x, y, z, cX, cY, cZ;
    protected float orientation;
    protected int handle;

    protected float[] rgb = {0.5f, 0.5f, 0.5f};

    public Objects() {
        setX(0);
        setY(0);
        setZ(0);
        setOrientation(0);

    }

    public Objects(float x, float y, float z, float angle) {
        setX(x);
        setY(y);
        setZ(z);
        setOrientation(angle);

    }

    public Objects(float[] coords, float angle) {
        setCenter(coords);
        setOrientation(angle);
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setOrientation(float angle) {
        orientation = angle;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public float getOrientation() {
        return orientation;
    }
    
    public void rotate(){
        orientation = orientation + .1f;
        if(orientation >= 360f){
            orientation = orientation - 360f;
        } 
    }
    
    public void setCenter(float[] coords) {
        setX(coords[0]);
        setY(coords[1]);
        setZ(coords[2]);
    }

    public float[] getCenter() {
        return new float[]{x, y, z};
    }

    @Override
    public void setRGB(float[] rgb) {
        this.rgb = rgb;
    }

    public void setRGB(float red, float green, float blue) {
        this.rgb = new float[]{red, green, blue};
    }

    public float[] getRGB() {
        return rgb;
    }

    public void randomXYZ() {
        x = (float) (Math.random() * 30); // * 256 removed for testing
        y = (float) (Math.random() * -15); // * 256 removed for testing
        z = (float) (Math.random() * 30); // * 256 removed for testing
        //return new float[] {x,y,z};
    }

    public void xyGitter() {  //no y movement to be clean
        x = x + ((float) (Math.random() * 2.0)); // * 256 removed for testing random amount forward
        x = x - ((float) (Math.random() * 2.0)); // * 256 removed for testing random amount backward, it will move the average.
        //y = (float) (Math.random() * -15); // * 256 removed for testing
        z = z + ((float) (Math.random() * 1.0)); // * 256 removed for testing
        z = z - ((float) (Math.random() * 1.0)); // * 256 removed for testing
    }

    public static float[] randomColor() {

        float R = (float) (Math.random()); // * 256 removed for testing
        float G = (float) (Math.random()); // * 256 removed for testing
        float B = (float) (Math.random()); // * 256 removed for testing

        float[] color = {R, G, B}; //random color, but can be bright or dull

        //to get rainbow, pastel colors
        /*
         Random random = new Random();
         final float hue = random.nextFloat();
         final float saturation = 0.9f;//1.0 for brilliant, 0.0 for dull
         final float luminance = 1.0f; //1.0 for brighter, 0.0 for black
         color = Color.getHSBColor(hue, saturation, luminance); */
        return color;
    }

    public abstract void render();

    public abstract void setColor();

    public abstract void setColor(float[] Color);

    public abstract void setUpVBO();

    public abstract void delete();

    public abstract void behavior();
    
    public abstract void update();

}
