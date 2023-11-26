// Edificio.java
public class Edificio implements ImpactoEcologico {
    private String nombre;
    private double consumoEnergetico;

    public Edificio(String nombre, double consumoEnergetico) {
        this.nombre = nombre;
        this.consumoEnergetico = consumoEnergetico;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // Implementa el cálculo del impacto ecológico para un edificio
        // Puedes usar información específica sobre el consumo energético, materiales de construcción, etc.
        return consumoEnergetico * 0.1; // Ejemplo simplificado, ajusta según tus necesidades
    }

    @Override
    public String toString() {
        return "Edificio: " + nombre;
    }
}