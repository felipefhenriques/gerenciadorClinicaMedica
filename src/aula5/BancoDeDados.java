/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author anton
 */
public class BancoDeDados {
   
    //private​ List<Pessoa> pessoas = new ArrayList<>();
    
    private Set<Pessoa> set = new HashSet<>();
    private SortedMap<String, Pessoa> byNome = new TreeMap<>(); // Ou hash para busca de somente um
    private Map<String, Pessoa> byCpf = new TreeMap<>();
    private Map<Integer, Medico> byCrm = new TreeMap<>();
    
    
    
    
    public​ void addPessoa(Pessoa pessoa) {
         
        if(set.add(pessoa)){
            byNome.put(pessoa.getNome(), pessoa);
            byCpf.put(pessoa.getCpf(), pessoa);
            if(pessoa instanceof Medico){
                Medico medico = (Medico) pessoa;
                byCrm.put(medico.getCrm(), medico);
            }
        }
         //pessoas.add(pessoa);
    }
    
    public void remove(Pessoa pessoa) {
        if(set.contains(pessoa)){
            set.remove(pessoa);
            //Remoçao por chave
            byCpf.remove(pessoa.getCpf());
            byNome.remove(pessoa.getNome());
            if(pessoa instanceof Medico){
                Medico medico = (Medico) pessoa;
                byCrm.remove(medico.getCrm());
            }
        }
        //pessoas.remove(pessoa);
    }
    
    public List<Pessoa> listByNome(String nomeInicial){
        Map<String, Pessoa> submap = byNome.tailMap(nomeInicial);
        List<Pessoa> lista = new ArrayList<>();
                
        for(String nome: submap.keySet()){
            if(nome.startsWith(nomeInicial)){
                lista.add(submap.get(nome));
            } else {
                break;
            }
        }
        return lista;
        
    }
    
    public Pessoa findByNome(String nome){
        return byNome.get(nome);
    }
    
    public Pessoa findByCpf(String cpf){
        return byCpf.get(cpf);
    }
    
    public Pessoa findByCrm(int crm){
        return byCrm.get(crm);
    }
    
    @Override
     public Object clone() throws CloneNotSupportedException{
         BancoDeDados b = (BancoDeDados) super.clone();
         b.set = new HashSet<>(b.set);
         return b;
     }
}
