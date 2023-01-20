public class Point{
    private int x, y; 

    public Point(){ 
        x = 0;
        y = 0;
    }

    public Point(int x, int y){ 
        this.x = x; 
        this.y = y;
    }

    public int getX(){ 
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int newX){
        x = newX;
    }

    public void setY(int newY){
        y = newY;
    }

    public int manhattanDistance(Point other){
        return Math.abs(this.x - other.x) + Math.abs(this.y - other.y);
    }

    public boolean isCollinear(Point p1, Point p2){ 
        double yDiff = this.y - p1.y;
        double xDiff = this.x - p1.x;
        double yDiff2 = p1.y - p2.y; 
        double xDiff2 = p1.x - p2.x;

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

    public String toString(){
        return "x = " + x + ", y = " + y;
    }
}