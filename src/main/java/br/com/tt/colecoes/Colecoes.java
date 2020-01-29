package br.com.tt.colecoes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Colecoes {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();

        List<Integer> lista = new ArrayList<>();
         
        for(int i = 0; i <= 10_000; i++){
              lista.add(i);
        }
        for (Integer i: lista) {
            System.out.print(i);
        }

        long tempo = System.currentTimeMillis() - inicio;
        System.out.println("\n\nTempo: " + tempo);
        
    }
}
