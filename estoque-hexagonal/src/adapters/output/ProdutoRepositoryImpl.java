package adapters.output;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import domain.Produto;
import ports.output.ProdutoRepository;

public class ProdutoRepositoryImpl implements ProdutoRepository {

    private HashMap<String, Produto> banco = new HashMap<>();

    @Override
    public void salvar(Produto produto) {
        banco.put(produto.getId(), produto);
    }

    @Override
    public Produto buscarPorId(String id) {
        return banco.get(id);
    }

    @Override
    public void excluirPorId(String id) {
        banco.remove(id);
    }

    @Override
    public List<Produto> listarTodos() {
        return new ArrayList<>(banco.values());
    }
}