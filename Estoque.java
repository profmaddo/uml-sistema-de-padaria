import java.util.List;

public class Estoque {

    private List<Produto> listarProdutos;

    public List<Produto> getListarProdutos() {
        return listarProdutos;
    }

    public void setListarProdutos(List<Produto> listarProdutos) {
        this.listarProdutos = listarProdutos;
    }

    public void verificarDisponibilidade(Produto produto){
        // TODO: Criar regras
    }

    public void atualizarEstoque(Produto produto){
        // TODO: Criar regras
    }
}
