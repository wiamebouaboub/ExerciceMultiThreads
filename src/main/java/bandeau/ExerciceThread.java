package bandeau;

import java.util.*;

public class ExerciceThread extends Thread{

    private final Bandeau bandeau;
    private final List<ScenarioElement> MyElements;

    public ExerciceThread (Bandeau bandeau, List<ScenarioElement> MyElements){
        bandeau=b;
        MyElements=elements;
    }

    @Override
    public void run(){
        for(ScenarioElement element : elements){
            for (int i=0; i<element.repeats; i++){
                element.effect.playOn(b);
            }
        }
    }
}