public class MainFiguras {
    public static void main(String[] args) {
        FiguraGeometrica[] figuras = {
            new Circulo(5.0),
            new Cuadrado(4.0),
            new Rectangulo(3.0, 6.0),
            new Triangulo(4.0, 5.0),
            new Pentagono(6.0)
        };

        for (int i = 0; i < figuras.length; i++) {
            double area = figuras[i].calcularArea();
            System.out.println("Área de la figura " + (i + 1) + " (" + figuras[i].getClass().getSimpleName() + "): " + String.format("%.2f", area));
        }
    }
}
