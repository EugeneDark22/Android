package com.example.pz2.activity2;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.pz2.activity1.MainActivityModel;

public class SecondActivityViewModel extends ViewModel {
    private MutableLiveData<MainActivityModel> state;

    public SecondActivityViewModel() {
        this.state = new MutableLiveData<>(new MainActivityModel());
    }

    public MutableLiveData<MainActivityModel> getState() {
        return state;
    }

    public void setStateValue(MainActivityModel val) {
        state.setValue(val);
    }
}
