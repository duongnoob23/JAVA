

class Point2{
    private double x,y;

    

    public Point2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double distance(Point2 a)
    {
        return Math.sqrt(Math.pow(x-a.getX(),2 )+Math.pow(y-a.getY(), 2));
    }
}