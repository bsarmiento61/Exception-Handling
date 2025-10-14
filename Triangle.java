// Custom Exception
class IllegalTriangleSideException extends Exception {
    public IllegalTriangleSideException(String message) {
        super(message);
    }
}

// Triangle Class
class Triangle {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public boolean checkSides() throws IllegalTriangleSideException {
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
            return true;
        } else {
            throw new IllegalTriangleSideException("Invalid triangle sides: The sum of any two sides must be greater than the third side.");
        }
    }
}

// Main Class
class TriangleTest {
    public static void main(String[] args) {
        Triangle[] triangles = {
            new Triangle(3, 4, 5),   // Valid
            new Triangle(1, 2, 3),   // Invalid
            new Triangle(5, 5, 8)    // Valid
        };

        for (int i = 0; i < triangles.length; i++) {
            try {
                if (triangles[i].checkSides()) {
                    System.out.println("Triangle " + (i + 1) + " is valid.");
                }
            } catch (IllegalTriangleSideException e) {
                System.out.println("Triangle " + (i + 1) + " error: " + e.getMessage());
            }
        }
    }
}
