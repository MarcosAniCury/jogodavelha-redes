public class Jogador {

    private String nickname;
    private Integer pontuacao;
    private String opcaoDeJogo;

    public Jogador() {
        this("","");
    }

    public Jogador(String nickname, String opcaoDeJogo) {
        this.nickname = nickname;
        this.opcaoDeJogo = opcaoDeJogo;
        this.pontuacao = 0;
    }

    public Jogador(String nickname, Integer pontuacao) {
        this.nickname = nickname;
        this.pontuacao = pontuacao;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Integer pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getOpcaoDeJogo() {
        return opcaoDeJogo;
    }

    public void setOpcaoDeJogo(String opcaoDeJogo) {
        this.opcaoDeJogo = opcaoDeJogo;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nickname='" + nickname + '\'' +
                ", pontuacao=" + pontuacao +
                ", opcaoDeJogo='" + opcaoDeJogo + '\'' +
                '}';
    }
}
