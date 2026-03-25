package adapters.input;

import application.usecase.GerenciarEstoqueUseCase;
import domain.Produto;
import ports.input.GerenciarEstoqueInputPort;
import ports.output.ProdutoRepository;
import adapters.output.ProdutoRepositoryImpl;

public class EstoqueController {

    public static void main(String[] args) {

        ProdutoRepository repository = new ProdutoRepositoryImpl();

        GerenciarEstoqueInputPort useCase =
            new GerenciarEstoqueUseCase(repository);

        useCase.cadastrarProduto("p1", "Teclado Mecânico", 250.00);
        useCase.cadastrarProduto("p2", "Mouse Gamer", 180.00);
        useCase.cadastrarProduto("p3", "Monitor 24\"", 920.00);

        Produto produto = useCase.consultarProduto("p2");
        System.out.println(produto.getNome());

        double precoMedio = useCase.calcularPrecoMedio();
        System.out.println("Preço médio: " + precoMedio);

        useCase.excluirProduto("p1");
    }
}