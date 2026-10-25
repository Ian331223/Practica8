class Pentagono extends FiguraGeometrica {
    private double lado;

    public Pentagono(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double perimetro = 5 * lado;
        double apotema = lado / (2 * Math.tan(Math.toRadians(36)));
        return (perimetro * apotema) / 2.0;
    }
}
