/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package caio.uemg.poo2.noturno.enums;

/**
 *
 * @author Caio Cezar Dias
 */
public enum EstadoCivil {
    SOLTEIRO ("Solteiro"), CASADO("Casado"), DIVORCIADO("Divorciado"), VIUVO("Viúvo");
    
    private final String descricao;

    private EstadoCivil(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }
}
