package com.company.Assesment;

interface Methods{
    int getArea();
    int  getParameter();
    void printDetails();
}
class Shape{
    private int length;
    private int breadth;
    private float radius;
    private int side;
    private int height;
    Shape(float r){
        this.radius = r;
    }
    Shape(int s){
        this.side = s;
    }
    Shape(int h,int l, int b, int s){
        this.length = l;
        this.breadth = b;
        this.side = s;
        this.height = h;
    }
    public void setLength(int l){
        this.length = l;
    }
    public void setHeight(int h){
        this.height = h;
    }
    public void setBreadth(int b){
        this.breadth = b;
    }
    public void setRadius(int r){
        this.radius = r;
    }
    public void setSide(int s){
        this.side = s;
    }
    public int getLength(){
        return this.length;
    }
    public int getHeight(){
        return this.height;
    }
    public int getBreadth(){
        return this.breadth;
    }
    public float getRadius(){
        return this.radius;
    }
    public int getSide(){
        return this.side;
    }
}
class Circle extends Shape implements Methods{
    Circle(float r) {
        super(r);
    }
    @Override
    public int getArea() {
        int area =(int) (Math.PI* Math.pow(getRadius(),2));
        return area;
    }

    @Override
    public int getParameter() {
        int perimeter = (int)(2*Math.PI*getRadius());
        return perimeter;
    }

    @Override
    public void printDetails() {
        System.out.println("Area of Circle : "+getArea());
        System.out.println("Perimeter" +
                " of Circle : "+getParameter());
    }
}
class Square extends Shape implements Methods{

    Square(int s) {
        super(s);
    }

    @Override
    public int getArea() {
        int area = getSide() * getSide();
        return area;
    }

    @Override
    public int getParameter() {
        int perimeter = 4*getSide();
        return perimeter;
    }

    @Override
    public void printDetails() {
        System.out.println("Area of Square : "+getArea());
        System.out.println("Perimeter of Square : "+getParameter());
    }
}
class Triangle extends Shape implements Methods{

    Triangle(int h,int l, int b, int s) {
        super(h, l, b, s);
    }

    @Override
    public int getArea() {
        int area = (getLength() * getBreadth())/ 2;
        return area;
    }

    @Override
    public int getParameter() {
        int perimeter = getSide()+getBreadth()+getLength();
        return perimeter;
    }

    @Override
    public void printDetails() {
        System.out.println("Area of Triangle : "+getArea());
        System.out.println("Perimeter of Triangle : "+getParameter());
    }
}
public class Shapes {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.printDetails();
        Square s = new Square(10);
        s.printDetails();
        Triangle t = new Triangle(5,7,9,4);
        t.printDetails();
    }
}
