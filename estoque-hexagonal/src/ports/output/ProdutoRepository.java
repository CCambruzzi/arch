package ports.output;

import java.util.List;
import domain.Produto;

public interface ProdutoRepository {
    void salvar(Produto produto);
    Produto buscarPorId(String id);
    void excluirPorId(String id);
    List<Produto> listarTodos();
}