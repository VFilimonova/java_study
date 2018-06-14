package task1;

public class Lesson2 {
    public static void main(String[] args) {
        Point p1 = new Point(5, 9);
        Point p2 = new Point(7, 8);

        System.out.println(" Растояние между точкой p1 с координатами " + p1 + " и точкой p2 с координатами" + p2 + " = " + (Math.sqrt(Math.pow(p1.x-p2.x,2)+ Math.pow(p1.y-p2.y,2))));
        System.out.println(p1.dist(p2));

    }
}
