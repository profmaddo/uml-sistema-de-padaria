public class Atendente {

    private String nome;
    private int idAtendente;
    private Pedido pedido;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdAtendente() {
        return idAtendente;
    }

    public void setIdAtendente(int idAtendente) {
        this.idAtendente = idAtendente;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void registrarPedido(Pedido pedido){
        // TODO: Criar a regra de negócio para registrar pedido
    }

    public void consultarEstoque(){
        // TODO: Implemetar regra
    }

    public void alterarPedido(Pedido pedido){

    }
}
