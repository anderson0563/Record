package Principal;

record RectangleStatic(double length, double width) {

    static double goldenRatio;


    static {
        goldenRatio = (1 + Math.sqrt(5)) / 2;
    }

    public static RectangleStatic createGoldenRectangle(double width) {
        return new RectangleStatic(width, width * goldenRatio);
    }
}

public class ExemploRecordStatic {
    public static void main(String[] args) {
        System.out.println(RectangleStatic.goldenRatio);
    }
}
