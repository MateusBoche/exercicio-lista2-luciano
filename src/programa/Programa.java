package programa;

import models.Candidato;

import java.util.*;

public class Programa {
    private Map<Integer, Candidato> mapa = new HashMap<>();
    public static void main(String[] args) {
        Programa app = new Programa();
        app.start();
    }

    private void start() {
        Scanner sc = new Scanner(System.in);
        Candidato candidato1 = new Candidato(1,"Joao");
        Candidato candidato2 = new Candidato(2,"Maria");
        Candidato candidato3 = new Candidato(3,"Jose");
        Candidato candidato4 = new Candidato(4,"Antonio");
        Candidato candidato5 = new Candidato(5,"Tiburssinho");
//        List<Candidato>lista = new ArrayList<>();
        List<Candidato>lista2 = new ArrayList<>();

        mapa.put(1,candidato1);mapa.put(2,candidato2);mapa.put(3,candidato3);mapa.put(4,candidato4);mapa.put(5,candidato5);
//        lista.add(candidato1);lista.add(candidato2);lista.add(candidato3);lista.add(candidato4);lista.add(candidato5);
        System.out.println("Digite seu voto ou 0 para sair: ");
        int opcao = sc.nextInt();
        while (opcao!= 0){
            if (opcao == 1){
                int contagem = candidato1.getVoto() + 1;
                candidato1.setVoto(contagem);
                System.out.println("Obrigado seu voto foi registrado!");
            } else if (opcao == 2) {
                int contagem = candidato2.getVoto() + 1;
                candidato2.setVoto(contagem);
                System.out.println("Obrigado seu voto foi registrado!");

            }else if (opcao == 3) {
                int contagem = candidato3.getVoto() + 1;
                candidato3.setVoto(contagem);
                System.out.println("Obrigado seu voto foi registrado!");
            }else if (opcao == 4) {
                int contagem = candidato4.getVoto() + 1;
                candidato4.setVoto(contagem);
                System.out.println("Obrigado seu voto foi registrado!");
            }else if (opcao == 5) {
                int contagem = candidato5.getVoto() + 1;
                candidato5.setVoto(contagem);
                System.out.println("Obrigado seu voto foi registrado!");
            } else {
                System.out.println("Opcao não existe");
            }
            System.out.println("Digite seu voto ou 0 para sair: ");
            opcao = sc.nextInt();


        }

        if(opcao ==0){

            Candidato novo = null;
            int n = mapa.size();
            Integer key = null;
            for (int i = 0; i < n; i++) {
                int maior = 0;
                for(Candidato candidato:mapa.values()){
                    if(candidato.getVoto()>=maior){
                        maior = candidato.getVoto();
                        key = candidato.getId();
                        novo = candidato;

                    }
                }
                mapa.remove(key,novo);
                lista2.add(novo);

            }
            System.out.println("o candidato eleito é o : " + lista2.get(0).getNome());
            for(Candidato candidato:lista2){
                int lugar = (int) lista2.indexOf(candidato) + 1;
                System.out.println("lugar "+ lugar + ": " + candidato.getNome() + " , " + candidato.getVoto() + " votos");
            }

        }
    }



}
