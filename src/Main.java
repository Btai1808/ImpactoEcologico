import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de cada clase
        Edificio edificio = new Edificio("Edificio A", 10000);
        Auto auto = new Auto("Sedan", 150);
        Bicicleta bicicleta = new Bicicleta("Montaña", false);

        // Colocar referencias en un ArrayList<ImpactoEcologico>
        ArrayList<ImpactoEcologico> listaImpactoEcologico = new ArrayList<>();
        listaImpactoEcologico.add(edificio);
        listaImpactoEcologico.add(auto);
        listaImpactoEcologico.add(bicicleta);

        // Iterar a través del ArrayList e invocar polimórficamente el método obtenerImpactoEcologico
        for (ImpactoEcologico objeto : listaImpactoEcologico) {
            System.out.println(objeto);
            System.out.println("Impacto ecológico: " + objeto.obtenerImpactoEcologico());
            System.out.println("======================");
        }
    }
}