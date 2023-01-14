public class TestLine2D {
    public static void main (String[]args){
        Point p1 = new Point();
        Point p2 = new Point(3, 4);
        Point p3 = new Point(4, 9);
        Point p4 = new Point(6, 8);

        Line2D l1 = new Line2D(p1, p2);
        Line2D l2 = new Line2D(p3, p4);
        Line2D l3 = new Line2D(4, 9, 6, 8);

        System.out.println("The end points: \np1: x = " + p1.getX() + ", y = " + p1.getY() + "\np2: x = " + p2.getX() + " , y = " + p2.getY());
        System.out.println("p3: x = " + p3.getX() + ", y = " + p3.getY() + "\np4: x = " + p4.getX() + " , y = " + p4.getY());

        System.out.println("Testing constructor using 2 Point objects and the toString method: \nLine 1: " + l1 + "\nLine 2: " + l2 + "\nLine 3: " + l3);

        System.out.println("Testing getP1 and getP2 methods: " + "\nLine 1, getP1: x = " + l1.getP1() + "\nLine 1, getP2: x = " + l1.getP2());
        System.out.println("Line 2, getP1: x = " + l2.getP1() + "\nLine 2, getP2: x = " + l2.getP2());

        System.out.println("Testing getSlope: " + "\nLine1 slope: " + l1.getSlope() + "\nLine2 slope: " + l2.getSlope());

        System.out.println("Testing isCollinear: " + "\nLine1 and p3: " + l1.isCollinear(p3) + "\nLine1 and p4: " + l1.isCollinear(p4));
    }
}
