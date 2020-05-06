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
public class Endereco implements Cloneable {
    
     private​ String rua;
     private​ String cep;
     private​ String cidade;
     
    //Além dos getters e setters
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    
   
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" + "rua=" + rua + ", cep=" + cep + ", cidade=" + cidade + '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }
    
    
    
    
    
    
     
}
