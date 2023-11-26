// Bicicleta.java
public class Bicicleta implements ImpactoEcologico {
    private String tipo;
    private boolean electrica;

    public Bicicleta(String tipo, boolean electrica) {
        this.tipo = tipo;
        this.electrica = electrica;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // Implementa el cálculo del impacto ecológico para una bicicleta
        // Puedes usar información específica sobre el tipo de bicicleta, uso de electricidad, etc.
        return electrica ? 0.05 : 0.01; // Ejemplo simplificado, ajusta según tus necesidades
    }

    @Override
    public String toString() {
        return "Bicicleta: " + tipo;
    }
}