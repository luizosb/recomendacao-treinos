package br.com.estudo.strategys;

import br.com.estudo.model.Training;

import java.util.Comparator;
import java.util.List;

public class OrderForBiggestIntesity implements TrainingStrategies{
    @Override
    public List<Training> orderList(List<Training> trainingList) {
        return trainingList.stream()
                .sorted((t1, t2) -> Integer.compare(t2.getIntensity().getNivel(), t1.getIntensity().getNivel()))
                .toList();
    }
}
