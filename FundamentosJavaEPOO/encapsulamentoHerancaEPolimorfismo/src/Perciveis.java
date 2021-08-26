public class Perciveis extends Product {

    private int diasParaOVencimento;
    double precoFinal;

    public Perciveis(String name, double price) {
        super(name, price);
    }

    public double calcular(int quantidadeOfProdutos,int diasParaOVencimento) {

        if (diasParaOVencimento == 1) {
            precoFinal = (quantidadeOfProdutos * this.getPrice()) / 4;
        }
        else if (diasParaOVencimento == 2) {
            precoFinal = (quantidadeOfProdutos * this.getPrice()) / 3;
        }
        else if (diasParaOVencimento == 3){
            precoFinal = (quantidadeOfProdutos * this.getPrice()) / 2;
        }
        return precoFinal;
    }
}
