/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

import java.util.Scanner;

/**
 *
 * @author anton
 */
public class Secretaria extends Pessoa implements Funcionario {
    
    private String departamento;
    private String ramal;

    @Override
    public double getRemuneracao() {
        return 4000;
    }

    @Override
    public String expediente() {
        return "Atendimento ao público das 8h00 às 18h00 no departamento de " 
                + departamento;
    }
 
    @Override
    public String atribuicoes() {
        return "Atendimento no departamento de " + departamento;
    }

    @Override
    public String getIdentificacao() {
        return "CPF: " + getCpf();
    }
    //TODO: completar a info
    
    @Override
    public void cadastrar() {
        super.cadastrar();
        Scanner s = new Scanner(System.in);
        
        System.out.println("Qual é o ramal?");
        ramal = s.next(); s.nextLine();
        
        System.out.println("Qual é o departamento?");
        departamento = s.nextLine();
    }   

    @Override
    public Object clone() throws CloneNotSupportedException{
//        Secretaria s = (Secretaria) super.clone();
//        s.departamento = departamento;
//        s.ramal = ramal;       é o mesmo que 
        return super.clone();
        
    }
    
    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }
    
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    
    @Override
    public String toString() {
        return "Secretaria: \n" + 
                super.toString() +
                "\nDepartamento=" + departamento + 
                "\nRamal=" + ramal;
    }
}
