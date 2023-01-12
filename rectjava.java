class Triangle{
double base;
double height;

Triangle(double base,double height);

this.base = base;
this.height = height;

void getArea(){
double area = 0.5*base*height;
System.out.println(area);
}
}