import java.awt.*;

public class Animal {
    private String nome;
    private String  tipo;
    private String especie;

    public Animal(String nome, String tipo, String especie){
        this.nome = nome;
        this.tipo = tipo;
        this.especie = especie;
    }

    public  String toString() {
        return "nome: " + nome + "\ntipo: " + tipo + "\nespecie: " + especie;
    }

    public  String getNome() {
        return nome;
    }

    public void setNome() {
        this.nome = nome;
    }

    public  String getTipo() {
        return tipo;
    }

    public void setTipo() {
        this.tipo = tipo;
    }

    public  String getEspecie() {
        return especie;
    }

    public void setEspecie() {
        this.especie = especie;
    }
}
