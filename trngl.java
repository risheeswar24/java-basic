class Triangle{
double base;
double height;

Triangle(double base,double height);

this.base = base;
this.height = height;

void getArea(){
double area = 0.5*base*height;
}
Public static void main(String[] args){
Triangle obj = new Triangle(5,10);
System.out.println(area);
}
}
