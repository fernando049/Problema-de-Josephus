package meu;
public class Pessoa {

    private int numero;
    private String nome;
    private String telefone;
    private String endereco;
    private String cpf;

    public Pessoa(int numero, String nome, String telefone, String endereco, String cpf) {
        this.numero = numero;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    public int getNumero() {
        return numero;
    }

    public String toString() {
        return "Pessoa " + numero + ": " + nome + ", Telefone: " + telefone + ", Endereço: " + endereco + ", CPF: " + cpf;
    }
}