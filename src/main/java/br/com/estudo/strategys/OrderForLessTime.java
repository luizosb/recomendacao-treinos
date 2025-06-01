package br.com.estudo.strategys;

import br.com.estudo.model.Training;

import java.util.Comparator;
import java.util.List;

public class OrderForLessTime implements TrainingStrategies{

    @Override
    public List<Training> orderList(List<Training> trainingList) {
        return trainingList.stream()
                .sorted(Comparator.comparing(Training::getDurationInMin))
                .toList();
    }
}
