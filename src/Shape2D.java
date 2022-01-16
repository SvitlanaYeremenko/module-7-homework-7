import java.awt.*;

public abstract class Shape2D extends Shape implements Borderable {

    @Override
    public double getBorderWidth() {
        return 0;
    }

    @Override
    public Color getBorderColor() {
        return null;
    }

    @Override
    public double getX() {
        return 0;
    }

    @Override
    public double getY() {
        return 0;
    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public double getMove() {
        return 0;
    }

    @Override
    public double getRotate() {
        return 0;
    }

    @Override
    public double getScale() {
        return 0;
    }

    @Override
    public void Name() {
    }
}
