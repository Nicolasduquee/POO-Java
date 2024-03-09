
package beans;

public class Ponto2D implements Objeto2D{
    private double X;
    private double Y;

    public Ponto2D(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }
    
    public double getX() {
        return X;
    }

    public void setX(double X) {
        this.X = X;
    }

    public double getY() {
        return Y;
    }

    public void setY(double Y) {
        this.Y = Y;
    }
    
    @Override
    public void moveX(double dX) {
        X += dX;
    }

    @Override
    public void moveY(double dY) {
        Y += dY;
    }

    @Override
    public void moveXY(double dX, double dY) {
        X += dY;
        Y += dY;
    }

    @Override
    public String toString() {
        return "Ponto2D(" + X + ", " + Y + ')';
    }
    
    
}
