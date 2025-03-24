import java.util.List;

public class Pedido {

    private int idPedido;
    private Cliente cliente;
    private List<Produto> listarProdutos;
    private String status;

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getListarProdutos() {
        return listarProdutos;
    }

    public void setListarProdutos(List<Produto> listarProdutos) {
        this.listarProdutos = listarProdutos;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void adicionarProduto(Produto produto){
        // TODO: Criar regras
    }

    public void removerProduto(Produto produto){
        // TODO: Criar regras
    }

    public void calcularTotal(){
        // TODO: Criar regras
    }

    public void atualizarStatus(String status){
        // TODO: Criar regras
    }
}
