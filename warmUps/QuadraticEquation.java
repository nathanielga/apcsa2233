public class QuadraticEquation {

    // Constants for the coefficients of the quadratic equation
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String toVertexForm() {
        // Calculate the x and y coordinates of the vertex
        double x = -b / (2 * a);
        double y = a * x * x + b * x + c;

        // Return the equation in vertex form
        return String.format("y = %.2fx^2 + %.2fx + %.2f", a, b, c);
    }

    public static void main(String[] args)
    {

    }

}
