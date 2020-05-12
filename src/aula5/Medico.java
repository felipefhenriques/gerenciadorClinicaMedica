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
public class Medico extends Pessoa implements Funcionario, Cloneable{
    
    private int crm;
    private String especialidade;
    private Paciente[] pacientes;

    // Construtor padrão
    public Medico() { }
    
    public Medico(String cpf) {
        super(cpf);
    }

    @Override
    public double getRemuneracao() {
        return 10000;
    }

    @Override
    public String expediente() {
        return "Atendimento das 9h00 às 17h00 no setor de " + especialidade;
    }
    
    @Override
    public String atribuicoes() {
        return "Atendimento na especialidade de " + especialidade;
    }

    @Override
    public String getIdentificacao() {
        return "CRM: " + crm;
    }
    
    @Override
    public void cadastrar() {
        super.cadastrar();
        
        Scanner s = new Scanner(System.in);
        System.out.println("Qual é o CRM?");
        crm = s.nextInt(); s.nextLine();
        
        System.out.println("Qual é a especialidade?");
        especialidade = s.nextLine();
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("CRM: " + crm);
        System.out.println("Especialidade: " + especialidade);
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        Medico m = (Medico) super.clone();
        
        //Clonando array de pacientes
        m.pacientes = new Paciente[pacientes.length];
        for(int i = 0; i < pacientes.length; i++){
            //m.pacientes[i] = (Paciente) pacientes[i].clone(); <- pode causar redundancia NESSE caso
            //Aqui são os mesmos pacientes, então fazer uma copia rasa não é um problema
            m.pacientes[i] = pacientes[i]; 
        }
        return m;
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
        return "Medico:\n" + super.toString() +
                "\nCRM=" + crm + 
                "\nEspecialidade=" + especialidade;
    }
}
