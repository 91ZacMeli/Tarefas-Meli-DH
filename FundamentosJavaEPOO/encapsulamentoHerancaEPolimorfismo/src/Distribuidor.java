import java.util.ArrayList;
import java.util.List;

public class Distribuidor extends Product{

    public Distribuidor(String name, double price) {
        super(name, price);
    }

    public static void main(String[] args) {

        List<Product> produtos= new ArrayList<>();

        produtos.add(new Perciveis("Carne", 39.9));
        produtos.add(new Perciveis("Frango", 19.9));
        produtos.add(new Perciveis("Queijo", 39.9));
        produtos.add(new Perciveis("Carne", 39.9));
        produtos.add(new Perciveis("Carne", 39.9));

        produtos.add(new NaoPerecivel("Arroz", 22.5));
        produtos.add(new NaoPerecivel("Arroz", 22.5));
        produtos.add(new NaoPerecivel("Arroz", 22.5));
        produtos.add(new NaoPerecivel("Arroz", 22.5));
        produtos.add(new NaoPerecivel("Arroz", 22.5));

    }
}
