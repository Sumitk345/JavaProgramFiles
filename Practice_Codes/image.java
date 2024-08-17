import java.util.Scanner;

// JAVA CODE Q1.
// class image {
//   public static void main(String args[]) {
//     Scanner s1 = new Scanner(System.in);
//     System.out.println("Enter value for height :");
//     int height = s1.nextInt();
//     System.out.println("Enter value for width :");
//     int width = s1.nextInt();
//     float area = calculate_area(height, width);
//     System.out.println("Area of rectangle :" + area);
//     int peri = calculate_peri(height, width);
//     System.out.println("Perimeter of rectangle :" + peri);

//   }

//   public static int calculate_peri(int height, int width) {
//     return (2 * height + 2 * width);
//   }

//   public static float calculate_area(int height, int width) {
//     return (float) (height * width * 0.5);
//   }
// }

// JAVA CODE Q2.
class image {
  static int side;

  public static void main(String[] args) {
    Scanner s1 = new Scanner(System.in);
    side = s1.nextInt();
    int area_sq = area_square();
    System.out.println("Area of square :" + area_sq);

  }

  private static int area_square() {
    return side * side;
  }

}
