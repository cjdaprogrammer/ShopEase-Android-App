package com.shopease.app;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CartActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        ((TextView) findViewById(R.id.cartCount)).setText("Items in cart: " + Cart.count);
        TextView confirmation = findViewById(R.id.orderConfirmation);
        findViewById(R.id.checkoutButton).setOnClickListener(
                v -> confirmation.setText(Cart.count > 0 ? "Order placed" : "Cart is empty"));
    }
}