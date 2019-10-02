/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whats.the.area;

/**
 *
 * @author 20397
 */
import java.util.Scanner;
public class WhatsTheArea {
private static Scanner in = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int surfaceArea = 0;
surfaceArea += triangle();
surfaceArea += triangle();

surfaceArea += circle();
surfaceArea += circle();
surfaceArea += circle();

surfaceArea += parallelogram();

surfaceArea += square();
surfaceArea -= square();

//TODO: add calls to other methods for each of the shapes needed
System.out.println("\nThe total area of Michael’s truck is : " + surfaceArea);
    }
    public static int triangle()
{
System.out.println("\nThe area of a triangle is: 1/2 * base * height");
System.out.print("base > ");
int base = in.nextInt();
System.out.print("height > ");
int height = in.nextInt();
int area = (int)(0.5 * base * height);
System.out.println("The area of this shape is: " + area);
return area;
}
    public static int circle(){
    System.out.println("\nThe area of a circle is: pi * radius^2");
    System.out.print("radius > ");
    int radius = in.nextInt();
    int area = (int)(Math.PI * Math.pow(radius, 2));
    System.out.println("The area of the circle is: " + area);
    return area;
    }
    public static int parallelogram(){
    System.out.println("\nThe area of a parallelogram is: base * height");
    System.out.print("base > ");
    int base = in.nextInt();
    System.out.print("height > ");
    int height = in.nextInt();
    int area = (int)(base * height);
    System.out.println("The area of the parallelogram is: " + area);
    return area;
    }
    public static int square(){
    System.out.println("\nThe area of a square is: side^2");
    System.out.print("side > ");
    int side = in.nextInt();
    int area = (int)(Math.pow(side, 2));
    System.out.println("The area of the square is: " + area);
    return area;
    }
}
