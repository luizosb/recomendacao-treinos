package br.com.estudo.strategys;

import br.com.estudo.model.Intensity;
import br.com.estudo.model.RecomendationTrainingSession;
import br.com.estudo.model.Training;
import br.com.estudo.model.Type;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderForLessTimeTest {

    RecomendationTrainingSession trainingSession = new RecomendationTrainingSession();

    @BeforeEach
    void setUp() {
        trainingSession = new RecomendationTrainingSession();
        trainingSession.addTraining(new Training("Supino",12, Intensity.MODERADO, Type.POWER));
        trainingSession.addTraining(new Training("Agachamento",15, Intensity.INTENSO, Type.POWER));
        trainingSession.addTraining(new Training("Remada",10, Intensity.LEVE, Type.POWER));
    }

    @Test
    void testOrderByBigIntesity(){
        var listTraining = trainingSession.setStrategy(new OrderForLessTime());

        assertEquals("Remada", listTraining.get(0).getName());
        assertEquals("Supino", listTraining.get(1).getName());
        assertEquals("Agachamento", listTraining.get(2).getName());
        assertEquals(3, listTraining.size());


    }
}