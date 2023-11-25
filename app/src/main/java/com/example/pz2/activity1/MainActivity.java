package com.example.pz2.activity1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.pz2.activity2.SecondActivity;
import com.example.pz2.databinding.ActivityMainBinding;
import com.example.pz2.model.Store;

public class MainActivity extends AppCompatActivity {

    private MainActivityViewModel viewModel;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);
        viewModel.getState().observe(this, mainActivityModel -> {
            if (mainActivityModel.isShouldShowErrorMessage()) {
                Toast.makeText(this, "Fill all fields", Toast.LENGTH_LONG).show();
                viewModel.cleanNeedToShowMessage();
            }
            if (mainActivityModel.isShouldNavigateToSecondView()) {
                Store tmp = new Store(mainActivityModel.getName(), mainActivityModel.getAddress(), Integer.parseInt(mainActivityModel.getProductCount()));

                Intent startActivityIntent = new Intent(this, SecondActivity.class);
                startActivityIntent.putExtra("store", tmp);
                startActivity(startActivityIntent);
            }
        });
    }
}
