public class NaoPerecivel extends Product{
    private String tipo;

    public NaoPerecivel(String name, double price) {
        super(name, price);
    }

    @Override
    public double calcular(int quantidadeOfProdutos) {
        return super.calcular(quantidadeOfProdutos);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
