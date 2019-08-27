package com.example.codingcafe.ecommerce.Sellers;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.codingcafe.ecommerce.Buyers.MainActivity;
import com.example.codingcafe.ecommerce.R;

public class SellerRegistrationActivity extends AppCompatActivity {

    private Button sellerLoginBegin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_registration);


        sellerLoginBegin = findViewById(R.id.seller_already_have_account_btn);


        sellerLoginBegin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellerRegistrationActivity.this, SellerLoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
