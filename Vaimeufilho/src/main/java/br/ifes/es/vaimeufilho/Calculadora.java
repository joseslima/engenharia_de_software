/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.es.vaimeufilho;

import java.util.HashMap;

/**
 *
 * @author 1998547
 */
public class Calculadora {
    
    private HashMap<String,Integer> mapaNumeros;
    
    public Calculadora(){
        mapaNumeros = new HashMap<String,Integer>();
        mapaNumeros.put("I", 1);
        mapaNumeros.put("V", 5);
        mapaNumeros.put("X", 10);
        mapaNumeros.put("L", 50);
        mapaNumeros.put("C", 100);    
        mapaNumeros.put("D", 500);    
        mapaNumeros.put("M", 1000);    
    }
    
    public int calcular(String numeroRomano){
        
        return mapaNumeros.get(numeroRomano);
    }
    
}
