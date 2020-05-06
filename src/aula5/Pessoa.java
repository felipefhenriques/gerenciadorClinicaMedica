/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author anton
 */
public abstract class Pessoa implements Cloneable {

    private String nome;
    private​ String cpf;
    private​ Endereco endereco;

    // Construtor padrão
    protected Pessoa() { }
        
    protected Pessoa(String cpf) {
        this.cpf = cpf;
    }
    
    //Métodos abstratos
    public abstract String atribuicoes();
    public abstract String getIdentificacao();

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Pessoa) {
            Pessoa p = (Pessoa) obj;
            if(this.cpf.equals(p.cpf) && this.nome.equals(p.nome)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (nome+cpf).hashCode();
    }

    
    
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void cadastrar() {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual é o nome?");
        this.nome = s.nextLine();
        
        if(cpf == null) {
            System.out.println("Qual é o CPF?");
            this.cpf = s.next(); s.nextLine();
        } else {
            System.out.println("CPF já cadastrado");
        }
        
        Endereco e = new Endereco();
        System.out.println("Qual é a rua?");
        String rua = s.nextLine();
        e.setRua(rua);
        
        System.out.println("Qual é o CEP?");
        String cep = s.next();
        e.setCep(cep);
        
        System.out.println("Qual é a cidade?");
        String cidade = s.next();
        e.setCidade(cidade);
        
        this.endereco = e;
    }
    

     public​ void info() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Endereço: " + this.getEndereco().getRua());
    }
     
    @Override
   protected Object clone() throws CloneNotSupportedException{
       Pessoa p = (Pessoa) super.clone();
       p.endereco = (Endereco) endereco.clone();
       return p;
   }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + "\n, cpf=" + cpf + "\n, endereco=" + endereco + '}';
    }
}
