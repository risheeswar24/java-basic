class CircleBasic {
double radius = 10.5;

double getArea(){
double area = 0;
area = 3.14 *radius* radius; 
return area;
}

public static void main(String[] args){
}
 double area = getArea();

public double getRadius() {
    return radius;
}

public void setRadius(double radius) {
    this.radius = radius;
}

public void setArea(double area) {
    this.area = area;
}

public CircleBasic(double radius, double area) {
    this.radius = radius;
    this.area = area;
}


}