/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package caio.uemg.poo2.noturno.enums;

/**
 *
 * @author Caio Cezar Dias
 */
public enum Pronome {
    MASCULINO("Ele/Dele"), FEMININO("Ela/Dela"), NEUTRO("Elu/Delu");
    
    private final String descricao;
    
    Pronome(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
}
