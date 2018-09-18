public class Voo {

    private String destino="";
    private String equipamento="";
    private int duracao= 0;
    private String origem="";

    public Voo(String destino, String equipamento, int duracao, String origem) {
        this.destino = destino;
        this.equipamento = equipamento;
        this.duracao = duracao;
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    @Override
    public String toString() {
        return "Voo{" +
                "destino='" + destino + '\'' +
                ", equipamento='" + equipamento + '\'' +
                ", duracao=" + duracao +
                ", origem='" + origem + '\'' +
                '}';
    }
}
