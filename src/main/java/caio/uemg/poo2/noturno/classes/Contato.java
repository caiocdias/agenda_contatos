/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caio.uemg.poo2.noturno.classes;

/**
 *
 * @author Caio Cezar Dias
 */
public class Contato {

    private String numero;
    private String email;
    private String endereco;
    private String nome;
    private String observacoes;

    public Contato() {
    }

    public Contato(String numero, String email, String endereco, String nome, String observacoes) {
        this.setNumero(numero);
        this.setEmail(email);
        this.setEndereco(endereco);
        this.setNome(nome);
        this.setObservacoes(observacoes);
    }
    
    //Gets
    public String getNumero() {
        return numero;
    }
    public String getEmail() {
        return email;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getNome() {
        return nome;
    }
    public String getObservacoes() {
        return observacoes;
    }
    
    //Sets
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    public void imprimirContato() {
        System.out.println("\n\t\tContato\n\n");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Numero: " + this.getNumero());
        System.out.println("Observacoes: " + this.getObservacoes());
    }
}
