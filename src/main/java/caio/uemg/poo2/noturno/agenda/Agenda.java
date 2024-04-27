/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caio.uemg.poo2.noturno.agenda;

import java.util.ArrayList;
import caio.uemg.poo2.noturno.classes.Contato;
import caio.uemg.poo2.noturno.classes.ContatoPF;
import caio.uemg.poo2.noturno.classes.ContatoPJ;
import caio.uemg.poo2.noturno.enums.EstadoCivil;
import caio.uemg.poo2.noturno.enums.Pronome;
import java.util.Collections;
import java.util.Scanner;

public class Agenda {

    public static boolean cadastrarContato(Contato contato, ArrayList<Contato> listContato) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o nome do contato: ");
        String nome = scan.nextLine();

        System.out.print("Entre com o numero do contato: ");
        String numero = scan.nextLine();

        System.out.print("Entre com o email do contato: ");
        String email = scan.nextLine();

        System.out.print("Entre com o endereco do contato: ");
        String endereco = scan.nextLine();

        System.out.print("Entre com as observacoes: ");
        String observacoes = scan.nextLine();

        contato.setNome(nome);
        contato.setNumero(numero);
        contato.setEmail(email);
        contato.setEndereco(endereco);
        contato.setObservacoes(observacoes);
        return true;
    }

    public static boolean cadastrarContatoPF(ContatoPF contato, ArrayList<Contato> listContato) {
        if (cadastrarContato(contato, listContato)) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Entre com o cpf do contato: ");
            String cpf = scan.nextLine();

            System.out.print("Entre com a data de nascimento: ");
            String dataNasc = scan.nextLine();

            System.out.print("Entre com estado civil:\n1- Solteiro\n2- Casado\n3- Divorciado\n4- Viuvo\n\nSua opção: ");
            scan = new Scanner(System.in);
            int op = scan.nextInt();
            EstadoCivil estCivil = null;
            do {
                switch (op) {
                    case 1:
                        estCivil = EstadoCivil.SOLTEIRO;
                        break;
                    case 2:
                        estCivil = EstadoCivil.CASADO;
                        break;
                    case 3:
                        estCivil = EstadoCivil.DIVORCIADO;
                        break;
                    case 4:
                        estCivil = EstadoCivil.VIUVO;
                        break;
                    default:
                        System.out.println("Valor invalido. Tente novamente.");
                        break;
                }
            } while (op < 1 || op > 4);
            System.out.print("Entre com o pronome:\n1- Ele/Dele\n2- Ela/Dela\n3- Elu/Delu\n\nSua opção: ");
            op = scan.nextInt();
            Pronome pronome = null;
            do {
                switch (op) {
                    case 1:
                        pronome = Pronome.MASCULINO;
                        break;
                    case 2:
                        pronome = Pronome.FEMININO;
                        break;
                    case 3:
                        pronome = Pronome.NEUTRO;
                        break;
                    default:
                        System.out.println("Valor invalido. Tente novamente.");
                        break;
                }
            } while (op < 1 || op > 3);
            contato.setPronome(pronome);
            contato.setEstCivil(estCivil);
            contato.setDataNasc(dataNasc);
            contato.setCpf(cpf);
        }
        return true;
    }

    public static boolean cadastrarContatoPJ(ContatoPJ contato, ArrayList<Contato> listContato) {
        if (cadastrarContato(contato, listContato)) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Entre com o cnpj: ");
            String cnpj = scan.nextLine();
            
            System.out.print("Entre com a inscrição estadual: ");
            String inscEstadual = scan.nextLine();
            
            System.out.print("Entre com a razao social: ");
            String razaoSocial = scan.nextLine();
            
            System.out.print("Entre com o site: ");
            String site = scan.nextLine();
            
            contato.setCnpj(cnpj);
            contato.setInscEstadual(inscEstadual);
            contato.setRazaoSocial(razaoSocial);
            contato.setSite(site);
        }
        return true;
    }
    
    public static void menuCadastrarContato(ArrayList<Contato> listContato) {
        int op;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("\t\tMenu de cadastro de Contato\n\n1- Cadastro Pessoa Fisica\n2- Cadastro Pessoa Juridica\n3- Sair\n\nSua opção:");
            op = scan.nextInt();
            switch (op) {
                case 1:
                    ContatoPF contatoPF = new ContatoPF();
                    if (cadastrarContatoPF(contatoPF, listContato)) {
                        listContato.add(contatoPF);
                        System.out.println("Cadastro efetuado com sucesso.");
                    }
                    else {
                        System.out.println("Erro ao cadastrar contato de pessoa fisica.");
                    }
                    break;
                case 2:
                    ContatoPJ contatoPJ = new ContatoPJ();
                    if (cadastrarContatoPJ(contatoPJ, listContato)) {
                        listContato.add(contatoPJ);
                        System.out.println("Cadastro efetuado com sucesso.");
                    }
                    else {
                        System.out.println("Erro ao cadastrar contato de pessoa juridica.");
                    }
                    break;
                case 3:
                    System.out.println("Saindo do menu de cadastro...");
                    break;
                default:
                    System.out.println("Por favor entre com um valor válido.");
            }
        } while (op != 3);

    }

    public static Contato buscarContato(ArrayList<Contato> listContato) {
        String email;
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o email para buscar: ");
        email = scan.nextLine();
        Contato contatoRetorno = null;
        
        Contato contatoAux = new Contato();
        contatoAux.setEmail(email);
        int index = listContato.indexOf(contatoAux);
        
        if(index >= 0){
            contatoRetorno = listContato.get(index);
        }
        return contatoRetorno;
        
    }
    
    public static void imprimirContatoPesquisado(ArrayList<Contato> listContato) {
        
        Contato contato = buscarContato(listContato);
        
        if (contato != null) {
            contato.imprimirContato();
        } else {
            System.out.println("Contato não encontrado.");
        }
        
    }
    
    public static void removerContato(ArrayList<Contato> listContato) {
        
        Contato contato = buscarContato(listContato);
        
        if(contato != null){
            listContato.remove(contato);
            System.out.println("Contato removido com sucesso!");
        }else{
            System.out.println("Contato não encontrado");
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Contato> listContato = new ArrayList<>();
        int op;

        do {
            System.out.println("\t\tAgenda de Contatos\n\n1- Cadastrar Contato\n2- Pesquisar Contatos\n3- Remover Contatos\n4- Ordenar Contatos\n0- Sair\n\nSua opção: ");
            op = scan.nextInt();

            switch (op) {
                case 1:
                    menuCadastrarContato(listContato);
                    break;
                case 2:
                    imprimirContatoPesquisado(listContato);
                    break;
                case 3:
                    removerContato(listContato);
                    break;
                case 4:
                    Collections.sort(listContato, (Contato c1, Contato c2) -> c1.getEmail().compareTo(c2.getEmail()));
                    break;
                case 0:
                    System.out.println("Obrigado por utilizar o programa.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (op != 0);

    }
}
