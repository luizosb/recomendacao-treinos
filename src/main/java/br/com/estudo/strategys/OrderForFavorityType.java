package br.com.estudo.strategys;

import br.com.estudo.model.Training;
import br.com.estudo.model.Type;

import java.util.Comparator;
import java.util.List;

public class OrderForFavorityType implements TrainingStrategies{

    private Type type;

    public OrderForFavorityType(Type type) {
        this.type = type;
    }

    @Override
    public List<Training> orderList(List<Training> trainingList) {
        return trainingList.stream()
                .sorted(Comparator.comparing(t->!t.getType().equals(type)))
                .toList();
    }
}
