package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Atividade1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Joao");
        list.add("Bob");
        list.add("Percival");
        list.add("Paul");
        list.add("Lara");
        list.add("Vitor");
        
        list.add(2,"Marco"); // Adiciona um valor na posição 2

        System.out.println(list.size()); // Verifica o tamanho da lista | Quantos elementos tem

        list.remove("Anna"); // remove um valor que tem o nome escrito nos dentro do remove
        
        list.remove(1); // remove tambem por posição 

        // list.removeIf(x -> x.charAt(0) == 'P' );  <- Função Lambda Que remove todos os elementos que forem escritos com P

        for(String x : list){
            System.out.println(x);
        }

        System.out.println("Qual a posição de Paulo? : " + list.indexOf("Paul")); // Aqui ele conta quantos elementos tem 
        System.out.println("Qual a posição de Vitor : " + list.indexOf("Vitor")); // Aqui ele conta quantos elementos tem 

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'P').collect(Collectors.toList()); // Essa expressão faz com que retorne apenas os valores que começam com P

        for(String x : result){
            System.out.println(x);
        }

        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null); // Acessa o primeiro nome com J 
        System.out.println(name);
        
    }
}
