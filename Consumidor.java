package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {


        Consumer<Produto> imprimir =
                p -> System.out.println(p.nome + " !!!");

        Produto p1 = new Produto("Caneta", 12.54, 0.09);
        Produto p2 = new Produto("Caralhos", 212.2, 0.10);
        Produto p3 = new Produto("Rubinho", 5000.0, 0.00);
        Produto p4 = new Produto("Alados", 252.2, 0.50);

        imprimir.accept(p1);

        List<Produto> produtos = Arrays.asList(p1,p2,p3,p4);

        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);

    }
}
