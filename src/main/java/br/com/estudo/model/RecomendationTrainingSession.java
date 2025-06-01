package br.com.estudo.model;

import br.com.estudo.strategys.TrainingStrategies;

import java.util.ArrayList;
import java.util.List;

public class RecomendationTrainingSession {

    List<Training> trainingList = new ArrayList<>();

    public void addTraining(Training training) {
        trainingList.add(training);
    }

    public List<Training> setStrategy(TrainingStrategies strategy) {
        return strategy.orderList(trainingList);
    }

}
