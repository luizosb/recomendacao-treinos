package br.com.estudo;

import br.com.estudo.model.Intensity;
import br.com.estudo.model.RecomendationTrainingSession;
import br.com.estudo.model.Training;
import br.com.estudo.model.Type;
import br.com.estudo.strategys.OrderForBiggestIntesity;
import br.com.estudo.strategys.OrderForFavorityType;
import br.com.estudo.strategys.OrderForLessTime;

public class Main {
    public static void main(String[] args) {

        RecomendationTrainingSession trainingSession = new RecomendationTrainingSession();

        trainingSession.addTraining(new Training("Supino",12, Intensity.MODERADO, Type.POWER));
        trainingSession.addTraining(new Training("Agachamento",15, Intensity.INTENSO, Type.POWER));
        trainingSession.addTraining(new Training("Remada",10, Intensity.LEVE, Type.POWER));
        trainingSession.addTraining(new Training("Rosca",9, Intensity.INTENSO, Type.FLEXIBILITY));
        trainingSession.addTraining(new Training("Prancha",18, Intensity.INTENSO, Type.FLEXIBILITY));
        trainingSession.addTraining(new Training("Esteira",40, Intensity.LEVE, Type.CARDIO));

        System.out.println("====================================================================");
        trainingSession.setStrategy(new OrderForBiggestIntesity()).forEach(System.out::println);
        System.out.println("====================================================================");
        trainingSession.setStrategy(new OrderForFavorityType(Type.FLEXIBILITY)).forEach(System.out::println);
        System.out.println("====================================================================");
        trainingSession.setStrategy(new OrderForLessTime()).forEach(System.out::println);
        System.out.println("====================================================================");



    }
}