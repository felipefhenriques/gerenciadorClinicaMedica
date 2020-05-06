/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anton
 */
public class BancoDeDados {
   
    private​ List<Pessoa> pessoas = new ArrayList<>();
     
    public​ void addPessoa(Pessoa pessoa) {
         pessoas.add(pessoa);
    }
    
    public void remove(Pessoa pessoa) {
        pessoas.remove(pessoa);
    }
    
    @Override
     public Object clone() throws CloneNotSupportedException{
         BancoDeDados b = (BancoDeDados) super.clone();
         b.pessoas = new ArrayList<>(b.pessoas);
         return b;
     }
}
