class box{
    double length;
    double width;
    double height;

    public box(double l,double w,double h){
        length=l;
        width=w;
        height=h;
    }
    public double volume(){
        return length*width*height;
    }
}

