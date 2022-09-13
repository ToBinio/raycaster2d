package at.tobinio.util;

/**
 * Created: 13.09.2022
 *
 * @author Tobias Frischmann
 */

public class Vec2 {
    public float x;
    public float y;

    public Vec2() {
        this(0, 0);
    }

    public Vec2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vec2 mul(float size) {

        x *= size;
        y *= size;

        return this;
    }

    public Vec2 sub(Vec2 point) {

        x -= point.x;
        y -= point.y;

        return this;
    }

    public double length() {
        return Math.sqrt(x * x + y * y);
    }

    public Vec2 normalize() {

        double length = length();

        x /= length;
        y /= length;

        return this;
    }

    public Vec2 copy() {
        return new Vec2(x, y);
    }

    @Override
    public String toString() {
        return x + " | " + y;
    }
}
