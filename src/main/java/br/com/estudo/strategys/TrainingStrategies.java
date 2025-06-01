package br.com.estudo.strategys;

import br.com.estudo.model.Training;

import java.util.List;

public interface TrainingStrategies {

    List<Training> orderList (List <Training> trainingList);
}
