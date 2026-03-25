package application.usecase;

import java.util.List;

import domain.Estoque;
import domain.Produto;
import ports.input.GerenciarEstoqueInputPort;
import ports.output.ProdutoRepository;

public class GerenciarEstoqueUseCase implements GerenciarEstoqueInputPort {

    private ProdutoRepository produtoRepository;
    private Estoque estoque;

    public GerenciarEstoqueUseCase(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
        this.estoque = new Estoque();
    }

    @Override
    public void cadastrarProduto(String id, String nome, double preco) {
        Produto produto = new Produto(id, nome, preco);
        produtoRepository.salvar(produto);
    }

    @Override
    public Produto consultarProduto(String id) {
        return produtoRepository.buscarPorId(id);
    }

    @Override
    public void excluirProduto(String id) {
        Produto produto = produtoRepository.buscarPorId(id);
        if (produto == null) {
            throw new IllegalArgumentException("Produto não encontrado.");
        }
        produtoRepository.excluirPorId(id);
    }

    @Override
    public double calcularPrecoMedio() {
        List<Produto> produtos = produtoRepository.listarTodos();
        return estoque.calcularPrecoMedio(produtos);
    }
}