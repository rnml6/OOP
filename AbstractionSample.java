public class AbstractionSample {
    public static void main(String[] args) {
        Circle circle = new Circle(10, "Black", true);
        System.out.printf("The Circle Radius is: %.2fcm \n",circle.getRadius());
        System.out.printf("The Circle Area is: %.2fcm \n",circle.getArea());
        System.out.printf("The Circle Perimeter is: %.2fcm \n" ,circle.getPerimeter());
        System.out.println(circle.toString());
        System.out.println();

        Rectangle rectangle = new Rectangle(14, 13, "Yellow", false);
        System.out.printf("The Rectangle Length is: %.2fcm \n",rectangle.getLength());
        System.out.printf("The Rectangle Width is: %.2fcm \n",rectangle.getWidth());
        System.out.printf("The Rectangle Area is: %.2fcm \n",rectangle.getArea());
        System.out.printf("The Rectangle Perimeter is: %.2fcm \n" ,rectangle.getPerimeter());
        System.out.println(rectangle.toString());
        System.out.println();
        
        Square square = new Square(14, 14, 14, "Blue", true);
        System.out.printf("The Square Side is: %.2fcm \n",square.getSide());
        System.out.printf("The Square Length is: %.2fcm \n",square.getLength());
        System.out.printf("The Square Width is: %.2fcm \n",square.getWidth());
        System.out.printf("The Square Area is: %.2fcm \n",square.getArea());
        System.out.printf("The Square Perimeter is: %.2fcm \n" ,square.getPerimeter());
        System.out.println(square.toString());
    }
}