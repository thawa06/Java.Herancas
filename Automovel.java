public class Automovel extends Veiculo {
    private int portas;

    public Automovel(String marca, int ano, int portas) {
        super(marca, ano);
        this.portas = portas;
    }

    @Override

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Portas: " + portas);
    }
}