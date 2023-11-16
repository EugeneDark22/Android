package com.example.pz2;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView txtName = findViewById(R.id.txtName);
        TextView txtAddress = findViewById(R.id.txtAddress);
        TextView txtCount = findViewById(R.id.txtCount);

        Intent intent = getIntent();
        Store store = (Store) intent.getSerializableExtra("store");

        if (store != null) {
            txtName.setText("Назва магазину: " + store.getName());
            txtAddress.setText("Адреса магазину: " + store.getAddress());
            txtCount.setText("Кількість продуктів: " + store.getProductCount());
        }
    }
}
