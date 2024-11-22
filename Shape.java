abstract class Shape{
    protected String Color;
    protected Boolean Filled;

    public void setColor(String Color){
    this.Color = Color;
    }
    public void setFilled(Boolean Filled) {
        this.Filled = Filled;
    }
    public String getColor(){
        return Color;
    }
    public String isFilled(){
        if (Filled){
            return "Filled.";
        }else{
            return "Not Filled.";
        }
    }
    abstract double getArea();

    abstract double getPerimeter();

    public String toString(){

    return "The Shape is color " + Color +" and it is " + Filled +".";     
    }
}