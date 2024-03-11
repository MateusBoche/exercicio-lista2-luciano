package programa;

import models.Candidato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
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
        List<Candidato>lista = new ArrayList<>();
        List<Candidato>lista2 = new ArrayList<>();
        lista.add(candidato1);lista.add(candidato2);lista.add(candidato3);lista.add(candidato4);lista.add(candidato5);
        System.out.println("Digite seu voto ou 0 para sair: ");
        int opcao = sc.nextInt();
        while (opcao!= 0){
            if (opcao == 1){
                int contagem = candidato1.getVoto() + 1;
                candidato1.setVoto(contagem);
            } else if (opcao == 2) {
                int contagem = candidato2.getVoto() + 1;
                candidato2.setVoto(contagem);

            }else if (opcao == 3) {
                int contagem = candidato3.getVoto() + 1;
                candidato3.setVoto(contagem);
            }else if (opcao == 4) {
                int contagem = candidato4.getVoto() + 1;
                candidato4.setVoto(contagem);
            }else if (opcao == 5) {
                int contagem = candidato5.getVoto() + 1;
                candidato5.setVoto(contagem);
            } else {
                System.out.println("Opcao não existe");
            }
            System.out.println("Digite seu voto ou 0 para sair: ");
            opcao = sc.nextInt();


        }

        if(opcao ==0){
            int maior = 0;
            Candidato novo = null;
            for (int i = 0; i < lista.size(); i++) {
                for(Candidato candidato:lista){
                    if(candidato.getVoto()>maior){
                        novo = candidato;

                    }
                }
                lista.remove(novo);
                lista2.add(novo);

            }
            

        }
    }



}
