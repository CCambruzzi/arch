package ports.input;

import domain.Produto;

public interface GerenciarEstoqueInputPort {
    void cadastrarProduto(String id, String nome, double preco);
    Produto consultarProduto(String id);
    void excluirProduto(String id);
    double calcularPrecoMedio();
}