package dontlookback;

public interface Human extends Biped {

    public float speed();

    public double weight();

    public boolean jump();

    public int jumpHeight();

    public int height(); //default to 1.75

    public int width();

    public int depth();

    public float positionX();

    public float positionY();

    public float positionZ();

    public float rotX();

    public float rotY();

    public float rotZ();

    public Object[] inventory();

    public Object heldItem();

    public boolean isHolding();

    public int reactionTime();
    
    public int[] deBuffs();

    public boolean gender();
}
