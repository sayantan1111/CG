class Circle {
    double radius;

       
    Circle(double radius){
        this.radius=radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    void displayArea() {
        System.out.println("Area of the circle: " + calculateArea());
    }

    void displayCircumference() {
        System.out.println("Circumference of the circle: " + calculateCircumference());
    }

    public static void main(String[] args) {
      
            Circle circle1 = new Circle(5.0);
            circle1.displayArea();
            circle1.displayCircumference();

        }
        
    }
