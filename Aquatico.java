public class Aquatico extends Automovel {
    public Aquatico (String marca, int ano, int portas) {
        super(marca, ano, portas);

   }

   public void exibirDados() {
    super.exibirDados();
    System.out.println("Portas: " + portas);

   }
}
