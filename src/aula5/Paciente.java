/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

/**
 *
 * @author anton
 */
public class Paciente extends Pessoa implements Cloneable{
    
    private Medico medico;

    @Override
    public String atribuicoes() {
        return "Atendimento pelo(a) Dr(a). " + medico.getNome();
    }

    @Override
    public String getIdentificacao() {
        return "CPF: " + getCpf();
    }

    @Override
    public void cadastrar() {
        super.cadastrar();
        
        medico = new Medico();
        medico.cadastrar();
    }

    @Override
    public void info() {
        super.info();
        
        System.out.println(
                "O médico responsável pelo paciente "
                + super.getNome()+ " é " + medico.getNome()
        );
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
      Paciente p = (Paciente) super.clone();
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
        return "Paciente: \n" +
                super.toString() +
                "Médico: " + medico;
    }
    
}
