package combobox;

public class Pessoa {

    private String nome;
    private String sobrenome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Pessoa(String nome, String sobrenome) {
        this.setNome(nome);
        this.setSobrenome(sobrenome);
    }

    public String toString() {
        return nome + " " + sobrenome;
    }

}
