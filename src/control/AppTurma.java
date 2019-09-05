package control;

import model.Turma;

import java.util.*;

public class AppTurma {
    public static void main(String[] args) {
        Turma turma1 = new Turma();
        Turma turma2 = new Turma();
        Turma turma3 = new Turma(3, "Tarde", 30, 25, "TSI");
        Turma turma4 = new Turma(4, "Tarde", 65, 62, "Medicina");
        Turma turma5 = new Turma(5, "Biologia");
        Turma turma6 = new Turma(6, "Design");

        System.out.println("Turma 1:");
        System.out.println(turma1);
        System.out.println("Turma 2:");
        System.out.println(turma2);
        System.out.println("Turma 3:");
        System.out.println(turma3);
        System.out.println("Turma 4:");
        System.out.println(turma4);
        System.out.println("Turma 5:");
        System.out.println(turma5);
        System.out.println("Turma 6:");
        System.out.println(turma6+"\n\n");

        turma1.setId(1);
        turma1.setCurso("Filosofia");
        turma1.setQtdVagas(40);
        turma1.setVagasOcupadas(28);
        turma1.setTurno("Noite");
        turma2.setId(2);
        turma2.setCurso("Geografia");
        turma2.setQtdVagas(32);
        turma2.setVagasOcupadas(25);
        turma2.setTurno("Manhã");

        turma5.setTurno("Tarde");
        turma5.setQtdVagas(42);
        turma5.setVagasOcupadas(36);
        turma6.setTurno("Noite");
        turma6.setQtdVagas(30);
        turma6.setVagasOcupadas(27);

        System.out.println("Turma "+turma1.getId()+" Curso de "+turma1.getCurso()+" no turno da "+turma1.getTurno()+"\nCom um total de "+turma1.getQtdVagas()+" vagas, onde estão ocupadas "+turma1.getVagasOcupadas()+" vagas\n");
        System.out.println("Turma "+turma2.getId()+" Curso de "+turma2.getCurso()+" no turno da "+turma2.getTurno()+"\nCom um total de "+turma2.getQtdVagas()+" vagas, onde estão ocupadas "+turma2.getVagasOcupadas()+" vagas\n");

        //LISTA
        List<Turma> listaTurmas = new ArrayList<>();
        listaTurmas.add(turma6);
        listaTurmas.add(turma5);
        listaTurmas.add(turma4);
        listaTurmas.add(turma3);
        listaTurmas.add(turma2);
        listaTurmas.add(turma1);

        System.out.println("Lista decrescente: ");
        listaTurmas.forEach(turma -> System.out.println(turma));

        for (Turma turma : listaTurmas) {
            if(turma.getId()==1){
                System.out.println("\nApenas turma de id 1: "+turma+"\n");
                break;
            }
        }
        //Ordenando
        Collections.sort(listaTurmas);
        System.out.println("Lista crescente: ");
        listaTurmas.forEach(turma -> System.out.println(turma));

        //MAP
        Map<Integer, Turma> mapTurma = new HashMap<>();
        mapTurma.put(turma1.hashCode(), turma1);
        mapTurma.put(turma2.hashCode(), turma2);
        mapTurma.put(turma3.hashCode(), turma3);
        mapTurma.put(turma4.hashCode(), turma4);
        mapTurma.put(turma5.hashCode(), turma5);
        mapTurma.put(turma6.hashCode(), turma6);

        System.out.println("\nMap:\n"+mapTurma+"\n");

        System.out.println(mapTurma.get(turma1.hashCode()));
    }
}
