public class App {
  public static void main(String[] args){
    double triangleArea = calcTriangleArea(6.0, 2.0);
    System.out.println("面積：" + triangleArea);
  }

  public static double calcTriangleArea(double bottom, double height) {
    double area = (bottom * height) / 2;
    return area;
  }
}