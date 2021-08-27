import java.util.ArrayList;
import java.util.List;

public class Distribuidor extends Product{

    public Distribuidor(String name, double price) {
        super(name, price);
    }

    public static void main(String[] args) {

        List<Product> produtos= new ArrayList<>();
        Product item = new Product();

//        produtos.add(new Perciveis("Carne", 39.99, ));
//        produtos.add(new Pereciveis())
//        produtos.add(new Perciveis("Frango", 19.99));
//        produtos.add(new Perciveis("Queijo", 39.99));
//        produtos.add(new Perciveis("Carne", 39.99));
//        produtos.add(new Perciveis("Iorgute", 3.99));

        produtos.add(new NaoPerecivel("Arroz", 22.5));
        produtos.add(new NaoPerecivel("feijão", 6.55));
        produtos.add(new NaoPerecivel("Oleo", 7.25));
        produtos.add(new NaoPerecivel("Sal", 3.45));
        produtos.add(new NaoPerecivel("Acucar", 2.5));

        item.inserirItem(produtos);
        item.mostrarProdutos();
//        System.out.println(item.calcular(15));
    }
}
