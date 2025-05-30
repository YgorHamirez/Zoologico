public class Animal {
    private String nome;
    private String tipo;
    private String especie;

    public Animal(String nome, String tipo, String especie) {
        this.nome = nome;
        this.tipo = tipo;
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "nome: " + nome + "\ntipo: " + tipo + "\nespecie: " + especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}