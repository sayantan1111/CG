class Circle {
    double radius;

    Circle() {
        this(1.0); 
    }

    Circle(double radius) {
        
            this.radius = radius;
        }

    
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(); 
        System.out.println("Circle 1 Circumference: " + circle1.calculateCircumference());
        System.out.println("Circle 1 Area: " + circle1.calculateArea());

        Circle circle2 = new Circle(5.0);
        System.out.println("Circle 2 Circumference: " + circle2.calculateCircumference());
        System.out.println("Circle 2 Area: " + circle2.calculateArea());

      
    }
}