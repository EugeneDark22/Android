package com.example.pz2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editName;
    private EditText editAddress;
    private EditText editCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = findViewById(R.id.editName);
        editAddress = findViewById(R.id.editAddress);
        editCount = findViewById(R.id.editCount);
        Button btnSend = findViewById(R.id.btnSend);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editName.getText().toString().trim();
                String address = editAddress.getText().toString().trim();
                String countStr = editCount.getText().toString().trim();

                if (name.isEmpty() || address.isEmpty() || countStr.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Заповніть будь ласка поля", Toast.LENGTH_SHORT).show();
                    return;
                }

                int count = Integer.parseInt(countStr);
                Store store = new Store(name, address, count);

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("store", store);
                startActivity(intent);
            }
        });
    }
}
