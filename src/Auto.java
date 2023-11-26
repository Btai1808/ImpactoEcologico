// Auto.java
public class Auto implements ImpactoEcologico {
    private String modelo;
    private double emisiones;

    public Auto(String modelo, double emisiones) {
        this.modelo = modelo;
        this.emisiones = emisiones;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // Implementa el cálculo del impacto ecológico para un auto
        // Puedes usar información específica sobre las emisiones, eficiencia de combustible, etc.
        return emisiones * 0.2; // Ejemplo simplificado, ajusta según tus necesidades
    }

    @Override
    public String toString() {
        return "Auto: " + modelo;
    }
}
