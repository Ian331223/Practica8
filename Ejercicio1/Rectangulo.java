class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(String color, double base, double altura) {
        super(color); // Llama al constructor de la clase padre
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Rectángulo [Color: " + color + ", Base: " + base + ", Altura: " + altura + ", Área: " + calcularArea() + "]";
    }
}
