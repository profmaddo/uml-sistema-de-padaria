import java.util.List;

public class SistemaVendas {

    private List<Pedido> listarPedidos;

    public List<Pedido> getListarPedidos() {
        return listarPedidos;
    }

    public void setListarPedidos(List<Pedido> listarPedidos) {
        this.listarPedidos = listarPedidos;
    }

    public void registrarVenda(Pedido pedido){
        // TODO: Criar regras de negócio
    }

    public void gerarRelatorioVendas(){
        // TODO: Criar regras de negócio
    }
}
