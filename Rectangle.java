class Rectangle extends Shape{
    protected double Length;
    protected double Width;
    
        public Rectangle (double Length, double Width, String Color, boolean Filled){
            this.Length = Length;
            this.Width = Width;
            this.Color = Color;
            this.Filled = Filled;
        }
        public Rectangle(){}
        public void setLength(double Length){
            this.Length = Length;
        }
        public void setwidth(double Width){
            this.Width = Width;
        }
        public double getLength(){
            return Length;
        }
        public double getWidth(){
            return Width;
        }
        public double getArea(){
            return Length * Width;
        }
        public double getPerimeter(){
            return 2 * (Length + Width);
        }
        public String toString(){
            return "The Rectangle is Color " + Color +" and it is " + isFilled() +" It has a Length of "+String.format("%.2fcm",getLength())+" and Width of "+String.format("%.2fcm",getWidth())+", Area of "+String.format("%.2fcm",getArea())+" and Perimeter of "+ String.format("%.2fcm",getPerimeter())+".";
        }
    }