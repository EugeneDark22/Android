package com.example.pz2.activity1;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private MutableLiveData<MainActivityModel> state;

    public MainActivityViewModel() {
        this.state = new MutableLiveData<>(new MainActivityModel());
    }
    public MutableLiveData<MainActivityModel> getState() {
        return state;
    }

    public void setState(MutableLiveData<MainActivityModel> state) {
        this.state = state;
    }

    public void cleanNeedToShowMessage() {
        MainActivityModel tmp = state.getValue();
        if (tmp != null) {
            tmp.setShouldShowErrorMessage(false);
            state.setValue(tmp);
        }
    }

    public void onButtonClick() {
        MainActivityModel tmp = state.getValue();
        if (tmp != null) {
            if (tmp.getName().isEmpty() || tmp.getAddress().isEmpty() || tmp.getProductCount().isEmpty()) {
                tmp.setShouldShowErrorMessage(true);
            } else {
                tmp.setShouldNavigateToSecondView(true);
            }
            state.setValue(tmp);
        }
    }
}
