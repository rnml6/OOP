class Circle extends Shape{
    private double Radius;

    public Circle(double Radius, String Color, boolean Filled){
        this.Radius = Radius;
        this.Color = Color;
        this.Filled = Filled;
    }
    public void setRadius(double Radius){
        this.Radius = Radius;
    }
    public double getRadius(){
        return Radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(Radius, 2);
    }
    public double getPerimeter(){
        return 2 * Math.PI * Radius;
    }
    public String toString(){
        return "The Circle is Color " + Color +" and it is " + isFilled() +" It has a Radius of "+ String.format("%.2fcm", getRadius())+", Area of "+String.format("%.2fcm",getArea())+" and Perimeter of "+String.format("%.2fcm",getPerimeter())+".";
    }
}