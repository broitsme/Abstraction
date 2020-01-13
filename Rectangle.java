package OopsConcepts.Abstraction;

public class Rectangle implements Quadrilateral {
    final float a, b;
    final float[] angles;
    final boolean isRegularShape;

    Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
        isRegularShape = a == b;
        this.angles = new float[sides];
        for (int i = 0; i < angles.length; i++) {
            this.angles[i] = 90;
        }
    }

    @Override
    public float getParameter() {
        return 2 * (a + b);
    }

    @Override
    public float getArea() {
        return a * b;
    }

    @Override
    public boolean isRegular() {
        return isRegularShape;
    }

    @Override
    public int getSides() {
        return sides;
    }

    @Override
    public float[] getAngles() {
        return angles;
    }
}
