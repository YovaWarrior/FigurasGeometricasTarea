
package figuras;


public class Main {
    public static void main(String[] args) {
        // Crear instancias de figuras geométricas
        FiguraGeometrica circulo = new Circulo("Círculo", 7.3);
        FiguraGeometrica cuadrado = new Cuadrado("Cuadrado", 12.5);
        Rectangulo rectangulo = new Rectangulo("Rectángulo", 8.0, 3.0);
        Triangulo triangulo = new Triangulo("Triángulo", 4.7, 4.0, 3.0, 12.0, 9.0);

        System.out.println(circulo.getNombre());
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());

        System.out.println(cuadrado.getNombre());
        System.out.println("Área: " + cuadrado.calcularArea());
        System.out.println("Perímetro: " + cuadrado.calcularPerimetro());

        System.out.println(rectangulo.getNombre());
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());

        System.out.println(triangulo.getNombre());
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());
    }
}








        
