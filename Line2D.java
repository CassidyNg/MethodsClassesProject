public class Line2D {
    private Point p1, p2;

    public Line2D(Point p1, Point p2){ 
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line2D(int x1, int y1, int x2, int y2){ 
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
    }

    public String getP1(){ //Originally returned Point object's memory location 
        int x = p1.getX();
        int y = p1.getY();
        return "x = " + x + ", y = " + y;
    }

    public String getP2(){ //Changed to return String naming the x and y values of the Point object
        int x = p2.getX();
        int y = p2.getY();
        return "x = " + x + ", y = " + y;
    }

    public String toString(){
        return "[(" + p1.getX() + ", " + p1.getY() + "), (" + p2.getX() + ", " + p2.getY() + ")]";
    }

    public double getSlope(){
        double slope = (double)(p1.getY() - p2.getY()) / (p1.getX() - p2.getX());
        return slope;
    }

    public boolean isCollinear(Point p){
        double yDiff = p1.getY() - p2.getY();
        double xDiff = p1.getX() - p2.getX();
        double yDiff2 = p2.getY() - p.getY();
        double xDiff2 = p2.getX() - p.getX();

        double slope = yDiff / xDiff;
        double slope2 = yDiff2 / xDiff2;

        if(yDiff == 0 || xDiff == 0){
            slope = 0;
        }
        if(yDiff2 == 0 || xDiff2 == 0){
            slope2 = 0;
        }

        if(Math.abs(slope - slope2) <= 0.01){
            return true;
        }
        return false;
    }
}
