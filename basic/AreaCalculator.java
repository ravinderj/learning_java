class AreaCalculator {
  public static void printArea(Shape shape){
    System.out.println(shape.getArea());
  }
  public static void printPerimeter(Rectangle rect){
    System.out.println(rect.getPerimeter());
  }
  public static void main(String[] args){
    printArea(new Rectangle(2,3));
    printArea(new Square(2));
    printPerimeter(new Square(3));
    printPerimeter(new Rectangle(2,3));
  }
}
