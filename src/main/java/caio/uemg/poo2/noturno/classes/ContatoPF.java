/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caio.uemg.poo2.noturno.classes;

import caio.uemg.poo2.noturno.enums.EstadoCivil;
import caio.uemg.poo2.noturno.enums.Pronome;
import java.util.Date;

public class ContatoPF extends Contato {

    private String cpf;
    private String dataNasc;
    private EstadoCivil estCivil;
    private Pronome pronome;

    public ContatoPF() {
    }

    public ContatoPF(String cpf, String dataNasc, EstadoCivil estCivil, Pronome pronome, String numero, String email, String endereco, String nome, String observacoes) {
        super(numero, email, endereco, nome, observacoes);
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.estCivil = estCivil;
        this.pronome = pronome;
    }
    
    //Gets
    public String getCpf() {
        return cpf;
    }
    public String getDataNasc() {
        return dataNasc;
    }
    public EstadoCivil getEstCivil() {
        return estCivil;
    }
    public Pronome getPronome() {
        return pronome;
    }

    
    //Sets
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    public void setEstCivil(EstadoCivil estCivil) {
        this.estCivil = estCivil;
    }
    public void setPronome(Pronome pronome) {
        this.pronome = pronome;
    }

    @Override
    public void imprimirContato() {
        super.imprimirContato(); 
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Data de Nascimento: " + this.getDataNasc());
        System.out.println("Estado Civil: " + this.getEstCivil());
        System.out.println("Pronomes: " + this.getPronome());
        
    }
    
    
}
