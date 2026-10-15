public class Furgao extends Veiculo{
    protected String marca;
    protected int ano;
    

    public Furgao(String marca, int ano) {
        super(marca, ano);

        this.marca = marca;
        this.ano = ano;
    }

    public void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);

    }

}
