package com.example.pz2.activity2;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.pz2.activity1.MainActivityModel;
import com.example.pz2.databinding.ActivitySecondBinding;
import com.example.pz2.model.Store;

public class SecondActivity extends AppCompatActivity {

    private SecondActivityViewModel viewModel;
    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        viewModel = new ViewModelProvider(this).get(SecondActivityViewModel.class);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);

        // Отримуємо дані, передані з MainActivity
        Intent intent = getIntent();
        Store store = (Store) intent.getSerializableExtra("store");
        if (store != null) {
            MainActivityModel mainActivityModel = new MainActivityModel(store.getName(), store.getAddress(), String.valueOf(store.getProductCount()));
            viewModel.setStateValue(mainActivityModel);
        }
    }
}
