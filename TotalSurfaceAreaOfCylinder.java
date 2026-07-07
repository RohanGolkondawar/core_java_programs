public class TotalSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        int radius = Integer.parseInt(args[0]);
        int height = Integer.parseInt(args[1]);
        double surfaceAreaOfCylinder = (2*(Math.PI*Math.PI)*radius) * (2*Math.PI*radius*height);
        System.out.println(surfaceAreaOfCylinder);
    }
}