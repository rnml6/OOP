class Square extends Rectangle{
    private double Side;
    
    public Square (double Side, double Length, double Width, String Color, boolean Filled){
        this.Side = Side;
        this.Length = Length;
        this.Width = Width;
        this.Color = Color;
        this.Filled = Filled;
     }
    public void setSide(double Side){
        this.Side = Side;
    }
    public double getSide(){
        return Side;
    }
    public double getArea(){
        return Side * Side;
}
public double getPerimeter(){
    return 4 * Side;
}
public String toString(){
    return "The Square is Color "+ Color + " and it is " +isFilled()+ " It has a Side of "+String.format("%.2fcm",getSide() )+" with an Area of "+ String.format("%.2fcm", getArea())+" and a Perimeter of "+String.format("%.2fcm", getPerimeter());
}
}