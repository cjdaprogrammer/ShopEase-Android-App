package com.shopease.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProductListActivity extends AppCompatActivity {
    private TextView badge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
        badge = findViewById(R.id.cartBadge);
        int[] ids = {R.id.addToCartButton1, R.id.addToCartButton2, R.id.addToCartButton3};
        for (int id : ids) {
            findViewById(id).setOnClickListener(v -> { Cart.count++; refresh(); });
        }
        findViewById(R.id.viewCartButton).setOnClickListener(
                v -> startActivity(new Intent(this, CartActivity.class)));
        refresh();
    }

    @Override
    protected void onResume() { super.onResume(); refresh(); }

    private void refresh() { badge.setText("Cart: " + Cart.count); }
}