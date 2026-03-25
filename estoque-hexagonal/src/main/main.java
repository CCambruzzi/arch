package main;

import adapters.input.EstoqueController;
import adapters.output.ProdutoRepositoryImpl;
import application.usecase.GerenciarEstoqueUseCase;
import ports.input.GerenciarEstoqueInputPort;
import ports.output.ProdutoRepository;

public class Main {

    public static void main(String[] args) {

        // 🔌 Adapter de saída
        ProdutoRepository repository = new ProdutoRepositoryImpl();

        // 🧠 Use Case
        GerenciarEstoqueInputPort useCase =
                new GerenciarEstoqueUseCase(repository);

        // 🎮 Adapter de entrada
        EstoqueController controller =
                new EstoqueController(useCase);

        // 🚀 Execução
        controller.executar();
    }
}