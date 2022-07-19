package Principal;

record Rectangle(double length, double width) { public Rectangle(double length, double width) {
    if (length <= 0 || width <= 0) {
        throw new java.lang.IllegalArgumentException(
                String.format("Invalid dimensions: %f, %f", length,
                        width)); }
    if(1==1) System.out.println("Teste");
    this.length = length;
    this.width = width;
    }
}

public class ExemploExcecaoRecord {
    public static void main(String[] args) {
        System.out.println("Não gera exceção");
        Rectangle r1 = new Rectangle(10,10);
        System.out.println("Primeira exceção");
        //Rectangle r2 = new Rectangle(0,10);
        System.out.println("Segunda exceção");
        Rectangle r3 = new Rectangle(10, 0);
    }
}
