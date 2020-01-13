package OopsConcepts.Abstraction;

public class Square implements Quadrilateral {
    final float a;
    final boolean isRegularShape;
    final float[] angles;

    Square(float a) {
        this.a = a;
        this.isRegularShape = true;
        this.angles = new float[sides];
        for (int i = 0; i < angles.length; i++) {
            this.angles[i] = 90;
        }
    }

    @Override
    public float getParameter() {
        return 4 * a;
    }

    @Override
    public float getArea() {
        return a * a;
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
