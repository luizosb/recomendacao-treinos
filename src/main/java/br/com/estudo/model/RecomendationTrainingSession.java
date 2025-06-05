package br.com.estudo.model;

import br.com.estudo.strategys.OrderForBiggestIntesity;
import br.com.estudo.strategys.TrainingStrategies;

import java.util.ArrayList;
import java.util.List;

public class RecomendationTrainingSession {

    List<Training> trainingList = new ArrayList<>();
    private TrainingStrategies strategy;


    public RecomendationTrainingSession(TrainingStrategies strategy) {
        this.strategy = strategy;
    }

    public void addTraining(Training training) {
        trainingList.add(training);
    }

    public void setStrategy(TrainingStrategies strategy) {
        this.strategy = strategy;
    }

    public List<Training> orderTrainings() {
        return strategy.orderList(trainingList);
    }
}
