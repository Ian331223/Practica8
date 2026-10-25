public class MainFigura {
    public static void main(String[] args) {
        Figura miCirculo = new Circulo("Rojo", 5.0);
        Figura miRectangulo = new Rectangulo("Azul", 4.0, 6.0);

        System.out.println(miCirculo);
        System.out.println(miRectangulo);
    }
}
