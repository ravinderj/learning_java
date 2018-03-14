import java.util.*;
import java.io.*;

class AreaCalculator {
  public static void printArea(Shape shape){
    System.out.println(shape.getArea());
  }
  public static void printPerimeter(Rectangle rect) throws Exception{
    FileReader reader=new FileReader("message.properties");
    Properties p=new Properties();
    p.load(reader);
    System.out.println(p.getProperty("message"));
    System.out.println(rect.getPerimeter());
  }
  public static void main(String[] args) throws Exception{
    System.out.println("printing");
    printArea(new Rectangle(2,3));
    printArea(new Square(2));
    printPerimeter(new Square(3));
    printPerimeter(new Rectangle(2,3));
  }
}
