public class FuncionarioCaixa {

    private String nome;
    private int idCaixa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdCaixa() {
        return idCaixa;
    }

    public void setIdCaixa(int idCaixa) {
        this.idCaixa = idCaixa;
    }

    public void receberPagamento(Pagamento pagamento){
        // TODO: Criar regras
    }

    public void emitirRecibo(Pedido pedido){
        // TODO: Criar regras
    }

}
