public class Padeiro {

    private String nome;
    private int idPadeiro;
    private Produto produto;
    private Estoque estoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdPadeiro() {
        return idPadeiro;
    }

    public void setIdPadeiro(int idPadeiro) {
        this.idPadeiro = idPadeiro;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public void produzirProduto(Produto produto){
            // TODO: Criar a lógica para produzir produto
    }

    public void atualizarEstoque(Estoque estoque){
           // TODO: Criar a lógica para atualizar o estoque
    }

}
