
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

            String username = user.getText().toString().trim();
            String password = pass.getText().toString();

            if (username.equals("standard_user")
                    && password.equals("shop123")) {

                error.setText("");

                // ProductListActivity will be implemented next.
                startActivity(
                        new Intent(MainActivity.this, ProductListActivity.class)
                );

            } else {
                error.setText("Invalid username or password");
            }
        });
    }
}
