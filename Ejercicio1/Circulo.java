class Circulo extends Figura {
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Círculo [Color: " + color + ", Radio: " + radio + ", Área: " + String.format("%.2f", calcularArea()) + "]";
    }
}
