package rst.com.viewmodelcounter;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ScoreViewModel extends ViewModel {

    //private Integer score;

    private MutableLiveData<Integer> score;


    public LiveData<Integer> getScore(){

        if(score ==null){
            score = new MutableLiveData<>();
            score.setValue(0);
        }

        return score;
    }

  /*  public Integer getScore(){
        return score== null ? 0: score;
    }*/

    public void addScore(){
        score.setValue(score.getValue()+1);

    }

    public void resetScore(){
        score.setValue(0);
    }
}
