package com.example.shabnam.musix;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PurchaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.purchase);

        // TextView inside the category
        TextView purchaseTextView = (TextView) findViewById(R.id.purchase);
        purchaseTextView.setText(getString(R.string.purchase_desc));

        final Button buttonPurchase = (Button) findViewById(R.id.purchase_to_home);
        buttonPurchase.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent purchaseButtonIntent = new Intent(PurchaseActivity.this, MainActivity.class);

                startActivity(purchaseButtonIntent);
            }
        });
    }
}
