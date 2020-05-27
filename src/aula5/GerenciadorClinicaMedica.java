/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author anton
 */
public class GerenciadorClinicaMedica {

    static Scanner valor = new Scanner (System.in);
    
    private static BancoDeDados pessoas = new BancoDeDados();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa p1 = new Medico("123456");
        System.out.println("Informação do médico 1");
        p1.cadastrar();
        pessoas.addPessoa(p1);
        
        Pessoa p2 = new Medico("123456");
        System.out.println("Informação do médico 2");
        p2.cadastrar();
        pessoas.addPessoa(p2);
        
        System.out.println("Será que um médico é igual ao outro? " + p1.equals(p2));
        
        Pessoa p = new Paciente();
        System.out.println("Informação do paciente");
        p.cadastrar();
        pessoas.addPessoa(p);
        
        p = new Secretaria();
        System.out.println("Informação da secretaria");
        p.cadastrar();
        pessoas.addPessoa(p);
        
        Pessoa secretaria = new Secretaria();
        System.out.println("Informação da secretária: ");
        
        System.out.println("Qual CPF deseja buscar?");
        String cpf = valor.nextLine();
        Pessoa busca = pessoas.findByCpf(cpf);
        System.out.println(busca);
        
        System.out.println("Qual é o nome que deseja buscar?");
        String nome = valor.nextLine();
        List<Pessoa> buscaNomes = pessoas.listByNome(nome);
        System.out.println(buscaNomes);
        
    }  
}
