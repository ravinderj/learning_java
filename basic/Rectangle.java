class Rectangle extends Shape {
  private final float length;
  private final float breadth;
  Rectangle(float length, float breadth){
    this.length = length;
    this.breadth = breadth;
  }
  Rectangle(float side){
    this(side, side);
  }
  public float getArea(){
    return length * breadth;
  }
  public float getPerimeter(){
    return 2 * (length + breadth);
  }
}
