/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caio.uemg.poo2.noturno.classes;

/**
 *
 * @author Caio Cezar Dias
 */
public class ContatoPJ extends Contato {

    private String cnpj;
    private String inscEstadual;
    private String razaoSocial;
    private String site;

    public ContatoPJ() {
    }

    public ContatoPJ(String cnpj, String inscEstadual, String razaoSocial, String site, String numero, String email, String endereco, String nome, String observacoes) {
        super(numero, email, endereco, nome, observacoes);
        this.setCnpj(cnpj);
        this.setInscEstadual(inscEstadual);
        this.setRazaoSocial(razaoSocial);
        this.setSite(site);
    }

    //Gets
    public String getCnpj() {
        return cnpj;
    }
    public String getInscEstadual() {
        return inscEstadual;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public String getSite() {
        return site;
    }

    //Sets
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public void setSite(String site) {
        this.site = site;
    }

    @Override
    public void imprimirContato() {
        super.imprimirContato();
        System.out.println("CNPJ: " + this.getCnpj());
        System.out.println("Inscrição Estadual: " + this.getInscEstadual());
        System.out.println("Razão Social: " + this.getRazaoSocial());
        System.out.println("Site: " + this.getSite());
    }

}
