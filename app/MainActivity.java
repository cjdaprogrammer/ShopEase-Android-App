package com.shopease.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText user = findViewById(R.id.usernameInput);
        EditText pass = findViewById(R.id.passwordInput);
        TextView error = findViewById(R.id.errorMessage);
        findViewById(R.id.loginButton).setOnClickListener(v -> {
            if (user.getText().toString().equals("standard_user")
                    && pass.getText().toString().equals("shop123")) {
                Cart.count = 0;
                startActivity(new Intent(this, ProductListActivity.class));
            } else {
                error.setText("Invalid username or password");
            }
        });
    }
}